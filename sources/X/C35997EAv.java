package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EAv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35997EAv {
    public static final /* synthetic */ int LIZ = 0;

    public static C39492Fei LIZ(android.net.Uri uri) {
        String str;
        String str2;
        if (uri != null) {
            try {
                String builder = uri.buildUpon().clearQuery().toString();
                o.LJIIIIZZ(builder, "uri.buildUpon().clearQuery().toString()");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String encodedQuery = uri.getEncodedQuery();
                String str3 = "";
                if (encodedQuery != null) {
                    int i = 0;
                    do {
                        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(encodedQuery, '&', i, false, 4);
                        if (LJJLIIIJJIZ == -1) {
                            LJJLIIIJJIZ = encodedQuery.length();
                        }
                        int LJJLIIIJJIZ2 = s.LJJLIIIJJIZ(encodedQuery, '=', i, false, 4);
                        if (LJJLIIIJJIZ2 > LJJLIIIJJIZ || LJJLIIIJJIZ2 == -1) {
                            LJJLIIIJJIZ2 = LJJLIIIJJIZ;
                        }
                        String substring = encodedQuery.substring(i, LJJLIIIJJIZ2);
                        o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (LJJLIIIJJIZ2 - i == substring.length()) {
                            if (ujb.o.LJJJJL(encodedQuery, i, false, 0, substring.length(), substring)) {
                                if (LJJLIIIJJIZ2 == LJJLIIIJJIZ) {
                                    linkedHashMap.put(substring, "");
                                } else {
                                    String substring2 = encodedQuery.substring(LJJLIIIJJIZ2 + 1, LJJLIIIJJIZ);
                                    o.LJIIIIZZ(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    String decode = android.net.Uri.decode(substring2);
                                    o.LJIIIIZZ(decode, "Uri.decode(substring(separator + 1, end))");
                                    linkedHashMap.put(substring, decode);
                                }
                            }
                        }
                        i = LJJLIIIJJIZ + 1;
                    } while (i < encodedQuery.length());
                }
                String host = uri.getHost();
                if (host != null) {
                    str = host.substring(s.LJJLIIIJL(host, ".", 0, false, 6) + 1, host.length());
                    o.LJIIIIZZ(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    str = null;
                }
                if (ujb.o.LJJJLIIL(builder, "/data/", false) || ujb.o.LJJJLIIL(builder, "local_file://", false) || ujb.o.LJJJLIIL(builder, "/mnt/", false)) {
                    return new C39492Fei(builder, builder, uri.getScheme(), uri.getHost(), str, "", encodedQuery, "", linkedHashMap);
                }
                if (!linkedHashMap.containsKey(WM7.SCENE_SERVICE) || (str2 = (String) linkedHashMap.get(WM7.SCENE_SERVICE)) == null) {
                    str2 = "";
                }
                if (uri.getScheme() == null && uri.getHost() == null) {
                    builder = builder;
                    new C39492Fei(builder, builder, "", "", "", "", encodedQuery, str2, linkedHashMap);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "";
                }
                LIZ2.append(scheme);
                LIZ2.append("://");
                String host2 = uri.getHost();
                if (host2 != null) {
                    str3 = host2;
                }
                LIZ2.append(str3);
                return new C39492Fei(builder, X1D.LIZIZ(LIZ2), uri.getScheme(), uri.getHost(), str, uri.getPath(), encodedQuery, str2, linkedHashMap);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return null;
    }

    public static C39492Fei LIZIZ(String str) {
        if (str != null) {
            try {
                return LIZ(UriProtector.parse(str));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return null;
            }
        }
        return null;
    }
}
