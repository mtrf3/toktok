package com.kakao.sdk.common.util;

import X.PVC;
import android.util.Base64;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ContextInfo;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AESCipher implements Cipher {
    public static final Companion Companion = new Companion();
    public final Charset charSet;
    public final String cipherAlgorithm;
    public final javax.crypto.Cipher decryptor;
    public final javax.crypto.Cipher encryptor;
    public final byte[] initVector;
    public final IvParameterSpec ivParameterSpec;
    public final String keyGenAlgorithm;

    /* JADX WARN: Multi-variable type inference failed */
    public AESCipher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AESCipher(ContextInfo contextInfo) {
        o.LJIIIZ(contextInfo, "contextInfo");
        String base64DecodeAndXor = base64DecodeAndXor("My0oeSI1IzInbyA+LVFaW2wiNSokPAMiMipOLS4=");
        this.keyGenAlgorithm = base64DecodeAndXor;
        String base64DecodeAndXor2 = base64DecodeAndXor("Iio+ASgjKE4/ZSIjXDMOCUoCDww=");
        this.cipherAlgorithm = base64DecodeAndXor2;
        this.charSet = PVC.LIZ;
        byte[] bArr = {112, 78, 75, 55, -54, -30, -10, 44, 102, -126, -126, 92, -116, -48, -123, -55};
        this.initVector = bArr;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        this.ivParameterSpec = ivParameterSpec;
        String signingKeyHash = contextInfo.getSigningKeyHash();
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(base64DecodeAndXor);
        String substring = signingKeyHash.substring(0, Math.min(signingKeyHash.length(), 16));
        o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        char[] charArray = substring.toCharArray();
        o.LJIIIIZZ(charArray, "(this as java.lang.String).toCharArray()");
        SecretKey generateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(charArray, contextInfo.getSalt(), 2, 256));
        SecretKeySpec secretKeySpec = new SecretKeySpec(generateSecret.getEncoded(), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(base64DecodeAndXor2);
        o.LJIIIIZZ(cipher, "getInstance(cipherAlgorithm)");
        this.encryptor = cipher;
        javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance(base64DecodeAndXor2);
        o.LJIIIIZZ(cipher2, "getInstance(cipherAlgorithm)");
        this.decryptor = cipher2;
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            cipher2.init(2, secretKeySpec, ivParameterSpec);
        } catch (InvalidKeyException unused) {
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(Arrays.copyOfRange(generateSecret.getEncoded(), 0, generateSecret.getEncoded().length / 2), "AES");
            this.encryptor.init(1, secretKeySpec2, this.ivParameterSpec);
            this.decryptor.init(2, secretKeySpec2, this.ivParameterSpec);
        }
    }

    private final String base64DecodeAndXor(String str) {
        byte[] decode = Base64.decode(str, 0);
        o.LJIIIIZZ(decode, "decode(source, Base64.DEFAULT)");
        return xorMessage(new String(decode, PVC.LIZ));
    }

    private final String xorMessage(String str) {
        return xorMessage(str, "com.kakao.api");
    }

    @Override // com.kakao.sdk.common.util.Cipher
    public String decrypt(String encrypted) {
        o.LJIIIZ(encrypted, "encrypted");
        byte[] doFinal = this.decryptor.doFinal(Base64.decode(encrypted, 2));
        o.LJIIIIZZ(doFinal, "decryptor.doFinal(Base64.decode(encrypted, Base64.NO_WRAP))");
        return new String(doFinal, this.charSet);
    }

    @Override // com.kakao.sdk.common.util.Cipher
    public String encrypt(String value) {
        o.LJIIIZ(value, "value");
        javax.crypto.Cipher cipher = this.encryptor;
        byte[] bytes = value.getBytes(this.charSet);
        o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        o.LJIIIIZZ(encodeToString, "encodeToString(encryptor.doFinal(value.toByteArray(charSet)), Base64.NO_WRAP)");
        return encodeToString;
    }

    private final String xorMessage(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                char[] charArray = str2.toCharArray();
                o.LJIIIIZZ(charArray, "(this as java.lang.String).toCharArray()");
                char[] charArray2 = str.toCharArray();
                o.LJIIIIZZ(charArray2, "(this as java.lang.String).toCharArray()");
                int length = charArray2.length;
                int length2 = charArray.length;
                char[] cArr = new char[length];
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        cArr[i] = (char) (charArray2[i] ^ charArray[i % length2]);
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                return new String(cArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public /* synthetic */ AESCipher(ContextInfo contextInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo);
    }
}
