package X;

import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* renamed from: X.Ec5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36781Ec5 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0047. Please report as an issue. */
    public static void LIZ(int i, String str, String str2, String str3, String file, String function) {
        o.LJIIJ(file, "file");
        o.LJIIJ(function, "function");
        StringBuilder sb = new StringBuilder(str.length() + 100);
        YE1.LIZLLL(sb, "[", file, ", ", function);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        sb.append(str);
        String sb2 = sb.toString();
        o.LJFF(sb2, "builder.toString()");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("web_");
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        switch (str3.hashCode()) {
            case 3237038:
                if (str3.equals("info")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(LIZIZ, sb2);
                    return;
                }
                throw new IllegalArgumentException("Illegal level!");
            case 3641990:
                if (str3.equals("warn")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(LIZIZ, sb2);
                    return;
                }
                throw new IllegalArgumentException("Illegal level!");
            case 95458899:
                if (str3.equals("debug")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(LIZIZ, sb2);
                    return;
                }
                throw new IllegalArgumentException("Illegal level!");
            case 96784904:
                if (str3.equals("error")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(LIZIZ, sb2);
                    return;
                }
                throw new IllegalArgumentException("Illegal level!");
            case 351107458:
                if (str3.equals("verbose")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(LIZIZ, sb2);
                    return;
                }
                throw new IllegalArgumentException("Illegal level!");
            default:
                throw new IllegalArgumentException("Illegal level!");
        }
    }
}
