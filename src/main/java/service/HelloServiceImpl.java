package service;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "I say: Hello!";
    }
}
