package X;

import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;

/* renamed from: X.Y8d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86887Y8d extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C86887Y8d LJLIL = new C86887Y8d();

    public C86887Y8d() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) WsMonitorConfigExp.LIZJ.getValue()).booleanValue() && WsMonitorConfigExp.LIZJ().onlineRateEnabled) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
