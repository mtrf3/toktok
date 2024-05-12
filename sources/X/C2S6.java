package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.2S6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2S6 {
    public static M89 LIZ(Context context) {
        ActivityC45651qj activityC45651qj;
        Activity LIZ = C27740Aue.LIZ(context);
        if (!(LIZ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LIZ) == null) {
            return new M89();
        }
        M89 m89 = ((FeedParamProvider) ViewModelProviders.of(activityC45651qj).get(FeedParamProvider.class)).LJLIL;
        if (m89 == null) {
            return new M89();
        }
        return m89;
    }

    public static void LIZIZ(Context context, M89 param) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Activity LIZ = C27740Aue.LIZ(context);
        if (!(LIZ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LIZ) == null) {
            return;
        }
        ((FeedParamProvider) ViewModelProviders.of(activityC45651qj).get(FeedParamProvider.class)).LJLIL = param;
    }
}
