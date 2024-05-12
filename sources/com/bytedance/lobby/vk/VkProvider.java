package com.bytedance.lobby.vk;

import X.F6Y;
import X.QBW;
import X.QBY;
import X.QCI;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.tpsw.api.vk.IVKService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* loaded from: classes12.dex */
public class VkProvider<T> extends BaseProvider<T> {
    public volatile boolean LJLJJI;

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void onCreate() {
        IVKService gv0;
        if (!this.LJLJJI && (gv0 = gv0()) != null) {
            this.LJLJJI = true;
            gv0.LIZLLL(getApplication(), TokenCert.with("bpea-vk_androidsdk_1208"));
        }
    }

    public static IVKService gv0() {
        try {
            return (IVKService) ServiceManager.get().getService(IVKService.class, false, false, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.lobby.internal.BaseProvider, X.QB9
    public final void init() {
        onCreate();
    }

    public VkProvider(QCI qci) {
        super(LobbyCore.getApplication(), qci);
        this.LJLJJI = false;
    }

    public final void hv0(F6Y f6y) {
        QBY pluginService = LobbyCore.getPluginService();
        if (pluginService == null) {
            f6y.onFailed("com.ss.android.ugc.aweme.df_vksdk", true, 4001);
            return;
        }
        if (!pluginService.enableInstall()) {
            f6y.onFailed("com.ss.android.ugc.aweme.df_vksdk", true, 4001);
        } else if (pluginService.LIZ()) {
            f6y.onSuccess("com.ss.android.ugc.aweme.df_vksdk", true);
        } else {
            pluginService.LIZIZ(new QBW(this, pluginService, f6y));
        }
    }
}
