package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I1L {
    public final ShortVideoContext LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final boolean LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public int LJIIIIZZ;

    public final C145995oB LIZ() {
        if (this.LIZJ) {
            ShortVideoContext shortVideoContext = this.LIZ;
            if (shortVideoContext != null) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
                c145995oB.LJI("enter_from", "video_shoot_page");
                c145995oB.LJI("creation_id", shortVideoContext.LJI());
                c145995oB.LJI("user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
                c145995oB.LJI("content_source", "shoot");
                c145995oB.LJI("content_type", "video");
                return c145995oB;
            }
            return null;
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        if (videoPublishEditModel != null) {
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB2.LJI("enter_from", "video_edit_page");
            c145995oB2.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB2.LJI("user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            c145995oB2.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            c145995oB2.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
            return c145995oB2;
        }
        return null;
    }

    public final void LIZIZ(String str, String enterMethod) {
        java.util.Map<String, String> map;
        o.LJIIIZ(enterMethod, "enterMethod");
        C145995oB LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL("tab_name", str);
            LIZ.LIZLLL("enter_method", enterMethod);
            map = LIZ.LIZ;
        } else {
            map = null;
        }
        GXR.LIZ("change_reply_panel_tab", map);
    }

    public final void LIZJ(long j, String str) {
        java.util.Map<String, String> map;
        if (j - this.LJII > 100) {
            return;
        }
        C145995oB LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LIZIZ(this.LIZLLL, "qa_invitation_cnt");
            LIZ.LIZIZ(this.LJ, "qa_recommendation_cnt");
            LIZ.LIZIZ(this.LJFF, "qa_favorite_cnt");
            LIZ.LIZIZ(this.LJI, "comment_cnt");
            LIZ.LIZLLL("exit_method", str);
            LIZ.LIZIZ(j - this.LJII, "stay_duration");
            LIZ.LIZ(this.LJIIIIZZ, "more_qa_cnt");
            map = LIZ.LIZ;
        } else {
            map = null;
        }
        GXR.LIZ("exit_qa_reply_panel", map);
    }

    public I1L(ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        shortVideoContext = (i & 1) != 0 ? null : shortVideoContext;
        videoPublishEditModel = (i & 2) != 0 ? null : videoPublishEditModel;
        this.LIZ = shortVideoContext;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = z;
    }
}
