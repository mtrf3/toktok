package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WS0 {
    public final Object LIZ;
    public final Object LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Object LJI;
    public boolean LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomTabIndexChangeEvent{fromTag=");
        LIZ.append(this.LIZ);
        LIZ.append(", toTag=");
        return U26.LIZJ(LIZ, this.LIZIZ, '}', LIZ);
    }

    public WS0(Object obj, Object tag, int i, boolean z, boolean z2, boolean z3, Object parentTag) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(parentTag, "parentTag");
        this.LIZ = obj;
        this.LIZIZ = tag;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = parentTag;
    }

    public /* synthetic */ WS0(Object obj, Object obj2, int i, boolean z, boolean z2, boolean z3, Object obj3, int i2) {
        this(obj, obj2, i, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? obj2 : obj3);
    }
}
