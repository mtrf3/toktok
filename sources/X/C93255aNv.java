package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.pitaya.log.PitayaLogger;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aNv, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93255aNv {
    public static final C93255aNv LIZLLL = new C93255aNv();
    public static float LIZ = -1.0f;
    public static long LIZIZ = -1;
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");

    public static void LIZIZ() {
        float f;
        BufferedReader bufferedReader;
        String readLine;
        int size = LIZJ.size();
        for (int i = 0; i < size; i++) {
            String str = (String) ListProtector.get(LIZJ, i);
            try {
                if (C93302aOg.LJIIJJI) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                } else {
                    Runtime runtime = Runtime.getRuntime();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("cat ");
                    LIZ2.append(str);
                    Process exec = runtime.exec(X1D.LIZIZ(LIZ2));
                    o.LJFF(exec, "Runtime.getRuntime().exec(\"cat $command\")");
                    exec.waitFor();
                    bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                }
                readLine = bufferedReader.readLine();
            } catch (Throwable th) {
                PitayaLogger.LJFF("TemperatureManager", "", "", th);
            }
            if (readLine != null) {
                f = CastFloatProtector.parseFloat(readLine) / 1000.0f;
                if (f <= 10 && f < 70) {
                    LIZ = f;
                    return;
                }
            }
            f = -1.0f;
            if (f <= 10) {
            }
        }
    }

    public final float LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        if (j == -1 || currentTimeMillis - j >= 60000) {
            synchronized (this) {
                long j2 = LIZIZ;
                if (j2 == -1 || currentTimeMillis - j2 >= 60000) {
                    LIZIZ = currentTimeMillis;
                    LIZIZ();
                }
            }
        }
        float f = LIZ;
        if (f > 10 && f < 70) {
            return f;
        }
        return C93243aNj.LIZ;
    }
}
