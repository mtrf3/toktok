package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class L4L {
    public final java.util.Map<Integer, java.util.Map<String, java.util.Set<String>>> LIZ;
    public java.util.Map<String, ? extends java.util.Set<String>> LIZIZ;
    public java.util.Map<EnumC53663L4h, ? extends AbstractC53585L1h<? extends L4O, ? extends AUS>> LIZJ;
    public java.util.Map<EnumC53663L4h, ? extends InterfaceC53587L1j<?, ?>> LIZLLL;
    public java.util.Map<EnumC53663L4h, ? extends AbstractC53588L1k<?, ?>> LJ;
    public final java.util.Set<? extends L4T> LJFF;
    public final ConcurrentHashMap<L4T, List<L4W>> LJI;
    public final ConcurrentHashMap<L4T, L4W> LJII;
    public final ConcurrentHashMap<L4T, Integer> LJIIIIZZ;

    public final void LIZLLL() {
        Iterator<Map.Entry<L4T, List<L4W>>> it = this.LJI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clear();
        }
        this.LJII.clear();
        this.LJIIIIZZ.clear();
    }

    public L4L() {
        java.util.Map<Integer, java.util.Map<String, java.util.Set<String>>> map = (java.util.Map) L4Q.LIZIZ.getValue();
        this.LIZ = map;
        this.LIZIZ = map.get(Integer.valueOf(AUW.DEFAULT.getValue()));
        this.LJFF = (java.util.Set) L4Q.LIZLLL.getValue();
        this.LJI = new ConcurrentHashMap<>();
        this.LJII = new ConcurrentHashMap<>();
        this.LJIIIIZZ = new ConcurrentHashMap<>();
    }

    public final int LIZJ(L4W l4w) {
        java.util.Set<String> set;
        Integer valueOf;
        if (l4w == null) {
            return 1000;
        }
        String string = l4w.LIZ.getString();
        L4T nodeType = l4w.LIZJ.getNodeType();
        java.util.Map<String, ? extends java.util.Set<String>> map = this.LIZIZ;
        if (map == null || (set = map.get(nodeType.getString())) == null || (valueOf = Integer.valueOf(ORZ.LJLZ(string, set))) == null || valueOf.intValue() == -1) {
            return 1000;
        }
        return valueOf.intValue();
    }

    public final void LIZIZ(Object obj, boolean z, EnumC53663L4h enumC53663L4h) {
        AbstractC53585L1h<? extends L4O, ? extends AUS> abstractC53585L1h;
        if (enumC53663L4h != null) {
            java.util.Map<EnumC53663L4h, ? extends AbstractC53585L1h<? extends L4O, ? extends AUS>> map = this.LIZJ;
            if (map != null) {
                abstractC53585L1h = map.get(enumC53663L4h);
            } else {
                abstractC53585L1h = null;
            }
            LIZ(enumC53663L4h, abstractC53585L1h, obj, z);
            return;
        }
        java.util.Map<EnumC53663L4h, ? extends AbstractC53585L1h<? extends L4O, ? extends AUS>> map2 = this.LIZJ;
        if (map2 == null) {
            return;
        }
        for (Map.Entry<EnumC53663L4h, ? extends AbstractC53585L1h<? extends L4O, ? extends AUS>> entry : map2.entrySet()) {
            LIZ(entry.getKey(), entry.getValue(), obj, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x002d, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r4 = r16.LJ(r2);
     */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.AUS, VARIANT extends X.AUS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EnumC53663L4h r15, X.AbstractC53585L1h<? extends X.L4O, ? extends X.AUS> r16, java.lang.Object r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4L.LIZ(X.L4h, X.L1h, java.lang.Object, boolean):void");
    }
}
