package X;

/* loaded from: classes12.dex */
public final class PD8 extends IllegalStateException {
    public static final long serialVersionUID = 1644750035281290266L;

    public PD8(Throwable th) {
        super(C25620zW.LIZ("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th), th);
    }
}
