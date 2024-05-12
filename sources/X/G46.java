package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class G46 extends G48 {
    public WeakReference<ActivityC86117Xqz> LIZIZ;

    @Override // X.G48, X.InterfaceC86124Xr6
    public void onActivityDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = null;
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = new WeakReference<>(activity);
    }
}
