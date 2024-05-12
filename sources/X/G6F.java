package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import java.util.HashMap;

/* loaded from: classes8.dex */
public abstract class G6F {
    public G6A LIZ;

    public abstract void LIZ(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, boolean z);

    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", videoPublishEditModel.getCreationId());
        hashMap.put("enter_from", "video_post_page");
        hashMap.put("content_type", "video");
        hashMap.put("shoot_way", videoPublishEditModel.mShootWay);
        ((C40990G6w) this.LIZ).LIZ.setTag(hashMap);
    }

    public G6F(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, boolean z) {
        LIZ(tikTokPublishGroupSceneFragment, view, z);
    }
}
