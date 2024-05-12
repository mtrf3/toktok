package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class XBJ extends XBK {
    public static final C0FT LJIIIZ = new C0FT((Object) null);
    public static final C0FT LJIIJ = new C0FT((Object) null);
    public static final C0FT LJIIJJI = new C0FT((Object) null);
    public static final C84385X9x LJIIL = new C84385X9x();
    public final XCG LJIIIIZZ;

    @Override // X.XBK, X.InterfaceC84458XCs
    public final void clear() {
        super.clear();
        C0FT c0ft = LJIIIZ;
        InterfaceC84387X9z interfaceC84387X9z = (InterfaceC84387X9z) c0ft.LIZ;
        if (interfaceC84387X9z != null) {
            interfaceC84387X9z.clear();
        }
        V2B.LJIIJJI(this.LJIIIIZZ);
        String str = "effectid_map";
        if (!C107244Iu.LIZIZ("")) {
            StringBuilder LIZ = X1D.LIZ();
            V2B.LJIIJJI(this.LJIIIIZZ);
            LIZ.append("");
            str = JBR.LJFF(LIZ, C10820be.LIZ, "effectid_map", LIZ);
        }
        c0ft.LIZ = C36819Ech.LIZ(this.LJIIIIZZ.LJJIIZI, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XBJ(XCG effectConfiguration) {
        super(effectConfiguration.LJIIIIZZ, 0, effectConfiguration.LJJIJL, LJIIL, false, 38);
        o.LJIIJ(effectConfiguration, "effectConfiguration");
        this.LJIIIIZZ = effectConfiguration;
        String str = "effectid_map";
        if (!C107244Iu.LIZIZ("")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            str = JBR.LJFF(LIZ, C10820be.LIZ, "effectid_map", LIZ);
        }
        LJIIIZ.LIZ = C36819Ech.LIZ(effectConfiguration.LJJIIZI, str);
        LJIIJ.LIZ = effectConfiguration.LJIIIZ;
        C0FT c0ft = LJIIJJI;
        c0ft.LIZ = effectConfiguration.LJJIIZ;
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this);
        LIZ2.append(" draftDIRAllowList:");
        LIZ2.append(c0ft.LIZ);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        c12310e3.getClass();
        C12310e3.LIZ("EffectDiskLruCache", LIZIZ);
    }

    @Override // X.XBK, X.InterfaceC84458XCs
    public final void LIZ(List<String> list) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDraftList: ");
        LIZ.append(list);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("EffectDiskLruCache", LIZIZ);
        LJIIJJI.LIZ = list;
    }

    public final void LJIIJ(Effect effect) {
        o.LJIIJ(effect, "effect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(effect.getId());
        LIZ.append(".zip");
        remove(X1D.LIZIZ(LIZ));
        String unzipPath = effect.getUnzipPath();
        if (unzipPath != null) {
            try {
                String LJII = C10820be.LJII(unzipPath);
                if (LJII != null) {
                    remove(LJII);
                }
                C10820be.LJIILL(unzipPath);
            } catch (Exception e) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("remove effect failed! ");
                LIZ2.append(e.getMessage());
                String LIZIZ = X1D.LIZIZ(LIZ2);
                c12310e3.getClass();
                C12310e3.LIZIZ("EffectDiskLruCache", LIZIZ, null);
            }
        }
    }

    public static Exception LJIIIIZZ(Effect effect, String str) {
        ArrayList arrayList;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C79057V0z.LJJIJIIJI(str));
        LIZ.append("effect_platform_children.tag");
        String LIZIZ = X1D.LIZIZ(LIZ);
        C10820be.LJIILL(LIZIZ);
        try {
            List LJIIIIZZ = C10820be.LJIIIIZZ(str);
            if (LJIIIIZZ != null) {
                arrayList = new ArrayList(C32I.LJJL(LJIIIIZZ, 10));
                Iterator it = LJIIIIZZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(s.LJJLL(str, (String) it.next()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                C10820be.LJIL(LIZIZ, ORZ.LLD(arrayList, null, null, null, null, 63));
            }
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("write effect: ");
            LIZ2.append(effect.getEffect_id());
            LIZ2.append(" children count: ");
            if (arrayList == null) {
                num = null;
            } else {
                num = Integer.valueOf(arrayList.size());
            }
            LIZ2.append(num);
            LIZ2.append(" time cost: ");
            LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
            LIZ2.append(" ms");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            c12310e3.getClass();
            C12310e3.LIZ("writeEffect", LIZIZ2);
            return null;
        } catch (Exception e) {
            C12310e3 c12310e32 = C12310e3.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("write effect: ");
            LIZ3.append(effect.getEffect_id());
            LIZ3.append(" children tag file failed!");
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            c12310e32.getClass();
            C12310e3.LIZIZ("writeEffect", LIZIZ3, e);
            C10820be.LJIILL(LIZIZ);
            StringBuilder LIZ4 = X1D.LIZ();
            return new Exception(KMP.LJFF(LIZ4, "RebuildTagFailed:", e, LIZ4));
        }
    }

    public final void LJIIIZ(String fileName, String unzipPath) {
        o.LJIIJ(fileName, "fileName");
        o.LJIIJ(unzipPath, "unzipPath");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(fileName);
            LIZ.append(".zip");
            remove(X1D.LIZIZ(LIZ));
            String LJII = C10820be.LJII(unzipPath);
            if (LJII != null) {
                remove(LJII);
            }
            C10820be.LJIILL(unzipPath);
        } catch (Exception e) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("remove BaseEffect failed! ");
            LIZ2.append(e.getMessage());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            c12310e3.getClass();
            C12310e3.LIZIZ("EffectDiskLruCache", LIZIZ, null);
        }
    }

    public final Exception LJII(Effect effect, String diffEffectUnzipPath, String baseEffectUnzipPath) {
        boolean z;
        o.LJIIJ(effect, "effect");
        o.LJIIJ(diffEffectUnzipPath, "diffEffectUnzipPath");
        o.LJIIJ(baseEffectUnzipPath, "baseEffectUnzipPath");
        if (C107244Iu.LIZIZ(diffEffectUnzipPath) || C107244Iu.LIZIZ(baseEffectUnzipPath)) {
            return new Exception("UnzipPath is empty!");
        }
        try {
            z = C10820be.LIZLLL(new File(baseEffectUnzipPath).getAbsoluteFile(), new File(diffEffectUnzipPath).getAbsoluteFile(), new C283719l());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            z = false;
        }
        if (!z) {
            return new Exception("Merge Failed!");
        }
        Exception LJIIIIZZ = LJIIIIZZ(effect, diffEffectUnzipPath);
        if (LJIIIIZZ != null) {
            return LJIIIIZZ;
        }
        XBL LJ = LJ();
        if (LJ != null) {
            XBL.LJIJJ.getClass();
            LJ.LIZ(XBQ.LIZJ(diffEffectUnzipPath));
            return null;
        }
        return null;
    }

    public final String LJIIJJI(Effect effect, C84426XBm c84426XBm, String str, long j, boolean z, AqS197S0100000_15 aqS197S0100000_15) {
        InterfaceC84387X9z interfaceC84387X9z;
        XBQ xbq = XBL.LJIJJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(".zip");
        String LIZIZ = X1D.LIZIZ(LIZ);
        xbq.getClass();
        String LIZJ = XBQ.LIZJ(LIZIZ);
        try {
            OSZ LJI = LJI(LIZJ, c84426XBm, str, j, aqS197S0100000_15);
            if (z) {
                if (((Boolean) LJI.getSecond()).booleanValue() && (interfaceC84387X9z = (InterfaceC84387X9z) LJIIIZ.LIZ) != null) {
                    interfaceC84387X9z.putString(str, effect.getEffect_id());
                }
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("effect ");
                LIZ2.append(effect.getEffect_id());
                LIZ2.append(", name: ");
                LIZ2.append(effect.getName());
                LIZ2.append(", key: ");
                LIZ2.append(LIZJ);
                LIZ2.append(" end in disklrucache, result: ");
                LIZ2.append(((Boolean) LJI.getSecond()).booleanValue());
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                c12310e3.getClass();
                C12310e3.LIZ("EffectDiskLruCache", LIZIZ2);
            }
            return (String) LJI.getFirst();
        } catch (Exception e) {
            if (z) {
                C12310e3 c12310e32 = C12310e3.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("fetch effect: ");
                LIZ3.append(effect.getEffect_id());
                LIZ3.append(", name: ");
                LIZ3.append(effect.getName());
                LIZ3.append(" key: ");
                LIZ3.append(LIZJ);
                LIZ3.append(" write to disk failed!");
                String LIZIZ3 = X1D.LIZIZ(LIZ3);
                c12310e32.getClass();
                C12310e3.LIZIZ("EffectDiskLruCache", LIZIZ3, e);
            }
            if (!(e instanceof XB1)) {
                remove(LIZJ);
            }
            throw e;
        }
    }
}
