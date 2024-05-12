package X;

import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity$onPlayerCompileSuccess$1", f = "NewCutPlayerActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6pA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172086pA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NewCutPlayerActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172086pA(NewCutPlayerActivity newCutPlayerActivity, InterfaceC67352kd<? super C172086pA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = newCutPlayerActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C172086pA(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ProgressDialogC173666ri progressDialogC173666ri = this.LJLIL.LLIIIILZ;
        if (progressDialogC173666ri != null) {
            progressDialogC173666ri.dismiss();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
