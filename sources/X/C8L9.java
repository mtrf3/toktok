package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.8L9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8L9 implements IEvent {
    public final float LJLIL;

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

    public C8L9(float f) {
        this.LJLIL = f;
    }
}
