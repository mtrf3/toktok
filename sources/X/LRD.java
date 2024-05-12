package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LRD {
    public static C54258LRe LIZ(Context context) {
        FeedPanelStateViewModel feedPanelStateViewModel;
        o.LJIIIZ(context, "context");
        if (context instanceof ActivityC45651qj) {
            feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of((ActivityC45651qj) context, C54258LRe.LIZJ).get(FeedPanelStateViewModel.class);
        } else {
            feedPanelStateViewModel = null;
        }
        return new C54258LRe(feedPanelStateViewModel, context);
    }
}
