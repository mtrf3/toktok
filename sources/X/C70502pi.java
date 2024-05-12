package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70502pi extends F9E implements IEvent {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
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

    public C70502pi(String awemeId, int i, int i2) {
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = awemeId;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
