package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;

/* loaded from: classes16.dex */
public final class BoeMock implements IMock<BoeMockEntity> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public BoeMockEntity get() {
        return (BoeMockEntity) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(BoeMockEntity boeMockEntity) {
        IMock.DefaultImpls.set(this, boeMockEntity);
    }
}
