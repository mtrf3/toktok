package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.VGv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79469VGv {
    public java.util.Map<String, String> LIZ;
    public java.util.Map<String, String> LIZIZ;
    public final VHF LIZJ = new VHF();
    public final C79471VGx LIZLLL = new C79471VGx();
    public final C79466VGs LJ = new C79466VGs(new C79467VGt());

    public final List<VH6> LIZIZ(List<VH6> list) {
        ArrayList arrayList = new ArrayList();
        for (VH6 vh6 : list) {
            java.util.Map<String, List<String>> map = vh6.LIZIZ;
            java.util.Map<String, List<String>> map2 = vh6.LIZJ;
            if (LIZ(this.LIZIZ, map) && LIZ(this.LIZ, map2)) {
                arrayList.add(vh6);
            }
        }
        return arrayList;
    }

    public final void LIZJ(VHN vhn) {
        this.LIZJ.LIZ = vhn;
        C79471VGx c79471VGx = this.LIZLLL;
        c79471VGx.getClass();
        c79471VGx.LIZJ = vhn.LJFF;
        ((CopyOnWriteArrayList) c79471VGx.LIZIZ).clear();
        List<InterfaceC79472VGy> list = vhn.LJ;
        if (list != null && list.size() > 0) {
            ((CopyOnWriteArrayList) c79471VGx.LIZIZ).addAll(list);
        }
        this.LIZ = this.LIZJ.LIZ();
        final C79471VGx c79471VGx2 = this.LIZLLL;
        c79471VGx2.getClass();
        final HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c79471VGx2.LIZ);
        arrayList.addAll(c79471VGx2.LIZIZ);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("portraitParsers filter: null parsers：");
            LIZ.append(arrayList);
            X1D.LIZIZ(LIZ);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    arrayList2.add(next);
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((InterfaceC79472VGy) it2.next()).key());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            final InterfaceC79472VGy interfaceC79472VGy = (InterfaceC79472VGy) it3.next();
            C79413VEr.LIZ(interfaceC79472VGy.key(), new InterfaceC79414VEs() { // from class: X.VGw
                @Override // X.InterfaceC79414VEs
                public final Object execute() {
                    C79471VGx c79471VGx3 = C79471VGx.this;
                    java.util.Map map = hashMap;
                    InterfaceC79472VGy interfaceC79472VGy2 = interfaceC79472VGy;
                    c79471VGx3.getClass();
                    return map.put(interfaceC79472VGy2.key(), interfaceC79472VGy2.LIZ(c79471VGx3.LIZJ));
                }
            });
        }
        this.LIZIZ = hashMap;
        C16880lQ.LLLZ("ConditionMatcher update portraits: server:%s, client:%s", new Object[]{this.LIZ, hashMap});
    }

    public final boolean LIZ(java.util.Map<String, String> map, java.util.Map<String, List<String>> map2) {
        if (map2 == null || map2.size() == 0) {
            return true;
        }
        if (map == null || map.size() == 0) {
            return false;
        }
        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (!map.containsKey(key)) {
                return false;
            }
            if (!this.LJ.LIZ(map.get(key), value)) {
                return false;
            }
        }
        return true;
    }
}
