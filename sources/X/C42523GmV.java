package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.ScmLabelInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* renamed from: X.GmV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42523GmV {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        ScmLabelInfo scmLabelInfo;
        if (videoItemParams == null || videoItemParams.getAweme() == null || (scmLabelInfo = videoItemParams.getAweme().getUploadMiscInfoStruct().scmLabelInfo) == null || TextUtils.isEmpty(scmLabelInfo.getContent()) || TextUtils.isEmpty(scmLabelInfo.getLearnMoreUrl())) {
            return false;
        }
        return true;
    }
}
