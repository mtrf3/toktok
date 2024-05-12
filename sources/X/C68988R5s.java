package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R5s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68988R5s implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final List<String> LJLJJL;
    public final String LJLJJLL;
    public final boolean LJLJL;
    public boolean LJLJLJ;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C68988R5s copy$default(C68988R5s c68988R5s, String str, String str2, String str3, String str4, List list, String str5, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c68988R5s.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c68988R5s.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c68988R5s.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c68988R5s.LJLJJI;
        }
        if ((i & 16) != 0) {
            list = c68988R5s.LJLJJL;
        }
        if ((i & 32) != 0) {
            str5 = c68988R5s.LJLJJLL;
        }
        if ((i & 64) != 0) {
            z = c68988R5s.LJLJL;
        }
        if ((i & 128) != 0) {
            z2 = c68988R5s.LJLJLJ;
        }
        return c68988R5s.copy(str, str2, str3, str4, list, str5, z, z2);
    }

    public final C68988R5s copy(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z, boolean z2) {
        return new C68988R5s(str, str2, str3, str4, list, str5, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68988R5s)) {
            return false;
        }
        C68988R5s c68988R5s = (C68988R5s) obj;
        return o.LJ(this.LJLIL, c68988R5s.LJLIL) && o.LJ(this.LJLILLLLZI, c68988R5s.LJLILLLLZI) && o.LJ(this.LJLJI, c68988R5s.LJLJI) && o.LJ(this.LJLJJI, c68988R5s.LJLJJI) && o.LJ(this.LJLJJL, c68988R5s.LJLJJL) && o.LJ(this.LJLJJLL, c68988R5s.LJLJJLL) && this.LJLJL == c68988R5s.LJLJL && this.LJLJLJ == c68988R5s.LJLJLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.LJLJJL;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.LJLJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode6 + i) * 31) + (this.LJLJLJ ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecoverAccountModel(avatar_url=");
        LIZ.append(this.LJLIL);
        LIZ.append(", nickname=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", email=");
        LIZ.append(this.LJLJI);
        LIZ.append(", mobile=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", oauth_platform=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", ticket=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", safe=");
        LIZ.append(this.LJLJL);
        LIZ.append(", needStoreLastMethod=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    public final String getAvatar_url() {
        return this.LJLIL;
    }

    public final String getEmail() {
        return this.LJLJI;
    }

    public final String getMobile() {
        return this.LJLJJI;
    }

    public final boolean getNeedStoreLastMethod() {
        return this.LJLJLJ;
    }

    public final String getNickname() {
        return this.LJLILLLLZI;
    }

    public final List<String> getOauth_platform() {
        return this.LJLJJL;
    }

    public final boolean getSafe() {
        return this.LJLJL;
    }

    public final String getTicket() {
        return this.LJLJJLL;
    }

    public final void setNeedStoreLastMethod(boolean z) {
        this.LJLJLJ = z;
    }

    public C68988R5s(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z, boolean z2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = list;
        this.LJLJJLL = str5;
        this.LJLJL = z;
        this.LJLJLJ = z2;
    }
}
