package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GSX implements Serializable {
    public String LJLIL;
    public String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;
    public String LJLJLLL;

    public static /* synthetic */ GSX copy$default(GSX gsx, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gsx.LJLIL;
        }
        if ((i4 & 2) != 0) {
            str2 = gsx.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            str3 = gsx.LJLJI;
        }
        if ((i4 & 8) != 0) {
            str4 = gsx.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            str5 = gsx.LJLJJL;
        }
        if ((i4 & 32) != 0) {
            i = gsx.LJLJJLL;
        }
        if ((i4 & 64) != 0) {
            i2 = gsx.LJLJL;
        }
        if ((i4 & 128) != 0) {
            i3 = gsx.LJLJLJ;
        }
        if ((i4 & 256) != 0) {
            str6 = gsx.LJLJLLL;
        }
        return gsx.copy(str, str2, str3, str4, str5, i, i2, i3, str6);
    }

    public final GSX copy(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return new GSX(str, str2, str3, str4, str5, i, i2, i3, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GSX)) {
            return false;
        }
        GSX gsx = (GSX) obj;
        return o.LJ(this.LJLIL, gsx.LJLIL) && o.LJ(this.LJLILLLLZI, gsx.LJLILLLLZI) && o.LJ(this.LJLJI, gsx.LJLJI) && o.LJ(this.LJLJJI, gsx.LJLJJI) && o.LJ(this.LJLJJL, gsx.LJLJJL) && this.LJLJJLL == gsx.LJLJJLL && this.LJLJL == gsx.LJLJL && this.LJLJLJ == gsx.LJLJLJ && o.LJ(this.LJLJLLL, gsx.LJLJLLL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJLJJL;
        int hashCode5 = (((((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.LJLJJLL) * 31) + this.LJLJL) * 31) + this.LJLJLJ) * 31;
        String str6 = this.LJLJLLL;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChainInfo(uniqueId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", nickname=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", userId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", secUid=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", aid=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", privateStatus=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isPrivateAccount=");
        LIZ.append(this.LJLJL);
        LIZ.append(", subType=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    public final String getAid() {
        return this.LJLJJL;
    }

    public final String getEnterMethod() {
        return this.LJLJLLL;
    }

    public final String getNickname() {
        return this.LJLILLLLZI;
    }

    public final int getPrivateStatus() {
        return this.LJLJJLL;
    }

    public final String getSecUid() {
        return this.LJLJJI;
    }

    public final int getSubType() {
        return this.LJLJLJ;
    }

    public final String getUniqueId() {
        return this.LJLIL;
    }

    public final String getUserId() {
        return this.LJLJI;
    }

    public final int isPrivateAccount() {
        return this.LJLJL;
    }

    public final void setAid(String str) {
        this.LJLJJL = str;
    }

    public final void setEnterMethod(String str) {
        this.LJLJLLL = str;
    }

    public final void setNickname(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setPrivateAccount(int i) {
        this.LJLJL = i;
    }

    public final void setPrivateStatus(int i) {
        this.LJLJJLL = i;
    }

    public final void setUniqueId(String str) {
        this.LJLIL = str;
    }

    public GSX(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = i;
        this.LJLJL = i2;
        this.LJLJLJ = i3;
        this.LJLJLLL = str6;
    }

    public /* synthetic */ GSX(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) == 0 ? str5 : null, i, i2, i3, str6);
    }
}
