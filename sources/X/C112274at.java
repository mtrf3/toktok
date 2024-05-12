package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.4at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112274at extends F9E implements IEvent {
    public final EnumC112364b2 LJLIL;

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

    public C112274at(EnumC112364b2 position) {
        o.LJIIIZ(position, "position");
        this.LJLIL = position;
    }
}
