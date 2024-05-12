package com.bytedance.bdlocation.df;

import android.content.Context;
import java.util.List;

/* loaded from: classes16.dex */
public interface ILocationPluginService {
    boolean checkPluginInstalled(String str);

    boolean enableInstall();

    List<String> getInstalledModules();

    List<String> getInstalledPackageNames();

    void install(String str, ILocationPluginInstallListener iLocationPluginInstallListener);

    boolean splitCompatInstall(Context context);

    boolean splitCompatInstallActivity(Context context);
}
