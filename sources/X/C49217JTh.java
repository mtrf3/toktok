package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JTh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49217JTh implements IEvent {
    public final K8U LJLIL;
    public final CompletionBlock<K8S> LJLILLLLZI;
    public final String LJLJI;

    public C49217JTh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49217JTh)) {
            return false;
        }
        C49217JTh c49217JTh = (C49217JTh) obj;
        return o.LJ(this.LJLIL, c49217JTh.LJLIL) && o.LJ(this.LJLILLLLZI, c49217JTh.LJLILLLLZI) && o.LJ(this.LJLJI, c49217JTh.LJLJI);
    }

    public final int hashCode() {
        K8U k8u = this.LJLIL;
        int hashCode = (k8u == null ? 0 : k8u.hashCode()) * 31;
        CompletionBlock<K8S> completionBlock = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (completionBlock == null ? 0 : completionBlock.hashCode())) * 31;
        String str = this.LJLJI;
        return hashCode2 + (str != null ? str.hashCode() : 0);
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
        LIZ.append("OpenCommentEvent(params=");
        LIZ.append(this.LJLIL);
        LIZ.append(", callback=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", aid=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C49217JTh(K8U k8u, C37356ElM c37356ElM) {
        this.LJLIL = k8u;
        this.LJLILLLLZI = c37356ElM;
        this.LJLJI = null;
    }
}
