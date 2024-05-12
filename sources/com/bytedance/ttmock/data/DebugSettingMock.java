package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;

/* loaded from: classes16.dex */
public final class DebugSettingMock implements IMock<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public Boolean get() {
        return (Boolean) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public /* bridge */ /* synthetic */ void set(Boolean bool) {
        set(bool.booleanValue());
    }

    public void set(boolean z) {
        IMock.DefaultImpls.set(this, Boolean.valueOf(z));
    }
}
