package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KEK {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final KF5 LJFF;
    public final Integer LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final C35584Dxs LJIIZILJ;
    public final KBI LJIJ;
    public boolean LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final Aweme LJIL;
    public final String LJJ;
    public final boolean LJJI;
    public final Long LJJIFFI;
    public final Boolean LJJII;

    public KEK() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 134217727);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KEK)) {
            return false;
        }
        KEK kek = (KEK) obj;
        return o.LJ(this.LIZ, kek.LIZ) && o.LJ(this.LIZIZ, kek.LIZIZ) && o.LJ(this.LIZJ, kek.LIZJ) && o.LJ(this.LIZLLL, kek.LIZLLL) && o.LJ(this.LJ, kek.LJ) && this.LJFF == kek.LJFF && o.LJ(this.LJI, kek.LJI) && o.LJ(this.LJII, kek.LJII) && o.LJ(this.LJIIIIZZ, kek.LJIIIIZZ) && o.LJ(this.LJIIIZ, kek.LJIIIZ) && o.LJ(this.LJIIJ, kek.LJIIJ) && o.LJ(this.LJIIJJI, kek.LJIIJJI) && o.LJ(this.LJIIL, kek.LJIIL) && o.LJ(this.LJIILIIL, kek.LJIILIIL) && o.LJ(this.LJIILJJIL, kek.LJIILJJIL) && o.LJ(this.LJIILL, kek.LJIILL) && o.LJ(this.LJIILLIIL, kek.LJIILLIIL) && o.LJ(this.LJIIZILJ, kek.LJIIZILJ) && this.LJIJ == kek.LJIJ && this.LJIJI == kek.LJIJI && o.LJ(this.LJIJJ, kek.LJIJJ) && o.LJ(this.LJIJJLI, kek.LJIJJLI) && o.LJ(this.LJIL, kek.LJIL) && o.LJ(this.LJJ, kek.LJJ) && this.LJJI == kek.LJJI && o.LJ(this.LJJIFFI, kek.LJJIFFI) && o.LJ(this.LJJII, kek.LJJII);
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
        KF5 kf5 = this.LJFF;
        int hashCode6 = (hashCode5 + (kf5 == null ? 0 : kf5.hashCode())) * 31;
        Integer num = this.LJI;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.LJII;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIZ;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIJ;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIJJI;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJIIL;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIILIIL;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJIILJJIL;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LJIILL;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.LJIILLIIL;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        C35584Dxs c35584Dxs = this.LJIIZILJ;
        int hashCode18 = (this.LJIJ.hashCode() + ((hashCode17 + (c35584Dxs == null ? 0 : c35584Dxs.hashCode())) * 31)) * 31;
        boolean z = this.LJIJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode18 + i) * 31;
        String str16 = this.LJIJJ;
        int hashCode19 = (i2 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.LJIJJLI;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Aweme aweme = this.LJIL;
        int hashCode21 = (hashCode20 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str18 = this.LJJ;
        int hashCode22 = (((hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31) + (this.LJJI ? 1 : 0)) * 31;
        Long l = this.LJJIFFI;
        int hashCode23 = (hashCode22 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.LJJII;
        return hashCode23 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SearchEntranceModel(enterFrom=" + this.LIZ + ", searchEntrance=" + this.LIZIZ + ", feedVideoGroupId=" + this.LIZJ + ", trafficSourceList=" + this.LIZLLL + ", searchWord=" + this.LJ + ", searchWordStyle=" + this.LJFF + ", rootEnterFromType=" + this.LJI + ", logSearchEntrance=" + this.LJII + ", logResultSearchEntrance=" + this.LJIIIIZZ + ", logEnterFrom=" + this.LJIIIZ + ", logEnterMethod=" + this.LJIIJ + ", logWordSource=" + this.LJIIJJI + ", srcMaterialId=" + this.LJIIL + ", srcLiveRoomId=" + this.LJIILIIL + ", srcAuthorId=" + this.LJIILJJIL + ", previousPage=" + this.LJIILL + ", entranceInfo=" + this.LJIILLIIL + ", pdpUiStyle=" + this.LJIIZILJ + ", pdpStyle=" + this.LJIJ + ", blankEnhance=" + this.LJIJI + ", srcAnchorProductId=" + this.LJIJJ + ", productPanelType=" + this.LJIJJLI + ", aweme=" + this.LJIL + ", tabName=" + this.LJJ + ", splitMode=" + this.LJJI + ", sessionId=" + this.LJJIFFI + ", isSelfHarm=" + this.LJJII + ')';
    }

    public KEK(String str, String str2, String str3, String str4, String str5, KF5 kf5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C35584Dxs c35584Dxs, KBI kbi, String str16, String str17, Aweme aweme, String str18, boolean z, Long l, Boolean bool, int i) {
        String str19 = str10;
        String str20 = str9;
        String str21 = str8;
        String str22 = str7;
        String str23 = str6;
        String str24 = str3;
        String str25 = str11;
        String str26 = str2;
        String str27 = str12;
        String str28 = str4;
        String str29 = str5;
        KF5 kf52 = kf5;
        Integer num2 = num;
        Boolean bool2 = bool;
        Long l2 = l;
        String str30 = str18;
        Aweme aweme2 = aweme;
        String str31 = str17;
        String str32 = str14;
        boolean z2 = z;
        String str33 = str13;
        String str34 = str15;
        C35584Dxs c35584Dxs2 = c35584Dxs;
        KBI pdpStyle = kbi;
        String str35 = str16;
        String str36 = (i & 1) != 0 ? null : str;
        str26 = (i & 2) != 0 ? null : str26;
        str24 = (i & 4) != 0 ? null : str24;
        str28 = (i & 8) != 0 ? null : str28;
        str29 = (i & 16) != 0 ? null : str29;
        kf52 = (i & 32) != 0 ? null : kf52;
        num2 = (i & 64) != 0 ? null : num2;
        str23 = (i & 128) != 0 ? null : str23;
        str22 = (i & 256) != 0 ? null : str22;
        str21 = (i & 512) != 0 ? null : str21;
        str20 = (i & 1024) != 0 ? null : str20;
        str19 = (i & 2048) != 0 ? null : str19;
        str25 = (i & 4096) != 0 ? null : str25;
        str27 = (i & FileUtils.BUFFER_SIZE) != 0 ? null : str27;
        str33 = (i & 16384) != 0 ? null : str33;
        str32 = (32768 & i) != 0 ? null : str32;
        str34 = (65536 & i) != 0 ? null : str34;
        c35584Dxs2 = (131072 & i) != 0 ? null : c35584Dxs2;
        pdpStyle = (262144 & i) != 0 ? KBI.FULL : pdpStyle;
        str35 = (1048576 & i) != 0 ? null : str35;
        str31 = (2097152 & i) != 0 ? null : str31;
        aweme2 = (4194304 & i) != 0 ? null : aweme2;
        str30 = (8388608 & i) != 0 ? null : str30;
        z2 = (16777216 & i) != 0 ? false : z2;
        l2 = (33554432 & i) != 0 ? null : l2;
        bool2 = (i & 67108864) != 0 ? null : bool2;
        o.LJIIIZ(pdpStyle, "pdpStyle");
        this.LIZ = str36;
        this.LIZIZ = str26;
        this.LIZJ = str24;
        this.LIZLLL = str28;
        this.LJ = str29;
        this.LJFF = kf52;
        this.LJI = num2;
        this.LJII = str23;
        this.LJIIIIZZ = str22;
        this.LJIIIZ = str21;
        this.LJIIJ = str20;
        this.LJIIJJI = str19;
        this.LJIIL = str25;
        this.LJIILIIL = str27;
        this.LJIILJJIL = str33;
        this.LJIILL = str32;
        this.LJIILLIIL = str34;
        this.LJIIZILJ = c35584Dxs2;
        this.LJIJ = pdpStyle;
        this.LJIJI = false;
        this.LJIJJ = str35;
        this.LJIJJLI = str31;
        this.LJIL = aweme2;
        this.LJJ = str30;
        this.LJJI = z2;
        this.LJJIFFI = l2;
        this.LJJII = bool2;
    }
}
