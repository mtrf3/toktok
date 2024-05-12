package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJI {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final int LJI;
    public final boolean LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public TJI() {
        throw null;
    }

    public TJI(String category, int i, int i2, int i3, boolean z, java.util.Map map, int i4) {
        String version;
        i = (i4 & 2) != 0 ? 0 : i;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        i3 = (i4 & 8) != 0 ? 0 : i3;
        if ((i4 & 16) != 0) {
            version = "";
        } else {
            version = null;
        }
        z = (i4 & 128) != 0 ? false : z;
        map = (i4 & 256) != 0 ? null : map;
        o.LJIIIZ(category, "category");
        o.LJIIIZ(version, "version");
        this.LIZ = category;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = version;
        this.LJFF = false;
        this.LJI = 0;
        this.LJII = z;
        this.LJIIIIZZ = map;
    }
}
