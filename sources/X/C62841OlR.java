package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.OlR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62841OlR implements InterfaceC80653En {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;

    public final int hashCode() {
        int hashCode;
        int LIZJ = (((JBR.LIZJ(this.LJLJJL, JBR.LIZJ(this.LJLJJI, JBR.LIZJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL * 31, 31), 31), 31), 31) + this.LJLJJLL) * 31) + this.LJLJL) * 31;
        String str = this.LJLJLJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str2 = this.LJLJLLL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.LJLL.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadAbilityConfigProperty(isServerWatermark=");
        LIZ.append(this.LJLIL);
        LIZ.append(", downloadUrl=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", startDownload=");
        LIZ.append(this.LJLJI);
        LIZ.append(", endDownload=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", packageSize=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", downloadResult=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", retryFailed=");
        LIZ.append(this.LJLJL);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62841OlR)) {
            return false;
        }
        C62841OlR c62841OlR = (C62841OlR) obj;
        if (this.LJLIL == c62841OlR.LJLIL && o.LJ(this.LJLILLLLZI, c62841OlR.LJLILLLLZI) && this.LJLJI == c62841OlR.LJLJI && this.LJLJJI == c62841OlR.LJLJJI && this.LJLJJL == c62841OlR.LJLJJL && this.LJLJJLL == c62841OlR.LJLJJLL && this.LJLJL == c62841OlR.LJLJL && o.LJ(this.LJLJLJ, c62841OlR.LJLJLJ) && o.LJ(this.LJLJLLL, c62841OlR.LJLJLLL) && o.LJ(this.LJLL, c62841OlR.LJLL)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C62841OlR(int i, String str) {
        this(i, str, 0L, 0L, -1L, -1, -1, null, null, "");
    }

    public C62841OlR(int i, String downloadUrl, long j, long j2, long j3, int i2, int i3, String str, String str2, String sourceId) {
        o.LJIIIZ(downloadUrl, "downloadUrl");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = i;
        this.LJLILLLLZI = downloadUrl;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
        this.LJLJLJ = str;
        this.LJLJLLL = str2;
        this.LJLL = sourceId;
    }
}
