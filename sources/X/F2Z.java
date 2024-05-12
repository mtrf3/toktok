package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes7.dex */
public final class F2Z implements IEvent {
    public final int LJLIL;
    public final int LJLILLLLZI;

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

    public F2Z(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
