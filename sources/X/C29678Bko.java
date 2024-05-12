package X;

/* renamed from: X.Bko, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29678Bko<T> implements InterfaceC64592gB {
    public static final C29678Bko<T> LJLIL = new C29678Bko<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getSubathonTimer api error: ");
        LIZ.append(((Throwable) obj).getMessage());
        C0NB.LJ("SubscribeTimeStickerWidget", X1D.LIZIZ(LIZ));
    }
}
