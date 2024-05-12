package X;

/* loaded from: classes7.dex */
public final class EOA<T> implements InterfaceC64592gB {
    public static final EOA<T> LJLIL = new EOA<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("activityDetect: failed, err: ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('.');
        X1D.LIZIZ(LIZ);
        if (th != null) {
            th.printStackTrace();
        }
    }
}
