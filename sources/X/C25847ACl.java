package X;

import android.view.View;
import android.widget.CompoundButton;
import kotlin.jvm.internal.o;

/* renamed from: X.ACl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25847ACl extends AER {
    public final boolean LJZI;
    public final CompoundButton.OnCheckedChangeListener LJZL;
    public final String LL;
    public final AET LLD;
    public final C2068389v LLF;
    public final boolean LLFF;
    public final boolean LLFFF;
    public final String LLFII;
    public final boolean LLFZ;
    public final boolean LLI;
    public final View.OnClickListener LLIFFJFJJ;
    public final boolean LLII;
    public final boolean LLIIII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        boolean z = this.LJZI;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LJZL;
        int i3 = 0;
        if (onCheckedChangeListener == null) {
            hashCode = 0;
        } else {
            hashCode = onCheckedChangeListener.hashCode();
        }
        int hashCode4 = (this.LLD.hashCode() + C79062V1e.LJ(this.LL, (i2 + hashCode) * 31, 31)) * 31;
        C2068389v c2068389v = this.LLF;
        if (c2068389v == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2068389v.hashCode();
        }
        int i4 = (hashCode4 + hashCode2) * 31;
        ?? r02 = this.LLFF;
        int i5 = r02;
        if (r02 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        ?? r03 = this.LLFFF;
        int i7 = r03;
        if (r03 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str = this.LLFII;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i9 = (i8 + hashCode3) * 31;
        ?? r04 = this.LLFZ;
        int i10 = r04;
        if (r04 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r05 = this.LLI;
        int i12 = r05;
        if (r05 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        View.OnClickListener onClickListener = this.LLIFFJFJJ;
        if (onClickListener != null) {
            i3 = onClickListener.hashCode();
        }
        int i14 = (i13 + i3) * 31;
        ?? r06 = this.LLII;
        int i15 = r06;
        if (r06 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        if (!this.LLIIII) {
            i = 0;
        }
        return i16 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioItem(isChecked=");
        sb.append(this.LJZI);
        sb.append(", onCheckedChangedListener=");
        sb.append(this.LJZL);
        sb.append(", title=");
        sb.append(this.LL);
        sb.append(", cellVariant=");
        sb.append(this.LLD);
        sb.append(", icon=");
        sb.append(this.LLF);
        sb.append(", divider=");
        sb.append(this.LLFF);
        sb.append(", visibility=");
        sb.append(this.LLFFF);
        sb.append(", subTitle=");
        sb.append(this.LLFII);
        sb.append(", enable=");
        sb.append(this.LLFZ);
        sb.append(", loading=");
        sb.append(this.LLI);
        sb.append(", onClickListener=");
        sb.append(this.LLIFFJFJJ);
        sb.append(", blockBegin=");
        sb.append(this.LLII);
        sb.append(", blockEnd=");
        return C08880Wm.LIZJ(sb, this.LLIIII, ')');
    }

    @Override // X.AER, X.AEC
    public final boolean LIZIZ() {
        return this.LLFFF;
    }

    @Override // X.AER
    public final boolean LIZJ() {
        return this.LLII;
    }

    @Override // X.AER
    public final boolean LJ() {
        return this.LLIIII;
    }

    @Override // X.AER
    public final AET LJFF() {
        return this.LLD;
    }

    @Override // X.AER
    public final boolean LJII() {
        return this.LLFF;
    }

    @Override // X.AER
    public final boolean LJIIIIZZ() {
        return this.LLFZ;
    }

    @Override // X.AER
    public final C2068389v LJIIIZ() {
        return this.LLF;
    }

    @Override // X.AER
    public final boolean LJIIJ() {
        return this.LLI;
    }

    @Override // X.AER
    public final String LJIIJJI() {
        return this.LLFII;
    }

    @Override // X.AER
    public final String LJIILIIL() {
        return this.LL;
    }

    @Override // X.AER
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static C25847ACl LJIILJJIL(C25847ACl c25847ACl, boolean z, boolean z2, boolean z3, int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        String title;
        AET cellVariant;
        C2068389v c2068389v;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        boolean z7;
        boolean z8 = z3;
        boolean z9 = z;
        boolean z10 = z2;
        if ((i & 1) != 0) {
            z9 = c25847ACl.LJZI;
        }
        View.OnClickListener onClickListener = null;
        if ((i & 2) != 0) {
            onCheckedChangeListener = c25847ACl.LJZL;
        } else {
            onCheckedChangeListener = null;
        }
        if ((i & 4) != 0) {
            title = c25847ACl.LL;
        } else {
            title = null;
        }
        if ((i & 8) != 0) {
            cellVariant = c25847ACl.LLD;
        } else {
            cellVariant = null;
        }
        if ((i & 16) != 0) {
            c2068389v = c25847ACl.LLF;
        } else {
            c2068389v = null;
        }
        if ((i & 32) != 0) {
            z4 = c25847ACl.LLFF;
        } else {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z5 = c25847ACl.LLFFF;
        } else {
            z5 = false;
        }
        if ((i & 128) != 0) {
            str = c25847ACl.LLFII;
        } else {
            str = null;
        }
        if ((i & 256) != 0) {
            z6 = c25847ACl.LLFZ;
        } else {
            z6 = false;
        }
        if ((i & 512) != 0) {
            z7 = c25847ACl.LLI;
        } else {
            z7 = false;
        }
        if ((i & 1024) != 0) {
            onClickListener = c25847ACl.LLIFFJFJJ;
        }
        if ((i & 2048) != 0) {
            z10 = c25847ACl.LLII;
        }
        if ((i & 4096) != 0) {
            z8 = c25847ACl.LLIIII;
        }
        c25847ACl.getClass();
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        return new C25847ACl(z9, onCheckedChangeListener, title, cellVariant, c2068389v, z4, z5, str, z6, z7, onClickListener, z10, z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C25847ACl(boolean r15, java.lang.String r16, X.C2068389v r17, java.lang.String r18, android.view.View.OnClickListener r19, int r20) {
        /*
            r14 = this;
            r8 = r18
            r5 = r17
            r11 = r19
            r2 = 0
            r1 = r20
            r0 = r1 & 8
            if (r0 == 0) goto L38
            X.AET r4 = X.AET.NORMAL
        Lf:
            r0 = r1 & 16
            if (r0 == 0) goto L14
            r5 = r2
        L14:
            r6 = 0
            r0 = r1 & 64
            if (r0 == 0) goto L36
            r7 = 1
        L1a:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1f
            r8 = r2
        L1f:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L34
            r9 = 1
        L24:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L29
            r11 = r2
        L29:
            r0 = r14
            r1 = r15
            r3 = r16
            r10 = r6
            r12 = r6
            r13 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L34:
            r9 = 0
            goto L24
        L36:
            r7 = 0
            goto L1a
        L38:
            r4 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25847ACl.<init>(boolean, java.lang.String, X.89v, java.lang.String, android.view.View$OnClickListener, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25847ACl(boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, String str, AET cellVariant, C2068389v c2068389v, boolean z2, boolean z3, String str2, boolean z4, boolean z5, View.OnClickListener onClickListener, boolean z6, boolean z7) {
        super(str, cellVariant, c2068389v, z3, z2, str2, z4, z5, onClickListener, null, null, z6, z7, 9728);
        o.LJIIIZ(cellVariant, "cellVariant");
        this.LJZI = z;
        this.LJZL = onCheckedChangeListener;
        this.LL = str;
        this.LLD = cellVariant;
        this.LLF = c2068389v;
        this.LLFF = z2;
        this.LLFFF = z3;
        this.LLFII = str2;
        this.LLFZ = z4;
        this.LLI = z5;
        this.LLIFFJFJJ = onClickListener;
        this.LLII = z6;
        this.LLIIII = z7;
    }
}
