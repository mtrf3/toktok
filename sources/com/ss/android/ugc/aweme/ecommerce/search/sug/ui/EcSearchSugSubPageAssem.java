package com.ss.android.ugc.aweme.ecommerce.search.sug.ui;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C51254K9q;
import X.C55096Ljo;
import X.C55230Lly;
import X.EnumC51268KAe;
import X.KAU;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ISearchSuggestContextAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchSugSubPageAssem extends UIContentAssem implements ISearchSugSubPageAbility {
    public ISearchSuggestContextAbility LJLIL;
    public C51254K9q LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void DV(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
    }

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        o.LJIIIZ(curPageState, "curPageState");
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJI;
        Integer valueOf = Integer.valueOf(R.id.jhs);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.jhs)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility
    public final void z2() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        _$_findCachedViewById(R.id.jhs).setVisibility(8);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        C51254K9q c51254K9q = null;
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, ISearchSugSubPageAbility.class, null);
        }
        ISearchSuggestContextAbility iSearchSuggestContextAbility = (ISearchSuggestContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchSuggestContextAbility.class, null);
        if (iSearchSuggestContextAbility != null) {
            this.LJLIL = iSearchSuggestContextAbility;
        }
        ISearchSuggestContextAbility iSearchSuggestContextAbility2 = this.LJLIL;
        if (iSearchSuggestContextAbility2 != null) {
            c51254K9q = iSearchSuggestContextAbility2.Fm0();
        }
        this.LJLILLLLZI = c51254K9q;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final KAU Jc0() {
        return KAU.SUG;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void Ff(EnumC51268KAe actionType) {
        String str;
        o.LJIIIZ(actionType, "actionType");
        _$_findCachedViewById(R.id.jhs).setVisibility(0);
        C51254K9q c51254K9q = this.LJLILLLLZI;
        if (c51254K9q != null) {
            ISearchSuggestContextAbility iSearchSuggestContextAbility = this.LJLIL;
            if (iSearchSuggestContextAbility == null || (str = iSearchSuggestContextAbility.f1()) == null) {
                str = "";
            }
            c51254K9q.LIZLLL.gv0().setValue(c51254K9q.LIZ.R9());
            c51254K9q.LIZJ.LIZJ(str);
            c51254K9q.LIZ();
        }
    }
}
