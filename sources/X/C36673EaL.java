package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EaL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36673EaL extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C64799Pbv LJLJJLL;
    public final /* synthetic */ C64668PZo LJLJL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36673EaL(int i, String str, String str2, String str3, String str4, C64799Pbv c64799Pbv, C64668PZo c64668PZo, java.util.Map<String, ? extends Object> map) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = c64799Pbv;
        this.LJLJL = c64668PZo;
        this.LJLJLJ = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C78880UxY.LJIJI(sendLog);
        sendLog.LIZLLL("error_code", Integer.valueOf(this.LJLIL));
        sendLog.LIZLLL("error_msg", this.LJLILLLLZI);
        String str = this.LJLJI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("path", str);
        sendLog.LIZLLL("page_name", this.LJLJJI);
        String str3 = this.LJLJJL;
        if (str3 == null) {
            str3 = "";
        }
        sendLog.LIZLLL("host", str3);
        String str4 = this.LJLJJLL.traceCode;
        if (str4 != null) {
            str2 = str4;
        }
        sendLog.LIZLLL("log_id", str2);
        C64668PZo c64668PZo = this.LJLJL;
        if (c64668PZo instanceof C64672PZs) {
            sendLog.LIZLLL("duration", Long.valueOf(c64668PZo.LJIILLIIL));
            sendLog.LIZLLL("is_socket_reused", Integer.valueOf(this.LJLJL.LJIILJJIL ? 1 : 0));
        }
        java.util.Map<String, Object> map = this.LJLJLJ;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                sendLog.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        return C76800UCe.LIZ;
    }
}
