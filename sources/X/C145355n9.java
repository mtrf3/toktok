package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145355n9 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final boolean LIZ;
    public final String LIZIZ;
    public final AVMusic LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final HashMap<String, String> LJFF;
    public final long LJI;
    public final long LJII;

    static {
        new C145385nC();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C145355n9)) {
            return false;
        }
        C145355n9 c145355n9 = (C145355n9) obj;
        return this.LIZ == c145355n9.LIZ && o.LJ(this.LIZIZ, c145355n9.LIZIZ) && o.LJ(this.LIZJ, c145355n9.LIZJ) && o.LJ(this.LIZLLL, c145355n9.LIZLLL) && this.LJ == c145355n9.LJ && o.LJ(this.LJFF, c145355n9.LJFF) && this.LJI == c145355n9.LJI && this.LJII == c145355n9.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        String str = this.LIZIZ;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        AVMusic aVMusic = this.LIZJ;
        if (aVMusic == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVMusic.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        if (!this.LJ) {
            i = 0;
        }
        int i7 = (i6 + i) * 31;
        HashMap<String, String> hashMap = this.LJFF;
        if (hashMap != null) {
            i3 = hashMap.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJII) + JBR.LIZJ(this.LJI, (i7 + i3) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChooseMusicResultBean(isCancelCurrentMusic=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicOrigin=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", music=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicLocalPath=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isShowTips=");
        LIZ.append(this.LJ);
        LIZ.append(", extraLogMap=");
        LIZ.append(this.LJFF);
        LIZ.append(", musicDuration=");
        LIZ.append(this.LJI);
        LIZ.append(", musicStart=");
        return C47135Ieh.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C145355n9(boolean z, String str, AVMusic aVMusic, String str2, boolean z2, HashMap<String, String> hashMap, long j, long j2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = aVMusic;
        this.LIZLLL = str2;
        this.LJ = z2;
        this.LJFF = hashMap;
        this.LJI = j;
        this.LJII = j2;
    }

    public /* synthetic */ C145355n9(boolean z, String str, AVMusic aVMusic, String str2, boolean z2, HashMap hashMap, long j, long j2, int i) {
        this(z, str, aVMusic, str2, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : hashMap, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? -1L : j2);
    }
}
