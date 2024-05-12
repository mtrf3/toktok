package X;

import android.content.Context;
import fjb.a;
import kotlin.jvm.internal.AqS157S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1$progressDialog$1", f = "QuickForwardResolver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GMJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ProgressDialogC43239Gy3>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMJ(Context context, InterfaceC67352kd<? super GMJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GMJ gmj = new GMJ(this.LJLILLLLZI, interfaceC67352kd);
        gmj.LJLIL = obj;
        return gmj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C169656lF.LIZ(this.LJLILLLLZI, new AqS157S0100000_7((InterfaceC70422pa) this.LJLIL, 727), true);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ProgressDialogC43239Gy3> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
