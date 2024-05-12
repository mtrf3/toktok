package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeFetchManager$getBatchAwemeCacheItem$3$loadingJobs$1$1$1", f = "AwemeFetchManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69502o6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC69762oW, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C69502o6(InterfaceC67352kd<? super C69502o6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C69502o6 c69502o6 = new C69502o6(interfaceC67352kd);
        c69502o6.LJLIL = obj;
        return c69502o6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return Boolean.valueOf(!(this.LJLIL instanceof C69712oR));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC69762oW interfaceC69762oW, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC69762oW, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
