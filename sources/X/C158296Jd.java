package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.6Jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158296Jd {
    public static final /* synthetic */ int LIZJ = 0;
    public final VideoPublishEditModel LIZ;
    public final ViewOnClickListenerC158316Jf LIZIZ;

    public final void LIZ(boolean z) {
        String str;
        String str2;
        C6JV liveCDStickerController;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("enter_method", "click_main_panel");
        c145995oB.LJI("shoot_way", this.LIZ.mShootWay);
        c145995oB.LJI("creation_id", this.LIZ.getCreationId());
        c145995oB.LJI("content_source", H8F.LJI(this.LIZ));
        c145995oB.LJI("content_type", H8F.LJII(this.LIZ));
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = this.LIZIZ;
        if (viewOnClickListenerC158316Jf != null && (liveCDStickerController = viewOnClickListenerC158316Jf.getLiveCDStickerController()) != null) {
            str = liveCDStickerController.LLII;
        } else {
            str = null;
        }
        c145995oB.LJI("prop_id", str);
        if (z) {
            str2 = "keep";
        } else {
            str2 = "discard";
        }
        c145995oB.LJI("action_type", str2);
        FMX.LJIIL("livesdk_cd_sticker_cancel_confirm", c145995oB.LIZ);
    }

    public final void LIZIZ(boolean z) {
        String str;
        String str2;
        C6JV liveCDStickerController;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.getCreationId());
        c145995oB.LJI("enter_from", "video_edit_page");
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = this.LIZIZ;
        if (viewOnClickListenerC158316Jf != null && (liveCDStickerController = viewOnClickListenerC158316Jf.getLiveCDStickerController()) != null) {
            str = liveCDStickerController.LLII;
        } else {
            str = null;
        }
        c145995oB.LJI("prop_id", str);
        c145995oB.LJI("shoot_way", this.LIZ.mShootWay);
        if (z) {
            str2 = "click";
        } else {
            str2 = "draw";
        }
        c145995oB.LJI("action_type", str2);
        int i = this.LIZ.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(this.LIZ.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", this.LIZ.newDraftId);
        }
        GXR.LIZ("prop_delete", c145995oB.LIZ);
    }

    public C158296Jd(VideoPublishEditModel videoPublishEditModel, ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = viewOnClickListenerC158316Jf;
    }
}
