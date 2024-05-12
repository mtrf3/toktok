package X;

import Y.IDComparatorS37S0000000_9;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.main.assems.tabs.TopTabNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L8K extends L8H {
    public ArrayList<String> LIZLLL;
    public List<? extends TopTabProtocol> LJFF;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(L8L.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(L8N.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1018));

    @Override // X.L8H
    public final OSZ<Boolean, L8G> LIZ() {
        TopTab topTab;
        if (!C53160Ktg.LIZ()) {
            return new OSZ<>(Boolean.TRUE, null);
        }
        TabConfig LIZ = L76.LIZ();
        if (LIZ != null) {
            topTab = LIZ.topTab;
        } else {
            topTab = null;
        }
        this.LIZLLL = null;
        ArrayList<String> arrayList = new ArrayList<>();
        if (topTab == null || topTab.topTabList.isEmpty()) {
            return new OSZ<>(Boolean.FALSE, L8G.TOP_TAB_CONFIG_INVALID);
        }
        boolean z = false;
        for (TopTabItem topTabItem : topTab.topTabList) {
            String str = topTabItem.topTabKey;
            if (str == null || str.length() == 0) {
                return new OSZ<>(Boolean.FALSE, L8G.TOP_TAB_CONFIG_INVALID);
            }
            if (o.LJ(topTabItem.topTabKey, EnumC53808L9w.HOT.getKey())) {
                z = true;
            }
            arrayList.add(topTabItem.topTabKey);
        }
        if (!z) {
            return new OSZ<>(Boolean.FALSE, L8G.MISS_FYP);
        }
        this.LIZLLL = arrayList;
        return new OSZ<>(Boolean.TRUE, null);
    }

    public final OSZ<List<String>, List<TopTabProtocol>> LJ() {
        ArrayList<String> arrayList;
        TopTabProtocol topTabProtocol;
        if (!LIZJ().LJIIIIZZ()) {
            L82.LIZJ = false;
            ((AbstractC48820JEa) this.LIZJ.getValue()).LJ("TopTabOperator", "Illegal data");
            arrayList = (ArrayList) this.LJ.getValue();
        } else {
            arrayList = this.LIZLLL;
            if (arrayList == null) {
                L82.LIZIZ(L83.FINAL_CHECK, L8G.UNKNOWN_REASON);
                arrayList = (ArrayList) this.LJ.getValue();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object key = ListProtector.get(arrayList, i);
            L8Z l8z = (L8Z) LIZJ().LIZJ.getValue();
            l8z.LIZIZ();
            AbstractC53764L8e abstractC53764L8e = (AbstractC53764L8e) ((ConcurrentHashMap) l8z.LIZIZ.getValue()).get(key);
            if (abstractC53764L8e != null && (topTabProtocol = (TopTabProtocol) abstractC53764L8e.LIZ.getValue()) != null && topTabProtocol.enable() && topTabProtocol.LJIIJ()) {
                arrayList3.add(topTabProtocol);
                o.LJIIIIZZ(key, "key");
                arrayList2.add(key);
            }
        }
        return new OSZ<>(arrayList2, arrayList3);
    }

    @Override // X.L8H
    public final L84 LIZLLL() {
        return L84.BOTTOM_TAB;
    }

    @Override // X.L8H
    public final List<String> LIZIZ(boolean z) {
        if (!C53160Ktg.LIZ()) {
            return new ArrayList();
        }
        OSZ<List<String>, List<TopTabProtocol>> LJ = LJ();
        List<String> first = LJ.getFirst();
        List<TopTabProtocol> second = LJ.getSecond();
        if (z) {
            this.LJFF = second;
        }
        return first;
    }

    public final ArrayList<TopTabProtocol> LJII(InterfaceC55235Lm3 interfaceC55235Lm3) {
        boolean z;
        List LJIJ = C62814Ol0.LJIJ(interfaceC55235Lm3, TopTabProtocol.class);
        if (LJIJ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                TopTabProtocol topTabProtocol = (TopTabProtocol) next;
                C8RO c8ro = MainTabStrip.LLD;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("collectTopTabs: tag:");
                LIZ.append(topTabProtocol.getTag());
                LIZ.append(", ");
                LIZ.append(topTabProtocol.enable());
                LIZ.append(' ');
                c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
                if (topTabProtocol.enable()) {
                    arrayList.add(next);
                }
            }
            L8J LIZJ = LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("top tab protocol is empty? ");
            LIZ2.append(arrayList.isEmpty());
            String msg = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg, "msg");
            ((ArrayList) LIZJ.LIZ).add(msg);
            try {
                List LJIJ2 = C62814Ol0.LJIJ(interfaceC55235Lm3, TopTabProtocol.class);
                if (LJIJ2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = ((ArrayList) LJIJ2).size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        TopTabProtocol topTabProtocol2 = (TopTabProtocol) ListProtector.get(LJIJ2, i);
                        if (topTabProtocol2 != null) {
                            arrayList2.add(topTabProtocol2.getTag());
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        FMX.LJIIL("main_tab_crash", C51029K0z.LJJIIZI(new OSZ("tabs", arrayList2.toString())));
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            ArrayList<TopTabProtocol> arrayList3 = new ArrayList<>();
            EnumC53763L8d[] values = EnumC53763L8d.values();
            if (values.length > 1) {
                C61898ORa.LJJIIJZLJL(new IDComparatorS37S0000000_9(13), values);
            }
            for (EnumC53763L8d enumC53763L8d : values) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((TopTabProtocol) next2).LIZLLL() == enumC53763L8d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList4.add(next2);
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    TopTabProtocol topTabProtocol3 = (TopTabProtocol) it3.next();
                    if (topTabProtocol3 != null && topTabProtocol3.LJIIJ()) {
                        arrayList3.add(topTabProtocol3);
                    }
                }
            }
            L8J LIZJ2 = LIZJ();
            String msg2 = "top tab protocol result is empty? " + arrayList3.isEmpty();
            o.LJIIIZ(msg2, "msg");
            ((ArrayList) LIZJ2.LIZ).add(msg2);
            return arrayList3;
        }
        return null;
    }

    public final TopTabNode LJFF(TopTabProtocol topTabProtocol, ActivityC45651qj activityC45651qj) {
        Object obj;
        Iterator it = ((CopyOnWriteArrayList) this.LIZIZ.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (TextUtils.equals(((AbstractC53895LDf) obj).tag(), topTabProtocol.getTag())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        TopTabNode topTabNode = (TopTabNode) obj;
        if (topTabNode == null) {
            return new TopTabNode(activityC45651qj, topTabProtocol);
        }
        return topTabNode;
    }

    public final OSZ<List<TopTabNode>, List<TopTabProtocol>> LJI(List<? extends TopTabProtocol> list, ActivityC45651qj activityC45651qj) {
        Object obj;
        List<String> LIZ = FeedMultiTabOrderSettings.LIZ();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : LIZ) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((LinkedHashMap) FeedMultiTabOrderSettings.LIZ).get(str), ((TopTabProtocol) obj).getTag())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            TopTabProtocol topTabProtocol = (TopTabProtocol) obj;
            if (topTabProtocol != null) {
                arrayList.add(topTabProtocol);
                arrayList2.add(LJFF(topTabProtocol, activityC45651qj));
            }
        }
        L8J LIZJ = LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("top tab node result is empty? ");
        LIZ2.append(arrayList2.isEmpty());
        String msg = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg, "msg");
        ((ArrayList) LIZJ.LIZ).add(msg);
        return new OSZ<>(arrayList2, arrayList);
    }
}
