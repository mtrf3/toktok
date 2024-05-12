package X;

import com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBE {
    public static XBE LJII;
    public static final C84419XBf LJIIIIZZ = new C84419XBf();
    public final C84389XAb LIZ;
    public final C84376X9o LIZIZ;
    public AlgorithmModelResourceFinder LIZJ;
    public XBC LIZLLL;
    public final C84393XAf LJ;
    public XC2 LJFF;
    public final XCG LJI;

    public static final XBE LIZJ() {
        LJIIIIZZ.getClass();
        return C84419XBf.LIZ();
    }

    public static final boolean LJ() {
        LJIIIIZZ.getClass();
        return C84419XBf.LIZJ();
    }

    public final XBC LIZIZ() {
        XBC xbc = this.LIZLLL;
        if (xbc != null) {
            return xbc;
        }
        XCG xcg = this.LJI;
        C84397XAj.LJIIJJI.getClass();
        XBC xbc2 = new XBC(xcg, C84398XAk.LIZIZ(xcg), this.LIZIZ, this.LIZ);
        this.LIZLLL = xbc2;
        return xbc2;
    }

    public final AlgorithmModelResourceFinder LIZLLL() {
        AlgorithmModelResourceFinder algorithmModelResourceFinder = this.LIZJ;
        if (algorithmModelResourceFinder != null) {
            return algorithmModelResourceFinder;
        }
        C84389XAb c84389XAb = this.LIZ;
        C84376X9o c84376X9o = this.LIZIZ;
        this.LJI.getClass();
        AlgorithmModelResourceFinder algorithmModelResourceFinder2 = new AlgorithmModelResourceFinder(c84389XAb, c84376X9o, null, this.LJI);
        this.LIZJ = algorithmModelResourceFinder2;
        return algorithmModelResourceFinder2;
    }

    public XBE(XCG xcg) {
        int i;
        this.LJI = xcg;
        C84376X9o c84376X9o = new C84376X9o(xcg.LJJIJIIJI, xcg.LJJJJIZL, xcg.LJJIIZI);
        this.LIZIZ = c84376X9o;
        InterfaceC84458XCs LIZ = C84395XAh.LIZ(xcg.LJJIJIL);
        if (LIZ == null || !(LIZ instanceof C84389XAb)) {
            String str = xcg.LJJIJIL;
            String str2 = xcg.LIZJ;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            C84389XAb c84389XAb = new C84389XAb(xcg, str, i, c84376X9o);
            this.LIZ = c84389XAb;
            String dirPath = xcg.LJJIJIL;
            o.LJIIJ(dirPath, "dirPath");
            C84395XAh.LIZ.put(dirPath, c84389XAb);
        } else {
            this.LIZ = (C84389XAb) LIZ;
        }
        if (C84393XAf.LJI == null) {
            C84393XAf.LJI = new C84393XAf(xcg);
        }
        this.LJ = C84399XAl.LIZ();
        XAQ.LIZ = new C84431XBr();
    }

    public final void LIZ(List<String> requirements, XDR<String[]> xdr) {
        o.LJIIJ(requirements, "requirements");
        C84393XAf c84393XAf = this.LJ;
        c84393XAf.getClass();
        XCX xcx = c84393XAf.LJFF.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84411XAx(c84393XAf, requirements, xdr, C84410XAw.LIZ()));
        }
    }
}
