package com.ss.ugc.live.sdk.message;

import X.C32075CiN;
import X.YRU;
import X.YRV;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MessageManagerFactory {
    public static final MessageManagerFactory INSTANCE = new MessageManagerFactory();

    public final IMessageManager get(C32075CiN configuration, boolean z) {
        o.LJIIIZ(configuration, "configuration");
        YRU yru = new YRU();
        yru.LJII(configuration);
        return new YRV(yru, z);
    }

    public static /* synthetic */ IMessageManager get$default(MessageManagerFactory messageManagerFactory, C32075CiN c32075CiN, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return messageManagerFactory.get(c32075CiN, z);
    }
}
