package X;

/* loaded from: classes12.dex */
public final class P8S extends RuntimeException {
    public P8S(String str) {
        this("Launch Protect Custom Exception", str);
    }

    public P8S(String str, String str2) {
        super(str, new Throwable(str2));
    }
}
