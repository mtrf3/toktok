package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NMl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59231NMl implements IEvent {
    public final JSONObject LJLIL;

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

    public C59231NMl(JSONObject params) {
        o.LJIIIZ(params, "params");
        this.LJLIL = params;
    }
}
