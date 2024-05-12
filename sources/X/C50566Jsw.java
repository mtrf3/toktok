package X;

import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData;
import java.util.ArrayList;

/* renamed from: X.Jsw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50566Jsw implements InterfaceC50599JtT {
    public final /* synthetic */ C50565Jsv LJLIL;
    public final /* synthetic */ ArrayList<FeelgoodOptionData> LJLILLLLZI;

    public C50566Jsw(C50565Jsv c50565Jsv, ArrayList<FeelgoodOptionData> arrayList) {
        this.LJLIL = c50565Jsv;
        this.LJLILLLLZI = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r7 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r1 = (com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData) X.ORZ.LJLLLLLL(r8.LJLLLLLL, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        r6.LIZ = new com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerData(r4, r3, new com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerDataContent(r1), r8.LJLLLLLL);
        r6.LIZIZ = false;
        r2 = X.C50577Jt7.LIZIZ.getValue();
        r0 = r8.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r1 = r0.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r2.LIZ.LIZJ(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (r2 != null) goto L28;
     */
    @Override // X.InterfaceC50599JtT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r11, android.view.View r12) {
        /*
            r10 = this;
            X.Jsv r0 = r10.LJLIL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLILLLLZI
            r1 = 0
            if (r0 == 0) goto Lc9
            java.lang.String r2 = r0.getAid()
            if (r2 == 0) goto Lc9
            X.5H3<X.Jt7> r0 = X.C50577Jt7.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.Jt7 r0 = (X.C50577Jt7) r0
            X.0M6<java.lang.String, X.Jsy> r0 = r0.LIZ
            java.lang.Object r0 = r0.LIZIZ(r2)
            X.Jsy r0 = (X.C50568Jsy) r0
        L1d:
            r9 = 0
            if (r0 == 0) goto L24
            boolean r0 = r0.LIZIZ
            if (r0 != 0) goto L2a
        L24:
            X.Jsv r2 = r10.LJLIL
            int r0 = r2.LJLLLLLL
            if (r0 != r11) goto L2b
        L2a:
            return
        L2b:
            com.bytedance.tux.input.TuxTextView r3 = r2.LJLL
            if (r3 == 0) goto L41
            r0 = 1
            r3.setEnabled(r0)
            android.content.Context r2 = r3.getContext()
            r0 = 2131234082(0x7f080d22, float:1.808432E38)
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r2, r0)
            r3.setBackground(r0)
        L41:
            X.Jsv r0 = r10.LJLIL
            r0.LJLLLLLL = r11
            X.JtR r0 = r0.LJLLLL
            if (r0 != 0) goto Lbc
        L49:
            X.Jsv r2 = r10.LJLIL
            java.util.ArrayList<com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData> r0 = r10.LJLILLLLZI
            com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r11)
            r2.getClass()
            X.Jsv r0 = r10.LJLIL
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel r0 = r0.LJLZ
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire r0 = r0.getQuestionnaire()
            if (r0 == 0) goto L2a
            X.Jsv r8 = r10.LJLIL
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestion r2 = X.C44384HbQ.LJJLIIJ(r0)
            java.util.List r7 = X.C44384HbQ.LJJLL(r0)
            X.Jsy r6 = new X.Jsy
            r6.<init>()
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerData r5 = new com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerData
            if (r2 == 0) goto Lb3
            java.lang.Integer r0 = r2.getQuestionType()
            if (r0 == 0) goto Lb3
            int r4 = r0.intValue()
        L7c:
            java.lang.String r3 = r2.getQuestionKey()
            if (r3 != 0) goto L84
        L82:
            java.lang.String r3 = ""
        L84:
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerDataContent r2 = new com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.AnswerDataContent
            if (r7 == 0) goto L90
            int r0 = r8.LJLLLLLL
            java.lang.Object r1 = X.ORZ.LJLLLLLL(r0, r7)
            com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData r1 = (com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData) r1
        L90:
            r2.<init>(r1)
            int r0 = r8.LJLLLLLL
            r5.<init>(r4, r3, r2, r0)
            r6.LIZ = r5
            r6.LIZIZ = r9
            X.5H3<X.Jt7> r0 = X.C50577Jt7.LIZIZ
            java.lang.Object r2 = r0.getValue()
            X.Jt7 r2 = (X.C50577Jt7) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LJLILLLLZI
            if (r0 == 0) goto Lae
            java.lang.String r1 = r0.getAid()
            if (r1 != 0) goto Lc2
        Lae:
            r2.getClass()
            goto L2a
        Lb3:
            X.Hbt r0 = X.EnumC44413Hbt.INVALID
            int r4 = r0.getType()
            if (r2 == 0) goto L82
            goto L7c
        Lbc:
            r0.LJLIL = r11
            r0.notifyDataSetChanged()
            goto L49
        Lc2:
            X.0M6<java.lang.String, X.Jsy> r0 = r2.LIZ
            r0.LIZJ(r1, r6)
            goto L2a
        Lc9:
            r0 = r1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50566Jsw.LIZ(int, android.view.View):void");
    }
}
