package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T83 extends AbstractC03160Am<C74125T7h> {
    @Override // X.AbstractC03160Am
    public final boolean LIZ(C74125T7h c74125T7h, C74125T7h c74125T7h2) {
        C74125T7h c74125T7h3 = c74125T7h;
        C74125T7h c74125T7h4 = c74125T7h2;
        if (!(c74125T7h3 instanceof KKM) || !(c74125T7h4 instanceof KKM)) {
            if ((c74125T7h3 instanceof KKP) && (c74125T7h4 instanceof KKP)) {
                return o.LJ(((KKP) c74125T7h3).LIZLLL, ((KKP) c74125T7h4).LIZLLL);
            }
            if (o.LJ(c74125T7h3.LIZIZ, c74125T7h4.LIZIZ) && c74125T7h3.LIZ == c74125T7h4.LIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(C74125T7h c74125T7h, C74125T7h c74125T7h2) {
        C74125T7h c74125T7h3 = c74125T7h;
        C74125T7h c74125T7h4 = c74125T7h2;
        if (!(c74125T7h3 instanceof KKM) || !(c74125T7h4 instanceof KKM)) {
            if ((c74125T7h3 instanceof KKP) && (c74125T7h4 instanceof KKP)) {
                return o.LJ(((KKP) c74125T7h3).LIZLLL, ((KKP) c74125T7h4).LIZLLL);
            }
            if (o.LJ(c74125T7h3.LIZIZ, c74125T7h4.LIZIZ) && c74125T7h3.LIZ == c74125T7h4.LIZ) {
                return true;
            }
        }
        return false;
    }
}
