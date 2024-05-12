package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2P7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2P7 implements IEvent {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Aweme LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2P7)) {
            return false;
        }
        C2P7 c2p7 = (C2P7) obj;
        return this.LJLIL == c2p7.LJLIL && o.LJ(this.LJLILLLLZI, c2p7.LJLILLLLZI) && o.LJ(this.LJLJI, c2p7.LJLJI) && o.LJ(this.LJLJJI, c2p7.LJLJJI) && this.LJLJJL == c2p7.LJLJJL && o.LJ(this.LJLJJLL, c2p7.LJLJJLL);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LJLIL;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, r0 * 31, 31), 31);
        Aweme aweme = this.LJLJJI;
        int i2 = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i3 = (LJ + hashCode) * 31;
        if (!this.LJLJJL) {
            i = 0;
        }
        int i4 = (i3 + i) * 31;
        String str = this.LJLJJLL;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i4 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateMixListInFeedEvent(success=");
        LIZ.append(this.LJLIL);
        LIZ.append(", name=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", id=");
        LIZ.append(this.LJLJI);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", needOpenDialog=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C2P7(String str, String id, Aweme aweme, boolean z, String str2) {
        o.LJIIIZ(id, "id");
        this.LJLIL = true;
        this.LJLILLLLZI = str;
        this.LJLJI = id;
        this.LJLJJI = aweme;
        this.LJLJJL = z;
        this.LJLJJLL = str2;
    }
}
