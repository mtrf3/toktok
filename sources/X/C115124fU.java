package X;

import com.google.android.play.core.assetpacks.s0;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.4fU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115124fU extends F9E implements IEvent {
    public final s0 LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
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

    public C115124fU(s0 s0Var) {
        this.LJLIL = s0Var;
    }
}
