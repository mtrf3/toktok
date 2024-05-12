package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.AbstractC49793JgT;
import X.C2NU;
import X.C38816FLg;
import X.C49917JiT;
import X.C50257Jnx;
import X.C50259Jnz;
import X.C50287JoR;
import X.JZI;
import Y.ARunnableS44S0100000_8;
import android.view.View;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchOriginalFragment<D> extends SearchFragment<D> implements JZI {
    public C49917JiT<?> LLJJJJJIL;
    public final Map<Integer, View> LLJJJJLIIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJJJJLIIL).clear();
    }

    @Override // X.InterfaceC49928Jie
    public void xa(DynamicPatch dynamicPatch, String str) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Ol() {
        if (this.LLJJJJJIL == null) {
            return;
        }
        T t = tn().LJLIL;
        if (t != 0) {
            ((AbstractC49793JgT) t).LJIIJJI();
        }
        if (Om()) {
            nm().clearData();
        }
    }

    public final C49917JiT<?> tn() {
        C49917JiT<?> c49917JiT = this.LLJJJJJIL;
        if (c49917JiT != null) {
            return c49917JiT;
        }
        o.LJIJI("mPresenter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void Ne() {
        C50259Jnz LIZIZ;
        if (tn().LJLIL != 0 && (LIZIZ = C50257Jnx.LIZIZ((C50257Jnx) this.LLJJIJIL.getValue(), (SearchApiResult) tn().LJLIL.getData(), null, 2)) != null) {
            on(LIZIZ);
        } else {
            Em();
            Ym();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pm() {
        /*
            r12 = this;
            X.JiT r0 = r12.tn()
            T extends X.8BS r0 = r0.LJLIL
            r8 = 0
            if (r0 != 0) goto L9a
        L9:
            X.JiT r5 = r12.tn()
            r0 = 5
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r11 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r4[r8] = r0
            com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper r1 = com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper.Companion.LIZ(r12)
            com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo r0 = r1.LIZIZ
            r10 = 0
            if (r0 == 0) goto L8f
            int r0 = r0.correctLevel
        L22:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L26:
            com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper r1 = com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper.Companion.LIZ(r12)
            com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo r0 = r1.LIZIZ
            if (r0 == 0) goto L32
            java.lang.String r7 = r0.correctedQuery
            if (r7 != 0) goto L3a
        L32:
            com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo r0 = r1.LIZ
            if (r0 == 0) goto L8d
            java.lang.String r7 = r0.getCorrectedKeyword()
        L3a:
            r6 = 2
            if (r9 != 0) goto L82
        L3d:
            java.lang.String r3 = ""
        L3f:
            X.Jgq r2 = r12.Ll()
            X.Jgo r1 = new X.Jgo
            java.lang.String r0 = r12.Kl()
            r1.<init>(r0, r3)
            r2.LIZ(r1)
            if (r9 != 0) goto L75
        L51:
            java.lang.String r7 = r12.Kl()
        L55:
            r0 = 1
            r4[r0] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4[r6] = r0
            int r0 = r12.LLFF
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 3
            r4[r0] = r1
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r12.LJLLILLLL
            if (r0 == 0) goto L6f
            X.JoR r10 = r0.getFilterOption()
        L6f:
            r4[r11] = r10
            r5.LJIILL(r4)
            return
        L75:
            int r0 = r9.intValue()
            if (r0 != r6) goto L51
            if (r7 != 0) goto L55
            java.lang.String r7 = r12.Kl()
            goto L55
        L82:
            int r0 = r9.intValue()
            if (r0 != r6) goto L3d
            if (r7 != 0) goto L8b
            goto L3d
        L8b:
            r3 = r7
            goto L3f
        L8d:
            r7 = r10
            goto L3a
        L8f:
            com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo r0 = r1.LIZ
            if (r0 == 0) goto L98
            int r0 = r0.getCorrectedLevel()
            goto L22
        L98:
            r9 = r10
            goto L26
        L9a:
            X.JgT r0 = (X.AbstractC49793JgT) r0
            r0.LJLL = r8
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment.Pm():void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final String lm() {
        AbstractC49793JgT abstractC49793JgT = (AbstractC49793JgT) tn().LJLIL;
        if (abstractC49793JgT != null) {
            return abstractC49793JgT.LJLLL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        tn().LIZIZ();
    }

    public void un() {
        C50287JoR c50287JoR;
        fm().setIsRefreshingData(true);
        C49917JiT<?> tn = tn();
        Object[] objArr = new Object[5];
        objArr[0] = 1;
        objArr[1] = Kl();
        objArr[2] = 0;
        objArr[3] = Integer.valueOf(this.LLFF);
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null) {
            c50287JoR = searchResultParam.getFilterOption();
        } else {
            c50287JoR = null;
        }
        objArr[4] = c50287JoR;
        tn.LJIILL(objArr);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Rm(boolean z) {
        String Jl = Jl();
        T t = tn().LJLIL;
        o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchBaseModel<*, *>");
        hn(Jl, ((AbstractC49793JgT) t).LJLLI, Kl(), null, z);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void qn(boolean z) {
        if (this.LLJJJJJIL == null) {
            return;
        }
        super.qn(z);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Zm(int i, C50287JoR c50287JoR) {
        super.Zm(0, c50287JoR);
        mo49getActivity();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                if (this.LLJJJJJIL == null) {
                    return;
                }
                T t = tn().LJLIL;
                if (t != 0) {
                    ((AbstractC49793JgT) t).LJLL = 0;
                }
                tn().LJIJ(this.LJZ);
                un();
                return;
            }
        } catch (Exception unused) {
        }
        C38816FLg.LIZLLL(new ARunnableS44S0100000_8(this, 42), 100);
    }
}
