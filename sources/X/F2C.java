package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class F2C implements IEvent {
    public final JSONArray LJLIL;
    public final InterfaceC40516FvE LJLILLLLZI;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public F2C(JSONArray jSONArray, InterfaceC40516FvE interfaceC40516FvE) {
        this.LJLIL = jSONArray;
        this.LJLILLLLZI = interfaceC40516FvE;
    }
}
