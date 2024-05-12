package com.bytedance.retrofit2.mime;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class MimeUtil {
    public static final Pattern CHARSET = PatternProtector.compile("\\Wcharset=([^\\s;]+)", 2);

    public static String parseCharset(String str) {
        return parseCharset(str, "UTF-8");
    }

    public static String parseCharset(String str, String str2) {
        Matcher matcher = CHARSET.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).replaceAll("[\"\\\\]", "");
        }
        return str2;
    }
}
