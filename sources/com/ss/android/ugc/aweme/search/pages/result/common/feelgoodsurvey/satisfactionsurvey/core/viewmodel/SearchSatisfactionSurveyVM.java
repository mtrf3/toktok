package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.viewmodel;

import X.C221108m2;
import X.C50352JpU;
import X.C50353JpV;
import X.C62822Ol8;
import X.InterfaceC50355JpX;
import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;

/* loaded from: classes9.dex */
public class SearchSatisfactionSurveyVM extends ViewModel implements InterfaceC50355JpX {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C50353JpV.LJLIL);
    public final Gson LJLILLLLZI = GsonHolder.LIZLLL().LIZ();
    public C50352JpU LJLJI;

    @Override // X.InterfaceC50355JpX
    public final void cT() {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: s -> 0x009c, TRY_LEAVE, TryCatch #0 {s -> 0x009c, blocks: (B:39:0x008f, B:41:0x0093), top: B:38:0x008f }] */
    @Override // X.InterfaceC50355JpX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b30(androidx.fragment.app.Fragment r7, com.google.gson.m r8, com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r6 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "signParams"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            if (r9 == 0) goto Lbc
            X.Ol8 r0 = r6.LJLIL
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire r0 = r9.getQuestionnaire()
            r5 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = r0.getSurveyID()
        L1f:
            boolean r0 = X.ORZ.LJLJJI(r0, r1)
            if (r0 != 0) goto L28
            return
        L26:
            r0 = r5
            goto L1f
        L28:
            X.JuJ r0 = X.C50652JuK.Companion
            r0.getClass()
            X.Joz r3 = X.C50651JuJ.LJ(r7)
            if (r3 == 0) goto L72
            java.util.HashMap r1 = r3.getFeelGoodToken()
            if (r1 == 0) goto L72
            java.lang.String r0 = "token_type"
            java.lang.Object r2 = r1.get(r0)
        L3f:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L70
            java.lang.String r2 = (java.lang.String) r2
        L45:
            if (r3 == 0) goto L6e
            java.util.HashMap r1 = r3.getFeelGoodToken()
            if (r1 == 0) goto L6e
            java.lang.String r0 = "token"
            java.lang.Object r1 = r1.get(r0)
        L53:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L6c
            java.lang.String r1 = (java.lang.String) r1
        L59:
            boolean r0 = X.C78857UxB.LJJJIL(r1)
            if (r0 == 0) goto L74
            boolean r0 = X.C78857UxB.LJJJIL(r2)
            if (r0 == 0) goto L74
            r0 = 32
            java.lang.String r4 = X.C00F.LIZIZ(r2, r0, r1)
            goto L75
        L6c:
            r1 = r5
            goto L59
        L6e:
            r1 = r5
            goto L53
        L70:
            r2 = r5
            goto L45
        L72:
            r2 = r5
            goto L3f
        L74:
            r4 = r5
        L75:
            com.google.gson.Gson r1 = r6.LJLILLLLZI     // Catch: com.google.gson.s -> L82
            if (r1 == 0) goto L82
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel> r0 = com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel.class
            java.lang.Object r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r8, r0)     // Catch: com.google.gson.s -> L82
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel r3 = (com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel) r3     // Catch: com.google.gson.s -> L82
            goto L83
        L82:
            r3 = r5
        L83:
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire r0 = r9.getQuestionnaire()
            if (r0 == 0) goto L9c
            java.lang.String r2 = r0.getCustomText()
            if (r2 == 0) goto L9c
            com.google.gson.Gson r1 = r6.LJLILLLLZI     // Catch: com.google.gson.s -> L9c
            if (r1 == 0) goto L9c
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText> r0 = com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText.class
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L9c
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText r0 = (com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText) r0     // Catch: com.google.gson.s -> L9c
            r5 = r0
        L9c:
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r2 = X.C17N.LJJJJJL(r7)
            X.JpA r1 = new X.JpA
            X.JpT r0 = new X.JpT
            r0.<init>(r3, r4, r10, r5)
            r1.<init>(r0)
            r2.j4(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Feelgood request success, questionnaire = "
            r1.append(r0)
            r1.append(r8)
            X.X1D.LIZIZ(r1)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.viewmodel.SearchSatisfactionSurveyVM.b30(androidx.fragment.app.Fragment, com.google.gson.m, com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel, java.util.Map):void");
    }
}
