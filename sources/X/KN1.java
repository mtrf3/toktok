package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel$processAweme$1", f = "EffectRecommendationCarouselViewModel.kt", l = {228, 237}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KN1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ EffectRecommendationCarouselViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN1(Aweme aweme, EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC67352kd<? super KN1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = aweme;
        this.LJLJI = effectRecommendationCarouselViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KN1(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r4 != null) goto L24;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLIL
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 == r2) goto L20
            if (r0 != r1) goto L7f
            X.C141335gf.LIZJ(r15)
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.C141335gf.LIZJ(r15)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r14.LJLILLLLZI
            r14.LJLIL = r2
            java.lang.Object r15 = X.KNB.LIZ(r0, r14)
            if (r15 != r3) goto L23
            return r3
        L20:
            X.C141335gf.LIZJ(r15)
        L23:
            X.OSZ r15 = (X.OSZ) r15
            java.lang.Object r5 = r15.getFirst()
            com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials r5 = (com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials) r5
            r12 = 0
            if (r5 == 0) goto L62
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r0 = r14.LJLJI
            androidx.lifecycle.MutableLiveData<S> r2 = r0.LJLJJL
            java.lang.Object r6 = r2.getValue()
            X.KMn r6 = (X.C51589KMn) r6
            if (r6 == 0) goto L7d
            com.ss.android.ugc.aweme.recommendationcard.data.FeedEventCardInfo r4 = r5.feedEventCardInfo
            if (r4 == 0) goto L77
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r4.feedCardTemplate
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardBackgroundInfo r0 = r0.feedCardBackgroundInfo
            if (r0 == 0) goto L77
            java.lang.String r7 = r0.titleText
        L48:
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r4.feedCardTemplate
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardActionButtonInfo r0 = r0.feedCardActionButtonInfo
            if (r0 == 0) goto L7b
            java.lang.String r8 = r0.text
        L52:
            java.util.List<com.ss.android.ugc.aweme.recommendationcard.data.CardContent> r9 = r5.cardContent
            java.lang.String r10 = r5.toString()
            r11 = 0
            r13 = 104(0x68, float:1.46E-43)
            X.KMn r0 = X.C51589KMn.LIZ(r6, r7, r8, r9, r10, r11, r12, r13)
        L5f:
            r2.setValue(r0)
        L62:
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r2 = r14.LJLJI
            r14.LJLIL = r1
            r2.getClass()
            X.XIA r1 = X.C78613UtF.LIZJ
            X.JG2 r0 = new X.JG2
            r0.<init>(r2, r12)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r14)
            if (r0 != r3) goto Lf
            return r3
        L77:
            r7 = r12
            if (r4 == 0) goto L7b
            goto L48
        L7b:
            r8 = r12
            goto L52
        L7d:
            r0 = r12
            goto L5f
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KN1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
