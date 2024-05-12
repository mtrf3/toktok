package X;

import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.spi.HomePageCommonServiceImpl;
import com.ss.android.ugc.aweme.mob.event.IHomePageMobProvider;
import com.ss.android.ugc.aweme.mob.event.NearbyHomePageMobProvider;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LIk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54030LIk {
    public static boolean LIZ = true;
    public static String LIZIZ;
    public static String LIZJ;
    public static boolean LIZLLL;

    public static void LJ() {
        new Handler(C16880lQ.LLJJJJ()).post(RunnableC54033LIn.LJLIL);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(java.lang.String r2) {
        /*
            if (r2 == 0) goto Lc9
            int r0 = r2.hashCode()
            switch(r0) {
                case -1965615457: goto Lbb;
                case -1525083535: goto Lad;
                case -1382453013: goto L9f;
                case -1376148670: goto L92;
                case -1309089240: goto L84;
                case -1116953497: goto L78;
                case -734952021: goto L6f;
                case -248850422: goto L66;
                case 2368780: goto L5a;
                case 2576150: goto L4e;
                case 2587369: goto L42;
                case 2614219: goto L36;
                case 712199613: goto L2d;
                case 984907784: goto L22;
                case 1055811561: goto L16;
                case 1270713017: goto La;
                default: goto L9;
            }
        L9:
            return r2
        La:
            java.lang.String r0 = "Popular"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L13
            goto L9
        L13:
            java.lang.String r2 = "homepage_popular"
            goto L9
        L16:
            java.lang.String r0 = "DISCOVER"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1f
            goto L9
        L1f:
            java.lang.String r2 = "discover"
            goto L9
        L22:
            java.lang.String r0 = "For You"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r2 = "homepage_hot"
            goto L9
        L2d:
            java.lang.String r0 = "SHOP_MALL"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
            goto L9
        L36:
            java.lang.String r0 = "USER"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3f
            goto L9
        L3f:
            java.lang.String r2 = "personal_homepage"
            goto L9
        L42:
            java.lang.String r0 = "Stem"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4b
            goto L9
        L4b:
            java.lang.String r2 = "homepage_topic_stem"
            goto L9
        L4e:
            java.lang.String r0 = "Shop"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
            goto L9
        L57:
            java.lang.String r2 = "homepage_shop_mall"
            goto L9
        L5a:
            java.lang.String r0 = "Live"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            goto L9
        L63:
            java.lang.String r2 = "homepage_live"
            goto L9
        L66:
            java.lang.String r1 = "video_post_page"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9c
            goto L9
        L6f:
            java.lang.String r0 = "FRIENDS_TAB"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8e
            goto L9
        L78:
            java.lang.String r0 = "MUSIC_DSP"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L81
            goto L9
        L81:
            java.lang.String r2 = "homepage_music"
            goto L9
        L84:
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8e
            goto L9
        L8e:
            java.lang.String r2 = "homepage_friends"
            goto L9
        L92:
            java.lang.String r1 = "homepage_explore"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9c
            goto L9
        L9c:
            r2 = r1
            goto L9
        L9f:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La9
            goto L9
        La9:
            java.lang.String r2 = "notification_page"
            goto L9
        Lad:
            java.lang.String r0 = "Following"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb7
            goto L9
        Lb7:
            java.lang.String r2 = "homepage_follow"
            goto L9
        Lbb:
            java.lang.String r0 = "Nearby"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lc5
            goto L9
        Lc5:
            java.lang.String r2 = "homepage_nearby"
            goto L9
        Lc9:
            java.lang.String r2 = "be_null"
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54030LIk.LJFF(java.lang.String):java.lang.String");
    }

    public static OSZ LIZIZ(ActivityC45651qj activity, String tagName) {
        List<InterfaceC54080LKi> list;
        String value;
        String str;
        List<InterfaceC54080LKi> list2;
        int size;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(tagName, "tagName");
        String str2 = null;
        HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), HomeTabAbility.class, null);
        if (homeTabAbility == null || (list = homeTabAbility.fd()) == null) {
            list = C61878OQg.INSTANCE;
        }
        Iterator<InterfaceC54080LKi> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().tag(), tagName)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (o.LJ(((InterfaceC54080LKi) ListProtector.get(list, 1)).tag(), "FRIENDS_TAB") && o.LJ(tagName, "FRIENDS_FEED")) {
            i = 1;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        value = "be_null";
                    } else {
                        value = EnumC54031LIl.BOTTOM_5TAB.getValue();
                    }
                } else {
                    value = EnumC54031LIl.BOTTOM_4TAB.getValue();
                }
            } else {
                value = EnumC54031LIl.BOTTOM_3TAB.getValue();
            }
        } else {
            value = EnumC54031LIl.BOTTOM_2TAB.getValue();
        }
        if (o.LJ(value, "be_null")) {
            HomeTabAbility homeTabAbility2 = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), HomeTabAbility.class, null);
            if (homeTabAbility2 == null || (list2 = homeTabAbility2.p5()) == null) {
                list2 = C61878OQg.INSTANCE;
            }
            Iterator<InterfaceC54080LKi> it2 = list2.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (o.LJ(it2.next().tag(), tagName)) {
                    if (i2 >= 0) {
                        int size2 = (list2.size() - 1) - i2;
                        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), HomeViewPagerAbility.class, null);
                        if (homeViewPagerAbility != null) {
                            size = homeViewPagerAbility.yt0();
                        } else {
                            size = list2.size() - 1;
                        }
                        int size3 = (list2.size() - 1) - size;
                        if (size3 == size2) {
                            z = true;
                        }
                        int i3 = size2 - size3;
                        if (i3 != -1) {
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            value = C0NY.LIZIZ("top_", i3, "tab");
                                        } else {
                                            value = EnumC54031LIl.TOP_3TAB.getValue();
                                        }
                                    } else {
                                        value = EnumC54031LIl.TOP_2TAB.getValue();
                                    }
                                } else {
                                    value = EnumC54031LIl.TOP_1TAB.getValue();
                                }
                            } else {
                                value = EnumC54031LIl.TOP_0TAB.getValue();
                            }
                        } else {
                            value = EnumC54031LIl.TOP_MINUS_1TAB.getValue();
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (o.LJ(value, "be_null")) {
            HomePageCommonService LJ = HomePageCommonServiceImpl.LJ();
            AbstractC53895LDf LIZJ2 = LJ.LIZJ();
            if (LIZJ2 != null) {
                str = LIZJ2.tag();
            } else {
                str = null;
            }
            if (o.LJ(str, tagName)) {
                value = EnumC54031LIl.TOP_LEFT_TAB.getValue();
            }
            AbstractC53895LDf LIZ2 = LJ.LIZ();
            if (LIZ2 != null) {
                str2 = LIZ2.tag();
            }
            if (o.LJ(str2, tagName)) {
                value = EnumC54031LIl.TOP_RIGHT_TAB.getValue();
            }
        }
        return new OSZ(value, Boolean.valueOf(z));
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj, String str) {
        if (LIZLLL || activityC45651qj == null) {
            return;
        }
        OSZ LIZIZ2 = LIZIZ(activityC45651qj, str);
        LIZIZ = "publish_landing";
        LIZJ("video_post_page", str, (String) LIZIZ2.getFirst(), ((Boolean) LIZIZ2.getSecond()).booleanValue(), activityC45651qj);
        LIZLLL = true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.LIp] */
    public static void LIZ(String str, ActivityC45651qj activityC45651qj, JSONObject jSONObject) {
        List LJIJ;
        java.util.Map<String, Object> LLLILZ;
        if (activityC45651qj != null && (LJIJ = C62814Ol0.LJIJ(C55230Lly.LIZLLL(activityC45651qj, null), IHomePageMobProvider.class)) != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                IHomePageMobProvider iHomePageMobProvider = (IHomePageMobProvider) it.next();
                if (iHomePageMobProvider instanceof NearbyHomePageMobProvider) {
                    if (o.LJ(str, "homepage_nearby")) {
                        for (Map.Entry entry : ((LinkedHashMap) ((NearbyHomePageMobProvider) iHomePageMobProvider).getParam().LLLILZ()).entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    ?? param = iHomePageMobProvider.getParam();
                    if (param != 0 && (LLLILZ = param.LLLILZ()) != null) {
                        for (Map.Entry<String, Object> entry2 : LLLILZ.entrySet()) {
                            jSONObject.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public static void LIZJ(String str, String to, String location, boolean z, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(to, "to");
        o.LJIIIZ(location, "location");
        if (LIZLLL) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = str;
        String str2 = "be_null";
        if (LIZ) {
            LIZ = false;
            if (z) {
                str2 = LJF.OPEN_APP.getValue();
            }
            LIZIZ = str2;
            if (c68322mC.element == 0) {
                c68322mC.element = to;
            }
        } else {
            if (o.LJ(str, to)) {
                return;
            }
            if (c68322mC.element == 0) {
                if (o.LJ(to, "USER")) {
                    LIZIZ = "be_null";
                    c68322mC.element = LIZJ;
                } else {
                    return;
                }
            }
        }
        LIZJ = to;
        C10K.LIZIZ(new J84(to, c68322mC, LIZIZ, location, activityC45651qj), FMX.LIZIZ(), null);
        LIZIZ = null;
    }
}
