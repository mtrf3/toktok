package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.4Ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108814Ov implements IEvent {
    public final long LJLIL;

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

    public /* synthetic */ C108814Ov() {
        this(5000L);
    }

    public C108814Ov(long j) {
        this.LJLIL = j;
    }
}
