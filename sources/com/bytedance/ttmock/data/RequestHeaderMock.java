package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;
import com.google.gson.m;

/* loaded from: classes16.dex */
public final class RequestHeaderMock implements IMock<m> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public m get() {
        return (m) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(m mVar) {
        IMock.DefaultImpls.set(this, mVar);
    }
}
