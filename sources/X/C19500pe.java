package X;

import java.util.Collection;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.0pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19500pe {
    public static InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, C76800UCe> LIZJ;
    public static int LJ;
    public static final ORV<String> LIZ = new ORV<>(30);
    public static boolean LIZIZ = true;
    public static String LIZLLL = "";
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C523923v.LJLIL);

    public static void LIZ(java.util.Map map) {
        map.put("launch_id", LIZLLL);
        map.put("is_cold_start_first_launch", String.valueOf(LJ));
        String jSONArray = new JSONArray((Collection) LIZ).toString();
        o.LJIIIIZZ(jSONArray, "JSONArray(upathChain).toString()");
        map.put("upath_chain", jSONArray);
    }
}
