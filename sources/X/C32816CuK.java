package X;

import defpackage.q;
import java.util.LinkedList;

/* renamed from: X.CuK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32816CuK {
    public final LinkedList<UVP> LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public boolean LJI;
    public int LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;

    public final UV2 LIZIZ() {
        UVP uvp = (UVP) ORZ.LJLLLL(this.LIZ);
        if (uvp != null) {
            return uvp.LIZ;
        }
        return null;
    }

    public final String LIZ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Task(size:");
        LIZ.append(this.LIZ.size());
        LIZ.append(" candidate:");
        UVP uvp = (UVP) ORZ.LJLLLL(this.LIZ);
        if (uvp == null || (str = uvp.LIZ()) == null) {
            str = "";
        }
        return q.LIZIZ(LIZ, str, ')', LIZ);
    }

    public C32816CuK(UVP... uvpArr) {
        LinkedList<UVP> linkedList = new LinkedList<>();
        ORS.LJJLIIIJJIZ(linkedList, uvpArr);
        this.LIZ = linkedList;
    }
}
