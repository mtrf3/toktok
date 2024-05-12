package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.8z6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229208z6 implements IEvent {
    public final Aweme LJLIL;

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

    public C229208z6(Aweme aweme) {
        this.LJLIL = aweme;
    }
}
