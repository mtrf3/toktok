package com.byted.cast.common.discovery;

/* loaded from: classes29.dex */
public interface NsdListener {
    void onNsdDiscoveryFinished();

    void onNsdError(String str, int i, String str2);

    void onNsdRegistered(NsdService nsdService);

    void onNsdServiceFound(NsdService nsdService);

    void onNsdServiceLost(NsdService nsdService);

    void onNsdServiceResolved(NsdService nsdService);

    void onNsdUnRegistered(NsdService nsdService);
}
