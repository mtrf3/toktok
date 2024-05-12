package com.ss.android.ugc.aweme.ecommerce.search.sug.vm;

import X.ActivityC45651qj;
import X.C50948Jz6;
import X.C51266KAc;
import X.C55096Ljo;
import X.EnumC51280KAq;
import X.InterfaceC55235Lm3;
import X.KA5;
import X.KAC;
import X.KAH;
import X.KAN;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchSugAssemVM extends AssemViewModel<KA5> {
    public final ActivityC45651qj LJLIL;
    public final ISearchSugContextAbility LJLILLLLZI;
    public C50948Jz6 LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public Integer LJLJJLL;
    public boolean LJLJL;
    public LogPbBean LJLJLJ;
    public RecommendWordMob LJLJLLL;
    public C51266KAc LJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final KA5 defaultState() {
        return new KA5(null, null, null);
    }

    public final String hv0() {
        KAC Yr0;
        C50948Jz6 c50948Jz6;
        String enterSearchFrom;
        ISearchSugContextAbility iSearchSugContextAbility = this.LJLILLLLZI;
        if (iSearchSugContextAbility == null || (Yr0 = iSearchSugContextAbility.Yr0()) == null || (c50948Jz6 = Yr0.LIZ) == null || (enterSearchFrom = c50948Jz6.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    public final String iv0() {
        KAN Vk0;
        String str;
        ISearchSugContextAbility iSearchSugContextAbility = this.LJLILLLLZI;
        if (iSearchSugContextAbility == null || (Vk0 = iSearchSugContextAbility.Vk0()) == null || (str = Vk0.LIZIZ) == null) {
            return hv0();
        }
        return str;
    }

    public final int jv0() {
        KAN Vk0;
        ISearchSugContextAbility iSearchSugContextAbility = this.LJLILLLLZI;
        if (iSearchSugContextAbility != null && (Vk0 = iSearchSugContextAbility.Vk0()) != null) {
            return Vk0.LIZ;
        }
        return -1;
    }

    public final void gv0(String str) {
        KAC Yr0;
        int value;
        ISearchSugContextAbility iSearchSugContextAbility = this.LJLILLLLZI;
        if (iSearchSugContextAbility != null && (Yr0 = iSearchSugContextAbility.Yr0()) != null && Yr0.LIZIZ) {
            String hv0 = hv0();
            String iv0 = iv0();
            int jv0 = jv0();
            C50948Jz6 c50948Jz6 = this.LJLJI;
            if (c50948Jz6 != null) {
                value = c50948Jz6.getEcSearchEntranceValue();
            } else {
                value = EnumC51280KAq.DEFAULT.getValue();
            }
            KAH kah = new KAH();
            kah.LJIILL("type", str);
            kah.LJIILLIIL(hv0);
            kah.LJIILL("search_position", iv0);
            kah.LJIIZILJ(Integer.valueOf(value));
            kah.LJIJ(jv0);
            kah.LJIILIIL();
        }
    }

    public EcSearchSugAssemVM(ActivityC45651qj activityC45651qj, InterfaceC55235Lm3 scope) {
        o.LJIIIZ(scope, "scope");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = (ISearchSugContextAbility) C55096Ljo.LIZ(scope, ISearchSugContextAbility.class, null);
        this.LJLJJI = "";
        new MutableLiveData();
    }
}
