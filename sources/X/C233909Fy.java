package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.9Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C233909Fy extends F9E implements IEvent {
    public final int LJLIL;

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

    public C233909Fy(int i) {
        this.LJLIL = i;
    }
}
