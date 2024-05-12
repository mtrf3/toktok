package X;

/* loaded from: classes5.dex */
public final class AW9<T> implements InterfaceC64592gB {
    public static final AW9<T> LJLIL = new AW9<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        C221018lt.LIZIZ("my profile", message);
    }
}
