package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;

/* loaded from: classes16.dex */
public final class AccountMock implements IMock<AccountMockConfig> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public AccountMockConfig get() {
        return (AccountMockConfig) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(AccountMockConfig accountMockConfig) {
        IMock.DefaultImpls.set(this, accountMockConfig);
    }
}
