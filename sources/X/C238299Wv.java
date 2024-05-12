package X;

import Y.IDFactoryS62S0000000_4;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9Wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238299Wv {
    public static FeedPromptViewModel LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (FeedPromptViewModel) ViewModelProviders.of(activity, new IDFactoryS62S0000000_4(1)).get(FeedPromptViewModel.class);
    }
}
