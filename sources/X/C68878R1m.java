package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.b1;
import java.util.Date;
import java.util.List;

/* renamed from: X.R1m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68878R1m {
    public static final C68883R1r LJIIIIZZ = new C68883R1r();
    public String LIZ;
    public String LIZIZ;
    public int LIZLLL;
    public List<String> LJ;
    public String LJFF;
    public Throwable LJII;
    public int LIZJ = 1;
    public long LJI = System.currentTimeMillis();

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        if (this.LJI > 0) {
            str = LJIIIIZZ.get().format(new Date(this.LJI));
        } else {
            str = "--";
        }
        LIZ.append(str);
        LIZ.append("][");
        int i = this.LIZJ;
        String str5 = "";
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str2 = "";
                            } else {
                                str2 = "ASSERT";
                            }
                        } else {
                            str2 = "ERROR";
                        }
                    } else {
                        str2 = "WARN";
                    }
                } else {
                    str2 = "INFO";
                }
            } else {
                str2 = "DEBUG";
            }
        } else {
            str2 = "VERBOSE";
        }
        LIZ.append(str2);
        LIZ.append("][");
        String str6 = this.LIZ;
        if (str6 == null) {
            str6 = "";
        } else {
            str6.toString();
        }
        LIZ.append(str6);
        LIZ.append("][");
        String str7 = this.LIZIZ;
        if (str7 == null) {
            str7 = "";
        } else {
            str7.toString();
        }
        LIZ.append(str7);
        LIZ.append("][");
        switch (this.LIZLLL) {
            case 1:
                str3 = "DEVICE_REGISTER";
                break;
            case 2:
                str3 = "ABTEST";
                break;
            case 3:
                str3 = "ALINK";
                break;
            case 4:
                str3 = "EVENT";
                break;
            case 5:
                str3 = "DATABASE";
                break;
            case 6:
                str3 = "EVENT_VERIFY";
                break;
            case 7:
                str3 = "VIEW_EXPOSURE";
                break;
            case 8:
                str3 = "MONITOR";
                break;
            case 9:
                str3 = "USER_PROFILE";
                break;
            case 10:
                str3 = "PICKER";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                str3 = "REQUEST";
                break;
            case 12:
                str3 = "EVENT_SAMPLING";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                str3 = "EVENT_PRIORITY";
                break;
            case 14:
                str3 = "COMPRESS";
                break;
            case 15:
                str3 = "ONE_ID";
                break;
            default:
                str3 = "DEFAULT";
                break;
        }
        LIZ.append(str3);
        LIZ.append("][");
        List<String> list = this.LJ;
        if (list == null || list.size() <= 0) {
            str4 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < this.LJ.size(); i2++) {
                sb.append((String) ListProtector.get(this.LJ, i2));
                if (i2 < this.LJ.size() - 1) {
                    sb.append(",");
                }
            }
            str4 = sb.toString();
        }
        LIZ.append(str4);
        LIZ.append("] ");
        String str8 = this.LJFF;
        if (str8 != null) {
            str8.toString();
            str5 = str8;
        }
        LIZ.append(str5);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (this.LJII != null) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, "\nstacktrace: ");
            StringBuilder sb2 = new StringBuilder();
            for (Throwable th = this.LJII; th != null; th = th.getCause()) {
                sb2.append(th.toString());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    sb2.append("\n\tat ");
                    sb2.append(stackTraceElement);
                }
            }
            LIZJ.append(sb2.toString());
            return X1D.LIZIZ(LIZJ);
        }
        return LIZIZ;
    }
}
