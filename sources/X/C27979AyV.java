package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AyV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27979AyV extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27979AyV(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = bool;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = z4;
        this.LJLJLLL = str3;
        this.LJLL = str4;
        this.LJLLI = str5;
        this.LJLLILLLL = str6;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.put("option_name", this.LJLIL);
        sendLog.put("is_option_discounted", Integer.valueOf(this.LJLILLLLZI ? 1 : 0));
        Boolean bool = this.LJLJI;
        if (bool != null) {
            sendLog.put("is_payment_promoted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        sendLog.put("rank", Integer.valueOf(this.LJLJJI));
        sendLog.put("option_type", this.LJLJJL);
        sendLog.put("is_default", V1M.LJJJJZ(this.LJLJJLL));
        sendLog.put("is_pay_saved", Integer.valueOf(this.LJLJL ? 1 : 0));
        sendLog.put("is_balance_shown", Integer.valueOf(this.LJLJLJ ? 1 : 0));
        String str = this.LJLJLLL;
        if (str != null) {
            sendLog.put("parent_option_name", str);
        }
        String str2 = this.LJLL;
        if (str2 != null && str2.length() != 0) {
            sendLog.put("option_unavailable_code", this.LJLL);
        }
        String str3 = this.LJLLI;
        if (str3 != null && str3.length() != 0) {
            sendLog.put("status_code", this.LJLLI);
        }
        String str4 = this.LJLLILLLL;
        if (str4 != null && str4.length() > 0) {
            sendLog.put("pay_bind_status", this.LJLLILLLL);
        }
        return C76800UCe.LIZ;
    }
}
