package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.635, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass635 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final OSZ<Integer, Integer> LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final List<String> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final InterfaceC65784Pro<Boolean> LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;

    public AnonymousClass635() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass635)) {
            return false;
        }
        AnonymousClass635 anonymousClass635 = (AnonymousClass635) obj;
        return o.LJ(this.LIZ, anonymousClass635.LIZ) && this.LIZIZ == anonymousClass635.LIZIZ && o.LJ(this.LIZJ, anonymousClass635.LIZJ) && this.LIZLLL == anonymousClass635.LIZLLL && this.LJ == anonymousClass635.LJ && this.LJFF == anonymousClass635.LJFF && this.LJI == anonymousClass635.LJI && this.LJII == anonymousClass635.LJII && this.LJIIIIZZ == anonymousClass635.LJIIIIZZ && o.LJ(this.LJIIIZ, anonymousClass635.LJIIIZ) && this.LJIIJ == anonymousClass635.LJIIJ && this.LJIIJJI == anonymousClass635.LJIIJJI && this.LJIIL == anonymousClass635.LJIIL && o.LJ(this.LJIILIIL, anonymousClass635.LJIILIIL) && this.LJIILJJIL == anonymousClass635.LJIILJJIL && this.LJIILL == anonymousClass635.LJIILL && o.LJ(this.LJIILLIIL, anonymousClass635.LJIILLIIL) && this.LJIIZILJ == anonymousClass635.LJIIZILJ && this.LJIJ == anonymousClass635.LJIJ && this.LJIJI == anonymousClass635.LJIJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZJ;
        int hashCode2 = (i2 + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode())) * 31;
        boolean z2 = this.LIZLLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z3 = this.LJ;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJFF;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.LJI;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.LJII;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.LJIIIIZZ;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int hashCode3 = (this.LJIIIZ.hashCode() + ((i12 + i13) * 31)) * 31;
        boolean z8 = this.LJIIJ;
        int i14 = z8;
        if (z8 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode3 + i14) * 31;
        boolean z9 = this.LJIIJJI;
        int i16 = z9;
        if (z9 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z10 = this.LJIIL;
        int i18 = z10;
        if (z10 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        List<String> list = this.LJIILIIL;
        int hashCode4 = (i19 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z11 = this.LJIILJJIL;
        int i20 = z11;
        if (z11 != 0) {
            i20 = 1;
        }
        int i21 = (hashCode4 + i20) * 31;
        boolean z12 = this.LJIILL;
        int i22 = z12;
        if (z12 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = this.LJIILLIIL;
        int hashCode5 = (i23 + (interfaceC65784Pro2 != null ? interfaceC65784Pro2.hashCode() : 0)) * 31;
        boolean z13 = this.LJIIZILJ;
        int i24 = z13;
        if (z13 != 0) {
            i24 = 1;
        }
        int i25 = (hashCode5 + i24) * 31;
        boolean z14 = this.LJIJ;
        int i26 = z14;
        if (z14 != 0) {
            i26 = 1;
        }
        return ((i25 + i26) * 31) + (this.LJIJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditTextStickerConfig(fontPanel=");
        sb.append(this.LIZ);
        sb.append(", strokeEnable=");
        sb.append(this.LIZIZ);
        sb.append(", enableReadText=");
        sb.append(this.LIZJ);
        sb.append(", enableReadTextV2=");
        sb.append(this.LIZLLL);
        sb.append(", enableReadTextButton=");
        sb.append(this.LJ);
        sb.append(", isTtsEntranceV1=");
        sb.append(this.LJFF);
        sb.append(", isTtsEntranceV2=");
        sb.append(this.LJI);
        sb.append(", isTtsEntranceV3=");
        sb.append(this.LJII);
        sb.append(", textSizeRollBar=");
        sb.append(this.LJIIIIZZ);
        sb.append(", textSizeSliderRange=");
        sb.append(this.LJIIIZ);
        sb.append(", enableQaSticker=");
        sb.append(this.LJIIJ);
        sb.append(", isShoutout=");
        sb.append(this.LJIIJJI);
        sb.append(", allowQuestion=");
        sb.append(this.LJIIL);
        sb.append(", checkTextIsQuestionRegex=");
        sb.append(this.LJIILIIL);
        sb.append(", isForward2StoryMode=");
        sb.append(this.LJIILJJIL);
        sb.append(", shouldChangeTTSDesc=");
        sb.append(this.LJIILL);
        sb.append(", captionOnlyShowDeleteBubble=");
        sb.append(this.LJIILLIIL);
        sb.append(", enableTextAnimOpt=");
        sb.append(this.LJIIZILJ);
        sb.append(", enableOptOffscreenBuffer=");
        sb.append(this.LJIJ);
        sb.append(", enableHapticFeedback=");
        return C08880Wm.LIZJ(sb, this.LJIJI, ')');
    }

    public AnonymousClass635(int i) {
        this("", true, null, false, false, false, false, false, false, new OSZ(12, 64), false, false, false, null, false, false, null, false, false, false);
    }

    public AnonymousClass635(String fontPanel, boolean z, InterfaceC65784Pro<Boolean> interfaceC65784Pro, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, OSZ<Integer, Integer> textSizeSliderRange, boolean z8, boolean z9, boolean z10, List<String> list, boolean z11, boolean z12, InterfaceC65784Pro<Boolean> interfaceC65784Pro2, boolean z13, boolean z14, boolean z15) {
        o.LJIIIZ(fontPanel, "fontPanel");
        o.LJIIIZ(textSizeSliderRange, "textSizeSliderRange");
        this.LIZ = fontPanel;
        this.LIZIZ = z;
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = z7;
        this.LJIIIZ = textSizeSliderRange;
        this.LJIIJ = z8;
        this.LJIIJJI = z9;
        this.LJIIL = z10;
        this.LJIILIIL = list;
        this.LJIILJJIL = z11;
        this.LJIILL = z12;
        this.LJIILLIIL = interfaceC65784Pro2;
        this.LJIIZILJ = z13;
        this.LJIJ = z14;
        this.LJIJI = z15;
    }
}
