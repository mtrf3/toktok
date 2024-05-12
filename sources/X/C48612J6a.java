package X;

import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.feature.SequencePlayInfo;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: X.J6a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48612J6a {
    public static boolean LIZIZ;
    public static final java.util.Set<String> LIZ = C77275UUl.LJIIIIZZ("click_comment_button", "video_play_finish", "like", "enter_personal_detail", "enter_music_detail", "follow", "click_more_button", "post_comment", "dislike", "video_pause", "favourite_video", "enter_tag_detail", "livesdk_room_enter_success", "livesdk_live_duration", "poi_click", "request_to_show_interval", "close_suggested_accounts_pop_up");
    public static final HashSet<String> LIZJ = new HashSet<>();

    public static String LIZ(JSONObject jSONObject) {
        Object opt;
        if (jSONObject != null && (opt = jSONObject.opt("group_id")) != null) {
            String obj = opt.toString();
            if (obj.length() > 0) {
                return obj;
            }
        }
        return null;
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        String LIZ2;
        String LIZ3;
        AtomicInteger atomicInteger;
        String LIZ4;
        C48618J6g LIZ5;
        AtomicInteger atomicInteger2;
        int i;
        String LIZ6;
        AtomicInteger atomicInteger3;
        String LIZ7;
        String LIZ8;
        AtomicInteger atomicInteger4;
        String LIZ9;
        String LIZ10;
        String LIZ11;
        AtomicInteger atomicInteger5;
        String LIZ12;
        C48618J6g LIZ13;
        AtomicInteger atomicInteger6;
        String LIZ14;
        AtomicInteger atomicInteger7;
        String LIZ15;
        C48618J6g LIZ16;
        AtomicInteger atomicInteger8;
        switch (str.hashCode()) {
            case -2093510369:
                if (str.equals("close_suggested_accounts_pop_up") && jSONObject != null) {
                    C48629J6r.LIZ.LJIILL = jSONObject.optLong("duration");
                    break;
                }
                break;
            case -1642623552:
                if (str.equals("post_comment")) {
                    C48629J6r.LIZ.LIZJ++;
                    break;
                }
                break;
            case -1330248535:
                if (str.equals("click_comment_button") && (LIZ2 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ17 = J3S.LIZ.LIZ(LIZ2);
                    if (LIZ17 != null) {
                        LIZ17.LIZJ.getAndIncrement();
                        SequencePlayInfo LIZIZ2 = C48627J6p.LIZ.LIZIZ(LIZ17.LJJIFFI);
                        if (LIZIZ2 != null) {
                            LIZIZ2.commentCount++;
                        }
                    }
                    C48629J6r.LIZ.LJFF++;
                    break;
                }
                break;
            case -1284480695:
                if (str.equals("livesdk_room_enter_success")) {
                    C48629J6r.LIZ.LJI++;
                    break;
                }
                break;
            case -1268958287:
                if (str.equals("follow") && (LIZ3 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ18 = J3S.LIZ.LIZ(LIZ3);
                    if (LIZ18 != null && (atomicInteger = LIZ18.LJFF) != null) {
                        atomicInteger.getAndIncrement();
                    }
                    C48629J6r.LIZ.LJIIJ++;
                    break;
                }
                break;
            case -1213756323:
                if (str.equals("enter_tag_detail") && (LIZ4 = LIZ(jSONObject)) != null && (LIZ5 = J3S.LIZ.LIZ(LIZ4)) != null && (atomicInteger2 = LIZ5.LJIIL) != null) {
                    atomicInteger2.getAndIncrement();
                    break;
                }
                break;
            case -1115849514:
                if (str.equals("livesdk_live_duration")) {
                    C48619J6h c48619J6h = C48629J6r.LIZ;
                    int i2 = c48619J6h.LJII;
                    if (jSONObject != null && jSONObject.has("duration")) {
                        try {
                            i = jSONObject.optInt("duration");
                        } catch (Exception unused) {
                        }
                        c48619J6h.LJII = i2 + i;
                        break;
                    }
                    i = 0;
                    c48619J6h.LJII = i2 + i;
                }
                break;
            case -1115125979:
                if (str.equals("click_more_button") && (LIZ6 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ19 = J3S.LIZ.LIZ(LIZ6);
                    if (LIZ19 != null && (atomicInteger3 = LIZ19.LJII) != null) {
                        atomicInteger3.getAndIncrement();
                    }
                    C48629J6r.LIZ.LJIILJJIL++;
                    break;
                }
                break;
            case -795864119:
                if (str.equals("enter_personal_detail") && (LIZ7 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ20 = J3S.LIZ.LIZ(LIZ7);
                    if (LIZ20 != null) {
                        LIZ20.LJ.getAndIncrement();
                        SequencePlayInfo LIZIZ3 = C48627J6p.LIZ.LIZIZ(LIZ20.LJJIFFI);
                        if (LIZIZ3 != null) {
                            LIZIZ3.headCount++;
                        }
                    }
                    C48629J6r.LIZ.LIZLLL++;
                    break;
                }
                break;
            case -405326491:
                if (str.equals("favourite_video") && (LIZ8 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ21 = J3S.LIZ.LIZ(LIZ8);
                    if (LIZ21 != null && (atomicInteger4 = LIZ21.LJIIJJI) != null) {
                        atomicInteger4.getAndIncrement();
                    }
                    C48629J6r.LIZ.LJIIJJI++;
                    break;
                }
                break;
            case -268651341:
                if (str.equals("request_to_show_interval") && jSONObject != null) {
                    C48625J6n.LIZ.LIZ = (float) jSONObject.optLong("request_latency", 0L);
                    break;
                }
                break;
            case -17674694:
                if (str.equals("video_play_finish") && (LIZ9 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ22 = J3S.LIZ.LIZ(LIZ9);
                    if (LIZ22 != null) {
                        LIZ22.LIZLLL.getAndIncrement();
                        SequencePlayInfo LIZIZ4 = C48627J6p.LIZ.LIZIZ(LIZ22.LJJIFFI);
                        if (LIZIZ4 != null) {
                            LIZIZ4.playFinishCount++;
                        }
                    }
                    C48629J6r.LIZ.LJIIIZ++;
                    break;
                }
                break;
            case 3321751:
                if (str.equals("like") && (LIZ10 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ23 = J3S.LIZ.LIZ(LIZ10);
                    if (LIZ23 != null) {
                        LIZ23.LIZIZ.getAndIncrement();
                        SequencePlayInfo LIZIZ5 = C48627J6p.LIZ.LIZIZ(LIZ23.LJJIFFI);
                        if (LIZIZ5 != null) {
                            LIZIZ5.likeCount++;
                        }
                    }
                    C48629J6r.LIZ.LJIIIIZZ++;
                    break;
                }
                break;
            case 1120107347:
                if (str.equals("poi_click") && (LIZ11 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ24 = J3S.LIZ.LIZ(LIZ11);
                    if (LIZ24 != null && (atomicInteger5 = LIZ24.LJIILIIL) != null) {
                        atomicInteger5.getAndIncrement();
                    }
                    C48629J6r.LIZ.LJIIL++;
                    break;
                }
                break;
            case 1382290738:
                if (str.equals("video_pause") && (LIZ12 = LIZ(jSONObject)) != null && (LIZ13 = J3S.LIZ.LIZ(LIZ12)) != null && (atomicInteger6 = LIZ13.LJIIJ) != null) {
                    atomicInteger6.getAndIncrement();
                    break;
                }
                break;
            case 1438590386:
                if (str.equals("enter_music_detail") && (LIZ14 = LIZ(jSONObject)) != null) {
                    C48618J6g LIZ25 = J3S.LIZ.LIZ(LIZ14);
                    if (LIZ25 != null && (atomicInteger7 = LIZ25.LJI) != null) {
                        atomicInteger7.getAndIncrement();
                    }
                    C48629J6r.LIZ.LJIILIIL++;
                    break;
                }
                break;
            case 1671642405:
                if (str.equals("dislike") && (LIZ15 = LIZ(jSONObject)) != null && (LIZ16 = J3S.LIZ.LIZ(LIZ15)) != null && (atomicInteger8 = LIZ16.LJIIIZ) != null) {
                    atomicInteger8.getAndIncrement();
                    break;
                }
                break;
        }
        SmartDataTrackerService.Companion.getClass();
        C48580J4u.LIZ.collectDataWhenTriggerTargetEvent(str);
    }
}
