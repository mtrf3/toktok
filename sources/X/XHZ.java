package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XHZ extends XHX {
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

    public XHZ(String identity) {
        o.LJIIIZ(identity, "identity");
        this.LIZIZ = identity;
        C84573XHd c84573XHd = C84573XHd.LIZIZ;
        int i = c84573XHd.LIZ;
        c84573XHd.LIZ = i | i;
        this.LIZJ = c84573XHd;
    }
}
