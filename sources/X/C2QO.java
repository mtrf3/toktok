package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2QO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QO implements IEvent {
    public final Aweme LJLIL;
    public final float LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2QO)) {
            return false;
        }
        C2QO c2qo = (C2QO) obj;
        return o.LJ(this.LJLIL, c2qo.LJLIL) && Float.compare(this.LJLILLLLZI, c2qo.LJLILLLLZI) == 0;
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

    public final int hashCode() {
        int hashCode;
        Aweme aweme = this.LJLIL;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        return Float.floatToIntBits(this.LJLILLLLZI) + (hashCode * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveTaskPlayerProgressEvent(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", progress=");
        return C74221TAz.LIZLLL(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C2QO(float f, Aweme aweme) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = f;
    }
}
