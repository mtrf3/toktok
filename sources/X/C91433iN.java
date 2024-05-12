package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3iN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91433iN implements InterfaceC91483iS {
    public final String LIZ;
    public final String LIZIZ;
    public final C3Q9 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91433iN)) {
            return false;
        }
        C91433iN c91433iN = (C91433iN) obj;
        return o.LJ(this.LIZ, c91433iN.LIZ) && o.LJ(this.LIZIZ, c91433iN.LIZIZ) && o.LJ(this.LIZJ, c91433iN.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FromGroupConversationId(conversationId=");
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
        String str;
        C63088OpQ coreInfo;
        String valueOf = String.valueOf(C98793uF.LIZJ());
        String str2 = this.LIZ;
        C63120Opw LIZ = this.LIZJ.LIZ(str2);
        if (LIZ != null && (coreInfo = LIZ.getCoreInfo()) != null) {
            str = coreInfo.getName();
        } else {
            str = null;
        }
        return new C98803uG(valueOf, "", str2, null, null, "im_group_chat", 3, str, 0, false, false, null, null, null, null, null, null, this.LIZIZ, 130840, null);
    }

    public C91433iN(String conversationId, String str, int i) {
        C4WC conversationListModel = null;
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            conversationListModel = C4WC.LIZIZ;
        }
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(conversationListModel, "conversationListModel");
        this.LIZ = conversationId;
        this.LIZIZ = str;
        this.LIZJ = conversationListModel;
    }
}
