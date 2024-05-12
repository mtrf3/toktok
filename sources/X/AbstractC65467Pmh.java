package X;

import java.util.logging.Logger;

/* renamed from: X.Pmh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65467Pmh {
    public static final Logger LIZIZ = Logger.getLogger(AbstractC65467Pmh.class.getName());
    public final String LIZ;

    public AbstractC65467Pmh(AbstractC65468Pmi abstractC65468Pmi) {
        String str = abstractC65468Pmi.LIZLLL;
        C77357UXp.LJI(str, "root URL cannot be null.");
        if (!str.endsWith("/")) {
            str.concat("/");
        }
        LIZ(abstractC65468Pmi.LJ);
        String str2 = abstractC65468Pmi.LJFF;
        if (str2 == null || str2.length() == 0) {
            LIZIZ.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.LIZ = abstractC65468Pmi.LJFF;
        if (abstractC65468Pmi.LIZIZ == null) {
            abstractC65468Pmi.LIZ.getClass();
        } else {
            abstractC65468Pmi.LIZ.getClass();
        }
    }

    public static String LIZ(String str) {
        C77357UXp.LJI(str, "service path cannot be null");
        if (str.length() == 1) {
            C77357UXp.LIZLLL("service path must equal \"/\" if it is of length 1.", "/".equals(str));
            return "";
        }
        if (str.length() <= 0) {
            return str;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            return str;
        }
        return str.substring(1);
    }
}
