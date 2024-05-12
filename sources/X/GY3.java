package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$startDownloadVideo$1$10", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GY3 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super C41701GYf>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ InterfaceC64672gJ LJLIL;
    public final /* synthetic */ ProgressDialogC43239Gy3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY3(ProgressDialogC43239Gy3 progressDialogC43239Gy3, InterfaceC67352kd<? super GY3> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = progressDialogC43239Gy3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C41700GYe.LIZJ(this.LJLIL, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super C41701GYf> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        GY3 gy3 = new GY3(this.LJLILLLLZI, interfaceC67352kd);
        gy3.LJLIL = interfaceC64672gJ;
        return gy3.invokeSuspend(C76800UCe.LIZ);
    }
}
