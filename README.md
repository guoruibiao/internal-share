### 1 run
```bash
./mvnw package or ./mvnw install

java -jar ./target/xxx.jar
```

### 2 usage
```json
{
    "uris": {
        "/lists": "list all files can be download within platform",
        "/upload": "specific action for file uploading",
        "/file/xxx": "specific action for file downloading"
    },
    "name": "file-sharing",
    "description": "For file sharing between Android/iPhone and macOS/Linux/Windows"
}
```