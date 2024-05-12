package X;

import com.ss.android.common.applog.AppLog;

/* renamed from: X.PzJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66249PzJ extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C66249PzJ LJLIL = new C66249PzJ();

    public C66249PzJ() {
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
