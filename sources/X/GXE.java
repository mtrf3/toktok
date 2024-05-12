package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$restore$3$deffer$1", f = "DraftRestoreOp.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GXE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C41656GWm>, Object> {
    public int LJLIL;
    public final /* synthetic */ GXC LJLILLLLZI;
    public final /* synthetic */ ProgressDialogC43239Gy3 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXE(GXC gxc, ProgressDialogC43239Gy3 progressDialogC43239Gy3, InterfaceC67352kd<? super GXE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gxc;
        this.LJLJI = progressDialogC43239Gy3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GXE(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            GXC gxc = this.LJLILLLLZI;
            ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJLJI;
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new GXD(gxc, progressDialogC43239Gy3, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C41656GWm> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
