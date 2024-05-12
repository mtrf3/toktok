package X;

import android.animation.ValueAnimator;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.controller.atmosphere.TopSaleTagController$animatorSetOfTopSaleTag$2$1$1$2$1", f = "TopSaleTagController.kt", l = {206}, m = "invokeSuspend")
/* renamed from: X.3GV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ S3N LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GV(S3N s3n, InterfaceC67352kd<? super C3GV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = s3n;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3GV(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ValueAnimator valueAnimator = this.LJLILLLLZI.LJIILL;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
