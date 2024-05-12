package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.JeV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49671JeV implements IEvent {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;
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

    public C49671JeV(int i, String sessionId, String currentId, long j) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(currentId, "currentId");
        this.LJLIL = sessionId;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = currentId;
    }
}
