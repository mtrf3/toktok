package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.79X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79X extends C1809878k {
    public final User LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;
    public final String LJLJJL;
    public final C1811278y LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79X)) {
            return false;
        }
        C79X c79x = (C79X) obj;
        return o.LJ(this.LJLILLLLZI, c79x.LJLILLLLZI) && o.LJ(this.LJLJI, c79x.LJLJI) && this.LJLJJI == c79x.LJLJJI && o.LJ(this.LJLJJL, c79x.LJLJJL) && o.LJ(this.LJLJJLL, c79x.LJLJJLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReactionBubbleDmReplyItem(user=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", conversationId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", messageId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", content=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", mobEventParam=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LJLILLLLZI.hashCode() * 31;
        String str = this.LJLJI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLJJI, (hashCode3 + hashCode) * 31, 31);
        String str2 = this.LJLJJL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        C1811278y c1811278y = this.LJLJJLL;
        if (c1811278y != null) {
            i = c1811278y.hashCode();
        }
        return i2 + i;
    }

    public C79X(User user, String str, long j, String str2, C1811278y c1811278y) {
        super(5);
        this.LJLILLLLZI = user;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = str2;
        this.LJLJJLL = c1811278y;
    }
}
