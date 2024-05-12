package X;

import Y.ARunnableS9S0301000_9;

/* renamed from: X.MnQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57868MnQ extends AbstractC029609s {
    public final /* synthetic */ SYL LJLIL;
    public final /* synthetic */ C57865MnN LJLILLLLZI;

    public C57868MnQ(SYL syl, C57865MnN c57865MnN) {
        this.LJLIL = syl;
        this.LJLILLLLZI = c57865MnN;
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        AYY ayy = AYY.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("insert start! start:");
        LIZ.append(i);
        LIZ.append(", count: ");
        LIZ.append(i2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ("HLayoutController", LIZIZ);
        AbstractC030109x itemAnimator = this.LJLIL.getItemAnimator();
        this.LJLIL.setItemAnimator(null);
        SYL syl = this.LJLIL;
        syl.post(new ARunnableS9S0301000_9(i, this.LJLILLLLZI, syl, itemAnimator, 3));
    }
}
