package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes6.dex */
public final class B8E extends F9E implements IEvent {
    public final BLB LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

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

    public B8E(BLB blb) {
        this.LJLIL = blb;
    }
}
