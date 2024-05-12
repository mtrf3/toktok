package X;

import Y.AObserverS74S0100000_6;
import android.content.Context;
import com.ss.android.ugc.aweme.plugin.PluginService;

/* loaded from: classes7.dex */
public final class E4A implements E4J {
    public InterfaceC79713Ax LIZ;

    @Override // X.E4J
    public final void run(Context context) {
        this.LIZ = PluginService.createIPluginServicebyMonsterPlugin(false).backgroundThreadObserveAll(EnumC35839E4t.SP_UNLOGIN_DIGG_NEW_USER_V2, new AObserverS74S0100000_6(this, 1));
    }
}
