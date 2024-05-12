package X;

import android.os.Build;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.Isd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47999Isd extends PhoneStateListener {
    public final /* synthetic */ C47950Irq LIZ;

    @Override // android.telephony.PhoneStateListener
    public final void onCellLocationChanged(CellLocation cellLocation) {
        new C03880Dg(2).LIZJ(100911, "com/ss/android/ugc/aweme/video/PhoneSignalManager$1", "onCellLocationChanged", this, new Object[]{cellLocation}, "void", new C65300Pk0(false, "(Landroid/telephony/CellLocation;)V", "584735072504542194"));
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
    }

    public C47999Isd(C47950Irq c47950Irq) {
        this.LIZ = c47950Irq;
    }

    public static int LIZ(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C48001Isf.LIZ.getAndSet(true)) {
                C48001Isf.LIZ().LIZIZ();
            }
            int LIZ = C48001Isf.LIZ().LIZ();
            if (!C48001Isf.LIZJ && LIZ == -1) {
                return 0;
            }
            return LIZ;
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "584735072504542194");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
            return ((Integer) LIZJ.LIZIZ).intValue();
        }
        int networkType = telephonyManager.getNetworkType();
        c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
        return networkType;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        try {
            int parseInt = CastIntegerProtector.parseInt(signalStrength.toString().split(" ")[9]);
            int gsmSignalStrength = (signalStrength.getGsmSignalStrength() * 2) - 113;
            if (LIZ(this.LIZ.LIZIZ) == 13) {
                this.LIZ.LIZ = parseInt;
            } else {
                this.LIZ.LIZ = gsmSignalStrength;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
