package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JgY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49798JgY implements IEvent {
    public final int LJLIL = 2;
    public final String LJLILLLLZI = "SearchResultFragment#handleBackPressed";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49798JgY)) {
            return false;
        }
        C49798JgY c49798JgY = (C49798JgY) obj;
        return this.LJLIL == c49798JgY.LJLIL && o.LJ(this.LJLILLLLZI, c49798JgY.LJLILLLLZI);
    }

    public final int hashCode() {
        int i = this.LJLIL * 31;
        String str = this.LJLILLLLZI;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final IEvent post() {
        if (((Boolean) C50365Jph.LIZJ.getValue()).booleanValue()) {
            C2U8.LIZ(this);
        }
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelMixRequestEvent(code=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reason=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }
}
