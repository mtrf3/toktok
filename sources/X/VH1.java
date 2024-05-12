package X;

import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public final class VH1 {
    public java.util.Map<String, String> LIZ;
    public java.util.Map<String, String> LIZIZ;
    public final VHG LIZJ = new VHG();
    public final VH0 LIZLLL = new VH0();
    public final VH2 LJ = new VH2(new VH3());

    public final List<ConditionConfig> LIZIZ(List<ConditionConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (ConditionConfig conditionConfig : list) {
            java.util.Map<String, List<String>> map = conditionConfig.clientFilterRequirement;
            java.util.Map<String, List<String>> map2 = conditionConfig.serverFilterRequirement;
            if (LIZ(this.LIZIZ, map) && LIZ(this.LIZ, map2)) {
                arrayList.add(conditionConfig);
            }
        }
        return arrayList;
    }

    public final void LIZJ(VHN vhn) {
        this.LIZJ.LIZ = vhn;
        VH0 vh0 = this.LIZLLL;
        vh0.getClass();
        vh0.LIZJ = vhn.LJFF;
        ((CopyOnWriteArrayList) vh0.LIZIZ).clear();
        List<InterfaceC79472VGy> list = vhn.LJ;
        if (list != null && list.size() > 0) {
            ((CopyOnWriteArrayList) vh0.LIZIZ).addAll(list);
        }
        this.LIZ = this.LIZJ.LIZ();
        final VH0 vh02 = this.LIZLLL;
        vh02.getClass();
        final HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(vh02.LIZ);
        arrayList.addAll(vh02.LIZIZ);
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
            C79415VEt.LIZ(interfaceC79472VGy.key(), new InterfaceC79416VEu() { // from class: X.VGz
                @Override // X.InterfaceC79416VEu
                public final Object execute() {
                    VH0 vh03 = VH0.this;
                    java.util.Map map = hashMap;
                    InterfaceC79472VGy interfaceC79472VGy2 = interfaceC79472VGy;
                    vh03.getClass();
                    return map.put(interfaceC79472VGy2.key(), interfaceC79472VGy2.LIZ(vh03.LIZJ));
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
