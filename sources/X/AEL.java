package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEL extends AER {
    public final String LJZI;
    public final int LJZL;
    public final String LL;
    public final AET LLD;
    public final boolean LLF;
    public final View.OnClickListener LLFF;
    public final C2068389v LLFFF;
    public final boolean LLFII;
    public final String LLFZ;
    public final boolean LLI;
    public final boolean LLIFFJFJJ;
    public final boolean LLII;
    public final boolean LLIIII;
    public final boolean LLIIIILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.LLD.hashCode() + C79062V1e.LJ(this.LL, ((this.LJZI.hashCode() * 31) + this.LJZL) * 31, 31)) * 31;
        boolean z = this.LLF;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode3 + i2) * 31;
        View.OnClickListener onClickListener = this.LLFF;
        int i4 = 0;
        if (onClickListener == null) {
            hashCode = 0;
        } else {
            hashCode = onClickListener.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        C2068389v c2068389v = this.LLFFF;
        if (c2068389v == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2068389v.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        boolean z2 = this.LLFII;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str = this.LLFZ;
        if (str != null) {
            i4 = str.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        boolean z3 = this.LLI;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z4 = this.LLIFFJFJJ;
        int i12 = z4;
        if (z4 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z5 = this.LLII;
        int i14 = z5;
        if (z5 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z6 = this.LLIIII;
        int i16 = z6;
        if (z6 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        if (!this.LLIIIILZ) {
            i = 0;
        }
        return i17 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonItem(text=");
        sb.append(this.LJZI);
        sb.append(", buttonVariant=");
        sb.append(this.LJZL);
        sb.append(", title=");
        sb.append(this.LL);
        sb.append(", cellVariant=");
        sb.append(this.LLD);
        sb.append(", visibility=");
        sb.append(this.LLF);
        sb.append(", onClickListener=");
        sb.append(this.LLFF);
        sb.append(", icon=");
        sb.append(this.LLFFF);
        sb.append(", divider=");
        sb.append(this.LLFII);
        sb.append(", subTitle=");
        sb.append(this.LLFZ);
        sb.append(", enable=");
        sb.append(this.LLI);
        sb.append(", loading=");
        sb.append(this.LLIFFJFJJ);
        sb.append(", blockBegin=");
        sb.append(this.LLII);
        sb.append(", blockEnd=");
        sb.append(this.LLIIII);
        sb.append(", fullLineClickable=");
        return C08880Wm.LIZJ(sb, this.LLIIIILZ, ')');
    }

    @Override // X.AER, X.AEC
    public final boolean LIZIZ() {
        return this.LLF;
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
        return this.LLFII;
    }

    @Override // X.AER
    public final boolean LJIIIIZZ() {
        return this.LLI;
    }

    @Override // X.AER
    public final C2068389v LJIIIZ() {
        return this.LLFFF;
    }

    @Override // X.AER
    public final boolean LJIIJ() {
        return this.LLIFFJFJJ;
    }

    @Override // X.AER
    public final String LJIIJJI() {
        return this.LLFZ;
    }

    @Override // X.AER
    public final String LJIILIIL() {
        return this.LL;
    }

    @Override // X.AER
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static AEL LJIILJJIL(AEL ael, String str, boolean z, View.OnClickListener onClickListener, boolean z2, boolean z3, boolean z4, int i) {
        String text;
        int i2;
        AET cellVariant;
        C2068389v c2068389v;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = z;
        String title = str;
        boolean z9 = z4;
        View.OnClickListener onClickListener2 = onClickListener;
        boolean z10 = z2;
        boolean z11 = z3;
        String str2 = null;
        if ((i & 1) != 0) {
            text = ael.LJZI;
        } else {
            text = null;
        }
        if ((i & 2) != 0) {
            i2 = ael.LJZL;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            title = ael.LL;
        }
        if ((i & 8) != 0) {
            cellVariant = ael.LLD;
        } else {
            cellVariant = null;
        }
        if ((i & 16) != 0) {
            z8 = ael.LLF;
        }
        if ((i & 32) != 0) {
            onClickListener2 = ael.LLFF;
        }
        if ((i & 64) != 0) {
            c2068389v = ael.LLFFF;
        } else {
            c2068389v = null;
        }
        if ((i & 128) != 0) {
            z5 = ael.LLFII;
        } else {
            z5 = false;
        }
        if ((i & 256) != 0) {
            str2 = ael.LLFZ;
        }
        if ((i & 512) != 0) {
            z6 = ael.LLI;
        } else {
            z6 = false;
        }
        if ((i & 1024) != 0) {
            z10 = ael.LLIFFJFJJ;
        }
        if ((i & 2048) != 0) {
            z11 = ael.LLII;
        }
        if ((i & 4096) != 0) {
            z9 = ael.LLIIII;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z7 = ael.LLIIIILZ;
        } else {
            z7 = false;
        }
        ael.getClass();
        o.LJIIIZ(text, "text");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        return new AEL(text, i2, title, cellVariant, z8, onClickListener2, c2068389v, z5, str2, z6, z10, z11, z9, z7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AEL(java.lang.String r16, int r17, java.lang.String r18, X.AET r19, android.view.View.OnClickListener r20, X.C2068389v r21, java.lang.String r22, boolean r23, int r24) {
        /*
            r15 = this;
            r4 = r19
            r7 = r21
            r2 = r17
            r1 = r24
            r6 = r20
            r14 = r23
            r0 = r1 & 2
            if (r0 == 0) goto L11
            r2 = 0
        L11:
            r0 = r1 & 8
            if (r0 == 0) goto L17
            X.AET r4 = X.AET.NORMAL
        L17:
            r0 = r1 & 16
            if (r0 == 0) goto L47
            r5 = 1
        L1c:
            r0 = r1 & 32
            r9 = 0
            if (r0 == 0) goto L22
            r6 = r9
        L22:
            r0 = r1 & 64
            if (r0 == 0) goto L27
            r7 = r9
        L27:
            r8 = 0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L44
        L2c:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L42
            r10 = 1
        L31:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L36
            r14 = 0
        L36:
            r3 = r18
            r0 = r15
            r1 = r16
            r11 = r8
            r12 = r8
            r13 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L42:
            r10 = 0
            goto L31
        L44:
            r9 = r22
            goto L2c
        L47:
            r5 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEL.<init>(java.lang.String, int, java.lang.String, X.AET, android.view.View$OnClickListener, X.89v, java.lang.String, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AEL(String str, int i, String str2, AET cellVariant, boolean z, View.OnClickListener onClickListener, C2068389v c2068389v, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(str2, cellVariant, c2068389v, z, z2, str3, z3, z4, onClickListener, null, null, false, false, 15872);
        o.LJIIIZ(cellVariant, "cellVariant");
        this.LJZI = str;
        this.LJZL = i;
        this.LL = str2;
        this.LLD = cellVariant;
        this.LLF = z;
        this.LLFF = onClickListener;
        this.LLFFF = c2068389v;
        this.LLFII = z2;
        this.LLFZ = str3;
        this.LLI = z3;
        this.LLIFFJFJJ = z4;
        this.LLII = z5;
        this.LLIIII = z6;
        this.LLIIIILZ = z7;
    }
}
