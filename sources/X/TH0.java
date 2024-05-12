package X;

import Y.AfS64S0100000_12;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TH0 extends C1BD {
    public final RecyclerView.RecycledViewPool LJLJLJ;
    public final java.util.Map<Integer, InterfaceC92693kP> LJLJLLL;
    public final TF5 LJLL;
    public final TEJ LJLLI;
    public final java.util.Map<Integer, InterfaceC74377TGz<Fragment>> LJLLILLLL;
    public final List<EffectCategoryModel> LJLLJ;
    public final TH7<?, Fragment> LJLLL;
    public final /* synthetic */ TH1 LJLLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object objectObj) {
        o.LJIIIZ(objectObj, "objectObj");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLLJ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        InterfaceC74377TGz<Fragment> LIZIZ = this.LJLLL.get(((com.ss.ugc.effectplatform.model.EffectCategoryModel) ListProtector.get(this.LJLLJ, i)).getKey()).LIZIZ(i, this.LJLL, this.LJLLI, this.LJLJLJ);
        this.LJLLILLLL.put(Integer.valueOf(i), LIZIZ);
        this.LJLJLLL.put(Integer.valueOf(i), LIZIZ.yg().LJJJLIIL(new AfS64S0100000_12(this, 116), C73982T1u.LJLIL));
        LIZIZ.N7();
        return (Fragment) LIZIZ;
    }

    @Override // X.C1BD, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object obj) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        super.LJIIIZ(i, container, obj);
        InterfaceC92693kP remove = this.LJLJLLL.remove(Integer.valueOf(i));
        if (remove != null && !remove.isDisposed()) {
            remove.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TH0(TH1 th1, FragmentManager fragmentManager, TF5 tf5, TEJ tej, java.util.Map<Integer, InterfaceC74377TGz<Fragment>> currentPages, List<EffectCategoryModel> categoryList, TH7<?, Fragment> th7) {
        super(fragmentManager, 0);
        o.LJIIIZ(currentPages, "currentPages");
        o.LJIIIZ(categoryList, "categoryList");
        this.LJLLLL = th1;
        this.LJLL = tf5;
        this.LJLLI = tej;
        this.LJLLILLLL = currentPages;
        this.LJLLJ = categoryList;
        this.LJLLL = th7;
        this.LJLJLJ = new RecyclerView.RecycledViewPool();
        this.LJLJLLL = new LinkedHashMap();
    }
}
