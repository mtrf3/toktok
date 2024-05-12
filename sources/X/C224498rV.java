package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.8rV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224498rV implements IEvent {
    public final int LJLIL;
    public String LJLILLLLZI;

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

    public C224498rV(int i) {
        this.LJLIL = i;
    }

    public C224498rV(int i, int i2) {
        this.LJLIL = i;
    }
}
