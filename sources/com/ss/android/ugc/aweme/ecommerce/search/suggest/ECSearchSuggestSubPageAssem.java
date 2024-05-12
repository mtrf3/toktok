package com.ss.android.ugc.aweme.ecommerce.search.suggest;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C26045AKb;
import X.C51254K9q;
import X.C55096Ljo;
import X.C55230Lly;
import X.C72837SiH;
import X.KAU;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECSearchSuggestSubPageAssem extends UISlotAssem implements ISearchSuggestSubPageAbility {
    public ISearchSuggestContextAbility LJLJLLL;
    public C51254K9q LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void DV(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLI;
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

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.apc;
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
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, ISearchSuggestSubPageAbility.class, null);
        }
        ISearchSuggestContextAbility iSearchSuggestContextAbility = (ISearchSuggestContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchSuggestContextAbility.class, null);
        if (iSearchSuggestContextAbility != null) {
            this.LJLJLLL = iSearchSuggestContextAbility;
        }
        ISearchSuggestContextAbility iSearchSuggestContextAbility2 = this.LJLJLLL;
        if (iSearchSuggestContextAbility2 != null) {
            c51254K9q = iSearchSuggestContextAbility2.Fm0();
        }
        this.LJLL = c51254K9q;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final KAU Jc0() {
        return KAU.SUGGEST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0137, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
    
        if (r2 == null) goto L28;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ff(X.EnumC51268KAe r12) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.ECSearchSuggestSubPageAssem.Ff(X.KAe):void");
    }

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        WeakReference<C26045AKb> weakReference;
        C26045AKb c26045AKb;
        o.LJIIIZ(curPageState, "curPageState");
        if (curPageState == KAU.RESULT && (weakReference = C72837SiH.LJLJJL) != null && (c26045AKb = weakReference.get()) != null) {
            c26045AKb.LIZIZ();
            C72837SiH.LJLJJL = null;
        }
    }
}
