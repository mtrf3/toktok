package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* loaded from: classes9.dex */
public final class IN8 extends F9E implements IEvent {
    public final Aweme LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final long LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL)};
    }

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

    public IN8(Aweme aweme, boolean z, long j, int i, int i2, long j2) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = j2;
    }
}
