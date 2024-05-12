package com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel;

import X.AbstractC78795UwB;
import X.ActivityC45651qj;
import X.C199797sl;
import X.C2058786d;
import X.C221108m2;
import X.C47261Igj;
import X.C51029K0z;
import X.C62822Ol8;
import X.C78789Uw5;
import X.C78797UwD;
import X.C78798UwE;
import X.C78801UwH;
import X.C78802UwI;
import X.C78804UwK;
import X.C78826Uwg;
import X.C78827Uwh;
import X.C78832Uwm;
import X.C83492Wpk;
import X.ORZ;
import X.OSZ;
import X.XKX;
import Y.AObserverS81S0100000_13;
import Y.IDComparatorS41S0000000_13;
import Y.IDHandlerS24S0100000_14;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class OptionCategoryPanelViewModel extends ViewModel {
    public final Effect LJLIL;
    public final Effect LJLILLLLZI;
    public final String LJLJI;
    public final ActivityC45651qj LJLJJI;
    public final C78826Uwg LJLJJL;
    public final MutableLiveData<List<C78801UwH>> LJLJJLL;
    public final MutableLiveData<OSZ<Map<C78832Uwm, List<C78801UwH>>, C78789Uw5>> LJLJL;
    public final MediatorLiveData<AbstractC78795UwB> LJLJLJ;
    public final MediatorLiveData LJLJLLL;
    public final C62822Ol8 LJLL;

    public final void hv0() {
        AbstractC78795UwB value = this.LJLJLJ.getValue();
        C78797UwD c78797UwD = C78797UwD.LIZ;
        if (o.LJ(value, c78797UwD)) {
            return;
        }
        this.LJLJLJ.setValue(c78797UwD);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C78827Uwh(this, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C83492Wpk c83492Wpk = (C83492Wpk) this.LJLL.getValue();
        if (c83492Wpk != null) {
            c83492Wpk.LIZIZ.quitSafely();
            IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = c83492Wpk.LIZJ;
            if (iDHandlerS24S0100000_14 != null) {
                iDHandlerS24S0100000_14.removeCallbacksAndMessages(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC78795UwB gv0(MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2) {
        Map map;
        C78789Uw5 c78789Uw5;
        C2058786d c2058786d;
        List list;
        ArrayList LIZIZ;
        AbstractC78795UwB value = this.LJLJLJ.getValue();
        C78798UwE c78798UwE = C78798UwE.LIZ;
        if (o.LJ(value, c78798UwE)) {
            return c78798UwE;
        }
        List list2 = (List) mutableLiveData.getValue();
        OSZ osz = (OSZ) mutableLiveData2.getValue();
        if (osz != null && (map = (Map) osz.getFirst()) != null) {
            TreeMap treeMap = new TreeMap(new IDComparatorS41S0000000_13(8));
            treeMap.putAll(map);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(treeMap.size()));
            for (Map.Entry entry : treeMap.entrySet()) {
                Object key = entry.getKey();
                C78832Uwm c78832Uwm = (C78832Uwm) entry.getKey();
                List list3 = (List) entry.getValue();
                String str = c78832Uwm.LIZ;
                int hashCode = str.hashCode();
                if (hashCode != -504784764) {
                    if (hashCode != 84904) {
                        if (hashCode == 1581963763 && str.equals("Environment")) {
                            LIZIZ = s1.LIZIZ(list3, "value");
                            Iterator it = list3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (o.LJ(((C78801UwH) next).LIZ, "Green Screen")) {
                                    if (next != null) {
                                        LIZIZ.add(next);
                                    }
                                }
                            }
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next2 = it2.next();
                                if (o.LJ(((C78801UwH) next2).LIZ, "Filters")) {
                                    if (next2 != null) {
                                        LIZIZ.add(next2);
                                    }
                                }
                            }
                            Iterator it3 = list3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next3 = it3.next();
                                if (o.LJ(((C78801UwH) next3).LIZ, "Atmosphere")) {
                                    if (next3 != null) {
                                        LIZIZ.add(next3);
                                    }
                                }
                            }
                            if (LIZIZ.isEmpty()) {
                            }
                            list3 = LIZIZ;
                        }
                        linkedHashMap.put(key, list3);
                    } else {
                        if (str.equals("VFX")) {
                            LIZIZ = s1.LIZIZ(list3, "value");
                            Iterator it4 = list3.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                Object next4 = it4.next();
                                if (o.LJ(((C78801UwH) next4).LIZ, "$VFX_Transition")) {
                                    if (next4 != null) {
                                        LIZIZ.add(next4);
                                    }
                                }
                            }
                            Iterator it5 = list3.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                Object next5 = it5.next();
                                if (o.LJ(((C78801UwH) next5).LIZ, "VFX Interactive")) {
                                    if (next5 != null) {
                                        LIZIZ.add(next5);
                                    }
                                }
                            }
                            if (LIZIZ.isEmpty()) {
                            }
                            list3 = LIZIZ;
                        }
                        linkedHashMap.put(key, list3);
                    }
                } else {
                    if (str.equals("Appearance")) {
                        LIZIZ = s1.LIZIZ(list3, "value");
                        Iterator it6 = list3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            Object next6 = it6.next();
                            if (o.LJ(((C78801UwH) next6).LIZ, "Eye Color")) {
                                if (next6 != null) {
                                    LIZIZ.add(next6);
                                }
                            }
                        }
                        Iterator it7 = list3.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            Object next7 = it7.next();
                            if (o.LJ(((C78801UwH) next7).LIZ, "Eyes")) {
                                if (next7 != null) {
                                    LIZIZ.add(next7);
                                }
                            }
                        }
                        Iterator it8 = list3.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            Object next8 = it8.next();
                            if (o.LJ(((C78801UwH) next8).LIZ, "Face")) {
                                if (next8 != null) {
                                    LIZIZ.add(next8);
                                }
                            }
                        }
                        Iterator it9 = list3.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                break;
                            }
                            Object next9 = it9.next();
                            if (o.LJ(((C78801UwH) next9).LIZ, "Lips")) {
                                if (next9 != null) {
                                    LIZIZ.add(next9);
                                }
                            }
                        }
                        Iterator it10 = list3.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                break;
                            }
                            Object next10 = it10.next();
                            if (o.LJ(((C78801UwH) next10).LIZ, "Eyewear")) {
                                if (next10 != null) {
                                    LIZIZ.add(next10);
                                }
                            }
                        }
                        Iterator it11 = list3.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                break;
                            }
                            Object next11 = it11.next();
                            if (o.LJ(((C78801UwH) next11).LIZ, "Accessories")) {
                                if (next11 != null) {
                                    LIZIZ.add(next11);
                                }
                            }
                        }
                        if (LIZIZ.isEmpty()) {
                        }
                        list3 = LIZIZ;
                    }
                    linkedHashMap.put(key, list3);
                }
            }
            int i = 0;
            if (linkedHashMap != null && !linkedHashMap.isEmpty() && list2 != null) {
                if (!list2.isEmpty()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (o.LJ(((C78832Uwm) entry2.getKey()).LIZ, "Environment")) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    if ((!linkedHashMap2.isEmpty()) && (list = (List) linkedHashMap.get(ORZ.LJLLILLLL(linkedHashMap2.keySet()))) != null) {
                        list.addAll(0, list2);
                    }
                }
                C78804UwK c78804UwK = new C78804UwK();
                OSZ osz2 = (OSZ) mutableLiveData2.getValue();
                if (osz2 != null && (c78789Uw5 = (C78789Uw5) osz2.getSecond()) != null) {
                    for (Object obj : linkedHashMap.entrySet()) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Map.Entry entry3 = (Map.Entry) obj;
                            if (o.LJ(((C78832Uwm) entry3.getKey()).LIZ, c78789Uw5.LIZ)) {
                                String str2 = c78789Uw5.LIZ;
                                o.LJIIIZ(str2, "<set-?>");
                                c78804UwK.LJLIL = str2;
                                c78804UwK.LJLILLLLZI = i;
                                List list4 = (List) entry3.getValue();
                                Object value2 = entry3.getValue();
                                o.LJIIIIZZ(value2, "entry.value");
                                Iterator it12 = ORZ.LLJJI((Iterable) value2).iterator();
                                do {
                                    C199797sl c199797sl = (C199797sl) it12;
                                    if (c199797sl.hasNext()) {
                                        c2058786d = (C2058786d) c199797sl.next();
                                    } else {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                } while (!o.LJ(((C78801UwH) c2058786d.LIZIZ).LIZ, c78789Uw5.LJ));
                                int i3 = c2058786d.LIZ;
                                c78804UwK.LJLJJI = i3;
                                C78801UwH c78801UwH = (C78801UwH) ListProtector.get(list4, i3);
                                String str3 = c78789Uw5.LIZJ;
                                o.LJIIIZ(str3, "<set-?>");
                                c78804UwK.LJLJJL = str3;
                                int size = c78801UwH.LJ.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (o.LJ(((C78789Uw5) ListProtector.get(c78801UwH.LJ, i4)).LIZJ, c78789Uw5.LIZJ)) {
                                        c78804UwK.LJLJJLL = i4;
                                    }
                                }
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                return new C78802UwI(linkedHashMap, c78804UwK);
            }
        }
        return C78797UwD.LIZ;
    }

    public OptionCategoryPanelViewModel(Effect effect, Effect effect2, String str, ActivityC45651qj activityC45651qj, C78826Uwg c78826Uwg) {
        this.LJLIL = effect;
        this.LJLILLLLZI = effect2;
        this.LJLJI = str;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = c78826Uwg;
        MutableLiveData<List<C78801UwH>> mutableLiveData = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData;
        MutableLiveData<OSZ<Map<C78832Uwm, List<C78801UwH>>, C78789Uw5>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJL = mutableLiveData2;
        MediatorLiveData<AbstractC78795UwB> mediatorLiveData = new MediatorLiveData<>();
        this.LJLJLJ = mediatorLiveData;
        this.LJLJLLL = mediatorLiveData;
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 269));
        mediatorLiveData.addSource(mutableLiveData, new AObserverS81S0100000_13(this, 52));
        mediatorLiveData.addSource(mutableLiveData2, new AObserverS81S0100000_13(this, 53));
        hv0();
    }
}
