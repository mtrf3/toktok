package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.jvm.internal.o;

/* renamed from: X.FYo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ComponentCallbacks2C39162FYo implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 80 && !C39163FYp.LJIIIIZZ) {
            C39163FYp.LJIIIIZZ = true;
            C39163FYp.LJFF().storeBoolean("low_memory", true);
        }
        C39163FYp.LJFF().storeLong("low_memory_time", System.currentTimeMillis());
    }
}
