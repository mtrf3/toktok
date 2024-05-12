package X;

/* renamed from: X.Xp6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86000Xp6 extends Exception {
    public static final boolean LJLIL;
    public static final StackTraceElement[] LJLILLLLZI;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        LJLIL = z;
        LJLILLLLZI = new StackTraceElement[0];
    }

    public AbstractC86000Xp6() {
    }

    public AbstractC86000Xp6(Throwable th) {
        super(th);
    }
}
