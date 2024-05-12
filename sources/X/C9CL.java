package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.9CL, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CL extends F9E implements IEvent {
    public final JSONObject LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

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

    public C9CL(JSONObject params) {
        o.LJIIIZ(params, "params");
        this.LJLIL = params;
    }
}
