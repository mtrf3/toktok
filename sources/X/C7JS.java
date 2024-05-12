package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.7JS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JS implements IEvent {
    public final String LJLIL;

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

    public C7JS(String str) {
        this.LJLIL = str;
    }
}
