package X;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* renamed from: X.0Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09080Xg {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, byte[] cryptKey) {
        o.LJIIJ(cryptKey, "cryptKey");
        if (str != null) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(cryptKey, "AES"), new GCMParameterSpec(128, new byte[12]));
            byte[] doFinal = cipher.doFinal(Base64.decode(str, 0));
            o.LJFF(doFinal, "cipher.doFinal(Base64.de…content, Base64.DEFAULT))");
            return new String(doFinal, PVC.LIZ);
        }
        throw new RuntimeException("decrypt failed: content null");
    }
}
