package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.7Wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187227Wk implements IEvent {
    public final PrivateUrlModel LJLIL;
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

    public C187227Wk(Aweme aweme, PrivateUrlModel privateUrlModel) {
        this.LJLIL = privateUrlModel;
        this.LJLILLLLZI = aweme;
    }
}
