package X;

import android.os.Vibrator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.1Mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31761Mm extends C0U4 implements C0UC {
    public C06980Pe LIZIZ;

    @Override // X.C0UC
    public final boolean LIZJ(C0NR c0nr) {
        C06980Pe c06980Pe = this.LIZIZ;
        return c06980Pe != null && c06980Pe.LIZ().contains(c0nr);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31761Mm(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31761Mm.<init>(android.content.Context):void");
    }

    @Override // X.C0UC
    public final Object LIZ(C0UD c0ud) {
        StringBuilder LIZ;
        String str;
        switch (C0UA.LIZ[c0ud.LIZ.ordinal()]) {
            case 1:
                C0S1.LIZ.LJJLIIIJL(c0ud.LJ);
                return 1;
            case 2:
                C0S1.LIZ.LJJL(c0ud.LJ);
                return 1;
            case 3:
                C0S1.LIZ.LJJLIIIJLLLLLLLZ(c0ud.LJ);
                return 1;
            case 4:
                int i = c0ud.LIZJ;
                if (i > 19 || i < -20) {
                    C0YN.LIZ(5);
                }
                StringBuilder LJ = C7MY.LJ("set tid:", 0, " to priority ");
                LJ.append(c0ud.LIZJ);
                X1D.LIZIZ(LJ);
                break;
            case 5:
                if (C0NS.GOLD == null || C0NS.SUPER == null) {
                    LIZ = X1D.LIZ();
                    LIZ.append("bind tid:");
                    LIZ.append(0);
                    str = " to big core";
                } else {
                    if (C0NS.SILVER == null) {
                        LIZ = X1D.LIZ();
                        LIZ.append("bind tid:");
                        LIZ.append(0);
                        str = " to little core";
                    }
                    return 1;
                }
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                break;
            case 6:
                throw null;
            case 7:
                C0UE c0ue = c0ud.LIZLLL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Platform provider process scene ");
                LIZ2.append(((C0NU) c0ue.LIZ).getDesc());
                X1D.LIZIZ(LIZ2);
                C0YN.LIZ(4);
                switch (C0UA.LIZIZ[((C0NU) c0ue.LIZ).ordinal()]) {
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
                        if (c0ue.LIZIZ == C0NW.BEGIN) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("begin boost for ");
                            LIZ3.append(((C0NU) c0ue.LIZ).getDesc());
                            X1D.LIZIZ(LIZ3);
                            C0YN.LIZ(3);
                            C0S1.LIZ.a();
                            break;
                        } else {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("end boost for ");
                            LIZ4.append(((C0NU) c0ue.LIZ).getDesc());
                            X1D.LIZIZ(LIZ4);
                            C0YN.LIZ(3);
                            C0S1.LIZ.b();
                            break;
                        }
                    default:
                        C0YN.LIZ(5);
                        break;
                }
                return 1;
            default:
                C0YN.LIZ(5);
                return 1;
        }
        C0YN.LIZ(3);
        return 1;
    }

    @Override // X.C0UC
    public final Object LIZIZ(C0UD c0ud) {
        StringBuilder LIZ;
        String str;
        switch (C0UA.LIZ[c0ud.LIZ.ordinal()]) {
            case 1:
            case 2:
            case 3:
                C0S1.LIZ.b();
                break;
            case 4:
                LIZ = X1D.LIZ();
                LIZ.append("reset tid:");
                LIZ.append(0);
                str = " priority";
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                C0YN.LIZ(3);
                break;
            case 5:
                LIZ = X1D.LIZ();
                LIZ.append("reset tid:");
                LIZ.append(0);
                str = " core bind";
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                C0YN.LIZ(3);
                break;
            case 6:
                C0YN.LIZ(3);
                Vibrator vibrator = C0S6.LIZ;
                if (vibrator == null) {
                    C0YN.LIZ(6);
                    break;
                } else {
                    vibrator.cancel();
                    break;
                }
            case 7:
                C0S1.LIZ.b();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("release boost for ");
                LIZ2.append(((C0NU) c0ud.LIZLLL.LIZ).getDesc());
                X1D.LIZIZ(LIZ2);
                C0YN.LIZ(4);
                break;
            default:
                C0YN.LIZ(5);
                break;
        }
        return 1;
    }
}
