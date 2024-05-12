package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OlS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62842OlS implements InterfaceC80653En {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final HashMap<String, String> LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final long LJLJJLL;
    public final int LJLJL;
    public final Integer LJLJLJ;
    public final String LJLJLLL;
    public final int LJLL;
    public final String LJLLI;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        HashMap<String, String> hashMap = this.LJLJI;
        if (hashMap == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hashMap.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJLJJI;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LJLJJL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LIZJ = (JBR.LIZJ(this.LJLJJLL, (i4 + i5) * 31, 31) + this.LJLJL) * 31;
        Integer num = this.LJLJLJ;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i6 = (LIZJ + hashCode4) * 31;
        String str3 = this.LJLJLLL;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.LJLLI.hashCode() + ((((i6 + i) * 31) + this.LJLL) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadChainConfigProperty(fromGroupID=");
        sb.append(this.LJLIL);
        sb.append(", newsId=");
        sb.append(this.LJLILLLLZI);
        sb.append(", inboxLogExtraMap=");
        sb.append(this.LJLJI);
        sb.append(", downloadActionType=");
        sb.append(this.LJLJJI);
        sb.append(", downloadWithoutWatermark=");
        sb.append(this.LJLJJL);
        sb.append(", duration=");
        sb.append(this.LJLJJLL);
        sb.append(", isSuccess=");
        sb.append(this.LJLJL);
        sb.append(", errorCode=");
        sb.append(this.LJLJLJ);
        sb.append(", errorDesc=");
        sb.append(this.LJLJLLL);
        sb.append(", status=");
        sb.append(this.LJLL);
        sb.append(", sourceId=");
        return C07670Rv.LIZIZ(sb, this.LJLLI, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62842OlS)) {
            return false;
        }
        C62842OlS c62842OlS = (C62842OlS) obj;
        if (o.LJ(this.LJLIL, c62842OlS.LJLIL) && o.LJ(this.LJLILLLLZI, c62842OlS.LJLILLLLZI) && o.LJ(this.LJLJI, c62842OlS.LJLJI) && o.LJ(this.LJLJJI, c62842OlS.LJLJJI) && this.LJLJJL == c62842OlS.LJLJJL && this.LJLJJLL == c62842OlS.LJLJJLL && this.LJLJL == c62842OlS.LJLJL && o.LJ(this.LJLJLJ, c62842OlS.LJLJLJ) && o.LJ(this.LJLJLLL, c62842OlS.LJLJLLL) && this.LJLL == c62842OlS.LJLL && o.LJ(this.LJLLI, c62842OlS.LJLLI)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C62842OlS(String str, String str2, HashMap hashMap, String str3, boolean z) {
        this(str, str2, hashMap, str3, z, -1L, -1, null, null, 100, "");
    }

    public C62842OlS(String str, String str2, HashMap<String, String> hashMap, String str3, boolean z, long j, int i, Integer num, String str4, int i2, String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = hashMap;
        this.LJLJJI = str3;
        this.LJLJJL = z;
        this.LJLJJLL = j;
        this.LJLJL = i;
        this.LJLJLJ = num;
        this.LJLJLLL = str4;
        this.LJLL = i2;
        this.LJLLI = sourceId;
    }
}
