package X;

import Y.AObserverS70S0200000_6;
import android.content.Context;
import com.ss.android.ugc.aweme.plugin.PluginService;

/* loaded from: classes7.dex */
public final class E4C implements E4J {
    public InterfaceC79713Ax LIZ;

    @Override // X.E4J
    public final void run(Context context) {
        this.LIZ = PluginService.createIPluginServicebyMonsterPlugin(false).backgroundThreadObserveAll(EnumC35839E4t.PROACTIVE_LOGIN_REPEATED_TRIGGER, new AObserverS70S0200000_6(context, this, 0));
    }
}
