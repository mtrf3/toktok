package com.bytedance.mt.protector.impl;

import X.C05040Hs;
import X.C65415Plr;
import X.C65854Psw;
import X.EnumC65856Psy;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes12.dex */
public class UriProtector extends C65854Psw<String> {
    public static EnumC65856Psy protectorType = EnumC65856Psy.URI;

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (C65415Plr.LIZIZ()) {
            try {
                return uri.getQueryParameterNames();
            } catch (Throwable th) {
                Object tryProtect = C65854Psw.tryProtect(protectorType, th, String.class);
                if (tryProtect != null) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(tryProtect);
                    return hashSet;
                }
                throw th;
            }
        }
        return uri.getQueryParameterNames();
    }

    public static Uri parse(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Uri.parse(str);
            } catch (Throwable th) {
                String str2 = (String) C65854Psw.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return Uri.parse(str2);
                }
                throw th;
            }
        }
        return Uri.parse(str);
    }

    public static String getQueryParameter(Uri uri, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return uri.getQueryParameter(str);
            } catch (Throwable th) {
                String str2 = (String) C65854Psw.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return str2;
                }
                throw th;
            }
        }
        return uri.getQueryParameter(str);
    }

    public static List<String> getQueryParameters(Uri uri, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return uri.getQueryParameters(str);
            } catch (Throwable th) {
                String str2 = (String) C65854Psw.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return C05040Hs.LIZIZ(str2);
                }
                throw th;
            }
        }
        return uri.getQueryParameters(str);
    }
}
