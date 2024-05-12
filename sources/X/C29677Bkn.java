package X;

/* renamed from: X.Bkn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29677Bkn<T> implements InterfaceC64592gB {
    public static final C29677Bkn<T> LJLIL = new C29677Bkn<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStickerUpdate api error: ");
        LIZ.append(((Throwable) obj).getMessage());
        C0NB.LJ("SubscribeTimeStickerWidget", X1D.LIZIZ(LIZ));
    }
}
