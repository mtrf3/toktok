package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.4M6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4M6 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public String LJI;
    public int LJII;
    public int LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{isGroup=");
        LIZ.append(this.LIZ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scene=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", uri=");
        LIZ.append(this.LJI);
        LIZ.append(", loadStatus=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", this=");
        LIZ.append(hashCode());
        LIZ.append(", loader=");
        return b0.LIZJ(LIZ, this.LJFF, '}', LIZ);
    }

    public C4M6(String bondUid, int i, boolean z, int i2, int i3, String scene) {
        o.LJIIIZ(bondUid, "bondUid");
        o.LJIIIZ(scene, "scene");
        this.LIZ = z;
        this.LIZIZ = bondUid;
        this.LIZJ = i;
        this.LIZLLL = scene;
        this.LJ = i2;
        this.LJFF = i3;
    }
}
