package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.XAf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84393XAf {
    public static C84393XAf LJI;
    public final C84397XAj LIZ;
    public XBC LIZIZ;
    public final C84389XAb LIZJ;
    public final C84376X9o LIZLLL;
    public C84404XAq LJ;
    public final XCG LJFF;

    public final XBC LIZJ() {
        XBC xbc = this.LIZIZ;
        if (xbc != null) {
            return xbc;
        }
        XBC xbc2 = new XBC(this.LJFF, this.LIZ, this.LIZLLL, this.LIZJ);
        this.LIZIZ = xbc2;
        return xbc2;
    }

    public final C84404XAq LIZLLL() {
        C84404XAq c84404XAq = this.LJ;
        if (c84404XAq != null) {
            return c84404XAq;
        }
        C84389XAb c84389XAb = this.LIZJ;
        C84376X9o c84376X9o = this.LIZLLL;
        this.LJFF.getClass();
        C84404XAq c84404XAq2 = new C84404XAq(c84389XAb, c84376X9o, null);
        this.LJ = c84404XAq2;
        return c84404XAq2;
    }

    public C84393XAf(XCG xcg) {
        int i;
        this.LJFF = xcg;
        C84376X9o c84376X9o = new C84376X9o(xcg.LJJIJIIJI, xcg.LJJJJIZL, xcg.LJJIIZI);
        this.LIZLLL = c84376X9o;
        C84397XAj.LJIIJJI.getClass();
        this.LIZ = C84398XAk.LIZIZ(xcg);
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
            this.LIZJ = c84389XAb;
            String dirPath = xcg.LJJIJIL;
            o.LJIIJ(dirPath, "dirPath");
            C84395XAh.LIZ.put(dirPath, c84389XAb);
            return;
        }
        this.LIZJ = (C84389XAb) LIZ;
    }

    public final boolean LIZ(Effect effect) {
        boolean LIZIZ;
        o.LJIIJ(effect, "effect");
        if (X99.LIZIZ(effect)) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("decrypt error effect: ");
            LIZ.append(effect.getEffect_id());
            LIZ.append(", name: ");
            LIZ.append(effect.getName());
            LIZ.append(", requirements_sec: ");
            LIZ.append(effect.getRequirements_sec());
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("AlgorithmRepository", LIZIZ2, null);
            return false;
        }
        String[] LIZ2 = X99.LIZ(effect, this.LJFF.LJIJ);
        if (LIZ2 == null || LIZ2.length == 0) {
            C12310e3 c12310e32 = C12310e3.LIZIZ;
            String str = "effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " returned empty resourceNameArrayOfEffect";
            c12310e32.getClass();
            C12310e3.LIZ("AlgorithmRepository", str);
            return true;
        }
        this.LIZJ.LJ();
        for (String str2 : LIZ2) {
            if (C84390XAc.LIZJ.LIZIZ()) {
                String LIZJ = XAN.LIZJ(str2);
                if (P12.ANDROID != P12.PC) {
                    C30941Ji c30941Ji = C84390XAc.LIZ;
                    c30941Ji.LIZIZ();
                    try {
                        XAU xau = C84390XAc.LIZIZ.get(LIZJ);
                        c30941Ji.LIZLLL();
                        if (xau == null) {
                            C12310e3 c12310e33 = C12310e3.LIZIZ;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("model: ");
                            LIZ3.append(LIZJ);
                            LIZ3.append(" not in cache!");
                            String LIZIZ3 = X1D.LIZIZ(LIZ3);
                            c12310e33.getClass();
                            C12310e3.LIZIZ("AlgorithmModelInfoMemoryCache", LIZIZ3, null);
                        } else {
                            XAO xao = xau.LJLIL;
                            ModelInfo modelInfo = xau.LJLILLLLZI;
                            if (!o.LJ(xao.LIZLLL(), modelInfo.getVersion())) {
                                C12310e3 c12310e34 = C12310e3.LIZIZ;
                                StringBuilder LIZIZ4 = C25620zW.LIZIZ("model: ", LIZJ, " version not match. local version: ");
                                LIZIZ4.append(xao.LIZLLL());
                                LIZIZ4.append(", server version: ");
                                LIZIZ4.append(modelInfo.getVersion());
                                String LIZIZ5 = X1D.LIZIZ(LIZIZ4);
                                c12310e34.getClass();
                                C12310e3.LIZIZ("AlgorithmModelInfoMemoryCache", LIZIZ5, null);
                            } else {
                                if (xao.LJ) {
                                    continue;
                                } else if (xao.LIZJ() != modelInfo.getType()) {
                                    C12310e3 c12310e35 = C12310e3.LIZIZ;
                                    StringBuilder LIZIZ6 = C25620zW.LIZIZ("model: ", LIZJ, " size not match. local size: ");
                                    LIZIZ6.append(xao.LIZJ());
                                    LIZIZ6.append(", server size: ");
                                    LIZIZ6.append(modelInfo.getType());
                                    String LIZIZ7 = X1D.LIZIZ(LIZIZ6);
                                    c12310e35.getClass();
                                    C12310e3.LIZIZ("AlgorithmModelInfoMemoryCache", LIZIZ7, null);
                                } else if (!o.LJ(xao.LIZ(), C79146V4k.LJJIIZI(modelInfo))) {
                                    C12310e3 c12310e36 = C12310e3.LIZIZ;
                                    StringBuilder LIZIZ8 = C25620zW.LIZIZ("model: ", LIZJ, " md5 not match. local md5: ");
                                    LIZIZ8.append(xao.LIZ());
                                    LIZIZ8.append(", server md5: ");
                                    LIZIZ8.append(C79146V4k.LJJIIZI(modelInfo));
                                    String LIZIZ9 = X1D.LIZIZ(LIZIZ8);
                                    c12310e36.getClass();
                                    C12310e3.LIZIZ("AlgorithmModelInfoMemoryCache", LIZIZ9, null);
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        c30941Ji.LIZLLL();
                        throw th;
                    }
                }
                LIZIZ = LIZIZ(str2);
            } else {
                LIZIZ = LIZIZ(str2);
            }
            if (!LIZIZ) {
                return false;
            }
        }
        return true;
    }

    public final boolean LIZIZ(String str) {
        Collection LIZIZ;
        boolean isResourceAvailable = LIZLLL().isResourceAvailable(str);
        try {
            LIZIZ = XBC.LIZIZ(LIZJ(), new String[]{str});
        } catch (Exception unused) {
        }
        if (LIZIZ != null) {
            if (LIZIZ.isEmpty()) {
                return isResourceAvailable;
            }
            return false;
        }
        return isResourceAvailable;
    }
}
