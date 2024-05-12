package X;

import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.text.TextUtils;

/* renamed from: X.Is7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47967Is7 extends PhoneStateListener {
    public final /* synthetic */ C47966Is6 LIZ;

    public C47967Is7(C47966Is6 c47966Is6) {
        this.LIZ = c47966Is6;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        super.onServiceStateChanged(serviceState);
        try {
            C47966Is6 c47966Is6 = this.LIZ;
            String serviceState2 = serviceState.toString();
            if (serviceState2 == null) {
                c47966Is6.getClass();
                return;
            }
            synchronized (c47966Is6.LJIIL) {
                c47966Is6.LJII = false;
                if (!TextUtils.isEmpty(serviceState2) && (serviceState2.contains("nrState=NOT_RESTRICTED") || serviceState2.contains("nrState=CONNECTED"))) {
                    c47966Is6.LJII = true;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        synchronized (this.LIZ.LJIIIZ) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    this.LIZ.LJ = signalStrength.getLevel();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        super.onDataConnectionStateChanged(i, i2);
        synchronized (this.LIZ.LJIIIIZZ) {
            try {
                C47966Is6 c47966Is6 = this.LIZ;
                c47966Is6.LIZ = i2;
                c47966Is6.LIZJ = C47966Is6.LIZ(i2);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
