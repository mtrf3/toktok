package Y;

import X.C71271Ry7;
import X.C71302Ryc;
import X.DialogC71377Rzp;
import X.InterfaceC65784Pro;
import X.S5F;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.powerlist.ProductListCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.viewmodel.ProductListViewModel;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACListenerS30S1200000_12 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS30S1200000_12 aCListenerS30S1200000_12, View view) {
        Map LIZ;
        ProductListViewModel productListViewModel = (ProductListViewModel) ((ProductListCell) aCListenerS30S1200000_12.l1).LJLILLLLZI.getValue();
        C71271Ry7 item = (C71271Ry7) aCListenerS30S1200000_12.l2;
        String resizeUrl = aCListenerS30S1200000_12.s0;
        RootData rootData = (RootData) ((ProductListCell) aCListenerS30S1200000_12.l1).LJLJI.getValue();
        o.LJIIIZ(item, "item");
        o.LJIIIZ(resizeUrl, "resizeUrl");
        o.LJIIIZ(rootData, "rootData");
        String roomId = rootData.roomId;
        String authorId = rootData.authorId;
        boolean z = rootData.isNewUser;
        String L = rootData.L();
        String productId = item.LJLIL;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(productId, "productId");
        LIZ = S5F.LIZ(roomId, authorId, null, L, "template_product_list", z);
        LIZ.put("module_name", "template_product");
        LIZ.put("product_id", productId);
        b.LJJIJIIJI("livesdk_tiktokec_module_click", LIZ);
        AqS178S0100000_12 aqS178S0100000_12 = productListViewModel.LJLILLLLZI;
        if (aqS178S0100000_12 != null) {
            aqS178S0100000_12.invoke(new C71302Ryc(item.LJLIL, item.LJLILLLLZI, item.LJLJI, resizeUrl, item.LJLL));
        }
    }

    public static final void onClick$1(ACListenerS30S1200000_12 aCListenerS30S1200000_12, View view) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aCListenerS30S1200000_12.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        SmartRouter.buildRoute(((DialogC71377Rzp) aCListenerS30S1200000_12.l2).getContext(), aCListenerS30S1200000_12.s0).open();
    }

    public ACListenerS30S1200000_12(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
