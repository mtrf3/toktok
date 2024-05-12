package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEA {
    public static final String LIZ() {
        StringBuilder sb = new StringBuilder("v");
        String LIZLLL = EF7.LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = "1.0";
        }
        sb.append(LIZLLL);
        sb.append(" Build ");
        sb.append(EF7.LJIILIIL);
        sb.append("_");
        sb.append(C39532FfM.LIZJ(EF7.LIZIZ()).LIZIZ("release_build", ""));
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }
}
