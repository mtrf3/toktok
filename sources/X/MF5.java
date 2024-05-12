package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes10.dex */
public final class MF5 implements IEvent {
    public final boolean LJLIL;
    public final float LJLILLLLZI;

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

    public MF5(boolean z, float f) {
        this.LJLIL = z;
        this.LJLILLLLZI = f;
    }
}
