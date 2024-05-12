package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* renamed from: X.F1d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38293F1d implements IEvent {
    public final String LJLIL;
    public final JSONObject LJLILLLLZI;

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

    public C38293F1d(String str, JSONObject jSONObject) {
        this.LJLIL = str;
        this.LJLILLLLZI = jSONObject;
    }
}
