package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class JNW {
    public static final java.util.Map<Integer, String> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        hashMap.put(3, "general_search");
        hashMap.put(6, "search_sug");
    }

    public static String LIZ(int i) {
        String str = (String) ((HashMap) LIZ).get(Integer.valueOf(i));
        if (str == null || TextUtils.isEmpty(str)) {
            return "search_result";
        }
        return str;
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "click_search_recommend";
        }
        return "click_search_result";
    }

    public static void LJFF(int i, String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        if (i != 3) {
            c198517qh.LIZLLL("group_id", "");
            c198517qh.LIZLLL("request_id", str);
            c198517qh.LIZLLL("enter_from", "search_result");
            c198517qh.LIZLLL("enter_method", "click_card");
            c198517qh.LIZLLL("enter_type", "normal_way");
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("enter_detail");
            obtain.setLabelName("personal_homepage");
            obtain.setValue(str2);
            obtain.setJsonObject(c198517qh.LJ());
            FMX.onEvent(obtain);
            return;
        }
        c198517qh.LIZLLL("enter_from", "general_search");
        c198517qh.LIZLLL("enter_method", "click_card");
        c198517qh.LIZLLL("enter_type", "normal_way");
        MobClick obtain2 = MobClick.obtain();
        obtain2.setEventName("enter_detail");
        obtain2.setLabelName("personal_homepage");
        obtain2.setValue(str2);
        obtain2.setJsonObject(c198517qh.LJ());
        FMX.onEvent(obtain2);
    }

    public static void LJI(int i, String str, String str2) {
        if (i == 3) {
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("challenge_click");
            obtain.setLabelName("general_search");
            obtain.setValue(str);
            FMX.onEvent(obtain);
            return;
        }
        C198517qh c198517qh = new C198517qh();
        if (!TextUtils.isEmpty(str2)) {
            c198517qh.LIZLLL("search_keyword", str2);
            MobClick obtain2 = MobClick.obtain();
            obtain2.setEventName("challenge_click");
            obtain2.setLabelName("search_result");
            obtain2.setExtValueString(str);
            obtain2.setJsonObject(c198517qh.LJ());
            FMX.onEvent(obtain2);
            return;
        }
        c198517qh.LIZLLL("source", "recommend");
        c198517qh.LIZLLL("id", str);
        MobClick obtain3 = MobClick.obtain();
        obtain3.setEventName("challenge_click");
        obtain3.setLabelName("search_result");
        obtain3.setJsonObject(c198517qh.LJ());
        FMX.onEvent(obtain3);
    }

    public static void LJ(View view, String str, Aweme aweme, String str2, int i) {
        LIZLLL(i, view, aweme, str, str2, "", "", "");
    }

    public static void LIZJ(int i, String str, String str2, AbstractC49253JUr abstractC49253JUr, int i2, String str3) {
        JHJ jhj = new JHJ();
        jhj.setOrder(i);
        jhj.setSearchKeyword(str);
        jhj.setRid(str2);
        jhj.setEnterFrom(LIZ(i2));
        jhj.setEnterMethod(str3);
        jhj.installToMetrics(abstractC49253JUr);
        abstractC49253JUr.LJIILIIL();
    }

    public static void LIZLLL(final int i, final View view, final Aweme aweme, final String str, final String str2, final String str3, final String str4, final String str5) {
        if (!str.equals("general_search") && !str.equals("search_result") && !str.equals("ecommerce")) {
            return;
        }
        C49503Jbn.LIZ(view, aweme.getAid(), i, null);
        C10K.LIZIZ(new Callable() { // from class: X.JN6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String LJIIZILJ;
                String str6;
                String str7;
                List<PhotoModeImageUrlModel> imageList;
                JIB LJIIJ;
                String str8 = str;
                Aweme aweme2 = aweme;
                View view2 = view;
                String str9 = str2;
                int i2 = i;
                String str10 = str3;
                String str11 = str4;
                String str12 = str5;
                if (str8.equals("general_search")) {
                    LJIIZILJ = C49503Jbn.LIZIZ();
                } else {
                    LJIIZILJ = C227768wm.LJIIZILJ(aweme2);
                }
                C50652JuK.Companion.getClass();
                C50650JuI LIZJ = C50651JuJ.LIZJ();
                if (LIZJ != null) {
                    str6 = LIZJ.getSearchVideoModel().getGroupId();
                } else {
                    str6 = "";
                }
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("request_id", C227768wm.LJIIZILJ(aweme2));
                MobClick obtain = MobClick.obtain();
                obtain.setEventName("feed_enter");
                obtain.setLabelName(str8);
                obtain.setValue(aweme2.getAid());
                obtain.setJsonObject(c198517qh.LJ());
                FMX.onEvent(obtain);
                if (view2 != null && (LJIIJ = C1DF.LJIIJ(view2)) != null) {
                    str7 = C49603JdP.LJFF(LJIIJ.LIZ());
                } else {
                    str7 = null;
                }
                JN7 jn7 = new JN7(JY2.LIZ(view2));
                jn7.LJJIJ(aweme2);
                jn7.LJIJI(str8);
                jn7.LJIIZILJ("group_id", C227768wm.LIZIZ(aweme2));
                jn7.LJIIZILJ("search_keyword", str9);
                jn7.LJIJ("search_result_id", C227768wm.LIZIZ(aweme2));
                jn7.LJIIZILJ("author_id", aweme2.getAuthorUid());
                jn7.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(LJIIZILJ));
                jn7.LJIIZILJ("search_id", LJIIZILJ);
                jn7.LJJI(Integer.valueOf(i2));
                jn7.LIZ(K02.LIZIZ("feed_enter", aweme2, str8));
                jn7.LJIIZILJ("click_times", str7);
                if (!TextUtils.isEmpty(str10)) {
                    jn7.LJJII(str10);
                }
                if (!TextUtils.isEmpty(str11)) {
                    jn7.LJIIZILJ("list_item_id", str11);
                }
                if (!TextUtils.isEmpty(LJIIZILJ)) {
                    jn7.LJJIFFI(LJIIZILJ);
                    jn7.LJIIZILJ("impr_id", LJIIZILJ);
                }
                if (!TextUtils.isEmpty(str12)) {
                    jn7.LJIJJ(str12);
                }
                if ("search_result".equals(str8) || "general_search".equals(str8)) {
                    jn7.LJIIZILJ("last_from_group_id", str6);
                }
                jn7.LJIL(Integer.valueOf(aweme2.getAwemeType()));
                if (aweme2.getPhotoModeImageInfo() != null && (imageList = aweme2.getPhotoModeImageInfo().getImageList()) != null) {
                    jn7.LJJ(Integer.valueOf(imageList.size()));
                }
                if (aweme2.getVideo() != null && aweme2.getVideo().getVideoTag() != null && EnumC191797fr.POI_DISTANCE.getType().equals(aweme2.getVideo().getVideoTag().getType())) {
                    jn7.LJIIZILJ("video_tag", "distance");
                }
                jn7.LJIILIIL();
                return null;
            }
        }, C38995FSd.LIZIZ(), null);
    }
}
