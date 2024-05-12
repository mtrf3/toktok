package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Bly, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29750Bly {
    public final long LIZ;
    public final long LIZIZ;
    public final ImageModel LIZJ;
    public final BadgeStruct LIZLLL;
    public final int LJ;
    public final Integer LJFF;
    public final String LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29750Bly)) {
            return false;
        }
        C29750Bly c29750Bly = (C29750Bly) obj;
        return this.LIZ == c29750Bly.LIZ && this.LIZIZ == c29750Bly.LIZIZ && o.LJ(this.LIZJ, c29750Bly.LIZJ) && o.LJ(this.LIZLLL, c29750Bly.LIZLLL) && this.LJ == c29750Bly.LJ && o.LJ(this.LJFF, c29750Bly.LJFF) && o.LJ(this.LJI, c29750Bly.LJI) && this.LJII == c29750Bly.LJII;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        ImageModel imageModel = this.LIZJ;
        int i = 0;
        if (imageModel == null) {
            hashCode = 0;
        } else {
            hashCode = imageModel.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        BadgeStruct badgeStruct = this.LIZLLL;
        if (badgeStruct == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = badgeStruct.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.LJ) * 31;
        Integer num = this.LJFF;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.LJI;
        if (str != null) {
            i = str.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJII) + ((i4 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FansClubState(fansLevel=");
        LIZ.append(this.LIZ);
        LIZ.append(", fansScore=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fansIcon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", badgeStruct=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", levelStatus=");
        LIZ.append(this.LJ);
        LIZ.append(", barrageEffectConfig=");
        LIZ.append(this.LJFF);
        LIZ.append(", fanTextColor=");
        LIZ.append(this.LJI);
        LIZ.append(", fansCount=");
        return C47135Ieh.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C29750Bly(long j, long j2, ImageModel imageModel, BadgeStruct badgeStruct, int i, Integer num, String str, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = imageModel;
        this.LIZLLL = badgeStruct;
        this.LJ = i;
        this.LJFF = num;
        this.LJI = str;
        this.LJII = j3;
    }

    public static C29750Bly LIZ(C29750Bly c29750Bly, long j, long j2, ImageModel imageModel, BadgeStruct badgeStruct, int i, String str, long j3, int i2) {
        Integer num;
        long j4 = j3;
        long j5 = j2;
        long j6 = j;
        String str2 = str;
        ImageModel imageModel2 = imageModel;
        BadgeStruct badgeStruct2 = badgeStruct;
        int i3 = i;
        if ((i2 & 1) != 0) {
            j6 = c29750Bly.LIZ;
        }
        if ((i2 & 2) != 0) {
            j5 = c29750Bly.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            imageModel2 = c29750Bly.LIZJ;
        }
        if ((i2 & 8) != 0) {
            badgeStruct2 = c29750Bly.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i3 = c29750Bly.LJ;
        }
        if ((i2 & 32) != 0) {
            num = c29750Bly.LJFF;
        } else {
            num = null;
        }
        if ((i2 & 64) != 0) {
            str2 = c29750Bly.LJI;
        }
        if ((i2 & 128) != 0) {
            j4 = c29750Bly.LJII;
        }
        return new C29750Bly(j6, j5, imageModel2, badgeStruct2, i3, num, str2, j4);
    }
}
