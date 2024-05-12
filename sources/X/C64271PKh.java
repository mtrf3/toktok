package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.StringReader;
import java.util.Properties;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* renamed from: X.PKh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64271PKh {
    public static String LIZ = "0";
    public static String LIZIZ = "0";
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static String LJIILIIL;
    public static String LJIILJJIL;
    public static String LJIILL;
    public static String LJIILLIIL;
    public static String LJIIZILJ;
    public static String LJIJ;
    public static String LJIJI;

    public static String LIZLLL(int i) {
        switch (i) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return "LOW_MEMORY";
            case 4:
                return "APP CRASH(EXCEPTION)";
            case 5:
                return "APP CRASH(NATIVE)";
            case 6:
                return "ANR";
            case 7:
                return "INITIALIZATION FAILURE";
            case 8:
                return "PERMISSION CHANGE";
            case 9:
                return "EXCESSIVE RESOURCE USAGE";
            case 10:
                return "USER REQUESTED";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "USER STOPPED";
            case 12:
                return "DEPENDENCY DIED";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "OTHER KILLS BY SYSTEM";
            case 14:
                return "FREEZER";
            default:
                return "UNKNOWN";
        }
    }

    public static String LJ(int i) {
        switch (i) {
            case 1:
                return "WAIT FOR DEBUGGER";
            case 2:
                return "TOO MANY CACHED PROCS";
            case 3:
                return "TOO MANY EMPTY PROCS";
            case 4:
                return "TRIM EMPTY";
            case 5:
                return "LARGE CACHED";
            case 6:
                return "MEMORY PRESSURE";
            case 7:
                return "EXCESSIVE CPU USAGE";
            case 8:
                return "SYSTEM UPDATE_DONE";
            case 9:
                return "KILL ALL FG";
            case 10:
                return "KILL ALL BG EXCEPT";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "KILL UID";
            case 12:
                return "KILL PID";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "INVALID START";
            case 14:
                return "INVALID STATE";
            case 15:
                return "IMPERCEPTIBLE";
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return "REMOVE LRU";
            case 17:
                return "ISOLATED NOT NEEDED";
            case 18:
                return "CACHED IDLE FORCED APP STANDBY";
            case 19:
                return "FREEZER BINDER IOCTL";
            case 20:
                return "FREEZER BINDER TRANSACTION";
            case 21:
                return "FORCE STOP";
            case 22:
                return "REMOVE TASK";
            case 23:
                return "STOP APP";
            case 24:
                return "KILL BACKGROUND";
            case 25:
                return "PACKAGE UPDATE";
            default:
                return "UNKNOWN";
        }
    }

    public static void LIZ(String str) {
        try {
            Matcher matcher = PatternProtector.compile("timestamp=(.*?) pid=(.*?) realUid=(.*?) packageUid=(.*?) definingUid=(.*?) user=(.*?) process=(.*?) reason=(.*?) \\((.*?)\\) subreason=(.*?) \\((.*?)\\) status=(.*?) importance=(.*?) pss=(.*?) rss=(.*?) description=(.*?) state=(.*?) trace=(.*)").matcher(str);
            if (matcher.find()) {
                LIZJ = matcher.group(1);
                LIZLLL = matcher.group(2);
                LJ = matcher.group(3);
                LJFF = matcher.group(4);
                LJI = matcher.group(5);
                LJII = matcher.group(6);
                LJIIIIZZ = matcher.group(7);
                LJIIIZ = matcher.group(8);
                LJIIJ = matcher.group(9);
                LJIIJJI = matcher.group(10);
                LJIIL = matcher.group(11);
                LJIILIIL = matcher.group(12);
                LJIILJJIL = matcher.group(13);
                LJIILL = matcher.group(14);
                LJIILLIIL = matcher.group(15);
                LJIIZILJ = matcher.group(16);
                LJIJ = matcher.group(17);
                LJIJI = matcher.group(18);
                if (LJIIJ != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("KillInfo: mTimestamp:");
                    LIZ2.append(LIZJ);
                    LIZ2.append(" mPid:");
                    LIZ2.append(LIZLLL);
                    LIZ2.append(" mProcess:");
                    LIZ2.append(LJIIIIZZ);
                    LIZ2.append(" mReason:");
                    LIZ2.append(LJIIJ);
                    LIZ2.append(" mSubreason:");
                    LIZ2.append(LJIIL);
                    LIZ2.append(" mDescription:");
                    LIZ2.append(LJIIZILJ);
                    LIZ2.append(" mStatus:");
                    LIZ2.append(LJIILIIL);
                    LIZ2.append(" mImportance:");
                    LIZ2.append(LJIILJJIL);
                    LIZ2.append(" mPss:");
                    LIZ2.append(LJIILL);
                    LIZ2.append(" mRss:");
                    LIZ2.append(LJIILLIIL);
                    LIZ2.append(" mRealUid:");
                    LIZ2.append(LJ);
                    LIZ2.append(" mPackageUid:");
                    LIZ2.append(LJFF);
                    LIZ2.append(" mDefiningUid:");
                    LIZ2.append(LJI);
                    LIZ2.append(" mUser:");
                    LIZ2.append(LJII);
                    LIZ2.append(" mState:");
                    LIZ2.append(LJIJ);
                    LIZ2.append(" mTrace:");
                    LIZ2.append(LJIJI);
                    X1D.LIZIZ(LIZ2);
                    C78685UuP.LJLILLLLZI();
                }
            }
        } catch (Throwable th) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("KillInfo err: ");
            LIZ3.append(th);
            X1D.LIZIZ(LIZ3);
            C78685UuP.LJLILLLLZI();
        }
    }

    public static String LIZJ(String str) {
        if (str != null) {
            try {
                if ("0.00".equals(str) || CardStruct.IStatusCode.DEFAULT.equals(str)) {
                    return "not obtained";
                }
                Long valueOf = Long.valueOf(CastLongProtector.parseLong(str.substring(0, str.indexOf("MB"))));
                if (valueOf.longValue() >= 1) {
                    if (valueOf.longValue() <= 30) {
                        return "[1~30MB]";
                    }
                    if (valueOf.longValue() > 30 && valueOf.longValue() <= 60) {
                        return "(30~100MB]";
                    }
                    if (valueOf.longValue() > 60 && valueOf.longValue() <= 100) {
                        return "(60~100MB]";
                    }
                    if (valueOf.longValue() > 100 && valueOf.longValue() <= 200) {
                        return "(100~150MB]";
                    }
                    if (valueOf.longValue() > 200 && valueOf.longValue() <= 300) {
                        return "(200~300MB]";
                    }
                    if (valueOf.longValue() > 300 && valueOf.longValue() <= 400) {
                        return "(300~400MB]";
                    }
                    if (valueOf.longValue() > 400 && valueOf.longValue() <= 500) {
                        return "(400~500MB]";
                    }
                    if (valueOf.longValue() > 500 && valueOf.longValue() <= 600) {
                        return "(500~600MB]";
                    }
                    if (valueOf.longValue() > 600 && valueOf.longValue() <= 700) {
                        return "(600~700MB]";
                    }
                    if (valueOf.longValue() > 700 && valueOf.longValue() <= 800) {
                        return "(700~800MB]";
                    }
                    if (valueOf.longValue() > 800 && valueOf.longValue() <= 900) {
                        return "(800~900MB]";
                    }
                    if (valueOf.longValue() > 900 && valueOf.longValue() <= 1000) {
                        return "(900~1000MB]";
                    }
                    if (valueOf.longValue() > 1000 && valueOf.longValue() <= 1500) {
                        return "(1GB~1.5GB]";
                    }
                    if (valueOf.longValue() > 1500 && valueOf.longValue() <= 2000) {
                        return "(1.5GB~2GB]";
                    }
                    if (valueOf.longValue() > 2000 && valueOf.longValue() <= 3000) {
                        return "(2GB~3GB]";
                    }
                    if (valueOf.longValue() > 3000 && valueOf.longValue() <= 4000) {
                        return "(3GB~4GB]";
                    }
                    if (valueOf.longValue() > 4000 && valueOf.longValue() <= 6000) {
                        return "(4GB~6GB]";
                    }
                    if (valueOf.longValue() > 6000) {
                        if (valueOf.longValue() <= 8000) {
                            return "(6GB~8GB]";
                        }
                    }
                    return ">8G";
                }
                return "< 1MB";
            } catch (Throwable unused) {
                return "invalid";
            }
        }
        return "not obtained";
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        try {
            PKN.LJIILIIL("true", "filters", "has_exit_info", jSONObject);
            Properties properties = new Properties();
            try {
                properties.load(new StringReader(str));
            } catch (Throwable th) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("KillInfo prop.load err: ");
                LIZ2.append(th);
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJLILLLLZI();
            }
            properties.getProperty("reason", "not obtained");
            CastIntegerProtector.parseInt(properties.getProperty("sub_reason", "not obtained"));
            LJIILL = properties.getProperty("pss", "not obtained");
            LJIILLIIL = properties.getProperty("rss", "not obtained");
            LIZ = LIZJ(LJIILL);
            LIZIZ = LIZJ(LJIILLIIL);
            String str2 = LJIIJ;
            if (str2 == null) {
                str2 = "not obtained";
            }
            PKN.LJIILIIL(str2, "filters", "exit_reason", jSONObject);
            String str3 = LJIIL;
            if (str3 == null) {
                str3 = "not obtained";
            }
            PKN.LJIILIIL(str3, "filters", "exit_sub_reason", jSONObject);
            PKN.LJIILIIL(properties.getProperty("status", "not obtained"), "filters", "exit_status", jSONObject);
            PKN.LJIILIIL(LIZ, "filters", "exit_pss", jSONObject);
            PKN.LJIILIIL(LIZIZ, "filters", "exit_rss", jSONObject);
        } catch (Throwable th2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("KillInfo filterExitReason err");
            LIZ3.append(th2);
            X1D.LIZIZ(LIZ3);
            C78685UuP.LJLILLLLZI();
        }
    }
}
