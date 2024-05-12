package X;

import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$updateProgress$1", f = "NLECutCompressActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171796oh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NLECutCompressActivity LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171796oh(NLECutCompressActivity nLECutCompressActivity, int i, InterfaceC67352kd<? super C171796oh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nLECutCompressActivity;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C171796oh(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ProgressDialogC173666ri progressDialogC173666ri = this.LJLIL.LJLJJI;
        if (progressDialogC173666ri != null) {
            progressDialogC173666ri.setProgress(this.LJLILLLLZI);
            return C76800UCe.LIZ;
        }
        o.LJIJI("progressDialog");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
