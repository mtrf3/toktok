package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.2UX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UX implements IEvent {
    public final String LJLIL;
    public final Boolean LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2UX)) {
            return false;
        }
        C2UX c2ux = (C2UX) obj;
        return o.LJ(this.LJLIL, c2ux.LJLIL) && o.LJ(this.LJLILLLLZI, c2ux.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LJLILLLLZI;
        return hashCode + (bool != null ? bool.hashCode() : 0);
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
        LIZ.append("LikeChangeEvent(cid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isLikedByCreator=");
        return C78920UyC.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C2UX(String str, Boolean bool) {
        this.LJLIL = str;
        this.LJLILLLLZI = bool;
    }
}
