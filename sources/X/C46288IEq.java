package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.IEq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46288IEq implements IEvent {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final IDR LJLJJI;
    public final boolean LJLJJL;

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

    public C46288IEq(Aweme aweme, String str, int i, IDR idr, boolean z) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = idr;
        this.LJLJJL = z;
    }

    public C46288IEq(Aweme aweme, String str, int i, int i2, IDR idr) {
        this(aweme, str, i2, idr, false);
    }
}
