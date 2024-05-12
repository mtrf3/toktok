package com.bytedance.netecho;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class NetechoConfig {
    public static final NetechoConfig INSTANCE = new NetechoConfig();
    public static InterfaceC88472Yns<? super String, C76800UCe> loadLibrary = NetechoConfig$loadLibrary$1.INSTANCE;

    public final InterfaceC88472Yns<String, C76800UCe> getLoadLibrary() {
        return loadLibrary;
    }

    public final void setLoadLibrary(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIJ(interfaceC88472Yns, "<set-?>");
        loadLibrary = interfaceC88472Yns;
    }
}
