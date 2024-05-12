package X;

import kotlin.jvm.internal.o;

/* renamed from: X.B0v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28093B0v extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28093B0v(String str, String str2, String str3, String str4, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        String str = this.LJLIL;
        if (str != null) {
            sendLog.put("pay_type", str);
        }
        String str2 = this.LJLILLLLZI;
        if (str2 != null && str2.length() != 0) {
            sendLog.put("pay_bind_status", this.LJLILLLLZI);
        }
        sendLog.put("is_pay_saved", Integer.valueOf(this.LJLJI ? 1 : 0));
        String str3 = this.LJLJJI;
        if (str3 != null) {
            sendLog.put("total_payment", str3);
        }
        String str4 = this.LJLJJL;
        if (str4 != null) {
            sendLog.put("installment_cnt", str4);
        }
        return C76800UCe.LIZ;
    }
}
