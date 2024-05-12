package com.bytedance.pitaya.api.mutilinstance;

import X.C37692Eqm;
import com.bytedance.pitaya.api.CoreProvider;
import com.bytedance.pitaya.api.IPitayaCore;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DelegateCoreProvider implements CoreProvider {
    public static final DelegateCoreProvider INSTANCE = new DelegateCoreProvider();
    public static final Map<String, IPitayaCore> cores = new LinkedHashMap();
    public static CoreProvider realProvider;

    public final CoreProvider getRealProvider() {
        return realProvider;
    }

    @Override // com.bytedance.pitaya.api.CoreProvider
    public IPitayaCore getCore(String aid) {
        IPitayaCore iPitayaCore;
        o.LJIIJ(aid, "aid");
        Map<String, IPitayaCore> map = cores;
        synchronized (map) {
            iPitayaCore = map.get(aid);
            if (iPitayaCore == null) {
                CoreProvider coreProvider = realProvider;
                if (coreProvider == null || (iPitayaCore = coreProvider.getCore(aid)) == null) {
                    iPitayaCore = new DelegateCore(aid);
                }
                map.put(aid, iPitayaCore);
            }
        }
        return iPitayaCore;
    }

    public final void setRealProvider(CoreProvider coreProvider) {
        IPitayaCore iPitayaCore;
        Map<String, IPitayaCore> map = cores;
        synchronized (map) {
            if (coreProvider != null) {
                if (realProvider == null) {
                    realProvider = coreProvider;
                    for (Map.Entry<String, IPitayaCore> entry : map.entrySet()) {
                        if (entry.getValue() instanceof DelegateCore) {
                            IPitayaCore value = entry.getValue();
                            if (value != null) {
                                DelegateCore delegateCore = (DelegateCore) value;
                                CoreProvider coreProvider2 = realProvider;
                                if (coreProvider2 != null) {
                                    iPitayaCore = coreProvider2.getCore(entry.getKey());
                                } else {
                                    iPitayaCore = null;
                                }
                                delegateCore.setRealCore$pitayacore_release(iPitayaCore);
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.pitaya.api.mutilinstance.DelegateCore");
                            }
                        }
                    }
                }
            }
        }
    }
}
