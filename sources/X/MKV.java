package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes10.dex */
public final class MKV implements IEvent {
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

    public MKV(boolean z) {
        this.LJLIL = z;
    }
}
