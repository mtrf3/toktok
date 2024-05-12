package X;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* renamed from: X.Zz8, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91718Zz8 {
    public static String LIZ(String str) {
        if (str != null) {
            return o.LJIILLIIL(str, "android-app://androidx.navigation/");
        }
        return "";
    }

    public static InterfaceC1039145z LIZJ(C91720ZzA c91720ZzA) {
        o.LJIIIZ(c91720ZzA, "<this>");
        return OJ6.LJJIZ(c91720ZzA, C92405aAD.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    public static String LIZIZ(int i, Context context) {
        String str;
        o.LJIIIZ(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            i = context.getResources().getResourceName(i);
            str = i;
        } catch (Resources.NotFoundException unused) {
            str = String.valueOf(i);
        }
        o.LJIIIIZZ(str, "try {\n                co….toString()\n            }");
        return str;
    }
}
