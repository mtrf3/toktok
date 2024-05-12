package com.bytedance.mt.protector.impl;

import X.C65415Plr;
import X.C65854Psw;
import X.EnumC65856Psy;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public class PatternProtector extends C65854Psw<String> {
    public static EnumC65856Psy protectorType = EnumC65856Psy.PATTERN;

    public static Pattern compile(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Pattern.compile(str);
            } catch (Throwable th) {
                String str2 = (String) C65854Psw.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return Pattern.compile(str2);
                }
                throw th;
            }
        }
        return Pattern.compile(str);
    }

    public static Pattern compile(String str, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Pattern.compile(str, i);
            } catch (Throwable th) {
                String str2 = (String) C65854Psw.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return Pattern.compile(str2, i);
                }
                throw th;
            }
        }
        return Pattern.compile(str, i);
    }

    public static boolean matches(String str, CharSequence charSequence) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Pattern.matches(str, charSequence);
            } catch (Throwable th) {
                Boolean bool = (Boolean) C65854Psw.tryProtect(protectorType, th, Boolean.class);
                if (bool != null) {
                    return bool.booleanValue();
                }
                throw th;
            }
        }
        return Pattern.matches(str, charSequence);
    }
}
