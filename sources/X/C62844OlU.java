package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.OlU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62844OlU implements InterfaceC80653En {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.LJLJI;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        if (!this.LJLJJI) {
            i = 0;
        }
        return this.LJLJLJ.hashCode() + ((JBR.LIZJ(this.LJLJJLL, JBR.LIZJ(this.LJLJJL, (i5 + i) * 31, 31), 31) + this.LJLJL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaterMarkAbilityConfigProperty(filePrefix=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isAddInterMark=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isInstagram=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isUseVESDKWaterMark=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", startWatermark=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", endWatermark=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isSuccess=");
        LIZ.append(this.LJLJL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62844OlU)) {
            return false;
        }
        C62844OlU c62844OlU = (C62844OlU) obj;
        if (o.LJ(this.LJLIL, c62844OlU.LJLIL) && this.LJLILLLLZI == c62844OlU.LJLILLLLZI && this.LJLJI == c62844OlU.LJLJI && this.LJLJJI == c62844OlU.LJLJJI && this.LJLJJL == c62844OlU.LJLJJL && this.LJLJJLL == c62844OlU.LJLJJLL && this.LJLJL == c62844OlU.LJLJL && o.LJ(this.LJLJLJ, c62844OlU.LJLJLJ)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C62844OlU(String str, boolean z, boolean z2) {
        this(str, z, z2, true, -1L, -1L, 0, "");
    }

    public C62844OlU(String str, boolean z, boolean z2, boolean z3, long j, long j2, int i, String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = i;
        this.LJLJLJ = sourceId;
    }
}
