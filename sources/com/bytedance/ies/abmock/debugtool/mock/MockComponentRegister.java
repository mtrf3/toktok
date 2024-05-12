package com.bytedance.ies.abmock.debugtool.mock;

import X.FI3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MockComponentRegister {
    public static final MockComponentRegister INSTANCE = new MockComponentRegister();

    public static final FI3 getConfigMock(int i) {
        return null;
    }

    public static final void registerComponent(IMockComponent component) {
        o.LJIIJ(component, "component");
    }
}
