package X;

import Y.ARunnableS27S0200000_8;

/* renamed from: X.JFv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48867JFv implements IHO {
    public final /* synthetic */ ARunnableS27S0200000_8 LIZ;

    @Override // X.IHO
    public final void LIZ() {
        ARunnableS27S0200000_8 aRunnableS27S0200000_8 = this.LIZ;
        if (((C66792QJg) aRunnableS27S0200000_8.l1).LJLJI.hasMessages(1235, (AbstractC48869JFx) aRunnableS27S0200000_8.l0)) {
            ARunnableS27S0200000_8 aRunnableS27S0200000_82 = this.LIZ;
            ((C66792QJg) aRunnableS27S0200000_82.l1).LJLJI.removeMessages(1235, (AbstractC48869JFx) aRunnableS27S0200000_82.l0);
            ARunnableS27S0200000_8 aRunnableS27S0200000_83 = this.LIZ;
            ((C66792QJg) aRunnableS27S0200000_83.l1).LJLJI.obtainMessage(1235, (AbstractC48869JFx) aRunnableS27S0200000_83.l0).sendToTarget();
        }
        ARunnableS27S0200000_8 aRunnableS27S0200000_84 = this.LIZ;
        ((AbstractC48869JFx) aRunnableS27S0200000_84.l0).LJI = null;
        C66792QJg.LJLLI.LIZIZ(((C66792QJg) aRunnableS27S0200000_84.l1).LJLIL.LIZJ).LIZ(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remove observer ");
        LIZ.append((AbstractC48869JFx) this.LIZ.l0);
        LIZ.append(", ");
        LIZ.append(this);
        X1D.LIZIZ(LIZ);
    }

    public C48867JFv(ARunnableS27S0200000_8 aRunnableS27S0200000_8) {
        this.LIZ = aRunnableS27S0200000_8;
    }
}
