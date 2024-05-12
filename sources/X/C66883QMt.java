package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* renamed from: X.QMt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66883QMt {
    public final String LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public final InterfaceC66884QMu LIZJ;
    public final InterfaceC65229Pir LIZLLL;

    public C66883QMt(String str, java.util.Map map, InterfaceC65229Pir mHttpClient) {
        C66885QMv c66885QMv = C66885QMv.LJIIIIZZ;
        o.LJIIJ(mHttpClient, "mHttpClient");
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = c66885QMv;
        this.LIZLLL = mHttpClient;
    }

    public static String LIZ(byte[] bArr, byte[] bArr2, InputStream inputStream) {
        if (bArr == null || bArr2 == null) {
            return C77321UWf.LJIILJJIL(new InputStreamReader(inputStream));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, new IvParameterSpec(bArr2).getIV());
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(cipher.doFinal(C62848OlY.LJFF(inputStream))));
        try {
            String LJIILJJIL = C77321UWf.LJIILJJIL(new InputStreamReader(gZIPInputStream));
            AnonymousClass636.LJFF(gZIPInputStream, null);
            return LJIILJJIL;
        } finally {
        }
    }
}
