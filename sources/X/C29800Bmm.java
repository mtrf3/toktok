package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Bmm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29800Bmm {
    public final int LIZ;
    public final long LIZIZ;
    public final BadgeStruct LIZJ;
    public final BadgeStruct LIZLLL;
    public final ImageModel LJ;
    public final int LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final long LJIILIIL;

    public static C29800Bmm LIZ(int i, long j, BadgeStruct badgeStruct, BadgeStruct badgeStruct2, ImageModel imageModel, int i2, long j2, long j3, long j4, Integer num, String str, int i3, int i4, long j5) {
        return new C29800Bmm(i, j, badgeStruct, badgeStruct2, imageModel, i2, j2, j3, j4, num, str, i3, i4, j5);
    }

    public static /* synthetic */ C29800Bmm LIZIZ(C29800Bmm c29800Bmm, BadgeStruct badgeStruct, BadgeStruct badgeStruct2, int i, int i2, int i3, int i4) {
        BadgeStruct badgeStruct3 = badgeStruct2;
        BadgeStruct badgeStruct4 = badgeStruct;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        int i8 = (i4 & 1) != 0 ? c29800Bmm.LIZ : 0;
        long j = (i4 & 2) != 0 ? c29800Bmm.LIZIZ : 0L;
        if ((i4 & 4) != 0) {
            badgeStruct4 = c29800Bmm.LIZJ;
        }
        if ((i4 & 8) != 0) {
            badgeStruct3 = c29800Bmm.LIZLLL;
        }
        ImageModel imageModel = (i4 & 16) != 0 ? c29800Bmm.LJ : null;
        if ((i4 & 32) != 0) {
            i6 = c29800Bmm.LJFF;
        }
        long j2 = (i4 & 64) != 0 ? c29800Bmm.LJI : 0L;
        long j3 = (i4 & 128) != 0 ? c29800Bmm.LJII : 0L;
        long j4 = (i4 & 256) != 0 ? c29800Bmm.LJIIIIZZ : 0L;
        Integer num = (i4 & 512) != 0 ? c29800Bmm.LJIIIZ : null;
        String str = (i4 & 1024) != 0 ? c29800Bmm.LJIIJ : null;
        if ((i4 & 2048) != 0) {
            i7 = c29800Bmm.LJIIJJI;
        }
        if ((i4 & 4096) != 0) {
            i5 = c29800Bmm.LJIIL;
        }
        return LIZ(i8, j, badgeStruct4, badgeStruct3, imageModel, i6, j2, j3, j4, num, str, i7, i5, (i4 & FileUtils.BUFFER_SIZE) != 0 ? c29800Bmm.LJIILIIL : 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29800Bmm)) {
            return false;
        }
        C29800Bmm c29800Bmm = (C29800Bmm) obj;
        return this.LIZ == c29800Bmm.LIZ && this.LIZIZ == c29800Bmm.LIZIZ && o.LJ(this.LIZJ, c29800Bmm.LIZJ) && o.LJ(this.LIZLLL, c29800Bmm.LIZLLL) && o.LJ(this.LJ, c29800Bmm.LJ) && this.LJFF == c29800Bmm.LJFF && this.LJI == c29800Bmm.LJI && this.LJII == c29800Bmm.LJII && this.LJIIIIZZ == c29800Bmm.LJIIIIZZ && o.LJ(this.LJIIIZ, c29800Bmm.LJIIIZ) && o.LJ(this.LJIIJ, c29800Bmm.LJIIJ) && this.LJIIJJI == c29800Bmm.LJIIJJI && this.LJIIL == c29800Bmm.LJIIL && this.LJIILIIL == c29800Bmm.LJIILIIL;
    }

    public final String toString() {
        return "UserLevelState(currentLevel=" + this.LIZ + ", currentScore=" + this.LIZIZ + ", levelBadge=" + this.LIZJ + ", levelBadgeAlpha=" + this.LIZLLL + ", levelIcon=" + this.LJ + ", levelStatus=" + this.LJFF + ", levelMinScore=" + this.LJI + ", levelMaxScore=" + this.LJII + ", secondToSleep=" + this.LJIIIIZZ + ", barrageEffectConfig=" + this.LJIIIZ + ", avatarBorderColor=" + this.LJIIJ + ", fromLevel=" + this.LJIIJJI + ", scene=" + this.LJIIL + ", levelVersion=" + this.LJIILIIL + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ * 31, 31);
        BadgeStruct badgeStruct = this.LIZJ;
        int i = 0;
        if (badgeStruct == null) {
            hashCode = 0;
        } else {
            hashCode = badgeStruct.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        BadgeStruct badgeStruct2 = this.LIZLLL;
        if (badgeStruct2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = badgeStruct2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ImageModel imageModel = this.LJ;
        if (imageModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageModel.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.LJIIIIZZ, JBR.LIZJ(this.LJII, JBR.LIZJ(this.LJI, (((i3 + hashCode3) * 31) + this.LJFF) * 31, 31), 31), 31);
        Integer num = this.LJIIIZ;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i4 = (LIZJ2 + hashCode4) * 31;
        String str = this.LJIIJ;
        if (str != null) {
            i = str.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIILIIL) + ((((((i4 + i) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31);
    }

    public /* synthetic */ C29800Bmm(int i, long j, int i2, long j2, long j3, long j4, Integer num, String str, int i3, int i4, long j5, int i5) {
        this(i, (i5 & 2) != 0 ? 0L : j, null, null, null, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0L : j2, (i5 & 128) != 0 ? 0L : j3, (i5 & 256) != 0 ? 0L : j4, (i5 & 512) != 0 ? null : num, (i5 & 1024) != 0 ? null : str, (i5 & 2048) != 0 ? 0 : i3, (i5 & 4096) != 0 ? 0 : i4, (i5 & FileUtils.BUFFER_SIZE) != 0 ? 0L : j5);
    }

    public C29800Bmm(int i, long j, BadgeStruct badgeStruct, BadgeStruct badgeStruct2, ImageModel imageModel, int i2, long j2, long j3, long j4, Integer num, String str, int i3, int i4, long j5) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = badgeStruct;
        this.LIZLLL = badgeStruct2;
        this.LJ = imageModel;
        this.LJFF = i2;
        this.LJI = j2;
        this.LJII = j3;
        this.LJIIIIZZ = j4;
        this.LJIIIZ = num;
        this.LJIIJ = str;
        this.LJIIJJI = i3;
        this.LJIIL = i4;
        this.LJIILIIL = j5;
    }
}
