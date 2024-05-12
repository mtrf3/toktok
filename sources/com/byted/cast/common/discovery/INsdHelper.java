package com.byted.cast.common.discovery;

import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.ILibraryLoader;
import java.util.Map;

/* loaded from: classes29.dex */
public interface INsdHelper {
    int getNsdHelperType();

    String registerService(String str, String str2, int i, Map<String, String> map, NsdListener nsdListener);

    void setDiscoveryTimeout(int i);

    void setLibraryLoader(ILibraryLoader iLibraryLoader);

    void setLogEnabled(boolean z);

    void setNsdListener(NsdListener nsdListener);

    String startDiscovery(ContextManager.CastContext castContext, String str, String str2, NsdListener nsdListener);

    String startDiscovery(String str, String str2, NsdListener nsdListener);

    void stopDiscovery(ContextManager.CastContext castContext, String str);

    void stopDiscovery(String str);

    void unregisterService(String str);
}
