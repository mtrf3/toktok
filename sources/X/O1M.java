package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class O1M {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIIZILJ;
    public C61091NyJ LIZ;
    public int LIZIZ;
    public long LIZJ;
    public Integer LIZLLL;
    public boolean LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public C60737Nsb LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public String LJIILLIIL;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(O1M.class), "customParams", "getCustomParams()Ljava/util/Map;");
        C65352Pkq.LIZ.getClass();
        LJIIZILJ = new InterfaceC74236TBo[]{tbt};
    }

    public O1M() {
        this(0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[accessKey=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", loaderConfig=");
        LIZ.append(this.LIZ);
        LIZ.append(", dynamic=");
        LIZ.append(this.LIZLLL);
        LIZ.append(',');
        LIZ.append("onlyLocal=");
        LIZ.append(this.LJ);
        LIZ.append(", channel=");
        Q89.LIZIZ(LIZ, this.LJFF, ',', "bundle=");
        LIZ.append(this.LJI);
        LIZ.append(", group=");
        LIZ.append(this.LJII);
        LIZ.append(",cdnUrl=");
        Q89.LIZIZ(LIZ, this.LJIIIIZZ, ',', "enableCached:");
        return C48339Iy7.LIZJ(LIZ, this.LJIILJJIL, ']', LIZ);
    }

    public O1M(String accessKey) {
        o.LJIIJ(accessKey, "accessKey");
        this.LJIILLIIL = accessKey;
        this.LIZ = new C61091NyJ(false);
        this.LIZJ = 1000L;
        this.LJFF = "";
        this.LJI = "";
        this.LJIIIIZZ = "";
        this.LJIIL = "";
        this.LJIILJJIL = true;
        this.LJIILL = C221108m2.LIZIZ(C61223O1b.LJLIL);
    }

    public /* synthetic */ O1M(int i) {
        this("");
    }
}
