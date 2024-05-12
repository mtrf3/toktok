package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EaK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36672EaK extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C64797Pbt<?> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36672EaK(int i, String str, C64797Pbt<?> c64797Pbt, String str2, Object obj, java.util.Map<String, ? extends Object> map) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = c64797Pbt;
        this.LJLJJI = str2;
        this.LJLJJL = obj;
        this.LJLJJLL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C78880UxY.LJIJI(sendLog);
        sendLog.LIZLLL("error_code", Integer.valueOf(this.LJLIL));
        sendLog.LIZLLL("error_msg", this.LJLILLLLZI);
        String path = new java.net.URL(this.LJLJI.LIZ.LIZ).getPath();
        o.LJIIIIZZ(path, "URL(response.raw().url).path");
        sendLog.LIZLLL("path", path);
        sendLog.LIZLLL("page_name", this.LJLJJI);
        String host = new java.net.URL(this.LJLJI.LIZ.LIZ).getHost();
        o.LJIIIIZZ(host, "URL(response.raw().url).host");
        sendLog.LIZLLL("host", host);
        sendLog.LIZLLL("log_id", C36669EaH.LIZIZ(this.LJLJI));
        Object obj = this.LJLJJL;
        if (obj instanceof C64672PZs) {
            sendLog.LIZLLL("duration", Long.valueOf(((C64668PZo) obj).LJIILLIIL));
            sendLog.LIZLLL("is_socket_reused", Integer.valueOf(((C64668PZo) this.LJLJJL).LJIILJJIL ? 1 : 0));
        }
        java.util.Map<String, Object> map = this.LJLJJLL;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                sendLog.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        return C76800UCe.LIZ;
    }
}
