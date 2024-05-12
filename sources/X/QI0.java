package X;

import defpackage.i0;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class QI0 {
    public static volatile Boolean LIZ = Boolean.FALSE;

    public static String LIZ(QI2 qi2) {
        if (qi2 == null) {
            return "";
        }
        if (qi2 instanceof QIC) {
            if (!"applog_trace".equals(((QIC) qi2).LLF)) {
                return "EVENT_V3";
            }
            return "TRACE";
        }
        if (qi2 instanceof QID) {
            return "EVENT_V3";
        }
        if (qi2 instanceof QIA) {
            return ((QIA) qi2).LL.toUpperCase(Locale.ROOT);
        }
        if (qi2 instanceof QIH) {
            return "LAUNCH";
        }
        if (qi2 instanceof QIM) {
            return "TERMINATE";
        }
        if (!(qi2 instanceof QIG)) {
            return "";
        }
        return "LOG_DATA";
    }

    public static String LIZLLL(String str) {
        return i0.LJFF("applog_", str);
    }

    public static void LIZIZ(String str, J2V j2v) {
        if (!(!LIZ.booleanValue()) && str.length() > 0) {
            ((J2T) J2T.LJLJJI.LIZLLL(new Object[0])).LJ(LIZLLL(str), j2v);
        }
    }

    public static void LIZJ(Object obj, String str) {
        if (!(!LIZ.booleanValue()) && str.length() > 0) {
            if (obj instanceof QI2) {
                ((J2T) J2T.LJLJJI.LIZLLL(new Object[0])).LJ(LIZLLL(str), new C66751QHr(obj));
            } else {
                ((J2T) J2T.LJLJJI.LIZLLL(new Object[0])).LIZLLL(obj, LIZLLL(str));
            }
        }
    }
}
