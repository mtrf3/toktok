package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes12.dex */
public final class QX2 implements IEvent {
    public final String LJLIL;

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

    public QX2(String str) {
        this.LJLIL = str;
    }
}
