package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* renamed from: X.NZs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59576NZs implements IEvent {
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

    public C59576NZs(JSONObject jSONObject) {
        this.LJLIL = jSONObject;
    }
}
