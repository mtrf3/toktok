package X;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XC6 extends C10790bb {
    public final /* synthetic */ XC5 LIZJ;

    @Override // X.C10790bb
    public final String toString() {
        int i = this.LIZIZ;
        if (i > 0) {
            int i2 = i - 1;
            if (this.LIZ[i2] == XC5.LJFF) {
                i = i2;
            }
        }
        try {
            byte[] toString = this.LIZ;
            EnumC10800bc contentEncoding = this.LIZJ.LJ;
            o.LJIIJ(toString, "$this$toString");
            o.LJIIJ(contentEncoding, "contentEncoding");
            return new String(toString, 0, i, (Charset) new AqS165S0100000_15(contentEncoding, 910).invoke());
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XC6(int i, XC5 xc5) {
        super(i);
        this.LIZJ = xc5;
    }
}
