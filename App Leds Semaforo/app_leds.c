#include <SPI.h>
#include <Ethernet.h>

byte mac[] = { 0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };
byte ip[] = { 192, 168, 0, 175 };
byte gateway[] = {192, 168, 0, 1};
byte subnet[] = {255, 255, 255, 0};
EthernetServer server(80);

const int ledPinOne = 9;
const int ledPinTwo = 8;
const int ledPinThree = 7;
String readString = String(30); 
int statusLedOne = 0;
int statusLedTwo = 0;
int statusLedThree = 0;

void setup(){
  Ethernet.begin(mac, ip, gateway, subnet);
  server.begin();
  
  pinMode(ledPinOne, OUTPUT);
  pinMode(ledPinTwo, OUTPUT);
  pinMode(ledPinThree, OUTPUT);
  
  digitalWrite(ledPinOne, LOW);
  digitalWrite(ledPinTwo, LOW);
  digitalWrite(ledPinThree, LOW);
  }
void loop(){
EthernetClient client = server.available();
  if (client) { 
    while (client.connected()) {
   if (client.available()) {
    char c = client.read();
    if (readString.length() < 100)
      {
        readString += c;
      }  
        if (c == '\n') {
          if (readString.indexOf("?") <0){
          }
          else 
        if(readString.indexOf("ledOneParam=1") > 0)
           {
             digitalWrite(ledPinOne, HIGH);
             statusLedOne = 1;
           }
        if(readString.indexOf("ledOneParam=0") > 0)
           {
             digitalWrite(ledPinOne, LOW); 
             statusLedOne = 0;           
           }

        if(readString.indexOf("ledTwoParam=1") > 0)
           {
             digitalWrite(ledPinTwo, HIGH);
             statusLedTwo = 1;
           }
        if(readString.indexOf("ledTwoParam=0") > 0)
           {
             digitalWrite(ledPinTwo, LOW);
             statusLedTwo = 0;           
           }

        if(readString.indexOf("ledThreeParam=1") >0)
           {
             digitalWrite(ledPinThree, HIGH);
             statusLedThree = 1;
           }
        if(readString.indexOf("ledThreeParam=0") >0)
           {
             digitalWrite(ledPinThree, LOW);
             statusLedThree = 0;            
           }
        
          client.println("HTTP/1.1 200 OK");
          client.println("Content-Type: text/html");
          client.println("");
          client.println("<!DOCTYPE HTML>");
          client.println("<html>");
          client.println("<head>");
          client.println("<link rel='icon' type='image/png' href='https://blogmasterwalkershop.com.br/arquivos/artigos/sub_wifi/logo_mws.png'/>");
          client.println("<title>Trabalho IT Circle</title>");
          client.println("<meta charset='utf-8'/>");
          client.println("</head>");
          client.println("<body style=background-color:#ededed>");
          client.println("<center><font color='#4a009e'><h1>IT Circle</font></center></h1>");
          client.println("<center><p>Igor Gregori, ");
          client.println("Marlon Gabriel, ");
          client.println("Marcia Suelen, ");
          client.println("João Vitor, ");
          client.println("Marcus Vinícius</p></center>");

          client.println("<br><br><br><br>");
          
          if (statusLedOne == 1){
            client.println("<center><form method=get name=LED><input type=hidden name=ledOneParam value=0 /><input style='color: #ff0800; background-color : #005906; border: none; padding: 15px 32px; border-radius: 5px; cursor:pointer; font-weight: bold;' type=submit value='APAGAR PRIMEIRO LED'></form></center><br>");
          }else{
            client.println("<center><form method=get name=LED><input type=hidden name=ledOneParam value=1 /><input style='color: #1aff00; background-color : #005906; border: none; padding: 15px 32px; border-radius: 5px; cursor:pointer; font-weight: bold;' type=submit value='ACENDER PRIMEIRO LED'></form></center><br>");
          }

          if (statusLedTwo == 1){
            client.println("<center><form method=get name=LED><input type=hidden name=ledTwoParam value=0 /><input style='color: #ff0800; background-color : #b5a900; border: none; padding: 15px 32px; border-radius: 5px; cursor:pointer; font-weight: bold;' type=submit value='APAGAR SEGUNDO LED'></form></center><br>");
          }else{
            client.println("<center><form method=get name=LED><input type=hidden name=ledTwoParam value=1 /><input style='color: #1aff00; background-color : #b5a900; border: none; padding: 15px 32px; border-radius: 5px; cursor:pointer; font-weight: bold;' type=submit value='ACENDER SEGUNDO LED'></form></center><br>");
          }

          if (statusLedThree == 1){
            client.println("<center><form method=get name=LED><input type=hidden name=ledThreeParam value=0 /><input style='color: #ff0800; background-color : #870000; border: none; padding: 15px 32px; border-radius: 5px; cursor:pointer; font-weight: bold;' type=submit value='APAGAR TERCEIRO LED'></form></center><br>");
          }else{
            client.println("<center><form method=get name=LED><input type=hidden name=ledThreeParam value=1 /><input style='color: #1aff00; background-color : #870000; border: none; padding: 15px 32px; border-radius: 5px; cursor:pointer; font-weight: bold;' type=submit value='ACENDER TERCEIRO LED'></form></center><br>");
          }
          
          client.println("</body>"); 
          client.println("</html>");
          readString="";
          client.stop();
            }
          }
        }
      }
 }