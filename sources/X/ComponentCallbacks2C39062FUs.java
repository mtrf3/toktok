package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.jvm.internal.o;

/* renamed from: X.FUs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ComponentCallbacks2C39062FUs implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIJ(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        HandlerC39055FUl.LJIIIIZZ.getClass();
        FOR.LJFF.LIZIZ().execute(RunnableC39059FUp.LJLIL);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        UC7.LIZLLL("onLowMemory level ", i);
    }
}
