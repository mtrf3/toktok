package X;

import com.google.gson.Gson;
import com.google.gson.j;
import java.lang.reflect.Type;

/* renamed from: X.Ee0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36900Ee0 {
    public static final Gson LIZ = new Gson();

    public static <T> T LIZ(j jVar, Type type) {
        try {
            return (T) LIZ.LIZLLL(jVar, type);
        } catch (Throwable unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("JSON parse error! check your config: ");
            LIZ2.append(jVar.toString());
            X1D.LIZIZ(LIZ2);
            return null;
        }
    }
}
