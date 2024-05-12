package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes9.dex */
public final class K2I implements IEvent {
    public final C51468KHw LJLIL;

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

    public K2I(C51468KHw c51468KHw) {
        this.LJLIL = c51468KHw;
    }
}
