package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AY4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZ(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", editModel);
        bundle.putString("shoot_way", editModel.mShootWay);
        bundle.putString("creator_uid", editModel.getCreationId());
        Publish.PublishBundle = bundle;
        bundle.putBoolean("is_nows", true);
        return bundle;
    }
}
