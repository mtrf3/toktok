package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UE3 {
    public final long LIZ;
    public final int LIZIZ;
    public final UE8 LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final int LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public boolean LJIIIZ;
    public final ImageModel LJIIJ;
    public final ImageModel LJIIJJI;
    public final Long LJIIL;
    public final int LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UE3)) {
            return false;
        }
        UE3 ue3 = (UE3) obj;
        return this.LIZ == ue3.LIZ && this.LIZIZ == ue3.LIZIZ && o.LJ(this.LIZJ, ue3.LIZJ) && this.LIZLLL == ue3.LIZLLL && this.LJ == ue3.LJ && this.LJFF == ue3.LJFF && this.LJI == ue3.LJI && this.LJII == ue3.LJII && o.LJ(this.LJIIIIZZ, ue3.LJIIIIZZ) && this.LJIIIZ == ue3.LJIIIZ && o.LJ(this.LJIIJ, ue3.LJIIJ) && o.LJ(this.LJIIJJI, ue3.LJIIJJI) && o.LJ(this.LJIIL, ue3.LJIIL) && this.LJIILIIL == ue3.LJIILIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, (this.LIZJ.hashCode() + (((C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ) * 31)) * 31, 31), 31);
        boolean z = this.LJFF;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJIIIIZZ, JBR.LIZJ(this.LJII, (((LIZJ + i2) * 31) + this.LJI) * 31, 31), 31);
        if (!this.LJIIIZ) {
            i = 0;
        }
        int i3 = (LJ + i) * 31;
        ImageModel imageModel = this.LJIIJ;
        int i4 = 0;
        if (imageModel == null) {
            hashCode = 0;
        } else {
            hashCode = imageModel.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        ImageModel imageModel2 = this.LJIIJJI;
        if (imageModel2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageModel2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        Long l = this.LJIIL;
        if (l != null) {
            i4 = l.hashCode();
        }
        return ((i6 + i4) * 31) + this.LJIILIIL;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftTrayShowInfo(giftId=");
        sb.append(this.LIZ);
        sb.append(", giftType=");
        sb.append(this.LIZIZ);
        sb.append(", giftIcon=");
        sb.append(this.LIZJ);
        sb.append(", senderUid=");
        sb.append(this.LIZLLL);
        sb.append(", receiverUid=");
        sb.append(this.LJ);
        sb.append(", isCombo=");
        sb.append(this.LJFF);
        sb.append(", abFromSender=");
        sb.append(this.LJI);
        sb.append(", showDuration=");
        sb.append(this.LJII);
        sb.append(", uniqueId=");
        sb.append(this.LJIIIIZZ);
        sb.append(", isFromFly=");
        sb.append(this.LJIIIZ);
        sb.append(", pathImage=");
        sb.append(this.LJIIJ);
        sb.append(", receiverImage=");
        sb.append(this.LJIIJJI);
        sb.append(", timeDelay=");
        sb.append(this.LJIIL);
        sb.append(", downGradeLevel=");
        return UPJ.LIZLLL(sb, this.LJIILIIL, ')');
    }

    public UE3(long j, int i, UE8 ue8, long j2, long j3, boolean z, int i2, long j4, String uniqueId, ImageModel imageModel, ImageModel imageModel2, Long l, int i3) {
        o.LJIIIZ(uniqueId, "uniqueId");
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = ue8;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = z;
        this.LJI = i2;
        this.LJII = j4;
        this.LJIIIIZZ = uniqueId;
        this.LJIIIZ = false;
        this.LJIIJ = imageModel;
        this.LJIIJJI = imageModel2;
        this.LJIIL = l;
        this.LJIILIIL = i3;
    }
}
