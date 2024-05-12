package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Pvh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66025Pvh extends F9E {
    public final String LJLIL;
    public final C65357Pkv LJLILLLLZI;
    public final String LJLJI;
    public final JSONObject LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C66025Pvh(String eventType, C65357Pkv state, String str, JSONObject jSONObject) {
        o.LJIIJ(eventType, "eventType");
        o.LJIIJ(state, "state");
        this.LJLIL = eventType;
        this.LJLILLLLZI = state;
        this.LJLJI = str;
        this.LJLJJI = jSONObject;
    }
}
