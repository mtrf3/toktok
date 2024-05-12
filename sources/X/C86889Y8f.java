package X;

import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;

/* renamed from: X.Y8f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86889Y8f extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C86889Y8f LJLIL = new C86889Y8f();

    public C86889Y8f() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (WsMonitorConfigExp.LJFF() && WsMonitorConfigExp.LIZJ().onlineRateForegroundLoopEnabled) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
