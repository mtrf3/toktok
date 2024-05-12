package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8RC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, java.util.Map map) {
        Object opt;
        if (C78685UuP.LJJJZ(str) && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (C78685UuP.LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public static boolean LIZJ(Aweme aweme, String str) {
        PoiReviewFrequencyControl.ProfilePage profilePage;
        PoiReviewFrequencyControl.Frequency frequency;
        PoiReviewFrequencyControl.ProfilePage profilePage2;
        PoiReviewFrequencyControl.Frequency frequency2;
        if (str != null && o.LJ(str, "personal_homepage") && PoiServiceImpl.LIZIZ().LJI() && o.LJ(((RBX) HG3.LJIILL()).getCurUserId(), aweme.getAuthorUid()) && !aweme.isAd() && aweme.getAwemeRawAd() == null) {
            C51556KLg.LIZ.getClass();
            if (!C51556KLg.LIZ().enable()) {
                return false;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if ((commerceVideoAuthInfo == null || !commerceVideoAuthInfo.isPreventSelfSee()) && aweme.getStarAtlasOrderId() <= 0) {
                PoiAnchorData.Companion.getClass();
                PoiAnchorData LIZ2 = C191867fy.LIZ(aweme);
                if (LIZ2 == null) {
                    return false;
                }
                PoiReviewFrequencyControl poiReviewFrequencyControl = PoiReviewFrequencyControl.LIZ;
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                poiReviewFrequencyControl.getClass();
                PoiReviewFrequencyControl.InnerConfig LIZ3 = PoiReviewFrequencyControl.LIZ();
                if (LIZ3 != null && (profilePage = LIZ3.profilePage) != null && (frequency = profilePage.video) != null) {
                    int i = frequency.frequencyDay;
                    int i2 = frequency.frequencyTimes;
                    String LIZIZ = PoiReviewFrequencyControl.LIZIZ("ts_profile_banner_close", aid);
                    Keva keva = PoiReviewFrequencyControl.LIZIZ;
                    if (System.currentTimeMillis() - keva.getLong(LIZIZ, 0L) <= i * 24 * 60 * 60 * 1000 && keva.getInt(PoiReviewFrequencyControl.LIZIZ("count_profile_banner_close", aid), 0) >= i2) {
                        return false;
                    }
                }
                String poiId = LIZ2.getPoiId();
                o.LJIIIZ(poiId, "poiId");
                PoiReviewFrequencyControl.InnerConfig LIZ4 = PoiReviewFrequencyControl.LIZ();
                if (LIZ4 != null && (profilePage2 = LIZ4.profilePage) != null && (frequency2 = profilePage2.poi) != null) {
                    int i3 = frequency2.frequencyDay;
                    int i4 = frequency2.frequencyTimes;
                    String LIZIZ2 = PoiReviewFrequencyControl.LIZIZ("ts_profile_banner_with_same_poi", poiId);
                    Keva keva2 = PoiReviewFrequencyControl.LIZIZ;
                    if (System.currentTimeMillis() - keva2.getLong(LIZIZ2, 0L) <= i3 * 24 * 60 * 60 * 1000 && keva2.getInt(PoiReviewFrequencyControl.LIZIZ("count_profile_banner_with_same_poi", poiId), 0) >= i4) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(int i, String str, String str2, String str3, String str4, String str5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        linkedHashMap.put("enter_method", "poi_review_toast");
        if (str2 != null) {
            linkedHashMap.put("poi_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("group_id", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("author_id", str4);
        }
        if (str5 != null) {
            LIZ(str5, linkedHashMap);
        }
        linkedHashMap.put("is_enter", String.valueOf(i));
        FMX.LJIIL("poi_review_post_entrance_click", linkedHashMap);
    }
}
