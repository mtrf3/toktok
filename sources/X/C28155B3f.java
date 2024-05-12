package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.B3f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28155B3f implements IEvent {
    public final boolean LJLIL = true;
    public final String LJLILLLLZI;

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

    public C28155B3f(String str) {
        this.LJLILLLLZI = str;
    }
}
