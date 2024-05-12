package X;

import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import com.bytedance.pumbaa.ruler.adapter.RuleEngineServiceImpl;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pye, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66208Pye implements IPolicyDecision {
    public static final IRuleEngineService LIZ;
    public static final C66166Pxy LIZIZ;
    public static final List<C66168Py0> LIZJ;
    public static final ThreadLocal<C66209Pyf> LIZLLL;
    public static final C66208Pye LJ = new C66208Pye();

    static {
        IRuleEngineService LJIILIIL = RuleEngineServiceImpl.LJIILIIL();
        o.LJIIIIZZ(LJIILIIL, "ServiceManager.get().get…ngineService::class.java)");
        LIZ = LJIILIIL;
        LIZIZ = new C66166Pxy();
        LIZJ = C47261Igj.LJJIJ(new C66168Py0(EnumC66158Pxq.SYNC, null));
        LIZLLL = new ThreadLocal<>();
    }

    @Override // com.bytedance.pumbaa.pdp.api.IPolicyDecision
    public final InterfaceC66169Py1 LIZ() {
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020e, code lost:
    
        if (X.C66215Pyl.LIZ == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0210, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("execute ruler fail:");
        r1.append(r4.LJLILLLLZI);
        r1.append('#');
        r1.append(r4.LJLJI);
        r1.append("  result:");
        r1.append((X.C66210Pyg) ((java.util.LinkedHashMap) r5.LIZ).get(r4));
        com.google.gson.internal.j.LIZLLL(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fb, code lost:
    
        r11 = ((float) (java.lang.System.nanoTime() - r21)) / 1000000.0f;
        r9 = new java.util.LinkedHashMap();
        r9.put("totalCostTime", java.lang.Float.valueOf(r11));
        r9.put("rulerCostTime", java.lang.Float.valueOf(r6));
        r9.put("originCostTime", java.lang.Float.valueOf(0.0f));
        r9.put("trimOriginCost", java.lang.Float.valueOf(r11 - 0.0f));
        r5.LJFF(new X.C66206Pyc(r4, ((java.util.LinkedHashMap) r5.LIZ).keySet(), false, r2, X.C66210Pyg.L(r3), r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0348, code lost:
    
        if (X.C66215Pyl.LIZ == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x034a, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("result[");
        r1.append(r4.LJLILLLLZI);
        r1.append('#');
        r1.append(r4.LJLJI);
        r1.append("]<<<<<< ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0243, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03cb, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("result[");
        r1.append(r4.LJLILLLLZI);
        r1.append('#');
        r1.append(r4.LJLJI);
        r1.append("]<<<<<< ");
        r1.append(r3);
        com.google.gson.internal.j.LIZLLL(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f8, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("block by ruler:");
        r1.append(r9);
        r5.LIZ(-1, X.X1D.LIZIZ(r1), r10, r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[LOOP:4: B:84:0x01b8->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[EDGE_INSN: B:96:0x01f8->B:97:0x01f8 BREAK  A[LOOP:4: B:84:0x01b8->B:111:?], EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.pumbaa.pdp.api.IPolicyDecision
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C66210Pyg LIZIZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r31, java.lang.String r32, int r33, java.util.List<X.C66168Py0> r34, X.InterfaceC66217Pyn r35, X.InterfaceC65784Pro<? extends java.lang.Object> r36) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66208Pye.LIZIZ(java.util.Map, java.lang.String, int, java.util.List, X.Pyn, X.Pro):X.Pyg");
    }
}
