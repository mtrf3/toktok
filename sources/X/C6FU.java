package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.6FU, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6FU implements DialogInterface.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    public /* synthetic */ C6FU(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.LJLIL) {
            case 0:
                AbsAudienceInteractionFragment.lambda$showPipGuideDialog$27((Activity) this.LJLILLLLZI, dialogInterface, i);
                return;
            default:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) this.LJLILLLLZI;
                VideoPublishEditModel videoPublishEditModel = videoEditContainerScene.LJZL;
                if (videoPublishEditModel.recordMode == 1) {
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("to_status", "confirm");
                    c145995oB.LJI("prop_id", videoPublishEditModel.mStickerID);
                    Q8U.LIZJ(c145995oB, "shoot_way", videoPublishEditModel.mShootWay, videoPublishEditModel, "creation_id");
                    FMX.LJIIL("back_to_shoot_confirm", c145995oB.LIZ);
                }
                videoEditContainerScene.LLLJL(C45828Hyi.LJIILJJIL);
                videoEditContainerScene.LLLII();
                return;
        }
    }
}
