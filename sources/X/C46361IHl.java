package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.IHl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46361IHl implements IEvent {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final float LJLJI;
    public final IDR LJLJJI;
    public final long LJLJJL;
    public final boolean LJLJJLL = false;

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

    public C46361IHl(Aweme aweme, String str, float f, IDR idr, long j) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = f;
        this.LJLJJI = idr;
        this.LJLJJL = j;
    }
}
