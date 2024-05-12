package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$3", f = "ToolsFluencyEventReport.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66702ja extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super C76800UCe>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;

    public C66702ja(InterfaceC67352kd<? super C66702ja> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Throwable th = (Throwable) this.LJLIL;
        H7B.LIZLLL(th);
        C78983UzD.LJIIZILJ(th);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super C76800UCe> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C66702ja c66702ja = new C66702ja(interfaceC67352kd);
        c66702ja.LJLIL = th;
        return c66702ja.invokeSuspend(C76800UCe.LIZ);
    }
}
