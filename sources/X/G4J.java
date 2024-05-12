package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G4J implements ComponentCallbacks {
    public final /* synthetic */ ActivityC86117Xqz LJLIL;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public G4J(ActivityC86117Xqz activityC86117Xqz) {
        this.LJLIL = activityC86117Xqz;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        if (newConfig.fontScale > 0.0f) {
            this.LJLIL.getResources().getDisplayMetrics();
        }
    }
}
