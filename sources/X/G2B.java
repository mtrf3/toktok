package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2B extends G46 {
    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        super.onActivityCreated(activity, bundle);
        activity.setActivityRef(new WeakReference<>(activity));
    }
}
