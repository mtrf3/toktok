package com.ss.android.ugc.effectmanager.common.encrypt;

import X.C37692Eqm;
import X.PVC;
import X.X1D;
import android.util.Base64;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AES {
    public static final AES INSTANCE = new AES();
    public static boolean hasInitialized;
    public static IvParameterSpec ivParameterSpec;
    public static SecretKeySpec secretKeySpec;

    private final synchronized boolean checkIfInitialized() {
        byte[] generateSecretKey;
        if (!hasInitialized && (generateSecretKey = generateSecretKey()) != null) {
            AES aes = INSTANCE;
            secretKeySpec = aes.initSecretKeySpec(generateSecretKey);
            ivParameterSpec = aes.initIvParameterSpec(generateSecretKey);
            hasInitialized = true;
        }
        return hasInitialized;
    }

    private final byte[] generateSecretKey() {
        String platformSDKVersion = EPUtils.getPlatformSDKVersion();
        byte[] bArr = null;
        if (platformSDKVersion == null) {
            return null;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(platformSDKVersion);
            LIZ.append(":android");
            String mD5String16Bit = MD5Utils.getMD5String16Bit(X1D.LIZIZ(LIZ));
            o.LJFF(mD5String16Bit, "MD5Utils.getMD5String16Bit(\"${it}:android\")");
            Charset forName = Charset.forName("UTF-8");
            o.LJFF(forName, "Charset.forName(charsetName)");
            byte[] bytes = mD5String16Bit.getBytes(forName);
            o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr = bytes;
            return bArr;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("generateSecretKey error, ");
            LIZ2.append(e.getMessage());
            EPLog.e("AES_TAG", X1D.LIZIZ(LIZ2));
            return bArr;
        }
    }

    public static final String decrypt(String str) {
        AES aes = INSTANCE;
        if (!aes.checkIfInitialized() || str == null || ujb.o.LJJJJJL(str)) {
            return "";
        }
        return aes.decryptInternal(str);
    }

    public static final List<String> decryptArray(List<String> list) {
        if (!INSTANCE.checkIfInitialized() || CollectionUtil.isListEmpty(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String decrypt = decrypt(it.next());
                if (decrypt != null) {
                    arrayList.add(decrypt);
                }
            }
            return arrayList;
        }
        o.LJIIZILJ();
        throw null;
    }

    private final String decryptInternal(String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = cipher.doFinal(Base64.decode(str, 0));
            o.LJFF(doFinal, "cipher.doFinal(Base64.de…content, Base64.DEFAULT))");
            return new String(doFinal, PVC.LIZ);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error while decrypting ");
            LIZ.append(str);
            LIZ.append(", exception: ");
            LIZ.append(e);
            EPLog.d("AES_TAG", X1D.LIZIZ(LIZ));
            return "";
        }
    }

    public static final String encrypt(String str) {
        boolean z;
        if (INSTANCE.checkIfInitialized()) {
            if (str == null || ujb.o.LJJJJJL(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    Charset forName = Charset.forName("UTF-8");
                    o.LJFF(forName, "Charset.forName(charsetName)");
                    if (str != null) {
                        byte[] bytes = str.getBytes(forName);
                        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                        return Base64.encodeToString(cipher.doFinal(bytes), 0);
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
                } catch (Exception e) {
                    System.out.println((Object) ("Error while encrypting: " + e));
                }
            }
        }
        return "";
    }

    private final IvParameterSpec initIvParameterSpec(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    private final SecretKeySpec initSecretKeySpec(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }
}
