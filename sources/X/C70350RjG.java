package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RjG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70350RjG extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ java.util.Map<String, Object> LJLIL;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ C70354RjK LJLJLLL;
    public final /* synthetic */ Boolean LJLL;
    public final /* synthetic */ String LJLILLLLZI = "confirm";
    public final /* synthetic */ String LJLJL = "sku";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70350RjG(C70354RjK c70354RjK, Boolean bool, Integer num, String str, String str2, String str3, String str4, java.util.Map map) {
        super(1);
        this.LJLIL = map;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = num;
        this.LJLJJLL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = c70354RjK;
        this.LJLL = bool;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LJ(this.LJLIL);
        Object obj2 = this.LJLILLLLZI;
        if (obj2 != null) {
            sendLog.LIZLLL("button_name", obj2);
        }
        Object obj3 = this.LJLJI;
        if (obj3 != null) {
            sendLog.LIZLLL("source_button", obj3);
        }
        Object obj4 = this.LJLJJI;
        if (obj4 != null) {
            sendLog.LIZLLL("sku_id", obj4);
        }
        Integer num = this.LJLJJL;
        if (num != null) {
            num.intValue();
            sendLog.LIZLLL("is_single_sku", num);
        }
        Object obj5 = this.LJLJJLL;
        if (obj5 != null) {
            sendLog.LIZLLL("cart_form", obj5);
        }
        Object obj6 = this.LJLJL;
        if (obj6 != null) {
            sendLog.LIZLLL("page_name", obj6);
        }
        if (!this.LJLIL.containsKey("previous_page") && (obj = this.LJLJLJ) != null) {
            sendLog.LIZLLL("previous_page", obj);
        }
        Object obj7 = this.LJLJLJ;
        if (obj7 != null) {
            sendLog.LIZLLL("previous_page", obj7);
        }
        sendLog.LIZLLL("traceparent", PII.LIZIZ());
        C70354RjK c70354RjK = this.LJLJLLL;
        if (c70354RjK != null) {
            C70355RjL.LIZLLL(c70354RjK, sendLog);
        }
        Boolean bool = this.LJLL;
        if (bool != null) {
            bool.booleanValue();
            sendLog.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        return C76800UCe.LIZ;
    }
}
