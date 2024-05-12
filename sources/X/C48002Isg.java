package X;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.Isg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48002Isg implements InterfaceC64052PBw {
    @Override // X.InterfaceC64052PBw
    public final int LIZ(Context context) {
        int intValue;
        TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
        if (telephonyManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C48001Isf.LIZ.getAndSet(true)) {
                C48001Isf.LIZ().LIZIZ();
            }
            intValue = C48001Isf.LIZ().LIZ();
            if (!C48001Isf.LIZJ && intValue == -1) {
                return 0;
            }
        } else {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()I", "4992699687007197104");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(102013, "android/telephony/TelephonyManager", "getNetworkType", telephonyManager, objArr, "int", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", null, objArr, telephonyManager, c65300Pk0, false);
                intValue = ((Integer) LIZJ.LIZIZ).intValue();
            } else {
                int networkType = telephonyManager.getNetworkType();
                c03880Dg.LIZIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", Integer.valueOf(networkType), objArr, telephonyManager, c65300Pk0, true);
                return networkType;
            }
        }
        return intValue;
    }
}
