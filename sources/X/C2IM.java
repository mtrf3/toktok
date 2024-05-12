package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.2IM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2IM implements IEvent {
    public final boolean LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final Integer LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

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

    public C2IM(boolean z, Aweme aweme, String str, String str2, Integer num, boolean z2, boolean z3) {
        this.LJLIL = z;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = num;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
    }
}
