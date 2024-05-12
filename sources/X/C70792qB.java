package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70792qB implements IEvent {
    public final Aweme LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C70792qB) && o.LJ(this.LJLIL, ((C70792qB) obj).LJLIL);
    }

    public final int hashCode() {
        Aweme aweme = this.LJLIL;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
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
        LIZ.append("RemoveAwemesByUidEvent(aweme=");
        return C770830u.LIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C70792qB(Aweme aweme) {
        this.LJLIL = aweme;
    }
}
