package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.F2a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38316F2a implements IEvent {
    public final int LJLIL;
    public final int LJLILLLLZI;

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

    public C38316F2a(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
