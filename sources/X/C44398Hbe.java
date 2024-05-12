package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hbe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44398Hbe {
    public final C44421Hc1 LIZ;
    public String LIZIZ;
    public int LIZJ;
    public List<String> LIZLLL = new ArrayList();
    public long LJ;
    public C44386HbS LJFF;

    public final C44421Hc1 LIZ() {
        byte[] digest;
        String str;
        if (this.LIZIZ == null && this.LIZLLL.size() != 0) {
            String str2 = (String) ListProtector.get(this.LIZLLL, 0);
            MessageDigest messageDigest = C44399Hbf.LIZ;
            if (messageDigest == null) {
                str = "";
            } else if (TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                byte[] bytes = str2.getBytes(Charset.forName("UTF-8"));
                synchronized (C44399Hbf.class) {
                    digest = messageDigest.digest(bytes);
                }
                if (digest == null || digest.length == 0) {
                    str = null;
                } else {
                    char[] cArr = new char[digest.length << 1];
                    int i = 0;
                    for (byte b : digest) {
                        int i2 = i + 1;
                        char[] cArr2 = C44399Hbf.LIZIZ;
                        cArr[i] = cArr2[(b & 240) >> 4];
                        i = i2 + 1;
                        cArr[i2] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            }
            this.LIZIZ = str;
        }
        this.LIZ.LIZ.add(this);
        return this.LIZ;
    }

    public C44398Hbe(C44421Hc1 c44421Hc1) {
        this.LIZ = c44421Hc1;
    }
}
