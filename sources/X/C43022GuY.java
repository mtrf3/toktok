package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GuY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43022GuY {
    public final List<MusicModel> LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public C43022GuY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43022GuY)) {
            return false;
        }
        C43022GuY c43022GuY = (C43022GuY) obj;
        return o.LJ(this.LIZ, c43022GuY.LIZ) && this.LIZIZ == c43022GuY.LIZIZ && this.LIZJ == c43022GuY.LIZJ && this.LIZLLL == c43022GuY.LIZLLL && this.LJ == c43022GuY.LJ && o.LJ(this.LJFF, c43022GuY.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        List<MusicModel> list = this.LIZ;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int LIZJ = (((JBR.LIZJ(this.LIZIZ, hashCode * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJFF.hashCode() + ((LIZJ + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIMusicResultCache(musicList=");
        LIZ.append(this.LIZ);
        LIZ.append(", spendTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sourceFrom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cursor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hasMore=");
        LIZ.append(this.LJ);
        LIZ.append(", zipUrl=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ C43022GuY(int i) {
        this(null, 0L, 0, 0, false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43022GuY(List<? extends MusicModel> list, long j, int i, int i2, boolean z, String zipUrl) {
        o.LJIIIZ(zipUrl, "zipUrl");
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z;
        this.LJFF = zipUrl;
    }
}
