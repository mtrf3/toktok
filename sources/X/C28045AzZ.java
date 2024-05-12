package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AzZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28045AzZ extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "/api/v1/shop/bill_info/get";
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ HashMap<String, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28045AzZ(int i, HashMap hashMap, boolean z) {
        super(1);
        this.LJLIL = i;
        this.LJLJI = z;
        this.LJLJJI = hashMap;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String str;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("page_name", "order_submit");
        sendLog.LIZJ("is_check_passed", Integer.valueOf(this.LJLIL));
        sendLog.LIZIZ("api_path", this.LJLILLLLZI);
        if (this.LJLJI) {
            str = "yes";
        } else {
            str = "no";
        }
        sendLog.LIZJ("is_retry", str);
        HashMap<String, Object> hashMap = this.LJLJJI;
        if (hashMap != null) {
            sendLog.LIZIZ("anchor_show_type", hashMap.get("anchor_show_type"));
            sendLog.LIZIZ("author_id", this.LJLJJI.get("author_id"));
            sendLog.LIZIZ("enter_from_info", this.LJLJJI.get("enter_from_info"));
            sendLog.LIZIZ("entrance_form", this.LJLJJI.get("entrance_form"));
            sendLog.LIZIZ("entrance_info", this.LJLJJI.get("entrance_info"));
            sendLog.LIZIZ("follow_status", this.LJLJJI.get("follow_status"));
            sendLog.LIZIZ("product_id", this.LJLJJI.get("product_id"));
            sendLog.LIZIZ("product_source", this.LJLJJI.get("product_source"));
            sendLog.LIZIZ("source", this.LJLJJI.get("source"));
            sendLog.LIZIZ("source_from", this.LJLJJI.get("source_from"));
            sendLog.LIZIZ("source_page_type", this.LJLJJI.get("source_page_type"));
        }
        return C76800UCe.LIZ;
    }
}
