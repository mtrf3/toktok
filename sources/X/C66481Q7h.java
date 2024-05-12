package X;

import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;

/* renamed from: X.Q7h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66481Q7h {
    public static final /* synthetic */ int LIZ = 0;

    public static final Bundle LIZ(ShareContent<?, ?> shareContent) {
        String str;
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.shareHashtag;
        if (shareHashtag == null) {
            str = null;
        } else {
            str = shareHashtag.hashtag;
        }
        C66373Q3d.LJJII("hashtag", str, bundle);
        return bundle;
    }
}
