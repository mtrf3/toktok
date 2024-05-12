package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.9k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245349k2 implements IEvent {
    public final String LJLIL;
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

    public C245349k2(String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}
