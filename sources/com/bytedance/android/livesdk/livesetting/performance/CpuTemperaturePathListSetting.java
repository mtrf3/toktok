package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.C6U;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("cpu_temperature_list_path")
/* loaded from: classes6.dex */
public final class CpuTemperaturePathListSetting {
    public static final CpuTemperaturePathListSetting INSTANCE = new CpuTemperaturePathListSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {"/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp"};
    public static final C5H3 pathList$delegate = C221108m2.LIZIZ(C6U.LJLIL);

    public final String[] getPathList() {
        return (String[]) pathList$delegate.getValue();
    }
}
