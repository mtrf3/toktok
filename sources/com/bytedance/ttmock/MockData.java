package com.bytedance.ttmock;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MockData extends F9E {
    public final IMock<?> mock;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MockData copy$default(MockData mockData, IMock iMock, int i, Object obj) {
        if ((i & 1) != 0) {
            iMock = mockData.mock;
        }
        return mockData.copy(iMock);
    }

    public final MockData copy(IMock<?> mock) {
        o.LJIIIZ(mock, "mock");
        return new MockData(mock);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.mock};
    }

    public final IMock<?> getMock() {
        return this.mock;
    }

    public MockData(IMock<?> mock) {
        o.LJIIIZ(mock, "mock");
        this.mock = mock;
    }
}
