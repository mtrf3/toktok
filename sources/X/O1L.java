package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class O1L {
    public C51587KMl LIZ;
    public long LIZIZ;
    public Integer LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public InterfaceC60323Nlv LJIIJ;
    public String LJIIJJI;
    public AbstractC60548NpY LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[loaderConfig=");
        LIZ.append(this.LIZ);
        LIZ.append(", dynamic=");
        LIZ.append(this.LIZJ);
        LIZ.append(',');
        LIZ.append("onlyLocal=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", channel=");
        Q89.LIZIZ(LIZ, this.LJ, ',', "bundle=");
        LIZ.append(this.LJFF);
        LIZ.append(", group=");
        LIZ.append(this.LJI);
        LIZ.append(",cdnUrl=");
        Q89.LIZIZ(LIZ, this.LJII, ',', "enableCached:");
        return C48339Iy7.LIZJ(LIZ, this.LJIILIIL, ']', LIZ);
    }

    public O1L(String accessKey) {
        o.LJIIJ(accessKey, "accessKey");
        this.LJIILJJIL = accessKey;
        this.LIZ = new C51587KMl(false);
        this.LIZIZ = 1000L;
        this.LJ = "";
        this.LJFF = "";
        this.LJII = "";
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
        this.LJIIJJI = "";
        this.LJIILIIL = true;
    }

    public void LIZ(O1L config) {
        o.LJIIJ(config, "config");
        this.LIZ = config.LIZ;
        this.LIZIZ = config.LIZIZ;
        this.LIZJ = config.LIZJ;
        this.LIZLLL = config.LIZLLL;
        this.LJ = config.LJ;
        this.LJFF = config.LJFF;
        this.LJI = config.LJI;
        this.LJII = config.LJII;
        this.LJIIJ = config.LJIIJ;
        this.LJIILIIL = config.LJIILIIL;
        this.LJIIJJI = config.LJIIJJI;
    }

    public final void LIZIZ(String str) {
        o.LJIIJ(str, "<set-?>");
        this.LJIILJJIL = str;
    }

    public /* synthetic */ O1L(int i) {
        this("");
    }
}
