package com.bytedance.ttmock.data;

import com.bytedance.ttmock.IMock;
import com.google.gson.g;

/* loaded from: classes16.dex */
public final class KevaMock implements IMock<g> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.ttmock.IMock
    public g get() {
        return (g) IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public void set(g gVar) {
        IMock.DefaultImpls.set(this, gVar);
    }
}
