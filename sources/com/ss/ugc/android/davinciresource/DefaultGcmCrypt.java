package com.ss.ugc.android.davinciresource;

import X.PVC;
import X.X1D;
import android.util.Base64;
import com.ss.ugc.android.davinciresource.jni.DAVGcmCryptFunc;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class DefaultGcmCrypt extends DAVGcmCryptFunc {
    public static final DefaultGcmCrypt INSTANCE = new DefaultGcmCrypt();

    @Override // com.ss.ugc.android.davinciresource.jni.DAVGcmCryptFunc
    public String decrypt(String str, String str2) {
        byte[] bArr;
        try {
            byte[] bArr2 = new byte[12];
            if (str != null) {
                bArr = str.getBytes(PVC.LIZ);
                o.LJFF(bArr, "(this as java.lang.String).getBytes(charset)");
            } else {
                bArr = null;
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
            byte[] doFinal = cipher.doFinal(Base64.decode(str2, 0));
            o.LJFF(doFinal, "cipher.doFinal(Base64.de…aString, Base64.DEFAULT))");
            return new String(doFinal, PVC.LIZ);
        } catch (Exception e) {
            DAVLoggerListener logger = DavinciResource.INSTANCE.getLogger();
            if (logger != null) {
                DAVLogLevel dAVLogLevel = DAVLogLevel.LEVEL_ERROR;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DefaultGcmCrypt: Error while decrypting ");
                LIZ.append(str2);
                LIZ.append(", exception: ");
                LIZ.append(e);
                logger.onLog(dAVLogLevel, X1D.LIZIZ(LIZ));
                return "";
            }
            return "";
        }
    }
}
