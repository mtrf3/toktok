package com.ss.android.ugc.aweme.net;

import X.C58096Mr6;
import X.EF7;
import com.ss.android.ugc.aweme.launcher.service.network.INetworkApi;
import com.ss.android.ugc.aweme.net.corenet.IESNetDepend;

/* loaded from: classes7.dex */
public final class NetworkApiImpl implements INetworkApi {
    public static INetworkApi LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(INetworkApi.class, false);
        if (LIZ != null) {
            return (INetworkApi) LIZ;
        }
        if (C58096Mr6.j3 == null) {
            synchronized (INetworkApi.class) {
                if (C58096Mr6.j3 == null) {
                    C58096Mr6.j3 = new NetworkApiImpl();
                }
            }
        }
        return C58096Mr6.j3;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.network.INetworkApi
    public final String LIZ() {
        if (IESNetDepend.LIZ == null) {
            synchronized (IESNetDepend.class) {
                if (IESNetDepend.LIZ == null) {
                    IESNetDepend.LIZ = new IESNetDepend();
                }
            }
        }
        return IESNetDepend.LIZ.LIZ(EF7.LIZIZ(), "frontier_urls");
    }
}
