package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftFileRestoreHandlers$restore$2$setProgress$2", f = "IDraftFileRestoreHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165086ds extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C6ZN LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165086ds(C76732zl c76732zl, int i, C6ZN c6zn, InterfaceC67352kd<? super C165086ds> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = i;
        this.LJLJI = c6zn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165086ds(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C76732zl c76732zl = this.LJLIL;
        int i = c76732zl.element + this.LJLILLLLZI;
        c76732zl.element = i;
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = (ProgressDialogC43239Gy3) this.LJLJI.LIZ.LIZIZ;
        if (progressDialogC43239Gy3 != null) {
            progressDialogC43239Gy3.setProgress(i);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
