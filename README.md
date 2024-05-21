# dependencyInversionPrinciple
# <p align=center>Dependency Inversion Principle</p>
## Problem
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.
Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.
To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.
Your solution should not violate other SOLID principles.

## UML

## Test Code
    Student student = new Student("Kat");
    LibraryService libraryService = new LibraryService();
    
    Resource book = new Book("The Cat Who Could Read Backwards");
    Resource journal = new Journal("Journal of Feline Medicine and Surgery");

    libraryService.borrowResource(student, book);
    System.out.println();
    libraryService.borrowResource(student, journal);

## Sample Output
![image](https://github.com/mfulo/dependencyInversionPrinciple/assets/142382665/54fdda05-b0a8-40c3-8411-2f9b9c27c1a2)

