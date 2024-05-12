package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.9p1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248439p1 implements IEvent {
    public final int LJLIL;
    public final boolean LJLILLLLZI;

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

    public C248439p1(int i, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }
}
