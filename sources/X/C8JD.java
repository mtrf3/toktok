package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.8JD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JD implements IEvent {
    public final boolean LJLIL;

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

    public C8JD(boolean z) {
        this.LJLIL = z;
    }
}