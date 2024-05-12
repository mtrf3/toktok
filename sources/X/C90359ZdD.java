package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.ZdD, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90359ZdD {
    public static final Charset LIZ;
    public static final byte[] LIZIZ;

    public static int LIZ(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("US-ASCII");
        LIZ = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        LIZIZ = bArr;
        ByteBuffer.wrap(bArr);
        C90373ZdR c90373ZdR = new C90373ZdR();
        try {
            int i = c90373ZdR.LIZ + c90373ZdR.LIZIZ;
        } catch (C90365ZdJ e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Object LIZIZ(Object obj, Object obj2) {
        C90891Zln LJIILJJIL = ((InterfaceC90712Ziu) obj).LJIILJJIL();
        InterfaceC90712Ziu interfaceC90712Ziu = (InterfaceC90712Ziu) obj2;
        LJIILJJIL.getClass();
        if (LJIILJJIL.LJLIL.getClass().isInstance(interfaceC90712Ziu)) {
            LJIILJJIL.LIZIZ((AbstractC90950Zmk) ((AbstractC90893Zlp) interfaceC90712Ziu));
            return LJIILJJIL.LIZLLL();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
