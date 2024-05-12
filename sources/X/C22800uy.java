package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaTaskFrequentControlManager;
import com.bytedance.android.livesdk.livesetting.performance.FluencyMetricSwitchSetting;
import org.json.JSONObject;

/* renamed from: X.0uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22800uy {
    public static int LIZ = 1;
    public static boolean LIZIZ;
    public static final QZV LIZJ;

    static {
        QZV c67213QZl;
        if (FluencyMetricSwitchSetting.disable()) {
            c67213QZl = new QZV() { // from class: X.1nr
            };
        } else {
            c67213QZl = new C67213QZl();
        }
        LIZJ = c67213QZl;
    }

    public static void LIZIZ() {
        C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "startCreateRoom");
        LIZ = 3;
        LIZIZ = false;
    }

    public static boolean LIZ(double d, double d2, double d3, float f, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        LivePitayaTaskFrequentControlManager frequentControlSettings = LiveClientAISettings.INSTANCE.frequentControlSettings();
        if (LIZIZ) {
            double d4 = frequentControlSettings.fpsLimit;
            double d5 = frequentControlSettings.cpuSpeedLimit;
            double d6 = frequentControlSettings.cpuRateLimit;
            double d7 = frequentControlSettings.memoryLimit;
            if (Build.VERSION.SDK_INT >= 26) {
                C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android>=8");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("cpuSpeed: ");
                LIZ2.append(d2);
                C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", X1D.LIZIZ(LIZ2));
                if (d3 > d7 || f < d4 || d2 > d5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                LIZJ(d2, f, d3, z4, d5, d4, d7, str);
                return z4;
            }
            C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android<8");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("cpuRate: ");
            LIZ3.append(d);
            C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", X1D.LIZIZ(LIZ3));
            if (d3 > d7 || f < d4 || d > d6) {
                z3 = true;
            } else {
                z3 = false;
            }
            LIZJ(d, f, d3, z3, d5, d4, d7, str);
            return z3;
        }
        double d8 = frequentControlSettings.fpsLimitAnchor;
        double d9 = frequentControlSettings.cpuSpeedLimitAnchor;
        double d10 = frequentControlSettings.cpuRateLimitAnchor;
        double d11 = frequentControlSettings.memoryLimitAnchor;
        if (Build.VERSION.SDK_INT >= 26) {
            C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android>=8");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("cpuSpeed: ");
            LIZ4.append(d2);
            C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", X1D.LIZIZ(LIZ4));
            if (d3 > d11 || f < d8 || d2 > d9) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZJ(d2, f, d3, z2, d9, d8, d11, str);
            return z2;
        }
        C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "android<8");
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("cpuRate: ");
        LIZ5.append(d);
        C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", X1D.LIZIZ(LIZ5));
        if (d3 > d11 || f < d8 || d > d10) {
            z = true;
        } else {
            z = false;
        }
        LIZJ(d, f, d3, z, d9, d8, d11, str);
        return z;
    }

    public static void LIZJ(double d, float f, double d2, boolean z, double d3, double d4, double d5, String str) {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_ai_frequent_control_performance_data", 0.01d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        int i4 = 1;
        if (d == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = 4;
        if (z2) {
            i = 4;
        } else {
            i = 0;
        }
        if (f == 60.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i6 = 2;
        if (z3) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (d2 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (d <= d3) {
            i5 = 0;
        }
        if (f >= d4) {
            i6 = 0;
        }
        if (d2 <= d5) {
            i4 = 0;
        }
        int i7 = i | i3 | i2;
        jSONObject.put("performanceData", i7);
        jSONObject.put("frequent_control_take_effect", z ? 1 : 0);
        jSONObject.put("is_take_effect_strategy", i5 | i4 | i6);
        jSONObject.put("limit_fps", d4);
        jSONObject.put("limit_cpu", d3);
        jSONObject.put("limit_mem", d5);
        jSONObject.put("business_name", str);
        jSONObject2.put("real_fps", Float.valueOf(f));
        jSONObject2.put("real_cpu", d);
        jSONObject2.put("real_mem", d2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("performanceDataStatus: ");
        LIZ2.append(i7);
        C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("isFrequentControl: ");
        LIZ3.append(z ? 1 : 0);
        C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", X1D.LIZIZ(LIZ3));
        C0K2.LJI("ttlive_client_ai_frequent_control_performance_data", jSONObject, jSONObject2, jSONObject3);
    }
}
