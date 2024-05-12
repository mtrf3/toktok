package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog$onViewCreated$1", f = "RestrictDialog.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2k6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67022k6 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RestrictDialog LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67022k6(RestrictDialog restrictDialog, InterfaceC67352kd<? super C67022k6> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = restrictDialog;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.dismiss();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C67022k6(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
