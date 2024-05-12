package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.LxN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55937LxN implements IEvent {
    public final LE4 LJLIL;

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

    public C55937LxN(LE4 state) {
        o.LJIIIZ(state, "state");
        this.LJLIL = state;
    }
}
