package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Loa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55392Loa implements IEvent {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI = true;

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

    public C55392Loa(Aweme aweme, String str) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
    }
}
