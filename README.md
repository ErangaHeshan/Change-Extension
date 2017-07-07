## Synopsis
This simple java program is intended to change particular kind of files (e.g. ".js" files) inside a given directory to a different extension. It recursively search inside the sub directories also.

## Example
```java
changeExtension(new File(System.getProperty("user.dir")), "js", "txt");
```
Example shows how to change extension of ``js`` files to ``txt`` of all the directories rooted where ``java`` was run from, where you started the JVM.
