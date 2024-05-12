package X;

import android.view.View;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$initCartView$3", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M4Z extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ HashMap<String, Object> LJLILLLLZI;
    public final /* synthetic */ StoreFragment LJLJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4Z(HashMap<String, Object> hashMap, StoreFragment storeFragment, java.util.Map<String, Object> map, InterfaceC67352kd<? super M4Z> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = hashMap;
        this.LJLJI = storeFragment;
        this.LJLJJI = map;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        this.LJLILLLLZI.put("start_click_time", new Long(System.currentTimeMillis()));
        C70172RgO.LIZLLL(view.getContext(), this.LJLILLLLZI, null, null, "shop", this.LJLJI.LJLLLLLL, false);
        b.LJJIJIIJI("tiktokec_cart_entrance_click", this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        M4Z m4z = new M4Z(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        m4z.LJLIL = view;
        return m4z.invokeSuspend(C76800UCe.LIZ);
    }
}
