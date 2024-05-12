package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3iM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91423iM implements InterfaceC91483iS {
    public final C99033ud LIZ;
    public final String LIZIZ;
    public final C3Q9 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91423iM)) {
            return false;
        }
        C91423iM c91423iM = (C91423iM) obj;
        return o.LJ(this.LIZ, c91423iM.LIZ) && o.LJ(this.LIZIZ, c91423iM.LIZIZ) && o.LJ(this.LIZJ, c91423iM.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FromAnySessionInfo(sessionInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", conversationListModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC91483iS
    public final C98803uG LIZ() {
        C99033ud c99033ud = this.LIZ;
        if (c99033ud instanceof C98523to) {
            return new C91463iQ((C98523to) c99033ud, this.LIZIZ, this.LIZJ, null, 8).LIZ();
        }
        if ((c99033ud instanceof C98563ts) || c99033ud.isGroupChat()) {
            return new C91433iN(this.LIZ.getConversationId(), this.LIZIZ, 4).LIZ();
        }
        return null;
    }

    public C91423iM(C99033ud sessionInfo) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LIZ = sessionInfo;
        this.LIZIZ = null;
        this.LIZJ = c4wc;
    }
}
