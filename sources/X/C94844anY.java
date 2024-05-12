package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.viewmodel.EffectLibViewModel$loadEffectList$1$onSuccess$1", f = "EffectLibViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.anY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94844anY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C94213adN LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94844anY(C94213adN c94213adN, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c94213adN;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94844anY(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.LJLIL.LIZIZ.get();
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        return C76800UCe.LIZ;
    }
}
