package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* renamed from: X.Fut, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40495Fut implements IEvent {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final JSONObject LJLJI;

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

    public C40495Fut(int i, String str, JSONObject jSONObject) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
    }
}
