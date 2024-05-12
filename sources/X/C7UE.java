package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7UE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7UE implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubOnlyVideoItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isAuthor=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", userId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", secUserId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C7UE) {
            C7UE c7ue = (C7UE) interfaceC57784Mm4;
            if (o.LJ(this.LJLIL.getAid(), c7ue.LJLIL.getAid()) && this.LJLIL.isAttrUpdated() == c7ue.LJLIL.isAttrUpdated()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7UE) {
            return o.LJ(this.LJLIL, ((C7UE) obj).LJLIL);
        }
        return super.equals(obj);
    }

    public C7UE(Aweme aweme, boolean z, long j, String secUserId, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = aweme;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = secUserId;
        this.LJLJJL = enterFrom;
    }
}
