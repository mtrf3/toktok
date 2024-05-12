package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Axs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27940Axs extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ HashMap<String, Object> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ Integer LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ AddonOrder LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27940Axs(HashMap<String, Object> hashMap, String str, String str2, boolean z, String str3, Object obj, Integer num, boolean z2, String str4, AddonOrder addonOrder) {
        super(1);
        this.LJLIL = hashMap;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = str3;
        this.LJLJJLL = obj;
        this.LJLJL = num;
        this.LJLJLJ = z2;
        this.LJLJLLL = str4;
        this.LJLL = addonOrder;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        int i;
        PackedSku packedSku;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        C27943Axv.LIZ(sendLog, this.LJLIL);
        String str = this.LJLILLLLZI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZJ("is_success", str);
        String str3 = this.LJLJI;
        if (str3 != null) {
            str2 = str3;
        }
        sendLog.LIZJ("fail_reason", str2);
        sendLog.LIZJ("is_retry", Integer.valueOf(this.LJLJJI ? 1 : 0));
        sendLog.LIZJ("exception_ux", this.LJLJJL);
        sendLog.LIZJ("page_name", "order_submit");
        long j = C27949Ay1.LJII;
        if (j != -1) {
            sendLog.LIZIZ("api_duration", Long.valueOf(j));
        }
        Object obj = this.LJLJJLL;
        if ((obj instanceof Long) && !o.LJ(obj, -1L)) {
            sendLog.LIZLLL("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.LJLJJLL).longValue()));
        }
        Integer num = this.LJLJL;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        sendLog.LIZJ("is_delivery_info_complete", Integer.valueOf(i));
        if (C27949Ay1.LJIIIIZZ > 0) {
            i2 = 2;
        } else if (!this.LJLJLJ) {
            i2 = 1;
        }
        sendLog.LIZLLL("request_type", String.valueOf(i2));
        String str4 = this.LJLJLLL;
        if (str4 != null) {
            sendLog.LIZLLL("total_payment", str4);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = C27949Ay1.LIZIZ;
        Object obj2 = concurrentHashMap.get("product_id");
        if (obj2 != null) {
            sendLog.LIZLLL("product_id", obj2);
        }
        Object obj3 = concurrentHashMap.get("biz_type");
        if (obj3 != null) {
            sendLog.LIZLLL("biz_type", obj3);
        }
        AddonOrder addonOrder = this.LJLL;
        if (addonOrder != null) {
            boolean isAddonOrderSelected = addonOrder.isAddonOrderSelected();
            List<PackedSku> packedSkus = addonOrder.getPackedSkus();
            if (packedSkus != null && (packedSku = (PackedSku) ORZ.LJLLLL(packedSkus)) != null) {
                packedSku.getProductId();
            }
            if (isAddonOrderSelected) {
                sendLog.LIZLLL("add_on_source_page_type", "add_on_order_submit_rec");
                sendLog.LIZLLL("add_on_entrance_form", "append_goods_card");
            }
        }
        return C76800UCe.LIZ;
    }
}
