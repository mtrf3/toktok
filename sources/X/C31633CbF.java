package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.CbF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31633CbF implements IEvent {
    public final int LJLIL;
    public final Object LJLILLLLZI;

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

    public C31633CbF(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
