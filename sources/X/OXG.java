package X;

import kotlin.jvm.internal.o;
import org.apache.commons.codec.binary.Base64;

/* loaded from: classes11.dex */
public final class OXG {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] encodeBase64 = Base64.encodeBase64(bArr);
        o.LJIIIIZZ(encodeBase64, "encodeBase64(bytes)");
        return new String(encodeBase64, PVC.LIZ);
    }
}
