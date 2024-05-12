package X;

import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L28 extends AbstractC65781Prl implements InterfaceC65784Pro<WsMonitorConfigExp.MetaData> {
    public static final L28 LJLIL = new L28();

    public L28() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final WsMonitorConfigExp.MetaData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        WsMonitorConfigExp.MetaData metaData = WsMonitorConfigExp.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ws_monitor_config", 31744, WsMonitorConfigExp.MetaData.class, metaData);
        if (LJIJ != 0) {
            metaData = LJIJ;
        }
        o.LJIIIIZZ(metaData, "ABManager.getInstance().…p::class.java) ?: DEFAULT");
        return metaData;
    }
}
