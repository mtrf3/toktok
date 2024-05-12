package X;

import Y.AfS57S0100000_5;

/* renamed from: X.C3h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30705C3h implements InterfaceC30497By1 {
    public final /* synthetic */ C30699C3b LIZ;

    public C30705C3h(C30699C3b c30699C3b) {
        this.LIZ = c30699C3b;
    }

    @Override // X.InterfaceC30497By1
    public final void onError(int i, int i2) {
        String str = this.LIZ.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("status ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(i2);
        LIZ.append(' ');
        C1EW.LIZLLL(LIZ, null, LIZ, str);
    }

    @Override // X.InterfaceC30497By1
    public final void onInfo(int i, int i2, int i3, String str) {
        if (i == 1) {
            C30699C3b c30699C3b = this.LIZ;
            if (!c30699C3b.LJLLI) {
                C73454SsE LJJJ = AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZIZ());
                C30699C3b c30699C3b2 = this.LIZ;
                c30699C3b.LJLLILLLL = (C73411SrX) LJJJ.LJJJLIIL(new AfS57S0100000_5(c30699C3b2, 19), new AfS57S0100000_5(c30699C3b2, 20));
            }
        }
    }
}
