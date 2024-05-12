package X;

import Y.ARunnableS34S0200000_15;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.XAj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84397XAj {
    public static boolean LJIIJ;
    public final C84376X9o LIZ;
    public final C40601ia<String, Exception> LIZIZ = new C40601ia<>(true);
    public final C40601ia<String, C84402XAo> LIZJ = new C40601ia<>(true);
    public final C40601ia<String, Integer> LIZLLL = new C40601ia<>(true);
    public final C40601ia<String, C84403XAp> LJ = new C40601ia<>(true);
    public final C40601ia<String, Boolean> LJFF = new C40601ia<>(true);
    public final XCG LJI;
    public static final C84398XAk LJIIJJI = new C84398XAk();
    public static final C40601ia<String, XAS> LJII = new C40601ia<>(true);
    public static final C40601ia<String, ModelInfo> LJIIIIZZ = new C40601ia<>(true);
    public static final C0FT LJIIIZ = new C0FT((Object) null);

    public C84397XAj(XCG xcg) {
        this.LJI = xcg;
        this.LIZ = new C84376X9o(xcg.LJJIJIIJI, xcg.LJJJJIZL, xcg.LJJIIZI);
    }

    public static XAS LIZIZ(C84397XAj c84397XAj, int i) {
        XCX xcx;
        c84397XAj.getClass();
        XAS xas = LJII.get(C44384HbQ.LJIJ(i));
        boolean z = true;
        if (LJIIJ && !(!o.LJ(c84397XAj.LJFF.get(r1), Boolean.TRUE))) {
            z = false;
        }
        if (xas == null && z && (xcx = c84397XAj.LJI.LJJIIJ) != null) {
            xcx.LIZ(new C84396XAi(c84397XAj, i, C84410XAw.LIZ()));
        }
        return xas;
    }

    public final synchronized XAS LIZ(int i, boolean z) {
        String LJIJ;
        C40601ia<String, XAS> c40601ia;
        LJIJ = C44384HbQ.LJIJ(i);
        c40601ia = LJII;
        if (c40601ia.get(LJIJ) == null) {
            this.LJFF.put(LJIJ, Boolean.TRUE);
            C40601ia<String, Integer> c40601ia2 = this.LIZLLL;
            Integer num = c40601ia2.get(LJIJ);
            if (num == null) {
                num = 0;
                c40601ia2.put(LJIJ, num);
            }
            int intValue = num.intValue();
            if (z || intValue < this.LJI.LJIILLIIL) {
                C40601ia<String, C84402XAo> c40601ia3 = this.LIZJ;
                C84402XAo c84402XAo = c40601ia3.get(LJIJ);
                if (c84402XAo == null) {
                    c84402XAo = new C84402XAo(this.LJI, this.LIZ, i, new C84392XAe(this, LJIJ));
                    c40601ia3.put(LJIJ, c84402XAo);
                }
                C84402XAo c84402XAo2 = c84402XAo;
                this.LIZLLL.put(LJIJ, Integer.valueOf(intValue + 1));
                C30941Ji c30941Ji = C84401XAn.LIZ;
                c30941Ji.LIZIZ();
                try {
                    if (!c84402XAo2.LJI.LIZIZ()) {
                        c84402XAo2.run();
                        c84402XAo2.LJI.LIZLLL(true);
                    }
                    c30941Ji.LIZLLL();
                    XAS xas = c40601ia.get(LJIJ);
                    if (xas != null) {
                        new C1IW().execute(new ARunnableS34S0200000_15(xas, this, 29));
                    }
                } catch (Throwable th) {
                    c30941Ji.LIZLLL();
                    throw th;
                }
            }
            if (c40601ia.get(LJIJ) == null) {
                Exception exc = this.LIZIZ.get(LJIJ);
                if (exc != null) {
                    throw exc;
                }
                this.LJFF.put(LJIJ, Boolean.FALSE);
                throw new RuntimeException("error happens when requireDecidedConfig");
            }
            this.LJFF.put(LJIJ, Boolean.FALSE);
        }
        return c40601ia.get(LJIJ);
    }

    public final synchronized ModelInfo LIZJ(int i, String str) {
        ModelInfo modelInfo = null;
        if (str == null) {
            return null;
        }
        C40601ia<String, ModelInfo> c40601ia = LJIIIIZZ;
        ModelInfo modelInfo2 = c40601ia.get(str);
        if (modelInfo2 == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append('_');
            LIZ.append(i);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C40601ia<String, C84403XAp> c40601ia2 = this.LJ;
            C84403XAp c84403XAp = c40601ia2.get(LIZIZ);
            if (c84403XAp == null) {
                c84403XAp = new C84403XAp(this.LJI, str, i);
                c40601ia2.put(LIZIZ, c84403XAp);
            }
            SingleAlgorithmModelResponse LJII2 = c84403XAp.LJII();
            if (LJII2 != null && (modelInfo = LJII2.getData()) != null) {
                c40601ia.put(str, modelInfo);
            }
            this.LJ.remove(LIZIZ);
            modelInfo2 = modelInfo;
        }
        return modelInfo2;
    }

    public final ModelInfo LIZLLL(int i, String str, boolean z) {
        XCX xcx;
        ModelInfo modelInfo = LJIIIIZZ.get(str);
        if (modelInfo == null && z && (xcx = this.LJI.LJJIIJ) != null) {
            xcx.LIZ(new C84388XAa(this, i, str, C84410XAw.LIZ()));
        }
        return modelInfo;
    }
}
