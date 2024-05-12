package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LnJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55313LnJ {
    public final List<Aweme> LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final List<Aweme> LIZLLL;
    public boolean LJ = true;
    public boolean LJFF;
    public boolean LJI;
    public final /* synthetic */ DetailFragmentPanel LJII;

    public final boolean LIZ() {
        boolean z = this.LJFF;
        boolean z2 = false;
        if (z || !this.LJ) {
            if (this.LJII.LLFFF(this.LIZ, z)) {
                return true;
            }
            return false;
        }
        if (this.LJII.mViewPager.getCurrentItem() != 0) {
            return false;
        }
        this.LJFF = true;
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(this.LJII.mAdapter.LJJIL());
        ((ArrayList) this.LIZLLL).addAll(0, this.LIZ.subList(0, this.LIZJ));
        List<Aweme> list = this.LIZLLL;
        DetailFragmentPanel detailFragmentPanel = this.LJII;
        detailFragmentPanel.LLJILJILJ = true;
        detailFragmentPanel.j0(list, this.LIZIZ);
        this.LJII.LLJILJILJ = false;
        if (!this.LJFF || !this.LJI) {
            z2 = true;
        }
        this.LJ = z2;
        return true;
    }

    public final boolean LIZIZ() {
        boolean z = this.LJI;
        boolean z2 = false;
        if (z || !this.LJ) {
            if (!this.LJII.LLFFF(this.LIZ, z)) {
                return false;
            }
            return true;
        }
        if (this.LJII.mViewPager.getCurrentItem() != this.LJII.mAdapter.getCount() - 1) {
            return false;
        }
        this.LJI = true;
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(this.LJII.mAdapter.LJJIL());
        List<Aweme> list = this.LIZLLL;
        List<Aweme> list2 = this.LIZ;
        ((ArrayList) list).addAll(list2.subList(this.LIZJ + 1, list2.size()));
        List<Aweme> list3 = this.LIZLLL;
        DetailFragmentPanel detailFragmentPanel = this.LJII;
        detailFragmentPanel.LLJILJILJ = true;
        detailFragmentPanel.j0(list3, this.LIZIZ);
        this.LJII.LLJILJILJ = false;
        if (!this.LJFF || !this.LJI) {
            z2 = true;
        }
        this.LJ = z2;
        return true;
    }

    public C55313LnJ(DetailFragmentPanel detailFragmentPanel, List<Aweme> list, boolean z, int i) {
        this.LJII = detailFragmentPanel;
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = i;
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        this.LIZLLL = arrayList2;
        arrayList2.add(ListProtector.get(list, i));
        if (i == 0) {
            this.LJFF = true;
        }
        if (i == arrayList.size() - 1) {
            this.LJI = true;
        }
    }
}
