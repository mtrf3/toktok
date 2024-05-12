package X;

import com.ss.ugc.effectplatform.model.Effect;
import defpackage.i0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBD extends XBW<C84430XBq> {
    public static final C30941Ji LJIIL = new C30941Ji(0);
    public static final C40601ia<String, C84433XBt> LJIILIIL = new C40601ia<>(true);
    public static final C0R2 LJIILJJIL = new C0R2(0);
    public static final C0R2 LJIILL = new C0R2(0);
    public final C84422XBi LIZLLL;
    public final C65427Pm3 LJ;
    public XAR LJFF;
    public final XBW<C84430XBq> LJI;
    public final C84415XBb LJII;
    public final C84397XAj LJIIIIZZ;
    public final C84376X9o LJIIIZ;
    public final C84389XAb LJIIJ;
    public final XCG LJIIJJI;

    @Override // X.XBW
    public final void LIZ() {
        this.LIZIZ = true;
        XBW<C84430XBq> xbw = this.LJI;
        if (xbw != null) {
            xbw.LIZ();
        }
        XAR xar = this.LJFF;
        if (xar != null) {
            xar.cancel();
        }
    }

    @Override // X.XBW
    public final void LJIIIZ() {
        this.LIZJ = true;
        XBW<C84430XBq> xbw = this.LJI;
        if (xbw != null) {
            xbw.LJIIIZ();
        }
        XAR xar = this.LJFF;
        if (xar != null) {
            xar.pause();
        }
    }

    @Override // X.XBW
    public final void LIZIZ() {
        String str;
        Effect effect;
        String str2;
        Exception exc;
        Boolean bool;
        Boolean bool2;
        try {
            try {
                C84415XBb c84415XBb = this.LJII;
                if (c84415XBb != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('[');
                    LIZ.append(c84415XBb.LJLIL.getName());
                    LIZ.append("][SDK:");
                    XAT xat = c84415XBb.LJLJJI;
                    if (xat != null) {
                        bool = Boolean.valueOf(xat.LIZ(c84415XBb.LJLIL));
                    } else {
                        bool = null;
                    }
                    LIZ.append(bool);
                    LIZ.append("][Parallel:");
                    XAT xat2 = c84415XBb.LJLJJI;
                    if (xat2 != null) {
                        bool2 = Boolean.valueOf(xat2.LIZIZ(c84415XBb.LJLIL));
                    } else {
                        bool2 = null;
                    }
                    LIZ.append(bool2);
                    LIZ.append(']');
                    str2 = X1D.LIZIZ(LIZ);
                } else {
                    str2 = null;
                }
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[Flow][Start]");
                LIZ2.append(str2);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                c12310e3.getClass();
                C12310e3.LIZLLL("JKL", LIZIZ);
                LJIIIIZZ(this);
                LJIILJJIL();
                long currentTimeMillis = System.currentTimeMillis();
                C84415XBb c84415XBb2 = this.LJII;
                if (c84415XBb2 != null) {
                    XAR LJIIJ = LJIIJ(this, c84415XBb2);
                    this.LJFF = LJIIJ;
                    LJIIJ.LJIIJ = this.LJ;
                }
                XBW<C84430XBq> xbw = this.LJI;
                if (xbw instanceof XBG) {
                    ((XBG) xbw).LJIIIZ = this.LIZLLL;
                    ((XBG) xbw).LJIIJ = this.LJ;
                }
                if (xbw != null) {
                    xbw.LIZIZ();
                }
                C84415XBb c84415XBb3 = this.LJII;
                if (c84415XBb3 != null) {
                    XAT xat3 = c84415XBb3.LJLJJI;
                    if (xat3 == null || !xat3.LIZIZ(c84415XBb3.LJLIL) || (exc = (Exception) this.LJ.LIZ) == null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("[Statistic][");
                        LIZ3.append(this.LJII.LJLIL.getName());
                        LIZ3.append("][Effect+Model][TotalDuration:");
                        LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
                        LIZ3.append(']');
                        C12310e3.LIZ("JKL", X1D.LIZIZ(LIZ3));
                    } else {
                        throw exc;
                    }
                }
                LJIIL(System.currentTimeMillis() - currentTimeMillis);
            } catch (Exception e) {
                try {
                    C84418XBe c84418XBe = new C84418XBe(e);
                    String str3 = c84418XBe.LIZIZ;
                    if (str3 == null || str3.length() == 0) {
                        c84418XBe.LIZIZ = C78963Uyt.LJIJ(e);
                    }
                    C16880lQ.LLLLIIL(e);
                    C12310e3 c12310e32 = C12310e3.LIZIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("[Flow][End][Fail][Effect+Model][");
                    C84415XBb c84415XBb4 = this.LJII;
                    if (c84415XBb4 != null && (effect = c84415XBb4.LJLIL) != null) {
                        str = effect.getName();
                    } else {
                        str = null;
                    }
                    LIZ4.append(str);
                    LIZ4.append("][");
                    LIZ4.append(c84418XBe.LIZ);
                    LIZ4.append("][");
                    LIZ4.append(c84418XBe.LIZIZ);
                    LIZ4.append(']');
                    String LIZIZ2 = X1D.LIZIZ(LIZ4);
                    c12310e32.getClass();
                    C12310e3.LIZIZ("JKL", LIZIZ2, null);
                    LIZLLL(this, c84418XBe);
                    LJIIJJI(c84418XBe);
                } finally {
                    LJ(this);
                }
            }
        } finally {
            LJIILIIL();
        }
    }

    public final void LJIILIIL() {
        Effect effect;
        C84415XBb c84415XBb = this.LJII;
        if (c84415XBb != null && (effect = c84415XBb.LJLIL) != null) {
            LJIILJJIL.LIZ();
            if (o.LJ(effect.getPanel(), "default")) {
                LJIILL.LIZ();
            }
            C30941Ji c30941Ji = LJIIL;
            c30941Ji.LIZIZ();
            try {
                LJIILIIL.remove(effect.getEffect_id());
            } finally {
                c30941Ji.LIZLLL();
            }
        }
    }

    public final void LJIILJJIL() {
        Effect effect;
        int LIZIZ;
        C84415XBb c84415XBb = this.LJII;
        if (c84415XBb != null && (effect = c84415XBb.LJLIL) != null) {
            int LIZJ = LJIILJJIL.LIZJ();
            if (o.LJ(effect.getPanel(), "default")) {
                LIZIZ = LJIILL.LIZJ();
            } else {
                LIZIZ = LJIILL.LIZIZ();
            }
            C30941Ji c30941Ji = LJIIL;
            c30941Ji.LIZIZ();
            try {
                for (Map.Entry<String, C84433XBt> entry : LJIILIIL.entrySet()) {
                    C84433XBt value = entry.getValue();
                    value.LIZ = Math.max(value.LIZ, LIZIZ);
                    value.LIZIZ = Math.max(value.LIZIZ, LIZJ);
                    LJIILIIL.put(entry.getKey(), value);
                }
                LJIILIIL.put(effect.getEffect_id(), new C84433XBt(LIZIZ, LIZJ));
            } finally {
                c30941Ji.LIZLLL();
            }
        }
    }

    public final void LJIIJJI(C84418XBe c84418XBe) {
        String str;
        String str2;
        String str3;
        Effect effect;
        Effect effect2;
        Effect effect3;
        OSZ[] oszArr = new OSZ[5];
        C84415XBb c84415XBb = this.LJII;
        String str4 = "";
        if (c84415XBb == null || (effect3 = c84415XBb.LJLIL) == null || (str = effect3.getEffect_id()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("effect_id", str);
        C84415XBb c84415XBb2 = this.LJII;
        if (c84415XBb2 == null || (effect2 = c84415XBb2.LJLIL) == null || (str2 = effect2.getName()) == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("effect_name", str2);
        C84415XBb c84415XBb3 = this.LJII;
        if (c84415XBb3 == null || (effect = c84415XBb3.LJLIL) == null || (str3 = effect.getPanel()) == null) {
            str3 = "null";
        }
        oszArr[2] = new OSZ("panel", str3);
        oszArr[3] = new OSZ("error_code", String.valueOf(c84418XBe.LIZ));
        String str5 = c84418XBe.LIZIZ;
        if (str5 != null) {
            str4 = str5;
        }
        oszArr[4] = new OSZ("error_msg", str4);
        java.util.Map LJJL = C113554cx.LJJL(oszArr);
        XCG xcg = this.LJIIJJI;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLILIL(interfaceC58749N3x, false, xcg, LJJL);
        }
    }

    public final void LJIIL(long j) {
        long j2;
        long j3;
        long j4;
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        long j5;
        int i3;
        Effect effect;
        String panel;
        C0FT c0ft;
        Integer num;
        C0FT c0ft2;
        Integer num2;
        C0FT c0ft3;
        Long l;
        Effect effect2;
        Effect effect3;
        Effect effect4;
        C0FT c0ft4;
        Long l2;
        XBW<C84430XBq> xbw = this.LJI;
        if (xbw instanceof XBG) {
            j2 = ((Number) ((XBG) xbw).LJII.LIZ).longValue();
            j3 = ((Number) ((XBG) this.LJI).LJ.LIZ).longValue();
        } else {
            j2 = 0;
            j3 = 0;
        }
        XAR xar = this.LJFF;
        if (xar != null && (c0ft4 = xar.LJII) != null && (l2 = (Long) c0ft4.LIZ) != null) {
            j4 = l2.longValue();
        } else {
            j4 = 0;
        }
        long j6 = j2 + j4;
        if (j6 == 0) {
            return;
        }
        C30941Ji c30941Ji = LJIIL;
        c30941Ji.LIZIZ();
        try {
            C40601ia<String, C84433XBt> c40601ia = LJIILIIL;
            C84415XBb c84415XBb = this.LJII;
            if (c84415XBb != null && (effect4 = c84415XBb.LJLIL) != null) {
                str = effect4.getEffect_id();
            } else {
                str = null;
            }
            C84433XBt c84433XBt = c40601ia.get(str);
            int i4 = 0;
            if (c84433XBt != null) {
                i = c84433XBt.LIZ;
                i2 = c84433XBt.LIZIZ;
            } else {
                i = 0;
                i2 = 1;
            }
            c30941Ji.LIZLLL();
            OSZ[] oszArr = new OSZ[13];
            oszArr[0] = new OSZ("total_duration", Long.valueOf(j));
            oszArr[1] = new OSZ("total_size", Long.valueOf(j6));
            C84415XBb c84415XBb2 = this.LJII;
            String str4 = "";
            if (c84415XBb2 == null || (effect3 = c84415XBb2.LJLIL) == null || (str2 = effect3.getEffect_id()) == null) {
                str2 = "";
            }
            oszArr[2] = new OSZ("effect_id", str2);
            C84415XBb c84415XBb3 = this.LJII;
            if (c84415XBb3 == null || (effect2 = c84415XBb3.LJLIL) == null || (str3 = effect2.getName()) == null) {
                str3 = "";
            }
            oszArr[3] = new OSZ("effect_name", str3);
            oszArr[4] = new OSZ("effect_duration", Long.valueOf(j3));
            oszArr[5] = new OSZ("effect_size", Long.valueOf(j2));
            oszArr[6] = new OSZ("model_size", Long.valueOf(j4));
            XAR xar2 = this.LJFF;
            if (xar2 != null && (c0ft3 = xar2.LJI) != null && (l = (Long) c0ft3.LIZ) != null) {
                j5 = l.longValue();
            } else {
                j5 = 0;
            }
            oszArr[7] = new OSZ("model_duration", Long.valueOf(j5));
            XAR xar3 = this.LJFF;
            if (xar3 != null && (c0ft2 = xar3.LJIIIIZZ) != null && (num2 = (Integer) c0ft2.LIZ) != null) {
                i3 = num2.intValue();
            } else {
                i3 = 0;
            }
            oszArr[8] = new OSZ("dependent_model_count", Integer.valueOf(i3));
            XAR xar4 = this.LJFF;
            if (xar4 != null && (c0ft = xar4.LJIIIZ) != null && (num = (Integer) c0ft.LIZ) != null) {
                i4 = num.intValue();
            }
            oszArr[9] = new OSZ("download_model_count", Integer.valueOf(i4));
            C84415XBb c84415XBb4 = this.LJII;
            if (c84415XBb4 != null && (effect = c84415XBb4.LJLIL) != null && (panel = effect.getPanel()) != null) {
                str4 = panel;
            }
            oszArr[10] = new OSZ("panel", str4);
            oszArr[11] = new OSZ("parallel_default_count", Integer.valueOf(i));
            oszArr[12] = new OSZ("parallel_total_count", Integer.valueOf(i2));
            java.util.Map LJJL = C113554cx.LJJL(oszArr);
            XCG xcg = this.LJIIJJI;
            InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
            if (interfaceC58749N3x != null) {
                C63081OpJ.LLILIL(interfaceC58749N3x, true, xcg, LJJL);
            }
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Statistic][Effect+Model][");
            LIZ.append(LJJL);
            LIZ.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZ("JKL", LIZIZ);
        } catch (Throwable th) {
            c30941Ji.LIZLLL();
            throw th;
        }
    }

    public static XAR LJIIJ(XBD xbd, C84415XBb c84415XBb) {
        String LJIJJ;
        List list;
        xbd.getClass();
        Effect effect = c84415XBb.LJLIL;
        try {
            if (X99.LIZIZ(effect)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Effect Requirements Decrypt Failed, ");
                LIZ.append("effect: ");
                LIZ.append(effect.getEffect_id());
                LIZ.append(", name: ");
                LIZ.append(effect.getName());
                LIZ.append(", toDownloadRequirements: ");
                List<String> requirements_sec = effect.getRequirements_sec();
                if (requirements_sec != null) {
                    list = ORZ.LLJI(requirements_sec);
                } else {
                    list = null;
                }
                LIZ.append(list);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
            try {
                XAR xar = new XAR(xbd.LJIIJJI, xbd.LJIIIIZZ, xbd.LJIIIZ, xbd.LJIIJ, X99.LIZ(c84415XBb.LJLIL, xbd.LJIIJJI.LJIJ), 0, effect.getName(), c84415XBb.LJLJJI, xbd.LIZLLL, c84415XBb.LJLJJLL, effect);
                xar.run();
                return xar;
            } catch (Exception e) {
                e = e;
                C16880lQ.LLLLIIL(e);
                C84418XBe c84418XBe = new C84418XBe(e);
                String message = e.getMessage();
                if (message == null || message.length() == 0) {
                    LJIJJ = C78963Uyt.LJIJJ(e);
                } else {
                    LJIJJ = e.getMessage();
                }
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[Flow][End][Fail][Model][");
                LIZ2.append(c84415XBb.LJLIL.getName());
                LIZ2.append("][");
                LIZ2.append(c84418XBe.LIZ);
                LIZ2.append("][");
                LIZ2.append(LJIJJ);
                LIZ2.append(']');
                String LIZIZ = X1D.LIZIZ(LIZ2);
                c12310e3.getClass();
                C12310e3.LIZIZ("JKL", LIZIZ, null);
                int i = c84418XBe.LIZ;
                if (i != 10001 && i != 10020) {
                    XCG xcg = xbd.LJIIJJI;
                    InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
                    if (interfaceC58749N3x != null) {
                        C63081OpJ.LLILII(interfaceC58749N3x, false, xcg, effect, C51029K0z.LJJIIZI(new OSZ("error_code", 10018)), i0.LJFF("download effect failed because of model fetcher failed! detail: ", LJIJJ));
                    }
                }
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public XBD(XBG xbg, C84415XBb c84415XBb, C84397XAj c84397XAj, C84376X9o buildInAssetsManager, C84389XAb algorithmModelCache, XCG config) {
        XAT xat;
        o.LJIIJ(buildInAssetsManager, "buildInAssetsManager");
        o.LJIIJ(algorithmModelCache, "algorithmModelCache");
        o.LJIIJ(config, "config");
        this.LJI = xbg;
        this.LJII = c84415XBb;
        this.LJIIIIZZ = c84397XAj;
        this.LJIIIZ = buildInAssetsManager;
        this.LJIIJ = algorithmModelCache;
        this.LJIIJJI = config;
        if (xbg != null) {
            xbg.LIZ.LIZ = new XBF(this);
        }
        if (c84415XBb != null && (xat = c84415XBb.LJLJJI) != null) {
            xat.LIZ = o.LJ(c84415XBb.LJLJJL, Boolean.TRUE);
        }
        this.LIZLLL = new C84422XBi();
        this.LJ = new C65427Pm3(3);
    }
}
