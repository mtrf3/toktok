package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Fum, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40488Fum implements IEvent {
    public final int LJLIL;
    public final boolean LJLILLLLZI;

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

    public C40488Fum(int i, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }
}
