package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2IX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2IX implements IEvent {
    public final boolean LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;

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

    public C2IX(Aweme aweme, String str, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
    }
}
