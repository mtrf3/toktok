package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.GjI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42324GjI extends F9E implements IEvent {
    public final C73030SlO LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
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

    public C42324GjI(C73030SlO c73030SlO) {
        this.LJLIL = c73030SlO;
    }
}
