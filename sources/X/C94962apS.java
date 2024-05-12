package X;

import Y.IDfS134S0100000_42;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.EffectSelectFragment$observeEvent$1$1$1", f = "EffectSelectFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94962apS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IDfS134S0100000_42 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94962apS(InterfaceC67352kd interfaceC67352kd, IDfS134S0100000_42 iDfS134S0100000_42) {
        super(2, interfaceC67352kd);
        this.LJLIL = iDfS134S0100000_42;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94962apS(completion, this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((C94963apT) this.LJLIL.l0).LJLILLLLZI.vl();
        return C76800UCe.LIZ;
    }
}
