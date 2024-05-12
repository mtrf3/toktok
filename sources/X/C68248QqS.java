package X;

import X.C0M9;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QqS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68248QqS {
    public final String LIZ;
    public final boolean LIZIZ;
    public final C68263Qqh LIZJ;
    public final BitSet LIZLLL;
    public final BitSet LJ;
    public final java.util.Map LJFF;
    public final C1HQ LJI;
    public final /* synthetic */ C68279Qqx LJII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.Qrm] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    public final C68265Qqj LIZ(int i) {
        ?? arrayList;
        C68308QrQ LJIJ = C68265Qqj.LJIJ();
        if (LJIJ.LJLJI) {
            LJIJ.LJIIJ();
            LJIJ.LJLJI = false;
        }
        C68265Qqj.LJIL((C68265Qqj) LJIJ.LJLILLLLZI, i);
        boolean z = this.LIZIZ;
        if (LJIJ.LJLJI) {
            LJIJ.LJIIJ();
            LJIJ.LJLJI = false;
        }
        C68265Qqj.LJJIFFI((C68265Qqj) LJIJ.LJLILLLLZI, z);
        C68263Qqh c68263Qqh = this.LIZJ;
        if (c68263Qqh != null) {
            if (LJIJ.LJLJI) {
                LJIJ.LJIIJ();
                LJIJ.LJLJI = false;
            }
            C68265Qqj.LJJI((C68265Qqj) LJIJ.LJLILLLLZI, c68263Qqh);
        }
        C68262Qqg LJIJI = C68263Qqh.LJIJI();
        LJIJI.LJIIJJI(C68243QqN.LJJIIJ(this.LIZLLL));
        LJIJI.LJIIL(C68243QqN.LJJIIJ(this.LJ));
        java.util.Map map = this.LJFF;
        if (map != null) {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = this.LJFF.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Long l = (Long) this.LJFF.get(Integer.valueOf(intValue));
                if (l != null) {
                    C68310QrS LJIJ2 = C68274Qqs.LJIJ();
                    if (LJIJ2.LJLJI) {
                        LJIJ2.LJIIJ();
                        LJIJ2.LJLJI = false;
                    }
                    C68274Qqs.LJIJJ((C68274Qqs) LJIJ2.LJLILLLLZI, intValue);
                    long longValue = l.longValue();
                    if (LJIJ2.LJLJI) {
                        LJIJ2.LJIIJ();
                        LJIJ2.LJLJI = false;
                    }
                    C68274Qqs.LJIJJLI((C68274Qqs) LJIJ2.LJLILLLLZI, longValue);
                    arrayList2.add(LJIJ2.LJIIIIZZ());
                }
            }
            if (LJIJI.LJLJI) {
                LJIJI.LJIIJ();
                LJIJI.LJLJI = false;
            }
            C68263Qqh c68263Qqh2 = (C68263Qqh) LJIJI.LJLILLLLZI;
            c68263Qqh2.LJJ();
            YIP.LJI(arrayList2, c68263Qqh2.zzg);
        }
        C1HQ c1hq = this.LJI;
        if (c1hq == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(c1hq.LJLJI);
            Iterator it2 = ((C0M9.c) this.LJI.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                C68302QrK LJIJI2 = C68271Qqp.LJIJI();
                int intValue2 = num.intValue();
                if (LJIJI2.LJLJI) {
                    LJIJI2.LJIIJ();
                    LJIJI2.LJLJI = false;
                }
                C68271Qqp.LJIJJLI((C68271Qqp) LJIJI2.LJLILLLLZI, intValue2);
                List list = (List) this.LJI.getOrDefault(num, null);
                if (list != null) {
                    Collections.sort(list);
                    if (LJIJI2.LJLJI) {
                        LJIJI2.LJIIJ();
                        LJIJI2.LJLJI = false;
                    }
                    C68271Qqp c68271Qqp = (C68271Qqp) LJIJI2.LJLILLLLZI;
                    ?? r1 = c68271Qqp.zzg;
                    if (!((AbstractC84676XLc) r1).LJLIL) {
                        c68271Qqp.zzg = YIN.LJIILIIL(r1);
                    }
                    YIP.LJI(list, c68271Qqp.zzg);
                }
                arrayList.add(LJIJI2.LJIIIIZZ());
            }
        }
        if (LJIJI.LJLJI) {
            LJIJI.LJIIJ();
            LJIJI.LJLJI = false;
        }
        C68263Qqh c68263Qqh3 = (C68263Qqh) LJIJI.LJLILLLLZI;
        XM7 xm7 = c68263Qqh3.zzh;
        if (!xm7.LIZIZ()) {
            c68263Qqh3.zzh = YIN.LJIILJJIL(xm7);
        }
        YIP.LJI(arrayList, c68263Qqh3.zzh);
        if (LJIJ.LJLJI) {
            LJIJ.LJIIJ();
            LJIJ.LJLJI = false;
        }
        C68265Qqj.LJJ((C68265Qqj) LJIJ.LJLILLLLZI, (C68263Qqh) LJIJI.LJIIIIZZ());
        return (C68265Qqj) LJIJ.LJIIIIZZ();
    }

    public final void LIZIZ(AbstractC68251QqV abstractC68251QqV) {
        int LIZ = abstractC68251QqV.LIZ();
        Boolean bool = abstractC68251QqV.LIZJ;
        if (bool != null) {
            this.LJ.set(LIZ, bool.booleanValue());
        }
        Boolean bool2 = abstractC68251QqV.LIZLLL;
        if (bool2 != null) {
            this.LIZLLL.set(LIZ, bool2.booleanValue());
        }
        if (abstractC68251QqV.LJ != null) {
            java.util.Map map = this.LJFF;
            Integer valueOf = Integer.valueOf(LIZ);
            Long l = (Long) map.get(valueOf);
            long longValue = abstractC68251QqV.LJ.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.LJFF.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC68251QqV.LJFF != null) {
            C1HQ c1hq = this.LJI;
            Integer valueOf2 = Integer.valueOf(LIZ);
            List list = (List) c1hq.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                this.LJI.put(valueOf2, list);
            }
            if (abstractC68251QqV.LIZJ()) {
                list.clear();
            }
            C68576Qvk.LIZ();
            C68034Qn0 c68034Qn0 = this.LJII.LIZ.LJI;
            String str = this.LIZ;
            C68067QnX c68067QnX = C68555QvP.LJJJJLL;
            if (c68034Qn0.LJIILJJIL(str, c68067QnX) && abstractC68251QqV.LIZIZ()) {
                list.clear();
            }
            C68576Qvk.LIZ();
            if (this.LJII.LIZ.LJI.LJIILJJIL(this.LIZ, c68067QnX)) {
                Long valueOf3 = Long.valueOf(abstractC68251QqV.LJFF.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC68251QqV.LJFF.longValue() / 1000));
        }
    }

    public /* synthetic */ C68248QqS(C68279Qqx c68279Qqx, String str) {
        this.LJII = c68279Qqx;
        this.LIZ = str;
        this.LIZIZ = true;
        this.LIZLLL = new BitSet();
        this.LJ = new BitSet();
        this.LJFF = new C1HQ();
        this.LJI = new C1HQ();
    }

    public C68248QqS(C68279Qqx c68279Qqx, String str, C68263Qqh c68263Qqh, BitSet bitSet, BitSet bitSet2, C1HQ c1hq, C1HQ c1hq2) {
        this.LJII = c68279Qqx;
        this.LIZ = str;
        this.LIZLLL = bitSet;
        this.LJ = bitSet2;
        this.LJFF = c1hq;
        this.LJI = new C1HQ();
        Iterator it = ((C0M9.c) c1hq2.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1hq2.getOrDefault(next, null));
            this.LJI.put(next, arrayList);
        }
        this.LIZIZ = false;
        this.LIZJ = c68263Qqh;
    }
}
