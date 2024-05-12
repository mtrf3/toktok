package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.QWp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67139QWp extends F9E implements IEvent {
    public final QWW LJLIL;

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

    public C67139QWp(QWW qww) {
        this.LJLIL = qww;
    }
}
