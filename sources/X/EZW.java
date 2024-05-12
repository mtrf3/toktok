package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.IOException;
import java.net.URLDecoder;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EZW {
    public static Pair LIZ(String str, java.util.Map map) {
        if (!TextUtils.isEmpty(str)) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "buffer.toString()");
                String encodedPath = parse.getEncodedPath();
                String encodedQuery = parse.getEncodedQuery();
                if (encodedQuery == null) {
                    return new Pair(sb2, encodedPath);
                }
                Object[] array = s.LJLJJL(encodedQuery, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        i++;
                        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(str2, '=', 0, false, 6);
                        if (LJJLIIIJJIZ >= 0) {
                            String substring = str2.substring(0, LJJLIIIJJIZ);
                            o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            String decode = URLDecoder.decode(substring, "UTF-8");
                            o.LJIIIIZZ(decode, "decode(\n                        pair.substring(0, idx),\n                        DEFAULT_CHARSET\n                    )");
                            String substring2 = str2.substring(LJJLIIIJJIZ + 1);
                            o.LJIIIIZZ(substring2, "(this as java.lang.String).substring(startIndex)");
                            String decode2 = URLDecoder.decode(substring2, "UTF-8");
                            o.LJIIIIZZ(decode2, "decode(\n                            pair.substring(idx + 1),\n                            DEFAULT_CHARSET\n                        )");
                            map.put(decode, decode2);
                        } else {
                            String decode3 = URLDecoder.decode(str2, "UTF-8");
                            o.LJIIIIZZ(decode3, "decode(\n                        pair,\n                        DEFAULT_CHARSET\n                    )");
                            map.put(decode3, "");
                        }
                    }
                    return new Pair(sb2, encodedPath);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (Exception unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        }
        throw new IOException("parseUrl url is null !!!");
    }
}
