package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G8z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41045G8z {
    public static final Bundle LIZIZ(VideoPublishEditModel mModel) {
        int i;
        o.LJIIIZ(mModel, "mModel");
        Bundle bundle = new Bundle();
        if (H7R.LJJJJL(mModel)) {
            i = 11;
        } else {
            i = 0;
        }
        bundle.putInt("video_type", i);
        bundle.putBoolean("from_search", mModel.creativeModel.searchCreateModel.isFromSearch());
        bundle.putSerializable("extra_video_publish_args", mModel);
        bundle.putString("shoot_way", mModel.mShootWay);
        bundle.putString("creation_id", mModel.getCreationId());
        bundle.putInt("publish_private_state", mModel.isPrivate());
        if (H7R.LJJL(mModel)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoPublishService.createBundleParams()  bundle=");
        LIZ.append(bundle);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VideoPublishService.createBundleParams()  bundle=");
        LIZ2.append(bundle);
        c145995oB.LJI("log", X1D.LIZIZ(LIZ2));
        FMX.LJIIL("av_video_memory", c145995oB.LIZ);
        Publish.PublishBundle = bundle;
        return bundle;
    }

    public static final Bundle LIZ(VideoPublishEditModel model, boolean z) {
        int i;
        boolean z2;
        o.LJIIIZ(model, "model");
        boolean z3 = true;
        if (model.ttStoryUploadModel == null && !H7R.LJJJJZI(model)) {
            model.ttStoryUploadModel = new TTStoryUploadModel(0, 0, 1);
        }
        if (H7R.LJJJJZI(model)) {
            model.reactDuetSetting = 1;
            model.stitchSetting = 1;
        }
        Bundle bundle = new Bundle();
        if (H7R.LJJJJL(model)) {
            i = 11;
        } else {
            i = 0;
        }
        bundle.putInt("video_type", i);
        bundle.putSerializable("extra_video_publish_args", model);
        bundle.putString("shoot_way", model.mShootWay);
        bundle.getString("creation_id", model.getCreationId());
        bundle.putInt("publish_private_state", model.isPrivate());
        bundle.putInt("publish_permission", model.isPrivate);
        if (model.ttStoryUploadModel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle.putBoolean("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH", z2);
        if (model.ttStoryUploadModel == null) {
            z3 = false;
        }
        bundle.putBoolean("publish_story_mode", z3);
        bundle.putBoolean("publish_retry", z);
        ForwardEditPublishData forwardEditPublishData = model.creativeModel.forwardEditPublishData;
        if (forwardEditPublishData != null) {
            bundle.putBoolean("extra_disable_progress_view", forwardEditPublishData.disableProgressView);
        }
        return bundle;
    }
}
