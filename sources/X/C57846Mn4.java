package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mn4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57846Mn4 {
    public int LIZ;
    public Integer LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public EnumC57853MnB LJFF;
    public InterfaceC88472Yns<? super RecUser, ? extends EnumC112694bZ> LJI;
    public final boolean LJII;
    public C57851Mn9 LJIIIIZZ;
    public C57848Mn6 LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public C73306Spq LJIIL;
    public C73306Spq LJIILIIL;
    public InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> LJIILJJIL;
    public C73306Spq LJIILL;
    public InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> LJIILLIIL;
    public final boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public Integer LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public final List<C57864MnM> LJJI;
    public List<C26421AYn> LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public final int LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public boolean LJJIJIL;

    public C57846Mn4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57846Mn4)) {
            return false;
        }
        C57846Mn4 c57846Mn4 = (C57846Mn4) obj;
        return this.LIZ == c57846Mn4.LIZ && o.LJ(this.LIZIZ, c57846Mn4.LIZIZ) && this.LIZJ == c57846Mn4.LIZJ && this.LIZLLL == c57846Mn4.LIZLLL && this.LJ == c57846Mn4.LJ && this.LJFF == c57846Mn4.LJFF && o.LJ(this.LJI, c57846Mn4.LJI) && this.LJII == c57846Mn4.LJII && o.LJ(this.LJIIIIZZ, c57846Mn4.LJIIIIZZ) && o.LJ(this.LJIIIZ, c57846Mn4.LJIIIZ) && this.LJIIJ == c57846Mn4.LJIIJ && this.LJIIJJI == c57846Mn4.LJIIJJI && o.LJ(this.LJIIL, c57846Mn4.LJIIL) && o.LJ(this.LJIILIIL, c57846Mn4.LJIILIIL) && o.LJ(this.LJIILJJIL, c57846Mn4.LJIILJJIL) && o.LJ(this.LJIILL, c57846Mn4.LJIILL) && o.LJ(this.LJIILLIIL, c57846Mn4.LJIILLIIL) && this.LJIIZILJ == c57846Mn4.LJIIZILJ && this.LJIJ == c57846Mn4.LJIJ && this.LJIJI == c57846Mn4.LJIJI && this.LJIJJ == c57846Mn4.LJIJJ && o.LJ(this.LJIJJLI, c57846Mn4.LJIJJLI) && this.LJIL == c57846Mn4.LJIL && this.LJJ == c57846Mn4.LJJ && o.LJ(this.LJJI, c57846Mn4.LJJI) && o.LJ(this.LJJIFFI, c57846Mn4.LJJIFFI) && this.LJJII == c57846Mn4.LJJII && this.LJJIII == c57846Mn4.LJJIII && this.LJJIIJ == c57846Mn4.LJJIIJ && this.LJJIIJZLJL == c57846Mn4.LJJIIJZLJL && this.LJJIIZ == c57846Mn4.LJJIIZ && this.LJJIIZI == c57846Mn4.LJJIIZI && this.LJJIJ == c57846Mn4.LJJIJ && this.LJJIJIIJI == c57846Mn4.LJJIJIIJI && this.LJJIJIIJIL == c57846Mn4.LJJIJIIJIL && this.LJJIJIL == c57846Mn4.LJJIJIL;
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
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        boolean z = this.LIZJ;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LIZIZ = QZY.LIZIZ(this.LJI, (this.LJFF.hashCode() + ((((((i3 + i5) * 31) + this.LIZLLL) * 31) + this.LJ) * 31)) * 31, 31);
        boolean z2 = this.LJII;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (LIZIZ + i6) * 31;
        C57851Mn9 c57851Mn9 = this.LJIIIIZZ;
        if (c57851Mn9 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c57851Mn9.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        C57848Mn6 c57848Mn6 = this.LJIIIZ;
        if (c57848Mn6 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c57848Mn6.hashCode();
        }
        int i9 = (i8 + hashCode3) * 31;
        boolean z3 = this.LJIIJ;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = (((i9 + i10) * 31) + this.LJIIJJI) * 31;
        C73306Spq c73306Spq = this.LJIIL;
        if (c73306Spq == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c73306Spq.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        C73306Spq c73306Spq2 = this.LJIILIIL;
        if (c73306Spq2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c73306Spq2.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> interfaceC88471Ynr = this.LJIILJJIL;
        if (interfaceC88471Ynr == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = interfaceC88471Ynr.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        C73306Spq c73306Spq3 = this.LJIILL;
        if (c73306Spq3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c73306Spq3.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> interfaceC88471Ynr2 = this.LJIILLIIL;
        if (interfaceC88471Ynr2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = interfaceC88471Ynr2.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        boolean z4 = this.LJIIZILJ;
        int i17 = z4;
        if (z4 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z5 = this.LJIJ;
        int i19 = z5;
        if (z5 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        boolean z6 = this.LJIJI;
        int i21 = z6;
        if (z6 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z7 = this.LJIJJ;
        int i23 = z7;
        if (z7 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        Integer num2 = this.LJIJJLI;
        if (num2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num2.hashCode();
        }
        int i25 = (i24 + hashCode9) * 31;
        boolean z8 = this.LJIL;
        int i26 = z8;
        if (z8 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        boolean z9 = this.LJJ;
        int i28 = z9;
        if (z9 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        List<C57864MnM> list = this.LJJI;
        if (list == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list.hashCode();
        }
        int i30 = (i29 + hashCode10) * 31;
        List<C26421AYn> list2 = this.LJJIFFI;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        int i31 = (i30 + i2) * 31;
        boolean z10 = this.LJJII;
        int i32 = z10;
        if (z10 != 0) {
            i32 = 1;
        }
        int i33 = (i31 + i32) * 31;
        boolean z11 = this.LJJIII;
        int i34 = z11;
        if (z11 != 0) {
            i34 = 1;
        }
        int i35 = (((((i33 + i34) * 31) + this.LJJIIJ) * 31) + this.LJJIIJZLJL) * 31;
        boolean z12 = this.LJJIIZ;
        int i36 = z12;
        if (z12 != 0) {
            i36 = 1;
        }
        int i37 = (((((((((i35 + i36) * 31) + this.LJJIIZI) * 31) + this.LJJIJ) * 31) + this.LJJIJIIJI) * 31) + this.LJJIJIIJIL) * 31;
        if (!this.LJJIJIL) {
            i4 = 0;
        }
        return i37 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UIConfig(cellVariant=");
        sb.append(this.LIZ);
        sb.append(", loadingVariant=");
        sb.append(this.LIZIZ);
        sb.append(", forceDarkMode=");
        sb.append(this.LIZJ);
        sb.append(", deleteVariant=");
        sb.append(this.LIZLLL);
        sb.append(", buttonVariant=");
        sb.append(this.LJ);
        sb.append(", buttonStyle=");
        sb.append(this.LJFF);
        sb.append(", buildMutualFollowText=");
        sb.append(this.LJI);
        sb.append(", hasRefresh=");
        sb.append(this.LJII);
        sb.append(", titleProps=");
        sb.append(this.LJIIIIZZ);
        sb.append(", newSuggestTitleProps=");
        sb.append(this.LJIIIZ);
        sb.append(", isNewLabelStyle=");
        sb.append(this.LJIIJ);
        sb.append(", cellSpacing=");
        sb.append(this.LJIIJJI);
        sb.append(", emptyStatus=");
        sb.append(this.LJIIL);
        sb.append(", networkErrorStatus=");
        sb.append(this.LJIILIIL);
        sb.append(", networkErrorLogic=");
        sb.append(this.LJIILJJIL);
        sb.append(", notNetStatus=");
        sb.append(this.LJIILL);
        sb.append(", notNetStatusLogic=");
        sb.append(this.LJIILLIIL);
        sb.append(", isEnableAnimation=");
        sb.append(this.LJIIZILJ);
        sb.append(", isShowFollowBtnOnDetail=");
        sb.append(this.LJIJ);
        sb.append(", preventClickItem=");
        sb.append(this.LJIJI);
        sb.append(", hasLoadMoreFooter=");
        sb.append(this.LJIJJ);
        sb.append(", authCellDeleteVariant=");
        sb.append(this.LJIJJLI);
        sb.append(", withNowAvatar=");
        sb.append(this.LJIL);
        sb.append(", newSuggestAreaStyle=");
        sb.append(this.LJJ);
        sb.append(", headerViews=");
        sb.append(this.LJJI);
        sb.append(", lastViews=");
        sb.append(this.LJJIFFI);
        sb.append(", relationButtonCallPrompt=");
        sb.append(this.LJJII);
        sb.append(", cancelLongPress=");
        sb.append(this.LJJIII);
        sb.append(", powerListPaddingStart=");
        sb.append(this.LJJIIJ);
        sb.append(", powerListPaddingEnd=");
        sb.append(this.LJJIIJZLJL);
        sb.append(", showNetworkTips=");
        sb.append(this.LJJIIZ);
        sb.append(", topAreaMarginTop=");
        sb.append(this.LJJIIZI);
        sb.append(", bottomAreaMarginBottom=");
        sb.append(this.LJJIJ);
        sb.append(", headerLayoutMarginTop=");
        sb.append(this.LJJIJIIJI);
        sb.append(", userCardLayoutMarginTop=");
        sb.append(this.LJJIJIIJIL);
        sb.append(", largeDislikeArea=");
        return C08880Wm.LIZJ(sb, this.LJJIJIL, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57846Mn4(int r39) {
        /*
            r38 = this;
            r2 = 101(0x65, float:1.42E-43)
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r5 = 201(0xc9, float:2.82E-43)
            r6 = 501(0x1f5, float:7.02E-43)
            X.MnB r7 = X.EnumC57853MnB.TUX_NORMAL
            X.Mmc r8 = X.C57818Mmc.LJLIL
            r10 = 0
            r12 = 1
            r0 = 8
            int r13 = X.C7MY.LIZIZ(r0)
            X.Spq r14 = X.C57862MnK.LIZ
            java.lang.Integer r23 = java.lang.Integer.valueOf(r5)
            r0 = 16
            int r30 = X.C7MY.LIZIZ(r0)
            int r31 = X.C7MY.LIZIZ(r0)
            r1 = 12
            int r33 = X.C7MY.LIZIZ(r1)
            int r34 = X.C7MY.LIZIZ(r1)
            r0 = 4
            int r35 = X.C7MY.LIZIZ(r0)
            int r36 = X.C7MY.LIZIZ(r1)
            r1 = r38
            r9 = r4
            r11 = r10
            r15 = r14
            r16 = r10
            r17 = r14
            r18 = r10
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r12
            r24 = r4
            r25 = r4
            r26 = r10
            r27 = r10
            r28 = r4
            r29 = r4
            r32 = r12
            r37 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57846Mn4.<init>(int):void");
    }

    public static C57846Mn4 LIZ(C57846Mn4 c57846Mn4, int i) {
        int i2;
        Integer num;
        boolean z;
        int i3;
        int i4;
        EnumC57853MnB enumC57853MnB;
        InterfaceC88472Yns<? super RecUser, ? extends EnumC112694bZ> interfaceC88472Yns;
        boolean z2;
        C57851Mn9 c57851Mn9;
        C57848Mn6 c57848Mn6;
        boolean z3;
        int i5;
        C73306Spq c73306Spq;
        C73306Spq c73306Spq2;
        InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> interfaceC88471Ynr;
        C73306Spq c73306Spq3;
        InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> interfaceC88471Ynr2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Integer num2;
        boolean z8;
        boolean z9;
        List<C57864MnM> list;
        boolean z10;
        boolean z11;
        int i6;
        int i7;
        boolean z12;
        int i8;
        if ((i & 1) != 0) {
            i2 = c57846Mn4.LIZ;
        } else {
            i2 = 0;
        }
        List<C26421AYn> list2 = null;
        if ((i & 2) != 0) {
            num = c57846Mn4.LIZIZ;
        } else {
            num = null;
        }
        if ((i & 4) != 0) {
            z = c57846Mn4.LIZJ;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            i3 = c57846Mn4.LIZLLL;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            i4 = c57846Mn4.LJ;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            enumC57853MnB = c57846Mn4.LJFF;
        } else {
            enumC57853MnB = null;
        }
        if ((i & 64) != 0) {
            interfaceC88472Yns = c57846Mn4.LJI;
        } else {
            interfaceC88472Yns = null;
        }
        if ((i & 128) != 0) {
            z2 = c57846Mn4.LJII;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            c57851Mn9 = c57846Mn4.LJIIIIZZ;
        } else {
            c57851Mn9 = null;
        }
        if ((i & 512) != 0) {
            c57848Mn6 = c57846Mn4.LJIIIZ;
        } else {
            c57848Mn6 = null;
        }
        if ((i & 1024) != 0) {
            z3 = c57846Mn4.LJIIJ;
        } else {
            z3 = false;
        }
        if ((i & 2048) != 0) {
            i5 = c57846Mn4.LJIIJJI;
        } else {
            i5 = 0;
        }
        if ((i & 4096) != 0) {
            c73306Spq = c57846Mn4.LJIIL;
        } else {
            c73306Spq = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c73306Spq2 = c57846Mn4.LJIILIIL;
        } else {
            c73306Spq2 = null;
        }
        if ((i & 16384) != 0) {
            interfaceC88471Ynr = c57846Mn4.LJIILJJIL;
        } else {
            interfaceC88471Ynr = null;
        }
        if ((32768 & i) != 0) {
            c73306Spq3 = c57846Mn4.LJIILL;
        } else {
            c73306Spq3 = null;
        }
        if ((65536 & i) != 0) {
            interfaceC88471Ynr2 = c57846Mn4.LJIILLIIL;
        } else {
            interfaceC88471Ynr2 = null;
        }
        if ((131072 & i) != 0) {
            z4 = c57846Mn4.LJIIZILJ;
        } else {
            z4 = false;
        }
        if ((262144 & i) != 0) {
            z5 = c57846Mn4.LJIJ;
        } else {
            z5 = false;
        }
        if ((524288 & i) != 0) {
            z6 = c57846Mn4.LJIJI;
        } else {
            z6 = false;
        }
        if ((1048576 & i) != 0) {
            z7 = c57846Mn4.LJIJJ;
        } else {
            z7 = false;
        }
        if ((2097152 & i) != 0) {
            num2 = c57846Mn4.LJIJJLI;
        } else {
            num2 = null;
        }
        if ((4194304 & i) != 0) {
            z8 = c57846Mn4.LJIL;
        } else {
            z8 = false;
        }
        if ((8388608 & i) != 0) {
            z9 = c57846Mn4.LJJ;
        } else {
            z9 = false;
        }
        if ((16777216 & i) != 0) {
            list = c57846Mn4.LJJI;
        } else {
            list = null;
        }
        if ((33554432 & i) != 0) {
            list2 = c57846Mn4.LJJIFFI;
        }
        if ((67108864 & i) != 0) {
            z10 = c57846Mn4.LJJII;
        } else {
            z10 = false;
        }
        if ((134217728 & i) != 0) {
            z11 = c57846Mn4.LJJIII;
        } else {
            z11 = false;
        }
        if ((268435456 & i) != 0) {
            i6 = c57846Mn4.LJJIIJ;
        } else {
            i6 = 0;
        }
        if ((536870912 & i) != 0) {
            i7 = c57846Mn4.LJJIIJZLJL;
        } else {
            i7 = 0;
        }
        if ((1073741824 & i) != 0) {
            z12 = c57846Mn4.LJJIIZ;
        } else {
            z12 = false;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            i8 = c57846Mn4.LJJIIZI;
        } else {
            i8 = 0;
        }
        int i9 = c57846Mn4.LJJIJ;
        int i10 = c57846Mn4.LJJIJIIJI;
        int i11 = c57846Mn4.LJJIJIIJIL;
        boolean z13 = c57846Mn4.LJJIJIL;
        c57846Mn4.getClass();
        EnumC57853MnB buttonStyle = enumC57853MnB;
        o.LJIIIZ(buttonStyle, "buttonStyle");
        InterfaceC88472Yns<? super RecUser, ? extends EnumC112694bZ> buildMutualFollowText = interfaceC88472Yns;
        o.LJIIIZ(buildMutualFollowText, "buildMutualFollowText");
        return new C57846Mn4(i2, num, z, i3, i4, enumC57853MnB, interfaceC88472Yns, z2, c57851Mn9, c57848Mn6, z3, i5, c73306Spq, c73306Spq2, interfaceC88471Ynr, c73306Spq3, interfaceC88471Ynr2, z4, z5, z6, z7, num2, z8, z9, list, list2, z10, z11, i6, i7, z12, i8, i9, i10, i11, z13);
    }

    public C57846Mn4(int i, Integer num, boolean z, int i2, int i3, EnumC57853MnB buttonStyle, InterfaceC88472Yns<? super RecUser, ? extends EnumC112694bZ> buildMutualFollowText, boolean z2, C57851Mn9 c57851Mn9, C57848Mn6 c57848Mn6, boolean z3, int i4, C73306Spq c73306Spq, C73306Spq c73306Spq2, InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> interfaceC88471Ynr, C73306Spq c73306Spq3, InterfaceC88471Ynr<? super Throwable, ? super C73305Spp, C76800UCe> interfaceC88471Ynr2, boolean z4, boolean z5, boolean z6, boolean z7, Integer num2, boolean z8, boolean z9, List<C57864MnM> list, List<C26421AYn> list2, boolean z10, boolean z11, int i5, int i6, boolean z12, int i7, int i8, int i9, int i10, boolean z13) {
        o.LJIIIZ(buttonStyle, "buttonStyle");
        o.LJIIIZ(buildMutualFollowText, "buildMutualFollowText");
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = buttonStyle;
        this.LJI = buildMutualFollowText;
        this.LJII = z2;
        this.LJIIIIZZ = c57851Mn9;
        this.LJIIIZ = c57848Mn6;
        this.LJIIJ = z3;
        this.LJIIJJI = i4;
        this.LJIIL = c73306Spq;
        this.LJIILIIL = c73306Spq2;
        this.LJIILJJIL = interfaceC88471Ynr;
        this.LJIILL = c73306Spq3;
        this.LJIILLIIL = interfaceC88471Ynr2;
        this.LJIIZILJ = z4;
        this.LJIJ = z5;
        this.LJIJI = z6;
        this.LJIJJ = z7;
        this.LJIJJLI = num2;
        this.LJIL = z8;
        this.LJJ = z9;
        this.LJJI = list;
        this.LJJIFFI = list2;
        this.LJJII = z10;
        this.LJJIII = z11;
        this.LJJIIJ = i5;
        this.LJJIIJZLJL = i6;
        this.LJJIIZ = z12;
        this.LJJIIZI = i7;
        this.LJJIJ = i8;
        this.LJJIJIIJI = i9;
        this.LJJIJIIJIL = i10;
        this.LJJIJIL = z13;
    }
}
