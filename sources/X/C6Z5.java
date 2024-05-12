package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.6Z5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Z5 implements IEvent {
    public final int LJLIL;

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

    public C6Z5(int i) {
        this.LJLIL = i;
    }
}
