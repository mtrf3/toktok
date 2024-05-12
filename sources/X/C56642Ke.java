package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* renamed from: X.2Ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56642Ke implements IEvent {
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

    public C56642Ke(JSONObject jSONObject) {
        this.LJLIL = jSONObject;
    }
}
