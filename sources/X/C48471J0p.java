package X;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.net.AndroidCellularSignalStrength;

/* renamed from: X.J0p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48471J0p extends PhoneStateListener implements InterfaceC48472J0q {
    public final /* synthetic */ AndroidCellularSignalStrength LIZ;

    public C48471J0p(AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.LIZ = androidCellularSignalStrength;
        TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(O6T.LIZ, "phone");
        if (telephonyManager.getSimState() != 5) {
            return;
        }
        ApplicationStatus.LIZIZ(this);
        int stateForApplication = ApplicationStatus.getStateForApplication();
        if (stateForApplication == 1) {
            telephonyManager.listen(this, 256);
        } else {
            if (stateForApplication != 2) {
                return;
            }
            androidCellularSignalStrength.LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
            telephonyManager.listen(this, 0);
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (ApplicationStatus.getStateForApplication() != 1) {
            return;
        }
        try {
            this.LIZ.LIZ = signalStrength.getLevel();
        } catch (SecurityException unused) {
            this.LIZ.LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
    }
}
