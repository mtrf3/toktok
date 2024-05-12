package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.IHk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46360IHk extends F9E implements IEvent {
    public final String LJLIL;

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

    public C46360IHk(String str) {
        this.LJLIL = str;
    }
}
