package X;

import com.bytedance.pumbaa.common.interfaces.IStore;

/* renamed from: X.PwB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66055PwB {
    public final IStore LIZ;

    public C66055PwB(IStore iStore) {
        this.LIZ = iStore;
    }

    public final synchronized C66222Pys LIZ(String str) {
        return new C66222Pys(this.LIZ.getRepo(str, 1));
    }
}
