package X;

import ccb.t;

/* renamed from: X.VAy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79316VAy implements InterfaceC47916IrI {
    public final /* synthetic */ t LIZ;

    public C79316VAy(t tVar) {
        this.LIZ = tVar;
    }

    @Override // X.InterfaceC47916IrI
    public final void onError(int i) {
        t tVar = this.LIZ;
        tVar.LJLJJI.Z = i;
        if (tVar.D1 == 1) {
            tVar.q1(75, 0);
            this.LIZ.getClass();
        }
        t tVar2 = this.LIZ;
        if (tVar2.V4 == 1) {
            tVar2.q1(87, 0);
        }
    }
}
