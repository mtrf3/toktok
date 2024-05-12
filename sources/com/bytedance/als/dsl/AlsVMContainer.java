package com.bytedance.als.dsl;

import X.ActivityC45651qj;
import X.C275616i;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.AlsLogicContainer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class AlsVMContainer extends ViewModel {
    public C275616i LJLIL = new C275616i(0);
    public AlsLogicContainer LJLILLLLZI;
    public OCAdapterViewModel LJLJI;
    public WeakReference<ActivityC45651qj> LJLJJI;

    public final void gv0(ActivityC45651qj activity) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(activity, "activity");
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJI;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        if (!o.LJ(activityC45651qj, activity)) {
            this.LJLJJI = new WeakReference<>(activity);
            this.LJLILLLLZI = null;
            this.LJLJI = null;
        }
    }
}
