package Y;

import X.C25510zL;
import X.C64191PHf;
import X.C64206PHu;
import X.C64255PJr;
import X.C66851QLn;
import X.C67005QRl;
import X.C67102QVe;
import X.C68517Qun;
import X.InterfaceC65943PuN;
import X.PP5;
import X.PTL;
import X.Q20;
import X.QSM;
import X.QVZ;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDComparatorS39S0000000_11 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case 9:
                return compare$9(this, obj, obj2);
            case 10:
                return compare$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return compare$11(this, obj, obj2);
            case 12:
                return compare$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return compare$16(this, obj, obj2);
            case 17:
                return compare$17(this, obj, obj2);
            case 18:
                return compare$18(this, obj, obj2);
            case 19:
                return compare$19(this, obj, obj2);
            case 20:
                return compare$20(this, obj, obj2);
            case 21:
                return compare$21(this, obj, obj2);
            case 22:
                return compare$22(this, obj, obj2);
            case 23:
                return compare$23(this, obj, obj2);
            case 24:
                return compare$24(this, obj, obj2);
            case 25:
                return compare$25(this, obj, obj2);
            case 26:
                return compare$26(this, obj, obj2);
            case 27:
                return compare$27(this, obj, obj2);
            case 28:
                return compare$28(this, obj, obj2);
            case 29:
                return compare$29(this, obj, obj2);
            case 30:
                return compare$30(this, obj, obj2);
            case 31:
                return compare$31(this, obj, obj2);
            case 32:
                return compare$32(this, obj, obj2);
            case 33:
                return compare$33(this, obj, obj2);
            case 34:
                return compare$34(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS39S0000000_11(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return (int) (((C64255PJr) obj).LIZIZ - ((C64255PJr) obj2).LIZIZ);
    }

    public static final int compare$1(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return ((Q20) obj).LIZIZ - ((Q20) obj2).LIZIZ;
    }

    public static final int compare$10(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return ((int[]) obj2)[0] - ((int[]) obj)[0];
    }

    public static final int compare$11(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(C68517Qun.LJFF((BaseLoginMethod) obj2)), Long.valueOf(C68517Qun.LJFF((BaseLoginMethod) obj)));
    }

    public static final int compare$12(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(C68517Qun.LJFF((BaseLoginMethod) obj2)), Long.valueOf(C68517Qun.LJFF((BaseLoginMethod) obj)));
    }

    public static final int compare$13(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }

    public static final int compare$14(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }

    public static final int compare$15(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        long j = ((QSM) obj).LIZIZ;
        long j2 = ((QSM) obj2).LIZIZ;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return -1;
        }
        return 1;
    }

    public static final int compare$16(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        int signum;
        PP5 pp5 = (PP5) obj;
        PP5 pp52 = (PP5) obj2;
        pp5.LIZJ();
        pp52.LIZJ();
        pp5.LIZLLL();
        pp52.LIZLLL();
        String[] split = "107.0.5273.2".split("\\.");
        String[] split2 = "107.0.5273.2".split("\\.");
        for (int i = 0; i < split.length && i < split2.length; i++) {
            try {
                int parseInt = CastIntegerProtector.parseInt(split[i]);
                int parseInt2 = CastIntegerProtector.parseInt(split2[i]);
                if (parseInt != parseInt2) {
                    signum = Integer.signum(parseInt - parseInt2);
                    break;
                }
            } catch (NumberFormatException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unable to convert version segments into integers: ");
                LIZ.append(split[i]);
                LIZ.append(" & ");
                LIZ.append(split2[i]);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ), e);
            }
        }
        signum = Integer.signum(split.length - split2.length);
        return -signum;
    }

    public static final int compare$17(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }

    public static final int compare$18(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        int i = ((C25510zL) obj2).LJFF;
        int i2 = ((C25510zL) obj).LJFF;
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static final int compare$19(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((InterfaceC65943PuN) obj).priority()), Integer.valueOf(((InterfaceC65943PuN) obj2).priority()));
    }

    public static final int compare$2(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public static final int compare$20(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return ((String) obj).compareTo((String) obj2);
    }

    public static final int compare$21(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(C68517Qun.LJFF((BaseLoginMethod) obj2)), Long.valueOf(C68517Qun.LJFF((BaseLoginMethod) obj)));
    }

    public static final int compare$22(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return C66851QLn.LJFF(((C67102QVe) obj).cursor.cursor, ((C67102QVe) obj2).cursor.cursor);
    }

    public static final int compare$23(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return C66851QLn.LJFF(((QVZ) obj).ref_cursor, ((QVZ) obj2).ref_cursor);
    }

    public static final int compare$24(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        C67005QRl c67005QRl = (C67005QRl) obj;
        C67005QRl c67005QRl2 = (C67005QRl) obj2;
        if (c67005QRl == null) {
            return 1;
        }
        if (c67005QRl2 != null) {
            if (c67005QRl.equals(c67005QRl2)) {
                return 0;
            }
            if (c67005QRl.LIZIZ > c67005QRl2.LIZIZ) {
                return 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$25(Y.IDComparatorS39S0000000_11 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            int r1 = r5.length()
            int r0 = r6.length()
            int r4 = java.lang.Math.min(r1, r0)
            r3 = 4
        L11:
            r2 = 1
            if (r3 >= r4) goto L25
            char r1 = r5.charAt(r3)
            char r0 = r6.charAt(r3)
            if (r1 == r0) goto L22
            if (r1 >= r0) goto L21
        L20:
            r2 = -1
        L21:
            return r2
        L22:
            int r3 = r3 + 1
            goto L11
        L25:
            int r1 = r5.length()
            int r0 = r6.length()
            if (r1 == r0) goto L32
            if (r1 >= r0) goto L21
            goto L20
        L32:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDComparatorS39S0000000_11.compare$25(Y.IDComparatorS39S0000000_11, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$26(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$27(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$28(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return (int) (((PTL) obj).LIZ - ((PTL) obj2).LIZ);
    }

    public static final int compare$29(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return (int) (((PTL) obj).LIZ - ((PTL) obj2).LIZ);
    }

    public static final int compare$3(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return ((int[]) obj2)[1] - ((int[]) obj)[1];
    }

    public static final int compare$30(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return (int) ((((C64206PHu) obj2).LIZ * 100.0d) - (((C64206PHu) obj).LIZ * 100.0d));
    }

    public static final int compare$31(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$32(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$33(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        long j;
        long time;
        long time2;
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj2;
        Long lastActiveTime = baseLoginMethod.getLastActiveTime();
        if (lastActiveTime != null) {
            j = lastActiveTime.longValue();
        } else {
            j = -1;
        }
        if (j > 0) {
            Long lastActiveTime2 = baseLoginMethod.getLastActiveTime();
            o.LJI(lastActiveTime2);
            time = lastActiveTime2.longValue();
        } else {
            time = baseLoginMethod.getExpires().getTime() - 2592000000L;
        }
        Long valueOf = Long.valueOf(time);
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) obj;
        Long lastActiveTime3 = baseLoginMethod2.getLastActiveTime();
        if (lastActiveTime3 != null && lastActiveTime3.longValue() > 0) {
            Long lastActiveTime4 = baseLoginMethod2.getLastActiveTime();
            o.LJI(lastActiveTime4);
            time2 = lastActiveTime4.longValue();
        } else {
            time2 = baseLoginMethod2.getExpires().getTime() - 2592000000L;
        }
        return C66851QLn.LJFF(valueOf, Long.valueOf(time2));
    }

    public static final int compare$34(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        return (int) ((((C64191PHf) obj2).LIZLLL * 100.0d) - (((C64191PHf) obj).LIZLLL * 100.0d));
    }

    public static final int compare$4(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$5(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$6(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$7(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$8(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$9(IDComparatorS39S0000000_11 iDComparatorS39S0000000_11, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }
}
