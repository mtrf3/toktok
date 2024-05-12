package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;

/* renamed from: X.Uxq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78898Uxq {
    public static IStickerService.FaceSticker LIZ(LiveEffect liveEffect) {
        IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
        if (liveEffect != null) {
            faceSticker.stickerId = liveEffect.effectId;
            faceSticker.resourceId = liveEffect.getResourceId();
            faceSticker.name = liveEffect.getName();
            UrlModel urlModel = liveEffect.icon;
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            if (urlModel != null) {
                toolsUrlModel.uri = urlModel.uri;
                toolsUrlModel.urlList = urlModel.urlList;
            }
            faceSticker.iconUrl = toolsUrlModel;
            String str = liveEffect.hint;
            faceSticker.localPath = liveEffect.unzipPath;
            faceSticker.types = liveEffect.types;
            faceSticker.extra = liveEffect.extra;
            faceSticker.hint = str;
            faceSticker.tags = liveEffect.getTags();
        }
        return faceSticker;
    }
}
