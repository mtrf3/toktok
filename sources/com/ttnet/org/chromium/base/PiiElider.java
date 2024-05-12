package com.ttnet.org.chromium.base;

import X.O6T;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class PiiElider {
    public static final Pattern LIZ = PatternProtector.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");
    public static final Pattern LIZIZ = PatternProtector.compile("\\sat\\sorg\\.chromium\\.[^ ]+.|Caused by: java.lang.(ClassNotFoundException|NoClassDefFoundError):");
    public static final String[] LIZJ;
    public static final String[] LIZLLL;

    static {
        PatternProtector.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        PatternProtector.compile("\\[\\w*:CONSOLE.*\\].*");
        LIZJ = new String[]{"com.ttnet.org.chromium.", "com.google.", "com.chrome."};
        LIZLLL = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};
    }

    public static String LIZ(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (LIZIZ.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = LIZ.matcher(sb);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            i = matcher.end();
            String substring = sb.substring(start, i);
            String[] strArr = LIZJ;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 < length) {
                    if (substring.startsWith(strArr[i2])) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                String[] strArr2 = LIZLLL;
                int length2 = strArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        if (substring.startsWith(strArr2[i3])) {
                            z3 = true;
                            break;
                        }
                        i3++;
                    } else {
                        z3 = false;
                        break;
                    }
                }
                if (!z3) {
                    try {
                        Class.forName(substring, false, O6T.LIZ.getClassLoader());
                        z4 = true;
                    } catch (Throwable unused) {
                        z4 = false;
                    }
                    if (!z4) {
                        int lastIndexOf = substring.lastIndexOf(".");
                        if (lastIndexOf != -1) {
                            try {
                                Class.forName(substring.substring(0, lastIndexOf), false, O6T.LIZ.getClassLoader());
                            } catch (Throwable unused2) {
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                        sb.replace(start, i, "HTTP://WEBADDRESS.ELIDED");
                        i = start + 24;
                        matcher = LIZ.matcher(sb);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String sanitizeStacktrace(String str) {
        String[] split = str.split("\\n");
        split[0] = LIZ(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].startsWith("Caused by:")) {
                split[i] = LIZ(split[i]);
            }
        }
        return TextUtils.join("\n", split);
    }
}
