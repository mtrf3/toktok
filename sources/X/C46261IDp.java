package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.IDp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46261IDp implements IEvent {
    public final Aweme LJLIL;
    public final float LJLILLLLZI;
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

    public C46261IDp(Aweme aweme, float f, IDR idr) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = f;
        this.LJLJI = idr;
    }
}
