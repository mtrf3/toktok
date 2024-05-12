package X;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* renamed from: X.IrA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47908IrA extends PhoneStateListener {
    public final TelephonyManager LIZ;
    public final WeakReference<C47906Ir8> LIZIZ;

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        C47906Ir8 c47906Ir8;
        int i;
        super.onSignalStrengthsChanged(signalStrength);
        if (signalStrength == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        WeakReference<C47906Ir8> weakReference = this.LIZIZ;
        if (weakReference != null) {
            c47906Ir8 = weakReference.get();
            if (c47906Ir8 != null && c47906Ir8.LIZ == 0) {
                return;
            }
        } else {
            c47906Ir8 = null;
        }
        try {
            i = signalStrength.getLevel();
            if (i == 0) {
                i = 1;
            }
        } catch (Exception unused) {
            C78253UnR.LIZLLL("TTNetWorkListener", "failed to get signalStrength");
            i = -1;
        }
        if (c47906Ir8 == null) {
            return;
        }
        c47906Ir8.LIZ(i);
    }

    public C47908IrA(Context context, C47906Ir8 c47906Ir8) {
        this.LIZIZ = new WeakReference<>(c47906Ir8);
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
            if (telephonyManager == null) {
                return;
            }
            this.LIZ = telephonyManager;
        } catch (Exception unused) {
            C78253UnR.LIZLLL("TTNetWorkListener", "create telephonyManager failed");
            this.LIZ = null;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        WeakReference<C47906Ir8> weakReference;
        C47906Ir8 c47906Ir8;
        super.onDataConnectionStateChanged(i, i2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data connection state changed, state: ");
        LIZ.append(i);
        LIZ.append(", networkType: ");
        LIZ.append(i2);
        TTVideoEngineLog.d("TTNetWorkListener", X1D.LIZIZ(LIZ));
        if (i == 2 && (weakReference = this.LIZIZ) != null && (c47906Ir8 = weakReference.get()) != null && c47906Ir8.LIZ != 0) {
            c47906Ir8.LJIIIIZZ(C47906Ir8.LIZJ(i2));
        }
    }

    public final void LIZ(Context context, C47908IrA c47908IrA, int i) {
        TelephonyManager telephonyManager = this.LIZ;
        if (telephonyManager == null || context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (context.checkSelfPermission(new String(Base64.decode("YW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEUK", 0))) != 0) {
                return;
            }
            this.LIZ.listen(c47908IrA, i);
            return;
        }
        telephonyManager.listen(c47908IrA, i);
    }
}
