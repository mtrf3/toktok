package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$countDownCoroutines$3", f = "OtpFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aM6, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93142aM6 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super Integer>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93142aM6(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C93142aM6> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super Integer> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C93142aM6(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
