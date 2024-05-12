package X;

import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UXE {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final UXD LIZJ;
    public final GuideKeywordsResponse.UserInfo LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UXE)) {
            return false;
        }
        UXE uxe = (UXE) obj;
        return this.LIZ == uxe.LIZ && this.LIZIZ == uxe.LIZIZ && o.LJ(this.LIZJ, uxe.LIZJ) && o.LJ(this.LIZLLL, uxe.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        UXD uxd = this.LIZJ;
        int hashCode = (i + (uxd == null ? 0 : uxd.hashCode())) * 31;
        GuideKeywordsResponse.UserInfo userInfo = this.LIZLLL;
        return hashCode + (userInfo != null ? userInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HotWordGiftWidgetState(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", useAnimation=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZJ);
        LIZ.append(", userInfo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public UXE(boolean z, UXD uxd, GuideKeywordsResponse.UserInfo userInfo, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        uxd = (i & 4) != 0 ? null : uxd;
        userInfo = (i & 8) != 0 ? null : userInfo;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = uxd;
        this.LIZLLL = userInfo;
    }
}
