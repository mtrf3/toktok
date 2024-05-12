package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.9CI, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9CI implements IEvent {
    public final Aweme LJLIL;
    public boolean LJLILLLLZI;

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

    public C9CI(Aweme aweme) {
        this.LJLIL = aweme;
    }
}
