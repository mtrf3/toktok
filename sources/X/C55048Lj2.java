package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Lj2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55048Lj2 implements IEvent {
    public final boolean LJLIL;
    public final Aweme LJLILLLLZI;
    public final int LJLJI = 1;

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

    public C55048Lj2(Aweme aweme, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = aweme;
    }
}
