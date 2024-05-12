package X;

import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.9PM, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9PM implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<OSJ<Integer, Integer, Intent>> LJLJI;
    public final C43I<C76800UCe> LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final C43I<Boolean> LJLJL;
    public final C43I<OSZ<Exception, Integer>> LJLJLJ;
    public final Aweme LJLJLLL;
    public final EnumC235129Kq LJLL;
    public final C43I<ProfileUser> LJLLI;
    public final C43I<Throwable> LJLLILLLL;
    public final C43I<C76800UCe> LJLLJ;
    public final String LJLLL;
    public final C43I<C76800UCe> LJLLLL;
    public final boolean LJLLLLLL;
    public final String LJLZ;
    public final String LJZ;
    public final String LJZI;
    public final String LJZL;
    public final String LL;
    public final String LLD;
    public final String LLF;
    public final C43I<C76800UCe> LLFF;
    public final C43I<Boolean> LLFFF;
    public final C43I<C76800UCe> LLFII;
    public final C43I<C76800UCe> LLFZ;
    public final String LLI;
    public final String LLIFFJFJJ;
    public final int[] LLII;
    public final String LLIIII;
    public final String LLIIIILZ;
    public final String LLIIIJ;
    public final String LLIIIL;
    public final String LLIIIZ;
    public final Integer LLIIJI;
    public final String LLIIJLIL;
    public final C43I<OSZ<ProfileUser, User>> LLIIL;
    public final C43I<Boolean> LLIILII;
    public final String LLIILZL;
    public final String LLIIZ;

    public C9PM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9PM)) {
            return false;
        }
        C9PM c9pm = (C9PM) obj;
        return o.LJ(this.LJLIL, c9pm.LJLIL) && o.LJ(this.LJLILLLLZI, c9pm.LJLILLLLZI) && o.LJ(this.LJLJI, c9pm.LJLJI) && o.LJ(this.LJLJJI, c9pm.LJLJJI) && this.LJLJJL == c9pm.LJLJJL && this.LJLJJLL == c9pm.LJLJJLL && o.LJ(this.LJLJL, c9pm.LJLJL) && o.LJ(this.LJLJLJ, c9pm.LJLJLJ) && o.LJ(this.LJLJLLL, c9pm.LJLJLLL) && this.LJLL == c9pm.LJLL && o.LJ(this.LJLLI, c9pm.LJLLI) && o.LJ(this.LJLLILLLL, c9pm.LJLLILLLL) && o.LJ(this.LJLLJ, c9pm.LJLLJ) && o.LJ(this.LJLLL, c9pm.LJLLL) && o.LJ(this.LJLLLL, c9pm.LJLLLL) && this.LJLLLLLL == c9pm.LJLLLLLL && o.LJ(this.LJLZ, c9pm.LJLZ) && o.LJ(this.LJZ, c9pm.LJZ) && o.LJ(this.LJZI, c9pm.LJZI) && o.LJ(this.LJZL, c9pm.LJZL) && o.LJ(this.LL, c9pm.LL) && o.LJ(this.LLD, c9pm.LLD) && o.LJ(this.LLF, c9pm.LLF) && o.LJ(this.LLFF, c9pm.LLFF) && o.LJ(this.LLFFF, c9pm.LLFFF) && o.LJ(this.LLFII, c9pm.LLFII) && o.LJ(this.LLFZ, c9pm.LLFZ) && o.LJ(this.LLI, c9pm.LLI) && o.LJ(this.LLIFFJFJJ, c9pm.LLIFFJFJJ) && o.LJ(this.LLII, c9pm.LLII) && o.LJ(this.LLIIII, c9pm.LLIIII) && o.LJ(this.LLIIIILZ, c9pm.LLIIIILZ) && o.LJ(this.LLIIIJ, c9pm.LLIIIJ) && o.LJ(this.LLIIIL, c9pm.LLIIIL) && o.LJ(this.LLIIIZ, c9pm.LLIIIZ) && o.LJ(this.LLIIJI, c9pm.LLIIJI) && o.LJ(this.LLIIJLIL, c9pm.LLIIJLIL) && o.LJ(this.LLIIL, c9pm.LLIIL) && o.LJ(this.LLIILII, c9pm.LLIILII) && o.LJ(this.LLIILZL, c9pm.LLIILZL) && o.LJ(this.LLIIZ, c9pm.LLIIZ);
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
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        C43I<C76800UCe> c43i = this.LJLIL;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = hashCode * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<OSJ<Integer, Integer, Intent>> c43i3 = this.LJLJI;
        if (c43i3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C43I<C76800UCe> c43i4 = this.LJLJJI;
        if (c43i4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        boolean z = this.LJLJJL;
        int i6 = 1;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i5 + i7) * 31;
        boolean z2 = this.LJLJJLL;
        int i9 = z2;
        if (z2 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        C43I<Boolean> c43i5 = this.LJLJL;
        if (c43i5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i5.hashCode();
        }
        int i11 = (i10 + hashCode5) * 31;
        C43I<OSZ<Exception, Integer>> c43i6 = this.LJLJLJ;
        if (c43i6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c43i6.hashCode();
        }
        int i12 = (i11 + hashCode6) * 31;
        Aweme aweme = this.LJLJLLL;
        if (aweme == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = aweme.hashCode();
        }
        int hashCode36 = (this.LJLL.hashCode() + ((i12 + hashCode7) * 31)) * 31;
        C43I<ProfileUser> c43i7 = this.LJLLI;
        if (c43i7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c43i7.hashCode();
        }
        int LIZIZ = C40328FsC.LIZIZ(this.LJLLILLLL, (hashCode36 + hashCode8) * 31, 31);
        C43I<C76800UCe> c43i8 = this.LJLLJ;
        if (c43i8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = c43i8.hashCode();
        }
        int i13 = (LIZIZ + hashCode9) * 31;
        String str = this.LJLLL;
        if (str == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str.hashCode();
        }
        int i14 = (i13 + hashCode10) * 31;
        C43I<C76800UCe> c43i9 = this.LJLLLL;
        if (c43i9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = c43i9.hashCode();
        }
        int i15 = (i14 + hashCode11) * 31;
        if (!this.LJLLLLLL) {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        String str2 = this.LJLZ;
        if (str2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str2.hashCode();
        }
        int i17 = (i16 + hashCode12) * 31;
        String str3 = this.LJZ;
        if (str3 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str3.hashCode();
        }
        int i18 = (i17 + hashCode13) * 31;
        String str4 = this.LJZI;
        if (str4 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str4.hashCode();
        }
        int i19 = (i18 + hashCode14) * 31;
        String str5 = this.LJZL;
        if (str5 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str5.hashCode();
        }
        int i20 = (i19 + hashCode15) * 31;
        String str6 = this.LL;
        if (str6 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str6.hashCode();
        }
        int i21 = (i20 + hashCode16) * 31;
        String str7 = this.LLD;
        if (str7 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str7.hashCode();
        }
        int i22 = (i21 + hashCode17) * 31;
        String str8 = this.LLF;
        if (str8 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str8.hashCode();
        }
        int i23 = (i22 + hashCode18) * 31;
        C43I<C76800UCe> c43i10 = this.LLFF;
        if (c43i10 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = c43i10.hashCode();
        }
        int i24 = (i23 + hashCode19) * 31;
        C43I<Boolean> c43i11 = this.LLFFF;
        if (c43i11 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = c43i11.hashCode();
        }
        int i25 = (i24 + hashCode20) * 31;
        C43I<C76800UCe> c43i12 = this.LLFII;
        if (c43i12 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = c43i12.hashCode();
        }
        int i26 = (i25 + hashCode21) * 31;
        C43I<C76800UCe> c43i13 = this.LLFZ;
        if (c43i13 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = c43i13.hashCode();
        }
        int i27 = (i26 + hashCode22) * 31;
        String str9 = this.LLI;
        if (str9 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str9.hashCode();
        }
        int i28 = (i27 + hashCode23) * 31;
        String str10 = this.LLIFFJFJJ;
        if (str10 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str10.hashCode();
        }
        int i29 = (i28 + hashCode24) * 31;
        int[] iArr = this.LLII;
        if (iArr == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = Arrays.hashCode(iArr);
        }
        int i30 = (i29 + hashCode25) * 31;
        String str11 = this.LLIIII;
        if (str11 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str11.hashCode();
        }
        int i31 = (i30 + hashCode26) * 31;
        String str12 = this.LLIIIILZ;
        if (str12 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str12.hashCode();
        }
        int i32 = (i31 + hashCode27) * 31;
        String str13 = this.LLIIIJ;
        if (str13 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = str13.hashCode();
        }
        int i33 = (i32 + hashCode28) * 31;
        String str14 = this.LLIIIL;
        if (str14 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = str14.hashCode();
        }
        int i34 = (i33 + hashCode29) * 31;
        String str15 = this.LLIIIZ;
        if (str15 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = str15.hashCode();
        }
        int i35 = (i34 + hashCode30) * 31;
        Integer num = this.LLIIJI;
        if (num == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = num.hashCode();
        }
        int i36 = (i35 + hashCode31) * 31;
        String str16 = this.LLIIJLIL;
        if (str16 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = str16.hashCode();
        }
        int i37 = (i36 + hashCode32) * 31;
        C43I<OSZ<ProfileUser, User>> c43i14 = this.LLIIL;
        if (c43i14 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = c43i14.hashCode();
        }
        int i38 = (i37 + hashCode33) * 31;
        C43I<Boolean> c43i15 = this.LLIILII;
        if (c43i15 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = c43i15.hashCode();
        }
        int i39 = (i38 + hashCode34) * 31;
        String str17 = this.LLIILZL;
        if (str17 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = str17.hashCode();
        }
        int i40 = (i39 + hashCode35) * 31;
        String str18 = this.LLIIZ;
        if (str18 != null) {
            i = str18.hashCode();
        }
        return i40 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCommonDataState(bindCouponEntranceGifEvent=");
        sb.append(this.LJLIL);
        sb.append(", onHiddenChangedEvent=");
        sb.append(this.LJLILLLLZI);
        sb.append(", onActivityResultEvent=");
        sb.append(this.LJLJI);
        sb.append(", clearDataForBlock=");
        sb.append(this.LJLJJI);
        sb.append(", userVisibleHint=");
        sb.append(this.LJLJJL);
        sb.append(", visibleToUserInFeed=");
        sb.append(this.LJLJJLL);
        sb.append(", beginObserve=");
        sb.append(this.LJLJL);
        sb.append(", onUserUpdateFailed=");
        sb.append(this.LJLJLJ);
        sb.append(", aweme=");
        sb.append(this.LJLJLLL);
        sb.append(", action=");
        sb.append(this.LJLL);
        sb.append(", request=");
        sb.append(this.LJLLI);
        sb.append(", requestError=");
        sb.append(this.LJLLILLLL);
        sb.append(", refreshUIEvent=");
        sb.append(this.LJLLJ);
        sb.append(", enterFrom=");
        sb.append(this.LJLLL);
        sb.append(", refreshEvent=");
        sb.append(this.LJLLLL);
        sb.append(", isVisible=");
        sb.append(this.LJLLLLLL);
        sb.append(", uid=");
        sb.append(this.LJLZ);
        sb.append(", secUid=");
        sb.append(this.LJZ);
        sb.append(", previousPage=");
        sb.append(this.LJZI);
        sb.append(", eventType=");
        sb.append(this.LJZL);
        sb.append(", showWindowSource=");
        sb.append(this.LL);
        sb.append(", previousPagePosition=");
        sb.append(this.LLD);
        sb.append(", feedsAwemeId=");
        sb.append(this.LLF);
        sb.append(", clearDataEvent=");
        sb.append(this.LLFF);
        sb.append(", visibleChangeEvent=");
        sb.append(this.LLFFF);
        sb.append(", setUserEvent=");
        sb.append(this.LLFII);
        sb.append(", setLazy=");
        sb.append(this.LLFZ);
        sb.append(", roomId=");
        sb.append(this.LLI);
        sb.append(", sourceContentId=");
        sb.append(this.LLIFFJFJJ);
        sb.append(", trafficSourceList=");
        C0JT.LIZLLL(this.LLII, sb, ", sourcePage=");
        sb.append(this.LLIIII);
        sb.append(", profileEnterMethod=");
        sb.append(this.LLIIIILZ);
        sb.append(", nowCardType=");
        sb.append(this.LLIIIJ);
        sb.append(", isNowClear=");
        sb.append(this.LLIIIL);
        sb.append(", nowType=");
        sb.append(this.LLIIIZ);
        sb.append(", nowHasSmallWindow=");
        sb.append(this.LLIIJI);
        sb.append(", trackParams=");
        sb.append(this.LLIIJLIL);
        sb.append(", requestOther=");
        sb.append(this.LLIIL);
        sb.append(", userLoaded=");
        sb.append(this.LLIILII);
        sb.append(", shareType=");
        sb.append(this.LLIILZL);
        sb.append(", shareSource=");
        return C07670Rv.LIZIZ(sb, this.LLIIZ, ')');
    }

    public /* synthetic */ C9PM(int i) {
        this(null, null, null, null, true, false, null, null, null, EnumC235129Kq.NORMAL, null, new C43I(null), null, "", null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static C9PM LIZ(C9PM c9pm, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, boolean z, boolean z2, C43I c43i5, C43I c43i6, Aweme aweme, EnumC235129Kq enumC235129Kq, C43I c43i7, C43I c43i8, C43I c43i9, String str, C43I c43i10, boolean z3, String str2, String str3, C43I c43i11, C43I c43i12, C43I c43i13, C43I c43i14, int[] iArr, String str4, C43I c43i15, C43I c43i16, int i, int i2) {
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Integer num;
        String str16;
        String str17;
        C43I c43i17 = c43i16;
        C43I c43i18 = c43i15;
        String str18 = str4;
        int[] iArr2 = iArr;
        C43I c43i19 = c43i14;
        String str19 = str3;
        boolean z4 = z2;
        C43I c43i20 = c43i13;
        String str20 = str2;
        boolean z5 = z;
        C43I c43i21 = c43i4;
        C43I c43i22 = c43i3;
        C43I c43i23 = c43i;
        C43I c43i24 = c43i2;
        C43I c43i25 = c43i5;
        C43I c43i26 = c43i9;
        C43I c43i27 = c43i6;
        String str21 = str;
        Aweme aweme2 = aweme;
        C43I c43i28 = c43i11;
        C43I c43i29 = c43i10;
        EnumC235129Kq action = enumC235129Kq;
        C43I c43i30 = c43i7;
        C43I requestError = c43i8;
        C43I c43i31 = c43i12;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            c43i23 = c9pm.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i24 = c9pm.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i22 = c9pm.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i21 = c9pm.LJLJJI;
        }
        if ((i & 16) != 0) {
            z5 = c9pm.LJLJJL;
        }
        if ((i & 32) != 0) {
            z4 = c9pm.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i25 = c9pm.LJLJL;
        }
        if ((i & 128) != 0) {
            c43i27 = c9pm.LJLJLJ;
        }
        if ((i & 256) != 0) {
            aweme2 = c9pm.LJLJLLL;
        }
        if ((i & 512) != 0) {
            action = c9pm.LJLL;
        }
        if ((i & 1024) != 0) {
            c43i30 = c9pm.LJLLI;
        }
        if ((i & 2048) != 0) {
            requestError = c9pm.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c43i26 = c9pm.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str21 = c9pm.LJLLL;
        }
        if ((i & 16384) != 0) {
            c43i29 = c9pm.LJLLLL;
        }
        if ((32768 & i) != 0) {
            z6 = c9pm.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            str20 = c9pm.LJLZ;
        }
        if ((131072 & i) != 0) {
            str19 = c9pm.LJZ;
        }
        String str22 = null;
        if ((262144 & i) != 0) {
            str5 = c9pm.LJZI;
        } else {
            str5 = null;
        }
        if ((524288 & i) != 0) {
            str6 = c9pm.LJZL;
        } else {
            str6 = null;
        }
        if ((1048576 & i) != 0) {
            str7 = c9pm.LL;
        } else {
            str7 = null;
        }
        if ((2097152 & i) != 0) {
            str8 = c9pm.LLD;
        } else {
            str8 = null;
        }
        if ((4194304 & i) != 0) {
            str9 = c9pm.LLF;
        } else {
            str9 = null;
        }
        if ((8388608 & i) != 0) {
            c43i28 = c9pm.LLFF;
        }
        if ((16777216 & i) != 0) {
            c43i31 = c9pm.LLFFF;
        }
        if ((33554432 & i) != 0) {
            c43i20 = c9pm.LLFII;
        }
        if ((67108864 & i) != 0) {
            c43i19 = c9pm.LLFZ;
        }
        if ((134217728 & i) != 0) {
            str10 = c9pm.LLI;
        } else {
            str10 = null;
        }
        if ((268435456 & i) != 0) {
            str11 = c9pm.LLIFFJFJJ;
        } else {
            str11 = null;
        }
        if ((536870912 & i) != 0) {
            iArr2 = c9pm.LLII;
        }
        if ((1073741824 & i) != 0) {
            str12 = c9pm.LLIIII;
        } else {
            str12 = null;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            str18 = c9pm.LLIIIILZ;
        }
        if ((i2 & 1) != 0) {
            str13 = c9pm.LLIIIJ;
        } else {
            str13 = null;
        }
        if ((i2 & 2) != 0) {
            str14 = c9pm.LLIIIL;
        } else {
            str14 = null;
        }
        if ((i2 & 4) != 0) {
            str15 = c9pm.LLIIIZ;
        } else {
            str15 = null;
        }
        if ((i2 & 8) != 0) {
            num = c9pm.LLIIJI;
        } else {
            num = null;
        }
        if ((i2 & 16) != 0) {
            str16 = c9pm.LLIIJLIL;
        } else {
            str16 = null;
        }
        if ((i2 & 32) != 0) {
            c43i18 = c9pm.LLIIL;
        }
        if ((i2 & 64) != 0) {
            c43i17 = c9pm.LLIILII;
        }
        if ((i2 & 128) != 0) {
            str17 = c9pm.LLIILZL;
        } else {
            str17 = null;
        }
        if ((i2 & 256) != 0) {
            str22 = c9pm.LLIIZ;
        }
        c9pm.getClass();
        o.LJIIIZ(action, "action");
        o.LJIIIZ(requestError, "requestError");
        return new C9PM(c43i23, c43i24, c43i22, c43i21, z5, z4, c43i25, c43i27, aweme2, action, c43i30, requestError, c43i26, str21, c43i29, z6, str20, str19, str5, str6, str7, str8, str9, c43i28, c43i31, c43i20, c43i19, str10, str11, iArr2, str12, str18, str13, str14, str15, num, str16, c43i18, c43i17, str17, str22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9PM(C43I<C76800UCe> c43i, C43I<Boolean> c43i2, C43I<? extends OSJ<Integer, Integer, ? extends Intent>> c43i3, C43I<C76800UCe> c43i4, boolean z, boolean z2, C43I<Boolean> c43i5, C43I<? extends OSZ<? extends Exception, Integer>> c43i6, Aweme aweme, EnumC235129Kq action, C43I<ProfileUser> c43i7, C43I<? extends Throwable> requestError, C43I<C76800UCe> c43i8, String str, C43I<C76800UCe> c43i9, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C43I<C76800UCe> c43i10, C43I<Boolean> c43i11, C43I<C76800UCe> c43i12, C43I<C76800UCe> c43i13, String str9, String str10, int[] iArr, String str11, String str12, String str13, String str14, String str15, Integer num, String str16, C43I<? extends OSZ<ProfileUser, ? extends User>> c43i14, C43I<Boolean> c43i15, String str17, String str18) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(requestError, "requestError");
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = c43i5;
        this.LJLJLJ = c43i6;
        this.LJLJLLL = aweme;
        this.LJLL = action;
        this.LJLLI = c43i7;
        this.LJLLILLLL = requestError;
        this.LJLLJ = c43i8;
        this.LJLLL = str;
        this.LJLLLL = c43i9;
        this.LJLLLLLL = z3;
        this.LJLZ = str2;
        this.LJZ = str3;
        this.LJZI = str4;
        this.LJZL = str5;
        this.LL = str6;
        this.LLD = str7;
        this.LLF = str8;
        this.LLFF = c43i10;
        this.LLFFF = c43i11;
        this.LLFII = c43i12;
        this.LLFZ = c43i13;
        this.LLI = str9;
        this.LLIFFJFJJ = str10;
        this.LLII = iArr;
        this.LLIIII = str11;
        this.LLIIIILZ = str12;
        this.LLIIIJ = str13;
        this.LLIIIL = str14;
        this.LLIIIZ = str15;
        this.LLIIJI = num;
        this.LLIIJLIL = str16;
        this.LLIIL = c43i14;
        this.LLIILII = c43i15;
        this.LLIILZL = str17;
        this.LLIIZ = str18;
    }
}
