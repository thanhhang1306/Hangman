
public class Words {
	private String[] words;
	private int randomInt;
	private boolean check, win;
	private String answer, displayWord;
	
	public Words(){
		words = new String[20];
		words[0] = "ARRAY";
		/* PROGRAMMING
		 * An array is an arrangement of data in one or more dimension
		 * In programming, it is a container consisting of a predefined number of elements with identical attribute
		 * Each of the element in an array may be uniquely referenced/accessed with an index, starting from 0
		 * One-dimension array: Cat[] = new Cat[3]; two-dimension array: int[][] = new int [3][2] = [row_index][column_index]; etc.
		 */ 
		words[1] = "BUFFER";
		/* COMPUTER ARCHITECTURE/COMPUTING
		 * Data buffer is portion of physical memory storage utilized to hold input or output data temporarily 
		 * Used to temporarily store data while it is moved from one place to another; crucial since interconnected devices 
		 * and systems are seldom "in sync" with one another
		 * Examples: CD burner caches output before writing to avoid an under-run; printer receives an entire page, store it, then prints it
		 */
		
		words[2] = "CACHE"; 
		/* COMPUTER ARCHITECTURE/COMPUTING
		 * A type of small, high-speed memory inside the CPU used to hold frequency used data & commands, so that the CPU needs to access 
		 * the much farther RAM less frequently. Cache memory is a category of primary memory & interacts directly with the CPU, but it
		 * is not required so it is not "the" primary memory. Repetitive task is the specialty of cache.
		 * It is divided into level: L1 (inside GPU), L2 (on the motherboard between CPU & RAM), L3 is a bit further away from CPU
		 */
		
		words[3] = "COMPILER";
		/* PROGRAMMING
		 * A program that translates a source program into machine code that can be converted into an executable program (an object program)
		 * Translate high level language into a lower level language. C++, Visual Basic, and Pascal uses compiler
		 */
		
		words[4] = "DATA BUS";
		/* CCOMPUTER ARCHITECTURE/COMPUTING
		 * The pathway between the memory or peripheral and processing unit that carries data for processing or data that has been processed
		 * Data bus can also be between MDR (memory data register), Cache, and RAM  
		 */
		
		words[5] = "DATA PACKET";
		/* NETWORKING
		 * Single discrete group of bits of a certain length that travel along a given network path. It is composed of a header and a payload 
		 * Header: Important information required by the protocol for the transfer of data (origin & destination, order which the data packet is to go)
		 * Payload: The raw data itself
		 * Apart from containing a portion of the message it will have other data such as check digits, destination address, etc.
		 * Example: in the Internet, big data files are chopped up to small units & travel through Internet and re-assembled at the receiving end. 
		 * Contain IP address of destination & sender & error checking code 
		 */
		
		words[6] = "ENCAPSULATION";
		/* PROGRAMMING 
		 * 1. In OOP computer programming language, it is the combination of data and the operations that act on the data to form a single 
		 * program unit called an "object." Many programming language utilize encapsulation frequently in the form of classes.
		 * 2. A mechanism of restricting the direct access to some components of an object, such that users cannot access state values for
		 * all of the variables of a particular object. It can be utilized to hide both data members & data methods.
		 */
		
		words[7] = "ENCRYPTION";
		/* SECURITY 
		 * The process of transforming/encoding data into an unintelligible form in such a way so that the original data cannot be easily 
		 * obtained except by utilizing a decryption process, through an encryption key 
		 * Encrypted data  is known as ciphertext & unencrypted data is known as plaintext
		 */
		
		words[8] = "IDENTIFIER";
		/* PROGRAMMING
		 * The name or label chosen by the programmer to represent a variable, method, class, data type, or any element defined within the program 
		 * Variable identifier is the name used for the variable, whereas the variable is the actual shortcut for the memory location where a certain value resides
		 * Constant is an identifier with an associated value which cannot be altered by the program during normal execution
		 */
		
		words[9] = "INHERITANCE";
		/* PROGRAMMING
		 * The name given to the property whereby an object, which extends to another object, inherits the data members & member method of the original 
		 * Superclass = base class = parent class; Subclass = child class.
		 * Example: class <superclass> - class <subclass> extends <superclass>
		 */
		
		words[10] = "INTERFACE";
		/* COMPUTER ARCHITECTURE/COMPUTING
		 * The hardware and associated software needed for communication between processors and peripheral devices; to compensate for the difference in their
		 * operating characteristics. It allows for the exchange of information between software, hardware, peripheral devices, and humans.
		 * Example: USB (Universal Serial Bus) port, IDE interface for hard-disks, Parallel Printer Interface 
		 */
		
		words[11] = "INTERPRETER";
		/* PROGRAMMING
		 * A program that translates and executes each instruction of a programming language before it translates and executes the next instruction 
		 * The translator translates a high level language into an intermediate code which will be immediately executed by the CPU 
		 * Example: Scripting language in web pages (JavaScript, Python, VBscript)
		 */
		
		words[12] = "MAINFRAME";
		/* COMPUTER ARCHITECTURE/COMPUTING
		 * A computer, usually in a computer center, with extensive capabilities & resources to which other computers may be connected so that they 
		 * can share facilities. Also called big iron. It is primary utilized by large organizations for critical applications, bulk data processing  
		 * Example: Banks use these computers to store customer accounts for millions of customers. 
		 * Note: It is NOT a PC, but more similar to a server.
		 */
		
		words[13] = "METHOD";
		/* PROGRAMMING 
		 * 1/ The behavior or operation of an object. 2/ The procedure utilized by an object as specified within the object class
		 * Normal methods are called by the main program. A constructor is a special kind of method that only runs when the object is instantiated. 
		 * A method has a method signature, which is the number and types of arguments of a method. It is the header line of the method (int getAge(Person p))
		 */
		
		words[14] = "MODEM";
		/* NETWORKING
		 * An abbreviation for modulator/demodulator. It is a piece of electronic equipment that converts digital signals from a computer into audio signals
		 * that are then transmitted over telephone lines (sending modem modulates the data). The receiving modem demodulates the signal back to digital data 
		 */
		
		words[15] = "NETWORK";
		/* NETWORKING
		 * Any group of interconnected computer system that share resource and data. These devices are linked together through communication channels to facilitate 
		 * communication and resource-sharing among a range of users. There are many type of networks: Local Area Network/LAN, Wide Area Network/WAN, Metropolitan Area Network/MAN
		 * Note: LAN (Intranet), World-wide-web (Internet)
		 */
		
		words[16] = "PARAMETER";
		/* PROGRAMMING
		 * Passed to a routine or method by variable and type. When the code is ran, the parameter is replaced by the value of the variable. It becomes the argument of the routine,
		 * referred to by the variable name in the definition. 
		 * Example: isEven(123) -> 123 is the parameter; public static void isEven (int num) -> num is parameter 
		 */
		
		words[17] = "POLYMORPHISM";
		/* PROGRAMMING
		 * The ability of different objects to respond appropriately to the same operation 
		 * For instance: 3 + 4 -> 9; "3" + "4" -> "34"
		 * In Java, the same method name can be polymorphism, by assigning different parameters to it: int isOdd (int num1, int num2) & int isOdd(int num1).
		 */
		
		words[18] = "PROTOCOL";
		/* An internationally agreed set of rules to ensure transfer of data between different devices. A standard protocol is one that is recognized as 
		 * the standard for a specific type of transfer. 
		 * Example: TCP/IP (Transmission Control Protocol/Internet Protocol); SSH (Secure Shell); FTP (File Transfer Protocol); HTTP(S) (Hypertext Transfer Protocol (Secure))
		 */
		
		words[19] = "TRUNCATION";
		/* The process of approximating a number by ignoring all information beyond a set number of significant figures. 
		 * As a result, truncation error is introduced from truncation.
		 * Example: In Java, Math.floor(3.7) -> 3.0 
		 * The omission of a leading or trailing portion of a string is in accordance with specified criteria. In Java, String.trim() removes leading & trailing spaces
		 */
		
		answer = returnRandomString();
		displayWord = "";
		setDisplayWord();
		check = false;
		win = false;
	}
	
	public int returnRandomInt(int min, int max){
		return randomInt = (int)(Math.random()*(max-min+1)+min);
	}
	
	public String returnRandomString(){
		return words[returnRandomInt(0, words.length-1)];
	}
	
	public void setDisplayWord(){
		for (int i =0; i<answer.length(); i++){
			if (answer.charAt(i) == ' '){
				displayWord += " ";
			}
			else displayWord += "-";
		}
	}
	
	public String returnDisplayWord(){
		return displayWord;
	}
	
	public String returnAnswer(){
		return answer;
	}
	
	public boolean checkChar(char c){
		check = false;
		for (int i = 0; i < answer.length(); i++){
			if (c == answer.charAt(i)){
				displayWord = displayWord.substring(0, i) + answer.charAt(i) + displayWord.substring(i+1);	
				check  = true;
			}
		}
		return check;
	}
	
	public boolean checkWin(){
		if (displayWord.equals(answer)){
			win = true;
		}
		return win;
	}
	
	public void reset(){
		answer = returnRandomString();
		displayWord = "";
		setDisplayWord();
		check = false;
		win = false;
	}
}
