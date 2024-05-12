package X;

import Y.IDeS360S0100000_1;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.MediaAuthor;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GYP {
    public static XKQ LIZ;
    public static C44428Hc8 LIZIZ;
    public static C44428Hc8 LIZJ;
    public static C44428Hc8 LIZLLL;
    public static C44428Hc8 LJ;

    public static String LIZIZ(MediaAuthor mediaAuthor) {
        o.LJIIIZ(mediaAuthor, "<this>");
        String renderName = mediaAuthor.getRenderName();
        if (renderName != null && renderName.length() > 0) {
            return renderName;
        }
        String nickName = mediaAuthor.getNickName();
        if (nickName != null) {
            return nickName;
        }
        return "";
    }

    public static void LIZJ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ForwardEnvironment->");
        LIZ2.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
    }

    public static void LIZLLL(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1110, ggo, EnumC42283Gid.DUAL_BALL_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    public static InterfaceC65462ha LIZ(ForwardMedia source, GYE canvasMediaInfo) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(canvasMediaInfo, "canvasMediaInfo");
        LIZJ("calculateBackgroundColor start");
        C44428Hc8 c44428Hc8 = LIZLLL;
        if (c44428Hc8 != null && !c44428Hc8.LIZIZ) {
            c44428Hc8.LIZLLL();
        }
        if (C00F.LIZ(31744, 0, "creation_add_to_story_background_style", true) == 1) {
            return new C3C3(new GYD(source, canvasMediaInfo, null));
        }
        C44428Hc8 c44428Hc82 = LIZLLL;
        if (c44428Hc82 != null && c44428Hc82.LIZIZ) {
            c44428Hc82.LJ();
        }
        LIZJ("calculateBackgroundColor finish with default color.");
        return new IDeS360S0100000_1(canvasMediaInfo, 10);
    }

    public static void LJ(int i, InterfaceC88472Yns interfaceC88472Yns) {
        long j;
        long j2;
        long j3;
        C145995oB LIZIZ2 = GFJ.LIZIZ(i, "status");
        C44428Hc8 c44428Hc8 = LIZIZ;
        long j4 = -1;
        if (c44428Hc8 != null) {
            j = c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j = -1;
        }
        LIZIZ2.LIZIZ(j, "total_time");
        C44428Hc8 c44428Hc82 = LIZJ;
        if (c44428Hc82 != null) {
            j2 = c44428Hc82.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j2 = -1;
        }
        LIZIZ2.LIZIZ(j2, "download_video_time");
        C44428Hc8 c44428Hc83 = LJ;
        if (c44428Hc83 != null) {
            j3 = c44428Hc83.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j3 = -1;
        }
        LIZIZ2.LIZIZ(j3, "download_style_time");
        C44428Hc8 c44428Hc84 = LIZLLL;
        if (c44428Hc84 != null) {
            j4 = c44428Hc84.LIZIZ(TimeUnit.MILLISECONDS);
        }
        LIZIZ2.LIZIZ(j4, "calculate_bg_time");
        LIZIZ2.LIZ(0, "stream_edit_mode");
        LIZIZ2.LIZIZ(0L, "external_cache_size");
        interfaceC88472Yns.invoke(LIZIZ2);
        GXR.LIZ("tools_performance_share_2_story_pre_process", LIZIZ2.LIZ);
    }

    public static void LJFF(ForwardMedia source, CreativeInfo creativeInfo, ForwardConfig config) {
        String str;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(config, "config");
        String eventType = source.getEventType();
        String enterMethod = source.getEnterMethod();
        String creationId = creativeInfo.getCreationId();
        VideoShareInfoStruct videoShareInfoStruct = config.getVideoShareInfoStruct();
        if (videoShareInfoStruct == null || (str = videoShareInfoStruct.getAuthorId()) == null) {
            str = "";
        }
        int awemeType = source.getAwemeType();
        boolean LJ2 = o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId());
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", "upload");
        c145995oB.LJI("enter_from", eventType);
        c145995oB.LJI("enter_method", enterMethod);
        c145995oB.LJI("shoot_way", "share_to_story");
        c145995oB.LJI("content_type", "share");
        c145995oB.LIZ(awemeType, "repost_aweme_type");
        c145995oB.LIZ(LJ2 ? 1 : 0, "is_own_video");
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("music_selected_from", "others_share");
        FMX.LJIIL("shoot", c145995oB.LIZ);
    }
}
