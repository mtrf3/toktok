package X;

import android.util.Base64;
import com.google.gson.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O0P {
    public static volatile AtomicInteger LIZ = new AtomicInteger(0);

    public static byte[] LIZ(String str) {
        boolean z;
        GZIPOutputStream gZIPOutputStream;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        if (z) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            gZIPOutputStream = gZIPOutputStream2;
        }
        try {
            Charset forName = Charset.forName("UTF-8");
            o.LJIIIIZZ(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
        } catch (IOException e2) {
            e = e2;
            gZIPOutputStream2 = gZIPOutputStream;
            C78983UzD.LJIIZILJ(e);
            e.getMessage();
            if (gZIPOutputStream2 != null) {
                gZIPOutputStream2.close();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            if (gZIPOutputStream != null) {
                gZIPOutputStream.close();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] LIZIZ(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(secretKeySpec.getEncoded(), 0, 16);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] doFinal = cipher.doFinal(bArr2);
        byte[] bArr3 = new byte[doFinal.length + 16];
        System.arraycopy(ivParameterSpec.getIV(), 0, bArr3, 0, 16);
        System.arraycopy(doFinal, 0, bArr3, 16, doFinal.length);
        return bArr3;
    }

    public static String LIZJ(m mVar, String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            byte[] LIZ2 = LIZ(mVar.toString());
            if (LIZ2 == null) {
                return null;
            }
            byte[] bytes = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            return Base64.encodeToString(LIZIZ(bytes, LIZ2), 0);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return null;
        }
    }
}
