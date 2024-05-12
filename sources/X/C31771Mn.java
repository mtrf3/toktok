package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.samsung.sdk.sperf.CustomParams;
import com.samsung.sdk.sperf.PerformanceManager;
import com.samsung.sdk.sperf.SPerf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31771Mn extends C0U4 implements C0UC {
    public final PerformanceManager LIZIZ;
    public C06980Pe LIZJ;

    @Override // X.C0UC
    public final boolean LIZJ(C0NR c0nr) {
        C06980Pe c06980Pe = this.LIZJ;
        return c06980Pe != null && c06980Pe.LIZ().contains(c0nr);
    }

    public C31771Mn(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && SPerf.initialize(context)) {
            PerformanceManager performanceManager = PerformanceManager.getInstance();
            this.LIZIZ = performanceManager;
            if (performanceManager != null) {
                HashSet hashSet = new HashSet();
                hashSet.add(C0NR.PRESET_SCENE);
                hashSet.add(C0NR.CPU_FREQ_MIN);
                hashSet.add(C0NR.CPU_FREQ_MAX);
                hashSet.add(C0NR.CPU_CORE_MIN);
                hashSet.add(C0NR.CPU_CORE_MAX);
                hashSet.add(C0NR.GPU_FREQ_MIN);
                hashSet.add(C0NR.GPU_FREQ_MAX);
                hashSet.add(C0NR.BUS_FREQ_MIN);
                hashSet.add(C0NR.BUS_FREQ_MAX);
                hashSet.add(C0NR.TASK_PRIORITY);
                hashSet.add(C0NR.CPU_AFFINITY);
                hashSet.add(C0NR.IDLE_STATE);
                C0U4.LIZ.addAll(hashSet);
                C06980Pe c06980Pe = new C06980Pe();
                this.LIZJ = c06980Pe;
                c06980Pe.LJFF(hashSet);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C0NR c0nr = (C0NR) it.next();
                    switch (C0UH.LIZ[c0nr.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            C07000Pg c07000Pg = new C07000Pg(5, 1000, true);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c07000Pg);
                            this.LIZJ.LIZIZ(c0nr, arrayList);
                            break;
                        case 7:
                        case 8:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        case 12:
                            break;
                        case 9:
                            this.LIZJ.LIZLLL(new C07010Ph(0, 5));
                            break;
                        case 10:
                            this.LIZJ.LIZJ(EnumC06990Pf.BIND_CLUSTER);
                            break;
                        default:
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("SsCapabilityProvider not support this capability ");
                            LIZ.append(c0nr);
                            X1D.LIZIZ(LIZ);
                            C0YN.LIZ(6);
                            break;
                    }
                }
                HashMap hashMap = new HashMap();
                C0NV c0nv = C0NV.LEVEL_9;
                C0UB c0ub = C0UB.PLATFORM;
                hashMap.put(c0nv, new C0U8(0, Integer.MAX_VALUE, c0ub, c0nv));
                C0NV c0nv2 = C0NV.LEVEL_8;
                hashMap.put(c0nv2, new C0U8(0, Integer.MAX_VALUE, c0ub, c0nv2));
                C0NV c0nv3 = C0NV.LEVEL_7;
                C0UB c0ub2 = C0UB.VENDOR;
                hashMap.put(c0nv3, new C0U8(3, 1000, c0ub2, c0nv2));
                C0NV c0nv4 = C0NV.LEVEL_6;
                hashMap.put(c0nv4, new C0U8(3, 1000, c0ub2, c0nv2));
                C0NV c0nv5 = C0NV.LEVEL_5;
                hashMap.put(c0nv5, new C0U8(2, 1000, c0ub2, c0nv5));
                C0NV c0nv6 = C0NV.LEVEL_4;
                hashMap.put(c0nv6, new C0U8(2, 1000, c0ub2, c0nv6));
                C0NV c0nv7 = C0NV.LEVEL_3;
                hashMap.put(c0nv7, new C0U8(1, 1000, c0ub2, c0nv7));
                C0NV c0nv8 = C0NV.LEVEL_2;
                hashMap.put(c0nv8, new C0U8(1, 1000, c0ub2, c0nv8));
                C0NV c0nv9 = C0NV.LEVEL_1;
                hashMap.put(c0nv9, new C0U8(0, 1000, c0ub2, c0nv9));
                C0NV c0nv10 = C0NV.LEVEL_0;
                hashMap.put(c0nv10, new C0U8(0, 1000, c0ub2, c0nv10));
                C0UG c0ug = C0UF.LIZ;
                c0ug.LIZIZ(c0ub2, C0NR.CPU_FREQ_MIN, hashMap);
                c0ug.LIZIZ(c0ub2, C0NR.CPU_FREQ_MAX, hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(c0nv, new C0U8(0, Integer.MAX_VALUE, c0ub, c0nv));
                hashMap2.put(c0nv2, new C0U8(0, Integer.MAX_VALUE, c0ub, c0nv2));
                hashMap2.put(c0nv3, new C0U8(3, 1000, c0ub2, c0nv2));
                hashMap2.put(c0nv4, new C0U8(3, 1000, c0ub2, c0nv2));
                hashMap2.put(c0nv5, new C0U8(2, 1000, c0ub2, c0nv5));
                hashMap2.put(c0nv6, new C0U8(2, 1000, c0ub2, c0nv6));
                hashMap2.put(c0nv7, new C0U8(1, 1000, c0ub2, c0nv7));
                hashMap2.put(c0nv8, new C0U8(1, 1000, c0ub2, c0nv8));
                hashMap2.put(c0nv9, new C0U8(0, 1000, c0ub2, c0nv9));
                hashMap2.put(c0nv10, new C0U8(0, 1000, c0ub2, c0nv10));
                c0ug.LIZIZ(c0ub2, C0NR.GPU_FREQ_MIN, hashMap2);
                c0ug.LIZIZ(c0ub2, C0NR.GPU_FREQ_MAX, hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put(c0nv, new C0U8(3, 1000, c0ub2, c0nv));
                hashMap3.put(c0nv2, new C0U8(3, 1000, c0ub2, c0nv2));
                hashMap3.put(c0nv3, new C0U8(2, 1000, c0ub2, c0nv3));
                hashMap3.put(c0nv4, new C0U8(2, 1000, c0ub2, c0nv4));
                hashMap3.put(c0nv5, new C0U8(2, 1000, c0ub2, c0nv5));
                hashMap3.put(c0nv6, new C0U8(1, 1000, c0ub2, c0nv6));
                hashMap3.put(c0nv7, new C0U8(1, 1000, c0ub2, c0nv7));
                hashMap3.put(c0nv8, new C0U8(1, 1000, c0ub2, c0nv8));
                hashMap3.put(c0nv9, new C0U8(0, 1000, c0ub2, c0nv9));
                hashMap3.put(c0nv10, new C0U8(0, 1000, c0ub2, c0nv10));
                c0ug.LIZIZ(c0ub2, C0NR.BUS_FREQ_MIN, hashMap3);
                c0ug.LIZIZ(c0ub2, C0NR.BUS_FREQ_MAX, hashMap3);
                HashMap hashMap4 = new HashMap();
                hashMap4.put(c0nv, new C0U8(4, 99999999, c0ub2, c0nv));
                hashMap4.put(c0nv2, new C0U8(4, 99999999, c0ub2, c0nv2));
                hashMap4.put(c0nv3, new C0U8(3, 99999999, c0ub2, c0nv3));
                hashMap4.put(c0nv4, new C0U8(3, 99999999, c0ub2, c0nv4));
                hashMap4.put(c0nv5, new C0U8(2, 99999999, c0ub2, c0nv5));
                hashMap4.put(c0nv6, new C0U8(2, 99999999, c0ub2, c0nv6));
                hashMap4.put(c0nv7, new C0U8(1, 99999999, c0ub2, c0nv7));
                hashMap4.put(c0nv8, new C0U8(1, 99999999, c0ub2, c0nv8));
                hashMap4.put(c0nv9, new C0U8(0, 99999999, c0ub2, c0nv9));
                hashMap4.put(c0nv10, new C0U8(0, 99999999, c0ub2, c0nv10));
                c0ug.LIZIZ(c0ub2, C0NR.TASK_PRIORITY, hashMap4);
                if (C0YR.LIZIZ()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vendor", "ss");
                        C0YR.LIZ("vboost_event_active", jSONObject);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                C0YN.LIZ(4);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0019. Please report as an issue. */
    @Override // X.C0UC
    public final Object LIZ(C0UD c0ud) {
        CustomParams customParams;
        int i;
        int i2;
        int i3;
        CustomParams customParams2;
        int start;
        if (this.LIZIZ == null) {
            return null;
        }
        switch (C0UH.LIZ[c0ud.LIZ.ordinal()]) {
            case 1:
                customParams = new CustomParams();
                customParams.add(1, c0ud.LIZJ, (int) c0ud.LJ);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 2:
                customParams = new CustomParams();
                customParams.add(3, c0ud.LIZJ, (int) c0ud.LJ);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 3:
                customParams = new CustomParams();
                customParams.add(5, c0ud.LIZJ, (int) c0ud.LJ);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 4:
                customParams = new CustomParams();
                customParams.add(0, c0ud.LIZJ, (int) c0ud.LJ);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 5:
                customParams = new CustomParams();
                customParams.add(2, c0ud.LIZJ, (int) c0ud.LJ);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 6:
                customParams = new CustomParams();
                customParams.add(4, c0ud.LIZJ, (int) c0ud.LJ);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 7:
                customParams = new CustomParams();
                i = c0ud.LIZJ;
                i2 = (int) c0ud.LJ;
                i3 = 7;
                customParams.add(i3, i, i2);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 8:
                customParams = new CustomParams();
                i = c0ud.LIZJ;
                i2 = (int) c0ud.LJ;
                i3 = 6;
                customParams.add(i3, i, i2);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 9:
                if (c0ud.LIZJ > 5) {
                    c0ud.LIZJ = 5;
                }
                if (c0ud.LIZJ < 0) {
                    c0ud.LIZJ = 0;
                }
                customParams = new CustomParams();
                customParams.add(9, c0ud.LIZJ, 99999999);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            case 10:
                if (C0NS.GOLD == null || C0NS.SUPER == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("bind tid:");
                    LIZ.append(0);
                    LIZ.append(" to big core");
                    X1D.LIZIZ(LIZ);
                    C0YN.LIZ(3);
                    customParams2 = new CustomParams();
                    customParams2.add(8, 1, 99999999);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("bind tid:");
                    LIZ2.append(0);
                    LIZ2.append(" to little core");
                    X1D.LIZIZ(LIZ2);
                    C0YN.LIZ(3);
                    customParams2 = new CustomParams();
                    customParams2.add(8, 2, 99999999);
                }
                start = this.LIZIZ.start(customParams2);
                return Integer.valueOf(start);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                C0UE c0ue = c0ud.LIZLLL;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("SamSung provider process scene ");
                LIZ3.append(((C0NU) c0ue.LIZ).getDesc());
                X1D.LIZIZ(LIZ3);
                C0YN.LIZ(4);
                switch (C0UH.LIZIZ[((C0NU) c0ue.LIZ).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case 12:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case 14:
                    case 15:
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    case 41:
                    case 42:
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    case C61447O9r.LJIIJ:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        LIZLLL(0);
                        LIZLLL(1);
                        LIZLLL(2);
                        break;
                    default:
                        C0YN.LIZ(5);
                        break;
                }
                return 1;
            case 12:
                customParams = new CustomParams();
                i = c0ud.LIZJ;
                i2 = (int) c0ud.LJ;
                i3 = 10;
                customParams.add(i3, i, i2);
                start = this.LIZIZ.start(customParams);
                return Integer.valueOf(start);
            default:
                C0YN.LIZ(5);
                return 0;
        }
    }

    @Override // X.C0UC
    public final Object LIZIZ(C0UD c0ud) {
        int start;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("restore ability ");
        LIZ.append(c0ud.LIZ.toString());
        X1D.LIZIZ(LIZ);
        C0YN.LIZ(3);
        if (this.LIZIZ == null) {
            return null;
        }
        int i = C0UH.LIZ[c0ud.LIZ.ordinal()];
        if (i != 10) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    start = this.LIZIZ.stop();
                    break;
                default:
                    return 0;
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reset tid:");
            LIZ2.append(0);
            LIZ2.append(" core bind");
            X1D.LIZIZ(LIZ2);
            C0YN.LIZ(3);
            CustomParams customParams = new CustomParams();
            customParams.add(8, 0, 99999999);
            start = this.LIZIZ.start(customParams);
        }
        return Integer.valueOf(start);
    }

    public final int LIZLLL(int i) {
        int i2;
        if (i < 0 || i > 2) {
            C0YN.LIZ(6);
            return -1;
        }
        PerformanceManager performanceManager = this.LIZIZ;
        if (performanceManager == null) {
            return -1;
        }
        if (i != 0) {
            if (i != 1) {
                i2 = 256;
            } else {
                i2 = 128;
            }
        } else {
            i2 = 64;
        }
        return performanceManager.start(i2, LiveEffectMusicFadeDurationSetting.DEFAULT);
    }
}
