package X;

/* loaded from: classes16.dex */
public class XPF extends Throwable {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public XPF() {
        super("Failure occurred while trying to finish a future.");
    }
}
