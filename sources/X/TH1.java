package X;

import Y.IDiS166S0200000_12;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TH1 implements TH2 {
    public final HashMap<Integer, InterfaceC74377TGz<Fragment>> LJLIL;
    public final List<EffectCategoryModel> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public int LJLJJI;
    public final C73893SzJ<Integer> LJLJJL;
    public final C73893SzJ<OSZ<Integer, Integer>> LJLJJLL;
    public final ViewPager LJLJL;
    public final TGS LJLJLJ;
    public final TEJ LJLJLLL;

    @Override // X.TGQ
    public final AbstractC73672Svk<Integer> yg() {
        C73893SzJ<Integer> c73893SzJ = this.LJLJJL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.TGW
    public final void Hc(int i) {
        this.LJLJL.setCurrentItem(i, true);
    }

    @Override // X.TGW
    public final void d9(List<EffectCategoryModel> list) {
        o.LJIIIZ(list, "list");
        if (this.LJLJL.getAdapter() != null) {
            this.LJLJL.setAdapter(null);
        }
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(list);
        this.LJLJL.setAdapter((PagerAdapter) this.LJLJI.getValue());
        this.LJLJL.setCurrentItem(this.LJLJLJ.Yp0());
    }

    @Override // X.TH2
    public final void vd(C80697Vll c80697Vll) {
        this.LJLJL.addOnPageChangeListener(new IDiS166S0200000_12(this, c80697Vll, 2));
    }

    public TH1(ViewPager viewPager, TGS listViewModel, FragmentManager fragmentManager, TF5 requiredDependency, TEJ optionalDependency, TH7<?, Fragment> categoryProvider) {
        o.LJIIIZ(listViewModel, "listViewModel");
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        o.LJIIIZ(categoryProvider, "categoryProvider");
        this.LJLJL = viewPager;
        this.LJLJLJ = listViewModel;
        this.LJLJLLL = optionalDependency;
        this.LJLIL = new HashMap<>();
        this.LJLILLLLZI = new ArrayList();
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS72S0400000_12(this, fragmentManager, requiredDependency, categoryProvider, 27));
        this.LJLJI = LIZIZ;
        this.LJLJJI = -1;
        this.LJLJJL = new C73893SzJ<>();
        this.LJLJJLL = new C73893SzJ<>();
        viewPager.setAdapter((PagerAdapter) LIZIZ.getValue());
    }
}
