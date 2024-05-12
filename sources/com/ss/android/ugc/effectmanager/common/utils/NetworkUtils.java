package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import X.C1DI;
import X.C278817o;
import X.X1D;
import X.YE1;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import defpackage.i0;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class NetworkUtils {
    public static boolean isNetworkAvailable(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI == null) {
                return false;
            }
            if (!LJJLI.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isNetworkAvailable: ");
            LIZ.append(e.toString());
            EPLog.e("NetworkUtils", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public static <T> String toJson(List<T> list) {
        StringBuilder LIZJ = C278817o.LIZJ("[");
        if (list == null || list.isEmpty()) {
            LIZJ.append("]");
            return LIZJ.toString();
        }
        for (T t : list) {
            LIZJ.append("\"");
            LIZJ.append(t.toString());
            LIZJ.append("\",");
        }
        LIZJ.deleteCharAt(LIZJ.length() - 1);
        LIZJ.append("]");
        return LIZJ.toString();
    }

    public static String buildRequestUrl(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (map.size() > 0) {
            sb.append("?");
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    if (i == 0) {
                        C1DI.LIZIZ(sb, key, "=", value);
                    } else {
                        YE1.LIZLLL(sb, "&", key, "=", value);
                    }
                }
                i++;
            }
        }
        return new String(sb);
    }

    public static String encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(i0.LJFF("Encoding not supported: ", str), e);
        }
    }

    public static String filterUrl(String str, String str2) {
        Pattern compile = PatternProtector.compile(".*(?=://)");
        Pattern compile2 = PatternProtector.compile("(?<=://)([^/]*)");
        URI create = URI.create(str);
        return compile2.matcher(compile.matcher(str2).replaceFirst(create.getScheme())).replaceFirst(create.getHost());
    }
}
