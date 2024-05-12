package com.bytedance.pitaya.feature;

import X.C16880lQ;
import X.C93242aNi;
import X.C93243aNj;
import X.C93251aNr;
import X.C93254aNu;
import X.C93255aNv;
import X.C93317aOv;
import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class Hardware implements ReflectionCall {
    public static final Hardware INSTANCE = new Hardware();
    public static C93251aNr device;

    public final void init() {
        Context LIZ = C93317aOv.LIZ();
        if (LIZ != null) {
            if (device == null) {
                device = new C93251aNr(LIZ);
            }
            C93251aNr c93251aNr = device;
            if (c93251aNr != null) {
                C93254aNu.LIZ(1, c93251aNr);
                C93254aNu.LIZ(0, c93251aNr);
            }
            Context LIZ2 = C93317aOv.LIZ();
            if (LIZ2 != null) {
                C16880lQ.LJJLIIIJILLIZJL(new C93242aNi(), LIZ2, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                C93255aNv.LIZLLL.LIZ();
                return;
            }
            throw new Error("Context is null");
        }
        throw new Error("Context is null");
    }

    public final C93251aNr getDevice() {
        return device;
    }

    public final String getDeviceFeature(String key) {
        o.LJIIJ(key, "key");
        Locale locale = Locale.getDefault();
        o.LJFF(locale, "Locale.getDefault()");
        String lowerCase = key.toLowerCase(locale);
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (o.LJ(lowerCase, "battery")) {
            String jSONObject = new JSONObject().put("hardware", Float.valueOf(C93243aNj.LIZJ * C93243aNj.LIZLLL)).toString();
            if (jSONObject != null) {
                return jSONObject;
            }
            return "";
        }
        return getDeviceFeatureAlign(lowerCase);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01aa, code lost:
    
        if (r1.equals("power_mode") != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ce, code lost:
    
        if (r1.equals("temperature") != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02fa, code lost:
    
        r4 = java.lang.Float.valueOf(X.C93243aNj.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r1.equals("is_mute") != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x023a, code lost:
    
        if (r1.equals("mute") != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x023c, code lost:
    
        r0 = com.bytedance.pitaya.feature.Hardware.device;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x023e, code lost:
    
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02f8, code lost:
    
        if (r1.equals("battery_temperature") != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x024c, code lost:
    
        if (((android.media.AudioManager) X.C16880lQ.LLILL(r0.LIZ, "audio")).getStreamVolume(3) != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x032f, code lost:
    
        if (r1.equals("network_status") != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x024e, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0255, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0250, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0251, code lost:
    
        com.bytedance.pitaya.log.PitayaLogger.LIZLLL("", "", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r1.equals("network") != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0333, code lost:
    
        if (com.bytedance.pitaya.feature.Hardware.device == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0335, code lost:
    
        r4 = com.bytedance.pitaya.network.NetworkCommon.INSTANCE.getNetWorkTypeStr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r1.equals("is_low_power_mode") != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ac, code lost:
    
        r0 = com.bytedance.pitaya.feature.Hardware.device;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ae, code lost:
    
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01be, code lost:
    
        if (((android.os.PowerManager) X.C16880lQ.LLILL(r0.LIZ, "power")).isPowerSaveMode() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b9, code lost:
    
        if (r1.equals("charging") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        r4 = java.lang.Integer.valueOf(X.C93243aNj.LJFF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        r0 = new org.json.JSONObject().put("hardware", r4).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ee, code lost:
    
        if (r1.equals("is_charging") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r0 == null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getDeviceFeatureAlign(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.feature.Hardware.getDeviceFeatureAlign(java.lang.String):java.lang.String");
    }

    public final void setDevice(C93251aNr c93251aNr) {
        device = c93251aNr;
    }
}
