package X;

import com.ss.android.ugc.aweme.experiment.ProfileThumbnailToFullPageVariant;

/* renamed from: X.81M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81M {
    public static boolean LIZ(Integer num) {
        Object value = C81U.LIZ.getValue();
        if (num == null) {
            return false;
        }
        if (num.intValue() == 1000) {
            if (value != ProfileThumbnailToFullPageVariant.TAP_SELF_AND_OTHER_PROFILE) {
                return false;
            }
        } else if ((num.intValue() != 2000 && num.intValue() != 4000) || value == ProfileThumbnailToFullPageVariant.CONTROL) {
            return false;
        }
        return true;
    }
}
