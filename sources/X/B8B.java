package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B8B extends F9E {
    public final String LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public final JSONObject LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public B8B(JSONObject jSONObject, String scene, java.util.Map map) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = scene;
        this.LJLILLLLZI = map;
        this.LJLJI = jSONObject;
    }
}
