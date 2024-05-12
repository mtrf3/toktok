package X;

import X.InterfaceC57357MfB;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XGY<D extends InterfaceC57357MfB> {
    public final XGS LIZ;
    public D LIZIZ;
    public C57301MeH LIZJ;

    public final XGX<D> LIZ() {
        C57301MeH c57301MeH = this.LIZJ;
        if (c57301MeH != null) {
            if ((c57301MeH instanceof C84555XGl) || (c57301MeH instanceof C84554XGk)) {
                return new XGU(this.LIZ, c57301MeH);
            }
            return new XGT(this.LIZ, c57301MeH);
        }
        D d = this.LIZIZ;
        if (d != null) {
            return new XGW(this.LIZ, d);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error and data is null: ");
        LIZ.append(this.LIZ);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public XGY(XGS request) {
        o.LJIIIZ(request, "request");
        this.LIZ = request;
    }
}
