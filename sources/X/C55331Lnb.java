package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Lnb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55331Lnb implements IEvent {
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

    public C55331Lnb(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }
}
