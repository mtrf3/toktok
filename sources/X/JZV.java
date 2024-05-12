package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZV {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        if (((Boolean) KPE.LIZIZ.getValue()).booleanValue() && C46442IKo.LIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        Keva keva = C49629Jdp.LIZ;
        if ((!keva.getBoolean("has_entered_search_inner_flow", false) || keva.getBoolean("has_swiped_inner_flow", false) || keva.getBoolean("has_shown_guide", false)) && !((Boolean) C34005DWf.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(M89 m89) {
        String str;
        String eventType;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkFeedParam ");
        if (m89 != null) {
            str = m89.getEventType();
        } else {
            str = null;
        }
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        if (m89 != null && (eventType = m89.getEventType()) != null && (o.LJ(eventType, "general_search") || o.LJ(eventType, "search_result"))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZV.LJ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static void LJFF(int i, ActivityC45651qj activityC45651qj, SearchMixFeed searchMixFeed) {
        List<DynamicPatch.SearchMultiTabListData> awemeMultiTabList;
        String str;
        List<Aweme> awemeList;
        String str2;
        List<? extends Aweme> list;
        String str3;
        String str4;
        List<Aweme> list2;
        String str5;
        if (LIZLLL() && LIZJ()) {
            Aweme aweme = searchMixFeed.getAweme();
            if (aweme != null) {
                DynamicPatch LJI = searchMixFeed.LJI();
                if (LJI != null) {
                    str5 = LJI.schema;
                } else {
                    str5 = null;
                }
                LIZIZ(aweme, i, JWA.LIZ(str5), searchMixFeed.LJLILLLLZI, activityC45651qj);
            }
            List<SearchUser> list3 = searchMixFeed.users;
            if (list3 != null) {
                ArrayList arrayList = new ArrayList();
                for (SearchUser searchUser : list3) {
                    SearchUser searchUser2 = searchUser;
                    if (searchUser2 != null && (list2 = searchUser2.awemeCards) != null && !list2.isEmpty()) {
                        arrayList.add(searchUser);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<Aweme> list4 = ((SearchUser) it.next()).awemeCards;
                    o.LJIIIIZZ(list4, "it.awemeCards");
                    ORS.LJJLIIIJILLIZJL(list4, arrayList2);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Aweme aweme2 = (Aweme) it2.next();
                    if (aweme2 != null) {
                        DynamicPatch LJI2 = searchMixFeed.LJI();
                        if (LJI2 != null) {
                            str4 = LJI2.schema;
                        } else {
                            str4 = null;
                        }
                        LIZIZ(aweme2, i, JWA.LIZ(str4), searchMixFeed.LJLILLLLZI, activityC45651qj);
                    }
                }
            }
            SearchSpot searchSpot = searchMixFeed.hotSpot;
            if (searchSpot != null && (list = searchSpot.awemeCards) != null) {
                for (Aweme aweme3 : list) {
                    DynamicPatch LJI3 = searchMixFeed.LJI();
                    if (LJI3 != null) {
                        str3 = LJI3.schema;
                    } else {
                        str3 = null;
                    }
                    LIZIZ(aweme3, i, JWA.LIZ(str3), searchMixFeed.LJLILLLLZI, activityC45651qj);
                }
            }
            DynamicPatch LJI4 = searchMixFeed.LJI();
            if (LJI4 != null && (awemeList = LJI4.getAwemeList()) != null) {
                for (Aweme aweme4 : awemeList) {
                    if (aweme4 != null) {
                        DynamicPatch LJI5 = searchMixFeed.LJI();
                        if (LJI5 != null) {
                            str2 = LJI5.schema;
                        } else {
                            str2 = null;
                        }
                        LIZIZ(aweme4, i, JWA.LIZ(str2), searchMixFeed.LJLILLLLZI, activityC45651qj);
                    }
                }
            }
            DynamicPatch LJI6 = searchMixFeed.LJI();
            if (LJI6 != null && (awemeMultiTabList = LJI6.getAwemeMultiTabList()) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (DynamicPatch.SearchMultiTabListData searchMultiTabListData : awemeMultiTabList) {
                    List<Aweme> list5 = searchMultiTabListData.tabAwemeList;
                    if (list5 != null && !list5.isEmpty()) {
                        arrayList3.add(searchMultiTabListData);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    List<Aweme> list6 = ((DynamicPatch.SearchMultiTabListData) it3.next()).tabAwemeList;
                    o.LJIIIIZZ(list6, "it.tabAwemeList");
                    ORS.LJJLIIIJILLIZJL(list6, arrayList4);
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Aweme aweme5 = (Aweme) it4.next();
                    DynamicPatch LJI7 = searchMixFeed.LJI();
                    if (LJI7 != null) {
                        str = LJI7.schema;
                    } else {
                        str = null;
                    }
                    LIZIZ(aweme5, i, JWA.LIZ(str), searchMixFeed.LJLILLLLZI, activityC45651qj);
                }
            }
        }
    }

    public static void LIZIZ(Aweme aweme, int i, String str, int i2, ActivityC45651qj activityC45651qj) {
        ISearchContextAbility LJJJJL;
        if (aweme != null && (LJJJJL = C17N.LJJJJL(aweme)) != null) {
            LJJJJL.j4(new JZW(new JZX(KB1.LIZ(JTO.LIZIZ(activityC45651qj)), Integer.valueOf(i), Integer.valueOf(i2), str)));
        }
    }
}
