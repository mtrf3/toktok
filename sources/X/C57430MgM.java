package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.MgM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57430MgM extends AbstractC238349Xa {
    public static final /* synthetic */ int LJJJJI = 0;
    public final String LIZIZ;
    public final User LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final Boolean LJIJJLI;
    public final int LJIL;
    public final boolean LJJ;
    public final int LJJI;
    public final Boolean LJJIFFI;
    public final String LJJII;
    public final String LJJIII;
    public final String LJJIIJ;
    public final String LJJIIJZLJL;
    public final String LJJIIZ;
    public final String LJJIIZI;
    public final String LJJIJ;
    public final Integer LJJIJIIJI;
    public final String LJJIJIIJIL;
    public final Integer LJJIJIL;
    public final String LJJIJL;
    public final int LJJIJLIJ;
    public final String LJJIL;
    public final Boolean LJJIZ;
    public final java.util.Map<String, String> LJJJ;
    public final String LJJJI;
    public final String LJJJIL;
    public final java.util.Map<String, String> LJJJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57430MgM)) {
            return false;
        }
        C57430MgM c57430MgM = (C57430MgM) obj;
        return o.LJ(this.LIZIZ, c57430MgM.LIZIZ) && o.LJ(this.LIZJ, c57430MgM.LIZJ) && o.LJ(this.LIZLLL, c57430MgM.LIZLLL) && o.LJ(this.LJ, c57430MgM.LJ) && o.LJ(this.LJFF, c57430MgM.LJFF) && o.LJ(this.LJI, c57430MgM.LJI) && o.LJ(this.LJII, c57430MgM.LJII) && o.LJ(this.LJIIIIZZ, c57430MgM.LJIIIIZZ) && o.LJ(this.LJIIIZ, c57430MgM.LJIIIZ) && o.LJ(this.LJIIJ, c57430MgM.LJIIJ) && o.LJ(this.LJIIJJI, c57430MgM.LJIIJJI) && o.LJ(this.LJIIL, c57430MgM.LJIIL) && o.LJ(this.LJIILIIL, c57430MgM.LJIILIIL) && o.LJ(this.LJIILJJIL, c57430MgM.LJIILJJIL) && o.LJ(this.LJIILL, c57430MgM.LJIILL) && o.LJ(this.LJIILLIIL, c57430MgM.LJIILLIIL) && o.LJ(this.LJIIZILJ, c57430MgM.LJIIZILJ) && o.LJ(this.LJIJ, c57430MgM.LJIJ) && this.LJIJI == c57430MgM.LJIJI && this.LJIJJ == c57430MgM.LJIJJ && o.LJ(this.LJIJJLI, c57430MgM.LJIJJLI) && this.LJIL == c57430MgM.LJIL && this.LJJ == c57430MgM.LJJ && this.LJJI == c57430MgM.LJJI && o.LJ(this.LJJIFFI, c57430MgM.LJJIFFI) && o.LJ(this.LJJII, c57430MgM.LJJII) && o.LJ(this.LJJIII, c57430MgM.LJJIII) && o.LJ(this.LJJIIJ, c57430MgM.LJJIIJ) && o.LJ(this.LJJIIJZLJL, c57430MgM.LJJIIJZLJL) && o.LJ(this.LJJIIZ, c57430MgM.LJJIIZ) && o.LJ(this.LJJIIZI, c57430MgM.LJJIIZI) && o.LJ(this.LJJIJ, c57430MgM.LJJIJ) && o.LJ(this.LJJIJIIJI, c57430MgM.LJJIJIIJI) && o.LJ(this.LJJIJIIJIL, c57430MgM.LJJIJIIJIL) && o.LJ(this.LJJIJIL, c57430MgM.LJJIJIL) && o.LJ(this.LJJIJL, c57430MgM.LJJIJL) && this.LJJIJLIJ == c57430MgM.LJJIJLIJ && o.LJ(this.LJJIL, c57430MgM.LJJIL) && o.LJ(this.LJJIZ, c57430MgM.LJJIZ) && o.LJ(this.LJJJ, c57430MgM.LJJJ) && o.LJ(this.LJJJI, c57430MgM.LJJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZIZ.hashCode() * 31;
        User user = this.LIZJ;
        int hashCode2 = (hashCode + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LJII;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.LJIIIIZZ;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIIZ;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIJ;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIJJI;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIL;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIILIIL;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJIILJJIL;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIILL;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJIILLIIL;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LJIIZILJ;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.LJIJ;
        int hashCode18 = (((((hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.LJIJI) * 31) + this.LJIJJ) * 31;
        Boolean bool = this.LJIJJLI;
        int hashCode19 = (((hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LJIL) * 31;
        boolean z = this.LJJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode19 + i) * 31) + this.LJJI) * 31;
        Boolean bool2 = this.LJJIFFI;
        int hashCode20 = (i2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str16 = this.LJJII;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.LJJIII;
        int hashCode22 = (hashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.LJJIIJ;
        int hashCode23 = (hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.LJJIIJZLJL;
        int hashCode24 = (hashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.LJJIIZ;
        int hashCode25 = (hashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.LJJIIZI;
        int hashCode26 = (hashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.LJJIJ;
        int hashCode27 = (hashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Integer num2 = this.LJJIJIIJI;
        int hashCode28 = (hashCode27 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str23 = this.LJJIJIIJIL;
        int hashCode29 = (hashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Integer num3 = this.LJJIJIL;
        int hashCode30 = (hashCode29 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str24 = this.LJJIJL;
        int hashCode31 = (((hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31) + this.LJJIJLIJ) * 31;
        String str25 = this.LJJIL;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Boolean bool3 = this.LJJIZ;
        int hashCode33 = (hashCode32 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        java.util.Map<String, String> map = this.LJJJ;
        int hashCode34 = (hashCode33 + (map == null ? 0 : map.hashCode())) * 31;
        String str26 = this.LJJJI;
        return hashCode34 + (str26 != null ? str26.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowActionTracker(enterFrom=");
        sb.append(this.LIZIZ);
        sb.append(", user=");
        sb.append(this.LIZJ);
        sb.append(", enterMethod=");
        sb.append(this.LIZLLL);
        sb.append(", chatEnterMethodForMob=");
        sb.append(this.LJ);
        sb.append(", previousPage=");
        sb.append(this.LJFF);
        sb.append(", homepageUid=");
        sb.append(this.LJI);
        sb.append(", imprOrder=");
        sb.append(this.LJII);
        sb.append(", previousPagePosition=");
        sb.append(this.LJIIIIZZ);
        sb.append(", sceneID=");
        sb.append(this.LJIIIZ);
        sb.append(", subPage=");
        sb.append(this.LJIIJ);
        sb.append(", sceneType=");
        sb.append(this.LJIIJJI);
        sb.append(", tabName=");
        sb.append(this.LJIIL);
        sb.append(", accountType=");
        sb.append(this.LJIILIIL);
        sb.append(", position=");
        sb.append(this.LJIILJJIL);
        sb.append(", section=");
        sb.append(this.LJIILL);
        sb.append(", groupID=");
        sb.append(this.LJIILLIIL);
        sb.append(", storyType=");
        sb.append(this.LJIIZILJ);
        sb.append(", storyCollectionID=");
        sb.append(this.LJIJ);
        sb.append(", isShareToStoryType=");
        sb.append(this.LJIJI);
        sb.append(", isStoryToNormal=");
        sb.append(this.LJIJJ);
        sb.append(", isBigCard=");
        sb.append(this.LJIJJLI);
        sb.append(", from=");
        sb.append(this.LJIL);
        sb.append(", videoCoverLoadComplete=");
        sb.append(this.LJJ);
        sb.append(", fromForRequest=");
        sb.append(this.LJJI);
        sb.append(", isProfileVideoFollow=");
        sb.append(this.LJJIFFI);
        sb.append(", imprID=");
        sb.append(this.LJJII);
        sb.append(", isSearchScene=");
        sb.append(this.LJJIII);
        sb.append(", searchID=");
        sb.append(this.LJJIIJ);
        sb.append(", searchResultID=");
        sb.append(this.LJJIIJZLJL);
        sb.append(", searchKeyword=");
        sb.append(this.LJJIIZ);
        sb.append(", searchTypeStr=");
        sb.append(this.LJJIIZI);
        sb.append(", relationTag=");
        sb.append(this.LJJIJ);
        sb.append(", awemeType=");
        sb.append(this.LJJIJIIJI);
        sb.append(", fromPage=");
        sb.append(this.LJJIJIIJIL);
        sb.append(", hasTitle=");
        sb.append(this.LJJIJIL);
        sb.append(", buttonType=");
        sb.append(this.LJJIJL);
        sb.append(", activeStatus=");
        sb.append(this.LJJIJLIJ);
        sb.append(", isNewMusic=");
        sb.append(this.LJJIL);
        sb.append(", hasMLBBBadge=");
        sb.append(this.LJJIZ);
        sb.append(", extra=");
        sb.append(this.LJJJ);
        sb.append(", sourcePage=");
        return C07670Rv.LIZIZ(sb, this.LJJJI, ')');
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJJJIL;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJJJJ;
    }

    public /* synthetic */ C57430MgM(String str, User user, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, int i2, Boolean bool, int i3, boolean z, Boolean bool2, String str16, String str17, String str18, String str19, String str20, String str21, Integer num2, String str22, Integer num3, String str23, int i4, String str24, Boolean bool3, java.util.Map map, String str25, int i5, int i6) {
        this(str, (i5 & 2) != 0 ? null : user, (i5 & 4) != 0 ? "follow_button" : str2, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? null : str4, (i5 & 32) != 0 ? null : str5, (i5 & 64) != 0 ? null : num, (i5 & 128) != 0 ? null : str6, (i5 & 256) != 0 ? null : str7, (i5 & 512) != 0 ? null : str8, (i5 & 1024) != 0 ? null : str9, (i5 & 2048) != 0 ? null : str10, (i5 & 4096) != 0 ? null : str11, (i5 & FileUtils.BUFFER_SIZE) != 0 ? null : str12, null, (32768 & i5) != 0 ? null : str13, (65536 & i5) != 0 ? null : str14, (131072 & i5) != 0 ? null : str15, (262144 & i5) != 0 ? 0 : i, (524288 & i5) != 0 ? 0 : i2, (1048576 & i5) != 0 ? Boolean.FALSE : bool, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? false : z, 0, (16777216 & i5) != 0 ? Boolean.FALSE : bool2, (33554432 & i5) != 0 ? null : str16, (67108864 & i5) != 0 ? null : str17, (134217728 & i5) != 0 ? null : str18, (268435456 & i5) != 0 ? null : str19, null, (1073741824 & i5) != 0 ? null : str20, (i5 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str21, (i6 & 1) != 0 ? null : num2, (i6 & 2) != 0 ? null : str22, (i6 & 4) != 0 ? null : num3, (i6 & 8) != 0 ? null : str23, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? null : str24, (i6 & 64) != 0 ? Boolean.FALSE : bool3, (i6 & 128) != 0 ? null : map, (i6 & 256) != 0 ? null : str25);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0308, code lost:
    
        if (r37 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57430MgM(java.lang.String r36, com.ss.android.ugc.aweme.profile.model.User r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.Integer r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, int r54, int r55, java.lang.Boolean r56, int r57, boolean r58, int r59, java.lang.Boolean r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.Integer r68, java.lang.String r69, java.lang.Integer r70, java.lang.String r71, int r72, java.lang.String r73, java.lang.Boolean r74, java.util.Map<java.lang.String, java.lang.String> r75, java.lang.String r76) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57430MgM.<init>(java.lang.String, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.Boolean, int, boolean, int, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.Boolean, java.util.Map, java.lang.String):void");
    }
}
