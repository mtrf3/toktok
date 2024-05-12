package X;

import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class C64 {
    public static String LIZIZ(String str, int i) {
        return str + i;
    }

    public static void LIZJ(String str, String str2) {
        C29702BlC LIZ = C18230nb.LIZ(str);
        LIZ.LJ(str2);
        LIZ.LJIIIZ();
    }

    public static Object LIZ(Gson gson, Class cls, C65385PlN c65385PlN, String str) {
        Object read = gson.LJIIJ(cls).read(c65385PlN);
        o.LJIIIIZZ(read, str);
        return read;
    }
}
