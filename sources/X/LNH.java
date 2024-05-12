package X;

import Y.AObserverS77S0100000_9;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LNH {
    /* JADX WARN: Multi-variable type inference failed */
    public static Aweme LIZIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (Aweme) LIZJ(activity).getValue();
    }

    public static NextLiveData LIZJ(ActivityC45651qj activityC45651qj) {
        return ((AwemeChangeCallBack) ViewModelProviders.of(activityC45651qj).get(AwemeChangeCallBack.class)).LJLIL;
    }

    public static void LIZLLL(ActivityC45651qj context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        LIZJ(context).setValue(aweme);
    }

    public static void LIZ(ActivityC45651qj context, LifecycleOwner owner, LNI lni) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(owner, "owner");
        LIZJ(context).observe(owner, new AObserverS77S0100000_9(lni, 23));
    }
}
