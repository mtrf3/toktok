package com.bytedance.ies.abmock.debugtool.mock;

import X.FI3;
import android.content.Context;

/* loaded from: classes7.dex */
public class ConfigMock implements FI3 {
    public static final ConfigMock INSTANCE = new ConfigMock();

    public void delete(String str) {
    }

    public void deleteAll() {
    }

    @Override // X.FI3
    public boolean enable() {
        return false;
    }

    @Override // X.FI3
    public Object get(String str) {
        return null;
    }

    public <T> T get(String str, T t) {
        return null;
    }

    public boolean hasMock(String str) {
        return false;
    }

    @Override // X.FI3
    public void init(Context context) {
    }

    public void put(String str, Object obj) {
    }
}
