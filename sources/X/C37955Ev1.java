package X;

import com.lynx.react.bridge.JavaOnlyMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ev1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37955Ev1 {
    public String LIZ;
    public Boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public Object LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public EnumC38003Evn LJIILIIL;
    public EnumC38003Evn LJIILJJIL;
    public boolean LJIILL;
    public EnumC37907EuF LJIILLIIL;
    public C37969EvF LJIIZILJ;
    public final C35657Dz3 LJIJ;
    public String LJIJI;
    public final C37960Ev6 LJIJJ;
    public final C37936Eui LJIJJLI;
    public long LJIL;
    public int LJJ;
    public C37970EvG LJJI;
    public String LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public String LJJIIJ;
    public JavaOnlyMap LJJIIJZLJL;
    public boolean LJJIIZ;
    public final C37904EuC LJJIIZI;

    public final EnumC37907EuF LIZ() {
        EnumC37907EuF enumC37907EuF = this.LJIILLIIL;
        if (enumC37907EuF != null) {
            return enumC37907EuF;
        }
        o.LJIJI("platform");
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BridgeCall(callbackId='");
        LIZ.append(this.LIZJ);
        LIZ.append("', bridgeName='");
        LIZ.append(this.LIZLLL);
        LIZ.append("', hitBusinessHandler='");
        LIZ.append(this.LJIILL);
        LIZ.append("', url='");
        LIZ.append(this.LJ);
        LIZ.append("', msgType='");
        LIZ.append(this.LJFF);
        LIZ.append("', params='");
        LIZ.append(this.LJI);
        LIZ.append("', sdkVersion=");
        LIZ.append(this.LJII);
        LIZ.append(", nameSpace='");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append("', frameUrl='");
        return JBR.LJFF(LIZ, this.LJIIIZ, "')", LIZ);
    }

    public C37955Ev1(C37904EuC context) {
        o.LJIIJ(context, "context");
        this.LJJIIZI = context;
        this.LIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LJIIJ = -1L;
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJIJ = new C35657Dz3();
        this.LJIJJ = new C37960Ev6();
        this.LJIJJLI = new C37936Eui();
        this.LJJIFFI = "";
        this.LJJIIZ = true;
    }

    public final void LIZIZ(EnumC37907EuF enumC37907EuF) {
        o.LJIIJ(enumC37907EuF, "<set-?>");
        this.LJIILLIIL = enumC37907EuF;
    }
}
