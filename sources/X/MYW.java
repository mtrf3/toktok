package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes10.dex */
public final class MYW implements IEvent {
    public final long LJLIL;

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

    public MYW(long j) {
        this.LJLIL = j;
    }
}
