package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.MDu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56458MDu implements IEvent {
    public final boolean LJLIL;
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

    public C56458MDu(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }
}
