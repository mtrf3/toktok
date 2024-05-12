package X;

import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.1Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31751Ml extends C0U4 implements C0UC {
    public static String LIZJ = "";
    public C06980Pe LIZIZ;

    @Override // X.C0UC
    public final boolean LIZJ(C0NR c0nr) {
        C06980Pe c06980Pe = this.LIZIZ;
        return c06980Pe != null && c06980Pe.LIZ().contains(c0nr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r4.LIZIZ() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31751Ml(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31751Ml.<init>(android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // X.C0UC
    public final Object LIZ(C0UD c0ud) {
        ?? r0;
        C03650Cj LIZLLL;
        EnumC03640Ci enumC03640Ci;
        int i = C0U9.LIZ[c0ud.LIZ.ordinal()];
        int i2 = LiveEffectMusicFadeDurationSetting.DEFAULT;
        if (i != 1) {
            int i3 = 0;
            ?? r7 = 0;
            if (i != 2) {
                if (i != 3) {
                    C0YN.LIZ(5);
                    return 1;
                }
                if (C0NS.GOLD == null || C0NS.SUPER == null) {
                    C0YN.LIZ(3);
                    String str = ("{\"hb_bind_tid\":\"" + Long.toString(0)) + "\"}";
                    C0YN.LIZ(4);
                    r7 = C03650Cj.LIZLLL().LIZJ(str);
                }
                return Integer.valueOf((int) r7);
            }
            C0UE c0ue = c0ud.LIZLLL;
            ((C0NU) c0ue.LIZ).getDesc();
            C0YN.LIZ(4);
            switch (C0U9.LIZIZ[((C0NU) c0ue.LIZ).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    LIZLLL = C03650Cj.LIZLLL();
                    enumC03640Ci = EnumC03640Ci.ACTIVITY_SWITCH;
                    LIZLLL.getClass();
                    i3 = LIZLLL.LIZ(8, LiveNetAdaptiveHurryTimeSetting.DEFAULT, enumC03640Ci.ordinal());
                    break;
                case 4:
                    LIZLLL = C03650Cj.LIZLLL();
                    enumC03640Ci = EnumC03640Ci.OTHER_SWITCH;
                    LIZLLL.getClass();
                    i3 = LIZLLL.LIZ(8, LiveNetAdaptiveHurryTimeSetting.DEFAULT, enumC03640Ci.ordinal());
                    break;
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
                    LIZLLL = C03650Cj.LIZLLL();
                    enumC03640Ci = EnumC03640Ci.LOAD_INFO;
                    LIZLLL.getClass();
                    i3 = LIZLLL.LIZ(8, LiveNetAdaptiveHurryTimeSetting.DEFAULT, enumC03640Ci.ordinal());
                    break;
                case 55:
                    C03650Cj LIZLLL2 = C03650Cj.LIZLLL();
                    EnumC03640Ci enumC03640Ci2 = EnumC03640Ci.UPLOAD_INFO;
                    LIZLLL2.getClass();
                    i3 = LIZLLL2.LIZ(9, LiveEffectMusicFadeDurationSetting.DEFAULT, enumC03640Ci2.ordinal());
                    break;
            }
            return Integer.valueOf(i3);
        }
        int i4 = (int) c0ud.LJ;
        if (i4 > 2000) {
            if (i4 <= 6000) {
                i2 = i4;
            }
            C03650Cj LIZLLL3 = C03650Cj.LIZLLL();
            EnumC03640Ci enumC03640Ci3 = EnumC03640Ci.LOAD_INFO;
            LIZLLL3.getClass();
            r0 = LIZLLL3.LIZ(9, i2, enumC03640Ci3.ordinal());
        } else {
            C03650Cj LIZLLL4 = C03650Cj.LIZLLL();
            EnumC03640Ci enumC03640Ci4 = EnumC03640Ci.ACTIVITY_SWITCH;
            LIZLLL4.getClass();
            r0 = LIZLLL4.LIZ(8, i4, enumC03640Ci4.ordinal());
        }
        C0YN.LIZ(4);
        return Integer.valueOf((int) r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0UC
    public final Object LIZIZ(C0UD c0ud) {
        int i;
        int i2 = C0U9.LIZ[c0ud.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 3) {
                return 1;
            }
            C0YN.LIZ(3);
            i = C03650Cj.LIZLLL().LIZJ("{\"hb_unbind_tid\":\"0\"}");
        } else {
            i = C03650Cj.LIZLLL().LIZ(10, -1, -1);
        }
        return Integer.valueOf(i);
    }
}
