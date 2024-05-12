package X;

/* loaded from: classes5.dex */
public final class AWD<T> implements InterfaceC64592gB {
    public static final AWD<T> LJLIL = new AWD<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "";
        }
        C221018lt.LJI("my profile", message);
    }
}
