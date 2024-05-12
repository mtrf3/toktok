package X;

import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: X.QAw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66574QAw {
    public static final SecureRandom LIZ = new SecureRandom();

    public static String LIZ() {
        byte[] bArr = new byte[16];
        LIZ.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
