package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TPn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74599TPn {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final LiveEffect LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final int LJI;
    public final LiveEffect LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74599TPn)) {
            return false;
        }
        C74599TPn c74599TPn = (C74599TPn) obj;
        return this.LIZ == c74599TPn.LIZ && this.LIZIZ == c74599TPn.LIZIZ && this.LIZJ == c74599TPn.LIZJ && o.LJ(this.LIZLLL, c74599TPn.LIZLLL) && this.LJ == c74599TPn.LJ && this.LJFF == c74599TPn.LJFF && this.LJI == c74599TPn.LJI && o.LJ(this.LJII, c74599TPn.LJII) && o.LJ(this.LJIIIIZZ, c74599TPn.LJIIIIZZ) && o.LJ(this.LJIIIZ, c74599TPn.LJIIIZ) && o.LJ(this.LJIIJ, c74599TPn.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + this.LIZJ) * 31;
        LiveEffect liveEffect = this.LIZLLL;
        int i5 = 0;
        if (liveEffect == null) {
            hashCode = 0;
        } else {
            hashCode = liveEffect.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        ?? r03 = this.LJ;
        int i7 = r03;
        if (r03 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        if (!this.LJFF) {
            i = 0;
        }
        int i9 = (((i8 + i) * 31) + this.LJI) * 31;
        LiveEffect liveEffect2 = this.LJII;
        if (liveEffect2 != null) {
            i5 = liveEffect2.hashCode();
        }
        return this.LJIIJ.hashCode() + C79062V1e.LJ(this.LJIIIZ, C79062V1e.LJ(this.LJIIIIZZ, (i9 + i5) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiGuestLinkedPreviewPanelOpenData(isVideoSwitchOnBefore=");
        sb.append(this.LIZ);
        sb.append(", isUsingBackCameraBefore=");
        sb.append(this.LIZIZ);
        sb.append(", beautyLevelBefore=");
        sb.append(this.LIZJ);
        sb.append(", stickerBefore=");
        sb.append(this.LIZLLL);
        sb.append(", isVideoSwitchOnWhenOpen=");
        sb.append(this.LJ);
        sb.append(", isUsingBackCameraWhenOpen=");
        sb.append(this.LJFF);
        sb.append(", beautyLevelWhenOpen=");
        sb.append(this.LJI);
        sb.append(", stickerWhenOpen=");
        sb.append(this.LJII);
        sb.append(", openSource=");
        sb.append(this.LJIIIIZZ);
        sb.append(", guestInviteType=");
        sb.append(this.LJIIIZ);
        sb.append(", from=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    public C74599TPn(boolean z, boolean z2, int i, LiveEffect liveEffect, boolean z3, boolean z4, int i2, LiveEffect liveEffect2, String openSource, String str, String from) {
        o.LJIIIZ(openSource, "openSource");
        o.LJIIIZ(from, "from");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = liveEffect;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = i2;
        this.LJII = liveEffect2;
        this.LJIIIIZZ = openSource;
        this.LJIIIZ = str;
        this.LJIIJ = from;
    }
}
