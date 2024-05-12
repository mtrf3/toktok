package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;

/* loaded from: classes15.dex */
public final class W2T {
    public static final /* synthetic */ int LIZ = 0;

    public static ImageUrlModel LIZ(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        return new ImageUrlModel(urlModel.getUri(), urlModel.getUrlList());
    }
}
