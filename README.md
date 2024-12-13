[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/UW5Uf4MJ)
# CS230X-lab0-F24
# Getting Started

In this lab, you will get started with the tools we will use this semester for labs and assignments.

Goals:
- [x] Create a Github account (if you are reading this, then you have done this first task)
- [x] Review basics of the Shell and command line
- [x] Review basics of Git and getting started with Github
- [x] Start working with BlueJ
- [ ] Write some simple java programs
- [ ] Learn how to submit your work on Gradescope

## Task 1: Organizing your work and using shell commands
Proactively planning how you will organize your digital files will help you in CS230X (and beyond). 
For a lab like this one (lab0), you will be using starter code provided by cloning a github repository. 
Essentially, this will create a connection between a local folder (on your machine) to a remote repository (on Github). 
One reason to be well organized in your folders, amongst many, is to ensure that you are using Github correctly.

Organizing your folder structure as you begin CS230X is an excellent opportunity to familiarize yourself (or refresh yourself)
with shell commands. 

### Steps to Follow:

1. **Start by reading this material created by the Wellesley CS Club on:**
* [Workshop 1: Navigating Directories](https://docs.google.com/document/d/10IN9tjYdNgBFfZUlSdPkMLBBbQVnep07Qu0NMzWwGRE/edit)
* [Workshop 2: Shell](https://docs.google.com/document/d/1ZHQZbVBJtTg4Ed4g-r8k_stnDT7yv8e5An6Lby_jwHU/edit)

> **Note:** As specified in the Shell Workshop notes, these instructions work best on a MacOS/Linux computer. If your computer is
a Windows machine, you can install WSL or use a public Mac. 

2. **Create your initial CS230 folder structure.**
 
- My recommendation would be to create a CS230X folder in a place that is easy for you to find (Desktop or Documents)
that will contain all of your CS230X materials.
- In this folder, I would create three subfolders:
  -  Assignments for your homework assignments,
  -  Labs for the self-guided labs,
  -  Lectures for materials we will use in lectures.

To do this, open your Terminal (in spotlight search for Terminal on Mac).

1) Start by navigating to your Desktop or Documents folder using the command `cd ~` to make sure you are starting
at your root folder and then `cd Desktop` or `cd Documents`.
2) You can type the command `ls` to list all of the files in the current folder, try it!
3) Now, create a new folder with the command `mkdir CS230X`.
4) Check to make sure the folder is there with the command `ls`
5) Continue navigating into this new folder using `cd`, creating new subfolders using `mkdir`, and using `ls` to check yourself.
  

## Task 2: Git and Github for CS230X
In this class we will use Github to release assignments and labs. 
The instructions will be available in the README files of each assignment and lab, and the repository will contain the starter code when available. 
In this lab0 repository, you can see 4 initial files: .gitignore contains a list of files to be ignored by git (you will
not modify this one), Conversions.java, README.md, and package.bluej.

### Steps to Follow:

