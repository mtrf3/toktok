package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZY implements NXI {
    public final /* synthetic */ NZQ LIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.NaV, X.NZR] */
    @Override // X.NXI
    public final NZR LIZ() {
        ?? r0 = this.LIZ.LJLJL;
        if (r0 != 0) {
            return r0;
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    @Override // X.NXI
    public final boolean canGoBack() {
        return this.LIZ.canGoBack();
    }

    public NZY(NZQ nzq) {
        this.LIZ = nzq;
    }

    @Override // X.NXI
    public final void LIZIZ(String str) {
        if (str != null) {
            NZQ.LJIJI(this.LIZ, str, false, null, 14);
        }
    }
}
