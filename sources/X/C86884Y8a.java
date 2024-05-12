package X;

import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import java.util.List;

/* renamed from: X.Y8a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86884Y8a extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends Integer>> {
    public static final C86884Y8a LJLIL = new C86884Y8a();

    public C86884Y8a() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends Integer> invoke() {
        if (WsMonitorConfigExp.LIZJ().onlineRateSceneEnabled) {
            return WsMonitorConfigExp.LIZJ().onlineRateSceneWhiteList;
        }
        return null;
    }
}
