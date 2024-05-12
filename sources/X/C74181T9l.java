package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.T9l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74181T9l {
    public final String LIZ;
    public final String LIZIZ;
    public final Music LIZJ;
    public final LibraryMaterialInfoSv LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final Integer LJIILLIIL;
    public final InterfaceC74183T9n LJIIZILJ;
    public final InterfaceC74184T9o LJIJ;
    public final String LJIJI;
    public final boolean LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final String LJJ;

    public C74181T9l() {
        this(null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, 16777215);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74181T9l)) {
            return false;
        }
        C74181T9l c74181T9l = (C74181T9l) obj;
        return o.LJ(this.LIZ, c74181T9l.LIZ) && o.LJ(this.LIZIZ, c74181T9l.LIZIZ) && o.LJ(this.LIZJ, c74181T9l.LIZJ) && o.LJ(this.LIZLLL, c74181T9l.LIZLLL) && this.LJ == c74181T9l.LJ && o.LJ(this.LJFF, c74181T9l.LJFF) && o.LJ(this.LJI, c74181T9l.LJI) && o.LJ(this.LJII, c74181T9l.LJII) && o.LJ(this.LJIIIIZZ, c74181T9l.LJIIIIZZ) && o.LJ(this.LJIIIZ, c74181T9l.LJIIIZ) && this.LJIIJ == c74181T9l.LJIIJ && o.LJ(this.LJIIJJI, c74181T9l.LJIIJJI) && o.LJ(this.LJIIL, c74181T9l.LJIIL) && o.LJ(this.LJIILIIL, c74181T9l.LJIILIIL) && this.LJIILJJIL == c74181T9l.LJIILJJIL && o.LJ(this.LJIILL, c74181T9l.LJIILL) && o.LJ(this.LJIILLIIL, c74181T9l.LJIILLIIL) && o.LJ(this.LJIIZILJ, c74181T9l.LJIIZILJ) && o.LJ(this.LJIJ, c74181T9l.LJIJ) && o.LJ(this.LJIJI, c74181T9l.LJIJI) && this.LJIJJ == c74181T9l.LJIJJ && o.LJ(this.LJIJJLI, c74181T9l.LJIJJLI) && o.LJ(this.LJIL, c74181T9l.LJIL) && o.LJ(this.LJJ, c74181T9l.LJJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Music music = this.LIZJ;
        if (music == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = music.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        LibraryMaterialInfoSv libraryMaterialInfoSv = this.LIZLLL;
        if (libraryMaterialInfoSv == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = libraryMaterialInfoSv.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        boolean z = this.LJ;
        int i6 = 1;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i5 + i7) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        String str4 = this.LJI;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        String str5 = this.LJII;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        String str6 = this.LJIIIIZZ;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        String str7 = this.LJIIIZ;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i13 = (i12 + hashCode9) * 31;
        boolean z2 = this.LJIIJ;
        int i14 = z2;
        if (z2 != 0) {
            i14 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJIILIIL, C79062V1e.LJ(this.LJIIL, C79062V1e.LJ(this.LJIIJJI, (i13 + i14) * 31, 31), 31), 31);
        boolean z3 = this.LJIILJJIL;
        int i15 = z3;
        if (z3 != 0) {
            i15 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJIILL, (LJ + i15) * 31, 31);
        Integer num = this.LJIILLIIL;
        if (num == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num.hashCode();
        }
        int i16 = (LJ2 + hashCode10) * 31;
        InterfaceC74183T9n interfaceC74183T9n = this.LJIIZILJ;
        if (interfaceC74183T9n == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = interfaceC74183T9n.hashCode();
        }
        int i17 = (i16 + hashCode11) * 31;
        InterfaceC74184T9o interfaceC74184T9o = this.LJIJ;
        if (interfaceC74184T9o == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = interfaceC74184T9o.hashCode();
        }
        int i18 = (i17 + hashCode12) * 31;
        String str8 = this.LJIJI;
        if (str8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str8.hashCode();
        }
        int i19 = (i18 + hashCode13) * 31;
        if (!this.LJIJJ) {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        String str9 = this.LJIJJLI;
        if (str9 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str9.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        String str10 = this.LJIL;
        if (str10 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str10.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        String str11 = this.LJJ;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i22 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PropReuseConfig(creationId=");
        sb.append(this.LIZ);
        sb.append(", shootWay=");
        sb.append(this.LIZIZ);
        sb.append(", music=");
        sb.append(this.LIZJ);
        sb.append(", libraryMaterialInfo=");
        sb.append(this.LIZLLL);
        sb.append(", isThroughAnchor=");
        sb.append(this.LJ);
        sb.append(", musicOrigin=");
        sb.append(this.LJFF);
        sb.append(", groupId=");
        sb.append(this.LJI);
        sb.append(", enterFrom=");
        sb.append(this.LJII);
        sb.append(", enterMethod=");
        sb.append(this.LJIIIIZZ);
        sb.append(", buttonMethod=");
        sb.append(this.LJIIIZ);
        sb.append(", isAutoTryNext=");
        sb.append(this.LJIIJ);
        sb.append(", from=");
        sb.append(this.LJIIJJI);
        sb.append(", stickerFrom=");
        sb.append(this.LJIIL);
        sb.append(", gradeKey=");
        sb.append(this.LJIILIIL);
        sb.append(", isNeedShowLoading=");
        sb.append(this.LJIILJJIL);
        sb.append(", giphyIds=");
        sb.append(this.LJIILL);
        sb.append(", videoLength=");
        sb.append(this.LJIILLIIL);
        sb.append(", reuseStickerDAInterceptor=");
        sb.append(this.LJIIZILJ);
        sb.append(", reuseStickerDownloadFinishListener=");
        sb.append(this.LJIJ);
        sb.append(", fromUserId=");
        sb.append(this.LJIJI);
        sb.append(", enterRecordFromFeed=");
        sb.append(this.LJIJJ);
        sb.append(", previousPage=");
        sb.append(this.LJIJJLI);
        sb.append(", shootEnterFrom=");
        sb.append(this.LJIL);
        sb.append(", editEffectUID=");
        return C07670Rv.LIZIZ(sb, this.LJJ, ')');
    }

    public C74181T9l(String str, String str2, Music music, LibraryMaterialInfoSv libraryMaterialInfoSv, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, String str11, Integer num, InterfaceC74183T9n interfaceC74183T9n, InterfaceC74184T9o interfaceC74184T9o, String str12, boolean z3, String str13, String str14, String str15, int i) {
        String str16 = str2;
        Music music2 = music;
        LibraryMaterialInfoSv libraryMaterialInfoSv2 = libraryMaterialInfoSv;
        boolean z4 = z;
        String str17 = str3;
        String str18 = str9;
        String str19 = str8;
        String str20 = str13;
        String str21 = str7;
        String str22 = str15;
        Integer num2 = num;
        String str23 = str4;
        String str24 = str5;
        String str25 = str10;
        InterfaceC74183T9n interfaceC74183T9n2 = interfaceC74183T9n;
        boolean z5 = z2;
        InterfaceC74184T9o interfaceC74184T9o2 = interfaceC74184T9o;
        String str26 = str12;
        boolean z6 = z3;
        String str27 = str6;
        String str28 = str14;
        String str29 = (i & 1) != 0 ? null : str;
        str16 = (i & 2) != 0 ? null : str16;
        music2 = (i & 4) != 0 ? null : music2;
        libraryMaterialInfoSv2 = (i & 8) != 0 ? null : libraryMaterialInfoSv2;
        z4 = (i & 16) != 0 ? false : z4;
        str17 = (i & 32) != 0 ? null : str17;
        str23 = (i & 64) != 0 ? null : str23;
        str24 = (i & 128) != 0 ? null : str24;
        str27 = (i & 256) != 0 ? null : str27;
        str21 = (i & 512) != 0 ? null : str21;
        str19 = (i & 2048) != 0 ? "" : str19;
        str18 = (i & 4096) != 0 ? "" : str18;
        str25 = (i & FileUtils.BUFFER_SIZE) != 0 ? "" : str25;
        z5 = (i & 16384) != 0 ? true : z5;
        String str30 = (32768 & i) == 0 ? str11 : "";
        num2 = (65536 & i) != 0 ? null : num2;
        interfaceC74183T9n2 = (131072 & i) != 0 ? null : interfaceC74183T9n2;
        interfaceC74184T9o2 = (262144 & i) != 0 ? null : interfaceC74184T9o2;
        str26 = (524288 & i) != 0 ? null : str26;
        z6 = (1048576 & i) != 0 ? false : z6;
        str20 = (2097152 & i) != 0 ? null : str20;
        str28 = (4194304 & i) != 0 ? null : str28;
        str22 = (i & 8388608) != 0 ? null : str22;
        String str31 = str18;
        String str32 = str25;
        String str33 = str19;
        C43588H8u.LIZLLL(str33, "from", str31, "stickerFrom", str32, "gradeKey", str30, "giphyIds");
        this.LIZ = str29;
        this.LIZIZ = str16;
        this.LIZJ = music2;
        this.LIZLLL = libraryMaterialInfoSv2;
        this.LJ = z4;
        this.LJFF = str17;
        this.LJI = str23;
        this.LJII = str24;
        this.LJIIIIZZ = str27;
        this.LJIIIZ = str21;
        this.LJIIJ = false;
        this.LJIIJJI = str33;
        this.LJIIL = str31;
        this.LJIILIIL = str32;
        this.LJIILJJIL = z5;
        this.LJIILL = str30;
        this.LJIILLIIL = num2;
        this.LJIIZILJ = interfaceC74183T9n2;
        this.LJIJ = interfaceC74184T9o2;
        this.LJIJI = str26;
        this.LJIJJ = z6;
        this.LJIJJLI = str20;
        this.LJIL = str28;
        this.LJJ = str22;
    }
}
