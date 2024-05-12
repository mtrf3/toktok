package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class SGT extends C1BC {
    public final List<Fragment> LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    public SGT(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LJLJJLL = new ArrayList();
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }
}
