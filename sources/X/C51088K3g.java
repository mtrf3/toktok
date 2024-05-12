package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.K3g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51088K3g implements IEvent {
    public final boolean LJLIL;
    public final C0C3 LJLILLLLZI;
    public final C0CJ LJLJI;

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

    public C51088K3g(boolean z, C0C3 c0c3, C0CJ c0cj) {
        this.LJLIL = z;
        this.LJLILLLLZI = c0c3;
        this.LJLJI = c0cj;
    }
}
