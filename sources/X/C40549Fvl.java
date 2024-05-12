package X;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;

/* renamed from: X.Fvl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40549Fvl extends AbstractC40550Fvm {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final List<String> LJFF;
    public final List<String> LJI;
    public final PendingIntent LJII;
    public final List<Intent> LJIIIIZZ;

    public C40549Fvl(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = list;
        this.LJI = list2;
        this.LJII = pendingIntent;
        this.LJIIIIZZ = list3;
    }

    @Override // X.AbstractC40550Fvm
    public final List<String> LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC40550Fvm
    public final List<String> LIZIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC40550Fvm
    public final long LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC40550Fvm
    public final List<Intent> LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC40550Fvm
    public final int LJI() {
        return this.LIZJ;
    }

    @Override // X.AbstractC40550Fvm
    public final PendingIntent LJIIIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC40550Fvm
    public final int LJIIJ() {
        return this.LIZ;
    }

    @Override // X.AbstractC40550Fvm
    public final int LJIIJJI() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC40550Fvm
    public final long LJIIL() {
        return this.LJ;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC40550Fvm) {
            AbstractC40550Fvm abstractC40550Fvm = (AbstractC40550Fvm) obj;
            if (this.LIZ == abstractC40550Fvm.LJIIJ() && this.LIZIZ == abstractC40550Fvm.LJIIJJI() && this.LIZJ == abstractC40550Fvm.LJI() && this.LIZLLL == abstractC40550Fvm.LIZJ() && this.LJ == abstractC40550Fvm.LJIIL() && ((list = this.LJFF) != null ? list.equals(abstractC40550Fvm.LIZ()) : abstractC40550Fvm.LIZ() == null) && ((list2 = this.LJI) != null ? list2.equals(abstractC40550Fvm.LIZIZ()) : abstractC40550Fvm.LIZIZ() == null) && ((pendingIntent = this.LJII) != null ? pendingIntent.equals(abstractC40550Fvm.LJIIIZ()) : abstractC40550Fvm.LJIIIZ() == null)) {
                List<Intent> list3 = this.LJIIIIZZ;
                List<Intent> LIZLLL = abstractC40550Fvm.LIZLLL();
                if (list3 != null ? list3.equals(LIZLLL) : LIZLLL == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        int i3 = this.LIZJ;
        long j = this.LIZLLL;
        long j2 = this.LJ;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.LJFF;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.LJI;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.LJII;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.LJIIIIZZ;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        int i3 = this.LIZJ;
        long j = this.LIZLLL;
        long j2 = this.LJ;
        String valueOf = String.valueOf(this.LJFF);
        String valueOf2 = String.valueOf(this.LJI);
        String valueOf3 = String.valueOf(this.LJII);
        String valueOf4 = String.valueOf(this.LJIIIIZZ);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        C1EU.LIZJ(sb, "SplitInstallSessionState{sessionId=", i, ", status=", i2);
        V1I.LIZLLL(sb, ", errorCode=", i3, ", bytesDownloaded=");
        sb.append(j);
        C0MT.LIZLLL(sb, ", totalBytesToDownload=", j2, ", moduleNamesNullable=");
        YE1.LIZLLL(sb, valueOf, ", languagesNullable=", valueOf2, ", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
