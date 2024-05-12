package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.Candidate;
import com.ss.android.ugc.aweme.experiment.Entrance;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.L8f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53765L8f {
    public static Entrance LIZ;
    public static Entrance LIZIZ;
    public static SlidePage LIZJ;
    public static Boolean LIZLLL;
    public static Boolean LJ;
    public static Boolean LJFF;
    public static final TabConfig LJI = new TabConfig(Boolean.TRUE, null, null, null, null);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(L74.LJLIL);

    public static Entrance LIZJ() {
        Entrance entrance;
        if (LIZ == null) {
            TabConfig LJIIIZ = LJIIIZ();
            if (LJIIIZ == null || (entrance = LJIIIZ.leftEntrance) == null) {
                return null;
            }
            LIZ = LIZLLL(entrance);
        }
        return LIZ;
    }

    public static Entrance LJFF() {
        Entrance entrance;
        if (LIZIZ == null) {
            TabConfig LJIIIZ = LJIIIZ();
            if (LJIIIZ == null || (entrance = LJIIIZ.rightEntrance) == null) {
                return null;
            }
            LIZIZ = LIZLLL(entrance);
        }
        return LIZIZ;
    }

    public static SlidePage LJII() {
        if (LIZJ == null) {
            SlidePage slidePage = (SlidePage) C53766L8g.LIZIZ.getValue();
            if (slidePage != null) {
                SlidePageItem slidePageItem = slidePage.left;
                SlidePageItem slidePageItem2 = slidePage.right;
                if (slidePageItem != null) {
                    slidePageItem = LJ(slidePageItem);
                }
                if (slidePageItem2 != null) {
                    slidePageItem2 = LJ(slidePageItem2);
                }
                slidePage = new SlidePage(slidePageItem, slidePageItem2);
            }
            LIZJ = slidePage;
        }
        return LIZJ;
    }

    public static TabConfig LJIIIZ() {
        return (TabConfig) LJII.getValue();
    }

    public static boolean LJIILJJIL() {
        if (LJIIIIZZ("NOTIFICATION") == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIILL() {
        SlidePage slidePage = (SlidePage) C53766L8g.LIZIZ.getValue();
        if (slidePage == null) {
            return false;
        }
        SlidePageItem slidePageItem = slidePage.left;
        if (slidePageItem != null && slidePageItem.landingPage == null) {
            return true;
        }
        SlidePageItem slidePageItem2 = slidePage.right;
        if (slidePageItem2 == null || slidePageItem2.landingPage != null) {
            return false;
        }
        return true;
    }

    public static boolean LIZ() {
        Entrance entrance;
        List<Candidate> list;
        String str;
        if (!C40471FuV.LIZ()) {
            return false;
        }
        Boolean bool = LJFF;
        if (bool != null) {
            return bool.booleanValue();
        }
        TabConfig LJIIIZ = LJIIIZ();
        if (LJIIIZ != null && (entrance = LJIIIZ.leftEntrance) != null && (list = entrance.candidates) != null) {
            for (Candidate candidate : list) {
                if (candidate != null) {
                    str = candidate.entranceKey;
                } else {
                    str = null;
                }
                if (o.LJ(str, LMF.SEARCH.getTag())) {
                    LJFF = Boolean.TRUE;
                    return true;
                }
            }
        }
        LJFF = Boolean.FALSE;
        return false;
    }

    public static boolean LIZIZ() {
        java.util.Map<String, List<BottomTab>> map;
        String str;
        String str2;
        if (!C40471FuV.LIZ()) {
            return false;
        }
        Boolean bool = LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        TabConfig LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            map = LJIIIZ.bottomTab;
        } else {
            map = null;
        }
        int i = 0;
        do {
            if (map != null) {
                List<BottomTab> list = map.get(String.valueOf(i));
                if (list != null) {
                    for (BottomTab bottomTab : list) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("feedTabPlateFormHasTab:  ");
                        if (bottomTab != null) {
                            str = bottomTab.bottomTabKey;
                        } else {
                            str = null;
                        }
                        LIZ2.append(str);
                        LIZ2.append(' ');
                        X1D.LIZIZ(LIZ2);
                        if (bottomTab != null) {
                            str2 = bottomTab.bottomTabKey;
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(str2, EnumC53808L9w.MALL.getKey())) {
                            LIZLLL = Boolean.TRUE;
                            return true;
                        }
                    }
                }
            }
            i++;
        } while (i < 5);
        LIZLLL = Boolean.FALSE;
        return false;
    }

    public static SlidePageItem LJI() {
        SlidePage LJII2 = LJII();
        if (LJII2 != null) {
            return LJII2.right;
        }
        return null;
    }

    public static boolean LJIIJ() {
        java.util.Map<String, List<BottomTab>> map;
        TabConfig LJIIIZ = LJIIIZ();
        if (LJIIIZ == null || (map = LJIIIZ.bottomTab) == null || map.size() < 5) {
            return true;
        }
        int i = 0;
        do {
            List<BottomTab> list = map.get(String.valueOf(i));
            if (list != null) {
                Iterator<BottomTab> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().bottomTabKey == null) {
                        return true;
                    }
                }
            }
            i++;
        } while (i < 5);
        return false;
    }

    public static boolean LJIIJJI() {
        List<Candidate> list;
        List<Candidate> list2;
        if (C40471FuV.LIZ()) {
            Entrance LIZJ2 = LIZJ();
            if (LIZJ2 != null && (list2 = LIZJ2.candidates) != null) {
                Iterator<Candidate> it = list2.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next().entranceKey, "USER")) {
                        break;
                    }
                }
            }
            Entrance LJFF2 = LJFF();
            if (LJFF2 != null && (list = LJFF2.candidates) != null) {
                Iterator<Candidate> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (TextUtils.equals(it2.next().entranceKey, "USER")) {
                        break;
                    }
                }
            }
        }
        if (LJIIIIZZ("USER") == -1) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL() {
        TopTab topTab;
        List<TopTabItem> list;
        TabConfig LJIIIZ = LJIIIZ();
        if (LJIIIZ == null || (topTab = LJIIIZ.topTab) == null || (list = topTab.topTabList) == null || list.isEmpty()) {
            return true;
        }
        Iterator<TopTabItem> it = topTab.topTabList.iterator();
        while (it.hasNext()) {
            String str = it.next().topTabKey;
            if (str == null || ujb.o.LJJJJJL(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIZILJ() {
        SlidePage LJII2;
        SlidePage LJII3;
        SlidePageItem slidePageItem;
        if (!C53297Kvt.LIZ() || (LJII2 = LJII()) == null || LJII2.left == null || (LJII3 = LJII()) == null || (slidePageItem = LJII3.left) == null || slidePageItem.scope != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJIJ() {
        SlidePage LJII2;
        if (C40471FuV.LIZ() && (LJII2 = LJII()) != null && LJII2.left != null) {
            return true;
        }
        return false;
    }

    public static boolean LJIJI() {
        Object obj;
        SlidePageItem LJI2 = LJI();
        if (LJI2 != null) {
            obj = Integer.valueOf(LJI2.scope);
        } else {
            obj = Boolean.FALSE;
        }
        if (C53297Kvt.LIZ() && (o.LJ(obj, 1) || o.LJ(obj, 2))) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJ() {
        Object obj;
        SlidePageItem LJI2 = LJI();
        if (LJI2 != null) {
            obj = Integer.valueOf(LJI2.scope);
        } else {
            obj = Boolean.FALSE;
        }
        if (C53297Kvt.LIZ() && (o.LJ(obj, 1) || o.LJ(obj, 2))) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJLI() {
        if (C40471FuV.LIZ() && LJI() != null) {
            return true;
        }
        return false;
    }

    public static Entrance LIZLLL(Entrance entrance) {
        List<Candidate> list = entrance.candidates;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (Candidate candidate : list) {
            if (o.LJ(candidate.entranceKey, EnumC53808L9w.PROFILE.getKey())) {
                String entranceKey = LMF.MY_PROFILE.getTag();
                Integer num = candidate.requestSlotLock;
                o.LJIIIZ(entranceKey, "entranceKey");
                candidate = new Candidate(entranceKey, num);
            } else if (o.LJ(candidate.entranceKey, EnumC53808L9w.INBOX.getKey())) {
                candidate = new Candidate("NOTIFICATION", candidate.requestSlotLock);
            }
            arrayList.add(candidate);
        }
        List candidates = ORZ.LLJI(arrayList);
        int i = entrance.showLimit;
        o.LJIIIZ(candidates, "candidates");
        return new Entrance(i, candidates);
    }

    public static SlidePageItem LJ(SlidePageItem slidePageItem) {
        String landingPage = slidePageItem.landingPage;
        if (o.LJ(landingPage, EnumC53808L9w.PROFILE.getKey())) {
            landingPage = LMF.MY_PROFILE.getTag();
        } else if (o.LJ(landingPage, EnumC53808L9w.INBOX.getKey())) {
            landingPage = "NOTIFICATION";
        }
        int i = slidePageItem.scope;
        int i2 = slidePageItem.firstSlidePopup;
        o.LJIIIZ(landingPage, "landingPage");
        return new SlidePageItem(landingPage, i, i2);
    }

    public static int LJIIIIZZ(String tag) {
        String str;
        SlidePageItem slidePageItem;
        SlidePageItem slidePageItem2;
        o.LJIIIZ(tag, "tag");
        if (!C40471FuV.LIZ()) {
            return -1;
        }
        SlidePage LJII2 = LJII();
        String str2 = null;
        if (LJII2 != null && (slidePageItem2 = LJII2.right) != null) {
            str = slidePageItem2.landingPage;
        } else {
            str = null;
        }
        if (TextUtils.equals(tag, str)) {
            return 1;
        }
        SlidePage LJII3 = LJII();
        if (LJII3 != null && (slidePageItem = LJII3.left) != null) {
            str2 = slidePageItem.landingPage;
        }
        if (!TextUtils.equals(tag, str2)) {
            return -1;
        }
        return 0;
    }

    public static boolean LJIIL(String tag) {
        o.LJIIIZ(tag, "tag");
        if (LJIIIIZZ(tag) == -1) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(String tag) {
        o.LJIIIZ(tag, "tag");
        int LJIIIIZZ = LJIIIIZZ(tag);
        if (LJIIIIZZ == 0 || LJIIIIZZ == 1) {
            return true;
        }
        return false;
    }
}
