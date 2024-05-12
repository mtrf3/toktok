package com.bytedance.realx.base;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class RXPowerMonitorAndroid {
    public static String TAG = "RXPowerMonitorAndroid";
    public static Intent batteryStatus;
    public static IntentFilter ifilter;
    public static PowerManager powerManager;
    public static Context context = ContextUtils.getApplicationContext();
    public static float batteryVolt = -1.0f;
    public static BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.bytedance.realx.base.RXPowerMonitorAndroid.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            com_bytedance_realx_base_RXPowerMonitorAndroid$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context2, intent);
        }

        public void com_bytedance_realx_base_RXPowerMonitorAndroid$1__onReceive$___twin___(Context context2, Intent intent) {
            if (RXPowerMonitorAndroid.batteryStatus == null) {
                RXPowerMonitorAndroid.batteryStatus = new Intent();
            }
            RXPowerMonitorAndroid.charge_status = intent.getIntExtra("status", -1);
            RXPowerMonitorAndroid.battery_temperature = RXPowerMonitorAndroid.batteryStatus.getIntExtra("temperature", -1);
        }

        public static void com_bytedance_realx_base_RXPowerMonitorAndroid$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AnonymousClass1 anonymousClass1, Context context2, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                anonymousClass1.com_bytedance_realx_base_RXPowerMonitorAndroid$1__onReceive$___twin___(context2, intent);
            } else {
                C38523F9z.LIZ();
                anonymousClass1.com_bytedance_realx_base_RXPowerMonitorAndroid$1__onReceive$___twin___(context2, intent);
            }
        }

        public static void com_bytedance_realx_base_RXPowerMonitorAndroid$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AnonymousClass1 anonymousClass1, Context context2, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_bytedance_realx_base_RXPowerMonitorAndroid$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(anonymousClass1, context2, intent);
        }
    };
    public static int mCpuCoreCount = -1;
    public static int charge_status = -1;
    public static int battery_temperature = -1;
    public static BatteryManager batteryManager = (BatteryManager) C16880lQ.LLILL(context, "batterymanager");

    public static int getBatteryCurrentCapacity() {
        try {
            int longProperty = ((int) ((BatteryManager) C16880lQ.LLILL(context, "batterymanager")).getLongProperty(1)) / 1000;
            if (longProperty < 0) {
                return -1;
            }
            return longProperty;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public static int getBatteryMaxCapacity() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getBatterySaveStatus() {
        int i = -1;
        i = -1;
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("Xiaomi")) {
                i = Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN");
            } else if (str.equalsIgnoreCase("Huawei")) {
                if (Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) {
                    i = 1;
                } else {
                    i = 0;
                }
            } else {
                PowerManager powerManager2 = powerManager;
                if (powerManager2 != null) {
                    i = powerManager2.isPowerSaveMode();
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return i;
    }

    public static int getVoltage() {
        return -1;
    }

    public static int getBatteryDesignCapacity() {
        int i = 0;
        try {
            i = (int) Math.round(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context), new Object[0])).doubleValue());
            return i;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return i;
        }
    }

    public static int getBatteryLevel() {
        BatteryManager batteryManager2 = batteryManager;
        if (batteryManager2 != null) {
            return batteryManager2.getIntProperty(4);
        }
        return -1;
    }

    public static int getBatteryTemperature() {
        return battery_temperature / 10;
    }

    public static int getChargeStatus() {
        int i;
        BatteryManager batteryManager2;
        if (Build.VERSION.SDK_INT >= 26 && (batteryManager2 = batteryManager) != null) {
            i = batteryManager2.getIntProperty(6);
        } else {
            i = charge_status;
        }
        if (i == 5 || i == 2) {
            return 1;
        }
        return 0;
    }

    public static int getScreenBrightness() {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            return -1;
        }
        return (int) ((Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1) / 255.0d) * 100.0d);
    }

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ifilter = intentFilter;
        batteryStatus = C16880lQ.LJJLIIIJILLIZJL(mBroadcastReceiver, context, intentFilter);
        powerManager = (PowerManager) C16880lQ.LLILL(context, "power");
    }
}
