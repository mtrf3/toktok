package X;

import com.ss.android.common.applog.AppLog;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.EHx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36181EHx implements QJ8 {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
    }

    @Override // X.QJ8
    public final void LIZ(boolean z) {
        if (z && this.LJLIL.compareAndSet(false, true)) {
            String serverDeviceId = AppLog.getServerDeviceId();
            String str = "";
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            String installId = AppLog.getInstallId();
            if (installId != null) {
                str = installId;
            }
            C67035QSp.LIZLLL(serverDeviceId, str);
        }
    }

    @Override // X.QJ8
    public final void LIZIZ(String str, String str2) {
        if (this.LJLIL.compareAndSet(false, true)) {
            String serverDeviceId = AppLog.getServerDeviceId();
            String str3 = "";
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            String installId = AppLog.getInstallId();
            if (installId != null) {
                str3 = installId;
            }
            C67035QSp.LIZLLL(serverDeviceId, str3);
        }
    }
}
