package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.AyW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27980AyW extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI = "payment_type";
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ Boolean LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27980AyW(String str, boolean z, int i, String str2, boolean z2, boolean z3, String str3, String str4, String str5, Boolean bool) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = str3;
        this.LJLJLLL = str4;
        this.LJLL = str5;
        this.LJLLI = bool;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        String str;
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.put("option_name", this.LJLIL);
        sendLog.put("is_option_discounted", Integer.valueOf(this.LJLILLLLZI ? 1 : 0));
        sendLog.put("rank", Integer.valueOf(this.LJLJI));
        sendLog.put("option_type", this.LJLJJI);
        if (o.LJ(this.LJLJJL, this.LJLIL)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.put("is_default", str);
        sendLog.put("is_pay_saved", Integer.valueOf(this.LJLJJLL ? 1 : 0));
        sendLog.put("is_balance_shown", Integer.valueOf(this.LJLJL ? 1 : 0));
        String str2 = this.LJLJLJ;
        if (str2 != null && str2.length() != 0) {
            sendLog.put("option_unavailable_code", this.LJLJLJ);
        }
        String str3 = this.LJLJLLL;
        if (str3 != null && str3.length() > 0) {
            sendLog.put("pay_bind_status", this.LJLJLLL);
        }
        String str4 = this.LJLL;
        if (str4 != null && str4.length() != 0) {
            sendLog.put("status_code", this.LJLL);
        }
        Boolean bool = this.LJLLI;
        if (bool != null) {
            sendLog.put("is_payment_promoted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        return C76800UCe.LIZ;
    }
}
