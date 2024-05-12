package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;

/* renamed from: X.3ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94723ng {
    public static InboxSocPubStatusViewModelImpl LIZ(ActivityC45651qj activityC45651qj) {
        if (!C78840Uwu.LJIL() || activityC45651qj == null) {
            return null;
        }
        return (InboxSocPubStatusViewModelImpl) ViewModelProviders.of(activityC45651qj).get(InboxSocPubStatusViewModelImpl.class);
    }
}
