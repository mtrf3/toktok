package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* renamed from: X.3RJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RJ {
    public static final boolean LIZ(SharePackage sharePackage) {
        if (sharePackage == null) {
            return false;
        }
        return TextUtils.equals(sharePackage.extras.getString("is_friend_private"), "true");
    }
}
