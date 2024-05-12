package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XHR extends XHX {
    public final String LIZIZ;
    public final C84573XHd LIZJ;

    @Override // X.XHI
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.XHX
    public final AbstractC84571XHb LIZIZ() {
        return this.LIZJ;
    }

    public XHR(String identity) {
        o.LJIIIZ(identity, "identity");
        this.LIZIZ = identity;
        C84573XHd c84573XHd = C84573XHd.LIZIZ;
        c84573XHd.LIZ = C84574XHe.LIZIZ.LIZ | c84573XHd.LIZ;
        this.LIZJ = c84573XHd;
    }
}
