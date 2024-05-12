package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.mutilinstance.DelegateCoreProvider;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PitayaCoreFactory implements ReflectionCall {
    public static final PitayaCoreFactory INSTANCE = new PitayaCoreFactory();
    public static final CoreProvider provider = DelegateCoreProvider.INSTANCE;

    public final CoreProvider getProvider() {
        return provider;
    }

    public static final IPitayaCore getCore(String aid) {
        o.LJIIJ(aid, "aid");
        return provider.getCore(aid);
    }
}
