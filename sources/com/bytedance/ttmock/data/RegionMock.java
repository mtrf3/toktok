package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;

/* loaded from: classes16.dex */
public final class RegionMock implements IMock<RegionMockConfig> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public RegionMockConfig get() {
        return (RegionMockConfig) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(RegionMockConfig regionMockConfig) {
        IMock.DefaultImpls.set(this, regionMockConfig);
    }
}
