package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Na8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59592Na8 implements IEvent {
    public final Long LJLIL;

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

    public C59592Na8(Long l) {
        this.LJLIL = l;
    }
}
