package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$innerRestore$2$5", f = "DraftRestoreOp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GXM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProgressDialogC43239Gy3 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXM(ProgressDialogC43239Gy3 progressDialogC43239Gy3, InterfaceC67352kd<? super GXM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = progressDialogC43239Gy3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GXM(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJLIL;
        if (progressDialogC43239Gy3 != null) {
            progressDialogC43239Gy3.setProgress(90);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
