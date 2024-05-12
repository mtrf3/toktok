package ms.bd.o;

/* loaded from: classes7.dex */
public class w2 {
    static {
        k.a(16777217, 0, 0L, "fcd636", new byte[]{76, 61, 86, 28, 49});
    }

    public static String LIZ(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace('\"', ' ').replace('\r', ' ').replace('\n', ' ');
    }
}
