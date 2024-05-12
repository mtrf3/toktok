package X;

import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;

/* loaded from: classes8.dex */
public final class H9N {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C145995oB LIZ;

    public final void LIZ() {
        if (C1DG.LJIIIIZZ() || !C1B8.LIZJ()) {
            return;
        }
        FMX.LJIIL("upload_content_next", this.LIZ.LIZ);
    }

    public final void LIZIZ(ShortVideoContext shortVideoContext) {
        String str;
        String enterMethod;
        if (shortVideoContext != null) {
            CommentVideoModel commentVideoModel = shortVideoContext.commentVideoModel;
            C145995oB c145995oB = this.LIZ;
            String str2 = null;
            String str3 = "";
            if (!CommentUtils.needMob(shortVideoContext)) {
                str = "";
            } else if (commentVideoModel != null) {
                str = commentVideoModel.getCommentId();
            } else {
                str = null;
            }
            c145995oB.getClass();
            c145995oB.LJI("reply_comment_id", str);
            if (!CommentUtils.needMob(shortVideoContext)) {
                str2 = "";
            } else if (commentVideoModel != null) {
                str2 = commentVideoModel.getUserId();
            }
            c145995oB.LJI("reply_user_id", str2);
            if (commentVideoModel != null && (enterMethod = commentVideoModel.getEnterMethod()) != null) {
                str3 = enterMethod;
            }
            c145995oB.LIZLLL("enter_method", str3);
        }
    }

    public /* synthetic */ H9N(ShortVideoContext shortVideoContext, String str, String str2, int i, int i2, String str3, boolean z, String str4, boolean z2) {
        this(shortVideoContext, str, str2, i, i2, str3, z, str4, false, false, false, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5oB] */
    public H9N(ShortVideoContext shortVideoContext, String str, String str2, int i, int i2, String str3, boolean z, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        ?? r1;
        String str5;
        String str6;
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        String LJIJI;
        String str7;
        ?? c145995oB = new C145995oB();
        this.LIZ = c145995oB;
        int i3 = 0;
        if (shortVideoContext != null) {
            r1 = shortVideoContext.LJJIJ();
        } else {
            r1 = 0;
        }
        c145995oB.LIZ(r1, "is_use_sound_sync");
        c145995oB.LJI("content_type", str);
        if (shortVideoContext != null) {
            str5 = shortVideoContext.uploadMethod;
        } else {
            str5 = null;
        }
        String str8 = "";
        c145995oB.LJI("upload_method", str5 == null ? "" : str5);
        c145995oB.LIZJ(shortVideoContext != null ? shortVideoContext.uploadTabNameList : null, "upload_tab_name");
        c145995oB.LJI("upload_next_method", (shortVideoContext == null || (str7 = shortVideoContext.albumPreviewNextMethod) == null) ? "" : str7);
        c145995oB.LJI("content_source", "upload");
        c145995oB.LJI("upload_type", str2);
        c145995oB.LJI("mix_type", str3);
        c145995oB.LIZ(z ? 1 : 0, "is_multi_content");
        c145995oB.LIZ(i2, "pic_cnt");
        c145995oB.LIZ(i2, "current_content_nums");
        c145995oB.LIZ(i, "video_cnt");
        c145995oB.LIZ(z2 ? 1 : 0, "is_editor_pro");
        c145995oB.LIZ(z3 ? 1 : 0, "is_pip");
        c145995oB.LIZ(z4 ? 1 : 0, "is_replace");
        c145995oB.LIZ(z5 ? 1 : 0, "source_is_hdr");
        if (shortVideoContext != null && (LJIJI = shortVideoContext.LJIJI()) != null) {
            str8 = LJIJI;
        }
        c145995oB.LJI("shoot_tab_name", str8);
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (commonMobParamModel = creativeModel.commonMobModel) != null && commonMobParamModel.isUploadDirectEnter) {
            i3 = 1;
        }
        c145995oB.LIZ(i3, "is_upload_direct_enter");
        if (shortVideoContext != null) {
            c145995oB.LIZLLL("shoot_way", shortVideoContext.shootWay);
            c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
            c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
            if (shortVideoContext.isClickFromAlbumPreview) {
                str6 = "album_content_detail";
            } else {
                str6 = "album_panel";
            }
            c145995oB.LIZLLL("enter_from", str6);
            if (V16.LJJIJIIJI(shortVideoContext)) {
                c145995oB.LIZLLL("upload_tab_position", "now");
            }
            c145995oB.LIZLLL("content_size", str4);
        }
    }
}
