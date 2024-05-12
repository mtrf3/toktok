package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.799, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass799 extends F9E implements IEvent {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final C79N LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
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

    public AnonymousClass799(String aid, long j, int i, C79N from) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(from, "from");
        this.LJLIL = aid;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = from;
    }
}
