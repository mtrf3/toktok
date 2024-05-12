package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WJy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82098WJy {
    public static final List<String> LIZ = new ArrayList();

    public static void LIZ(ShortVideoContext shortVideoContext, String str) {
        String str2;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "video");
        c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("to_status", str);
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("shoot_entrance", shortVideoContext.shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (shortVideoContext.mIsFromDraft) {
            str2 = "click_draft";
        } else {
            str2 = "";
        }
        c145995oB.LJI("enter_method", str2);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(shortVideoContext.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", shortVideoContext.newDraftId);
        }
        if (shortVideoContext.creativeModel.reuseSoundAndEffectModel.isFromReuseMusic()) {
            c145995oB.LIZLLL("music_selected_from", "previous_video_reuse");
        }
        if (shortVideoContext.creativeModel.reuseSoundAndEffectModel.isMusicFromDiscoveryPage()) {
            c145995oB.LIZLLL("music_selected_from", "prop_panel_discovery");
        }
        FMX.LJIIL("mute_microphone", c145995oB.LIZ);
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext, C81975WFf model) {
        String str;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(model, "model");
        switch (model.LJLIL) {
            case 0:
                str = "flip";
                break;
            case 1:
                str = "speed";
                break;
            case 2:
                str = "mbeauty";
                break;
            case 3:
            case 10:
                str = "mic";
                break;
            case 4:
                str = "filters";
                break;
            case 5:
            case 15:
            case 22:
            default:
                str = "";
                break;
            case 6:
                str = "beauty";
                break;
            case 7:
                str = "timer";
                break;
            case 8:
                str = "duet_layout";
                break;
            case 9:
                str = "switch";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                str = "wide";
                break;
            case 12:
                str = "cut_music";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                str = "switch_time";
                break;
            case 14:
                str = "voice_change";
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                str = "library";
                break;
            case 17:
                str = "reply";
                break;
            case 18:
                str = "add_yours";
                break;
            case 19:
                str = "flash";
                break;
            case 20:
                str = "ai_enhance";
                break;
            case 21:
                str = "shake_free";
                break;
            case 23:
                str = "more";
                break;
        }
        ArrayList arrayList = (ArrayList) LIZ;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("icon_name", str);
        c188727au.LJIIIZ("content_type", shortVideoContext.LIZLLL().getContentType());
        c188727au.LJIIIZ("content_source", shortVideoContext.LIZLLL().getContentSource());
        c188727au.LJIIIZ("shoot_way", shortVideoContext.shootWay);
        c188727au.LJIIIZ("enter_from", "video_shoot_page");
        c188727au.LJIIIZ("creation_id", shortVideoContext.LJI());
        FMX.LJIIL("shoot_page_icon_show", c188727au.LIZ);
        if (o.LJ(str, "voice_change")) {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("creation_id", shortVideoContext.LJI());
            c188727au2.LJIIIZ("shoot_way", shortVideoContext.shootWay);
            c188727au2.LJIIIZ("enter_from", "video_shoot_page");
            c188727au2.LJIIIZ("content_source", shortVideoContext.LIZLLL().getContentSource());
            c188727au2.LJIIIZ("content_type", shortVideoContext.LIZLLL().getContentType());
            FMX.LJIIL("voice_effect_entrance_show", c188727au2.LIZ);
        }
    }
}
