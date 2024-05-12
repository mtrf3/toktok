package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;

/* renamed from: X.3Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84203Se {
    public static SessionListReadStatusViewModel LIZ(ActivityC45651qj activityC45651qj) {
        SessionListReadStatusViewModel sessionListReadStatusViewModel = (SessionListReadStatusViewModel) ViewModelProviders.of(activityC45651qj).get(SessionListReadStatusViewModel.class);
        activityC45651qj.getLifecycle().addObserver(sessionListReadStatusViewModel);
        return sessionListReadStatusViewModel;
    }
}
