package com.bytedance.ies.ugc.aweme.plugin.service;

import X.C37123Ehb;
import X.C37131Ehj;
import java.util.List;

/* loaded from: classes7.dex */
public interface IPluginService {
    void LIZ(C37131Ehj c37131Ehj);

    void LIZIZ();

    C37123Ehb LIZJ();

    boolean checkPluginInstalled(String str);

    void enableInstall();

    List<String> getInstalledModules();

    List<String> getInstalledPackageNames();

    void init();

    boolean loadLibrary(String str);
}
