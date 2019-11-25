import redis.clients.jedis.Jedis;

public class Connection {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("running : " + jedis.ping());
    }
}
