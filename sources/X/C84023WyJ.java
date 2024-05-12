package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VERecorder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS67S1100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WyJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84023WyJ implements InterfaceC83192Wku {
    public final HashMap<Integer, List<ComposerInfo>> LIZ;
    public final VERecorder LIZIZ;

    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator LJ = C06540Nm.LJ(this.LIZ, "nodeMap.values");
        while (LJ.hasNext()) {
            List<ComposerInfo> it = (List) LJ.next();
            o.LJIIIIZZ(it, "it");
            for (ComposerInfo composerInfo : it) {
                arrayList.add(composerInfo.nodePath);
                arrayList2.add(composerInfo.extra);
            }
        }
        VERecorder vERecorder = this.LIZIZ;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = arrayList.size();
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                vERecorder.LJII(strArr, size, (String[]) array2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // X.InterfaceC83192Wku
    public final void j() {
        this.LIZIZ.LIZIZ.setComposerMode(1, 0);
    }

    @Override // X.InterfaceC83192Wku
    public final void k() {
        this.LIZ.clear();
        LIZ();
    }

    @Override // X.InterfaceC83192Wku
    public final InterfaceC45910I0c l() {
        return new C84020WyG(this);
    }

    public C84023WyJ(VERecorder recoder) {
        o.LJIIIZ(recoder, "recoder");
        this.LIZIZ = recoder;
        this.LIZ = new HashMap<>(8);
    }

    public final void LIZIZ(String str) {
        java.util.Set<Integer> keySet = this.LIZ.keySet();
        o.LJIIIIZZ(keySet, "nodeMap.keys");
        for (Integer num : keySet) {
            List<ComposerInfo> list = this.LIZ.get(num);
            if (list != null) {
                ORS.LJJLIL(new AqS67S1100000_14(num, str, 2), list);
            }
        }
    }

    @Override // X.InterfaceC83192Wku
    public final void m(List<ComposerInfo> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ComposerInfo composerInfo = (ComposerInfo) it.next();
            arrayList2.add(composerInfo.nodePath);
            LIZIZ(composerInfo.nodePath);
        }
        VERecorder vERecorder = this.LIZIZ;
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            int size = arrayList2.size();
            vERecorder.LIZIZ.removeComposerNodes((String[]) array, size);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // X.InterfaceC83192Wku
    public final void LLILLL(List<ComposerInfo> list, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap<Integer, List<ComposerInfo>> hashMap = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, List<ComposerInfo>> entry : hashMap.entrySet()) {
            if (entry.getKey().intValue() == i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                arrayList.add(((ComposerInfo) it2.next()).nodePath);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = ((ArrayList) list).iterator();
        while (it3.hasNext()) {
            ComposerInfo composerInfo = (ComposerInfo) it3.next();
            arrayList3.add(composerInfo.nodePath);
            arrayList2.add(composerInfo.extra);
        }
        List<ComposerInfo> list2 = this.LIZ.get(Integer.valueOf(i));
        if (list2 != null) {
            list2.clear();
        } else {
            list2 = new CopyOnWriteArrayList<>();
            this.LIZ.put(Integer.valueOf(i), list2);
        }
        list2.addAll(list);
        VERecorder vERecorder = this.LIZIZ;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = arrayList.size();
            Object[] array2 = arrayList3.toArray(new String[0]);
            if (array2 != null) {
                String[] strArr2 = (String[]) array2;
                int size2 = arrayList3.size();
                Object[] array3 = arrayList2.toArray(new String[0]);
                if (array3 != null) {
                    vERecorder.LJFF(strArr, size, strArr2, size2, (String[]) array3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // X.InterfaceC83192Wku
    public final void LLLLIIL(List<ComposerInfo> list, int i) {
        List<ComposerInfo> list2 = this.LIZ.get(Integer.valueOf(i));
        if (list2 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.addAll(list);
            this.LIZ.put(Integer.valueOf(i), copyOnWriteArrayList);
        } else {
            list2.removeAll(list);
            list2.addAll(list);
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComposerInfo) it.next()).nodePath);
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ComposerInfo) it2.next()).extra);
        }
        VERecorder vERecorder = this.LIZIZ;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            int size = arrayList.size();
            Object[] array2 = arrayList3.toArray(new String[0]);
            if (array2 != null) {
                vERecorder.getClass();
                VEEffectParams vEEffectParams = new VEEffectParams();
                vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
                vEEffectParams.intValueOne = size;
                vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(array));
                vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(array2));
                P4Q.LJII("VERecorder", "appendComposerNodes...");
                if (vEEffectParams.stringArrayOne.size() != size || vEEffectParams.stringArrayTwo.size() != size) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Nodes size=");
                    LIZ.append(vEEffectParams.stringArrayOne.size());
                    LIZ.append(", tags size=");
                    LIZ.append(vEEffectParams.stringArrayTwo.size());
                    LIZ.append(", but nodeNum=");
                    LIZ.append(size);
                    P4Q.LIZJ("VERecorder", X1D.LIZIZ(LIZ));
                    return;
                }
                vERecorder.LIZIZ.setVEEffectParams(vEEffectParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // X.InterfaceC83192Wku
    public final void a(List<ComposerInfo> list, int i) {
        List<ComposerInfo> list2 = this.LIZ.get(Integer.valueOf(i));
        if (list2 != null) {
            list2.clear();
        } else {
            list2 = new CopyOnWriteArrayList<>();
            this.LIZ.put(Integer.valueOf(i), list2);
        }
        ORZ.LJLLI(list, list2);
        LIZ();
    }

    @Override // X.InterfaceC83192Wku
    public final void i(List<ComposerInfo> list, int i) {
        this.LIZ.clear();
        HashMap<Integer, List<ComposerInfo>> hashMap = this.LIZ;
        Integer valueOf = Integer.valueOf(i);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ORZ.LJLLI(list, copyOnWriteArrayList);
        hashMap.put(valueOf, copyOnWriteArrayList);
        LIZ();
    }

    @Override // X.InterfaceC83192Wku
    public final void LLIIJI(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        List<ComposerInfo> list3 = this.LIZ.get(Integer.valueOf(i));
        if (list3 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.removeAll(list);
            copyOnWriteArrayList.addAll(list2);
            this.LIZ.put(Integer.valueOf(i), copyOnWriteArrayList);
        } else {
            list3.removeAll(list);
            list3.addAll(list2);
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(C38891fp.LJIJ(i, ((ComposerInfo) it.next()).nodePath));
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        ArrayList arrayList3 = (ArrayList) list2;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ComposerInfo) it2.next()).nodePath);
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((ComposerInfo) it3.next()).extra);
        }
        VERecorder vERecorder = this.LIZIZ;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = arrayList.size();
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                String[] strArr2 = (String[]) array2;
                int size2 = arrayList2.size();
                Object[] array3 = arrayList4.toArray(new String[0]);
                if (array3 != null) {
                    vERecorder.LJFF(strArr, size, strArr2, size2, (String[]) array3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
