package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$initExpandGroup$1", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238689Yi extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StoreFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238689Yi(StoreFragment storeFragment, InterfaceC67352kd<? super C238689Yi> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = storeFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.Al("words");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C238689Yi(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
