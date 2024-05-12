package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.nows.savelocal.NowsSaveLocalHelper$saveLocal$1$1$2", f = "NowsSaveLocalHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6a5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162736a5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C162776a9 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C162736a5(C162776a9 c162776a9, InterfaceC67352kd<? super C162736a5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c162776a9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C162736a5(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.onFinish(false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
