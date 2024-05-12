package X;

import kotlin.jvm.internal.o;
import uw.s;

/* loaded from: classes6.dex */
public class CSH<MODEL extends s> {
    public MODEL LIZ;
    public Object LIZIZ;
    public boolean LIZJ = true;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinnedModel(");
        LIZ.append(hashCode());
        LIZ.append(", messageModel=");
        LIZ.append(LIZ());
        LIZ.append(", payload=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFolded=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bindCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hasPined=");
        LIZ.append(this.LJ);
        LIZ.append(", isUnPin=");
        LIZ.append(this.LJFF);
        LIZ.append(", hasExpanded=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public MODEL LIZ() {
        return this.LIZ;
    }

    public CSH(MODEL model) {
        this.LIZ = model;
    }

    public void LIZIZ(MODEL model) {
        o.LJIIIZ(model, "<set-?>");
        this.LIZ = model;
    }
}
