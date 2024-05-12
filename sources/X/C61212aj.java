package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61212aj extends F9E implements IEvent {
    public final long LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL)};
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

    public C61212aj(long j) {
        this.LJLIL = j;
    }
}
