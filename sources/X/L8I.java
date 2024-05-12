package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.main.assems.tabs.BottomTabNode;
import com.ss.android.ugc.aweme.main.assems.tabs.BottomTabNodeGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L8I extends L8H {
    public java.util.Map<Integer, List<String>> LIZLLL;
    public List<? extends BottomTabProtocol> LJFF;
    public final ConcurrentHashMap<String, WeakReference<InterfaceC54080LKi>> LIZIZ = new ConcurrentHashMap<>();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(E81.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new E80(this));

    @Override // X.L8H
    public final OSZ<Boolean, L8G> LIZ() {
        java.util.Map<String, List<BottomTab>> map;
        java.util.Set<String> keySet;
        String key;
        String str;
        String str2;
        L8G l8g = null;
        if (!C53157Ktd.LIZ()) {
            return new OSZ<>(Boolean.TRUE, null);
        }
        TabConfig LIZ = L76.LIZ();
        if (LIZ != null) {
            map = LIZ.bottomTab;
        } else {
            map = null;
        }
        this.LIZLLL = null;
        boolean z = true;
        if (map != null && (keySet = map.keySet()) != null && keySet.size() == 5) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                for (Map.Entry<String, List<BottomTab>> entry : map.entrySet()) {
                    if (!entry.getValue().isEmpty()) {
                        Integer valueOf = Integer.valueOf(CastIntegerProtector.parseInt(entry.getKey()));
                        List<BottomTab> value = entry.getValue();
                        ArrayList arrayList = new ArrayList(C32I.LJJL(value, 10));
                        Iterator<T> it = value.iterator();
                        while (it.hasNext()) {
                            String str3 = ((BottomTab) it.next()).bottomTabKey;
                            if (str3 == null || str3.length() == 0) {
                                throw new IllegalStateException();
                            }
                            arrayList.add(str3);
                        }
                        linkedHashMap.put(valueOf, arrayList);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                key = EnumC53808L9w.HOME.getKey();
                List list = (List) linkedHashMap.get(0);
                if (list != null) {
                    str = (String) ListProtector.get(list, 0);
                } else {
                    str = null;
                }
            } catch (Exception e) {
                if (e instanceof IllegalStateException) {
                    l8g = L8G.BOTTOM_TAB_CONFIG_INVALID;
                } else {
                    l8g = L8G.JSON_PARSE_ERROR;
                }
            }
            if (!o.LJ(key, str)) {
                l8g = L8G.WRONG_FIRST_BOTTOM_TAB;
            } else {
                String key2 = EnumC53808L9w.SHOOT.getKey();
                List list2 = (List) linkedHashMap.get(2);
                if (list2 != null) {
                    str2 = (String) ListProtector.get(list2, 0);
                } else {
                    str2 = null;
                }
                if (!o.LJ(key2, str2)) {
                    l8g = L8G.WRONG_THIRD_BOTTOM_TAB;
                }
                this.LIZLLL = linkedHashMap;
                return new OSZ<>(Boolean.valueOf(z), l8g);
            }
            if (l8g != null) {
                z = false;
                return new OSZ<>(Boolean.valueOf(z), l8g);
            }
            this.LIZLLL = linkedHashMap;
            return new OSZ<>(Boolean.valueOf(z), l8g);
        }
        return new OSZ<>(Boolean.FALSE, L8G.BOTTOM_TAB_SIZE_ERROR);
    }

    public final OSZ<List<String>, List<BottomTabProtocol>> LJ() {
        java.util.Map<Integer, List<String>> map;
        boolean z;
        BottomTabProtocol bottomTabProtocol;
        if (!LIZJ().LJIIIIZZ()) {
            L82.LIZJ = false;
            ((AbstractC48820JEa) this.LIZJ.getValue()).LJ("BottomTabOperator", "Illegal data");
            map = (java.util.Map) this.LJ.getValue();
        } else {
            map = this.LIZLLL;
            if (map == null) {
                map = (java.util.Map) this.LJ.getValue();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("collectFinalShowTabs>>>isUseFcpData:");
        if (this.LIZLLL != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = map.keySet().size();
        if (size >= 0) {
            int i = 0;
            while (true) {
                List<String> list = map.get(Integer.valueOf(i));
                if (list != null) {
                    Iterator<String> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        L8Z l8z = (L8Z) LIZJ().LIZJ.getValue();
                        l8z.LIZIZ();
                        AbstractC53764L8e abstractC53764L8e = (AbstractC53764L8e) ((ConcurrentHashMap) l8z.LIZIZ.getValue()).get(next);
                        if (abstractC53764L8e != null && (bottomTabProtocol = (BottomTabProtocol) abstractC53764L8e.LIZIZ.getValue()) != null && bottomTabProtocol.enable()) {
                            arrayList2.add(bottomTabProtocol);
                            arrayList.add(next);
                            break;
                        }
                    }
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return new OSZ<>(arrayList, arrayList2);
    }

    @Override // X.L8H
    public final L84 LIZLLL() {
        return L84.BOTTOM_TAB;
    }

    @Override // X.L8H
    public final List<String> LIZIZ(boolean z) {
        if (!C53157Ktd.LIZ()) {
            return new ArrayList();
        }
        OSZ<List<String>, List<BottomTabProtocol>> LJ = LJ();
        List<String> first = LJ.getFirst();
        List<BottomTabProtocol> second = LJ.getSecond();
        if (z) {
            this.LJFF = second;
        }
        return first;
    }

    public final InterfaceC54080LKi LJFF(Context context, BottomTabProtocol bottomTabProtocol) {
        InterfaceC54080LKi bottomTabNodeGroup;
        WeakReference<InterfaceC54080LKi> weakReference = this.LIZIZ.get(bottomTabProtocol.getTag());
        if (weakReference == null || (bottomTabNodeGroup = weakReference.get()) == null) {
            if (bottomTabProtocol.LJ() == null) {
                bottomTabNodeGroup = new BottomTabNode(context, bottomTabProtocol);
            } else {
                bottomTabNodeGroup = new BottomTabNodeGroup(context, bottomTabProtocol);
            }
            this.LIZIZ.put(bottomTabProtocol.getTag(), new WeakReference<>(bottomTabNodeGroup));
        }
        return bottomTabNodeGroup;
    }
}
