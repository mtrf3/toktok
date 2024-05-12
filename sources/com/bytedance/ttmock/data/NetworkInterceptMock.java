package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;

/* loaded from: classes16.dex */
public final class NetworkInterceptMock implements IMock<NetworkInterceptMockConfig> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public NetworkInterceptMockConfig get() {
        return (NetworkInterceptMockConfig) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(NetworkInterceptMockConfig networkInterceptMockConfig) {
        IMock.DefaultImpls.set(this, networkInterceptMockConfig);
    }
}
