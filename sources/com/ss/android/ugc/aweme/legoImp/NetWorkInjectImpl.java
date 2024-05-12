package com.ss.android.ugc.aweme.legoImp;

import X.C36365EOz;
import X.C58096Mr6;
import X.FKM;
import com.ss.android.common.util.INetWorkInject;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NetWorkInjectImpl implements INetWorkInject {
    public static INetWorkInject LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(INetWorkInject.class, false);
        if (LIZ != null) {
            return (INetWorkInject) LIZ;
        }
        if (C58096Mr6.g2 == null) {
            synchronized (INetWorkInject.class) {
                if (C58096Mr6.g2 == null) {
                    C58096Mr6.g2 = new NetWorkInjectImpl();
                }
            }
        }
        return C58096Mr6.g2;
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final C36365EOz LIZ() {
        return new C36365EOz();
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final String getUserAgentString() {
        String property = System.getProperty("http.agent");
        o.LJIIIIZZ(property, "getProperty(\"http.agent\")");
        return property;
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final AwemeHostApplication getAppContext() {
        return FKM.LIZ();
    }
}
