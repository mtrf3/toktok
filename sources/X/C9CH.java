package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.9CH, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CH implements IEvent {
    public final java.util.Map<String, String> LJLIL;

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

    public C9CH(java.util.Map<String, String> map) {
        this.LJLIL = map;
    }
}
