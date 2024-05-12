package X;

import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import java.util.HashMap;

/* renamed from: X.Cof, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32465Cof {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(String str) {
        String str2;
        if (str == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        try {
            new o();
            m LJIIZILJ = o.LIZ(str).LJIIZILJ();
            for (String key : LJIIZILJ.LJJIZ()) {
                kotlin.jvm.internal.o.LJIIIIZZ(key, "key");
                j LJJIJ = LJIIZILJ.LJJIJ(key);
                if (LJJIJ != null) {
                    str2 = LJJIJ.LJIJ().LJJIFFI();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(key, str2);
            }
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "extra helper json decode error");
        }
        return hashMap;
    }

    public static String LIZIZ(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        try {
            new o();
            m LJIIZILJ = o.LIZ(str).LJIIZILJ();
            for (String str3 : LJIIZILJ.LJJIZ()) {
                if (kotlin.jvm.internal.o.LJ(str3, "log_id")) {
                    j LJJIJ = LJIIZILJ.LJJIJ(str3);
                    if (LJJIJ != null) {
                        str2 = LJJIJ.LJIJ().LJJIFFI();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
            }
            return "";
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "log id helper json decode error");
            return "";
        }
    }
}
