package X;

import org.json.JSONObject;

/* renamed from: X.Jep, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49691Jep implements F22 {
    public final Object LJLIL;

    @Override // X.F22
    public final String getName() {
        return "playMusicEnd";
    }

    @Override // X.F22
    public final Object getParams() {
        return this.LJLIL;
    }

    public C49691Jep(C49689Jen c49689Jen) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("music_extra", c49689Jen.LJLILLLLZI);
        this.LJLIL = jSONObject;
    }
}
