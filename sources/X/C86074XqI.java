package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.XqI, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86074XqI implements G36 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public Locale LJFF;

    @Override // X.G36
    public final Locale getLocale() {
        if (this.LJFF == null) {
            this.LJFF = new Locale(this.LIZIZ, this.LIZJ);
        }
        return this.LJFF;
    }

    @Override // X.G36
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.G36
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.G36
    public final String LIZJ() {
        return this.LJ;
    }

    @Override // X.G36
    public final String getLanguage() {
        return this.LIZIZ;
    }

    public /* synthetic */ C86074XqI(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public C86074XqI(String str, String str2, String str3, String str4, String mISO639) {
        o.LJIIIZ(mISO639, "mISO639");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = mISO639;
    }
}
