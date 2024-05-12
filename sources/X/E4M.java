package X;

import Y.AObserverS74S0100000_6;
import android.content.Context;
import com.ss.android.ugc.aweme.plugin.PluginService;

/* loaded from: classes7.dex */
public final class E4M implements E4J {
    public InterfaceC79713Ax LIZ;

    @Override // X.E4J
    public final void run(Context context) {
        this.LIZ = PluginService.createIPluginServicebyMonsterPlugin(false).backgroundThreadObserveFirst(EnumC35839E4t.PREVIOUS_LOGIN_DATA, new AObserverS74S0100000_6(this, 0));
    }
}
