package X;

/* loaded from: classes5.dex */
public final class AWB<T> implements InterfaceC64592gB {
    public static final AWB<T> LJLIL = new AWB<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        C221018lt.LIZIZ("my profile", message);
    }
}
