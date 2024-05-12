package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;

/* loaded from: classes16.dex */
public final class PopupMock implements IMock<PopupMockConfig> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public PopupMockConfig get() {
        return (PopupMockConfig) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(PopupMockConfig popupMockConfig) {
        IMock.DefaultImpls.set(this, popupMockConfig);
    }
}
