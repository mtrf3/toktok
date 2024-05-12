package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Gsi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42908Gsi implements IEvent {
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

    public C42908Gsi(int i) {
        this.LJLIL = i;
    }
}
