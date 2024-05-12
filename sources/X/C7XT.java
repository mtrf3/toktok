package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.7XT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7XT extends F9E implements IEvent {
    public final int LJLIL = 1;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
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
}
