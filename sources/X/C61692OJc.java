package X;

import java.util.Locale;

/* renamed from: X.OJc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61692OJc {
    public final String LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    public final void LIZLLL() {
        while (this.LIZJ < this.LIZ.length() && " \t".indexOf(this.LIZ.charAt(this.LIZJ)) != -1) {
            this.LIZJ++;
        }
    }

    public final boolean LIZJ() {
        LIZLLL();
        if (this.LIZJ < this.LIZ.length() && this.LIZ.charAt(this.LIZJ) == '=') {
            this.LIZJ++;
            return true;
        }
        return false;
    }

    public C61692OJc(String str) {
        this.LIZ = str;
        this.LIZIZ = str.toLowerCase(Locale.US);
    }

    public final int LIZ(String str) {
        for (int i = this.LIZJ; i < this.LIZ.length(); i++) {
            if (str.indexOf(this.LIZ.charAt(i)) != -1) {
                return i;
            }
        }
        return this.LIZ.length();
    }

    public final String LIZIZ(boolean z) {
        String str;
        String str2;
        LIZLLL();
        int LIZ = LIZ(",;= \t");
        if (z) {
            str = this.LIZIZ;
        } else {
            str = this.LIZ;
        }
        int i = this.LIZJ;
        if (i < LIZ) {
            str2 = str.substring(i, LIZ);
        } else {
            str2 = null;
        }
        this.LIZJ = LIZ;
        return str2;
    }
}
