package X;

import kotlin.jvm.internal.o;

/* renamed from: X.B0t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28091B0t extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28091B0t(String str, String str2, String str3, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.put("button_name", this.LJLIL);
        sendLog.put("button_type", "confirm");
        String str = this.LJLILLLLZI;
        if (str != null) {
            sendLog.put("payment_option", str);
        }
        sendLog.put("is_option_discounted", Integer.valueOf(this.LJLJI ? 1 : 0));
        String str2 = this.LJLJJI;
        if (str2 != null && str2.length() > 0) {
            sendLog.put("pay_bind_status", this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
