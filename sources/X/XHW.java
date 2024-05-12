package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XHW extends XHX {
    public final String LIZIZ;
    public final C84574XHe LIZJ;

    @Override // X.XHI
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.XHX
    public final AbstractC84571XHb LIZIZ() {
        return this.LIZJ;
    }

    public XHW(String identity) {
        o.LJIIIZ(identity, "identity");
        this.LIZIZ = identity;
        C84574XHe c84574XHe = C84574XHe.LIZIZ;
        c84574XHe.LIZ = C84573XHd.LIZIZ.LIZ | c84574XHe.LIZ;
        this.LIZJ = c84574XHe;
    }
}
