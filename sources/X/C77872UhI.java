package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UhI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77872UhI extends C1BD {
    public final List<VisibilityFragment> LJLJLJ;
    public final List<SubRankTabInfo> LJLJLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJLJ).size();
    }

    public C77872UhI(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        if (ORZ.LJLJJI(object, this.LJLJLJ)) {
            return ORZ.LJZ(object, this.LJLJLJ);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return CXJ.LJFF(((SubRankTabInfo) ListProtector.get(this.LJLJLLL, i)).title, "").toString();
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJLJ, i);
    }
}
