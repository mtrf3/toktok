package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8iG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218768iG implements InterfaceC57784Mm4 {
    public final UserInvitee LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.getUid().hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InvitableItem(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", inserted=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listType=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C218768iG c218768iG;
        if (!(interfaceC57784Mm4 instanceof C218768iG) || (c218768iG = (C218768iG) interfaceC57784Mm4) == null) {
            return false;
        }
        return o.LJ(c218768iG.LJLIL, this.LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C218768iG c218768iG;
        if (!(interfaceC57784Mm4 instanceof C218768iG) || (c218768iG = (C218768iG) interfaceC57784Mm4) == null) {
            return false;
        }
        return o.LJ(this.LJLIL.getUid(), c218768iG.LJLIL.getUid());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C218768iG)) {
            return false;
        }
        return o.LJ(this.LJLIL.getUid(), ((C218768iG) obj).LJLIL.getUid());
    }

    public C218768iG(UserInvitee user, boolean z, String str) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
    }
}
