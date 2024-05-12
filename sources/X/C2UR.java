package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2UR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UR implements IEvent {
    public final Long LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2UR) && o.LJ(this.LJLIL, ((C2UR) obj).LJLIL);
    }

    public final int hashCode() {
        Long l = this.LJLIL;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
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

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECSearchLynxLiveJumpEvent(roomId=");
        return JBR.LJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C2UR(Long l) {
        this.LJLIL = l;
    }
}
