package X;

import android.view.View;
import android.widget.CompoundButton;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.ACk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25846ACk extends AER {
    public final boolean LJZI;
    public final String LJZL;
    public final View.OnClickListener LL;
    public final boolean LLD;
    public final boolean LLF;
    public final View.OnClickListener LLFF;
    public final CompoundButton.OnCheckedChangeListener LLFFF;
    public final Object LLFII;
    public final View.OnClickListener LLFZ;
    public final AET LLI;
    public final C2068389v LLIFFJFJJ;
    public final boolean LLII;
    public final String LLIIII;
    public final boolean LLIIIILZ;
    public final boolean LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        boolean z = this.LJZI;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJZL, r0 * 31, 31);
        View.OnClickListener onClickListener = this.LL;
        int i2 = 0;
        if (onClickListener == null) {
            hashCode = 0;
        } else {
            hashCode = onClickListener.hashCode();
        }
        int i3 = (LJ + hashCode) * 31;
        ?? r02 = this.LLD;
        int i4 = r02;
        if (r02 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r03 = this.LLF;
        int i6 = r03;
        if (r03 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        View.OnClickListener onClickListener2 = this.LLFF;
        if (onClickListener2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = onClickListener2.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LLFFF;
        if (onCheckedChangeListener == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = onCheckedChangeListener.hashCode();
        }
        int i9 = (i8 + hashCode3) * 31;
        Object obj = this.LLFII;
        if (obj == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj.hashCode();
        }
        int i10 = (i9 + hashCode4) * 31;
        View.OnClickListener onClickListener3 = this.LLFZ;
        if (onClickListener3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = onClickListener3.hashCode();
        }
        int hashCode7 = (this.LLI.hashCode() + ((i10 + hashCode5) * 31)) * 31;
        C2068389v c2068389v = this.LLIFFJFJJ;
        if (c2068389v == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c2068389v.hashCode();
        }
        int i11 = (hashCode7 + hashCode6) * 31;
        ?? r04 = this.LLII;
        int i12 = r04;
        if (r04 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        String str = this.LLIIII;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i14 = (i13 + i2) * 31;
        ?? r05 = this.LLIIIILZ;
        int i15 = r05;
        if (r05 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        ?? r06 = this.LLIIIJ;
        int i17 = r06;
        if (r06 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        ?? r07 = this.LLIIIL;
        int i19 = r07;
        if (r07 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        if (!this.LLIIIZ) {
            i = 0;
        }
        return i20 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleIconItem(isChecked=");
        sb.append(this.LJZI);
        sb.append(", title=");
        sb.append(this.LJZL);
        sb.append(", onClickListener=");
        sb.append(this.LL);
        sb.append(", visibility=");
        sb.append(this.LLD);
        sb.append(", showSubtitleIcon=");
        sb.append(this.LLF);
        sb.append(", subtitleOnClickListener=");
        sb.append(this.LLFF);
        sb.append(", onCheckedChangedListener=");
        sb.append(this.LLFFF);
        sb.append(", tag=");
        sb.append(this.LLFII);
        sb.append(", disableClickListener=");
        sb.append(this.LLFZ);
        sb.append(", cellVariant=");
        sb.append(this.LLI);
        sb.append(", icon=");
        sb.append(this.LLIFFJFJJ);
        sb.append(", divider=");
        sb.append(this.LLII);
        sb.append(", subTitle=");
        sb.append(this.LLIIII);
        sb.append(", enable=");
        sb.append(this.LLIIIILZ);
        sb.append(", loading=");
        sb.append(this.LLIIIJ);
        sb.append(", blockBegin=");
        sb.append(this.LLIIIL);
        sb.append(", blockEnd=");
        return C08880Wm.LIZJ(sb, this.LLIIIZ, ')');
    }

    @Override // X.AER, X.AEC
    public final Object LIZ() {
        return this.LLFII;
    }

    @Override // X.AER, X.AEC
    public final boolean LIZIZ() {
        return this.LLD;
    }

    @Override // X.AER
    public final boolean LIZJ() {
        return this.LLIIIL;
    }

    @Override // X.AER
    public final boolean LJ() {
        return this.LLIIIZ;
    }

    @Override // X.AER
    public final AET LJFF() {
        return this.LLI;
    }

    @Override // X.AER
    public final View.OnClickListener LJI() {
        return this.LLFZ;
    }

    @Override // X.AER
    public final boolean LJII() {
        return this.LLII;
    }

    @Override // X.AER
    public final boolean LJIIIIZZ() {
        return this.LLIIIILZ;
    }

    @Override // X.AER
    public final C2068389v LJIIIZ() {
        return this.LLIFFJFJJ;
    }

    @Override // X.AER
    public final boolean LJIIJ() {
        return this.LLIIIJ;
    }

    @Override // X.AER
    public final String LJIIJJI() {
        return this.LLIIII;
    }

    @Override // X.AER
    public final String LJIILIIL() {
        return this.LJZL;
    }

    @Override // X.AER
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.View$OnClickListener] */
    public static C25846ACk LJIILJJIL(C25846ACk c25846ACk, boolean z, ViewOnClickListenerC25823ABn viewOnClickListenerC25823ABn, boolean z2, boolean z3, ViewOnClickListenerC248359ot viewOnClickListenerC248359ot, String str, boolean z4, boolean z5, int i) {
        String title;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        Object obj;
        View.OnClickListener onClickListener;
        AET cellVariant;
        boolean z6;
        boolean z7;
        boolean z8;
        ViewOnClickListenerC25823ABn viewOnClickListenerC25823ABn2 = viewOnClickListenerC25823ABn;
        boolean z9 = z5;
        boolean z10 = z;
        boolean z11 = z2;
        boolean z12 = z4;
        boolean z13 = z3;
        View.OnClickListener onClickListener2 = viewOnClickListenerC248359ot;
        String str2 = str;
        if ((i & 1) != 0) {
            z10 = c25846ACk.LJZI;
        }
        C2068389v c2068389v = null;
        if ((i & 2) != 0) {
            title = c25846ACk.LJZL;
        } else {
            title = null;
        }
        if ((i & 4) != 0) {
            viewOnClickListenerC25823ABn2 = c25846ACk.LL;
        }
        if ((i & 8) != 0) {
            z11 = c25846ACk.LLD;
        }
        if ((i & 16) != 0) {
            z13 = c25846ACk.LLF;
        }
        if ((i & 32) != 0) {
            onClickListener2 = c25846ACk.LLFF;
        }
        if ((i & 64) != 0) {
            onCheckedChangeListener = c25846ACk.LLFFF;
        } else {
            onCheckedChangeListener = null;
        }
        if ((i & 128) != 0) {
            obj = c25846ACk.LLFII;
        } else {
            obj = null;
        }
        if ((i & 256) != 0) {
            onClickListener = c25846ACk.LLFZ;
        } else {
            onClickListener = null;
        }
        if ((i & 512) != 0) {
            cellVariant = c25846ACk.LLI;
        } else {
            cellVariant = null;
        }
        if ((i & 1024) != 0) {
            c2068389v = c25846ACk.LLIFFJFJJ;
        }
        if ((i & 2048) != 0) {
            z6 = c25846ACk.LLII;
        } else {
            z6 = false;
        }
        if ((i & 4096) != 0) {
            str2 = c25846ACk.LLIIII;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z7 = c25846ACk.LLIIIILZ;
        } else {
            z7 = false;
        }
        if ((i & 16384) != 0) {
            z8 = c25846ACk.LLIIIJ;
        } else {
            z8 = false;
        }
        if ((32768 & i) != 0) {
            z12 = c25846ACk.LLIIIL;
        }
        if ((i & 65536) != 0) {
            z9 = c25846ACk.LLIIIZ;
        }
        c25846ACk.getClass();
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        return new C25846ACk(z10, title, viewOnClickListenerC25823ABn2, z11, z13, onClickListener2, onCheckedChangeListener, obj, onClickListener, cellVariant, c2068389v, z6, str2, z7, z8, z12, z9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25846ACk(boolean z, String str, View.OnClickListener onClickListener, boolean z2, boolean z3, View.OnClickListener onClickListener2, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Object obj, View.OnClickListener onClickListener3, AET cellVariant, C2068389v c2068389v, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(str, cellVariant, c2068389v, z2, z4, str2, z5, z6, onClickListener, onClickListener3, obj, z7, z8, FileUtils.BUFFER_SIZE);
        o.LJIIIZ(cellVariant, "cellVariant");
        this.LJZI = z;
        this.LJZL = str;
        this.LL = onClickListener;
        this.LLD = z2;
        this.LLF = z3;
        this.LLFF = onClickListener2;
        this.LLFFF = onCheckedChangeListener;
        this.LLFII = obj;
        this.LLFZ = onClickListener3;
        this.LLI = cellVariant;
        this.LLIFFJFJJ = c2068389v;
        this.LLII = z4;
        this.LLIIII = str2;
        this.LLIIIILZ = z5;
        this.LLIIIJ = z6;
        this.LLIIIL = z7;
        this.LLIIIZ = z8;
    }
}
