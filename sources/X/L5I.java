package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class L5I {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53569L0r.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(L5E.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(L5K.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(L5F.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(L5J.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(L5H.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(L5M.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(L5G.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(L5L.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C44986Hl8.LJLIL);
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C44987Hl9.LJLIL);

    public static java.util.Map LIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("lower_fps_min_side_threshold_for_editor_pro", 0);
            int optInt2 = jSONObject.optInt("higher_fps_threshold", 0);
            int optInt3 = jSONObject.optInt("higher_fps_min_side_threshold_for_editor_pro", 0);
            if (optInt > 0 && optInt2 > 0 && optInt3 > 0) {
                return C113554cx.LJJL(new OSZ("lower_fps_min_side_threshold_for_editor_pro", Integer.valueOf(optInt)), new OSZ("higher_fps_threshold", Integer.valueOf(optInt2)), new OSZ("higher_fps_min_side_threshold_for_editor_pro", Integer.valueOf(optInt3)));
            }
            return C113554cx.LJJJLIIL();
        } catch (JSONException unused) {
            H78.LIZLLL("EditorProHWDecoderConfig", new JSONException("byteVC1 json parse fail"));
            return C113554cx.LJJJLIIL();
        }
    }
}
