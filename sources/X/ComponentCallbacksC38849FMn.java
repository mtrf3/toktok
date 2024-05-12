package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.FMn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ComponentCallbacksC38849FMn implements ComponentCallbacks {
    public final /* synthetic */ C38842FMg LJLIL;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public ComponentCallbacksC38849FMn(C38842FMg c38842FMg) {
        this.LJLIL = c38842FMg;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C38842FMg c38842FMg = this.LJLIL;
        c38842FMg.LIZJ = false;
        c38842FMg.LIZIZ = configuration;
    }
}
