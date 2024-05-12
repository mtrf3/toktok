package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2P1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2P1 implements IEvent {
    public final String LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2P1) && o.LJ(this.LJLIL, ((C2P1) obj).LJLIL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
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
        LIZ.append("DetailVideoFirstFrameEvent(aid=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C2P1(String str) {
        this.LJLIL = str;
    }
}
