package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.3dN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88333dN {
    public final Integer LIZ;
    public final ConversationInfo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88333dN)) {
            return false;
        }
        C88333dN c88333dN = (C88333dN) obj;
        return o.LJ(this.LIZ, c88333dN.LIZ) && o.LJ(this.LIZIZ, c88333dN.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        return this.LIZIZ.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimpleConversationList(role=");
        LIZ.append(this.LIZ);
        LIZ.append(", conversationInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C88333dN(Integer num, ConversationInfo conversationInfo) {
        o.LJIIIZ(conversationInfo, "conversationInfo");
        this.LIZ = num;
        this.LIZIZ = conversationInfo;
    }
}
