package X;

import android.os.SystemClock;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import java.util.LinkedHashMap;

/* renamed from: X.Ahz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26955Ahz extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ LogisticDTO LJLJI;
    public final /* synthetic */ TuxSheet LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26955Ahz(long j, String str, LogisticDTO logisticDTO, TuxSheet tuxSheet) {
        super(0);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = logisticDTO;
        this.LJLJJI = tuxSheet;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Float f;
        String priceVal;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLIL;
        String str = this.LJLILLLLZI;
        Price price = this.LJLJI.shippingFee;
        String str2 = null;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal);
        } else {
            f = null;
        }
        Price price2 = this.LJLJI.shippingFee;
        if (price2 != null) {
            str2 = price2.getCurrency();
        }
        Long valueOf = Long.valueOf(elapsedRealtime);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("actionsheet_name", "next_day_delivery");
        if (str != null) {
            linkedHashMap.put("enter_from_info", str);
        }
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str2 != null) {
            linkedHashMap.put("shipping_currency", str2);
        }
        if (valueOf != null) {
            linkedHashMap.put("stay_time", Integer.valueOf((int) valueOf.longValue()));
        }
        C76542zS.LIZ("tiktokec_stay_actionsheet", linkedHashMap);
        TuxSheet tuxSheet = this.LJLJJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        return C76800UCe.LIZ;
    }
}
