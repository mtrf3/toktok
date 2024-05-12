package com.benchmark.bytemonitor;

import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes.dex */
public class BatteryMonitor {
    public Context mContext;
    public int temperature = -1;
    public double batteryLevel = -1.0d;

    private void getBattery() {
        try {
            Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, this.mContext, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (LJJLIIIJILLIZJL != null) {
                int intExtra = LJJLIIIJILLIZJL.getIntExtra("level", -1);
                int intExtra2 = LJJLIIIJILLIZJL.getIntExtra("scale", -1);
                if (intExtra != -1 && intExtra2 != -1) {
                    if (intExtra2 != 0) {
                        this.batteryLevel = (intExtra / intExtra2) * 100.0d;
                    } else {
                        this.batteryLevel = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                }
                this.temperature = LJJLIIIJILLIZJL.getIntExtra("temperature", -1);
            }
        } catch (Exception unused) {
        }
    }

    public double getElectricCurrent() {
        long j;
        try {
            j = ((BatteryManager) C16880lQ.LLILL(this.mContext, "batterymanager")).getLongProperty(2);
        } catch (Exception unused) {
            j = -1;
        }
        return j;
    }

    public double getBatteryLevel() {
        getBattery();
        return this.batteryLevel;
    }

    public double getTemperature() {
        getBattery();
        return this.temperature / 10.0d;
    }

    public BatteryMonitor(Context context) {
        this.mContext = context;
    }
}
