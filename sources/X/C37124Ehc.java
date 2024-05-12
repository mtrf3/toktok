package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Ehc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37124Ehc extends AbstractC37134Ehm {
    public final Locale LJIILLIIL;

    @Override // X.AbstractC37134Ehm
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.AbstractC37134Ehm
    public final boolean LIZLLL() {
        return C37130Ehi.LJIIL(this.LJIILLIIL);
    }

    @Override // X.AbstractC37134Ehm
    public final void LJFF(java.util.Map<String, String> map) {
        map.put("name", "df_language");
        String language = this.LJIILLIIL.getLanguage();
        o.LJIIIIZZ(language, "locale.language");
        map.put("language", language);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37124Ehc(java.util.Locale r10, boolean r11, boolean r12, X.InterfaceC37135Ehn r13, X.F5R r14) {
        /*
            r9 = this;
            java.lang.String r0 = "downloadConfig"
            r7 = r14
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "df_language_"
            r1.append(r0)
            java.lang.String r0 = r10.getLanguage()
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "com.ss.android.ugc.aweme.dflanguage."
            r1.append(r0)
            java.lang.String r0 = r10.getLanguage()
            r1.append(r0)
            java.lang.String r3 = X.X1D.LIZIZ(r1)
            r8 = 1
            r4 = r11
            r1 = r9
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.LJIILLIIL = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37124Ehc.<init>(java.util.Locale, boolean, boolean, X.Ehn, X.F5R):void");
    }
}
