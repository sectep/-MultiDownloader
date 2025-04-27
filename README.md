# MultiDownloader
Simple Java simulation of multithreaded file downloading.

## Description

This project demonstrates a basic multithreaded file downloading simulation.  
Each file is "downloaded" in a separate thread.  
The progress is shown in the console with incremental percentage updates.

Once the file reaches 100%, the main thread confirms the successful download.

## Technologies Used

- Java
- Multithreading (`Thread`, `Runnable`)
- `join()` method to synchronize thread completion
- Simple console-based progress bar

## How It Works

- Each file is represented by a `MyThread` class instance.
- The download progress is simulated inside `DownloaderBar`.
- `Thread.sleep()` is used to imitate the downloading process.
- After all downloading threads finish, the main thread prints completion messages.

## How to Run the Project

1. Clone the repository:
```
git clone https://github.com/твій-нікнейм/MultiDownloader.git
```
2. Open the project in your favorite IDE:

· For example: IntelliJ IDEA, Eclipse, VS Code with Java extensions.

3. Navigate to the multidownloader package.

4.Run the Main class:

***·*** Find Main.java.

***·***  Right-click → Run Main.

***·*** Or compile and run manually from the terminal:

```
javac multidownloader/*.java
java multidownloader.Main
```

## Example Output

```text
File.txt is starting to download.
File.txt:  10%
File.txt:  20%
File.txt:  30%
File.txt:  40%
File.txt:  50%
File.txt:  60%
File.txt:  70%
File.txt:  80%
File.txt:  90%
File.txt:  100%
Downloading process forFile.txt has ended.
Downloading complete.
```



