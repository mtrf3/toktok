package X;

import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import java.util.TimerTask;

/* renamed from: X.Onc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62976Onc extends TimerTask {
    public final /* synthetic */ PNSDeviceConsentServiceImpl LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZLLL(false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public C62976Onc(PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl) {
        this.LJLIL = pNSDeviceConsentServiceImpl;
    }
}
