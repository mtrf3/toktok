package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.8wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227768wm {
    public static int LIZ(Aweme aweme) {
        if (aweme == null || aweme.getPhotoModeImageInfo() == null || aweme.getPhotoModeImageInfo().getTitle() == null || aweme.getPhotoModeImageInfo().getTitle().isEmpty()) {
            return 0;
        }
        return 1;
    }

    public static String LIZIZ(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    public static String LIZJ(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        return aweme.getAuthor().getUid();
    }

    public static String LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJ(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "photo";
        }
        if (aweme.isLive()) {
            return "live";
        }
        return "video";
    }

    public static String LJFF(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getDistributeType() == 1) {
            return "short";
        }
        if (aweme.getDistributeType() == 2) {
            return "long_direct";
        }
        if (aweme.getDistributeType() != 3) {
            return "";
        }
        return "long_with_short";
    }

    public static String LJI(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return aweme.getAuthorUid();
        }
        if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return aweme.getRepostFromUserId();
        }
        return aweme.getAuthorUid();
    }

    public static String LJII(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme() || !TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return "repost";
        }
        return "item";
    }

    public static String LJIIIIZZ(Aweme aweme) {
        if (!HG3.LJIILL().isLogin() || aweme == null || aweme.getAuthor() == null || AV1.LJIJ(aweme.getAuthor())) {
            return "";
        }
        return String.valueOf(aweme.getFollowStatus());
    }

    public static String LJIIIZ(String str) {
        return C3A5.LIZ.LIZIZ(LJIILLIIL(0, str));
    }

    public static Long LJIIJ(Aweme aweme) {
        long j = 0;
        if (aweme == null) {
            return 0L;
        }
        if (aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) {
            return 0L;
        }
        if (aweme.getMusic() != null) {
            j = aweme.getMusic().getId();
        }
        return Long.valueOf(j);
    }

    public static String LJIIJJI(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if ((aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) || aweme.getMusic() == null) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aweme.getMusic().getId());
        LIZ.append("");
        return X1D.LIZIZ(LIZ);
    }

    public static int LJIILIIL(Aweme aweme) {
        if (aweme != null && aweme.getPhotoModeImageInfo() != null && aweme.getPhotoModeImageInfo().getImageList() != null) {
            return aweme.getPhotoModeImageInfo().getImageList().size();
        }
        return 0;
    }

    public static String LJIILJJIL(Aweme aweme) {
        if (C188587ag.LJFF(aweme)) {
            return "";
        }
        return C188587ag.LIZLLL(aweme);
    }

    public static String LJIIZILJ(Aweme aweme) {
        if (aweme == null || aweme.getRequestId() == null) {
            return "";
        }
        return aweme.getRequestId();
    }

    public static String LJIJ(User user) {
        if (user == null) {
            return "";
        }
        if (user.getFollowStatus() == 2) {
            return "2";
        }
        if (user.getFollowStatus() == 1) {
            return "1";
        }
        if (user.getFollowerStatus() == 1) {
            return "3";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJIJI(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getStickerEntranceInfo() != null && !TextUtils.isEmpty(aweme.getStickerEntranceInfo().id)) {
            return aweme.getStickerEntranceInfo().id;
        }
        if (aweme.getAnchorInfo() == null || aweme.getAnchorInfo().getType().intValue() != 1002 || TextUtils.isEmpty(aweme.getAnchorInfo().getId())) {
            return "";
        }
        return aweme.getAnchorInfo().getId();
    }

    public static int LJIJJ(Aweme aweme) {
        if (aweme == null) {
            return 0;
        }
        if (aweme.getAwemeType() != 160) {
            if (aweme.getAwemeType() != 40 || aweme.getStoryType() != 2) {
                return 0;
            }
            return 1;
        }
        return 1;
    }

    public static HashMap<String, String> LJIJJLI(Aweme aweme) {
        int i;
        int i2;
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder LIZ = X1D.LIZ();
        int i3 = 0;
        if (aweme != null && aweme.getPhotoModeImageInfo() != null && !TextUtils.isEmpty(aweme.getPhotoModeImageInfo().getTitle())) {
            i = aweme.getPhotoModeImageInfo().getTitle().length();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append("");
        hashMap.put("title_length", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        if (aweme != null && !TextUtils.isEmpty(aweme.getDesc())) {
            i2 = aweme.getDesc().length();
        } else {
            i2 = 0;
        }
        LIZ2.append(i2);
        LIZ2.append("");
        hashMap.put("description_length", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        if (aweme != null && !TextUtils.isEmpty(aweme.getDesc())) {
            String originalString = aweme.getDesc();
            o.LJIIIZ(originalString, "originalString");
            i3 = s.LJZI(((OJD) C227798wp.LIZIZ.getValue()).replace(((OJD) C227798wp.LIZ.getValue()).replace(originalString, ""), " ")).toString().length();
        }
        LIZ3.append(i3);
        LIZ3.append("");
        hashMap.put("no_hashtag_description_length", X1D.LIZIZ(LIZ3));
        return hashMap;
    }

    public static String LJIL(User user) {
        if (user == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if (user.getFollowerCount() >= 1000) {
            arrayList.add("creator");
        }
        if (user.getAccountType() == 3) {
            arrayList.add("ttba");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) ListProtector.get(arrayList, i));
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static boolean LJJ(Aweme aweme) {
        Video video = aweme.getVideo();
        if (video == null || video.getFakeLandscapeInfo() == null) {
            return false;
        }
        FakeLandscapeInfo fakeLandscapeInfo = video.getFakeLandscapeInfo();
        if (!fakeLandscapeInfo.isValid()) {
            return false;
        }
        if (((fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft()) * video.getWidth()) / ((fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop()) * video.getHeight()) < C227788wo.LIZ) {
            return false;
        }
        return true;
    }

    public static boolean LJJI(String str) {
        return TextUtils.equals("challenge", str);
    }

    public static boolean LJJIFFI(String str) {
        return TextUtils.equals("homepage_familiar", str);
    }

    public static boolean LJJII(String str) {
        return TextUtils.equals("homepage_follow", str);
    }

    public static boolean LJJIII(Aweme aweme) {
        float f = C227778wn.LIZ;
        if (f != 1.0f) {
            if (aweme != null && aweme.getVideo() != null && (aweme.getVideo().getWidth() * 1.0f) / aweme.getVideo().getHeight() >= f) {
                return true;
            }
            return false;
        }
        if (aweme != null && aweme.getVideo() != null && aweme.getVideo().getWidth() > aweme.getVideo().getHeight()) {
            return true;
        }
        return false;
    }

    public static boolean LJJIIJ(String str) {
        if ("homepage_hot".equals(str) || "homepage_follow".equals(str) || "rec_follow".equals(str) || "homepage_fresh".equals(str) || "general_search".equals(str) || "search_result".equals(str) || "search_sug".equals(str) || "homepage_channel".equals(str) || "others_homepage".equals(str) || "find_friends".equals(str) || "challenge".equalsIgnoreCase(str) || "hot_search_video_board".equals(str) || "homepage_country".equals(str) || "homepage_friends".equals(str) || "personal_homepage".equals(str) || "playlist".equals(str) || "homepage_fresh_feed".equalsIgnoreCase(str) || "like_list".equals(str) || "homepage_familiar".equals(str) || "homepage_explore".equals(str) || TextUtils.equals("discovery_category", str) || "homepage_nearby".equals(str) || "compilation_detail".equals(str) || "collection_video".equals(str) || "single_song".equals(str) || "playlist".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean LJJIIJZLJL(Aweme aweme) {
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (aweme != null && TextUtils.equals(aweme.getAuthorUid(), LJFF.getCurUserId())) {
            return true;
        }
        return false;
    }

    public static JSONObject LJJIIZ(java.util.Map<String, Object> map) {
        Object LIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            HashMap hashMap = (HashMap) map;
            for (String str : hashMap.keySet()) {
                try {
                    Object obj = hashMap.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            try {
                                LIZIZ = new JSONObject(str2);
                            } catch (JSONException unused) {
                                LIZIZ = C3A5.LIZ.LIZIZ(str2);
                            }
                            jSONObject.put(str, LIZIZ);
                        }
                    } else {
                        jSONObject.put(str, obj);
                    }
                } catch (JSONException e) {
                    C36922EeM.LJFF(e);
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject LJJIIZI(java.util.Map<String, String> map) {
        Object LIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            HashMap hashMap = (HashMap) map;
            for (String str : hashMap.keySet()) {
                try {
                    String str2 = (String) hashMap.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        try {
                            LIZIZ = new JSONObject(str2);
                        } catch (JSONException unused) {
                            LIZIZ = C3A5.LIZ.LIZIZ(str2);
                        }
                        jSONObject.put(str, LIZIZ);
                    } else {
                        jSONObject.put(str, str2);
                    }
                } catch (JSONException e) {
                    C36922EeM.LJFF(e);
                }
            }
        }
        return jSONObject;
    }

    public static String LJIIL(int i, Aweme aweme) {
        JSONObject LIZ = RequestIdService.LJ().LIZ(i, aweme);
        if (LIZ != null) {
            return LIZ.optString("order");
        }
        return "";
    }

    public static String LJIILL(int i, Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return LJIILLIIL(i, aweme.getAid());
    }

    public static String LJIILLIIL(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return RequestIdService.LJ().LIZLLL(KMP.LJ(str, i)).LIZ;
    }
}
