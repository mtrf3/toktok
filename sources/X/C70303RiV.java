package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.model.PdpV2EnterParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RiV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70303RiV extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ PdpV2EnterParams LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C70300RiS LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70303RiV(PdpV2EnterParams pdpV2EnterParams, long j, boolean z, String str, String str2, C70300RiS c70300RiS) {
        super(1);
        this.LJLIL = pdpV2EnterParams;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = c70300RiS;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        int i;
        long j;
        boolean z;
        Object obj;
        String str;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        PdpV2EnterParams pdpV2EnterParams = this.LJLIL;
        if (pdpV2EnterParams != null) {
            i = pdpV2EnterParams.getPdpPageType();
        } else {
            i = 1;
        }
        sendLog.LIZJ("product_type", Integer.valueOf(i));
        sendLog.LIZJ("is_v2", "1");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        PdpV2EnterParams pdpV2EnterParams2 = this.LJLIL;
        if (pdpV2EnterParams2 != null) {
            j = pdpV2EnterParams2.getEnterTimeStamp();
        } else {
            j = -1;
        }
        sendLog.LIZJ("start_click_to_now", Long.valueOf(elapsedRealtime - j));
        sendLog.LIZJ("api_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.LJLILLLLZI));
        sendLog.LIZJ("is_retry", Integer.valueOf(this.LJLJI ? 1 : 0));
        String str2 = this.LJLJJI;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (str = this.LJLJJL) == null || str.length() == 0) {
            sendLog.LIZJ("is_success", 1);
        } else {
            sendLog.LIZJ("error_code", this.LJLJJL);
            sendLog.LIZJ("error_message", this.LJLJJI);
            sendLog.LIZJ("is_success", 0);
        }
        java.util.Map<String, ? extends Object> map = this.LJLJJLL.LJLJJI;
        if (map == null || (obj = map.get("source_page_type")) == null) {
            obj = "";
        }
        sendLog.LIZJ("source_page_type", obj);
        Object value = this.LJLJJLL.LJLJJL.getValue();
        if (value == null) {
            value = "{}";
        }
        sendLog.LIZJ("entrance_info", value);
        return C76800UCe.LIZ;
    }
}
