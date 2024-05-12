package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.764, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass764<T extends AbsFragment> extends C1BC {
    public final List<T> LJLJJLL;
    public final List<Integer> LJLJL;
    public final FragmentManager LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        if (this.LJLJJLL.contains(obj)) {
            return this.LJLJJLL.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        InterfaceC36571c5 interfaceC36571c5 = (Fragment) ListProtector.get(this.LJLJJLL, i);
        if (interfaceC36571c5 instanceof InterfaceC1802075k) {
            return ((InterfaceC1802075k) interfaceC36571c5).Qf();
        }
        return "";
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }

    @Override // X.C1BC
    public final long LJJIIJ(int i) {
        Fragment fragment;
        if (i < 0 || i >= this.LJLJJLL.size() || (fragment = (Fragment) ListProtector.get(this.LJLJJLL, i)) == null) {
            return 0L;
        }
        return fragment.hashCode();
    }

    public AnonymousClass764(FragmentManager fragmentManager, List<T> list, List<Integer> list2) {
        super(fragmentManager, 0);
        this.LJLJLJ = fragmentManager;
        this.LJLJJLL = list;
        this.LJLJL = list2;
    }

    @Override // X.C1BC, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        FragmentManager fragmentManager = this.LJLJLJ;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        LIZ.LJJI((Fragment) obj);
        LIZ.LJI();
    }
}
