package com.byted.cast.common;

import X.C63832P3k;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

/* loaded from: classes29.dex */
public final class StringUtil {
    public static String zhPattern = "[一-龥。；，：“”（）、？《》\\s+]+";

    public static String filterSpecChinese(String str) {
        try {
            return encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UnsupportedEncoding:");
            LIZ.append(e);
            Logger.w("StringUtil", X1D.LIZIZ(LIZ));
            return str;
        }
    }

    public static String getNonEmptyString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    public static final boolean hasData(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        return PatternProtector.compile("-?[0-9]*").matcher(str).matches();
    }

    public static final int toInteger(String str) {
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException e) {
            Logger.e(e.getMessage());
            return 0;
        }
    }

    public static final long toLong(String str) {
        try {
            return CastLongProtector.parseLong(str);
        } catch (Exception e) {
            Logger.e(e.getMessage());
            return 0L;
        }
    }

    public static String transMapToString(Map map) {
        String obj;
        String str;
        StringBuffer stringBuffer = new StringBuffer("{");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String obj2 = entry.getKey().toString();
            if (entry.getValue() == null) {
                obj = "";
            } else {
                obj = entry.getValue().toString();
            }
            if (TextUtils.equals(C63832P3k.LIZ, obj2) && (TextUtils.equals("overseasPlug", "overseas") || TextUtils.equals("overseas", "overseas"))) {
                obj = "xxx.xxx.xxx.xxx";
            }
            stringBuffer.append(obj2);
            stringBuffer.append(":");
            stringBuffer.append(obj);
            if (it.hasNext()) {
                str = ";";
            } else {
                str = "}";
            }
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public static String encode(String str, String str2) {
        Matcher matcher = PatternProtector.compile(zhPattern).matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, URLEncoder.encode(matcher.group(0), str2));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static final int findFirstNotOf(String str, String str2) {
        return findOf(str, str2, 0, str.length() - 1, 1, false);
    }

    public static final int findFirstOf(String str, String str2) {
        return findOf(str, str2, 0, str.length() - 1, 1, true);
    }

    public static final int findLastNotOf(String str, String str2) {
        return findOf(str, str2, str.length() - 1, 0, -1, false);
    }

    public static final int findLastOf(String str, String str2) {
        return findOf(str, str2, str.length() - 1, 0, -1, true);
    }

    public static final String trim(String str, String str2) {
        int findFirstNotOf = findFirstNotOf(str, str2);
        if (findFirstNotOf < 0) {
            return str;
        }
        String substring = str.substring(findFirstNotOf, str.length());
        int findLastNotOf = findLastNotOf(substring, str2);
        if (findLastNotOf < 0) {
            return substring;
        }
        return substring.substring(0, findLastNotOf + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x000c, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int findOf(java.lang.String r7, java.lang.String r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = -1
            if (r11 != 0) goto L4
            return r6
        L4:
            int r5 = r8.length()
        L8:
            if (r11 <= 0) goto Ld
            if (r10 >= r9) goto L10
        Lc:
            return r6
        Ld:
            if (r9 >= r10) goto L10
            goto Lc
        L10:
            char r4 = r7.charAt(r9)
            r3 = 0
            r2 = 0
        L16:
            if (r3 >= r5) goto L2c
            char r1 = r8.charAt(r3)
            r0 = 1
            if (r12 != r0) goto L22
            if (r4 != r1) goto L29
            return r9
        L22:
            if (r4 == r1) goto L26
            int r2 = r2 + 1
        L26:
            if (r2 != r5) goto L29
            return r9
        L29:
            int r3 = r3 + 1
            goto L16
        L2c:
            int r9 = r9 + r11
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.StringUtil.findOf(java.lang.String, java.lang.String, int, int, int, boolean):int");
    }
}
