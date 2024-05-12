package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.C64386POs;
import X.C64388POu;
import X.POX;
import com.ss.android.ugc.aweme.network.spi.INetworkContextService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class NetworkContextService implements INetworkContextService {
    public final ConcurrentHashMap<String, C64388POu> contextMap = new ConcurrentHashMap<>();

    public static INetworkContextService createINetworkContextServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(INetworkContextService.class, z);
        if (LIZ != null) {
            return (INetworkContextService) LIZ;
        }
        if (C58096Mr6.R5 == null) {
            synchronized (INetworkContextService.class) {
                if (C58096Mr6.R5 == null) {
                    C58096Mr6.R5 = new NetworkContextService();
                }
            }
        }
        return C58096Mr6.R5;
    }

    public String bindSpan(String str) {
        if (str == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String LIZIZ = C64386POs.LIZIZ.LIZIZ(null);
        this.contextMap.put(str, new C64388POu(LIZIZ, currentTimeMillis));
        return LIZIZ;
    }

    public C64388POu getNetworkContext(String str) {
        if (str == null) {
            return null;
        }
        return this.contextMap.get(str);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkContextService
    public C64388POu removeNetworkContext(String str) {
        if (str == null) {
            return null;
        }
        return this.contextMap.remove(str);
    }

    public String bindSubSpan(String str, String spanId) {
        o.LJIIIZ(spanId, "spanId");
        if (str == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String LJI = POX.LIZIZ.LJI(spanId);
        this.contextMap.put(str, new C64388POu(LJI, currentTimeMillis));
        return LJI;
    }
}
