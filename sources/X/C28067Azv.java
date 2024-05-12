package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Azv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28067Azv extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ long LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28067Azv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = str7;
        this.LJLJLJ = str8;
        this.LJLJLLL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZLLL("request_name", this.LJLIL);
        sendLog.LIZLLL("page_name", "payment_method");
        String str = this.LJLILLLLZI;
        if (str != null) {
            sendLog.LIZLLL("previous_page", str);
        }
        String str2 = this.LJLJI;
        if (str2 != null) {
            sendLog.LIZLLL("order_id", str2);
        }
        String str3 = this.LJLJJI;
        if (str3 != null) {
            sendLog.LIZLLL("pay_type", str3);
        }
        String str4 = this.LJLJJL;
        if (str4 != null) {
            sendLog.LIZLLL("pay_result", str4);
        }
        String str5 = this.LJLJJLL;
        if (str5 != null) {
            sendLog.LIZLLL("pay_error_code", str5);
        }
        String str6 = this.LJLJL;
        if (str6 != null) {
            sendLog.LIZLLL("redirect_url", str6);
        }
        String str7 = this.LJLJLJ;
        if (str7 != null) {
            sendLog.LIZLLL("fail_reason", str7);
        }
        sendLog.LIZLLL("api_duration", Long.valueOf(this.LJLJLLL));
        return C76800UCe.LIZ;
    }
}
