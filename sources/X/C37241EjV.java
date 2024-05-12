package X;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.o;

/* renamed from: X.EjV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37241EjV implements InterfaceC37242EjW {
    public final String LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public C37241EjV(String key) {
        o.LJIIIZ(key, "key");
        this.LIZIZ = key;
    }

    public final void LIZ(MessageDigest messageDigest) {
        o.LJIIIZ(messageDigest, "messageDigest");
        String str = this.LIZIZ;
        Charset CHARSET = InterfaceC37242EjW.LIZ;
        o.LJIIIIZZ(CHARSET, "CHARSET");
        byte[] bytes = str.getBytes(CHARSET);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
    }

    public final boolean equals(Object obj) {
        C37241EjV c37241EjV;
        String str = this.LIZIZ;
        String str2 = null;
        if ((obj instanceof C37241EjV) && (c37241EjV = (C37241EjV) obj) != null) {
            str2 = c37241EjV.LIZIZ;
        }
        return o.LJ(str, str2);
    }
}
