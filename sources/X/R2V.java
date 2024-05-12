package X;

import com.bytedance.scalpel.protos.PerfDataRequest;

/* loaded from: classes12.dex */
public final class R2V implements R2U {
    public final C30941Ji LIZ;

    @Override // X.R2U
    public final void LIZIZ(C30941Ji c30941Ji) {
    }

    @Override // X.R2U
    public final void onError() {
    }

    @Override // X.R2U
    public final C30941Ji LIZ() {
        return this.LIZ;
    }

    public R2V(PerfDataRequest perfDataRequest) {
        C30941Ji c30941Ji = new C30941Ji(1);
        c30941Ji.LJLIL = perfDataRequest.encode();
        this.LIZ = c30941Ji;
    }
}
