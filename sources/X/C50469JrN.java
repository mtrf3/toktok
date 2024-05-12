package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.JrN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50469JrN implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Boolean LJLJI;
    public final Boolean LJLJJI;
    public final Boolean LJLJJL;
    public final Boolean LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C50469JrN() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C50469JrN copy$default(C50469JrN c50469JrN, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50469JrN.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c50469JrN.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            bool = c50469JrN.LJLJI;
        }
        if ((i & 8) != 0) {
            bool2 = c50469JrN.LJLJJI;
        }
        if ((i & 16) != 0) {
            bool3 = c50469JrN.LJLJJL;
        }
        if ((i & 32) != 0) {
            bool4 = c50469JrN.LJLJJLL;
        }
        return c50469JrN.copy(str, str2, bool, bool2, bool3, bool4);
    }

    public final C50469JrN copy(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new C50469JrN(str, str2, bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50469JrN)) {
            return false;
        }
        C50469JrN c50469JrN = (C50469JrN) obj;
        return o.LJ(this.LJLIL, c50469JrN.LJLIL) && o.LJ(this.LJLILLLLZI, c50469JrN.LJLILLLLZI) && o.LJ(this.LJLJI, c50469JrN.LJLJI) && o.LJ(this.LJLJJI, c50469JrN.LJLJJI) && o.LJ(this.LJLJJL, c50469JrN.LJLJJL) && o.LJ(this.LJLJJLL, c50469JrN.LJLJJLL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LJLJI;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.LJLJJLL;
        return hashCode5 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchVideoModel(authorId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", groupId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isFeedLiked=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isFeedCollected=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isFeedCommentClicked=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isFeedForwardClicked=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.LJLIL;
    }

    public final String getGroupId() {
        return this.LJLILLLLZI;
    }

    public final Boolean isFeedCollected() {
        return this.LJLJJI;
    }

    public final Boolean isFeedCommentClicked() {
        return this.LJLJJL;
    }

    public final Boolean isFeedForwardClicked() {
        return this.LJLJJLL;
    }

    public final Boolean isFeedLiked() {
        return this.LJLJI;
    }

    public C50469JrN(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = bool;
        this.LJLJJI = bool2;
        this.LJLJJL = bool3;
        this.LJLJJLL = bool4;
    }

    public /* synthetic */ C50469JrN(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? Boolean.FALSE : bool2, (i & 16) != 0 ? Boolean.FALSE : bool3, (i & 32) != 0 ? Boolean.FALSE : bool4);
    }
}
