package com.ss.android.ugc.effectmanager.common;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;

/* loaded from: classes4.dex */
public final class StringExtension {
    public static int lastIndexOfRegex(String str, String str2) {
        Matcher matcher = PatternProtector.compile(str2).matcher(str);
        int i = -1;
        while (matcher.find()) {
            i = matcher.start();
        }
        return i;
    }

    public static int lastIndexOfRegex(String str, String str2, int i) {
        return lastIndexOfRegex(str.substring(0, i), str2);
    }
}
