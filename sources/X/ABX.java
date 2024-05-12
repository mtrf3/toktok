package X;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class ABX implements G36 {
    public final String LIZ;
    public final String LIZIZ;
    public Locale LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    @Override // X.G36
    public final Locale getLocale() {
        if (this.LIZJ == null) {
            this.LIZJ = new Locale(this.LIZ, this.LIZLLL);
        }
        return this.LIZJ;
    }

    @Override // X.G36
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.G36
    public final String LIZIZ() {
        return this.LJ;
    }

    @Override // X.G36
    public final String LIZJ() {
        return this.LJFF;
    }

    @Override // X.G36
    public final String getLanguage() {
        return this.LIZ;
    }

    public ABX(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public ABX(String str, String str2, String str3, String str4, String str5) {
        this.LIZIZ = str;
        this.LIZ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
