package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AfZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26805AfZ {
    public static void LIZ(View view, OrderSubmitViewModel viewModel, C26804AfY item) {
        String str;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(item, "item");
        TextView total_seller_discount = (TextView) view.findViewById(R.id.lio);
        o.LJIIIIZZ(total_seller_discount, "total_seller_discount");
        ShopBill shopBill = item.LJ;
        if (shopBill != null) {
            str = shopBill.getTotalDiscount();
        } else {
            str = null;
        }
        OUP.LJJLIIIJILLIZJL(total_seller_discount, str);
        String str2 = item.LJFF;
        int i = 0;
        if (str2 == null || !C78685UuP.LJJJZ(str2)) {
            i = 8;
        }
        view.setVisibility(i);
        C16880lQ.LJIIJ(new Au2S10S0300000_4(viewModel, item, view, 0), view);
        C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), new AqS154S0100000_4(item, 171), new AqS135S0200000_4(item, viewModel, 29));
    }
}
