package com.bytedance.bdlocation;

import android.content.Context;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.IBDLocationClient;
import com.bytedance.bdlocation.df.ILocationPluginInstallListener;
import com.bytedance.bdlocation.df.ILocationPluginService;
import com.bytedance.bdlocation.init.BDLocationAgentImpl;
import com.bytedance.bdlocation.init.IBDLocationAgent;
import com.ss.android.ugc.tiktok.location_api.service.LocationPluginServiceImpl;

/* loaded from: classes16.dex */
public class BDLocationSpi {
    public static IBDLocationAgent getBDLocationAgent() {
        try {
            return BDLocationAgentImpl.createIBDLocationAgentbyMonsterPlugin(false);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static IBDLocationClient getBDLocationClient() {
        try {
            return BDLocationClient.createIBDLocationClientbyMonsterPlugin(false);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ILocationPluginService getBDLocationPluginService() {
        try {
            return LocationPluginServiceImpl.LIZ();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void installLocationPlugin(final Context context, final ILocationPluginInstallListener iLocationPluginInstallListener) {
        final ILocationPluginService bDLocationPluginService = getBDLocationPluginService();
        if (bDLocationPluginService == null) {
            iLocationPluginInstallListener.onFailed("com.ss.android.ugc.aweme.df_location", true, 4001);
            return;
        }
        if (!bDLocationPluginService.enableInstall()) {
            iLocationPluginInstallListener.onFailed("com.ss.android.ugc.aweme.df_location", true, 4001);
        } else if (bDLocationPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_location")) {
            iLocationPluginInstallListener.onSuccess("com.ss.android.ugc.aweme.df_location", true);
        } else {
            bDLocationPluginService.install("com.ss.android.ugc.aweme.df_location", new ILocationPluginInstallListener() { // from class: com.bytedance.bdlocation.BDLocationSpi.1
                @Override // com.bytedance.bdlocation.df.ILocationPluginInstallListener
                public void onSuccess(String str, boolean z) {
                    ILocationPluginService.this.splitCompatInstall(context);
                    iLocationPluginInstallListener.onSuccess(str, z);
                }

                @Override // com.bytedance.bdlocation.df.ILocationPluginInstallListener
                public void onFailed(String str, boolean z, int i) {
                    iLocationPluginInstallListener.onFailed(str, z, i);
                }
            });
        }
    }
}
