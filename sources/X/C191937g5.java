package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191937g5 implements IEvent {
    public final CollectionManageRequest LJLIL;
    public final String LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C191937g5)) {
            return false;
        }
        C191937g5 c191937g5 = (C191937g5) obj;
        return o.LJ(this.LJLIL, c191937g5.LJLIL) && o.LJ(this.LJLILLLLZI, c191937g5.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str == null ? 0 : str.hashCode());
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
        LIZ.append("VideoCollectionOperationEvent(request=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C191937g5(CollectionManageRequest request, String str) {
        o.LJIIIZ(request, "request");
        this.LJLIL = request;
        this.LJLILLLLZI = str;
    }
}
