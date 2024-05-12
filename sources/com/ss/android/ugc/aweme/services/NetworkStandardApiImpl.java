package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.FBC;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.network.spi.INetworkStandardApi;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NetworkStandardApiImpl implements INetworkStandardApi {
    public final CopyOnWriteArrayList<Object> safetyListeners = new CopyOnWriteArrayList<>();

    public NetworkStandardApiImpl() {
        EffectiveConnectionTypeDispatcher.INSTANCE.setNetworkStandardApi$aweme_network_release(this);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public int getEffectiveConnectionType() {
        return TTNetInit.getEffectiveConnectionType();
    }

    /* loaded from: classes7.dex */
    public static final class EffectiveConnectionTypeDispatcher {
        public static final EffectiveConnectionTypeDispatcher INSTANCE = new EffectiveConnectionTypeDispatcher();
        public static volatile NetworkStandardApiImpl networkStandardApi;

        public final void notifyEffectiveConnectionTypeChanged(int i) {
            NetworkStandardApiImpl networkStandardApiImpl = networkStandardApi;
            if (networkStandardApiImpl != null) {
                networkStandardApiImpl.notifyEffectiveConnectionTypeChanged(i);
            }
        }

        public final void setNetworkStandardApi$aweme_network_release(NetworkStandardApiImpl networkStandardApi2) {
            o.LJIIIZ(networkStandardApi2, "networkStandardApi");
            networkStandardApi = networkStandardApi2;
        }
    }

    public static INetworkStandardApi createINetworkStandardApibyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(INetworkStandardApi.class, z);
        if (LIZ != null) {
            return (INetworkStandardApi) LIZ;
        }
        if (C58096Mr6.U5 == null) {
            synchronized (INetworkStandardApi.class) {
                if (C58096Mr6.U5 == null) {
                    C58096Mr6.U5 = new NetworkStandardApiImpl();
                }
            }
        }
        return C58096Mr6.U5;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public void addEffectiveConnectionTypeChangedListener(FBC callback) {
        o.LJIIIZ(callback, "callback");
        if (!this.safetyListeners.contains(callback)) {
            this.safetyListeners.add(callback);
        }
    }

    public final void notifyEffectiveConnectionTypeChanged(int i) {
        Iterator<Object> it = this.safetyListeners.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof FBC) {
                ((FBC) next).onEffectiveConnectionTypeChanged(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public void removeEffectiveConnectionTypeChangedListener(FBC callback) {
        o.LJIIIZ(callback, "callback");
        this.safetyListeners.remove(callback);
    }
}
