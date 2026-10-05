# Bridge Design Pattern

Java examples separating an abstraction from its implementation.

## How it works

The main example combines file or picture icons with Windows or Linux implementation objects. A second example under `tutorial(bridge)` combines vehicle types with production and assembly operations.

## Usage

Requires a Java Development Kit. Run from the repository root:

```sh
javac -d out src/bridge/Bridge.java
java -cp out bridge.Bridge
```
For the second example:

```sh
javac -d out 'tutorial(bridge)/src/tutorial/bridge/TutorialBridge.java'
java -cp out tutorial.bridge.TutorialBridge
```

## Notes

Both examples demonstrate delegation through console messages; they do not interact with an operating system or manufacturing system.
