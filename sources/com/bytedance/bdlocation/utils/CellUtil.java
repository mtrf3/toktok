package com.bytedance.bdlocation.utils;

import X.C16880lQ;
import X.C39405FdJ;
import X.C39571Ffz;
import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes7.dex */
public class CellUtil {
    public static String getNetworkOperator(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone")) == null) {
            return null;
        }
        C39405FdJ.LJFF.getClass();
        return C39571Ffz.LIZJ(telephonyManager);
    }

    public static String getSimOperator(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || (telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone")) == null || telephonyManager.getSimState() != 5) {
            return null;
        }
        C39405FdJ.LJFF.getClass();
        return C39571Ffz.LJI(telephonyManager);
    }
}
