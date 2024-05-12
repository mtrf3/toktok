package X;

import Y.ACallableS41S0000000_6;
import Y.ARunnableS13S0000000_6;
import android.content.Context;
import android.os.Build;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J8K {
    public static final LruCache<String, C2IW> LIZ = new LruCache<>(10);

    public static void LIZ() {
        if (((Boolean) C34016DWq.LJI.getValue()).booleanValue()) {
            C10K.LJII(((Number) C34016DWq.LJII.getValue()).longValue()).LJ(new C10I() { // from class: X.E1O
                @Override // X.C10I
                public final Object then(C10K c10k) {
                    if (((Boolean) C34016DWq.LJ.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 23) {
                        C16880lQ.LJLI(C16880lQ.LLJJJJ().getQueue(), new MessageQueue.IdleHandler() { // from class: X.E1P
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                C10K.LIZIZ(new ACallableS41S0000000_6(12), FMX.LIZIZ(), null);
                                return false;
                            }
                        });
                        return null;
                    }
                    AppLog.flush();
                    return null;
                }
            }, FMX.LIZIZ(), null);
            return;
        }
        HandlerThreadC36423ERf.LIZJ().LIZIZ(((Number) C34016DWq.LJII.getValue()).longValue(), new ARunnableS13S0000000_6(49));
    }

    public static void LIZLLL(Aweme aweme, String str) {
        if (aweme == null || !o.LJ(str, "homepage_hot")) {
            return;
        }
        String aid = aweme.getAid();
        LruCache<String, C2IW> lruCache = LIZ;
        C2IW c2iw = lruCache.get(aid);
        if (c2iw != null) {
            c2iw.LJLIL = true;
        } else {
            lruCache.put(aid, new C2IW(true, false));
        }
    }

    public static C198517qh LIZIZ(Aweme aweme, M89 m89, boolean z, int i) {
        Object obj;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("author_id", C227768wm.LIZJ(aweme));
        c198517qh.LIZ.put("request_id", C227768wm.LJIILL(m89.getPageType(), aweme));
        c198517qh.LIZ.put("detail", Integer.valueOf(z ? 1 : 0));
        c198517qh.LIZ.put("order", Integer.valueOf(i));
        c198517qh.LIZ.put("is_photo", C227768wm.LIZLLL(aweme));
        c198517qh.LIZ.put("enter_method", m89.getEnterMethodValue());
        c198517qh.LIZ.put("enter_from", m89.getEventType());
        String str = "1";
        if (aweme.getAllowGift()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c198517qh.LIZ.put("is_giftable", obj);
        if (!aweme.isOnThisDayVideo().booleanValue()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c198517qh.LIZ.put("is_on_this_day", str);
        if (!TextUtils.isEmpty(m89.getShareUserId())) {
            c198517qh.LIZ.put("share_mode", "token");
            c198517qh.LIZLLL("uid", m89.getShareUserId());
        }
        return c198517qh;
    }

    public static void LIZJ(final Context context, final Aweme aweme, final JSONObject jSONObject, final M89 m89, final String str) {
        final String str2;
        int pageType = m89.getPageType();
        if (pageType != 0) {
            if (pageType != 1) {
                if (pageType != 7) {
                    if (pageType != 9) {
                        if (pageType != 33) {
                            if (pageType != 2000) {
                                return;
                            } else {
                                str2 = "others_homepage";
                            }
                        } else {
                            str2 = "homepage_popular";
                        }
                    } else {
                        str2 = "search";
                    }
                } else {
                    str2 = "homepage_nearby";
                }
            } else {
                str2 = "homepage_follow";
            }
        } else {
            str2 = "homepage_hot";
        }
        final String aid = aweme.getAid();
        C10K.LIZIZ(new Callable(jSONObject, aweme, str, context, str2, aid, m89) { // from class: X.Jyb
            public final /* synthetic */ JSONObject LJLIL;
            public final /* synthetic */ Aweme LJLILLLLZI;
            public final /* synthetic */ String LJLJI;
            public final /* synthetic */ String LJLJJI;
            public final /* synthetic */ String LJLJJL;
            public final /* synthetic */ M89 LJLJJLL;

            {
                this.LJLJJI = str2;
                this.LJLJJL = aid;
                this.LJLJJLL = m89;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                AnchorCommonStruct anchorCommonStruct;
                String str3;
                JSONObject jSONObject2 = this.LJLIL;
                Aweme aweme2 = this.LJLILLLLZI;
                String str4 = this.LJLJI;
                String str5 = this.LJLJJI;
                String str6 = this.LJLJJL;
                M89 m892 = this.LJLJJLL;
                try {
                    jSONObject2.put("display", "full");
                    jSONObject2.put("group_id", aweme2.getAid());
                    jSONObject2.put("to_user_id", aweme2.getAuthorUid());
                    jSONObject2.put("author_id", aweme2.getAuthorUid());
                    if (C227768wm.LJJII(str4)) {
                        jSONObject2.put("enter_fullscreen", "1");
                        jSONObject2.put("content_type", C227768wm.LJ(aweme2));
                    }
                    if (!TextUtils.isEmpty(aweme2.getRepostFromGroupId())) {
                        jSONObject2.put("is_reposted", "1");
                        jSONObject2.put("repost_from_group_id", aweme2.getRepostFromGroupId());
                        jSONObject2.put("repost_from_user_id", aweme2.getRepostFromUserId());
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                FMX.LJI(0L, "show", str5, str6, jSONObject2);
                if (C227768wm.LJJII(str4)) {
                    jSONObject2.put("enter_from", str5);
                    FMX.LJIILLIIL("show", jSONObject2);
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str5);
                c188727au.LJIIIZ("group_id", str6);
                c188727au.LJIIIZ("author_id", aweme2.getAuthorUid());
                c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIILLIIL(0, str6)));
                c188727au.LIZLLL(0, "_staging_flag");
                c188727au.LJ(aweme2.getFeedCount(), "feed_count");
                c188727au.LJIIIZ("order", C227768wm.LJIIL(m892.getPageType(), aweme2));
                if (!aweme2.isAd()) {
                    c188727au.LJI("is_organic", "1");
                } else {
                    c188727au.LJI("is_organic", CardStruct.IStatusCode.DEFAULT);
                }
                List<AnchorCommonStruct> anchors = aweme2.getAnchors();
                String str7 = "";
                if (anchors != null) {
                    Iterator<AnchorCommonStruct> it = anchors.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            anchorCommonStruct = it.next();
                            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                            if (anchorCommonStruct2.getType() == 76 && anchorCommonStruct2.getExtra().length() > 0) {
                                break;
                            }
                        } else {
                            anchorCommonStruct = null;
                            break;
                        }
                    }
                    AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
                    if (anchorCommonStruct3 != null) {
                        try {
                            str3 = JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct3.getExtra()), "pixel_id");
                            str3.toString();
                        } catch (JSONException e2) {
                            C78983UzD.LJIIZILJ(e2);
                            str3 = "";
                        }
                        str7 = str3;
                    }
                }
                c188727au.LJI("ba_pixel_id", str7);
                if (!C2M9.LIZ()) {
                    FMX.LJIIL("video_show", c188727au.LIZ);
                }
                String LJJJJZ = C63081OpJ.LJJJJZ(aweme2);
                if (!TextUtils.isEmpty(LJJJJZ)) {
                    if (aweme2.isAd()) {
                        long j = 0L;
                        if (aweme2.getAwemeRawAd() != null) {
                            j = aweme2.getAwemeRawAd().getAdId();
                        }
                        c188727au.LJFF(j, "ad_id");
                    }
                    try {
                        c188727au.LIZLLL(CastIntegerProtector.parseInt(LJJJJZ), "study_id");
                    } catch (NumberFormatException e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                    FMX.LJIIL("ads_bls_ugc_show", c188727au.LIZ);
                }
                if (!C1041847a.LIZ()) {
                    C50918Jyc c50918Jyc = new C50918Jyc();
                    c50918Jyc.LIZLLL = str4;
                    c50918Jyc.LJIILL(m892.getPageType(), aweme2);
                    c50918Jyc.LJIILIIL();
                }
                return null;
            }
        }, FMX.LIZIZ(), null);
    }
}
