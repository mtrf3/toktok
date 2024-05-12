package X;

import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54713Ldd extends AbstractC54715Ldf {
    public final InboxLiveNotice LJLILLLLZI;
    public final boolean LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        InboxLiveNotice inboxLiveNotice = this.LJLILLLLZI;
        if (inboxLiveNotice == null) {
            hashCode = 0;
        } else {
            hashCode = inboxLiveNotice.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LJLJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaLiveItem(liveNotice=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isWithBreathAV=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.AbstractC54715Ldf
    public final InboxLiveNotice LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC54715Ldf
    public final boolean LIZIZ() {
        return this.LJLJI;
    }

    @Override // X.AbstractC54715Ldf, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof C54713Ldd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54713Ldd)) {
            return false;
        }
        C54713Ldd c54713Ldd = (C54713Ldd) obj;
        if (o.LJ(this.LJLILLLLZI, c54713Ldd.LJLILLLLZI) && this.LJLJI == c54713Ldd.LJLJI) {
            return true;
        }
        return false;
    }

    public C54713Ldd(InboxLiveNotice inboxLiveNotice, boolean z) {
        this.LJLILLLLZI = inboxLiveNotice;
        this.LJLJI = z;
    }
}
