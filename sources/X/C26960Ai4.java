package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Ai4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26960Ai4 extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL = "shipping";
    public final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ Integer LJLJLJ;
    public final /* synthetic */ Float LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26960Ai4(long j, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, Float f, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = z2;
        this.LJLJJLL = packedDeliverySelectResult;
        this.LJLJL = z3;
        this.LJLJLJ = num;
        this.LJLJLLL = f;
        this.LJLL = str2;
        this.LJLLI = str3;
        this.LJLLILLLL = str4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Integer num;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LJ(C26937Ahh.LIZ);
        sendLog.LIZLLL("stay_time", Long.valueOf(this.LJLIL));
        sendLog.LIZJ("is_fullscreen", 0);
        sendLog.LIZJ("is_delivery_info_complete", Integer.valueOf(this.LJLILLLLZI ? 1 : 0));
        sendLog.LIZJ("quit_type", this.LJLJI);
        if (this.LJLILLLLZI) {
            sendLog.LIZJ("is_address_deliverable", Integer.valueOf(this.LJLJJI ? 1 : 0));
        }
        String str = this.LJLJJL;
        if (str != null) {
            sendLog.LIZJ("sub_page_name", str);
        }
        String LIZ = C26937Ahh.LIZ(this.LJLJJLL.logistics);
        if (LIZ != null) {
            sendLog.LIZJ("delivery_info", LIZ);
        }
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.LJLJJLL;
        String LIZIZ = C26937Ahh.LIZIZ(packedDeliverySelectResult.selectedLogistic, packedDeliverySelectResult.logistics);
        if (LIZIZ != null) {
            sendLog.LIZJ("ship_from", LIZIZ);
        }
        sendLog.LIZJ("is_load_data", Integer.valueOf(this.LJLJL ? 1 : 0));
        LogisticDTO logisticDTO = this.LJLJJLL.selectedLogistic;
        if ((logisticDTO != null && (num = logisticDTO.deliveryOption) != null) || (num = this.LJLJLJ) != null) {
            sendLog.LIZJ("delivery_option", num);
        }
        Float f = this.LJLJLLL;
        if (f != null) {
            sendLog.LIZJ("shipping_price", f);
        }
        String str2 = this.LJLL;
        if (str2 != null) {
            sendLog.LIZJ("shipping_currency", str2);
        }
        String str3 = this.LJLLI;
        if (str3 != null) {
            sendLog.LIZJ("free_shipping_condition", str3);
        }
        String str4 = this.LJLLILLLL;
        if (str4 == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZJ("is_next_day_delivery", str4);
        return C76800UCe.LIZ;
    }
}
