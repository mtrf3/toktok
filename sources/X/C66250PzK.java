package X;

import com.ss.android.common.applog.AppLog;

/* renamed from: X.PzK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66250PzK extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C66250PzK LJLIL = new C66250PzK();

    public C66250PzK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            return "";
        }
        return serverDeviceId;
    }
}
