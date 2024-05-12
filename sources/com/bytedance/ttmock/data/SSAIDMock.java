package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;

/* loaded from: classes16.dex */
public final class SSAIDMock implements IMock<String> {
    @Override // com.bytedance.ttmock.IMock
    public String get() {
        return (String) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(String str) {
        IMock.DefaultImpls.set(this, str);
    }
}
