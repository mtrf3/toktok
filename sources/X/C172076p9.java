package X;

import android.content.Context;
import android.widget.Toast;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity$onPlayerCompileError$1", f = "NewCutPlayerActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6p9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172076p9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NewCutPlayerActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172076p9(NewCutPlayerActivity newCutPlayerActivity, InterfaceC67352kd<? super C172076p9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = newCutPlayerActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C172076p9(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Context applicationContext = this.LJLIL.getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        C16880lQ.LLZILL(Toast.makeText(applicationContext, "Compile Error", 0));
        ProgressDialogC173666ri progressDialogC173666ri = this.LJLIL.LLIIIILZ;
        if (progressDialogC173666ri != null) {
            progressDialogC173666ri.dismiss();
        }
        return C76800UCe.LIZ;
    }
}
