package X;

/* renamed from: X.0zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C25450zF extends Throwable {
    public final String LJLIL;
    public final StackTraceElement[] LJLILLLLZI;

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public StackTraceElement[] getStackTrace() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.LJLIL;
    }

    public C25450zF(String str, StackTraceElement[] stackTraceElementArr) {
        this.LJLIL = str;
        this.LJLILLLLZI = stackTraceElementArr;
    }
}
