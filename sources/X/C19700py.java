package X;

import android.app.ActivityManager;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.setting.MobileGameFeedbackAnalyseInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19700py {
    public static C19730q1 LIZLLL;
    public static ActivityManager LJIJ;
    public static volatile C19720q0 LJIJJLI;
    public static InterfaceC92693kP LJJ;
    public static final C19700py LIZ = new C19700py();
    public static final Object LIZIZ = new Object();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicLong LJ = new AtomicLong(0);
    public static final AtomicLong LJFF = new AtomicLong(0);
    public static final List<Long> LJI = FII.LIZ();
    public static final List<Long> LJII = FII.LIZ();
    public static final List<Long> LJIIIIZZ = FII.LIZ();
    public static final List<OSZ<Float, Boolean>> LJIIIZ = FII.LIZ();
    public static final List<Boolean> LJIIJ = FII.LIZ();
    public static final List<Boolean> LJIIJJI = FII.LIZ();
    public static final List<Long> LJIIL = FII.LIZ();
    public static final List<Integer> LJIILIIL = FII.LIZ();
    public static final List<Double> LJIILJJIL = FII.LIZ();
    public static final List<Double> LJIILL = FII.LIZ();
    public static final List<Double> LJIILLIIL = FII.LIZ();
    public static final List<Long> LJIIZILJ = FII.LIZ();
    public static final AtomicBoolean LJIJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJIJJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIL = new AtomicBoolean(false);

    public final synchronized C19720q0 LJII() {
        C19720q0 c19720q0;
        if (LJIJJLI != null) {
            c19720q0 = LJIJJLI;
        } else {
            c19720q0 = new C19720q0();
            LIZIZ(c19720q0);
            LJIJJLI = c19720q0;
        }
        return c19720q0;
    }

    public final synchronized void LJIIIZ() {
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", "reset()");
        }
        LJIJI.set(false);
        LJIL.set(false);
        LJ.set(0L);
        LJI.clear();
        LJII.clear();
        LJIIIIZZ.clear();
        LJIIIZ.clear();
        LJIIJ.clear();
        LJIIJJI.clear();
        LJIIL.clear();
        LJIILIIL.clear();
        LJIILJJIL.clear();
        LJIILL.clear();
        LJIILLIIL.clear();
        LJIIZILJ.clear();
        InterfaceC92693kP interfaceC92693kP = LJJ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        LJJ = null;
    }

    public static void LJIIJ() {
        boolean z;
        Double d;
        double doubleValue;
        Double d2;
        double doubleValue2;
        Double d3 = (Double) C31023CFn.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_rate");
        Double valueOf = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        if (d3 != null && d3.equals(valueOf)) {
            z = true;
        } else {
            z = false;
        }
        double d4 = -999.0d;
        if (z || (d = (Double) C31023CFn.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_rate")) == null) {
            doubleValue = -999.0d;
        } else {
            doubleValue = d.doubleValue();
        }
        LJIILLIIL.add(Double.valueOf(doubleValue));
        Double d5 = (Double) C31023CFn.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_speed");
        if ((d5 != null && d5.equals(valueOf)) || (d2 = (Double) C31023CFn.LIZ("livesdk_game_broadcast_feedback_diagnose").get("cpu_speed")) == null) {
            doubleValue2 = -999.0d;
        } else {
            doubleValue2 = d2.doubleValue();
        }
        LJIILJJIL.add(Double.valueOf(doubleValue2));
        int LIZLLL2 = C15390j1.LIZLLL(C15380j0.LIZLLL());
        if (LIZLLL2 != -999 && doubleValue2 != -999.0d) {
            d4 = doubleValue2 / LIZLLL2;
        }
        LJIILL.add(Double.valueOf(d4));
    }

    public static void LJIIJJI() {
        C31024CFo c31024CFo = C31032CFw.LIZ;
        float f = c31024CFo.LIZLLL;
        boolean LIZIZ2 = c31024CFo.LIZIZ();
        if (f > 0.0f) {
            LJIIIZ.add(new OSZ<>(Float.valueOf(f), Boolean.valueOf(LIZIZ2)));
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("storeDeviceTemperature(). temperatureAndChargingList=");
            LIZ2.append(LJIIIZ);
            C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJIIL() {
        double d;
        C31024CFo c31024CFo = C31032CFw.LIZ;
        c31024CFo.LIZIZ();
        if (c31024CFo.LJ > 0 && c31024CFo.LJFF > 0) {
            c31024CFo.LIZIZ();
            d = c31024CFo.LJ / c31024CFo.LJFF;
        } else {
            d = -999.0d;
        }
        int power_low = MobileGameFeedbackAnalyseInfo.INSTANCE.getValue().getPower_low();
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d * 100 < power_low) {
            LJIIJJI.add(Boolean.TRUE);
        } else {
            LJIIJJI.add(Boolean.FALSE);
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("storeLowBattery(). lowBatteryList=");
            LIZ2.append(LJIIJJI);
            C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJFF(JSONArray jSONArray) {
        Integer num;
        boolean z;
        String str;
        C3P c3p = (C3P) DataChannelGlobal.LJLJJI.mv0(C3V.class);
        Integer num2 = null;
        if (c3p != null) {
            num = Integer.valueOf(c3p.LJLIL);
            num2 = Integer.valueOf(c3p.LJLILLLLZI);
        } else {
            num = null;
        }
        C19730q1 c19730q1 = LIZLLL;
        int i = 0;
        if (c19730q1 != null && (c19730q1.LJIIIZ == 1 || c19730q1.LJIIIZ == 2)) {
            z = true;
        } else {
            z = false;
        }
        if (num != null && num.intValue() != 10001) {
            if (num.intValue() == 10002 || num.intValue() == 10003 || num.intValue() == 10004 || num.intValue() == 10006 || num.intValue() == 10007 || num.intValue() == 10009 || num.intValue() == 10010) {
                str = "business_interrupt";
            } else if (num.intValue() != 4 && num.intValue() != 107 && (num.intValue() != 20001 || num2 == null || num2.intValue() != -1)) {
                if (C21040s8.LIZIZ(num.intValue(), num2)) {
                    str = "android_battery_opt";
                } else {
                    str = "other";
                }
            } else {
                str = "network_interrupt";
            }
        } else if (z) {
            str = "android_process_kill";
        } else {
            str = "";
            String valueOf = String.valueOf(i);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            jSONArray.put(LIZ("diagnose_live_interrupt", valueOf, arrayList));
        }
        i = 1;
        String valueOf2 = String.valueOf(i);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        jSONArray.put(LIZ("diagnose_live_interrupt", valueOf2, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0350 A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f0 A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c6 A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0267 A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022c A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f7 A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x016d A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ac A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03c2 A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03fd A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0427 A[Catch: all -> 0x0444, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000c, B:8:0x0028, B:9:0x002a, B:11:0x0042, B:12:0x0044, B:13:0x004e, B:16:0x0056, B:19:0x0099, B:22:0x00e5, B:25:0x00ee, B:28:0x0123, B:32:0x015d, B:36:0x01a6, B:39:0x021b, B:42:0x0256, B:45:0x0293, B:47:0x02b5, B:51:0x033f, B:54:0x037a, B:56:0x03a2, B:58:0x03ac, B:59:0x03b6, B:61:0x03c2, B:62:0x03cc, B:64:0x03ec, B:66:0x03f6, B:72:0x043e, B:73:0x0443, B:74:0x03fd, B:75:0x0402, B:77:0x0408, B:82:0x0418, B:90:0x041b, B:93:0x0427, B:96:0x042f, B:99:0x0437, B:100:0x0350, B:102:0x0359, B:104:0x036d, B:106:0x0373, B:107:0x0370, B:110:0x02f0, B:112:0x02fb, B:115:0x0311, B:118:0x032b, B:119:0x032d, B:127:0x0325, B:129:0x0334, B:134:0x02c6, B:135:0x02cb, B:137:0x02d1, B:140:0x02e5, B:145:0x02e8, B:146:0x0267, B:147:0x026e, B:149:0x0274, B:152:0x0288, B:157:0x022c, B:158:0x0231, B:160:0x0237, B:163:0x024b, B:168:0x01f7, B:169:0x01fc, B:171:0x0202, B:173:0x0214, B:174:0x016d, B:175:0x0173, B:177:0x0179, B:183:0x018b, B:186:0x019c, B:194:0x01a4, B:195:0x0134, B:196:0x013a, B:198:0x0140, B:204:0x0152, B:211:0x015b, B:212:0x0103, B:213:0x0108, B:215:0x010e, B:221:0x0120, B:228:0x00c1, B:230:0x00ca, B:232:0x00d8, B:234:0x00de, B:235:0x00db), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ(X.C19720q0 r15) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19700py.LIZIZ(X.0q0):void");
    }

    public final synchronized void LJIIIIZZ(DataChannel dataChannel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Long l;
        String str10;
        String str11;
        String str12;
        Double d;
        Double d2;
        long j;
        Float f;
        Float f2;
        Float f3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        C1Y5 c1y5 = (C1Y5) ((LinkedHashMap) C19710pz.LIZ).get(EnumC21060sA.HIGH_PING_TIPS_MODULE);
        if (c1y5 != null && c1y5.LIZIZ.get()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        Integer num = null;
        if (quality != null) {
            str2 = quality.sdkKey;
        } else {
            str2 = null;
        }
        if (C77357UXp.LJJIJ()) {
            str3 = "manual_speedtest";
        } else if (C77357UXp.LJJIIZI()) {
            str3 = "auto_speedtest";
        } else {
            java.util.Map<String, String> LIZJ2 = InterfaceC30442Bx8.LLLZI.LIZJ();
            if (LIZJ2 == null || LIZJ2.isEmpty()) {
                str3 = "default";
            } else {
                str3 = "selected";
            }
        }
        String resumeLiveDefinition = InterfaceC30442Bx8.LLLZIIL.LIZJ();
        String resumeLiveDefinitionType = InterfaceC30442Bx8.LLLZIL.LIZJ();
        o.LJIIIIZZ(resumeLiveDefinition, "resumeLiveDefinition");
        if (resumeLiveDefinition.length() > 0) {
            o.LJIIIIZZ(resumeLiveDefinitionType, "resumeLiveDefinitionType");
            if (resumeLiveDefinitionType.length() > 0) {
                str2 = resumeLiveDefinition;
                str3 = resumeLiveDefinitionType;
            }
        }
        C19720q0 LJII2 = LJII();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_game_broadcast_core_live_info_for_feedback");
        LIZ2.LJIILLIIL(dataChannel);
        if (LJII2 == null || (str4 = Double.valueOf(LJII2.LJJIIJ).toString()) == null) {
            str4 = "";
        }
        LIZ2.LJIJJ(str4, "low_battery_proportion");
        if (LJII2 == null || (str5 = Double.valueOf(LJII2.LJJIII).toString()) == null) {
            str5 = "";
        }
        LIZ2.LJIJJ(str5, "power_save_mode_proportion");
        if (LJII2 == null || (str6 = Integer.valueOf(LJII2.LJ * 5).toString()) == null) {
            str6 = "";
        }
        LIZ2.LJIJJ(str6, "low_push_bitrate_max_continuous_duration");
        if (LJII2 == null || (str7 = Double.valueOf(LJII2.LIZJ).toString()) == null) {
            str7 = "";
        }
        LIZ2.LJIJJ(str7, "low_push_bitrate_proportion");
        if (LJII2 == null || (str8 = Double.valueOf(LJII2.LJIIIIZZ).toString()) == null) {
            str8 = "";
        }
        LIZ2.LJIJJ(str8, "low_push_framerate_proportion");
        if (LJII2 == null || (str9 = Integer.valueOf(LJII2.LJIIJ * 5).toString()) == null) {
            str9 = "";
        }
        LIZ2.LJIJJ(str9, "low_push_framerate_max_continuous_duration");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        C19730q1 c19730q1 = LIZLLL;
        if (c19730q1 != null) {
            l = Long.valueOf(c19730q1.LIZIZ);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        if (LJII2 == null || (str10 = Double.valueOf(LJII2.LJIIJJI).toString()) == null) {
            str10 = "";
        }
        LIZ2.LJIJJ(str10, "avg_push_rtt");
        if (LJII2 == null || (str11 = Integer.valueOf(LJII2.LJIILIIL * 5).toString()) == null) {
            str11 = "";
        }
        LIZ2.LJIJJ(str11, "high_push_rtt_max_continuous_duration");
        if (LJII2 == null || (str12 = Integer.valueOf(LJII2.LJJII * 5).toString()) == null) {
            str12 = "";
        }
        LIZ2.LJIJJ(str12, "high_temperature_max_continuous_duration");
        if (LJII2 != null) {
            d = Double.valueOf(LJII2.LIZ);
        } else {
            d = null;
        }
        LIZ2.LJIJJLI("real_bitrate_avg", d);
        if (LJII2 != null) {
            d2 = Double.valueOf(LJII2.LJFF);
        } else {
            d2 = null;
        }
        LIZ2.LJIJJLI("real_video_framerate_avg", d2);
        long j7 = 0;
        if (LJII2 != null) {
            j = LJII2.LJJIZ;
        } else {
            j = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j), "live_duration");
        if (LJII2 != null) {
            f = Float.valueOf(LJII2.LJJJ);
        } else {
            f = null;
        }
        LIZ2.LJIL("low_live_core_network_proportion", f);
        if (LJII2 != null) {
            f2 = Float.valueOf(LJII2.LJIILL);
        } else {
            f2 = null;
        }
        LIZ2.LJIL("avg_ping", f2);
        if (LJII2 != null) {
            f3 = Float.valueOf(LJII2.LJIILLIIL);
        } else {
            f3 = null;
        }
        LIZ2.LJIL("high_ping_proportion", f3);
        if (LJII2 != null) {
            num = Integer.valueOf(LJII2.LJIILJJIL);
        }
        LIZ2.LJIJJ(num, "valid_ping_count");
        LIZ2.LJIJJ(str2, "take_definition");
        LIZ2.LJIJJ(str3, "definition_type");
        LIZ2.LJIJJ(str, "show_high_ping_tips");
        Long l2 = (Long) dataChannelGlobal.mv0(C30380Bw8.class);
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j2), "live_tab_first_ts");
        Long l3 = (Long) dataChannelGlobal.mv0(C29252Bdw.class);
        if (l3 != null) {
            j3 = l3.longValue();
        } else {
            j3 = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j3), "live_tab_last_ts");
        Long l4 = (Long) dataChannelGlobal.mv0(C29253Bdx.class);
        if (l4 != null) {
            j4 = l4.longValue();
        } else {
            j4 = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j4), "mobile_game_tab_first_ts");
        Long l5 = (Long) dataChannelGlobal.mv0(C29254Bdy.class);
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j5), "mobile_game_tab_last_ts");
        Long l6 = (Long) dataChannelGlobal.mv0(C29145BcD.class);
        if (l6 != null) {
            j6 = l6.longValue();
        } else {
            j6 = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j6), "click_go_live_first_ts");
        Long l7 = (Long) dataChannelGlobal.mv0(C29146BcE.class);
        if (l7 != null) {
            j7 = l7.longValue();
        }
        LIZ2.LJIJJ(Long.valueOf(j7), "click_go_live_last_ts");
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(org.json.JSONArray r16, X.C19720q0 r17) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19700py.LIZJ(org.json.JSONArray, X.0q0):void");
    }

    public static void LIZLLL(JSONArray jSONArray, C19720q0 c19720q0) {
        int i;
        String str = "";
        if (LIZLLL != null) {
            MobileGameFeedbackAnalyseInfo mobileGameFeedbackAnalyseInfo = MobileGameFeedbackAnalyseInfo.INSTANCE;
            float real_fps_proportion = mobileGameFeedbackAnalyseInfo.getValue().getReal_fps_proportion();
            long real_fps_size = mobileGameFeedbackAnalyseInfo.getValue().getReal_fps_size();
            double d = c19720q0.LJFF;
            double d2 = c19720q0.LJIIIIZZ;
            boolean z = c19720q0.LJIIIZ;
            if (d < real_fps_size) {
                if (LJIJI.get()) {
                    str = "low_avg_real_framerate";
                    i = 1;
                }
                i = 0;
            } else if (d2 >= real_fps_proportion) {
                if (LJIJI.get()) {
                    str = "large_part_of_low_real_framerate";
                    i = 1;
                }
                i = 0;
            } else {
                if (z && LJIJI.get()) {
                    str = "continuous_low_framerate_for_long_time";
                    i = 1;
                }
                i = 0;
            }
            synchronized (LIZIZ) {
                c19720q0.LJJIJIIJI = i;
                c19720q0.LJJIJIIJIL = str;
            }
            C19700py c19700py = LIZ;
            String valueOf = String.valueOf(i);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c19700py.getClass();
            if (jSONArray.put(LIZ("diagnose_video_framerate", valueOf, arrayList)) != null) {
                return;
            }
        }
        synchronized (LIZIZ) {
            c19720q0.LJJIJIIJI = 0;
            c19720q0.LJJIJIIJIL = "";
        }
        jSONArray.put(LIZ("diagnose_video_framerate", CardStruct.IStatusCode.DEFAULT, null));
    }

    public static void LJ(JSONArray jSONArray, C19720q0 c19720q0) {
        boolean z;
        int i;
        String str = "";
        MobileGameFeedbackAnalyseInfo mobileGameFeedbackAnalyseInfo = MobileGameFeedbackAnalyseInfo.INSTANCE;
        long rtt_size = mobileGameFeedbackAnalyseInfo.getValue().getRtt_size();
        long ping_value = mobileGameFeedbackAnalyseInfo.getValue().getPing_value();
        float ping_high_proportion = mobileGameFeedbackAnalyseInfo.getValue().getPing_high_proportion();
        long ping_number = mobileGameFeedbackAnalyseInfo.getValue().getPing_number();
        if (LIZLLL != null) {
            float f = c19720q0.LJIILL;
            int i2 = c19720q0.LJIILJJIL;
            float f2 = c19720q0.LJIILLIIL;
            double d = c19720q0.LJIIJJI;
            boolean z2 = c19720q0.LJIIL;
            if (c19720q0.LIZ < r1.LIZJ) {
                z = true;
            } else {
                z = false;
            }
            if (i2 >= ping_number) {
                if (f > ((float) ping_value) || f2 > ping_high_proportion) {
                    if (z) {
                        str = "ping_abnormal_values_and_poor_live_and_game";
                    } else {
                        str = "ping_abnormal_values_and_live_preemption_game_bandwidth";
                    }
                    i = 1;
                }
                i = 0;
            } else {
                if (d > rtt_size) {
                    str = "high_avg_push_rtt";
                } else {
                    if (z2) {
                        str = "continuous_high_push_rtt_for_long_time";
                    }
                    i = 0;
                }
                i = 1;
            }
            synchronized (LIZIZ) {
                c19720q0.LJJIJIL = i;
                c19720q0.LJJIJL = str;
            }
            C19700py c19700py = LIZ;
            String valueOf = String.valueOf(i);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c19700py.getClass();
            if (jSONArray.put(LIZ("diagnose_push_stream_network", valueOf, arrayList)) != null) {
                return;
            }
        }
        synchronized (LIZIZ) {
            c19720q0.LJJIJIL = 0;
            c19720q0.LJJIJL = "";
        }
        jSONArray.put(LIZ("diagnose_push_stream_network", CardStruct.IStatusCode.DEFAULT, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(org.json.JSONArray r10, X.C19720q0 r11) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 3
            r4.<init>(r0)
            com.bytedance.android.live.broadcast.setting.MobileGameFeedbackAnalyseInfo r2 = com.bytedance.android.live.broadcast.setting.MobileGameFeedbackAnalyseInfo.INSTANCE
            com.bytedance.android.live.broadcast.setting.MobileGameBroadcastFeedbackConfig r0 = r2.getValue()
            float r1 = r0.getPower_save_mode_proportion()
            com.bytedance.android.live.broadcast.setting.MobileGameBroadcastFeedbackConfig r0 = r2.getValue()
            float r7 = r0.getPower_low_proportion()
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.BwB> r0 = X.C30383BwB.class
            java.lang.Object r0 = r2.mv0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r11.LJJIFFI
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r5 = 1
            if (r0 != 0) goto La6
        L2c:
            r9 = 0
        L2d:
            if (r2 == r5) goto L75
            r0 = 2
            if (r2 == r0) goto L8d
        L32:
            double r2 = r11.LJJIII
            double r0 = (double) r1
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L51
            java.lang.String r0 = "using_battery_saver_mode"
            r4.add(r0)
            boolean r0 = ujb.o.LJJJJJL(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L4b
            java.lang.String r0 = ","
            r6.append(r0)
        L4b:
            java.lang.String r0 = "using_battery_saver_mode"
            r6.append(r0)
            r9 = 1
        L51:
            double r2 = r11.LJJIIJ
            double r0 = (double) r7
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L73
            java.lang.String r0 = "low_battery"
            r4.add(r0)
            boolean r0 = ujb.o.LJJJJJL(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L6a
            java.lang.String r0 = ","
            r6.append(r0)
        L6a:
            java.lang.String r0 = "low_battery"
            r6.append(r0)
        L6f:
            java.lang.Object r2 = X.C19700py.LIZIZ
            monitor-enter(r2)
            goto Lb9
        L73:
            r5 = r9
            goto L6f
        L75:
            java.lang.String r0 = "high_temperature_with_charge"
            r4.add(r0)
            boolean r0 = ujb.o.LJJJJJL(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L87
            java.lang.String r0 = ","
            r6.append(r0)
        L87:
            java.lang.String r0 = "high_temperature_with_charge"
            r6.append(r0)
            goto La4
        L8d:
            java.lang.String r0 = "high_temperature_without_charge"
            r4.add(r0)
            boolean r0 = ujb.o.LJJJJJL(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L9f
            java.lang.String r0 = ","
            r6.append(r0)
        L9f:
            java.lang.String r0 = "high_temperature_without_charge"
            r6.append(r0)
        La4:
            r9 = 1
            goto L32
        La6:
            int r0 = r0.intValue()
            if (r0 != r5) goto L2c
            java.lang.String r0 = "low_end_devices"
            r4.add(r0)
            java.lang.String r0 = "low_end_devices"
            r6.append(r0)
            r9 = 1
            goto L2d
        Lb9:
            r11.LJJIJLIJ = r5     // Catch: java.lang.Throwable -> Le0
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = "reasonStringBuilder.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> Le0
            r11.LJJIL = r1     // Catch: java.lang.Throwable -> Le0
            monitor-exit(r2)
            java.lang.String r2 = "diagnose_game_fps"
            java.lang.String r1 = java.lang.String.valueOf(r5)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Ld8
            java.lang.String r0 = ""
            r4.add(r0)
        Ld8:
            org.json.JSONObject r0 = LIZ(r2, r1, r4)
            r10.put(r0)
            return
        Le0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19700py.LJI(org.json.JSONArray, X.0q0):void");
    }

    public static JSONObject LIZ(String str, String str2, List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tag_name", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", str2);
            if (list != null) {
                jSONObject2.put("reason", new JSONArray((Collection) list));
            }
            jSONObject.put("tag_result", jSONObject2);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("buildJson() catch exception. e=");
            LIZ2.append(e.getMessage());
            C0NB.LJ("GameBroadcastFeedbackDiagnose", X1D.LIZIZ(LIZ2));
        }
        return jSONObject;
    }
}
