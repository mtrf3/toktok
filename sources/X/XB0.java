package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XB0 {
    public XB8 LIZ;
    public X62 LIZIZ;
    public EnumC124214u9 LIZJ;
    public XBB LIZLLL;

    public final XB4 LIZ() {
        if (this.LIZIZ != null) {
            if (this.LIZ != null) {
                X62 x62 = this.LIZIZ;
                if (x62 != null) {
                    XB8 xb8 = this.LIZ;
                    if (xb8 != null) {
                        return new XB4(x62, xb8, this.LIZLLL, this.LIZJ);
                    }
                    o.LJIJI("writeDisk");
                    throw null;
                }
                o.LJIJI("networkClient");
                throw null;
            }
            throw new IllegalArgumentException("cacheStrategy is required to setup!");
        }
        throw new IllegalArgumentException("networkClient is required to setup!");
    }
}
