package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tld, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75593Tld {
    public final List<C75883TqJ> LIZ;
    public final String LIZIZ;
    public final CustomLinkMessage LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75593Tld)) {
            return false;
        }
        C75593Tld c75593Tld = (C75593Tld) obj;
        return o.LJ(this.LIZ, c75593Tld.LIZ) && o.LJ(this.LIZIZ, c75593Tld.LIZIZ) && o.LJ(this.LIZJ, c75593Tld.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserListChangedMessage(userList=");
        LIZ.append(this.LIZ);
        LIZ.append(", from=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", customLinkMessage=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        CustomLinkMessage customLinkMessage = this.LIZJ;
        if (customLinkMessage == null) {
            hashCode = 0;
        } else {
            hashCode = customLinkMessage.hashCode();
        }
        return LJ + hashCode;
    }

    public C75593Tld(List<C75883TqJ> userList, String str, CustomLinkMessage customLinkMessage) {
        o.LJIIIZ(userList, "userList");
        this.LIZ = userList;
        this.LIZIZ = str;
        this.LIZJ = customLinkMessage;
    }
}
