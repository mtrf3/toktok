package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9ID, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ID implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final Boolean LJLJJLL;
    public final String LJLJL;
    public final HashMap<String, String> LJLJLJ;

    public C9ID() {
        this(null, null, false, null, null, Boolean.FALSE, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9ID)) {
            return false;
        }
        C9ID c9id = (C9ID) obj;
        return o.LJ(this.LJLIL, c9id.LJLIL) && o.LJ(this.LJLILLLLZI, c9id.LJLILLLLZI) && this.LJLJI == c9id.LJLJI && o.LJ(this.LJLJJI, c9id.LJLJJI) && o.LJ(this.LJLJJL, c9id.LJLJJL) && o.LJ(this.LJLJJLL, c9id.LJLJJLL) && o.LJ(this.LJLJL, c9id.LJLJL) && o.LJ(this.LJLJLJ, c9id.LJLJLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str3 = this.LJLJJI;
        int hashCode3 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.LJLJJLL;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.LJLJL;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        HashMap<String, String> hashMap = this.LJLJLJ;
        return hashCode6 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MineProfileInitData(from=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isMine=");
        LIZ.append(this.LJLJI);
        LIZ.append(", uid=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", secUid=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", delayProfileLoading=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", noticeType=");
        LIZ.append(this.LJLJL);
        LIZ.append(", logExtra=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C9ID(String str, String str2, boolean z, String str3, String str4, Boolean bool, String str5, HashMap<String, String> hashMap) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = bool;
        this.LJLJL = str5;
        this.LJLJLJ = hashMap;
    }
}
