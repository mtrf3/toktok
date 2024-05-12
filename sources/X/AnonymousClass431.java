package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.431, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass431 {
    public static SuggestedReplyViewModel LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return (SuggestedReplyViewModel) ViewModelProviders.of(fragment).get(SuggestedReplyViewModel.class);
    }
}
