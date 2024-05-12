package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$startDownloadVideo$1$2", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GY4 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super C41703GYh>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ InterfaceC64672gJ LJLIL;
    public final /* synthetic */ ProgressDialogC43239Gy3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY4(ProgressDialogC43239Gy3 progressDialogC43239Gy3, InterfaceC67352kd<? super GY4> interfaceC67352kd) {
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
    public final Object invoke(InterfaceC64672gJ<? super C41703GYh> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        GY4 gy4 = new GY4(this.LJLILLLLZI, interfaceC67352kd);
        gy4.LJLIL = interfaceC64672gJ;
        return gy4.invokeSuspend(C76800UCe.LIZ);
    }
}
