package X;

import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;

/* loaded from: classes12.dex */
public final class Q7P {
    public static InterfaceC66439Q5r LIZ(Class cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return Q7Q.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return Q7Q.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return Q7Q.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return Q6X.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return Q7Q.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return Q6V.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return Q6W.SHARE_STORY_ASSET;
        }
        return null;
    }
}
