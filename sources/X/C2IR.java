package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2IR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2IR implements IEvent {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Aweme LJLJI;
    public final String LJLJJI;

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

    public C2IR(int i, int i2, Aweme aweme, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = aweme;
        this.LJLJJI = str;
    }
}
