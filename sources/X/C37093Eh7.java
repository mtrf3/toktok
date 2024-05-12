package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Eh7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37093Eh7 {
    public static String LIZ(java.util.Map map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append('=');
            LIZ.append(value);
            stringBuffer.append(X1D.LIZIZ(LIZ));
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "sb.toString()");
        if (ujb.o.LJJJJ(stringBuffer2, "&", false)) {
            String substring = stringBuffer2.substring(0, stringBuffer2.length() - 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return stringBuffer2;
    }

    public static HashMap LIZIZ(String str) {
        HashMap hashMap = new HashMap(0);
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        for (String str2 : (String[]) s.LJLJJL(str, new String[]{"&"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) s.LJLJJL(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length >= 2) {
                hashMap.put(strArr[0], strArr[1]);
            }
        }
        return hashMap;
    }

    public static String LIZLLL(String str) {
        int LJJLIIIJL;
        if (str != null && (LJJLIIIJL = s.LJJLIIIJL(str, "?", 0, false, 6)) > 0) {
            if (str != null) {
                String substring = str.substring(0, LJJLIIIJL);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return null;
        }
        return str;
    }

    public static boolean LIZJ(android.net.Uri uri, String str, String str2) {
        o.LJIIIZ(uri, "uri");
        if (TextUtils.equals(str2, UriProtector.getQueryParameter(uri, str))) {
            return true;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "params_url");
        if (queryParameter != null && TextUtils.equals(str2, UriProtector.getQueryParameter(UriProtector.parse(queryParameter), str))) {
            return true;
        }
        return false;
    }
}
