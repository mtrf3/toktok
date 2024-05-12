package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.1IZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IZ implements IEvent {
    public long LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;

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
}
