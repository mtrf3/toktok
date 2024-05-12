package X;

import Y.AObserverS69S0100000_1;
import android.content.Context;
import com.ss.android.ugc.aweme.plugin.PluginService;

/* renamed from: X.2Ol, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57752Ol implements E4J {
    public InterfaceC79713Ax LIZ;

    @Override // X.E4J
    public final void run(Context context) {
        this.LIZ = PluginService.createIPluginServicebyMonsterPlugin(false).backgroundThreadObserveFirstPluginData(EnumC35839E4t.PROGRESS_BAR_DATA, new AObserverS69S0100000_1(this, 3));
    }
}
