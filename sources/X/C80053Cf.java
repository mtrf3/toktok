package X;

import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationBaseViewModel;
import fjb.a;

/* JADX INFO: Add missing generic type declarations: [T] */
@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationBaseViewModel$1", f = "EffectRecommendationBaseViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80053Cf<T> extends AbstractC65782Prm implements InterfaceC88471Ynr<T, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EffectRecommendationBaseViewModel<T, S> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80053Cf(EffectRecommendationBaseViewModel<T, S> effectRecommendationBaseViewModel, InterfaceC67352kd<? super C80053Cf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectRecommendationBaseViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C80053Cf c80053Cf = new C80053Cf(this.LJLILLLLZI, interfaceC67352kd);
        c80053Cf.LJLIL = obj;
        return c80053Cf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.iv0(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(obj, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
