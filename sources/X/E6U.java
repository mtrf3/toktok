package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E6U implements LEA {
    public static final E6U LJLIL = new E6U();

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z && i == 3) {
            IPluginService createIPluginServicebyMonsterPlugin = PluginService.createIPluginServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIPluginServicebyMonsterPlugin, "get().getService(IPluginService::class.java)");
            E5I.LIZ(createIPluginServicebyMonsterPlugin, null, false, 102, 31);
        }
    }
}
