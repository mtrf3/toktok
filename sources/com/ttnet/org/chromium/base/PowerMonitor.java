package com.ttnet.org.chromium.base;

import J.N;
import X.C16880lQ;
import X.C36838Ed0;
import X.C48177IvV;
import X.C48178IvW;
import X.JBR;
import X.O6T;
import X.X1D;
import Y.IDBReceiverS5S0000000_8;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;

/* loaded from: classes9.dex */
public class PowerMonitor {
    public static PowerMonitor LIZIZ;
    public static final C48177IvV LIZJ;
    public static C48178IvW LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static boolean LJIIJJI;
    public boolean LIZ;

    static {
        C16880lQ.LJLLJ(PowerMonitor.class);
        LIZJ = new C48177IvV();
    }

    public static void LIZ() {
        if (LIZIZ != null) {
            return;
        }
        Context context = O6T.LIZ;
        LIZIZ = new PowerMonitor();
        Intent LIZ = O6T.LIZ(null, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (LIZ != null) {
            boolean z = false;
            if (LIZ.getIntExtra("plugged", 0) == 0) {
                z = true;
            }
            LIZIZ.LIZ = z;
            N.MxETr4iO();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        O6T.LIZ(new IDBReceiverS5S0000000_8(1), context, intentFilter);
        LJIIIIZZ = context.getPackageName();
        StringBuilder LIZ2 = X1D.LIZ();
        LJFF = JBR.LJFF(LIZ2, LJIIIIZZ, ".cronet.APP_BACKGROUND", LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LJ = JBR.LJFF(LIZ3, LJIIIIZZ, ".cronet.APP_FOREGROUND", LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LJII = JBR.LJFF(LIZ4, LJIIIIZZ, ".wschannel.APP_BACKGROUND", LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LJI = JBR.LJFF(LIZ5, LJIIIIZZ, ".wschannel.APP_FOREGROUND", LIZ5);
        if (C36838Ed0.LIZ(context) || LJIIJJI) {
            if (context instanceof Application) {
                C48177IvV c48177IvV = LIZJ;
                c48177IvV.LJLILLLLZI = LIZIZ;
                ((Application) context).registerActivityLifecycleCallbacks(c48177IvV);
                return;
            }
            return;
        }
        LIZLLL = new C48178IvW();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(LJFF);
        intentFilter2.addAction(LJ);
        intentFilter2.addAction(LJII);
        intentFilter2.addAction(LJI);
        C16880lQ.LJJLIIIJILLIZJL(LIZLLL, context, intentFilter2);
    }

    public static int getCurrentThermalStatus() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (LIZIZ == null) {
            LIZ();
        }
        PowerManager powerManager = (PowerManager) C16880lQ.LLILL(O6T.LIZ, "power");
        if (powerManager == null) {
            return -1;
        }
        return powerManager.getCurrentThermalStatus();
    }

    public static int getRemainingBatteryCapacity() {
        if (LIZIZ == null) {
            LIZ();
        }
        return ((BatteryManager) C16880lQ.LLILL(O6T.LIZ, "batterymanager")).getIntProperty(1);
    }

    public static boolean isBatteryPower() {
        if (LIZIZ == null) {
            LIZ();
        }
        return LIZIZ.LIZ;
    }
}
