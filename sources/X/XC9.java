package X;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XC9 {
    public static final String LIZ(byte[] bArr, EnumC10800bc contentEncoding) {
        o.LJIIJ(contentEncoding, "contentEncoding");
        return new String(bArr, (Charset) new AqS165S0100000_15(contentEncoding, 822).invoke());
    }
}
