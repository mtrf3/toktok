package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.7im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193607im implements IEvent {
    public final boolean LJLIL;
    public final Boolean LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C193607im)) {
            return false;
        }
        C193607im c193607im = (C193607im) obj;
        return this.LJLIL == c193607im.LJLIL && o.LJ(this.LJLILLLLZI, c193607im.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.LJLILLLLZI;
        return i + (bool == null ? 0 : bool.hashCode());
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
        LIZ.append("NearbySimpleModeEvent(isSimpleMode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", publishLandingNearby=");
        return C78920UyC.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C193607im(boolean z, Boolean bool) {
        this.LJLIL = z;
        this.LJLILLLLZI = bool;
    }
}
