package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$updateNoticeSession$2", f = "SessionListManagerV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.37I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37I extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82253Kr LJLIL;
    public final /* synthetic */ InterfaceC81953Jn LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37I(C82253Kr c82253Kr, InterfaceC81953Jn interfaceC81953Jn, InterfaceC67352kd<? super C37I> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82253Kr;
        this.LJLILLLLZI = interfaceC81953Jn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37I(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJJIIZ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
