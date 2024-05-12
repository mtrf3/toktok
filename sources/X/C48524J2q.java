package X;

import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.J2q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48524J2q implements J4G {
    public static final ConcurrentHashMap<String, C48524J2q> LJIILL = new ConcurrentHashMap<>();
    public final String LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C48526J2s LJI;
    public int LJII;
    public final C48526J2s LJIIIIZZ;
    public final C48526J2s LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public C48532J2y LJIIL;
    public InterfaceC48527J2t LJIILIIL;
    public LinkedList<C48525J2r> LJIILJJIL;

    public C48524J2q(String str) {
        this.LIZ = str;
        C1JX.LJIIIIZZ("ml#", str);
        this.LIZIZ = J3Y.LIZ;
        this.LIZLLL = "";
        this.LJI = new C48526J2s();
        this.LJIIIIZZ = new C48526J2s();
        this.LJIIIZ = new C48526J2s();
    }

    public final void LIZ(int i) {
        C48532J2y c48532J2y;
        InterfaceC48527J2t interfaceC48527J2t;
        Integer num;
        if (!this.LIZIZ || !this.LJIIJJI || (c48532J2y = this.LJIIL) == null || c48532J2y.LIZ != i || (interfaceC48527J2t = this.LJIILIIL) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCheckReportTruth scene:");
        LIZ.append(this.LIZ);
        LIZ.append(" cache:");
        LinkedList<C48525J2r> linkedList = this.LJIILJJIL;
        if (linkedList != null) {
            num = Integer.valueOf(linkedList.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append('-');
        LIZ.append(this.LJIILJJIL);
        X1D.LIZIZ(LIZ);
        LinkedList<C48525J2r> linkedList2 = this.LJIILJJIL;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (linkedList2) {
            Iterator<C48525J2r> it = linkedList2.iterator();
            while (it.hasNext()) {
                C48525J2r next = it.next();
                int i2 = next.LIZJ - 1;
                next.LIZJ = i2;
                if (i2 <= 0) {
                    if (!interfaceC48527J2t.LIZ(next.LIZIZ, next.LIZ)) {
                        FMX.LJIILJJIL("ml_scene_run", next.LIZIZ);
                    }
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedList2.removeAll(arrayList);
            }
        }
    }

    @Override // X.J4G
    public final void LIZIZ(String type, J4A j4a) {
        o.LJIIIZ(type, "type");
        switch (type.hashCode()) {
            case -1877535187:
                if (!type.equals("play_stop")) {
                    return;
                }
                LIZ(103);
                return;
            case -1704536429:
                if (!type.equals("play_first_frame")) {
                    return;
                }
                LIZ(102);
                return;
            case 1168529143:
                if (!type.equals("play_call_playtime")) {
                    return;
                }
                LIZ(101);
                return;
            case 1274399484:
                if (!type.equals("play_prepare")) {
                    return;
                }
                LIZ(100);
                return;
            default:
                return;
        }
    }

    public final void LIZLLL(C48532J2y c48532J2y, InterfaceC48527J2t injector) {
        o.LJIIIZ(injector, "injector");
        if (!this.LIZIZ) {
            return;
        }
        this.LJIIJJI = true;
        this.LJIIL = c48532J2y;
        this.LJIILIIL = injector;
        switch (c48532J2y.LIZ) {
            case 100:
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_prepare", this);
                return;
            case 101:
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_call_playtime", this);
                return;
            case 102:
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_first_frame", this);
                return;
            case 103:
                MLCommonService.Companion.getClass();
                C46434IKg.LIZ.addCommonEventListener("play_stop", this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        if (r9 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C47322Ihi r8, X.C47333Iht r9, X.AbstractC48521J2n r10) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48524J2q.LIZJ(X.Ihi, X.Iht, X.J2n):void");
    }
}
