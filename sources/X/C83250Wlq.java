package X;

/* renamed from: X.Wlq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83250Wlq implements InterfaceC80374VgY {
    public final /* synthetic */ C83207Wl9 LIZ;

    public C83250Wlq(C83207Wl9 c83207Wl9) {
        this.LIZ = c83207Wl9;
    }

    @Override // X.InterfaceC80374VgY
    public final void LIZ(boolean z) {
        C83207Wl9 c83207Wl9 = this.LIZ;
        InterfaceC83144Wk8 interfaceC83144Wk8 = c83207Wl9.LJLIL;
        if (interfaceC83144Wk8 != null) {
            interfaceC83144Wk8.LIZJ(z);
        }
        if (!z) {
            c83207Wl9.LLIIIL.LIZIZ(true);
        } else {
            c83207Wl9.LLIIIL.LIZIZ(false);
        }
        c83207Wl9.LLIIZ.H7(z);
    }
}
