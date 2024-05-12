package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1L extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1L(Boolean bool, String str, String str2, String str3, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = bool;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        String str;
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        String str2 = this.LJLIL;
        if (str2 != null) {
            sendLog.put("option_name", str2);
        }
        sendLog.put("is_valid", Integer.valueOf(this.LJLILLLLZI ? 1 : 0));
        String str3 = this.LJLJI;
        if (str3 != null) {
            sendLog.put("input_name", str3);
        }
        String str4 = this.LJLJJI;
        if (str4 == null) {
            str4 = "";
        }
        sendLog.put("input_method", str4);
        Boolean bool = this.LJLJJL;
        if (bool != null) {
            str = V1M.LJJJJZ(bool.booleanValue());
        } else {
            str = "-1";
        }
        sendLog.put("if_same_with_last_auto_result", str);
        return C76800UCe.LIZ;
    }
}
