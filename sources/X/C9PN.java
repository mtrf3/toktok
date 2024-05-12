package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.9PN, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9PN implements InterfaceC198557ql {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Aweme LJI;
    public final String LJII;
    public final C43I<C76800UCe> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C43I<Boolean> LJIIJ;
    public final C43I<C76800UCe> LJIIJJI;
    public final C43I<C76800UCe> LJIIL;
    public final C43I<C76800UCe> LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final C43I<OSJ<Integer, Integer, Intent>> LJIIZILJ;
    public final int[] LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public final Integer LJJI;
    public final String LJJIFFI;
    public final Aweme LJJII;
    public final C43I<Boolean> LJJIII;

    public C9PN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9PN)) {
            return false;
        }
        C9PN c9pn = (C9PN) obj;
        return o.LJ(this.LIZ, c9pn.LIZ) && o.LJ(this.LIZIZ, c9pn.LIZIZ) && o.LJ(this.LIZJ, c9pn.LIZJ) && o.LJ(this.LIZLLL, c9pn.LIZLLL) && o.LJ(this.LJ, c9pn.LJ) && o.LJ(this.LJFF, c9pn.LJFF) && o.LJ(this.LJI, c9pn.LJI) && o.LJ(this.LJII, c9pn.LJII) && o.LJ(this.LJIIIIZZ, c9pn.LJIIIIZZ) && this.LJIIIZ == c9pn.LJIIIZ && o.LJ(this.LJIIJ, c9pn.LJIIJ) && o.LJ(this.LJIIJJI, c9pn.LJIIJJI) && o.LJ(this.LJIIL, c9pn.LJIIL) && o.LJ(this.LJIILIIL, c9pn.LJIILIIL) && o.LJ(this.LJIILJJIL, c9pn.LJIILJJIL) && o.LJ(this.LJIILL, c9pn.LJIILL) && o.LJ(this.LJIILLIIL, c9pn.LJIILLIIL) && o.LJ(this.LJIIZILJ, c9pn.LJIIZILJ) && o.LJ(this.LJIJ, c9pn.LJIJ) && o.LJ(this.LJIJI, c9pn.LJIJI) && o.LJ(this.LJIJJ, c9pn.LJIJJ) && o.LJ(this.LJIJJLI, c9pn.LJIJJLI) && o.LJ(this.LJIL, c9pn.LJIL) && o.LJ(this.LJJ, c9pn.LJJ) && o.LJ(this.LJJI, c9pn.LJJI) && o.LJ(this.LJJIFFI, c9pn.LJJIFFI) && o.LJ(this.LJJII, c9pn.LJJII) && o.LJ(this.LJJIII, c9pn.LJJIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJFF;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Aweme aweme = this.LJI;
        int hashCode7 = (hashCode6 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str7 = this.LJII;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        C43I<C76800UCe> c43i = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        boolean z = this.LJIIIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode9 + i) * 31;
        C43I<Boolean> c43i2 = this.LJIIJ;
        int hashCode10 = (i2 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C76800UCe> c43i3 = this.LJIIJJI;
        int hashCode11 = (hashCode10 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<C76800UCe> c43i4 = this.LJIIL;
        int hashCode12 = (hashCode11 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<C76800UCe> c43i5 = this.LJIILIIL;
        int hashCode13 = (hashCode12 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        String str8 = this.LJIILJJIL;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIILL;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIILLIIL;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        C43I<OSJ<Integer, Integer, Intent>> c43i6 = this.LJIIZILJ;
        int hashCode17 = (hashCode16 + (c43i6 == null ? 0 : c43i6.hashCode())) * 31;
        int[] iArr = this.LJIJ;
        int hashCode18 = (hashCode17 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        String str11 = this.LJIJI;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIJJ;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJIJJLI;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LJIL;
        int hashCode22 = (hashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.LJJ;
        int hashCode23 = (hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num = this.LJJI;
        int hashCode24 = (hashCode23 + (num == null ? 0 : num.hashCode())) * 31;
        String str16 = this.LJJIFFI;
        int hashCode25 = (hashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Aweme aweme2 = this.LJJII;
        int hashCode26 = (hashCode25 + (aweme2 == null ? 0 : aweme2.hashCode())) * 31;
        C43I<Boolean> c43i7 = this.LJJIII;
        return hashCode26 + (c43i7 != null ? c43i7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileData(uid=");
        sb.append(this.LIZ);
        sb.append(", secUid=");
        sb.append(this.LIZIZ);
        sb.append(", previousPage=");
        sb.append(this.LIZJ);
        sb.append(", eventType=");
        sb.append(this.LIZLLL);
        sb.append(", showWindowSource=");
        sb.append(this.LJ);
        sb.append(", previousPagePosition=");
        sb.append(this.LJFF);
        sb.append(", aweme=");
        sb.append(this.LJI);
        sb.append(", feedsAwemeId=");
        sb.append(this.LJII);
        sb.append(", clearDataEvent=");
        sb.append(this.LJIIIIZZ);
        sb.append(", isVisible=");
        sb.append(this.LJIIIZ);
        sb.append(", visibleChangeEvent=");
        sb.append(this.LJIIJ);
        sb.append(", clearDataForBlock=");
        sb.append(this.LJIIJJI);
        sb.append(", setUserEvent=");
        sb.append(this.LJIIL);
        sb.append(", setLazy=");
        sb.append(this.LJIILIIL);
        sb.append(", roomId=");
        sb.append(this.LJIILJJIL);
        sb.append(", sourceContentId=");
        sb.append(this.LJIILL);
        sb.append(", fromRequestId=");
        sb.append(this.LJIILLIIL);
        sb.append(", onActivityResultEvent=");
        sb.append(this.LJIIZILJ);
        sb.append(", trafficSourceList=");
        C0JT.LIZLLL(this.LJIJ, sb, ", sourcePage=");
        sb.append(this.LJIJI);
        sb.append(", profileEnterMethod=");
        sb.append(this.LJIJJ);
        sb.append(", nowCardType=");
        sb.append(this.LJIJJLI);
        sb.append(", isNowClear=");
        sb.append(this.LJIL);
        sb.append(", nowType=");
        sb.append(this.LJJ);
        sb.append(", nowHasSmallWindow=");
        sb.append(this.LJJI);
        sb.append(", trackParams=");
        sb.append(this.LJJIFFI);
        sb.append(", relatedAweme=");
        sb.append(this.LJJII);
        sb.append(", userLoaded=");
        sb.append(this.LJJIII);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C9PN(int i) {
        this(null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9PN(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, C43I<C76800UCe> c43i, boolean z, C43I<Boolean> c43i2, C43I<C76800UCe> c43i3, C43I<C76800UCe> c43i4, C43I<C76800UCe> c43i5, String str8, String str9, String str10, C43I<? extends OSJ<Integer, Integer, ? extends Intent>> c43i6, int[] iArr, String str11, String str12, String str13, String str14, String str15, Integer num, String str16, Aweme aweme2, C43I<Boolean> c43i7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = aweme;
        this.LJII = str7;
        this.LJIIIIZZ = c43i;
        this.LJIIIZ = z;
        this.LJIIJ = c43i2;
        this.LJIIJJI = c43i3;
        this.LJIIL = c43i4;
        this.LJIILIIL = c43i5;
        this.LJIILJJIL = str8;
        this.LJIILL = str9;
        this.LJIILLIIL = str10;
        this.LJIIZILJ = c43i6;
        this.LJIJ = iArr;
        this.LJIJI = str11;
        this.LJIJJ = str12;
        this.LJIJJLI = str13;
        this.LJIL = str14;
        this.LJJ = str15;
        this.LJJI = num;
        this.LJJIFFI = str16;
        this.LJJII = aweme2;
        this.LJJIII = c43i7;
    }

    public static C9PN LIZ(C9PN c9pn, String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, C43I c43i, boolean z, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, String str8, String str9, String str10, C43I c43i6, int[] iArr, String str11, String str12, String str13, String str14, String str15, Integer num, String str16, C43I c43i7, int i) {
        Aweme aweme2;
        C43I c43i8 = c43i7;
        String str17 = str16;
        Integer num2 = num;
        String str18 = str15;
        String str19 = str14;
        C43I c43i9 = c43i6;
        String str20 = str10;
        String str21 = str6;
        String str22 = str11;
        String str23 = str5;
        C43I c43i10 = c43i5;
        String str24 = str4;
        String str25 = str3;
        int[] iArr2 = iArr;
        String str26 = str;
        String str27 = str2;
        Aweme aweme3 = aweme;
        String str28 = str7;
        String str29 = str8;
        String str30 = str12;
        C43I c43i11 = c43i;
        boolean z2 = z;
        C43I c43i12 = c43i2;
        C43I c43i13 = c43i3;
        String str31 = str9;
        String str32 = str13;
        C43I c43i14 = c43i4;
        if ((i & 1) != 0) {
            str26 = c9pn.LIZ;
        }
        if ((i & 2) != 0) {
            str27 = c9pn.LIZIZ;
        }
        if ((i & 4) != 0) {
            str25 = c9pn.LIZJ;
        }
        if ((i & 8) != 0) {
            str24 = c9pn.LIZLLL;
        }
        if ((i & 16) != 0) {
            str23 = c9pn.LJ;
        }
        if ((i & 32) != 0) {
            str21 = c9pn.LJFF;
        }
        if ((i & 64) != 0) {
            aweme3 = c9pn.LJI;
        }
        if ((i & 128) != 0) {
            str28 = c9pn.LJII;
        }
        if ((i & 256) != 0) {
            c43i11 = c9pn.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z2 = c9pn.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c43i12 = c9pn.LJIIJ;
        }
        if ((i & 2048) != 0) {
            c43i13 = c9pn.LJIIJJI;
        }
        if ((i & 4096) != 0) {
            c43i14 = c9pn.LJIIL;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c43i10 = c9pn.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            str29 = c9pn.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            str31 = c9pn.LJIILL;
        }
        if ((65536 & i) != 0) {
            str20 = c9pn.LJIILLIIL;
        }
        if ((131072 & i) != 0) {
            c43i9 = c9pn.LJIIZILJ;
        }
        if ((262144 & i) != 0) {
            iArr2 = c9pn.LJIJ;
        }
        if ((524288 & i) != 0) {
            str22 = c9pn.LJIJI;
        }
        if ((1048576 & i) != 0) {
            str30 = c9pn.LJIJJ;
        }
        if ((2097152 & i) != 0) {
            str32 = c9pn.LJIJJLI;
        }
        if ((4194304 & i) != 0) {
            str19 = c9pn.LJIL;
        }
        if ((8388608 & i) != 0) {
            str18 = c9pn.LJJ;
        }
        if ((16777216 & i) != 0) {
            num2 = c9pn.LJJI;
        }
        if ((33554432 & i) != 0) {
            str17 = c9pn.LJJIFFI;
        }
        if ((67108864 & i) != 0) {
            aweme2 = c9pn.LJJII;
        } else {
            aweme2 = null;
        }
        if ((i & 134217728) != 0) {
            c43i8 = c9pn.LJJIII;
        }
        c9pn.getClass();
        C43I c43i15 = c43i8;
        return new C9PN(str26, str27, str25, str24, str23, str21, aweme3, str28, c43i11, z2, c43i12, c43i13, c43i14, c43i10, str29, str31, str20, c43i9, iArr2, str22, str30, str32, str19, str18, num2, str17, aweme2, c43i15);
    }
}
