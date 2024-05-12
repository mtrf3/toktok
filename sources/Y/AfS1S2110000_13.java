package Y;

import X.InterfaceC64592gB;
import X.InterfaceC77498UbG;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.model.TaxInfoResult;
import com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxSchemaSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS1S2110000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS1S2110000_13 afS1S2110000_13, Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        TaxInfoResult.W9 w9 = ((TaxInfoResult) response.data).w9;
        if (w9 != null && w9.status == 4) {
            InterfaceC77498UbG interfaceC77498UbG = (InterfaceC77498UbG) afS1S2110000_13.l2;
            if (interfaceC77498UbG == null) {
                return;
            }
            interfaceC77498UbG.LIZ(true, true, null, null);
            return;
        }
        String taxUrlForClient = LiveExchangeTaxSchemaSetting.INSTANCE.getTaxUrlForClient();
        TaxDialogParams taxDialogParams = new TaxDialogParams();
        taxDialogParams.isAutoExchange = afS1S2110000_13.z3 ? 1 : 0;
        o.LJIIIZ(taxUrlForClient, "<set-?>");
        taxDialogParams.taxSchema = taxUrlForClient;
        String str = afS1S2110000_13.s0;
        o.LJIIIZ(str, "<set-?>");
        taxDialogParams.exchangeSource = str;
        String str2 = afS1S2110000_13.s1;
        o.LJIIIZ(str2, "<set-?>");
        taxDialogParams.exchangeWay = str2;
        InterfaceC77498UbG interfaceC77498UbG2 = (InterfaceC77498UbG) afS1S2110000_13.l2;
        if (interfaceC77498UbG2 == null) {
            return;
        }
        interfaceC77498UbG2.LIZ(true, false, taxDialogParams, null);
    }

    public static final void accept$1(AfS1S2110000_13 afS1S2110000_13, Object obj) {
        TaxInfoResult taxInfo = (TaxInfoResult) obj;
        o.LJIIIZ(taxInfo, "taxInfo");
        TaxInfoResult.W9 w9 = taxInfo.w9;
        if (w9 != null && w9.status == 4) {
            InterfaceC77498UbG interfaceC77498UbG = (InterfaceC77498UbG) afS1S2110000_13.l2;
            if (interfaceC77498UbG == null) {
                return;
            }
            interfaceC77498UbG.LIZ(true, true, null, null);
            return;
        }
        String taxUrlForClient = LiveExchangeTaxSchemaSetting.INSTANCE.getTaxUrlForClient();
        TaxDialogParams taxDialogParams = new TaxDialogParams();
        taxDialogParams.isAutoExchange = afS1S2110000_13.z3 ? 1 : 0;
        o.LJIIIZ(taxUrlForClient, "<set-?>");
        taxDialogParams.taxSchema = taxUrlForClient;
        String str = afS1S2110000_13.s0;
        o.LJIIIZ(str, "<set-?>");
        taxDialogParams.exchangeSource = str;
        String str2 = afS1S2110000_13.s1;
        o.LJIIIZ(str2, "<set-?>");
        taxDialogParams.exchangeWay = str2;
        InterfaceC77498UbG interfaceC77498UbG2 = (InterfaceC77498UbG) afS1S2110000_13.l2;
        if (interfaceC77498UbG2 == null) {
            return;
        }
        interfaceC77498UbG2.LIZ(true, false, taxDialogParams, null);
    }

    public AfS1S2110000_13(InterfaceC77498UbG interfaceC77498UbG, boolean z, String str, String str2, int i) {
        this.$t = i;
        this.l2 = interfaceC77498UbG;
        this.z3 = z;
        this.s0 = str;
        this.s1 = str2;
    }
}
