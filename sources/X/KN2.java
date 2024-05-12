package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel$processAweme$1", f = "EffectRecommendationCardViewModel.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KN2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ EffectRecommendationCardViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN2(Aweme aweme, EffectRecommendationCardViewModel effectRecommendationCardViewModel, InterfaceC67352kd<? super KN2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = aweme;
        this.LJLJI = effectRecommendationCardViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KN2(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r3 != null) goto L17;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLIL
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 != r1) goto L74
            X.C141335gf.LIZJ(r14)
        Lc:
            X.OSZ r14 = (X.OSZ) r14
            java.lang.Object r2 = r14.getFirst()
            com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials r2 = (com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials) r2
            java.lang.Object r9 = r14.getSecond()
            java.lang.String r9 = (java.lang.String) r9
            if (r2 == 0) goto L5d
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel r0 = r13.LJLJI
            androidx.lifecycle.MutableLiveData<X.KN3> r1 = r0.LJLJL
            java.lang.Object r4 = r1.getValue()
            X.KN3 r4 = (X.KN3) r4
            r8 = 0
            if (r4 == 0) goto L5a
            com.ss.android.ugc.aweme.recommendationcard.data.FeedEventCardInfo r3 = r2.feedEventCardInfo
            if (r3 == 0) goto L60
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r3.feedCardTemplate
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardBackgroundInfo r0 = r0.feedCardBackgroundInfo
            if (r0 == 0) goto L60
            java.lang.String r5 = r0.titleText
        L37:
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r3.feedCardTemplate
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardActionButtonInfo r0 = r0.feedCardActionButtonInfo
            if (r0 == 0) goto L64
            java.lang.String r6 = r0.text
        L41:
            java.util.List<com.ss.android.ugc.aweme.recommendationcard.data.CardContent> r7 = r2.cardContent
            if (r3 == 0) goto L4f
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r3.feedCardTemplate
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardBackgroundInfo r0 = r0.feedCardBackgroundInfo
            if (r0 == 0) goto L4f
            java.lang.String r8 = r0.bgMusicUrl
        L4f:
            java.lang.String r10 = r2.toString()
            r11 = 0
            r12 = 64
            X.KN3 r8 = X.KN3.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L5a:
            r1.setValue(r8)
        L5d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L60:
            r5 = r8
            if (r3 == 0) goto L64
            goto L37
        L64:
            r6 = r8
            goto L41
        L66:
            X.C141335gf.LIZJ(r14)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.LJLILLLLZI
            r13.LJLIL = r1
            java.lang.Object r14 = X.KNB.LIZ(r0, r13)
            if (r14 != r2) goto Lc
            return r2
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KN2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
