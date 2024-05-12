package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public final class F9F {
    public final Object LIZ = new Object();
    public final SecureRandom LIZIZ;
    public final SecretKeyFactory LIZJ;
    public final Cipher LIZLLL;
    public final javax.crypto.Mac LJ;
    public F9G LJFF;

    public static String LIZLLL(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-6033071948320192587");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public F9F() {
        try {
            this.LIZIZ = new SecureRandom();
            this.LIZJ = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.LIZLLL = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.LJ = javax.crypto.Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public final void LIZIZ(Context context) {
        synchronized (this.LIZ) {
            if (this.LJFF == null) {
                this.LJFF = LIZJ(context);
            }
        }
    }

    public final F9G LIZJ(Context context) {
        String LIZLLL;
        byte[] bArr;
        ContentResolver contentResolver = context.getContentResolver();
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                LIZLLL = "";
            } else {
                if (TextUtils.isEmpty(E77.LIZ)) {
                    E77.LIZ = LIZLLL(contentResolver);
                }
                LIZLLL = E77.LIZ;
            }
        } else {
            LIZLLL = LIZLLL(contentResolver);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Build.MODEL);
        LIZ.append(Build.MANUFACTURER);
        LIZ.append("");
        LIZ.append(LIZLLL);
        LIZ.append(context.getPackageName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        SharedPreferences LIZIZ2 = F9J.LIZIZ(context, 0, "com.linecorp.linesdk.sharedpreference.encryptionsalt");
        String string = LIZIZ2.getString("salt", null);
        if (!TextUtils.isEmpty(string)) {
            bArr = Base64.decode(string, 0);
        } else {
            bArr = new byte[16];
            this.LIZIZ.nextBytes(bArr);
            LIZIZ2.edit().putString("salt", Base64.encodeToString(bArr, 0)).apply();
        }
        try {
            byte[] encoded = this.LIZJ.generateSecret(new PBEKeySpec(LIZIZ.toCharArray(), bArr, 5000, 512)).getEncoded();
            return new F9G(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }

    public final String LIZ(Context context, String str) {
        String encodeToString;
        synchronized (this.LIZ) {
            LIZIZ(context);
            try {
                int blockSize = this.LIZLLL.getBlockSize();
                byte[] bArr = new byte[blockSize];
                this.LIZIZ.nextBytes(bArr);
                this.LIZLLL.init(1, this.LJFF.LIZ, new IvParameterSpec(bArr));
                byte[] doFinal = this.LIZLLL.doFinal(str.getBytes("UTF-8"));
                byte[] bArr2 = new byte[doFinal.length + blockSize + 32];
                System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                System.arraycopy(doFinal, 0, bArr2, blockSize, doFinal.length);
                this.LJ.init(this.LJFF.LIZIZ);
                this.LJ.update(bArr2, 0, doFinal.length + blockSize);
                byte[] doFinal2 = this.LJ.doFinal();
                System.arraycopy(doFinal2, 0, bArr2, blockSize + doFinal.length, doFinal2.length);
                encodeToString = Base64.encodeToString(bArr2, 0);
            } catch (UnsupportedEncodingException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                throw new RuntimeException(e);
            } catch (InvalidKeyException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (BadPaddingException e4) {
                throw new F9H(e4);
            } catch (IllegalBlockSizeException e5) {
                e = e5;
                throw new RuntimeException(e);
            }
        }
        return encodeToString;
    }
}
