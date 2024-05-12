package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.IDq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46262IDq implements IEvent {
    public final Aweme LJLIL;
    public final Long LJLILLLLZI;

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

    public C46262IDq(Aweme aweme, Long l) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = l;
    }
}
