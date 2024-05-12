package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: X.F1a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38290F1a {
    public final java.util.Map<String, String> LIZ = new ConcurrentHashMap();

    public final String LIZIZ(String str) {
        boolean z;
        String str2;
        int i = 1;
        if (str.contains("%%secretKey=")) {
            str2 = str.substring(0, str.indexOf("%%secretKey="));
            String substring = str.substring(str.lastIndexOf("=") + 1, str.length());
            if (!TextUtils.isEmpty(substring)) {
                ((ConcurrentHashMap) this.LIZ).put(str2, substring);
            }
            z = true;
        } else {
            z = false;
            str2 = str;
        }
        if ((z || str.contains("secretKey")) && (str.length() == str2.length() || str2.contains("secretKey"))) {
            Boolean valueOf = Boolean.valueOf(z);
            StringBuilder LIZLLL = C06540Nm.LIZLLL("ImageEncryptUtils parse failed: rawUrl=", str, ", parseUrl=", str2, ", contain=");
            LIZLLL.append(valueOf);
            C36922EeM.LJ(X1D.LIZIZ(LIZLLL));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("service", "secret_key_parse_error");
                jSONObject.put("raw_url", str);
                jSONObject.put("parse_url", str2);
                if (!valueOf.booleanValue()) {
                    i = 0;
                }
                jSONObject.put("is_contain", i);
                C09900aA.LJ("im_error_event", jSONObject);
            } catch (Exception e) {
                C36922EeM.LJFF(e);
            }
        }
        return str2;
    }

    public final Pair LIZ(InputStream inputStream, long j, String str) {
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            String str2 = (String) ((ConcurrentHashMap) this.LIZ).get(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null) {
                    int length = str2.length() / 2;
                    byte[] bArr2 = new byte[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = i * 2;
                        bArr2[i] = CastIntegerProtector.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
                    }
                    byte[] copyOfRange = Arrays.copyOfRange(byteArray, 12, byteArray.length);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(byteArray, 0, 12));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    byte[] doFinal = cipher.doFinal(copyOfRange);
                    Pair pair = new Pair(doFinal, Integer.valueOf(doFinal.length));
                    inputStream = new ByteArrayInputStream((byte[]) pair.first);
                    j = ((Integer) pair.second).intValue();
                }
            } finally {
                ((ConcurrentHashMap) this.LIZ).remove(str);
            }
        }
        return new Pair(inputStream, Long.valueOf(j));
    }
}
