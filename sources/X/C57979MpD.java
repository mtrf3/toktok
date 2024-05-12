package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MpD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57979MpD extends AbstractC57990MpO {
    public boolean LIZ = false;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Dynamic(");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    @Override // X.AbstractC57990MpO
    public final C57971Mp5 LIZ(C57971Mp5 c57971Mp5, C57971Mp5 nextPage) {
        o.LJIIIZ(nextPage, "nextPage");
        if (this.LIZ) {
            return C57965Moz.LIZ.LIZ(c57971Mp5, nextPage);
        }
        return C57984MpI.LIZ.LIZ(c57971Mp5, nextPage);
    }
}
