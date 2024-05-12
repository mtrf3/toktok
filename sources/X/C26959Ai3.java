package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ai3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26959Ai3 extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ DeliveryPanelState LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "shipping";
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26959Ai3(DeliveryPanelState deliveryPanelState, Integer num, String str, boolean z) {
        super(1);
        this.LJLIL = deliveryPanelState;
        this.LJLJI = z;
        this.LJLJJI = num;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Integer num;
        LogisticTextDTO logisticTextDTO;
        String str;
        Price price;
        String currency;
        Price price2;
        String priceVal;
        Float LJJIJLIJ;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        List<Object> logisticList = this.LJLIL.getLogisticList();
        int i = 1;
        int i2 = 0;
        if (logisticList != null && !logisticList.isEmpty()) {
            Iterator<Object> it = logisticList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof LogisticDTO) {
                    java.util.Map<String, String> map = ((LogisticDTO) next).eventTrackInfo;
                    if (map != null) {
                        C26937Ahh.LIZ.putAll(map);
                    }
                }
            }
        }
        sendLog.LJ(C26937Ahh.LIZ);
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            sendLog.LIZJ("sub_page_name", str2);
        }
        String LIZ = C26937Ahh.LIZ(this.LJLIL.getLogistics());
        if (LIZ != null) {
            sendLog.LIZJ("delivery_info", LIZ);
        }
        String LIZIZ = C26937Ahh.LIZIZ(this.LJLIL.getSelectedLogistic(), this.LJLIL.getLogistics());
        if (LIZIZ != null) {
            sendLog.LIZJ("ship_from", LIZIZ);
        }
        sendLog.LIZJ("is_fullscreen", 0);
        sendLog.LIZJ("is_delivery_info_complete", Integer.valueOf(this.LJLJI ? 1 : 0));
        if (this.LJLJI) {
            if (this.LJLIL.getSelectedLogistic() == null) {
                i = 0;
            }
            sendLog.LIZJ("is_address_deliverable", Integer.valueOf(i));
        }
        LogisticDTO selectedLogistic = this.LJLIL.getSelectedLogistic();
        if (selectedLogistic != null && (price2 = selectedLogistic.shippingFee) != null && (priceVal = price2.getPriceVal()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(priceVal)) != null) {
            sendLog.LIZJ("shipping_price", Float.valueOf(LJJIJLIJ.floatValue()));
        }
        LogisticDTO selectedLogistic2 = this.LJLIL.getSelectedLogistic();
        if (selectedLogistic2 != null && (price = selectedLogistic2.shippingFee) != null && (currency = price.getCurrency()) != null) {
            sendLog.LIZJ("shipping_currency", currency);
        }
        LogisticDTO selectedLogistic3 = this.LJLIL.getSelectedLogistic();
        if (selectedLogistic3 != null && (logisticTextDTO = selectedLogistic3.logisticText) != null && (str = logisticTextDTO.thresholdTextEn) != null) {
            sendLog.LIZJ("free_shipping_condition", str);
        }
        LogisticDTO selectedLogistic4 = this.LJLIL.getSelectedLogistic();
        if (selectedLogistic4 != null && (num = selectedLogistic4.deliveryOption) != null) {
            i2 = num.intValue();
        }
        sendLog.LIZJ("delivery_option", Integer.valueOf(i2));
        Integer num2 = this.LJLJJI;
        if (num2 != null) {
            sendLog.LIZJ("preorder_shipdays", Integer.valueOf(num2.intValue()));
        }
        String str3 = this.LJLJJL;
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_next_day_delivery", str3);
        return C76800UCe.LIZ;
    }
}
