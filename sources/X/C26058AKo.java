package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$updateButtons$1$1", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AKo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26058AKo extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ StoreFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26058AKo(StoreFragment storeFragment, String str, InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = storeFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Context context = ((View) this.LJLIL).getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("&in_window=chat_im");
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ)).open();
        this.LJLJI.LJLJI.put("click_area", "chat");
        C76542zS.LIZ("tiktokec_module_click", this.LJLJI.LJLJI);
        OSZ[] oszArr = {new OSZ("seller_id", this.LJLJI.LJLLILLLL)};
        HashMap hashMap = new HashMap();
        OSZ osz = oszArr[0];
        Object second = osz.getSecond();
        if (second != null) {
            hashMap.put(osz.getFirst(), second);
        }
        EventCenter.LJ().LIZ("ec_clear_unread_msg", C27739Aud.LJI(hashMap));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        String str = this.LJLILLLLZI;
        C26058AKo c26058AKo = new C26058AKo(this.LJLJI, str, interfaceC67352kd);
        c26058AKo.LJLIL = view;
        return c26058AKo.invokeSuspend(C76800UCe.LIZ);
    }
}
