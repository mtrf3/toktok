package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes9.dex */
public final class IGH extends F9E implements IEvent {
    public final boolean LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL)};
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

    public IGH(boolean z) {
        this.LJLIL = z;
    }
}