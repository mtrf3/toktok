package X;

import com.ss.android.ugc.aweme.detail.ui.search.MultiTypeDetailPageFragment;

/* loaded from: classes9.dex */
public final class KQJ extends C1CZ {
    public final /* synthetic */ MultiTypeDetailPageFragment LJLIL;

    public KQJ(MultiTypeDetailPageFragment multiTypeDetailPageFragment) {
        this.LJLIL = multiTypeDetailPageFragment;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        KQ7 kq7;
        boolean LIZIZ;
        if (!this.LJLIL.Yl()) {
            return;
        }
        InterfaceC51679KPz operator = this.LJLIL.Ol().getOperator();
        if ((operator instanceof KQ7) && (kq7 = (KQ7) operator) != null) {
            MultiTypeDetailPageFragment multiTypeDetailPageFragment = this.LJLIL;
            multiTypeDetailPageFragment.LJLLI = kq7.LIZIZ(i);
            int i2 = multiTypeDetailPageFragment.LJLJLLL;
            if (i2 < 0) {
                LIZIZ = true;
            } else {
                LIZIZ = kq7.LIZIZ(i2);
            }
            multiTypeDetailPageFragment.LJLLILLLL = LIZIZ;
        }
        this.LJLIL.LJLJLLL = i;
    }
}
