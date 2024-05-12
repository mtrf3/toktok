package X;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W6n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81749W6n {
    public static List<String> LIZ(W6U w6u) {
        try {
            if (w6u instanceof C81748W6m) {
                List<W6U> list = ((C81748W6m) w6u).LIZ;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(LIZIZ(list.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(LIZIZ(w6u));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String LIZIZ(W6U w6u) {
        byte[] bytes = w6u.LIZ().getBytes("UTF-8");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
