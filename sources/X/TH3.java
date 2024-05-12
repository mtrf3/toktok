package X;

import Y.AObserverS80S0100000_12;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.internal.i;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TH3<TabView> implements TGZ {
    public final C73893SzJ<OSZ<EffectCategoryModel, Integer>> LJLIL;
    public final C73849Syb<OSZ<EffectCategoryModel, Integer>> LJLILLLLZI;
    public final List<EffectCategoryModel> LJLJI;
    public boolean LJLJJI;
    public final C80695Vlj LJLJJL;
    public final ActivityC45651qj LJLJJLL;
    public final LifecycleOwner LJLJL;
    public final TGD LJLJLJ;
    public final TGW LJLJLLL;
    public final TF5 LJLL;
    public final TGS LJLLI;
    public final TH7<TabView, ?> LJLLILLLL;

    public abstract View LIZ(ActivityC45651qj activityC45651qj, EffectCategoryModel effectCategoryModel, int i, C74358TGg c74358TGg);

    @Override // X.TGZ
    public final void E3() {
        if (C82894Wg6.LIZIZ.LIZJ().LIZJ() && !this.LJLJJI) {
            this.LJLJJI = true;
            List<EffectCategoryModel> list = (List) this.LJLLI.Ep().getValue();
            if (list != null) {
                d9(list);
            }
            this.LJLLI.ih();
        }
    }

    public final C73426Srm LIZIZ() {
        C73849Syb<OSZ<EffectCategoryModel, Integer>> c73849Syb = this.LJLILLLLZI;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }

    public final C73426Srm LIZJ() {
        C73893SzJ<OSZ<EffectCategoryModel, Integer>> c73893SzJ = this.LJLIL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.TGQ
    public final AbstractC73672Svk<Integer> yg() {
        return this.LJLJLLL.yg();
    }

    @Override // X.TGW
    public final void Hc(int i) {
        this.LJLJLLL.Hc(i);
    }

    @Override // X.TGW
    public final void d9(List<EffectCategoryModel> list) {
        C164456cr LJIIJJI;
        o.LJIIIZ(list, "list");
        this.LJLJLLL.d9(list);
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJI).addAll(list);
        if (this.LJLJLJ.LJLL) {
            C78897Uxp.LJJJJZ(this.LJLJJL, list.size());
        }
        boolean z = !o.LJ(this.LJLLI.Zj().getValue(), Boolean.TRUE);
        this.LJLJJL.LJIILJJIL();
        int i = 0;
        for (EffectCategoryModel effectCategoryModel : list) {
            int i2 = i + 1;
            if (i >= 0) {
                View LIZ = LIZ(this.LJLJJLL, effectCategoryModel, i, new C74358TGg(this));
                C80695Vlj c80695Vlj = this.LJLJJL;
                C164456cr LJIIL = c80695Vlj.LJIIL();
                LJIIL.LJ = false;
                LJIIL.LIZLLL = LIZ;
                LJIIL.LIZIZ();
                c80695Vlj.LIZLLL(LJIIL, false);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (z || (LJIIJJI = this.LJLJJL.LJIIJJI(this.LJLLI.Yp0())) == null) {
            return;
        }
        LJIIJJI.LIZ();
    }

    public TH3(C80700Vlo tabLayout, ActivityC45651qj activity, LifecycleOwner lifecycleOwner, TGD stickerViewConfigure, TH1 th1, TF5 requiredDependency, TGS listViewModel, TH7 customCategoryProvider) {
        o.LJIIIZ(tabLayout, "tabLayout");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerViewConfigure, "stickerViewConfigure");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(listViewModel, "listViewModel");
        o.LJIIIZ(customCategoryProvider, "customCategoryProvider");
        this.LJLJJL = tabLayout;
        this.LJLJJLL = activity;
        this.LJLJL = lifecycleOwner;
        this.LJLJLJ = stickerViewConfigure;
        this.LJLJLLL = th1;
        this.LJLL = requiredDependency;
        this.LJLLI = listViewModel;
        this.LJLLILLLL = customCategoryProvider;
        this.LJLIL = new C73893SzJ<>();
        this.LJLILLLLZI = new C73849Syb<>();
        this.LJLJI = new ArrayList();
        TH5 th5 = (TH5) this;
        tabLayout.LLIIJLIL = new TH4(th5);
        th1.vd(new C80697Vll(tabLayout));
        listViewModel.Ep().observe(lifecycleOwner, new AObserverS80S0100000_12(th5, 90));
        tabLayout.setOnTabClickListener(i.LJLIL);
        if (!C82894Wg6.LIZIZ.LIZJ().LIZJ() || this.LJLJJI) {
            listViewModel.ih();
        }
    }
}
