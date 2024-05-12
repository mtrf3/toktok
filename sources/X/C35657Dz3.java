package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Dz3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35657Dz3 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final LinkedHashMap<String, JSONObject> LIZ = new LinkedHashMap<>();

    static {
        new C35658Dz4();
    }

    public final void LIZ(String key, JSONObject jSONObject) {
        o.LJIIJ(key, "key");
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(key);
            LIZ.append('_');
            LIZ.append(String.valueOf(System.currentTimeMillis()));
            this.LIZ.put(X1D.LIZIZ(LIZ), jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