1. **Set up Git:**
- Start by familiarizing yourself with this [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course).
- Make sure you have a way use Git/Github by either using commands directly in the shell or downloading [GitHub Desktop](https://desktop.github.com/download/) 

2. **Clone the lab repository:**
- Clone the starter code for this assignment in your folder CS230X/Labs.
- Use ONE of these two options to clone this repository:
  - Terminal/shell (command-line interface): the advantage of this workflow is to gain practice using commands to interact with git/github, this will also help you gain experience navigating your computer through commands; the downside of this approach is the initial setup will take some time. Follow [these instructions to authenticate to Github using ssh](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent) and [these instructions to clone this repository using SSH (not HTTPS and not CLI)](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository)
  - Github Desktop (graphical-user interface GUI): the advantage of this workflow is that it is easy to set up and the GUI is easier to learn than remembering commands, however you will not gain practice using commands and there are some advanatges to having that level of "full" control. Follow [these instructions to authenticate to Github Desktop](https://docs.github.com/en/desktop/overview/getting-started-with-github-desktop) and [these instructions to clone this repository from Github Desktop](https://docs.github.com/en/desktop/adding-and-cloning-repositories/cloning-and-forking-repositories-from-github-desktop)

> **Note:** As you can see, there are many ways to reach the same goal of connecting a local copy to a Github remote repository. I would **not** recommend using the Github CLI for the purposes of this course.

Now, you can check in your folder CS230X/Labs. You should have a new folder called Lab0-Getting-Started that contains the same 4 files as this repository. You can now start editing these files.

## Task 3: Meet BlueJ
In CS230X, we will use BlueJ as an IDE to develop, test, compile, and run our Java programs. Compiling a Java program converts Java source code (files ending in .java) into something called bytecodes (files ending in .class) which can then be understood by the computer. 

### Steps to Follow:

1. **Install BlueJ:** Download the BlueJ application to your own computer for free by visiting the BlueJ site for information and downloads. Please visit this BlueJ documentation page, which contains pointers to reference material as well as some nice tutorials (including video tutorials). In BlueJ, Java code is organized in Projects. Double-click on the file package.bluej in your CS230X/Labs/Lab0-Getting-Started folder. This will open BlueJ and the project workspace for your Lab0, this workspace will contain two files: README.md and Conversions.java.

2. **Edit a file in BlueJ:**
Let's make sure that you have a successful workflow between BlueJ for editing local files, Terminal or Github Desktop for updating your remote repository, and a browser in which you can view your repository (this should be this current window in which you are reading this page). Double-click on README.md. This will open a new window with an editable version of this README file. You can see that there are many tasks that you have completed to get to this point, let's check off everything you have done. In the README.md file, add and `x` in each checkbox that you have completed. This should be similar to the check box on line 7. You should add an x to line 8, 9, 10.

2. **Push the local file to the remote repository:** If you set up Github with SSH and the Terminal, then follow the steps in the [Example to update a remote repository](https://github.com/CS230X-F24/github-starter-course/blob/main/README.md) in the Git and Github tutorial. If you are using Github Desktop, then enter a brief explanation of the update in the "Summary (required)" textbox, then click "commit to main", and finally click "Push origin".

Refresh this browser page, you should see an updated README with all the tasks you have completed checked off. Your workflow for CS230X is successful! This is how you will be working with labs and assignments in the course. Make sure to frequently push your updates to the remote repository.
 
## Task 3: Create a new Java Program

### Create your first Java class: Profile.java
In this task, you will create a new Java program that will print information about you to a terminal. 

### Steps to Follow:
1. **Create a new Java Class** In the BlueJ project window, click on the New Class... button. Name the new class Profile and click ok. A "Profile" icon should appear in the project window. Note the diagonal lines decorating the "Profile" icon; it means the class has not been compiled yet.

2. **Open the new file** To see the code associated with the Intro.java class, simply double-click on the "Profile" icon. A new Editor Window will open, showing the class's source code. Examine the template of the source code. It contains the "anatomy" of a java class.

3. **Add a main() method** When running a java class, execution starts from the main() method of that class. At the bottom of the Profile.java file, and before the last closing curly-bracket `}` add the definition of the main() method.

```
public static void main(String[] args){
   System.out.println("My name is ...");
}
```

5. **Compile a class** To compile the Profile class just click on the "Compile" button, at the top-left of the Editor window. Alternatively, you can go back to the workspace window, control-click on the class icon, and from the pop-up window, select "Compile". If all goes well, and your compilation is successful (i.e no compilation/syntax errors), you should see that the icon of the class is no longer decorated with diagonal lines. If not, you need to fix any syntax errors your code contains, before you are ready to move on.

6. **Run a class** In the workspace, control-click on the class's icon, and select to run the main() method. An input window will appear. Just click OK for now, we will talk about that in a few weeks. A Terminal Window should open up, and the greeting should be printed in there!
That's it! You now know how to create a new java class, how to compile it and run it, all within the BlueJ environment!

7. **Add more information** Now, update the information printed in the main method to introduce yourself to me. Feel free to add additional variables and print statements. Here is my example introduction:

```
public class Profile {
     public static void main(String [] args) {
        //replace the values of the following variables as you wish
        String name = "Catherine";
        int gradYear = 2009;
        String town = "Wellesley";
        boolean csMajor = true;
        System.out.println("Hello there! My name is " + name + ".");
        System.out.println("I am Wellesley class of " + gradYear + ".");
        System.out.println("I am a computer science major: " + csMajor);
        System.out.println("And, I live in "+town);
    }
}
```

Notice that Java is a strongly typed language, which means that it is required that every variable is declared with its type before use. Experiment with removing some of the variable declarations in your code and see what happens. Read, and familiarize yourselves with the error messages that will be produced.

## Task 4: Data Conversions
In Java, everything is represented using objects, except for its primitive data types. Let's review how to convert between numeric data types:
- Integers (have no fractional part)
  - byte (1 byte of memory space)
  - short (2 bytes of memory space)
  - int (4 bytes of memory space)
  - long (8 bytes of memory space)
- Decimal numbers (do have fractional part)
  - float (4 bytes of memory space)
  - double (8 bytes of memory space)

We need to be careful when converting (explicitly or implicitly) one type to another!

### Steps to Follow:
1. **Open the Conversions.java in the project workspace on BlueJ.** What errors do you see immediately? Before writing any code, can you explain what the errors are? Can you determine what is needed to fix these errors?
   
2. **Fix the immediate errors** After fixing the immediate errors, compile and run this class. To compile a class in BlueJ, right-click or ctrl-click on the class icon in the BlueJ workspace and select "compile". To run the program, right-click or ctrl-click on the class icon again and select "void main(String[] args)". Then select "ok" on the method call popup. You will then see a terminal window open with the output of the main().
   
4. **Complete all the TODO** To complete this lab, complete every remaining `TODO` and remove each `TODO` comment when you have completed them. The autograder will check for remaining `TODO` so make sure they are not present once you have finished an item. 

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING
Turn in your work submitting files Profile.java and Conversions.java to your Gradescope account for Lab0. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 
