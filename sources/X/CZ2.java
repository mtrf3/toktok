package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CZ2 extends C1BC {
    public final List<Fragment> LJLJJLL;
    public final List<RankTabInfo> LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    public CZ2(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return CXJ.LJFF(((RankTabInfo) ListProtector.get(this.LJLJL, i)).title, ((RankTabInfo) ListProtector.get(this.LJLJL, i)).LJLIL).toString();
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }

    public final void LJJIIJZLJL(List<? extends Fragment> list, List<RankTabInfo> list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() != list2.size()) {
            return;
        }
        ((ArrayList) this.LJLJJLL).clear();
        ((ArrayList) this.LJLJL).clear();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                ((ArrayList) this.LJLJJLL).add(next);
                ((ArrayList) this.LJLJL).add(ListProtector.get(list2, i));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        notifyDataSetChanged();
    }
}
