package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.CanvasStyle;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.95g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2311295g {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        int i;
        if (C2311395h.LIZ() == 1) {
            i = 0;
        } else {
            i = 1;
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        CanvasStyle canvasStyle = C2311195f.LIZ;
        LJIIIZ.getClass();
        CanvasStyle canvasStyle2 = (CanvasStyle) FFL.LJIJ(true, "creation_add_to_story_canvas_style", 31744, CanvasStyle.class, canvasStyle);
        if (canvasStyle2 != null) {
            canvasStyle = canvasStyle2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iType", canvasStyle.type);
        jSONObject.put("workShowType", 0);
        jSONObject.put("maskType", i);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }
}
