package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HWM extends C1BC {
    public final List<Fragment> LJLJJLL;
    public final List<String> LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return (CharSequence) ListProtector.get(this.LJLJL, i);
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        return (Fragment) ListProtector.get(this.LJLJJLL, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HWM(FragmentManager fragmentManager, List<? extends Fragment> fragmentList, List<String> tabTitles) {
        super(fragmentManager, 0);
        o.LJIIIZ(fragmentList, "fragmentList");
        o.LJIIIZ(tabTitles, "tabTitles");
        this.LJLJJLL = fragmentList;
        this.LJLJL = tabTitles;
    }
}
