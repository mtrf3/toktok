package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.LDx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53913LDx implements IEvent {
    public final C56141M1p LJLIL;
    public final LE2 LJLILLLLZI;

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

    public C53913LDx(C56141M1p c56141M1p, LE2 state) {
        o.LJIIIZ(state, "state");
        this.LJLIL = c56141M1p;
        this.LJLILLLLZI = state;
    }
}
