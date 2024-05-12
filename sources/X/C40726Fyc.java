package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Fyc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40726Fyc implements IEvent {
    public final Boolean LJLIL;

    public C40726Fyc() {
        this(null);
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

    public C40726Fyc(Boolean bool) {
        this.LJLIL = bool;
    }
}
