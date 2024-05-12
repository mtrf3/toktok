package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.3LP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LP implements IEvent {
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

    public C3LP(String str) {
        this.LJLIL = str;
    }
}
