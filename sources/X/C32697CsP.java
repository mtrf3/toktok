package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.CsP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32697CsP extends C30896CAq {
    public final long LIZ;
    public final Long LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final ImageModel LJI;
    public final ImageModel LJII;
    public final GiftPanelBanner LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32697CsP)) {
            return false;
        }
        C32697CsP c32697CsP = (C32697CsP) obj;
        return this.LIZ == c32697CsP.LIZ && o.LJ(this.LIZIZ, c32697CsP.LIZIZ) && this.LIZJ == c32697CsP.LIZJ && o.LJ(this.LIZLLL, c32697CsP.LIZLLL) && o.LJ(this.LJ, c32697CsP.LJ) && o.LJ(this.LJFF, c32697CsP.LJFF) && o.LJ(this.LJI, c32697CsP.LJI) && o.LJ(this.LJII, c32697CsP.LJII) && o.LJ(this.LJIIIIZZ, c32697CsP.LJIIIIZZ) && this.LJIIIZ == c32697CsP.LJIIIZ && this.LJIIJ == c32697CsP.LJIIJ && this.LJIIJJI == c32697CsP.LJIIJJI && o.LJ(this.LJIIL, c32697CsP.LJIIL) && this.LJIILIIL == c32697CsP.LJIILIIL;
    }

    public final String LIZIZ() {
        int i = this.LJIIIZ;
        if (i == 1) {
            return "boosting_gloves";
        }
        if (i == 2) {
            return "magic_smokes";
        }
        return "unknown";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        Long l = this.LIZIZ;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZJ, (LLJIJIL + hashCode) * 31, 31);
        Long l2 = this.LIZLLL;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, (LIZJ + hashCode2) * 31, 31), 31);
        ImageModel imageModel = this.LJI;
        if (imageModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageModel.hashCode();
        }
        int i2 = (LJ + hashCode3) * 31;
        ImageModel imageModel2 = this.LJII;
        if (imageModel2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = imageModel2.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        GiftPanelBanner giftPanelBanner = this.LJIIIIZZ;
        if (giftPanelBanner != null) {
            i = giftPanelBanner.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.LJIIJ, (((i3 + i) * 31) + this.LJIIIZ) * 31, 31);
        boolean z = this.LJIIJJI;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJIIL, (LIZJ2 + i5) * 31, 31);
        if (!this.LJIILIIL) {
            i4 = 0;
        }
        return LJ2 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchItem(count=");
        sb.append(this.LIZ);
        sb.append(", nextCount=");
        sb.append(this.LIZIZ);
        sb.append(", expireAt=");
        sb.append(this.LIZJ);
        sb.append(", nextExpireAt=");
        sb.append(this.LIZLLL);
        sb.append(", displayTimeLeft=");
        sb.append(this.LJ);
        sb.append(", nameText=");
        sb.append(this.LJFF);
        sb.append(", previewImage=");
        sb.append(this.LJI);
        sb.append(", image=");
        sb.append(this.LJII);
        sb.append(", banner=");
        sb.append(this.LJIIIIZZ);
        sb.append(", itemType=");
        sb.append(this.LJIIIZ);
        sb.append(", itemId=");
        sb.append(this.LJIIJ);
        sb.append(", available=");
        sb.append(this.LJIIJJI);
        sb.append(", toastWhenUnavailable=");
        sb.append(this.LJIIL);
        sb.append(", sendLoading=");
        return C08880Wm.LIZJ(sb, this.LJIILIIL, ')');
    }

    public static C32697CsP LIZ(C32697CsP c32697CsP, long j, Long l, long j2, Long l2, String str, boolean z, int i) {
        String nameText;
        ImageModel imageModel;
        ImageModel imageModel2;
        GiftPanelBanner giftPanelBanner;
        int i2;
        long j3;
        boolean z2;
        String toastWhenUnavailable;
        Long l3 = l;
        long j4 = j;
        long j5 = j2;
        Long l4 = l2;
        String displayTimeLeft = str;
        boolean z3 = z;
        if ((i & 1) != 0) {
            j4 = c32697CsP.LIZ;
        }
        if ((i & 2) != 0) {
            l3 = c32697CsP.LIZIZ;
        }
        if ((i & 4) != 0) {
            j5 = c32697CsP.LIZJ;
        }
        if ((i & 8) != 0) {
            l4 = c32697CsP.LIZLLL;
        }
        if ((i & 16) != 0) {
            displayTimeLeft = c32697CsP.LJ;
        }
        if ((i & 32) != 0) {
            nameText = c32697CsP.LJFF;
        } else {
            nameText = null;
        }
        if ((i & 64) != 0) {
            imageModel = c32697CsP.LJI;
        } else {
            imageModel = null;
        }
        if ((i & 128) != 0) {
            imageModel2 = c32697CsP.LJII;
        } else {
            imageModel2 = null;
        }
        if ((i & 256) != 0) {
            giftPanelBanner = c32697CsP.LJIIIIZZ;
        } else {
            giftPanelBanner = null;
        }
        if ((i & 512) != 0) {
            i2 = c32697CsP.LJIIIZ;
        } else {
            i2 = 0;
        }
        if ((i & 1024) != 0) {
            j3 = c32697CsP.LJIIJ;
        } else {
            j3 = 0;
        }
        if ((i & 2048) != 0) {
            z2 = c32697CsP.LJIIJJI;
        } else {
            z2 = false;
        }
        if ((i & 4096) != 0) {
            toastWhenUnavailable = c32697CsP.LJIIL;
        } else {
            toastWhenUnavailable = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z3 = c32697CsP.LJIILIIL;
        }
        o.LJIIIZ(displayTimeLeft, "displayTimeLeft");
        o.LJIIIZ(nameText, "nameText");
        o.LJIIIZ(toastWhenUnavailable, "toastWhenUnavailable");
        boolean z4 = z3;
        return new C32697CsP(j4, l3, j5, l4, displayTimeLeft, nameText, imageModel, imageModel2, giftPanelBanner, i2, j3, z2, toastWhenUnavailable, z4);
    }

    public C32697CsP(long j, Long l, long j2, Long l2, String str, String str2, ImageModel imageModel, ImageModel imageModel2, GiftPanelBanner giftPanelBanner, int i, long j3, boolean z, String str3, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = l;
        this.LIZJ = j2;
        this.LIZLLL = l2;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = imageModel;
        this.LJII = imageModel2;
        this.LJIIIIZZ = giftPanelBanner;
        this.LJIIIZ = i;
        this.LJIIJ = j3;
        this.LJIIJJI = z;
        this.LJIIL = str3;
        this.LJIILIIL = z2;
    }
}
