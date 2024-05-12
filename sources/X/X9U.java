package X;

import com.bytedance.ttmock.IMock;
import com.google.gson.m;

/* loaded from: classes16.dex */
public final class X9U implements IMock<m> {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.gson.m, java.lang.Object] */
    @Override // com.bytedance.ttmock.IMock
    public final m get() {
        return IMock.DefaultImpls.get(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public final void remove() {
        IMock.DefaultImpls.remove(this);
    }

    @Override // com.bytedance.ttmock.IMock
    public final void set(m mVar) {
        IMock.DefaultImpls.set(this, mVar);
    }
}
