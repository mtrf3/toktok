package X;

/* loaded from: classes7.dex */
public abstract class EPR extends RuntimeException {
    public EPR(String str) {
        super(str);
    }

    public EPR(Throwable th) {
        super(th);
    }

    public abstract int getErrorCode();
}
