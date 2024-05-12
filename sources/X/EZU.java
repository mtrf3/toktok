package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class EZU {
    public static EZV LIZ;

    public static String LIZIZ(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String LIZJ(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.first;
            if (z) {
                str = LIZIZ(str);
            }
            List<String> list2 = (List) pair.second;
            if (list2 != null && list2.size() > 0) {
                for (String str2 : list2) {
                    if (z) {
                        if (str2 != null) {
                            str2 = LIZIZ(str2);
                        } else {
                            str2 = "";
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    C1DI.LIZIZ(sb, str, "=", str2);
                }
            }
        }
        return sb.toString();
    }

    public static void LIZLLL(android.net.Uri uri, java.util.Map<String, List<String>> map) {
        if (uri != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null) {
                for (String str : encodedQuery.split("&")) {
                    int indexOf = str.indexOf("=");
                    if (indexOf >= 0) {
                        String decode = URLDecoder.decode(str.substring(0, indexOf), "UTF-8");
                        List<String> list = (List) ((LinkedHashMap) map).get(decode);
                        if (list == null) {
                            list = new LinkedList<>();
                        }
                        list.add(URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                        map.put(decode, list);
                    } else {
                        String decode2 = URLDecoder.decode(str, "UTF-8");
                        List<String> list2 = (List) ((LinkedHashMap) map).get(decode2);
                        if (list2 == null) {
                            list2 = new LinkedList<>();
                        }
                        list2.add("");
                        map.put(decode2, list2);
                    }
                }
                return;
            }
            return;
        }
        throw new IOException("parseUrl url is null !!!");
    }

    public static String LJFF(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (LIZ == null) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            android.net.Uri parse = UriProtector.parse(str);
            LIZLLL(parse, linkedHashMap);
            LinkedList linkedList = new LinkedList();
            LJ("device_id", linkedList, linkedHashMap);
            LJ("device_type", linkedList, linkedHashMap);
            LJ("device_brand", linkedList, linkedHashMap);
            LJ("uuid", linkedList, linkedHashMap);
            LJ("openudid", linkedList, linkedHashMap);
            String LIZJ = LIZJ(linkedList, false);
            if (TextUtils.isEmpty(LIZJ)) {
                return str;
            }
            byte[] bytes = LIZJ.getBytes();
            byte[] LIZ2 = EncryptorUtil.LIZ(bytes.length, bytes);
            if (LIZ2 == null) {
                return str;
            }
            String encodeToString = Base64.encodeToString(LIZ2, 2);
            LinkedList linkedList2 = new LinkedList();
            if (LIZ.LJFF()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(encodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (LIZ.LIZIZ()) {
                ((LinkedList) list).add(new Pair("X-SS-QUERIES", LIZIZ(encodeToString)));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            String LIZJ2 = LIZJ(linkedList2, true);
            return LIZ(parse.getPort(), parse.getScheme(), parse.getHost(), parse.getPath(), LIZJ2, parse.getFragment()).toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void LJ(String str, List list, java.util.Map map) {
        if (!TextUtils.isEmpty(str) && map.containsKey(str)) {
            ((LinkedList) list).add(new Pair(str, ((LinkedHashMap) map).get(str)));
            if (!LIZ.LJII()) {
                map.remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if (r5 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZ(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L1e
            if (r3 == 0) goto L11
            r1.append(r3)
            java.lang.String r0 = "://"
            r1.append(r0)
        L11:
            r1.append(r4)
            if (r2 <= 0) goto L1e
            r0 = 58
            r1.append(r0)
            r1.append(r2)
        L1e:
            if (r5 == 0) goto L28
            java.lang.String r0 = "/"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L2f
        L28:
            r0 = 47
            r1.append(r0)
            if (r5 == 0) goto L32
        L2f:
            r1.append(r5)
        L32:
            if (r6 == 0) goto L3c
            r0 = 63
            r1.append(r0)
            r1.append(r6)
        L3c:
            if (r7 == 0) goto L46
            r0 = 35
            r1.append(r0)
            r1.append(r7)
        L46:
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZU.LIZ(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
