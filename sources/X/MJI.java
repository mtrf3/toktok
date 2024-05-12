package X;

import com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class MJI implements C0C3 {
    public final MJG LJLIL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public MJI(MJG mjg) {
        this.LJLIL = mjg;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        Iterator it = ((ArrayList) this.LJLIL.LJLJLLL).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                BaseDiscoverTabFragment baseDiscoverTabFragment = (BaseDiscoverTabFragment) next;
                if (i2 != i) {
                    z = true;
                } else {
                    z = false;
                }
                baseDiscoverTabFragment.xl(z, false);
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        MJG mjg = this.LJLIL;
        mjg.LJLL = mjg.LJLLI;
        mjg.LJLLI = i;
        BaseDiscoverTabFragment LJJIIJ = mjg.LJJIIJ(i);
        if (LJJIIJ != null) {
            this.LJLIL.LJJIIJZLJL(LJJIIJ, false);
        }
    }
}
