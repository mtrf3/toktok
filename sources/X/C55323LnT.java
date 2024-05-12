package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.LnT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55323LnT implements IEvent {
    public final boolean LJLIL;
    public final Aweme LJLILLLLZI;
    public final IDR LJLJI;

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

    public C55323LnT(boolean z, Aweme aweme, IDR idr) {
        this.LJLIL = z;
        this.LJLILLLLZI = aweme;
        this.LJLJI = idr;
    }
}
