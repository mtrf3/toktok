package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.hybridkit.task.BDXBridgeInitUtils$postToCoroutines$3", f = "BDXBridgeInitUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62792dH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C62792dH(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C62792dH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62792dH(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke(Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}