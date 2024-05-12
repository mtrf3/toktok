package X;

import Y.AObserverS76S0100000_8;
import Y.IDLListenerS195S0100000_8;
import Y.IDrS47S0100000_8;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.ui.ResearchFilterCell;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JnO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50222JnO extends FrameLayout {
    public final SYL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public SearchContainerHeaderVM LJLJI;
    public ThemeViewModel LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public List<ResearchFilterStruct> LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final IDLListenerS195S0100000_8 LJLJLLL;
    public final IDrS47S0100000_8 LJLL;

    private final ArgbEvaluator getArgbEvaluator() {
        return (ArgbEvaluator) this.LJLJLJ.getValue();
    }

    private final C57939MoZ getPowerConfig() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LJFF = new OptimizeAbility(true, 4);
        return c57939MoZ;
    }

    private final List<InterfaceC57784Mm4> getPowerListItems() {
        ArrayList arrayList = new ArrayList();
        List<ResearchFilterStruct> list = this.LJLJL;
        if (list != null) {
            Iterator<ResearchFilterStruct> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C50225JnR(it.next()));
            }
        }
        return arrayList;
    }

    private final C50223JnP getSwipeItemDecoration() {
        return (C50223JnP) this.LJLILLLLZI.getValue();
    }

    public final int getLastBottomMargin() {
        if (this.LJLJJLL) {
            return C05040Hs.LIZ(1, 8);
        }
        return this.LJLJJL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Integer num;
        int i;
        int i2;
        List<ResearchFilterStruct> list;
        int i3;
        MutableLiveData<C50240Jng> gv0;
        MutableLiveData<C50240Jng> hv0;
        super.onAttachedToWindow();
        ActivityC45651qj LJJIJIL = C30581Hy.LJJIJIL(this);
        C50652JuK.Companion.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(this);
        List<ResearchFilterStruct> list2 = null;
        if (LIZLLL != null) {
            num = Integer.valueOf(LIZLLL.getTabIndex());
        } else {
            num = null;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        String LJFF = C50605JtZ.LJFF(i);
        C51107K3z c51107K3z = C51107K3z.LIZ;
        if (LJJIJIL != null) {
            i2 = LJJIJIL.hashCode();
        } else {
            i2 = 0;
        }
        OptionConfigParams LIZIZ = c51107K3z.LIZIZ(i2, LJFF);
        if (LIZIZ != null) {
            list2 = LIZIZ.researchOptionList;
        }
        this.LJLJL = list2;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.LJLJL != null) {
            float LJJIFFI = C78847Ux1.LJJIFFI(8);
            List<ResearchFilterStruct> list3 = this.LJLJL;
            if (list3 != null) {
                for (ResearchFilterStruct researchFilterStruct : list3) {
                    String name = researchFilterStruct.getName();
                    if (name != null && name.length() != 0) {
                        String name2 = researchFilterStruct.getName();
                        T5S t5s = new T5S();
                        if (((Number) C50291JoV.LIZ.getValue()).intValue() == 1) {
                            i3 = 62;
                        } else {
                            i3 = 72;
                        }
                        t5s.LIZ(i3);
                        float measureText = t5s.measureText(name2) + C78847Ux1.LJJIFFI(24);
                        if (measureText < C78847Ux1.LJJIFFI(44)) {
                            measureText = C78847Ux1.LJJIFFI(44);
                        }
                        researchFilterStruct.setWidth(measureText);
                        LJJIFFI += C78847Ux1.LJJIFFI(8) + researchFilterStruct.getWidth();
                    }
                }
            }
            float LJIIJJI = KL2.LJIIJJI(getContext());
            if (LJJIFFI < LJIIJJI && (list = this.LJLJL) != null && !list.isEmpty()) {
                o.LJI(this.LJLJL);
                float size = (LJIIJJI - LJJIFFI) / r0.size();
                List<ResearchFilterStruct> list4 = this.LJLJL;
                if (list4 != null) {
                    for (ResearchFilterStruct researchFilterStruct2 : list4) {
                        researchFilterStruct2.setWidth(researchFilterStruct2.getWidth() + size);
                    }
                }
            }
        }
        if (this.LJLIL.getParent() == null) {
            SYL syl = this.LJLIL;
            syl.getContext();
            syl.setLayoutManager(new LinearLayoutManager(0, false));
            syl.LJII(getSwipeItemDecoration(), -1);
            syl.LLLF.LJZL(ResearchFilterCell.class);
            syl.getState().LJ(getPowerListItems());
            if (C50086JlC.LIZ().enableResearchItemPreCreate) {
                syl.setListConfig(getPowerConfig());
            }
            addView(this.LJLIL);
            C26338AVi.LJI(this.LJLIL, 0, Integer.valueOf((int) C78847Ux1.LJJIFFI(8)), 0, Integer.valueOf(getLastBottomMargin()), false, 16);
        }
        if (LJJIJIL != null) {
            ThemeViewModel themeViewModel = (ThemeViewModel) ViewModelProviders.of(LJJIJIL).get(ThemeViewModel.class);
            this.LJLJJI = themeViewModel;
            if (themeViewModel != null && (hv0 = themeViewModel.hv0()) != null) {
                hv0.observe(LJJIJIL, new AObserverS76S0100000_8(this, 157));
            }
            ThemeViewModel themeViewModel2 = this.LJLJJI;
            if (themeViewModel2 != null && (gv0 = themeViewModel2.gv0()) != null) {
                gv0.observe(LJJIJIL, new AObserverS76S0100000_8(this, 158));
            }
        }
        ActivityC45651qj LJJIJIL2 = C30581Hy.LJJIJIL(this);
        if (LJJIJIL2 != null && C49804Jge.LJJIZ() && (C79234V7u.LJIIIZ(this) instanceof SearchJediMixFeedFragment)) {
            this.LJLJI = (SearchContainerHeaderVM) ViewModelProviders.of(LJJIJIL2).get(SearchContainerHeaderVM.class);
        }
        if (C49804Jge.LJJIZ()) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.LJLJLLL);
        }
    }

    public final boolean getBanAdjustBottomMargin() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50222JnO(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new SYL(context, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(C50224JnQ.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C50226JnS.LJLIL);
        this.LJLJLLL = new IDLListenerS195S0100000_8(this, 2);
        this.LJLL = new IDrS47S0100000_8(this, 19);
    }

    public final void setBanAdjustBottomMargin(boolean z) {
        this.LJLJJLL = z;
    }
}
