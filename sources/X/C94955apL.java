package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.modelselect.model.ModelViewModel$loadModelList$1$onFail$1", f = "ModelViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94955apL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C94373afx LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94955apL(C94373afx c94373afx, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c94373afx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94955apL(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZIZ.invoke(Boolean.FALSE);
        return C76800UCe.LIZ;
    }
}
