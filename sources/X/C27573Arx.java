package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Arx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27573Arx extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL = 1;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27573Arx(int i, long j, java.util.Map map) {
        super(1);
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("mall_request_type", Integer.valueOf(this.LJLIL));
        sendLog.LIZLLL("stage", Integer.valueOf(this.LJLILLLLZI));
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLJI));
        java.util.Map<String, String> map = this.LJLJJI;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sendLog.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        return C76800UCe.LIZ;
    }
}
