package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes11.dex */
public final class NO8 implements IEvent {
    public final NOJ LJLIL;

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

    public NO8(NOJ noj) {
        this.LJLIL = noj;
    }
}
