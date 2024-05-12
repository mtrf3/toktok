package X;

import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel$startAutoRotation$1", f = "EffectRecommendationCarouselViewModel.kt", l = {263}, m = "invokeSuspend")
/* renamed from: X.Jcq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49568Jcq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectRecommendationCarouselViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49568Jcq(EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC67352kd<? super C49568Jcq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectRecommendationCarouselViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49568Jcq(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (X.C90193gN.LIZIZ(X.C5L7.LIZ()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (X.C90193gN.LIZIZ(X.C5L7.LIZ()) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (X.C90193gN.LIZIZ(X.C5L7.LIZ()) != false) goto L11;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r2 = 1
            if (r0 == 0) goto L76
            if (r0 != r2) goto L84
            X.C141335gf.LIZJ(r12)
        Lc:
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r0 = r11.LJLILLLLZI
            androidx.lifecycle.MutableLiveData<S> r0 = r0.LJLJJL
            java.lang.Object r0 = r0.getValue()
            X.KMn r0 = (X.C51589KMn) r0
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r4 = r11.LJLILLLLZI
            java.lang.Integer r3 = r0.LJI
            r1 = 2
            if (r3 != 0) goto L42
        L1f:
            r2 = 0
        L20:
            androidx.lifecycle.MutableLiveData<S> r1 = r4.LJLJJL
            java.lang.Object r3 = r1.getValue()
            X.KMn r3 = (X.C51589KMn) r3
            if (r3 == 0) goto L40
            r4 = 0
            r8 = 0
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r2)
            r10 = 63
            r5 = r4
            r6 = r4
            r7 = r4
            X.KMn r0 = X.C51589KMn.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
        L3a:
            r1.setValue(r0)
        L3d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L40:
            r0 = 0
            goto L3a
        L42:
            int r0 = r3.intValue()
            if (r0 != 0) goto L54
            android.content.Context r0 = X.C5L7.LIZ()
            boolean r0 = X.C90193gN.LIZIZ(r0)
            if (r0 == 0) goto L20
        L52:
            r2 = 2
            goto L20
        L54:
            int r0 = r3.intValue()
            if (r0 != r2) goto L65
            android.content.Context r0 = X.C5L7.LIZ()
            boolean r0 = X.C90193gN.LIZIZ(r0)
            if (r0 == 0) goto L52
            goto L1f
        L65:
            int r0 = r3.intValue()
            if (r0 != r1) goto L1f
            android.content.Context r0 = X.C5L7.LIZ()
            boolean r0 = X.C90193gN.LIZIZ(r0)
            if (r0 == 0) goto L1f
            goto L20
        L76:
            X.C141335gf.LIZJ(r12)
            r11.LJLIL = r2
            r0 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r11)
            if (r0 != r3) goto Lc
            return r3
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49568Jcq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
