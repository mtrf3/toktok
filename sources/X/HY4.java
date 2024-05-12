package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes8.dex */
public final class HY4 implements IEvent {
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

    public HY4(boolean z) {
        this.LJLIL = z;
    }
}
