package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.QWs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67142QWs extends F9E implements IEvent {
    public final C0HK LJLIL;

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

    public C67142QWs(C0HK c0hk) {
        this.LJLIL = c0hk;
    }
}
