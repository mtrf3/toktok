package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HKZ {
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
}
