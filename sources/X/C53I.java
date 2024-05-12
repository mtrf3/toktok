package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.53I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53I {
    public final int LIZ;
    public final int LIZIZ;
    public final Drawable LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final Integer LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final C53L LJIJJLI;
    public final InterfaceC88475Ynv<? super RecyclerView, ? super RecyclerView.ViewHolder, ? super ArrayList<AnonymousClass523>, ? super Integer, ? super Boolean, C76800UCe> LJIL;
    public final InterfaceC88473Ynt<? super View, ? super View, ? super Boolean, C76800UCe> LJJ;
    public final InterfaceC88472Yns<? super Integer, ? extends Drawable> LJJI;
    public final Typeface LJJIFFI;
    public final boolean LJJII;
    public final InterfaceC1286253a LJJIII;
    public final C53J LJJIIJ;

    public C53I() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 536870911);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53I)) {
            return false;
        }
        C53I c53i = (C53I) obj;
        return this.LIZ == c53i.LIZ && this.LIZIZ == c53i.LIZIZ && o.LJ(this.LIZJ, c53i.LIZJ) && this.LIZLLL == c53i.LIZLLL && this.LJ == c53i.LJ && this.LJFF == c53i.LJFF && this.LJI == c53i.LJI && this.LJII == c53i.LJII && this.LJIIIIZZ == c53i.LJIIIIZZ && this.LJIIIZ == c53i.LJIIIZ && this.LJIIJ == c53i.LJIIJ && this.LJIIJJI == c53i.LJIIJJI && this.LJIIL == c53i.LJIIL && this.LJIILIIL == c53i.LJIILIIL && this.LJIILJJIL == c53i.LJIILJJIL && this.LJIILL == c53i.LJIILL && this.LJIILLIIL == c53i.LJIILLIIL && this.LJIIZILJ == c53i.LJIIZILJ && o.LJ(this.LJIJ, c53i.LJIJ) && this.LJIJI == c53i.LJIJI && this.LJIJJ == c53i.LJIJJ && this.LJIJJLI == c53i.LJIJJLI && o.LJ(this.LJIL, c53i.LJIL) && o.LJ(this.LJJ, c53i.LJJ) && o.LJ(this.LJJI, c53i.LJJI) && o.LJ(this.LJJIFFI, c53i.LJJIFFI) && this.LJJII == c53i.LJJII && o.LJ(this.LJJIII, c53i.LJJIII) && o.LJ(this.LJJIIJ, c53i.LJJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Drawable drawable = this.LIZJ;
        int hashCode = (((((((((((((((((((((((((((((((i + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31) + this.LJIILIIL) * 31) + this.LJIILJJIL) * 31) + this.LJIILL) * 31) + this.LJIILLIIL) * 31) + this.LJIIZILJ) * 31;
        Integer num = this.LJIJ;
        int hashCode2 = (this.LJIJJLI.hashCode() + ((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJIJI) * 31) + this.LJIJJ) * 31)) * 31;
        InterfaceC88475Ynv<? super RecyclerView, ? super RecyclerView.ViewHolder, ? super ArrayList<AnonymousClass523>, ? super Integer, ? super Boolean, C76800UCe> interfaceC88475Ynv = this.LJIL;
        int hashCode3 = (hashCode2 + (interfaceC88475Ynv == null ? 0 : interfaceC88475Ynv.hashCode())) * 31;
        InterfaceC88473Ynt<? super View, ? super View, ? super Boolean, C76800UCe> interfaceC88473Ynt = this.LJJ;
        int hashCode4 = (hashCode3 + (interfaceC88473Ynt == null ? 0 : interfaceC88473Ynt.hashCode())) * 31;
        InterfaceC88472Yns<? super Integer, ? extends Drawable> interfaceC88472Yns = this.LJJI;
        int hashCode5 = (hashCode4 + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31;
        Typeface typeface = this.LJJIFFI;
        int hashCode6 = (hashCode5 + (typeface == null ? 0 : typeface.hashCode())) * 31;
        boolean z = this.LJJII;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode6 + i2) * 31;
        InterfaceC1286253a interfaceC1286253a = this.LJJIII;
        int hashCode7 = (i3 + (interfaceC1286253a == null ? 0 : interfaceC1286253a.hashCode())) * 31;
        C53J c53j = this.LJJIIJ;
        return hashCode7 + (c53j != null ? c53j.hashCode() : 0);
    }

    public final String toString() {
        return "FuncBarViewConfig(funcBarBackgroundDrawableRes=" + this.LIZ + ", backIconDrawableRes=" + this.LIZIZ + ", backIconDrawable=" + this.LIZJ + ", backIconContainerBackgroundColor=" + this.LIZLLL + ", backIconContainerWidth=" + this.LJ + ", backIconContainerHeight=" + this.LJFF + ", backIconContainerStartMargin=" + this.LJI + ", backIconContainerEndMargin=" + this.LJII + ", backIconContainerTopMargin=" + this.LJIIIIZZ + ", backIconContainerBottomMargin=" + this.LJIIIZ + ", backIconContainerBg=" + this.LJIIJ + ", funcBarHeight=" + this.LJIIJJI + ", itemImageViewWidth=" + this.LJIIL + ", itemImageViewHeight=" + this.LJIILIIL + ", itemTextViewSize=" + this.LJIILJJIL + ", itemTextViewMaxWidth=" + this.LJIILL + ", itemTextViewMinWidth=" + this.LJIILLIIL + ", itemTextViewMinHeight=" + this.LJIIZILJ + ", itemTextViewColor=" + this.LJIJ + ", itemTextTopMargin=" + this.LJIJI + ", itemSpacing=" + this.LJIJJ + ", childrenAlignInParent=" + this.LJIJJLI + ", dynamicLayoutFunctionBar=" + this.LJIL + ", functionBarAnimation=" + this.LJJ + ", customBackIcon=" + this.LJJI + ", customTypeface=" + this.LJJIFFI + ", hideFunctionBarBackIcon=" + this.LJJII + ", customItemOnTouchListener=" + this.LJJIII + ", subMenuViewConfig=" + this.LJJIIJ + ')';
    }

    public C53I(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Integer num, C53L c53l, C1293755x c1293755x, IDqS427S0100000_2 iDqS427S0100000_2, Typeface typeface, C78894Uxm c78894Uxm, C53J c53j, int i15) {
        int i16;
        int i17 = i4;
        int i18 = i3;
        int i19 = i2;
        int i20 = i13;
        int i21 = i12;
        int i22 = i11;
        int i23 = i6;
        int i24 = i5;
        int i25 = i7;
        int i26 = i8;
        int i27 = i9;
        int i28 = i10;
        C53J c53j2 = c53j;
        C78894Uxm c78894Uxm2 = c78894Uxm;
        Integer num2 = num;
        int i29 = i14;
        C53L childrenAlignInParent = c53l;
        Typeface typeface2 = typeface;
        C1293755x c1293755x2 = c1293755x;
        IDqS427S0100000_2 iDqS427S0100000_22 = iDqS427S0100000_2;
        int i30 = (i15 & 1) != 0 ? 0 : i;
        i19 = (i15 & 2) != 0 ? 0 : i19;
        i18 = (i15 & 16) != 0 ? 0 : i18;
        i17 = (i15 & 32) != 0 ? 0 : i17;
        i24 = (i15 & 64) != 0 ? 0 : i24;
        i23 = (i15 & 256) != 0 ? 0 : i23;
        i25 = (i15 & 512) != 0 ? 0 : i25;
        i26 = (i15 & 1024) != 0 ? 0 : i26;
        if ((i15 & 2048) != 0) {
            i16 = 62;
        } else {
            i16 = 0;
        }
        i27 = (i15 & 4096) != 0 ? 0 : i27;
        i28 = (i15 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i28;
        i22 = (i15 & 16384) != 0 ? 0 : i22;
        i21 = (32768 & i15) != 0 ? 0 : i21;
        i20 = (65536 & i15) != 0 ? 0 : i20;
        i29 = (131072 & i15) != 0 ? 0 : i29;
        num2 = (262144 & i15) != 0 ? null : num2;
        childrenAlignInParent = (2097152 & i15) != 0 ? C53L.RIGHT : childrenAlignInParent;
        c1293755x2 = (4194304 & i15) != 0 ? null : c1293755x2;
        iDqS427S0100000_22 = (8388608 & i15) != 0 ? null : iDqS427S0100000_22;
        typeface2 = (33554432 & i15) != 0 ? null : typeface2;
        c78894Uxm2 = (134217728 & i15) != 0 ? null : c78894Uxm2;
        c53j2 = (i15 & 268435456) != 0 ? null : c53j2;
        o.LJIIIZ(childrenAlignInParent, "childrenAlignInParent");
        this.LIZ = i30;
        this.LIZIZ = i19;
        this.LIZJ = null;
        this.LIZLLL = 0;
        this.LJ = i18;
        this.LJFF = i17;
        this.LJI = i24;
        this.LJII = 0;
        this.LJIIIIZZ = i23;
        this.LJIIIZ = i25;
        this.LJIIJ = i26;
        this.LJIIJJI = i16;
        this.LJIIL = i27;
        this.LJIILIIL = i28;
        this.LJIILJJIL = i22;
        this.LJIILL = i21;
        this.LJIILLIIL = i20;
        this.LJIIZILJ = i29;
        this.LJIJ = num2;
        this.LJIJI = 0;
        this.LJIJJ = 0;
        this.LJIJJLI = childrenAlignInParent;
        this.LJIL = c1293755x2;
        this.LJJ = iDqS427S0100000_22;
        this.LJJI = null;
        this.LJJIFFI = typeface2;
        this.LJJII = false;
        this.LJJIII = c78894Uxm2;
        this.LJJIIJ = c53j2;
    }
}
