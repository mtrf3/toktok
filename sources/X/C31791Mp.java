package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.1Mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31791Mp extends C0U4 implements C0UC {
    public static String LIZJ = "";
    public C06980Pe LIZIZ;

    @Override // X.C0UC
    public final boolean LIZJ(C0NR c0nr) {
        C06980Pe c06980Pe = this.LIZIZ;
        return c06980Pe != null && c06980Pe.LIZ().contains(c0nr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(11:55|(1:57)(2:58|(1:60))|4|5|6|7|8|(3:10|11|(5:13|(4:16|(2:22|23)(2:25|(1:36)(3:27|28|(3:33|34|35)(3:30|31|32)))|24|14)|39|40|(3:42|43|45)(1:50))(1:51))|53|11|(0)(0))|3|4|5|6|7|8|(0)|53|11|(0)(0)|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #1 {Exception -> 0x0046, blocks: (B:6:0x002e, B:8:0x0032, B:10:0x003d), top: B:5:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31791Mp(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31791Mp.<init>(android.content.Context):void");
    }

    @Override // X.C0UC
    public final Object LIZ(C0UD c0ud) {
        int i = C0UI.LIZ[c0ud.LIZ.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 6) {
                    C0YN.LIZ(5);
                } else {
                    throw null;
                }
            } else {
                C0UE c0ue = c0ud.LIZLLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VoBoost provider process scene ");
                LIZ.append(((C0NU) c0ue.LIZ).getDesc());
                X1D.LIZIZ(LIZ);
                C0YN.LIZ(4);
                switch (C0UI.LIZIZ[((C0NU) c0ue.LIZ).ordinal()]) {
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
                        C04190El.LIZ(11, 10000, 4, null);
                        break;
                }
                return 1;
            }
        } else {
            int i2 = (int) c0ud.LJ;
            C04190El.LIZ(12, 10000, 4, null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VoBoost provider process cpu_freq_min request with timeout ");
            LIZ2.append(i2);
            X1D.LIZIZ(LIZ2);
            C0YN.LIZ(4);
        }
        return 1;
    }

    @Override // X.C0UC
    public final Object LIZIZ(C0UD c0ud) {
        int i = C0UI.LIZ[c0ud.LIZ.ordinal()];
        if (i != 3 && i != 4) {
            if (i != 6) {
                C0YN.LIZ(5);
            }
        } else {
            C04190El.LIZ(13, 0, 0, null);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release boost for ");
            LIZ.append(((C0NU) c0ud.LIZLLL.LIZ).getDesc());
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(4);
        }
        return 1;
    }
}
