package X;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Lhi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54966Lhi {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;
    public static String LIZLLL = "";
    public static Boolean LJ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if (r3.equals("infinix") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013f, code lost:
    
        r0 = "transsion";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        if (r3.equals("tecno") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013b, code lost:
    
        if (r3.equals("itel") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54966Lhi.LIZ():boolean");
    }

    public static boolean LIZIZ() {
        boolean LIZIZ2;
        if (LJ == null) {
            String BRAND = Build.BRAND;
            o.LJIIIIZZ(BRAND, "BRAND");
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            String lowerCase = BRAND.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String MODEL = Build.MODEL;
            o.LJIIIIZZ(MODEL, "MODEL");
            Locale locale2 = Locale.getDefault();
            o.LJIIIIZZ(locale2, "getDefault()");
            String lowerCase2 = MODEL.toLowerCase(locale2);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (!o.LJ(lowerCase, "samsung")) {
                LIZIZ2 = false;
            } else {
                LIZIZ2 = C54965Lhh.LIZIZ(lowerCase2, new String[]{"sm-f7310", "sm-f731b", "sm-f731b", "sm-f731be", "sm-f731be", "sm-f731be", "sm-f731be", "sc-54d", "scg23", "sm-f731n", "sm-f731u", "sm-f731u1", "sm-f731w", "sc-54b", "sc-54c", "scg12", "scg17", "sm-f7110", "sm-f711b", "sm-f711n", "sm-f711u", "sm-f711u1", "sm-f711w", "sm-f7210", "sm-f721b", "sm-f721be", "sm-f721c", "sm-f721n", "sm-f721u", "sm-f721u1", "sm-f721w"});
            }
            LJ = Boolean.valueOf(LIZIZ2);
        }
        return o.LJ(LJ, Boolean.TRUE);
    }

    public static boolean LIZJ() {
        boolean z;
        if (LIZIZ == null) {
            if (LIZ() && o.LJ(LIZLLL, "samsung")) {
                z = true;
            } else {
                z = false;
            }
            LIZIZ = Boolean.valueOf(z);
        }
        return o.LJ(LIZIZ, Boolean.TRUE);
    }
}
