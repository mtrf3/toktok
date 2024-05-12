package X;

import Y.ARunnableS19S0101000_15;

/* loaded from: classes16.dex */
public final class YAD implements SR1 {
    public final /* synthetic */ YAB LIZ;

    public YAD(YAB yab) {
        this.LIZ = yab;
    }

    @Override // X.SR1
    public final void onItemClick(int i) {
        YAB yab = this.LIZ;
        yab.LJLIL.post(new ARunnableS19S0101000_15(yab, i, 7));
    }
}
