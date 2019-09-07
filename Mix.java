import java.io.*;
class Mix
{
public static void main(String args[])throws Exception
{
FileInputStream fis1=new FileInputStream("1.mp3"); // First audio file in mp3
FileInputStream fis2=new FileInputStream("2.mp3"); // Second audio file in mp3


FileOutputStream fos=new FileOutputStream("mix4.mp3"); // Resultant audio mix file in mp3 of those above audio
byte data[]=new byte[590000];  // reads the data from the audio.
fis1.skip(590000); // this would skip the starting of 590000 bytes of the audio.
fis2.skip(590000);

fis1.read(data); 
fos.write(data);
fis2.read(data);
fos.write(data);


fis1.close();
fis2.close();

fos.close(); // file closed
}
}