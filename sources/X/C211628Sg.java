package X;

import Y.ARunnableS7S0101000_3;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.multitag.FeedMultiAnchorAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.componentmanager.data.ComponentContainerData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.data.GlobalComponentData;
import com.ss.android.ugc.feed.platform.componentmanager.mob.ShowCoreFdmtComponentEvent;
import com.ss.android.ugc.feed.platform.componentmanager.mob.ShowCoreFdmtComponentParamProvider;
import com.ss.android.ugc.feed.platform.componentmanager.mob.ShowCoreFdmtParamProvider;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.8Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211628Sg {
    public final FeedComponentPriorityData LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public int LJ;
    public LifecycleOwner LJFF;
    public Aweme LJI;
    public final int LJII;
    public final List<GlobalComponentData> LJIIIIZZ;
    public final java.util.Map<String, ComponentContainerData> LJIIIZ;
    public final List<String> LJIIJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C211818Sz.LJLIL);
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C211798Sx.LJLIL);
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(C211768Su.LJLIL);
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C211788Sw.LJLIL);
    public final List<C211638Sh<ComponentPriorityProtocol>> LJIILJJIL = new ArrayList();
    public final C62822Ol8 LJIILL = C221108m2.LIZIZ(C211698Sn.LJLIL);
    public final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(C211718Sp.LJLIL);
    public final C62822Ol8 LJIIZILJ = C221108m2.LIZIZ(C211708So.LJLIL);
    public final C62822Ol8 LJIJ = C221108m2.LIZIZ(C211728Sq.LJLIL);
    public final C62822Ol8 LJIJI = C221108m2.LIZIZ(C211738Sr.LJLIL);
    public final C62822Ol8 LJIJJ = C221108m2.LIZIZ(C211778Sv.LJLIL);
    public final C62822Ol8 LJIJJLI = C221108m2.LIZIZ(C211808Sy.LJLIL);

    public final C211678Sl LIZIZ() {
        List<String> list;
        List<String> list2;
        List<String> list3;
        int i;
        int i2;
        int i3;
        List<String> list4;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        int i5;
        Object obj;
        Object obj2;
        int intValue;
        List<String> list5;
        LifecycleOwner lifecycleOwner = this.LJFF;
        ArrayList arrayList3 = null;
        if (lifecycleOwner != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ((C8W0) lifecycleOwner);
            BottomBarPriorityAbility bottomBarPriorityAbility = (BottomBarPriorityAbility) C55096Ljo.LIZ(LJIIZILJ, BottomBarPriorityAbility.class, null);
            if (bottomBarPriorityAbility != null) {
                list = bottomBarPriorityAbility.M30();
            } else {
                list = null;
            }
            FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) C55096Ljo.LIZ(LJIIZILJ, FeedBottomButtonAbility.class, null);
            if (feedBottomButtonAbility != null) {
                list2 = feedBottomButtonAbility.pd0();
            } else {
                list2 = null;
            }
            CategoryPriorityAbility categoryPriorityAbility = (CategoryPriorityAbility) C55096Ljo.LIZ(LJIIZILJ, CategoryPriorityAbility.class, null);
            if (categoryPriorityAbility != null) {
                list3 = categoryPriorityAbility.Bn();
            } else {
                list3 = null;
            }
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = 0;
            }
            if (list3 != null) {
                i3 = list3.size();
            } else {
                i3 = 0;
            }
            if (LJIIJJI().isEmpty()) {
                return null;
            }
            if (LJII().isEmpty() && i < 2 && i2 < 2 && i3 <= 2) {
                return null;
            }
            String LIZIZ = C210888Pk.LIZIZ(this.LIZ, list, EnumC210828Pe.BOTTOM_BANNER);
            String LIZIZ2 = C210888Pk.LIZIZ(this.LIZ, list2, EnumC210828Pe.BOTTOM_BUTTON);
            CategoryPriorityAbility categoryPriorityAbility2 = (CategoryPriorityAbility) C55096Ljo.LIZ(LJIIZILJ, CategoryPriorityAbility.class, null);
            if (categoryPriorityAbility2 != null) {
                list4 = categoryPriorityAbility2.xR();
            } else {
                list4 = null;
            }
            if (list != null) {
                arrayList = new ArrayList();
                for (String str : list) {
                    if (!o.LJJJJIZL(str, LIZIZ, true)) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = null;
            }
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (String str2 : list2) {
                    if (!o.LJJJJIZL(str2, LIZIZ2, true)) {
                        arrayList2.add(str2);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (list3 != null) {
                arrayList3 = new ArrayList();
                for (String str3 : list3) {
                    if (list4 == null) {
                        list5 = C61878OQg.INSTANCE;
                    } else {
                        list5 = list4;
                    }
                    if (!list5.contains(str3)) {
                        arrayList3.add(str3);
                    }
                }
            }
            C211678Sl c211678Sl = new C211678Sl();
            c211678Sl.LJI = this.LJII;
            C40675Fxn.LJJLIIIIJ(LJII());
            List<C211638Sh<ComponentPriorityProtocol>> LJII = LJII();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C211638Sh<ComponentPriorityProtocol> c211638Sh : LJII) {
                String str4 = c211638Sh.LJLJI.parentContainerKey;
                Object obj3 = linkedHashMap.get(str4);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(str4, obj3);
                }
                ((List) obj3).add(c211638Sh);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                List list6 = (List) entry.getValue();
                Integer num = (Integer) ((java.util.Map) this.LJIJ.getValue()).get(key);
                if (num != null && (intValue = num.intValue()) != Integer.MAX_VALUE) {
                    int size = list6.size();
                    if (intValue == -1) {
                        Iterator it = list6.iterator();
                        while (it.hasNext()) {
                            ((C211638Sh) it.next()).LJLJLLL = Boolean.FALSE;
                        }
                    } else {
                        List<C211638Sh<ComponentPriorityProtocol>> LJIIJJI = LJIIJJI();
                        ArrayList arrayList4 = new ArrayList();
                        for (C211638Sh<ComponentPriorityProtocol> c211638Sh2 : LJIIJJI) {
                            C211638Sh<ComponentPriorityProtocol> c211638Sh3 = c211638Sh2;
                            if (kotlin.jvm.internal.o.LJ(c211638Sh3.LJLJI.parentContainerKey, key) && c211638Sh3.LJLJI.showStrategy == 2) {
                                arrayList4.add(c211638Sh2);
                            }
                        }
                        int max = Math.max((list6.size() + arrayList4.size()) - intValue, 0);
                        if (max > 0) {
                            int i6 = 0;
                            do {
                                ((C211638Sh) ListProtector.get(list6, (size - 1) - i6)).LJLJLLL = Boolean.FALSE;
                                i6++;
                            } while (i6 < max);
                        }
                    }
                }
            }
            for (C211638Sh<ComponentPriorityProtocol> c211638Sh4 : LJII()) {
                if (kotlin.jvm.internal.o.LJ(c211638Sh4.LJLJLLL, Boolean.TRUE)) {
                    ((ArrayList) c211678Sl.LIZIZ).add(c211638Sh4.LJLIL.o0());
                } else if (kotlin.jvm.internal.o.LJ(c211638Sh4.LJLJLLL, Boolean.FALSE)) {
                    ((ArrayList) c211678Sl.LIZ).add(c211638Sh4.LJLIL.o0());
                }
                ((ArrayList) c211678Sl.LIZLLL).add(c211638Sh4.LJLIL.o0());
            }
            LIZ(c211678Sl.LIZ, arrayList, arrayList2, arrayList3, LIZIZ, LIZIZ2, list4);
            LIZ(c211678Sl.LIZLLL, arrayList, arrayList2, arrayList3, LIZIZ, LIZIZ2, list4);
            if ((!((ArrayList) c211678Sl.LIZIZ).isEmpty()) && (!((ArrayList) c211678Sl.LIZ).isEmpty())) {
                c211678Sl.LJFF = "overall";
            } else if (!((ArrayList) c211678Sl.LIZIZ).isEmpty()) {
                c211678Sl.LJFF = "global";
            } else if (!((ArrayList) c211678Sl.LIZ).isEmpty()) {
                c211678Sl.LJFF = "container";
            }
            for (C211638Sh<ComponentPriorityProtocol> c211638Sh5 : LJIIJJI()) {
                ((ArrayList) c211678Sl.LIZJ).add(c211638Sh5.LJLIL.o0());
                if (c211638Sh5.LJLJI.showStrategy == 2) {
                    ((ArrayList) c211678Sl.LJ).add(c211638Sh5.LJLIL.o0());
                }
                String str5 = c211638Sh5.LJLJI.matchedContainerKey;
                switch (str5.hashCode()) {
                    case -1684919427:
                        if (str5.equals("high_tag")) {
                            break;
                        } else {
                            break;
                        }
                    case -1613157440:
                        if (str5.equals("bottom_banner")) {
                            if (list != null) {
                                ArrayList arrayList5 = new ArrayList();
                                for (String str6 : list) {
                                    if (!kotlin.jvm.internal.o.LJ(str6, c211638Sh5.LJLIL.o0())) {
                                        arrayList5.add(str6);
                                    }
                                }
                                list = arrayList5;
                                break;
                            } else {
                                list = null;
                                break;
                            }
                        } else {
                            continue;
                        }
                    case -1594502202:
                        if (str5.equals("bottom_button")) {
                            if (list2 != null) {
                                ArrayList arrayList6 = new ArrayList();
                                for (String str7 : list2) {
                                    if (!kotlin.jvm.internal.o.LJ(str7, c211638Sh5.LJLIL.o0())) {
                                        arrayList6.add(str7);
                                    }
                                }
                                list2 = arrayList6;
                                break;
                            } else {
                                list2 = null;
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 356829231:
                        if (str5.equals("low_tag")) {
                            break;
                        } else {
                            break;
                        }
                }
                if (list3 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    for (String str8 : list3) {
                        if (!kotlin.jvm.internal.o.LJ(str8, c211638Sh5.LJLIL.o0())) {
                            arrayList7.add(str8);
                        }
                    }
                    list3 = arrayList7;
                } else {
                    list3 = null;
                }
            }
            List<String> list7 = c211678Sl.LJ;
            if (this.LJIIJ != null && this.LJIIIIZZ != null) {
                if (list != null) {
                    i4 = list.size();
                } else {
                    i4 = 0;
                }
                if (list2 != null) {
                    i5 = list2.size();
                } else {
                    i5 = 0;
                }
                if (i4 > 0) {
                    int i7 = 0;
                    do {
                        if (list != null) {
                            obj2 = ListProtector.get(list, i7);
                        } else {
                            obj2 = null;
                        }
                        int LJZ = ORZ.LJZ(obj2, this.LJIIJ);
                        if (LJZ >= 0 && ((GlobalComponentData) ListProtector.get(this.LJIIIIZZ, LJZ)).showStrategy == 2) {
                            ((ArrayList) list7).add(((GlobalComponentData) ListProtector.get(this.LJIIIIZZ, LJZ)).componentKey);
                        }
                        i7++;
                    } while (i7 < i4);
                }
                if (i5 > 0) {
                    int i8 = 0;
                    do {
                        if (list2 != null) {
                            obj = ListProtector.get(list2, i8);
                        } else {
                            obj = null;
                        }
                        int LJZ2 = ORZ.LJZ(obj, this.LJIIJ);
                        if (LJZ2 >= 0 && ((GlobalComponentData) ListProtector.get(this.LJIIIIZZ, LJZ2)).showStrategy == 2) {
                            ((ArrayList) list7).add(((GlobalComponentData) ListProtector.get(this.LJIIIIZZ, LJZ2)).componentKey);
                        }
                        i8++;
                    } while (i8 < i5);
                }
                if (C8QC.LIZ()) {
                    if (list3 == null) {
                        list3 = C61878OQg.INSTANCE;
                    }
                    Iterator<String> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        int indexOf = this.LJIIJ.indexOf(it2.next());
                        if (indexOf >= 0 && ((GlobalComponentData) ListProtector.get(this.LJIIIIZZ, indexOf)).showStrategy == 2) {
                            ((ArrayList) list7).add(((GlobalComponentData) ListProtector.get(this.LJIIIIZZ, indexOf)).componentKey);
                        }
                    }
                }
            }
            return c211678Sl;
        }
        kotlin.jvm.internal.o.LJIJI("lifecycleOwner");
        throw null;
    }

    public final java.util.Map<String, Integer> LJFF() {
        return (java.util.Map) this.LJIIZILJ.getValue();
    }

    public final List<C211638Sh<ComponentPriorityProtocol>> LJI() {
        Object value = this.LJIIL.getValue();
        kotlin.jvm.internal.o.LJIIIIZZ(value, "<get-decisions>(...)");
        return (List) value;
    }

    public final List<C211638Sh<ComponentPriorityProtocol>> LJII() {
        Object value = this.LJIJJ.getValue();
        kotlin.jvm.internal.o.LJIIIIZZ(value, "<get-hadAvoidDecisions>(...)");
        return (List) value;
    }

    public final List<ComponentPriorityProtocol> LJIIIIZZ() {
        Object value = this.LJIJJLI.getValue();
        kotlin.jvm.internal.o.LJIIIIZZ(value, "<get-invalidComponents>(...)");
        return (List) value;
    }

    public final ConcurrentHashMap<String, C211638Sh<ComponentPriorityProtocol>> LJIIIZ() {
        return (ConcurrentHashMap) this.LJIILL.getValue();
    }

    public final MutableLiveData<C211638Sh<ComponentPriorityProtocol>> LJIIJ() {
        return (MutableLiveData) this.LJIJI.getValue();
    }

    public final List<C211638Sh<ComponentPriorityProtocol>> LJIIJJI() {
        Object value = this.LJIILIIL.getValue();
        kotlin.jvm.internal.o.LJIIIIZZ(value, "<get-resultDecisions>(...)");
        return (List) value;
    }

    public final List<C211638Sh<ComponentPriorityProtocol>> LJIIL() {
        Object value = this.LJIIJJI.getValue();
        kotlin.jvm.internal.o.LJIIIIZZ(value, "<get-skipAvoidDecisions>(...)");
        return (List) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL() {
        String str;
        int i;
        int size;
        java.util.Map<String, ComponentContainerData> map = this.LJIIIZ;
        if (map != null) {
            for (Map.Entry<String, ComponentContainerData> entry : map.entrySet()) {
                String key = entry.getKey();
                ComponentContainerData value = entry.getValue();
                if (C8QI.LIZJ.contains(key) && value.showLimit == 0) {
                    LJFF().put(key, Integer.MAX_VALUE);
                } else {
                    LJFF().put(key, Integer.valueOf(value.showLimit));
                }
            }
        }
        List<C211638Sh<ComponentPriorityProtocol>> LJI = LJI();
        ArrayList arrayList = new ArrayList();
        for (C211638Sh<ComponentPriorityProtocol> c211638Sh : LJI) {
            if (c211638Sh.LJLJI.showStrategy != 1) {
                arrayList.add(c211638Sh);
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str2 = ((C211638Sh) next).LJLJI.parentContainerKey;
                Object obj = linkedHashMap.get(str2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str2, obj);
                }
                ((List) obj).add(next);
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                str = null;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it2.next();
                Object key2 = entry2.getKey();
                List<C211638Sh<ComponentPriorityProtocol>> list = (List) entry2.getValue();
                if (!list.isEmpty()) {
                    for (C211638Sh<ComponentPriorityProtocol> c211638Sh2 : list) {
                        Integer num = LJFF().get(key2);
                        if (num == null || num.intValue() != -1) {
                            Integer num2 = LJFF().get(key2);
                            if (num2 == null || num2.intValue() <= 0) {
                                if (LJIIJJI().size() > 0) {
                                    int size2 = LJIIJJI().size() - 1;
                                    while (true) {
                                        if (-1 >= size2) {
                                            break;
                                        }
                                        if (kotlin.jvm.internal.o.LJ(((C211638Sh) ListProtector.get(LJIIJJI(), size2)).LJLJI.matchedContainerKey, key2) && ((C211638Sh) ListProtector.get(LJIIJJI(), size2)).LJLJJI >= c211638Sh2.LJLJJI) {
                                            C211638Sh c211638Sh3 = (C211638Sh) ListProtector.get(LJIIJJI(), size2);
                                            if (c211638Sh3 != null && LJIIJJI().remove(c211638Sh3)) {
                                                c211638Sh3.LJLJLLL = Boolean.FALSE;
                                                C78923UyF.LJIJ(LJIIJ(), c211638Sh3);
                                                if (!kotlin.jvm.internal.o.LJ(c211638Sh3.LJLIL.o0(), c211638Sh2.LJLIL.o0())) {
                                                }
                                            }
                                        } else {
                                            size2--;
                                        }
                                    }
                                }
                                if (!LIZLLL(c211638Sh2, LJIIJJI())) {
                                    LJIIJJI().add(c211638Sh2);
                                    C40675Fxn.LJJLIIIIJ(LJIIJJI());
                                }
                            } else {
                                if (!LIZLLL(c211638Sh2, LJIIJJI())) {
                                    LJIIJJI().add(c211638Sh2);
                                    C40675Fxn.LJJLIIIIJ(LJIIJJI());
                                }
                                Integer num3 = LJFF().get(key2);
                                if (num3 != null) {
                                    LJFF().put(key2, Integer.valueOf(num3.intValue() - 1));
                                }
                            }
                        } else {
                            c211638Sh2.LJLJLLL = Boolean.FALSE;
                            C78923UyF.LJIJ(LJIIJ(), c211638Sh2);
                        }
                    }
                }
            }
            Aweme aweme = this.LJI;
            if (aweme != null) {
                User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                if (curUser != null) {
                    str = curUser.getUid();
                }
                if (!TextUtils.isEmpty(aweme.getAid()) && 160 != aweme.getAwemeType() && 150 != aweme.getAwemeType() && !C54838Lfe.LJJI(aweme) && !aweme.isAd() && !TextUtils.isEmpty(aweme.getAuthorUid()) && !o.LJJJJIZL(aweme.getAuthorUid(), str, true) && C30581Hy.LJIL(C210888Pk.LIZIZ) && (i = this.LJII) != 0) {
                    if (i <= -1) {
                        size = LJIIJJI().size();
                    } else {
                        size = LJIIJJI().size() - this.LJII;
                    }
                    if (size > 0) {
                        int i2 = 0;
                        do {
                            if (LJIIJJI().size() > 0) {
                                int i3 = this.LJII - 1;
                                if (i3 < 0) {
                                    i3 = 0;
                                }
                                int size3 = LJIIJJI().size() - 1;
                                if (i3 <= size3) {
                                    while (true) {
                                        if (2 == ((C211638Sh) ListProtector.get(LJIIJJI(), size3)).LJLJI.showStrategy) {
                                            ListProtector.get(LJIIJJI(), size3).getClass();
                                            if (size3 == i3) {
                                                break;
                                            } else {
                                                size3--;
                                            }
                                        } else {
                                            C211638Sh c211638Sh4 = (C211638Sh) ListProtector.get(LJIIJJI(), size3);
                                            if (c211638Sh4 != null && LJIIJJI().remove(c211638Sh4)) {
                                                c211638Sh4.LJLJLLL = Boolean.TRUE;
                                                C78923UyF.LJIJ(LJIIJ(), c211638Sh4);
                                            }
                                        }
                                    }
                                }
                            }
                            i2++;
                        } while (i2 < size);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<C211638Sh<ComponentPriorityProtocol>> it3 = LJI().iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().LJLIL.o0());
        }
        ArrayList arrayList3 = (ArrayList) C210888Pk.LIZ;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        LJI().clear();
        LJI().addAll(LJIIJJI());
    }

    public final boolean LJIILL() {
        for (Map.Entry<String, C211638Sh<ComponentPriorityProtocol>> entry : LJIIIZ().entrySet()) {
            String key = entry.getKey();
            C211638Sh<ComponentPriorityProtocol> value = entry.getValue();
            if (!C8QI.LIZIZ.contains(key) && !value.LJLJLJ) {
                return false;
            }
        }
        return true;
    }

    public final void LJIIZILJ() {
        String str;
        String str2;
        Music music;
        if (LJIILL()) {
            Collection<C211638Sh<ComponentPriorityProtocol>> values = LJIIIZ().values();
            kotlin.jvm.internal.o.LJIIIIZZ(values, "pendingDecisions.values");
            if (!values.isEmpty()) {
                Iterator<C211638Sh<ComponentPriorityProtocol>> it = values.iterator();
                while (it.hasNext()) {
                    if (!(!it.next().LJLLI)) {
                        return;
                    }
                }
            }
            Aweme aweme = this.LJI;
            String str3 = this.LIZJ;
            C211678Sl LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                C188727au c188727au = new C188727au();
                Long l = null;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("group_id", str);
                if (aweme != null) {
                    str2 = aweme.getAuthorUid();
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("author_id", str2);
                if (aweme != null && (music = aweme.getMusic()) != null) {
                    l = Long.valueOf(music.getId());
                }
                c188727au.LJFF(l, "music_id");
                c188727au.LJIIIZ("enter_from", str3);
                c188727au.LJIIIZ("enter_from", str3);
                c188727au.LJIIIZ("container_avoid_component_ids", ORZ.LLD(LIZIZ.LIZ, ",", null, null, null, 62));
                c188727au.LJIIIZ("global_avoid_component_ids", ORZ.LLD(LIZIZ.LIZIZ, ",", null, null, null, 62));
                c188727au.LJIIIZ("avoid_component_ids", ORZ.LLD(LIZIZ.LIZLLL, ",", null, null, null, 62));
                c188727au.LJIIIZ("display_component_ids", ORZ.LLD(LIZIZ.LIZJ, ",", null, null, null, 62));
                c188727au.LJIIIZ("must_display_component_ids", ORZ.LLD(LIZIZ.LJ, ",", null, null, null, 62));
                c188727au.LJIIIZ("avoid_type", LIZIZ.LJFF);
                FMX.LJIIL("avoid_component", c188727au.LIZ);
            }
            Collection<C211638Sh<ComponentPriorityProtocol>> values2 = LJIIIZ().values();
            kotlin.jvm.internal.o.LJIIIIZZ(values2, "pendingDecisions.values");
            ArrayList arrayList = new ArrayList();
            for (C211638Sh<ComponentPriorityProtocol> c211638Sh : values2) {
                if (c211638Sh.LJLJL) {
                    arrayList.add(c211638Sh);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C211638Sh) it2.next()).LJLLI = true;
            }
        }
    }

    public final void LJ(Aweme aweme) {
        this.LJ = 1;
        this.LJI = aweme;
        if (LJIILJJIL(LJIIJJI(), LJI())) {
            LJIILLIIL();
        }
        if (LJIILL()) {
            for (C211638Sh<ComponentPriorityProtocol> c211638Sh : LJIIJJI()) {
                c211638Sh.LJLILLLLZI.invoke(c211638Sh.LJLIL, Boolean.FALSE);
            }
        }
        LifecycleOwner lifecycleOwner = this.LJFF;
        if (lifecycleOwner != null) {
            InterfaceC55235Lm3 vScope = C55096Ljo.LJIIZILJ((C8W0) lifecycleOwner);
            Aweme aweme2 = this.LJI;
            String str = this.LIZIZ;
            String str2 = this.LIZJ;
            List<GlobalComponentData> list = this.LJIIIIZZ;
            kotlin.jvm.internal.o.LJIIIZ(vScope, "vScope");
            C211118Qh.LIZJ = aweme2;
            C211118Qh.LIZLLL = str2;
            C211118Qh.LJ = str;
            C211118Qh.LJFF = list;
            C211118Qh.LJI = vScope;
            LJIIZILJ();
            if (!FRY.LIZ() || !LJIILL()) {
                return;
            }
            Iterator<C211638Sh<ComponentPriorityProtocol>> it = LJIIL().iterator();
            while (it.hasNext()) {
                LJIILIIL(it.next());
            }
            if (LJIIJJI().isEmpty() || !LJIILJJIL(LJIIJJI(), this.LJIILJJIL)) {
                return;
            }
            Iterator<C211638Sh<ComponentPriorityProtocol>> it2 = LJIIJJI().iterator();
            while (it2.hasNext()) {
                LJIILIIL(it2.next());
            }
            ((ArrayList) this.LJIILJJIL).clear();
            ((ArrayList) this.LJIILJJIL).addAll(LJIIJJI());
            return;
        }
        kotlin.jvm.internal.o.LJIJI("lifecycleOwner");
        throw null;
    }

    public final void LJIILIIL(C211638Sh<ComponentPriorityProtocol> c211638Sh) {
        String str;
        String str2;
        InterfaceC88471Ynr<String, C188727au, C76800UCe> interfaceC88471Ynr;
        String str3;
        String str4;
        String str5;
        C8W0 c8w0;
        InterfaceC55235Lm3 LJIIZILJ;
        TranslationAbility translationAbility;
        List<AnchorCommonStruct> h4;
        String o0 = c211638Sh.LJLIL.o0();
        java.util.Map<String, String> map = null;
        if (kotlin.jvm.internal.o.LJ("anchor", c211638Sh.LJLJI.matchedContainerKey)) {
            LifecycleOwner lifecycleOwner = this.LJFF;
            if (lifecycleOwner != null) {
                FeedMultiAnchorAbility feedMultiAnchorAbility = (FeedMultiAnchorAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) lifecycleOwner), FeedMultiAnchorAbility.class, null);
                if (feedMultiAnchorAbility != null && (h4 = feedMultiAnchorAbility.h4()) != null) {
                    Iterator<AnchorCommonStruct> it = h4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AnchorCommonStruct next = it.next();
                        if (next.getType() > EnumC42934Gt8.NO_TYPE.getTYPE()) {
                            o0 = next.getComponentKey();
                            break;
                        }
                    }
                }
            } else {
                kotlin.jvm.internal.o.LJIJI("lifecycleOwner");
                throw null;
            }
        }
        c211638Sh.LJLJJLL = o0;
        boolean z = c211638Sh.LJLL;
        View l0 = c211638Sh.LJLIL.l0();
        if (kotlin.jvm.internal.o.LJ("left_container_see_translation", c211638Sh.LJLIL.o0())) {
            LifecycleOwner lifecycleOwner2 = this.LJFF;
            if (lifecycleOwner2 != null) {
                if (!(lifecycleOwner2 instanceof BaseCellContentComponent) || (c8w0 = (C8W0) lifecycleOwner2) == null || (LJIIZILJ = C55096Ljo.LJIIZILJ(c8w0)) == null || (translationAbility = (TranslationAbility) C55096Ljo.LIZ(LJIIZILJ, TranslationAbility.class, null)) == null || !translationAbility.pa0()) {
                    return;
                }
            } else {
                kotlin.jvm.internal.o.LJIJI("lifecycleOwner");
                throw null;
            }
        } else if (l0.getVisibility() != 0) {
            return;
        }
        if (!z) {
            c211638Sh.LJLL = true;
            String str6 = c211638Sh.LJLJI.matchedContainerKey;
            C8T7 e2 = c211638Sh.LJLIL.e2();
            c211638Sh.LJLIL.l0().getContext();
            boolean LIZ = C53664L4i.LIZ(C211118Qh.LJ);
            boolean LIZIZ = C53664L4i.LIZIZ(C211118Qh.LIZLLL);
            if (!TextUtils.isEmpty(o0)) {
                if ((!LIZ && !LIZIZ) || ORZ.LJLJJI(o0, C210888Pk.LIZJ)) {
                    return;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", C211118Qh.LIZLLL);
                Aweme aweme = C211118Qh.LIZJ;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("group_id", str);
                Aweme aweme2 = C211118Qh.LIZJ;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("author_id", str2);
                c188727au.LJIIIZ("component_key", o0);
                c188727au.LJIIIZ("component_type", str6);
                String LJIIJ = c188727au.LJIIJ("enter_from");
                String componentKey = c188727au.LJIIJ("component_key");
                if (o.LJJJJIZL("homepage_hot", LJIIJ, true)) {
                    kotlin.jvm.internal.o.LJIIIIZZ(componentKey, "componentKey");
                    if (s.LJJJLZIJ(componentKey, "anchor", false)) {
                        C211648Si.LJ = componentKey;
                        C211648Si.LJFF++;
                    }
                }
                if (e2 != null) {
                    interfaceC88471Ynr = e2.LIZ;
                } else {
                    interfaceC88471Ynr = null;
                }
                if (interfaceC88471Ynr != null) {
                    InterfaceC88471Ynr<String, C188727au, C76800UCe> interfaceC88471Ynr2 = e2.LIZ;
                    if (interfaceC88471Ynr2 != null) {
                        interfaceC88471Ynr2.invoke("show_core_fdmt_component", c188727au);
                    }
                } else {
                    FMX.LJIIL("show_core_fdmt_component", c188727au.LIZ);
                }
                if (!((Boolean) HHJ.LIZ.getValue()).booleanValue()) {
                    return;
                }
                InterfaceC55235Lm3 interfaceC55235Lm3 = C211118Qh.LJI;
                if (interfaceC55235Lm3 != null) {
                    C211658Sj c211658Sj = new C211658Sj(0);
                    c211658Sj.LJLJJI = C211118Qh.LIZLLL;
                    Aweme aweme3 = C211118Qh.LIZJ;
                    if (aweme3 != null) {
                        str4 = aweme3.getAid();
                    } else {
                        str4 = null;
                    }
                    c211658Sj.LJLJJL = str4;
                    Aweme aweme4 = C211118Qh.LIZJ;
                    if (aweme4 != null) {
                        str5 = aweme4.getAuthorUid();
                    } else {
                        str5 = null;
                    }
                    c211658Sj.LJLIL = str5;
                    c211658Sj.LJLILLLLZI = o0;
                    c211658Sj.LJLJI = str6;
                    C62814Ol0.LJJIIJZLJL(interfaceC55235Lm3, ShowCoreFdmtComponentParamProvider.class, C47261Igj.LJJIJIL(new ShowCoreFdmtParamProvider(interfaceC55235Lm3, c211658Sj)));
                }
                InterfaceC55235Lm3 interfaceC55235Lm32 = C211118Qh.LJI;
                if (interfaceC55235Lm32 != null) {
                    Object newInstance = ShowCoreFdmtComponentEvent.class.newInstance();
                    kotlin.jvm.internal.o.LJIIIIZZ(newInstance, "eventClz.newInstance()");
                    AbstractC63695OzD abstractC63695OzD = (AbstractC63695OzD) newInstance;
                    List LJIJ = C62814Ol0.LJIJ(interfaceC55235Lm32, ShowCoreFdmtComponentParamProvider.class);
                    if (LJIJ != null) {
                        Iterator it2 = ((ArrayList) LJIJ).iterator();
                        while (it2.hasNext()) {
                            InterfaceC54035LIp param = ((EventParamsProtocol) it2.next()).getParam();
                            if (param != null) {
                                abstractC63695OzD.LJ(param);
                            }
                        }
                    }
                    if (abstractC63695OzD != null) {
                        java.util.Map<String, String> map2 = c188727au.LIZ;
                        kotlin.jvm.internal.o.LJIIIIZZ(map2, "oldParam.builder()");
                        C227928x2.LIZ("show_core_fdmt_component", map2, abstractC63695OzD);
                        str3 = abstractC63695OzD.LIZ;
                        map = abstractC63695OzD.LIZJ();
                        FMX.LJIIL(str3, map);
                    }
                }
                str3 = null;
                FMX.LJIIL(str3, map);
            }
        }
    }

    public final void LJIJI(ComponentPriorityProtocol componentPriorityProtocol) {
        if (kotlin.jvm.internal.o.LJ("left_container_see_translation", componentPriorityProtocol.o0())) {
            LifecycleOwner lifecycleOwner = this.LJFF;
            if (lifecycleOwner != null) {
                TranslationAbility translationAbility = (TranslationAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((C8W0) lifecycleOwner), TranslationAbility.class, null);
                if (translationAbility != null) {
                    translationAbility.f00("");
                    return;
                }
                return;
            }
            kotlin.jvm.internal.o.LJIJI("lifecycleOwner");
            throw null;
        }
        componentPriorityProtocol.l0().setTag(C8QI.LJ, "");
    }

    public final void LJIJJ(ComponentPriorityProtocol priorityProtocol) {
        kotlin.jvm.internal.o.LJIIIZ(priorityProtocol, "priorityProtocol");
        if (!C53664L4i.LIZ(this.LIZIZ) && !C53664L4i.LIZIZ(this.LIZJ)) {
            return;
        }
        String o0 = priorityProtocol.o0();
        for (C211638Sh<ComponentPriorityProtocol> c211638Sh : LJIIJJI()) {
            if (kotlin.jvm.internal.o.LJ(c211638Sh.LJLIL.o0(), priorityProtocol.o0())) {
                if (c211638Sh != null) {
                    LJIIJJI().remove(c211638Sh);
                    LJI().remove(c211638Sh);
                    C65777Prh.LIZJ(LJIIIZ()).remove(o0);
                    ((ArrayList) this.LJIILJJIL).remove(c211638Sh);
                    LJIIL().remove(c211638Sh);
                    return;
                }
                return;
            }
        }
    }

    public final void LJIJJLI(C211638Sh c211638Sh) {
        T t = c211638Sh.LJLIL;
        if (kotlin.jvm.internal.o.LJ("left_container_see_translation", t.o0())) {
            LifecycleOwner lifecycleOwner = this.LJFF;
            if (lifecycleOwner != null) {
                InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ((C8W0) lifecycleOwner);
                TranslationAbility translationAbility = (TranslationAbility) C55096Ljo.LIZ(LJIIZILJ, TranslationAbility.class, null);
                if (translationAbility != null) {
                    translationAbility.Rk0(false);
                }
                TranslationAbility translationAbility2 = (TranslationAbility) C55096Ljo.LIZ(LJIIZILJ, TranslationAbility.class, null);
                if (translationAbility2 != null) {
                    translationAbility2.f00("is_avoided");
                    return;
                }
                return;
            }
            kotlin.jvm.internal.o.LJIJI("lifecycleOwner");
            throw null;
        }
        View l0 = t.l0();
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            l0.setVisibility(8);
        } else {
            C79057V0z.LJJJ(l0, new ARunnableS7S0101000_3(l0, 12));
        }
        l0.setTag(C8QI.LJ, "is_avoided");
        c211638Sh.LJLILLLLZI.invoke(t, Boolean.TRUE);
    }

    public static boolean LIZLLL(C211638Sh c211638Sh, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(c211638Sh.LJLIL.o0(), ((C211638Sh) it.next()).LJLIL.o0())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILJJIL(List list, List list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C211638Sh) ListProtector.get(list, i)).LJLJJI != ((C211638Sh) ListProtector.get(list2, i)).LJLJJI) {
                return true;
            }
        }
        return false;
    }

    public C211628Sg(FeedComponentPriorityData feedComponentPriorityData, String str, String str2) {
        this.LIZ = feedComponentPriorityData;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJII = feedComponentPriorityData.globalShowLimit;
        this.LJIIIIZZ = feedComponentPriorityData.globalComponentList;
        this.LJIIIZ = feedComponentPriorityData.containerMap;
        this.LJIIJ = feedComponentPriorityData.priorityList;
    }

    public final void LIZJ(String str, ComponentPriorityProtocol componentPriorityProtocol, boolean z) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        } else if (componentPriorityProtocol != null) {
            str2 = componentPriorityProtocol.o0();
        } else {
            str2 = null;
        }
        if (!C52415Khf.LIZ()) {
            return;
        }
        if (!C210908Pm.LIZ() && ORZ.LJLJJI(str, C210908Pm.LIZIZ)) {
            return;
        }
        if (!C8QC.LIZ() && ORZ.LJLJJI(str, C8QC.LIZIZ)) {
            return;
        }
        if (!C53664L4i.LIZ(this.LIZIZ) && !C53664L4i.LIZIZ(this.LIZJ)) {
            return;
        }
        if (LJIIIZ().containsKey(str2)) {
            C211638Sh<ComponentPriorityProtocol> c211638Sh = LJIIIZ().get(str2);
            if (c211638Sh != null) {
                c211638Sh.LJLJL = z;
                c211638Sh.LJLJLJ = true;
                C78923UyF.LJIJ((MutableLiveData) this.LJIILLIIL.getValue(), c211638Sh);
                return;
            }
            return;
        }
        if (componentPriorityProtocol == null) {
            return;
        }
        LJIJ(componentPriorityProtocol, C211688Sm.LJLIL, Boolean.TRUE);
        if (!LJIIIZ().containsKey(str2)) {
            return;
        }
        LIZJ(str2, componentPriorityProtocol, z);
    }

    public final void LJIJ(ComponentPriorityProtocol priorityProtocol, InterfaceC88471Ynr<? super ComponentPriorityProtocol, ? super Boolean, C76800UCe> finish, Boolean bool) {
        List<String> list;
        List<GlobalComponentData> list2;
        kotlin.jvm.internal.o.LJIIIZ(priorityProtocol, "priorityProtocol");
        kotlin.jvm.internal.o.LJIIIZ(finish, "finish");
        String o0 = priorityProtocol.o0();
        if (!C52415Khf.LIZ()) {
            return;
        }
        if (!C210908Pm.LIZ() && ORZ.LJLJJI(o0, C210908Pm.LIZIZ)) {
            return;
        }
        if (!C8QC.LIZ() && ORZ.LJLJJI(o0, C8QC.LIZIZ)) {
            return;
        }
        if ((!C53664L4i.LIZ(this.LIZIZ) && !C53664L4i.LIZIZ(this.LIZJ)) || (list = this.LJIIJ) == null || list.size() == 0 || (list2 = this.LJIIIIZZ) == null || list2.isEmpty() || TextUtils.isEmpty(priorityProtocol.o0())) {
            return;
        }
        int LJZ = ORZ.LJZ(priorityProtocol.o0(), this.LJIIJ);
        if (LJZ < 0) {
            C211638Sh c211638Sh = new C211638Sh(priorityProtocol, finish, new GlobalComponentData(null, 0, null, null, 0, 31, null), LJZ, bool);
            ComponentPriorityProtocol componentPriorityProtocol = c211638Sh.LJLIL;
            LJIJJLI(c211638Sh);
            Iterator<ComponentPriorityProtocol> it = LJIIIIZZ().iterator();
            while (true) {
                if (it.hasNext()) {
                    ComponentPriorityProtocol next = it.next();
                    if (TextUtils.equals(next.o0(), next.o0())) {
                        break;
                    }
                } else {
                    LJIIIIZZ().add(componentPriorityProtocol);
                    break;
                }
            }
            String o02 = priorityProtocol.o0();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("component_key", o02);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            String str = null;
            C09900aA.LJI("feed_platform_invalid_component", jSONObject, null, null);
            AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LIZLLL.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fcp invalid aweme : ");
            Aweme aweme = this.LJI;
            if (aweme != null) {
                str = aweme.getAid();
            }
            LIZ.append(str);
            LIZ.append("  feed_platform_invalid_component :  ");
            LIZ.append(priorityProtocol.o0());
            abstractC48820JEa.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        GlobalComponentData globalComponentData = (GlobalComponentData) ListProtector.get(this.LJIIIIZZ, LJZ);
        if (TextUtils.isEmpty(globalComponentData.componentKey)) {
            return;
        }
        C211638Sh<ComponentPriorityProtocol> c211638Sh2 = new C211638Sh<>(priorityProtocol, finish, globalComponentData, LJZ, bool);
        if (LIZLLL(c211638Sh2, LJI()) || LJIIIZ().containsKey(c211638Sh2.LJLJI.componentKey)) {
            return;
        }
        priorityProtocol.l0().setTag(C8QI.LJFF, c211638Sh2);
        if (!LIZLLL(c211638Sh2, LJII())) {
            priorityProtocol.l0().setTag(C8QI.LJ, "");
        }
        if (globalComponentData.showStrategy == 1) {
            if (!ORZ.LJLJJI(globalComponentData.componentKey, C210888Pk.LIZJ) && !LIZLLL(c211638Sh2, LJIIL())) {
                LJIIL().add(c211638Sh2);
            }
        }
        if (globalComponentData.customShowLimit <= -1 && globalComponentData.showStrategy != 1) {
            c211638Sh2.LJLJLLL = Boolean.FALSE;
            C78923UyF.LJIJ(LJIIJ(), c211638Sh2);
            return;
        }
        if (kotlin.jvm.internal.o.LJ(c211638Sh2.LJLJJL, Boolean.TRUE)) {
            String str2 = c211638Sh2.LJLJI.componentKey;
            if (str2 == null || LJIIIZ().containsKey(str2)) {
                return;
            }
            LJIIIZ().put(str2, c211638Sh2);
            return;
        }
        if (LIZLLL(c211638Sh2, LJI())) {
            return;
        }
        LJI().add(c211638Sh2);
        C40675Fxn.LJJLIIIIJ(LJI());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r5 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        ((java.util.ArrayList) r8).add(r1);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r6 >= r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (X.C8QC.LIZ() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r4 <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r2 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r2.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        ((java.util.ArrayList) r8).add(r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.List r8, java.util.List r9, java.util.List r10, java.util.List r11, java.lang.String r12, java.lang.String r13, java.util.List r14) {
        /*
            r6 = 0
            if (r12 != 0) goto L35
        L3:
            r7 = 0
        L4:
            if (r13 != 0) goto L2e
        L6:
            r5 = 0
        L7:
            if (r14 == 0) goto Lf
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L27
        Lf:
            r4 = 0
        L10:
            r3 = 0
            if (r7 <= 0) goto L3c
            r2 = 0
        L14:
            if (r9 == 0) goto L25
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r2)
        L1a:
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            int r2 = r2 + 1
            if (r2 >= r7) goto L3c
            goto L14
        L25:
            r1 = r3
            goto L1a
        L27:
            if (r11 == 0) goto Lf
            int r4 = r11.size()
            goto L10
        L2e:
            if (r10 == 0) goto L6
            int r5 = r10.size()
            goto L7
        L35:
            if (r9 == 0) goto L3
            int r7 = r9.size()
            goto L4
        L3c:
            if (r5 <= 0) goto L51
        L3e:
            if (r10 == 0) goto L4f
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, r6)
        L44:
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            int r6 = r6 + 1
            if (r6 >= r5) goto L51
            goto L3e
        L4f:
            r1 = r3
            goto L44
        L51:
            boolean r0 = X.C8QC.LIZ()
            if (r0 == 0) goto L70
            if (r4 <= 0) goto L70
            if (r11 == 0) goto L70
            java.util.Iterator r2 = r11.iterator()
        L5f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r2.next()
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            goto L5f
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C211628Sg.LIZ(java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.util.List):void");
    }
}
