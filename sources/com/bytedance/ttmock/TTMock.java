package com.bytedance.ttmock;

import android.app.Application;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TTMock {
    public static final TTMock INSTANCE = new TTMock();

    public final String getDataFromDisk() {
        return null;
    }

    public final String getDataFromDiskNoCache() {
        return null;
    }

    public final /* synthetic */ <T extends IMock<?>> T getMock() {
        return null;
    }

    public final Object getMockDelegate(Class<? extends IMock<?>> clazz) {
        o.LJIIIZ(clazz, "clazz");
        return null;
    }

    public final boolean hasTTMockInDisk() {
        return false;
    }

    public final boolean hasTTMockInit() {
        return false;
    }

    public final void init(Application application) {
        o.LJIIIZ(application, "application");
    }
}
