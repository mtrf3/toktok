package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08870Wl {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public String LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final boolean LJIILJJIL;
    public final long LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public final long LJIJI;
    public final int LJIJJ;
    public final String LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerLogBean(effectId=");
        sb.append(this.LIZ);
        sb.append(", resourceId=");
        sb.append(this.LIZIZ);
        sb.append(", stickerName=");
        sb.append(this.LIZJ);
        sb.append(", isVideoUsedSticker=");
        sb.append(this.LIZLLL);
        sb.append(", tabName=");
        sb.append(this.LJ);
        sb.append(", scene=");
        sb.append(this.LJFF);
        sb.append(", isInsert=");
        sb.append(this.LJI);
        sb.append(", isRecommend=");
        sb.append(this.LJII);
        sb.append(", enterFrom=");
        sb.append(this.LJIIIIZZ);
        sb.append(", groupStickerId=");
        sb.append(this.LJIIIZ);
        sb.append(", groupStickerName=");
        sb.append(this.LJIIJ);
        sb.append(", groupResourceId=");
        sb.append(this.LJIIJJI);
        sb.append(", is_sub_sticker_default=");
        sb.append(this.LJIIL);
        sb.append(", subImprPosition=");
        sb.append(this.LJIILIIL);
        sb.append(", isLiveTake=");
        sb.append(this.LJIILJJIL);
        sb.append(", startTime=");
        sb.append(this.LJIILL);
        sb.append(", isFromOtherUser=");
        sb.append(this.LJIILLIIL);
        sb.append(", imprPosition=");
        sb.append(this.LJIIZILJ);
        sb.append(", isAvatar=");
        sb.append(this.LJIJ);
        sb.append(", subType=");
        sb.append(this.LJIJI);
        sb.append(", source=");
        sb.append(this.LJIJJ);
        sb.append(", designerUid=");
        sb.append(this.LJIJJLI);
        sb.append(", fromShortCutPanel=");
        sb.append(this.LJIL);
        sb.append(", isRecPin=");
        return C08880Wm.LIZJ(sb, this.LJJ, ')');
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C08870Wl) && this.LIZ == ((C08870Wl) obj).LIZ) {
            return true;
        }
        return false;
    }

    public C08870Wl(long j, String resourceId, String str, boolean z, String str2, String str3, boolean z2, boolean z3, String enterFrom, String str4, String str5, String str6, String str7, String str8, boolean z4, long j2, boolean z5, String str9, boolean z6, long j3, int i, String str10, boolean z7, boolean z8) {
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = j;
        this.LIZIZ = resourceId;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = enterFrom;
        this.LJIIIZ = str4;
        this.LJIIJ = str5;
        this.LJIIJJI = str6;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = z4;
        this.LJIILL = j2;
        this.LJIILLIIL = z5;
        this.LJIIZILJ = str9;
        this.LJIJ = z6;
        this.LJIJI = j3;
        this.LJIJJ = i;
        this.LJIJJLI = str10;
        this.LJIL = z7;
        this.LJJ = z8;
    }

    public /* synthetic */ C08870Wl(long j, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, boolean z4, long j2, boolean z5, String str11, boolean z6, long j3, int i, String str12, boolean z7, boolean z8, int i2) {
        this(j, str, str2, z, str3, str4, z2, z3, str5, str6, str7, str8, str9, str10, (i2 & 16384) != 0 ? false : z4, (32768 & i2) != 0 ? C30725C4b.LIZ() : j2, (65536 & i2) != 0 ? false : z5, str11, z6, (524288 & i2) != 0 ? 0L : j3, i, str12, (i2 & 4194304) != 0 ? false : z7, z8);
    }
}
