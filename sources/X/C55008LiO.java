package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.LiO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55008LiO implements IEvent {
    public final int LJLIL;
    public final Aweme LJLILLLLZI;

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

    public C55008LiO(int i, Aweme aweme) {
        this.LJLIL = i;
        this.LJLILLLLZI = aweme;
    }
}
