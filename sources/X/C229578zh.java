package X;

import Y.IDFactoryS61S0000000_3;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager;

/* renamed from: X.8zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229578zh {
    public static DetailLoadStateManager LIZ(ActivityC45651qj activityC45651qj) {
        return (DetailLoadStateManager) ViewModelProviders.of(activityC45651qj, new IDFactoryS61S0000000_3(1)).get(DetailLoadStateManager.class);
    }
}
