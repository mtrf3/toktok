package X;

import Y.ARunnableS14S0400000_10;
import Y.ARunnableS6S0201000_3;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IntelligenceModuleImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.AwemeContextServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAwemeContextService;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NN1 {
    public static final List<String> LIZ = Arrays.asList("pause", "resume", "skip", "click", "buffer_start", "buffer_end", "slide", "splash_click", "otherclick");
    public static final List<String> LIZIZ = Arrays.asList("draw_ad", "result_ad");
    public static final List<String> LIZJ = Arrays.asList("click", "otherclick", "music_click");

    public static java.util.Map<String, Object> LJIILL() {
        long LJI = NQL.LJIILL().LJI();
        int i = NQL.LJIILL().LJIIIZ + 1;
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(LJI));
        hashMap.put("play_order", Integer.valueOf(i));
        return hashMap;
    }

    public static HashMap<String, String> LIZ(Aweme aweme) {
        if (aweme.getPromotion() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", aweme.getPromotion().getPromotionId());
            hashMap2.put("commodity_type", Integer.valueOf(aweme.getPromotion().getPromotionSource()));
            hashMap.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap2));
            return hashMap;
        }
        return null;
    }

    public static JSONObject LIZLLL(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("launchduration", Long.valueOf(j));
            jSONObject.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        return jSONObject;
    }

    public static java.util.Map<String, String> LJ(int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_order", Integer.valueOf(i));
        hashMap.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap2));
        return hashMap;
    }

    public static java.util.Map<String, String> LJFF(java.util.Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
        return hashMap;
    }

    public static String LJI(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() != null && aweme.getRoomFeedCellStruct().getNewLiveRoomData() != null) {
                return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
            }
        } else if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
            return String.valueOf(aweme.getAuthor().getUid());
        }
        return null;
    }

    public static String LJII(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return String.valueOf(creativeId);
    }

    public static long LJIILJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Long groupId;
        if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (groupId = awemeRawAd.getGroupId()) == null) {
            return 0L;
        }
        return groupId.longValue();
    }

    public static String LJIIZILJ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() != null && aweme.getRoomFeedCellStruct().getNewLiveRoomData() != null) {
                return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().id);
            }
        } else if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
            return String.valueOf(aweme.getAuthor().roomId);
        }
        return null;
    }

    public static JSONObject LJIIIZ(Context context, Aweme aweme) {
        return LJIIL(context, aweme, false, null);
    }

    public static boolean LJIJ(Context context, Aweme aweme) {
        if (context == null || aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:14|(24:16|(2:18|(1:20))(1:70)|21|(1:23)|24|(1:26)(1:69)|27|28|(1:30)|32|33|34|(1:36)(1:64)|37|(1:39)|40|41|(1:43)(1:62)|44|(1:61)|46|(1:48)(1:60)|49|(2:58|59)(2:53|(2:55|56)(1:57)))|71|21|(0)|24|(0)(0)|27|28|(0)|32|33|34|(0)(0)|37|(0)|40|41|(0)(0)|44|(0)|46|(0)(0)|49|(1:51)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0060, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[Catch: Exception -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:28:0x0051, B:30:0x0059), top: B:27:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: Exception -> 0x008b, TryCatch #1 {Exception -> 0x008b, blocks: (B:34:0x0065, B:36:0x006b, B:37:0x0074, B:39:0x0078, B:40:0x007d, B:64:0x0085), top: B:33:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078 A[Catch: Exception -> 0x008b, TryCatch #1 {Exception -> 0x008b, blocks: (B:34:0x0065, B:36:0x006b, B:37:0x0074, B:39:0x0078, B:40:0x007d, B:64:0x0085), top: B:33:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0085 A[Catch: Exception -> 0x008b, TRY_LEAVE, TryCatch #1 {Exception -> 0x008b, blocks: (B:34:0x0065, B:36:0x006b, B:37:0x0074, B:39:0x0078, B:40:0x007d, B:64:0x0085), top: B:33:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(android.content.Context r13, X.NN0 r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NN1.LJIJI(android.content.Context, X.NN0):void");
    }

    public static void LJJ(Context context, Aweme aweme) {
        LJJJJ(context, "replay", aweme, LJIIJ(context, aweme, "button"));
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            O8Z.LIZ("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
            C58655N0h LIZLLL = C58704N2e.LIZLLL("background_ad", "replay", aweme.getAwemeRawAd());
            LIZLLL.LIZJ("button", "refer");
            LIZLLL.LIZIZ(0, "is_lynx");
            LIZLLL.LJII();
        }
    }

    public static void LJJIJ(Context context, final Aweme aweme) {
        Object obj;
        Object obj2;
        JSONObject jSONObject;
        OmVast omVast;
        C59255NNj c59255NNj;
        java.util.Set<String> set;
        int i;
        if (aweme == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String LJJJJZ = C63081OpJ.LJJJJZ(aweme);
        if (C63081OpJ.LLIIII(aweme)) {
            HashMap hashMap2 = new HashMap();
            if (!AnonymousClass906.LJ) {
                i = 2;
            } else {
                i = 1;
            }
            if (!TextUtils.isEmpty(C55511LqV.LJFF)) {
                hashMap2.put("splash_req_id", C55511LqV.LJFF);
                C55511LqV.LJFF = null;
            }
            hashMap2.put("awemelaunch", String.valueOf(i));
            ISplashAdService LJJI = SplashAdServiceImpl.LJJI();
            if (LJJI != null) {
                hashMap2.put("ad_sequence", Integer.valueOf(LJJI.LJIILIIL()));
            }
            hashMap.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap2));
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(String.valueOf(i), "awemelaunch");
            LIZLLL.LIZ(hashMap2);
            if (aweme.getAwemeRawAd().isReshowAd()) {
                LIZLLL.LIZIZ(1, "is_reshow");
            }
            if (!TextUtils.isEmpty(LJJJJZ)) {
                try {
                    LIZLLL.LIZJ(Integer.valueOf(CastIntegerProtector.parseInt(LJJJJZ)), "study_id");
                } catch (NumberFormatException e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
            LIZLLL.LIZIZ(C55499LqJ.LIZIZ(((RBX) HG3.LJIILL()).getCurUserId()), "user_session");
            LIZLLL.LIZIZ(C55499LqJ.LIZ(aweme.getAid()), "impression_frequency");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                LIZLLL.LIZ(awemeRawAd.removeReusableExtraParams());
            }
            LIZLLL.LJII();
        } else if (aweme.isAd() || C63081OpJ.LLF(aweme)) {
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show", aweme.getAwemeRawAd());
            if (C63081OpJ.LJJJJ("draw_ad", aweme, "show") != null) {
                LIZLLL2 = C63081OpJ.LJJJJ("draw_ad", aweme, "show");
            }
            LIZLLL2.LIZIZ(LJI(aweme), "anchor_id");
            LIZLLL2.LIZIZ(LJIIZILJ(aweme), "room_id");
            if (aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().isReshowAd()) {
                LIZLLL2.LIZIZ(1, "is_reshow");
            }
            if (!TextUtils.isEmpty(LJJJJZ)) {
                try {
                    LIZLLL2.LIZJ(Integer.valueOf(CastIntegerProtector.parseInt(LJJJJZ)), "study_id");
                } catch (NumberFormatException e2) {
                    C78983UzD.LJIIZILJ(e2);
                }
            }
            if (C63081OpJ.LJZL(aweme)) {
                LIZLLL2.LIZJ("image", "refer");
            }
            if (C59111NHv.LIZLLL(aweme)) {
                LIZLLL2.LIZ(C59111NHv.LIZIZ(aweme));
            }
            LIZLLL2.LIZIZ(C55499LqJ.LIZIZ(((RBX) HG3.LJIILL()).getCurUserId()), "user_session");
            LIZLLL2.LIZIZ(C55499LqJ.LIZ(aweme.getAid()), "impression_frequency");
            if (C63081OpJ.LJJLIL(aweme)) {
                String str = "live";
                if (aweme.isLive()) {
                    obj = "live";
                } else {
                    obj = "video";
                }
                LIZLLL2.LIZIZ(obj, "content_type");
                LIZLLL2.LIZIZ(LJIIZILJ(aweme), "room_id");
                LIZLLL2.LIZIZ(aweme.getAid(), "item_id");
                IAwemeContextService LJ = AwemeContextServiceImpl.LJ();
                if (LJ != null && LJ.LIZLLL(aweme.getAid())) {
                    Aweme LIZ2 = LJ.LIZ();
                    if (LIZ2 != null) {
                        if (LIZ2.isLive()) {
                            obj2 = "live";
                        } else {
                            obj2 = "video";
                        }
                        LIZLLL2.LIZIZ(obj2, "before_content_type");
                        LIZLLL2.LIZIZ(LJIIZILJ(LIZ2), "before_room_id");
                        LIZLLL2.LIZIZ(LIZ2.getAid(), "before_item_id");
                    }
                    Aweme LIZJ2 = LJ.LIZJ();
                    if (LIZJ2 != null) {
                        if (!LIZJ2.isLive()) {
                            str = "video";
                        }
                        LIZLLL2.LIZIZ(str, "after_content_type");
                        LIZLLL2.LIZIZ(LJIIZILJ(LIZJ2), "after_room_id");
                        LIZLLL2.LIZIZ(LIZJ2.getAid(), "after_item_id");
                    }
                }
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                LIZLLL2.LIZ(awemeRawAd2.removeReusableExtraParams());
            }
            LIZLLL2.LJII();
        }
        JSONObject LJIIL = LJIIL(context, aweme, false, hashMap);
        if (!TextUtils.isEmpty(LJJJJZ)) {
            try {
                LJIIL.put("study_id", CastIntegerProtector.parseInt(LJJJJZ));
            } catch (Exception e3) {
                C78983UzD.LJIIZILJ(e3);
            }
        }
        LJJJJI(context, "show", aweme, LJIIL);
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            if (C51924KZk.LIZ) {
                C38995FSd.LIZIZ().execute(new ARunnableS6S0201000_3(1, awemeRawAd3, aweme, 5));
            } else {
                O8Z.LIZ("show", awemeRawAd3.getTrackUrlList(), awemeRawAd3.getCreativeId(), awemeRawAd3.getLogExtra());
            }
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null && (omVast = awemeRawAd4.getOmVast()) != null && (c59255NNj = omVast.vast) != null && (set = c59255NNj.impressionSet) != null) {
            C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(ORZ.LJLIIIL(set), C59162Tw.LJLIL));
            while (c115524g8.hasNext()) {
                final String it = (String) c115524g8.next();
                final long currentTimeMillis = System.currentTimeMillis();
                o.LJIIIIZZ(it, "it");
                RawURLGetter.LIZIZ(it, new N96() { // from class: X.35P
                    @Override // X.N96
                    public final void LIZ(int i2, Exception exc, boolean z) {
                        String str2;
                        if (!z) {
                            C59127NIl LIZ3 = C59128NIm.LIZ();
                            LIZ3.LJ(Aweme.this);
                            LIZ3.LIZ = "draw_ad";
                            LIZ3.LIZIZ = "load_failed";
                            OSZ[] oszArr = new OSZ[3];
                            oszArr[0] = new OSZ("error_message", "vast_imp_tracker_bad_response");
                            oszArr[1] = new OSZ("error_code", Integer.valueOf(i2));
                            String str3 = null;
                            if (exc != null) {
                                str2 = exc.getMessage();
                            } else {
                                str2 = null;
                            }
                            oszArr[2] = new OSZ("error_detail", str2);
                            LIZ3.LIZ(C113554cx.LJJL(oszArr));
                            LIZ3.LJIIIZ(null);
                            C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "load_failed", Aweme.this.getAwemeRawAd());
                            LIZLLL3.LIZIZ("vast_imp_tracker_bad_response", "error_message");
                            LIZLLL3.LIZIZ(Integer.valueOf(i2), "error_code");
                            if (exc != null) {
                                str3 = exc.getMessage();
                            }
                            LIZLLL3.LIZIZ(str3, "error_detail");
                            LIZLLL3.LJII();
                        }
                        C59252NNg.LJIIIZ(it, String.valueOf(i2), currentTimeMillis, "show", Aweme.this, null, 32);
                    }
                });
            }
        }
        JSONObject LJIIIZ = LJIIIZ(context, aweme);
        try {
            new com.google.gson.o();
            m LJIIZILJ = com.google.gson.o.LIZ(JSONObjectProtectorUtils.getString(LJIIIZ, "log_extra")).LJIIZILJ();
            jSONObject = new JSONObject();
            if (LJIIZILJ.LJJIJ("rit") != null) {
                jSONObject.put("ctr_rit", LJIIZILJ.LJJIJ("rit").LJJIFFI());
            }
        } catch (Exception e4) {
            C78983UzD.LJIIZILJ(e4);
            jSONObject = null;
        }
        C8HX.LIZIZ("ctr_monitor", "ctr_show", jSONObject);
    }

    public static void LJJIJIIJI(Context context, Aweme aweme) {
        LJJIJIIJIL(context, aweme, "");
    }

    public static void LJJIJIL(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("render_type", "lynx");
        LJJJJI(context, "open_url_h5", aweme, LJIIL(context, aweme, false, LJFF(hashMap)));
    }

    public static void LJJIJL(Context context, Aweme aweme) {
        LJJJJJ(context, "click_redpacket", aweme, LJIIIZ(context, aweme));
    }

    public static void LJJIJLIJ(Context context, Aweme aweme) {
        LJJJJJ(context, "click_button", aweme, LJIIIZ(context, aweme));
    }

    public static void LJJIZ(Context context, Aweme aweme) {
        C59127NIl LIZ2 = C59128NIm.LIZ();
        LIZ2.LIZ = "homepage_ad";
        LIZ2.LIZIZ = "resume";
        LIZ2.LJ(aweme);
        LIZ2.LJIIIZ(context);
        if (aweme != null) {
            C58704N2e.LIZLLL("homepage_ad", "resume", aweme.getAwemeRawAd()).LJII();
        }
    }

    public static void LJJJJLI(Aweme aweme, java.util.Map map) {
        if (O5Y.LJJJIL(aweme)) {
            if (SearchAdMainService.LJIIJJI().LIZLLL()) {
                ((HashMap) map).put("single_column_switch", 1);
            }
            if (NPC.LJIIIIZZ()) {
                ((HashMap) map).put("is_single", 1);
            }
            if (SearchAdMainService.LJIIJJI().LJ()) {
                HashMap hashMap = (HashMap) map;
                hashMap.put("is_inner", 1);
                hashMap.put("inner_g_pos", Integer.valueOf(SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIJ(aweme)));
            }
        }
    }

    public static JSONObject LJIIJ(Context context, Aweme aweme, String str) {
        JSONObject LJIIL = LJIIL(context, aweme, false, null);
        try {
            if (!TextUtils.isEmpty(str)) {
                LJIIL.put("refer", str);
            }
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        return LJIIL;
    }

    public static JSONObject LJIIJJI(Context context, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJ(context, aweme)) {
            return jSONObject;
        }
        try {
            LJJJJL(context, aweme.getAwemeRawAd().getLogExtra(), jSONObject);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LIZ(e);
        }
        return jSONObject;
    }

    public static void LJIL(Context context, Aweme aweme, java.util.Map<String, String> map) {
        JSONObject LJIIL = LJIIL(context, aweme, true, map);
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", LJI(aweme));
        hashMap.put("room_id", LJIIZILJ(aweme));
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            hashMap.put("pack_content_type", aweme.getAwemeRawAd().getType());
        }
        LJJJJLI(aweme, hashMap);
        if (aweme.isAd() && !C63081OpJ.LLIIII(aweme) && !O5Y.LJJJIL(aweme) && aweme.getAwemeRawAd().getRollType() != 1) {
            LJJJJLL(System.currentTimeMillis(), aweme.getAwemeRawAd().getCreativeIdStr(), hashMap);
        }
        try {
            LJIIL.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        LJJJJ(context, "click", aweme, LJIIL);
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            O8Z.LIZ("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        }
        ((HashMap) map).get("refer");
    }

    public static void LJJI(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("playervol", Float.valueOf(0.0f));
        hashMap.put("play_order", Integer.valueOf(i));
        LJJJJI(context, "mute", aweme, LJIIL(context, aweme, false, LJFF(hashMap)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        if (r4 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(android.content.Context r5, com.ss.android.ugc.aweme.feed.model.Aweme r6, int r7) {
        /*
            android.content.Context r1 = X.C16880lQ.LLLLL(r5)
            java.lang.String r0 = "audio"
            java.lang.Object r4 = X.C16880lQ.LLILL(r1, r0)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2 = -1
            r1 = 3
            if (r4 == 0) goto L2d
            int r0 = r4.getStreamVolume(r1)     // Catch: java.lang.Exception -> L1a
            goto L21
        L1a:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            r0 = -1
            if (r4 == 0) goto L25
        L21:
            int r2 = X.C16880lQ.LLLLLLZZ(r4, r1)
        L25:
            if (r0 <= 0) goto L2d
            if (r2 <= 0) goto L2d
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            goto L2e
        L2d:
            r1 = 0
        L2e:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            float r2 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r2 = r2 * r0
            java.lang.String r1 = "playervol"
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.put(r1, r0)
            java.lang.String r1 = "play_order"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.put(r1, r0)
            java.util.Map r1 = LJFF(r3)
            r0 = 0
            org.json.JSONObject r1 = LJIIL(r5, r6, r0, r1)
            java.lang.String r0 = "unmute"
            LJJJJI(r5, r0, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NN1.LJJIFFI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public static void LJJIII(Context context, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        String str2;
        JSONObject LJIIL = LJIIL(context, aweme, true, null);
        if (str != null) {
            try {
                LJIIL.put("refer", str);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", LJI(aweme));
        hashMap.put("room_id", LJIIZILJ(aweme));
        LJJJJLI(aweme, hashMap);
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            hashMap.put("charge_type", Integer.valueOf(aweme.getAwemeRawAd().getChargeType()));
            hashMap.put("system_origin", Integer.valueOf(aweme.getAwemeRawAd().getSystemOrigin()));
            hashMap.put("pack_content_type", aweme.getAwemeRawAd().getType());
        }
        IAdPhotoModeService LIZ2 = AdPhotoModeServiceImpl.LIZ();
        long currentTimeMillis = System.currentTimeMillis();
        if (C63081OpJ.LJZL(aweme) && LIZ2 != null && (TextUtils.equals(str, "button") || TextUtils.equals(str, "name") || TextUtils.equals(str, "title") || TextUtils.equals(str, "photo") || TextUtils.equals(str, "slide"))) {
            int e1 = LIZ2.e1();
            hashMap.put("image_location", Integer.valueOf(e1 + 1));
            if (aweme.getPhotoModeImageInfo() != null && aweme.getPhotoModeImageInfo().getImageList() != null && e1 >= 0 && e1 < aweme.getPhotoModeImageInfo().getImageList().size()) {
                hashMap.put("image_id", ((PhotoModeImageUrlModel) ListProtector.get(aweme.getPhotoModeImageInfo().getImageList(), e1)).getDisplayImageNoWatermark().getUri());
            }
            hashMap.put("image_show_count", LIZ2.i1(e1));
            if (aweme.getPhotoModeImageInfo() != null && aweme.getPhotoModeImageInfo().getImageList() != null) {
                hashMap.put("image_cnt", Integer.valueOf(aweme.getPhotoModeImageInfo().getImageList().size()));
            }
            hashMap.put("enter_method", LIZ2.getEnterMethod());
            hashMap.put("first_slide_duration", Long.valueOf(currentTimeMillis - LIZ2.k1()));
            if (str != null && str.equals("button") && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && photoCarouselInfo.getEnableMultiCTAJump()) {
                List<PhotoCarouselProductStruct> productList = aweme.getAwemeRawAd().getPhotoCarouselInfo().getProductList();
                if (productList != null && !productList.isEmpty() && e1 < productList.size()) {
                    str2 = ((PhotoCarouselProductStruct) ListProtector.get(productList, e1)).getProductId();
                } else {
                    str2 = "";
                }
                hashMap.put("product_id", str2);
            }
        }
        if (aweme.isAd() && !C63081OpJ.LLIIII(aweme) && !O5Y.LJJJIL(aweme) && aweme.getAwemeRawAd().getRollType() != 1) {
            LJJJJLL(currentTimeMillis, aweme.getAwemeRawAd().getCreativeIdStr(), hashMap);
        }
        if (str != null) {
            if (str.equals("button")) {
                hashMap.put("is_lynx", 0);
                hashMap.put("button_type", 2);
            }
            if (str.equals("slide")) {
                hashMap.put("is_under_guide", Integer.valueOf(LPR.LIZ ? 1 : 0));
            }
        }
        try {
            LJIIL.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
        } catch (JSONException e2) {
            C78983UzD.LJIIZILJ(e2);
        }
        LJJJJI(context, "click", aweme, LJIIL);
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            O8Z.LIZ("click", awemeRawAd2.getClickTrackUrlList(), awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra());
        }
    }

    public static void LJJIIJ(Context context, AwemeRawAd awemeRawAd, String str) {
        JSONObject LJIILIIL = LJIILIIL(context, awemeRawAd, true, null);
        if (str != null) {
            try {
                LJIILIIL.put("refer", str);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        LJJJJJL(context, awemeRawAd, "draw_ad", "click", LJIILIIL);
        O8Z.LIZ("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
    }

    public static void LJJIIJZLJL(Context context, Aweme aweme, FollowStatus followStatus) {
        int i;
        HashMap hashMap = new HashMap();
        if (C63081OpJ.LJLJL(aweme)) {
            int i2 = 1;
            if (followStatus != null && followStatus.isCheating()) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("is_cheated_follow", Integer.valueOf(i));
            if (followStatus != null) {
                i2 = followStatus.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i2));
        }
        hashMap.put("anchor_id", LJI(aweme));
        hashMap.put("room_id", LJIIZILJ(aweme));
        LJJJJI(context, "follow", aweme, LJIIL(context, aweme, false, LJFF(hashMap)));
    }

    public static void LJJIIZ(Context context, Aweme aweme, String str) {
        JSONObject LJIIL = LJIIL(context, aweme, false, null);
        if (!TextUtils.isEmpty(str)) {
            try {
                LJIIL.put("refer", str);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        LJJJJI(context, "otherclick", aweme, LJIIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        if (r3 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZI(android.content.Context r9, com.ss.android.ugc.aweme.feed.model.Aweme r10, int r11) {
        /*
            r1 = 0
            if (r9 != 0) goto La8
        L3:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.String r7 = "play_order"
            r2.put(r7, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.String r6 = "playervol"
            r2.put(r6, r0)
            java.util.Map r0 = LJFF(r2)
            r2 = 0
            org.json.JSONObject r0 = LJIIL(r9, r10, r2, r0)
            java.lang.String r8 = "play"
            LJJJJI(r9, r8, r10, r0)
            boolean r0 = X.C63081OpJ.LJJLIIIJJI(r10)
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r10.getAwemeRawAd()
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r5.getPlayTrackUrlList()
            java.lang.Long r3 = r5.getCreativeId()
            java.lang.String r0 = r5.getLogExtra()
            X.O8Z.LIZ(r8, r4, r3, r0)
            java.lang.String r0 = "draw_ad"
            X.N0h r3 = X.C58704N2e.LIZLLL(r0, r8, r5)
            X.NQL r0 = X.NQL.LJIILL()
            int r0 = r0.LJIIL(r3, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LIZIZ(r0, r7)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.LIZIZ(r0, r6)
            java.lang.String r1 = "anchor_id"
            java.lang.String r0 = LJI(r10)
            r3.LIZIZ(r0, r1)
            java.lang.String r1 = "room_id"
            java.lang.String r0 = LJIIZILJ(r10)
            r3.LIZIZ(r0, r1)
            boolean r0 = X.C55511LqV.LJIIIIZZ(r10)
            if (r0 == 0) goto L88
            boolean r0 = X.C55511LqV.LJ(r10)
            if (r0 == 0) goto L88
            boolean r0 = X.C55511LqV.LJ(r10)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_encrypt"
            r3.LIZIZ(r1, r0)
        L88:
            r3.LJII()
        L8b:
            if (r10 == 0) goto La7
            boolean r0 = r10.isAd()
            if (r0 == 0) goto La7
            X.C58740N3o.LIZ(r10)
            java.util.Map r1 = X.C58740N3o.LIZIZ()
            java.lang.String r0 = "awemeState"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r10, r0)
        La7:
            return
        La8:
            X.Ol8 r0 = X.C52527KjT.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 3
            if (r0 == 0) goto Lbe
            double r2 = X.C47636Imm.LJII(r4)
            float r1 = (float) r2
            goto L3
        Lbe:
            android.content.Context r2 = X.C16880lQ.LLLLL(r9)
            java.lang.String r0 = "audio"
            java.lang.Object r3 = X.C16880lQ.LLILL(r2, r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r2 = -1
            if (r3 == 0) goto Le4
            int r0 = r3.getStreamVolume(r4)     // Catch: java.lang.Exception -> Ld2
            goto Ld9
        Ld2:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            r0 = -1
            if (r3 == 0) goto Ldd
        Ld9:
            int r2 = X.C16880lQ.LLLLLLZZ(r3, r4)
        Ldd:
            if (r0 <= 0) goto Le4
            if (r2 <= 0) goto Le4
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
        Le4:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            float r1 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 * r0
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NN1.LJJIIZI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public static void LJJIJIIJIL(Context context, Aweme aweme, String str) {
        JSONObject LJIIIZ = LJIIIZ(context, aweme);
        if (!TextUtils.isEmpty(str)) {
            try {
                LJIIIZ.put("refer", str);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", LJI(aweme));
        hashMap.put("room_id", LJIIZILJ(aweme));
        try {
            LJIIIZ.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
        } catch (JSONException e2) {
            C78983UzD.LJIIZILJ(e2);
        }
        LJJJJI(context, "slide", aweme, LJIIIZ);
        if (aweme != null) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "slide", aweme.getAwemeRawAd());
            if (C63081OpJ.LJJJJ("draw_ad", aweme, "slide") != null) {
                LIZLLL = C63081OpJ.LJJJJ("draw_ad", aweme, "slide");
            }
            if (LIZLLL != null) {
                LIZLLL.LIZIZ(str, "refer");
                LIZLLL.LIZIZ(LJIIZILJ(aweme), "room_id");
                LIZLLL.LIZIZ(LJI(aweme), "anchor_id");
                LIZLLL.LJII();
            }
        }
        if (C63081OpJ.LJLJL(aweme)) {
            LJJJJI(context, "click", aweme, LJIIIZ(context, aweme));
        }
    }

    public static void LJJIL(Context context, Aweme aweme, String str) {
        JSONObject LJIIL = LJIIL(context, aweme, true, null);
        try {
            if (!TextUtils.isEmpty(str)) {
                LJIIL.put("refer", str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", LJI(aweme));
            hashMap.put("room_id", LJIIZILJ(aweme));
            LJJJJLI(aweme, hashMap);
            if (aweme.isAd() && !C63081OpJ.LLIIII(aweme) && !O5Y.LJJJIL(aweme) && aweme.getAwemeRawAd().getRollType() != 1) {
                LJJJJLL(System.currentTimeMillis(), aweme.getAwemeRawAd().getCreativeIdStr(), hashMap);
            }
            LJIIL.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        LJJJJJ(context, "click", aweme, LJIIL);
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            O8Z.LIZ("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        }
    }

    public static void LJJJ(String str, String str2, JSONObject jSONObject) {
        int i;
        JSONObject jSONObject2;
        int i2;
        if (IEW.LIZLLL && TextUtils.equals(str, "background_ad") && (TextUtils.equals(str2, "otherclick") || TextUtils.equals(str2, "click"))) {
            return;
        }
        if ((TextUtils.equals(str, "draw_ad") && LIZ.contains(str2)) || (N58.LIZIZ.contains(str2) && N58.LIZ.contains(str))) {
            long LJI = NQL.LJIILL().LJI();
            if (IEW.LIZLLL) {
                i = IEW.LIZ();
            } else {
                i = NQL.LJIILL().LJIIIZ;
            }
            int i3 = i + 1;
            if (LJI < 0) {
                if (NQL.LJIILL().LJIILLIIL < 0) {
                    LJI = NQL.LJIILL().LJIL;
                } else {
                    LJI = NQL.LJIILL().LJIILLIIL;
                }
            }
            if (TextUtils.equals(str, "background_ad")) {
                LJI = NQL.LJIILL().LJIIIIZZ();
                if (IEW.LIZLLL) {
                    i2 = IEW.LIZ();
                } else {
                    i2 = NQL.LJIILL().LJIIIZ;
                }
                i3 = (i2 + 1) - 1;
            }
            if (LJI >= 0) {
                try {
                    String optString = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject2 = new JSONObject();
                    } else {
                        jSONObject2 = new JSONObject(optString);
                    }
                    if (!((HashSet) N58.LIZJ).contains(str2)) {
                        jSONObject2.put("duration", LJI);
                    }
                    jSONObject2.put("play_order", i3);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (JSONException e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
        }
    }

    public static void LJJJI(Context context, String str, String str2) {
        IVK LIZJ2;
        if (C46279IEh.LIZ() && (LIZJ2 = MeasurementServiceImpl.LJ().LIZJ()) != null) {
            if (LIZJ2.getAweme() == null || LIZJ2.LIZIZ() == null || !LIZIZ.contains(str) || !LIZJ.contains(str2)) {
                return;
            } else {
                LIZJ2.LIZ(context, LIZJ2.LIZIZ(), LIZJ2.getAweme());
            }
        }
        if (NQL.LJIILL().LJIJ == null || NQL.LJIILL().LJFF() == null || !LIZIZ.contains(str) || !LIZJ.contains(str2)) {
            return;
        }
        if (!C63081OpJ.LJIL(NQL.LJIILL().LJIJ) && ("result_ad".equals(str) || "result_ad_bg".equals(str))) {
            return;
        }
        NQL LJIILL = NQL.LJIILL();
        Aweme aweme = NQL.LJIILL().LJIJ;
        View LJFF = NQL.LJIILL().LJFF();
        if (aweme != null) {
            if (LJIILL.LJIILJJIL) {
                return;
            }
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                C59753Ncj LJIIJ = LJIILL.LJIIJ(context, LJFF, aweme);
                if (LJIIJ == null) {
                    return;
                }
                LJIIJ.LIZ(C99J.CLICK);
                return;
            }
            LJIILL.LJIIJ.post(new ARunnableS14S0400000_10(context, LJFF, LJIILL, aweme, 9));
            return;
        }
        LJIILL.getClass();
    }

    public static JSONObject LJJJJL(Context context, String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("log_extra", str);
        }
        jSONObject.put("is_ad_event", "1");
        String LLJILLL = C16880lQ.LLJILLL(context);
        if (!C38354F3m.LJ(LLJILLL)) {
            jSONObject.put("nt", LLJILLL);
        }
        return jSONObject;
    }

    public static void LJJJJLL(long j, String str, java.util.Map map) {
        AdSessionPositionHelper.LJIILLIIL(j, str);
        HashMap hashMap = (HashMap) map;
        hashMap.put("session_id", AdSessionPositionHelper.LJIIIZ(str));
        hashMap.put("absolute_session_position", Integer.valueOf(AdSessionPositionHelper.LIZ(str)));
        hashMap.put("relative_session_position", Integer.valueOf(AdSessionPositionHelper.LJFF(str)));
        hashMap.put("absolute_session_position_with_cross_tab", Integer.valueOf(AdSessionPositionHelper.LIZIZ(str)));
        hashMap.put("request_index_within_session", Integer.valueOf(AdSessionPositionHelper.LJII(str)));
        if (TextUtils.equals(AdSessionPositionHelper.LIZJ(str), "fyp")) {
            hashMap.put("first_timestamp_of_enter_session", String.valueOf(AdSessionPositionHelper.LIZ));
            hashMap.put("timestamp_of_first_ad_with_show", String.valueOf(AdSessionPositionHelper.LIZIZ));
            hashMap.put("timestamp_of_first_ad_with_click", String.valueOf(AdSessionPositionHelper.LIZJ));
            hashMap.put("last_timestamp_of_ad_with_show", String.valueOf(AdSessionPositionHelper.LJI));
            hashMap.put("last_timestamp_of_ad_with_click", String.valueOf(AdSessionPositionHelper.LJII));
            hashMap.put("last_relative_position_of_ad_with_show", Integer.valueOf(AdSessionPositionHelper.LJ(str)));
            hashMap.put("last_relative_position_of_ad_with_click", Integer.valueOf(AdSessionPositionHelper.LIZLLL(str)));
            hashMap.put("all_relative_position_of_last_request", AdSessionPositionHelper.LJI(str));
        }
        AdSessionPositionHelper.LJIIZILJ(str);
        if (TextUtils.equals(AdSessionPositionHelper.LIZJ(str), "fyp")) {
            AdSessionPositionHelper.LJII = j;
        }
    }

    public static void LIZIZ(Context context, Aweme aweme, OSZ osz, int i) {
        int i2;
        int i3;
        int i4;
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("play_order", Integer.valueOf(LJIILLIIL(hashMap, aweme, i, false)));
        hashMap.put("anchor_id", LJI(aweme));
        hashMap.put("room_id", LJIIZILJ(aweme));
        if (aweme.getAwemeRawAd().isReshowAd()) {
            hashMap.put("is_reshow", 1);
        }
        if (C58740N3o.LJII(aweme)) {
            if ((C58740N3o.LIZJ(C58740N3o.LIZ, aweme) & 1) != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            hashMap.put("is_pre_valid_action", Integer.valueOf(i4));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", osz);
            if (aweme.getVideo() != null) {
                i2 = aweme.getVideo().getVideoLength();
            } else {
                i2 = 0;
            }
            jSONObject.put("video_length", i2);
            if (TextUtils.equals("break", "play_break")) {
                jSONObject.put("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
            }
            long longValue = ((Long) osz.getSecond()).longValue();
            if (NSJ.LIZ().enableFixPlayerEvent && !O5Y.LJJJIL(aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                long longValue2 = ((Long) osz.getSecond()).longValue();
                long j = i2;
                long j2 = -111;
                if (NSJ.LIZ().enableFixPlayerEvent && awemeRawAd != null) {
                    NQK.LIZ = awemeRawAd;
                    String creativeIdStr = awemeRawAd.getCreativeIdStr();
                    if (creativeIdStr != null && !ujb.o.LJJJJJL(creativeIdStr)) {
                        Long remove = NQK.LIZLLL.remove(creativeIdStr);
                        if (remove != null) {
                            j2 = remove.longValue();
                        }
                        if (j2 >= longValue2) {
                            longValue2 = j2;
                        }
                        NQK.LIZ(creativeIdStr, longValue2, j, EnumC53653L3x.VIDEO_BREAK);
                        NQK.LJ(creativeIdStr);
                        NQK.LJ = null;
                        longValue = Math.max(j2, ((Long) osz.getSecond()).longValue());
                    }
                }
                j2 = -111;
                longValue = Math.max(j2, ((Long) osz.getSecond()).longValue());
            }
            if (i2 <= 0 || longValue <= 0) {
                i3 = 0;
            } else {
                i3 = Math.min((int) ((100 * longValue) / i2), 100);
            }
            jSONObject.put("percent", i3);
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "break", aweme.getAwemeRawAd());
            LIZLLL.LIZJ(Long.valueOf(longValue), "duration");
            LIZLLL.LIZJ(Integer.valueOf(i3), "percent");
            String str = null;
            LIZLLL.LIZJ(null, "break_reason");
            LIZLLL.LIZJ(Integer.valueOf(i2), "video_length");
            if (TextUtils.equals("break", "play_break")) {
                str = ((RBX) HG3.LJIILL()).getCurUserId();
            }
            LIZLLL.LIZJ(str, "user_id");
            LIZLLL.LIZ(hashMap);
            LIZLLL.LIZIZ(osz.getSecond(), "player_duration");
            LIZLLL.LIZIZ(osz.getFirst(), "duration_flag");
            LIZLLL.LIZIZ(LJI(aweme), "anchor_id");
            LIZLLL.LIZIZ(LJIIZILJ(aweme), "room_id");
            LIZLLL.LJII();
            C58740N3o.LJ(longValue, aweme);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        LJJJJI(context, "break", aweme, jSONObject);
        C59252NNg.LJIILIIL("pause", aweme, "play_break");
    }

    public static JSONObject LJIIIIZZ(Context context, LinkData linkData, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            LJJJJL(context, linkData.logExtra, jSONObject);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
                jSONObject.put("item_id", str2);
            }
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        return jSONObject;
    }

    public static JSONObject LJIIL(Context context, Aweme aweme, boolean z, java.util.Map map) {
        if (!LJIJ(context, aweme)) {
            return new JSONObject();
        }
        return LJIILIIL(context, aweme.getAwemeRawAd(), z, map);
    }

    public static JSONObject LJIILIIL(Context context, AwemeRawAd awemeRawAd, boolean z, java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            LJJJJL(context, awemeRawAd.getLogExtra(), jSONObject);
            if (z) {
                jSONObject.put("has_v3", "1");
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LIZ(e);
        }
        return jSONObject;
    }

    public static int LJIILLIIL(HashMap<String, Object> hashMap, Aweme aweme, int i, boolean z) {
        if (IEW.LIZIZ(aweme)) {
            int LIZ2 = IEW.LIZ();
            if (!z) {
                LIZ2++;
            }
            hashMap.put("story_video_type", Integer.valueOf(IEW.LIZIZ));
            return LIZ2;
        }
        return i;
    }

    public static void LJJII(Context context, Aweme aweme, String str, java.util.Map<String, Object> map) {
        java.util.Map<String, String> LJFF;
        if (map == null) {
            LJFF = null;
        } else {
            LJFF = LJFF(map);
        }
        JSONObject LJIIL = LJIIL(context, aweme, false, LJFF);
        if (str != null) {
            try {
                LJIIL.put("refer", str);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        LJJJJI(context, "click_source", aweme, LJIIL);
    }

    public static void LJJJIL(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJ(context, aweme)) {
            return;
        }
        LJJJJJL(context, aweme.getAwemeRawAd(), "landing_ad", str, jSONObject);
    }

    public static void LJJJJ(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJ(context, aweme)) {
            return;
        }
        LJJJJJL(context, aweme.getAwemeRawAd(), "background_ad", str, jSONObject);
    }

    public static void LJJJJI(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJ(context, aweme)) {
            return;
        }
        LJJJJJL(context, aweme.getAwemeRawAd(), "draw_ad", str, jSONObject);
    }

    public static void LJJJJJ(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJ(context, aweme)) {
            return;
        }
        LJJJJJL(context, aweme.getAwemeRawAd(), "homepage_ad", str, jSONObject);
    }

    public static void LJIJJ(String str, Context context, LinkData linkData, Aweme aweme, boolean z) {
        LJIJJLI(str, context, linkData, aweme, z, true);
    }

    public static void LJJJJIZL(Context context, String str, String str2, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJ(context, aweme)) {
            return;
        }
        LJJJJJL(context, aweme.getAwemeRawAd(), str, str2, jSONObject);
    }

    public static void LJJJJJL(Context context, final AwemeRawAd awemeRawAd, String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long longValue;
        C59257NNl LIZLLL;
        String str3;
        JSONObject jSONObject3;
        String str4 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            if (TextUtils.equals(str4, "background_ad")) {
                str4 = "background_ads";
            } else {
                str4 = "topic_ads";
            }
        }
        if (TextUtils.equals(str4, "background_ad") && (TextUtils.equals(str2, "click") || TextUtils.equals(str2, "othershow") || TextUtils.equals(str2, "replay"))) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString)) {
                    jSONObject3 = new JSONObject();
                } else {
                    jSONObject3 = new JSONObject(optString);
                }
                jSONObject3.put("is_lynx", 0);
                jSONObject.put("ad_extra_data", jSONObject3.toString());
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        if (TextUtils.equals("click", str2) && (LIZLLL = C59252NNg.LIZLLL(awemeRawAd)) != null) {
            java.util.Set<String> set = LIZLLL.clickTracking;
            if (set == null || set.isEmpty()) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.providerType == 2 && (str3 = LIZLLL.clickThrough) != null && str3.length() != 0) {
                    String str5 = LIZLLL.clickThrough;
                    o.LJIIIIZZ(str5, "it.clickThrough");
                    RawURLGetter.LIZIZ(str5, new N96() { // from class: X.35R
                        @Override // X.N96
                        public final void LIZ(int i, Exception exc, boolean z) {
                            String str6;
                            if (!z) {
                                C59127NIl LIZ2 = C59128NIm.LIZ();
                                LIZ2.LJFF(AwemeRawAd.this);
                                LIZ2.LIZ = "draw_ad";
                                LIZ2.LIZIZ = "load_failed";
                                OSZ[] oszArr = new OSZ[3];
                                oszArr[0] = new OSZ("error_message", "vast_clickthru_bad_response");
                                oszArr[1] = new OSZ("error_code", Integer.valueOf(i));
                                String str7 = null;
                                if (exc != null) {
                                    str6 = exc.getMessage();
                                } else {
                                    str6 = null;
                                }
                                oszArr[2] = new OSZ("error_detail", str6);
                                LIZ2.LIZ(C113554cx.LJJL(oszArr));
                                LIZ2.LJIIIZ(null);
                                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "load_failed", AwemeRawAd.this);
                                LIZLLL2.LIZIZ("vast_clickthru_bad_response", "error_message");
                                LIZLLL2.LIZIZ(Integer.valueOf(i), "error_code");
                                if (exc != null) {
                                    str7 = exc.getMessage();
                                }
                                LIZLLL2.LIZIZ(str7, "error_detail");
                                LIZLLL2.LJII();
                            }
                        }
                    });
                }
            } else {
                java.util.Set<String> set2 = LIZLLL.clickTracking;
                o.LJIIIIZZ(set2, "it.clickTracking");
                C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(ORZ.LJLIIIL(set2), C59142Tu.LJLIL));
                while (c115524g8.hasNext()) {
                    final String url = (String) c115524g8.next();
                    final long currentTimeMillis = System.currentTimeMillis();
                    o.LJIIIIZZ(url, "url");
                    RawURLGetter.LIZIZ(url, new N96() { // from class: X.35Q
                        @Override // X.N96
                        public final void LIZ(int i, Exception exc, boolean z) {
                            String str6;
                            if (!z) {
                                C59127NIl LIZ2 = C59128NIm.LIZ();
                                LIZ2.LJFF(awemeRawAd);
                                LIZ2.LIZ = "draw_ad";
                                LIZ2.LIZIZ = "load_failed";
                                OSZ[] oszArr = new OSZ[3];
                                oszArr[0] = new OSZ("error_message", "vast_click_tracker_bad_response");
                                oszArr[1] = new OSZ("error_code", Integer.valueOf(i));
                                String str7 = null;
                                if (exc != null) {
                                    str6 = exc.getMessage();
                                } else {
                                    str6 = null;
                                }
                                oszArr[2] = new OSZ("error_detail", str6);
                                LIZ2.LIZ(C113554cx.LJJL(oszArr));
                                LIZ2.LJIIIZ(null);
                                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "load_failed", awemeRawAd);
                                LIZLLL2.LIZIZ("vast_click_tracker_bad_response", "error_message");
                                LIZLLL2.LIZIZ(Integer.valueOf(i), "error_code");
                                if (exc != null) {
                                    str7 = exc.getMessage();
                                }
                                LIZLLL2.LIZIZ(str7, "error_detail");
                                LIZLLL2.LJII();
                            }
                            C59252NNg.LJIIIZ(url, String.valueOf(i), currentTimeMillis, "click", null, awemeRawAd, 16);
                        }
                    });
                }
            }
        }
        if (C78977Uz7.LJJJLIIL(awemeRawAd)) {
            try {
                String optString2 = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString2)) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = new JSONObject(optString2);
                }
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException e2) {
                C78983UzD.LJIIZILJ(e2);
            }
        }
        String LJII = LJII(awemeRawAd);
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            longValue = 0;
        } else {
            longValue = groupId.longValue();
        }
        LIZJ(longValue, context, str4, str2, LJII, jSONObject);
    }

    public static void LIZJ(final long j, final Context context, final String str, final String str2, final String str3, final JSONObject jSONObject) {
        LJJJ(str, str2, jSONObject);
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "enable_send_staging_adlog", "v3", true);
        if (TextUtils.equals(LJIILJJIL, "v1") || TextUtils.equals(str2, "click")) {
            LJJJI(context, str, str2);
        }
        if (!TextUtils.equals(str2, "click")) {
            if (TextUtils.equals(LJIILJJIL, "v3")) {
                return;
            }
            if (TextUtils.equals(LJIILJJIL, "all")) {
                try {
                    jSONObject.put("_ad_staging_flag", "1");
                } catch (JSONException e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
        }
        ITalentAdRevenueShareService LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.LJ(str3, jSONObject);
        }
        if (TextUtils.equals("click", str2)) {
            C58740N3o.LJFF(str3);
        }
        Runnable runnable = new Runnable(j, context, str2, str, str3, jSONObject) { // from class: X.LqR
            public final /* synthetic */ String LJLIL;
            public final /* synthetic */ String LJLILLLLZI;
            public final /* synthetic */ JSONObject LJLJI;
            public final /* synthetic */ String LJLJJI;
            public final /* synthetic */ long LJLJJL;

            {
                this.LJLIL = str2;
                this.LJLILLLLZI = str;
                this.LJLJI = jSONObject;
                this.LJLJJI = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str4 = this.LJLIL;
                String str5 = this.LJLILLLLZI;
                JSONObject jSONObject2 = this.LJLJI;
                String str6 = this.LJLJJI;
                long j2 = this.LJLJJL;
                if (TextUtils.equals("click", str4)) {
                    IntelligenceModuleImpl.LIZIZ().LIZ();
                    C55383LoR.LIZ(str5, str4, jSONObject2);
                    C58657N0j.LIZIZ(str5, str6, jSONObject2, j2);
                    try {
                        jSONObject2.put("has_v3", 1);
                    } catch (JSONException e2) {
                        C78983UzD.LJIIZILJ(e2);
                    }
                }
                FMX.LJI(j2, str5, str4, str6, jSONObject2);
            }
        };
        if (((Boolean) C52958KqQ.LIZ.getValue()).booleanValue()) {
            C38995FSd.LIZIZ().submit(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(java.lang.String r12, android.content.Context r13, com.ss.android.ugc.aweme.commercialize.model.LinkData r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, boolean r16, boolean r17) {
        /*
            r7 = r13
            if (r7 == 0) goto L5
            if (r14 != 0) goto L6
        L5:
            return
        L6:
            if (r17 != 0) goto L11
            if (r15 == 0) goto L10
            boolean r0 = r15.isAd()
            if (r0 != 0) goto L11
        L10:
            return
        L11:
            if (r16 != 0) goto L1b
            int r1 = r14.feedShowType
            r0 = 1
            if (r1 == r0) goto L74
            r0 = 2
            if (r1 == r0) goto L71
        L1b:
            java.lang.String r2 = "link"
        L1d:
            if (r17 == 0) goto L64
            java.lang.String r0 = r15.getAid()
            org.json.JSONObject r11 = LJIIIIZZ(r7, r14, r2, r0)
            java.lang.String r10 = r14.creativeId
        L29:
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "draw_ad"
            if (r16 == 0) goto L62
            r8 = r4
        L30:
            long r5 = LJIILJJIL(r15)
            r9 = r12
            LIZJ(r5, r7, r8, r9, r10, r11)
            if (r16 == 0) goto L60
        L3a:
            boolean r0 = r15.isAd()
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r15.getAwemeRawAd()
            java.lang.String r3 = r0.getLogExtra()
        L48:
            long r0 = LJIILJJIL(r15)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.N0h r1 = X.C58704N2e.LJ(r4, r9, r10, r3, r0)
            java.lang.String r0 = "refer"
            r1.LIZJ(r2, r0)
            r1.LJII()
            goto L5
        L5d:
            java.lang.String r3 = ""
            goto L48
        L60:
            r4 = r0
            goto L3a
        L62:
            r8 = r0
            goto L30
        L64:
            org.json.JSONObject r11 = LJIIJ(r7, r15, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r15.getAwemeRawAd()
            java.lang.String r10 = LJII(r0)
            goto L29
        L71:
            java.lang.String r2 = "link_bar"
            goto L1d
        L74:
            java.lang.String r2 = "link_logo"
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NN1.LJIJJLI(java.lang.String, android.content.Context, com.ss.android.ugc.aweme.commercialize.model.LinkData, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean):void");
    }
}
