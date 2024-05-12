package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.8kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220318kl implements IEvent {
    public final boolean LJLIL;
    public final C51031K1b<?> LJLILLLLZI;
    public final Long LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C220318kl)) {
            return false;
        }
        C220318kl c220318kl = (C220318kl) obj;
        return this.LJLIL == c220318kl.LJLIL && o.LJ(this.LJLILLLLZI, c220318kl.LJLILLLLZI) && o.LJ(this.LJLJI, c220318kl.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LJLILLLLZI.hashCode() + (r0 * 31)) * 31;
        Long l = this.LJLJI;
        return hashCode + (l == null ? 0 : l.hashCode());
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
        LIZ.append("LoadEvent(succeeded=");
        LIZ.append(this.LJLIL);
        LIZ.append(", presenter=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", topicId=");
        return JBR.LJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C220318kl(boolean z, C220368kq presenter, Long l) {
        o.LJIIIZ(presenter, "presenter");
        this.LJLIL = z;
        this.LJLILLLLZI = presenter;
        this.LJLJI = l;
    }
}
