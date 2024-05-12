package X;

import Y.IDComparatorS37S0000000_9;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.main.assems.tabs.TopTabNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L8J {
    public final List<String> LIZ = new ArrayList();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1016));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(L8M.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1017));
    public Boolean LJ;

    public final void LJ() {
        if (this.LJ == null) {
            boolean z = false;
            if (LIZLLL(false) || LIZ() || LJIIIZ()) {
                z = true;
            }
            this.LJ = Boolean.valueOf(z);
        }
    }

    public final void LJFF() {
        if (this.LJ == null) {
            boolean z = true;
            if (!LIZLLL(true) && !LIZ() && !LJIIIZ()) {
                z = false;
            }
            this.LJ = Boolean.valueOf(z);
        }
    }

    public final L88 LJII() {
        return (L88) this.LIZIZ.getValue();
    }

    public final boolean LJIIIIZZ() {
        if (!((Boolean) this.LIZLLL.getValue()).booleanValue()) {
            return false;
        }
        Boolean bool = this.LJ;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean LIZ() {
        boolean z = false;
        if (!C53157Ktd.LIZ()) {
            return false;
        }
        List<String> list = LJII().LIZIZ().get(LJII().LIZ().toString());
        if (list != null && list.size() == 5) {
            z = true;
        }
        boolean z2 = !z;
        if (z2) {
            L82.LIZJ(L83.FINAL_CHECK, L84.BOTTOM_TAB, L8G.BOTTOM_TAB_SIZE_ERROR);
        }
        return z2;
    }

    public final boolean LJIIIZ() {
        boolean z = false;
        if (!C53160Ktg.LIZ()) {
            return false;
        }
        List<String> list = LJII().LIZIZ().get(((L8H) LJII().LIZ.getValue()).toString());
        if (list != null && list.contains(EnumC53808L9w.HOT.getKey())) {
            z = true;
        }
        boolean z2 = !z;
        if (z2) {
            L82.LIZJ(L83.FINAL_CHECK, L84.TOP_TAB, L8G.MISS_FYP);
        }
        return z2;
    }

    public final boolean LIZLLL(boolean z) {
        if (!LJIIIIZZ()) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (L8H l8h : (java.util.Set) LJII().LIZJ.getValue()) {
            List<String> LIZIZ = l8h.LIZIZ(z);
            LJII().LIZIZ().put(l8h.toString(), LIZIZ);
            i += LIZIZ.size();
            linkedHashSet.addAll(LIZIZ);
        }
        if (i == linkedHashSet.size()) {
            return false;
        }
        L82.LIZIZ(L83.FINAL_CHECK, L8G.TAB_DUPLICATE);
        System.out.println((Object) "TabProcessManager finalShowDuplicateCheck>>> hasDup=true ");
        return true;
    }

    public final boolean LJI(L8I l8i) {
        List<String> value;
        if (!LJIIIIZZ()) {
            return false;
        }
        List<String> LIZIZ = l8i.LIZIZ(false);
        if (LJII().LIZIZ().keySet().size() == ((java.util.Set) LJII().LIZJ.getValue()).size()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            for (Map.Entry<String, List<String>> entry : LJII().LIZIZ().entrySet()) {
                if (o.LJ(entry.getKey(), l8i.toString())) {
                    value = LIZIZ;
                } else {
                    value = entry.getValue();
                }
                i += value.size();
                linkedHashSet.addAll(value);
            }
            if (i != linkedHashSet.size()) {
                L82.LIZIZ(L83.FINAL_CHECK, L8G.TAB_DUPLICATE);
                System.out.println((Object) "TabProcessManager finalShowDuplicateForUpdate>>> hasDup=true ");
                return true;
            }
            LJII().LIZIZ().put(l8i.toString(), LIZIZ);
        }
        return false;
    }

    public final OSZ<List<InterfaceC54080LKi>, List<BottomTabProtocol>> LIZIZ(ActivityC45651qj activity, InterfaceC55235Lm3 scope, int i) {
        java.util.Map<String, List<BottomTab>> map;
        BottomTabProtocol bottomTabProtocol;
        Boolean bool;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(scope, "scope");
        Object obj = null;
        if (C53157Ktd.LIZ()) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && LJI(LJII().LIZ())) {
                        L8C operationType = L8C.UPDATE;
                        L8G errorReason = L8G.TAB_DUPLICATE;
                        o.LJIIIZ(operationType, "operationType");
                        o.LJIIIZ(errorReason, "errorReason");
                        L82.LIZ(null, operationType, null, errorReason);
                        return null;
                    }
                } else {
                    LJ();
                }
            } else {
                LJFF();
            }
        }
        L8I LIZ = LJII().LIZ();
        LIZ.getClass();
        if (C40471FuV.LIZ()) {
            TabConfig LJIIIZ = C53765L8f.LJIIIZ();
            if (LJIIIZ != null) {
                map = LJIIIZ.bottomTab;
            } else {
                map = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            do {
                if (map != null) {
                    List<BottomTab> list = map.get(String.valueOf(i2));
                    if (list != null) {
                        Iterator<BottomTab> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            BottomTab next = it.next();
                            L8Z l8z = (L8Z) LIZ.LIZJ().LIZJ.getValue();
                            String str = next.bottomTabKey;
                            l8z.LIZIZ();
                            AbstractC53764L8e abstractC53764L8e = (AbstractC53764L8e) ((ConcurrentHashMap) l8z.LIZIZ.getValue()).get(str);
                            if (abstractC53764L8e != null) {
                                bottomTabProtocol = (BottomTabProtocol) abstractC53764L8e.LIZIZ.getValue();
                            } else {
                                bottomTabProtocol = null;
                            }
                            StringBuilder LJ = C7MY.LJ("collectBottomTabsV2: ", i2, ", ");
                            LJ.append(next.bottomTabKey);
                            LJ.append(", pro:");
                            LJ.append(bottomTabProtocol);
                            LJ.append(", ");
                            if (bottomTabProtocol != null) {
                                bool = Boolean.valueOf(bottomTabProtocol.enable());
                            } else {
                                bool = null;
                            }
                            LJ.append(bool);
                            LJ.append(' ');
                            X1D.LIZIZ(LJ);
                            if (bottomTabProtocol != null && bottomTabProtocol.enable()) {
                                arrayList.add(bottomTabProtocol);
                                arrayList2.add(LIZ.LJFF(activity, bottomTabProtocol));
                                break;
                            }
                        }
                    }
                }
                i2++;
            } while (i2 < 5);
            return new OSZ<>(arrayList2, arrayList);
        }
        if (C53157Ktd.LIZ()) {
            ArrayList arrayList3 = new ArrayList();
            if (LIZ.LJFF != null && !LIZ.LIZJ().LJIIIIZZ()) {
                LIZ.LJFF = null;
            }
            List<? extends BottomTabProtocol> list2 = LIZ.LJFF;
            if (list2 == null) {
                list2 = LIZ.LJ().getSecond();
            }
            LIZ.LJFF = null;
            Iterator<? extends BottomTabProtocol> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(LIZ.LJFF(activity, it2.next()));
            }
            return new OSZ<>(arrayList3, list2);
        }
        List LJIJ = C62814Ol0.LJIJ(scope, BottomTabProtocol.class);
        if (LJIJ == null) {
            return null;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = ((ArrayList) LJIJ).iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (((BottomTabProtocol) next2).enable()) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        EnumC53761L8b[] values = EnumC53761L8b.values();
        if (values.length > 1) {
            C61898ORa.LJJIIJZLJL(new IDComparatorS37S0000000_9(12), values);
        }
        for (EnumC53761L8b enumC53761L8b : values) {
            ArrayList arrayList7 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                if (((BottomTabProtocol) next3).LIZLLL() == enumC53761L8b) {
                    arrayList7.add(next3);
                }
            }
            Iterator it5 = arrayList7.iterator();
            if (it5.hasNext()) {
                obj = it5.next();
                if (it5.hasNext()) {
                    int indexOf = enumC53761L8b.getPriorityList().indexOf(((BottomTabProtocol) obj).getTag());
                    do {
                        Object next4 = it5.next();
                        int indexOf2 = enumC53761L8b.getPriorityList().indexOf(((BottomTabProtocol) next4).getTag());
                        if (indexOf > indexOf2) {
                            obj = next4;
                            indexOf = indexOf2;
                        }
                    } while (it5.hasNext());
                }
            }
            BottomTabProtocol bottomTabProtocol2 = (BottomTabProtocol) obj;
            if (bottomTabProtocol2 != null) {
                arrayList6.add(bottomTabProtocol2);
                arrayList5.add(LIZ.LJFF(activity, bottomTabProtocol2));
                obj = null;
                MainTabStrip.LLD.LIZ(null, "collectBottomTabs: tag:" + bottomTabProtocol2.getTag() + ' ');
            } else {
                obj = null;
            }
        }
        return new OSZ<>(arrayList5, arrayList6);
    }

    public final OSZ<List<TopTabNode>, List<TopTabProtocol>> LIZJ(ActivityC45651qj activity, InterfaceC55235Lm3 scope, int i) {
        TopTab topTab;
        List<TopTabItem> list;
        TopTabProtocol topTabProtocol;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(scope, "scope");
        if (C53160Ktg.LIZ()) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && LJI(LJII().LIZ())) {
                        L8C operationType = L8C.UPDATE;
                        L8G errorReason = L8G.TAB_DUPLICATE;
                        o.LJIIIZ(operationType, "operationType");
                        o.LJIIIZ(errorReason, "errorReason");
                        L82.LIZ(null, operationType, null, errorReason);
                        return null;
                    }
                } else {
                    LJ();
                }
            } else {
                LJFF();
            }
        }
        L8K l8k = (L8K) LJII().LIZ.getValue();
        l8k.getClass();
        if (C40471FuV.LIZ()) {
            ArrayList<TopTabProtocol> LJII = l8k.LJII(scope);
            if (LJII == null) {
                return null;
            }
            TabConfig LJIIIZ = C53765L8f.LJIIIZ();
            if (LJIIIZ == null || (topTab = LJIIIZ.topTab) == null || (list = topTab.topTabList) == null || list.isEmpty()) {
                return l8k.LJI(LJII, activity);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TopTabItem topTabItem : list) {
                if (topTabItem != null) {
                    Iterator<TopTabProtocol> it = LJII.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            topTabProtocol = it.next();
                            if (o.LJ(((LinkedHashMap) FeedMultiTabOrderSettings.LIZ).get(topTabItem.topTabKey), topTabProtocol.getTag())) {
                                break;
                            }
                        } else {
                            topTabProtocol = null;
                            break;
                        }
                    }
                    TopTabProtocol topTabProtocol2 = topTabProtocol;
                    if (topTabProtocol2 != null) {
                        arrayList.add(topTabProtocol2);
                        arrayList2.add(l8k.LJFF(topTabProtocol2, activity));
                    }
                }
            }
            return new OSZ<>(arrayList2, arrayList);
        }
        if (C53160Ktg.LIZ()) {
            ArrayList arrayList3 = new ArrayList();
            if (l8k.LJFF != null && !l8k.LIZJ().LJIIIIZZ()) {
                l8k.LJFF = null;
            }
            List<? extends TopTabProtocol> list2 = l8k.LJFF;
            if (list2 == null) {
                list2 = l8k.LJ().getSecond();
            }
            l8k.LJFF = null;
            Iterator<? extends TopTabProtocol> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(l8k.LJFF(it2.next(), activity));
            }
            return new OSZ<>(arrayList3, list2);
        }
        ArrayList<TopTabProtocol> LJII2 = l8k.LJII(scope);
        if (LJII2 == null) {
            return null;
        }
        return l8k.LJI(LJII2, activity);
    }
}
