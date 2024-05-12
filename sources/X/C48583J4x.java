package X;

import com.google.gson.Gson;
import java.io.StringReader;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.J4x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48583J4x {
    public static final Gson LIZ = new Gson();

    public static Object LIZ(String config, Type type) {
        Object LJIIIIZZ;
        o.LJIIIZ(config, "config");
        C65385PlN c65385PlN = new C65385PlN(new StringReader(config));
        Gson gson = LIZ;
        synchronized (gson) {
            LJIIIIZZ = gson.LJIIIIZZ(c65385PlN, type);
        }
        return LJIIIIZZ;
    }
}
