package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class FBP {
    public static FBS LIZ;

    public static OSJ LIZ(String url) {
        String str;
        String str2;
        o.LJIIJ(url, "url");
        android.net.Uri shortLinkUri = UriProtector.parse(url);
        String queryParameter = UriProtector.getQueryParameter(shortLinkUri, "roma_group_key");
        String str3 = "";
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = UriProtector.getQueryParameter(shortLinkUri, "roma_page_key");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        if (queryParameter.length() == 0 || queryParameter2.length() == 0) {
            return new OSJ("", queryParameter, queryParameter2);
        }
        String queryParameter3 = UriProtector.getQueryParameter(shortLinkUri, "roma_url_query");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        String queryParameter4 = UriProtector.getQueryParameter(shortLinkUri, "roma_default_schema");
        if (queryParameter4 != null) {
            str3 = queryParameter4;
        }
        String queryParameter5 = UriProtector.getQueryParameter(shortLinkUri, "url");
        o.LJFF(shortLinkUri, "shortLinkUri");
        android.net.Uri LJJIIJ = C1JI.LJJIIJ(C1JI.LJJIIJ(C1JI.LJJIIJ(C1JI.LJJIIJ(C1JI.LJJIIJ(shortLinkUri, "roma_group_key"), "roma_page_key"), "roma_url_query"), "roma_default_schema"), "url");
        FBS fbs = LIZ;
        if (fbs != null) {
            String LIZJ = fbs.LIZJ(queryParameter, queryParameter2);
            if (LIZJ != null && LIZJ.length() > 0) {
                str3 = LIZJ;
            }
            android.net.Uri parse = UriProtector.parse(str3);
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            if (queryParameter5 != null) {
                clearQuery.appendQueryParameter("url", queryParameter5);
            } else {
                String queryParameter6 = UriProtector.getQueryParameter(parse, "url");
                if (queryParameter6 != null) {
                    android.net.Uri parse2 = UriProtector.parse(queryParameter6);
                    Uri.Builder clearQuery2 = parse2.buildUpon().clearQuery();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = s.LJLJJL(queryParameter3, new String[]{"&"}, 0, 6).iterator();
                    while (it.hasNext()) {
                        List LJLJJL = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6);
                        if (!LJLJJL.isEmpty() && (str = (String) ListProtector.get(LJLJJL, 0)) != null && str.length() > 0 && (str2 = (String) ListProtector.get(LJLJJL, 1)) != null && str2.length() > 0) {
                            linkedHashSet.add(ListProtector.get(LJLJJL, 0));
                            clearQuery2.appendQueryParameter((String) ListProtector.get(LJLJJL, 0), URLDecoder.decode((String) ListProtector.get(LJLJJL, 1), "UTF-8"));
                        }
                    }
                    java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse2);
                    o.LJFF(queryParameterNames, "queryUrlUri.queryParameterNames");
                    for (String str4 : queryParameterNames) {
                        if (!linkedHashSet.contains(str4)) {
                            clearQuery2.appendQueryParameter(str4, UriProtector.getQueryParameter(parse2, str4));
                        }
                    }
                    clearQuery.appendQueryParameter("url", clearQuery2.build().toString());
                }
            }
            java.util.Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(parse);
            o.LJFF(queryParameterNames2, "newUri.queryParameterNames");
            java.util.Set<String> queryParameterNames3 = UriProtector.getQueryParameterNames(LJJIIJ);
            o.LJFF(queryParameterNames3, "shortLinkUri.queryParameterNames");
            for (String str5 : F5P.LJIIJJI(queryParameterNames2, queryParameterNames3)) {
                if (!o.LJ(str5, "url")) {
                    String queryParameter7 = UriProtector.getQueryParameter(LJJIIJ, str5);
                    if (queryParameter7 == null) {
                        queryParameter7 = UriProtector.getQueryParameter(parse, str5);
                    }
                    clearQuery.appendQueryParameter(str5, queryParameter7);
                }
            }
            return new OSJ(clearQuery.build().toString(), queryParameter, queryParameter2);
        }
        o.LJIJI("hostDepend");
        throw null;
    }
}
