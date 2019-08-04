package observer.weather;

public interface Subject {
    //注册观察者
    void registerObserver(Observer o);
    //删除观察者
    void removeObserver(Observer o);
    //当主题的状态改变时，这个方法会被调用，以通知所有的观察者对象
    void notifyObservers();

}
