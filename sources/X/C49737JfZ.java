package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.JfZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49737JfZ extends F9E implements IEvent {
    public final C50062Jko LJLIL;

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

    public C49737JfZ(C50062Jko c50062Jko) {
        this.LJLIL = c50062Jko;
    }
}
