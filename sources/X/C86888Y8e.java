package X;

import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;

/* renamed from: X.Y8e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86888Y8e extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C86888Y8e LJLIL = new C86888Y8e();

    public C86888Y8e() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (WsMonitorConfigExp.LJFF() && WsMonitorConfigExp.LIZJ().onlineRateBackgroundLoopEnabled) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
