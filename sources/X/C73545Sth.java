package X;

/* renamed from: X.Sth, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73545Sth extends RuntimeException {
    public static final long serialVersionUID = -6298857009889503852L;

    public C73545Sth(Throwable th) {
        this(C25620zW.LIZ("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th), th);
    }

    public C73545Sth(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }
}
