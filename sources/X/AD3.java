package X;

import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AD3 extends AER {
    public final String LJZI;
    public final boolean LJZL;
    public final String LL;
    public final C2068389v LLD;
    public final String LLF;
    public final AET LLFF;
    public final C2068389v LLFFF;
    public final boolean LLFII;
    public final boolean LLFZ;
    public final String LLI;
    public final boolean LLIFFJFJJ;
    public final boolean LLII;
    public final View.OnClickListener LLIIII;
    public final View.OnClickListener LLIIIILZ;
    public final Object LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.LJZI.hashCode() * 31;
        boolean z = this.LJZL;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode7 + i2) * 31;
        String str = this.LL;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        C2068389v c2068389v = this.LLD;
        if (c2068389v == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2068389v.hashCode();
        }
        int hashCode8 = (this.LLFF.hashCode() + C79062V1e.LJ(this.LLF, (i5 + hashCode2) * 31, 31)) * 31;
        C2068389v c2068389v2 = this.LLFFF;
        if (c2068389v2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2068389v2.hashCode();
        }
        int i6 = (hashCode8 + hashCode3) * 31;
        boolean z2 = this.LLFII;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z3 = this.LLFZ;
        int i9 = z3;
        if (z3 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        String str2 = this.LLI;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
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
        View.OnClickListener onClickListener = this.LLIIII;
        if (onClickListener == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = onClickListener.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        View.OnClickListener onClickListener2 = this.LLIIIILZ;
        if (onClickListener2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = onClickListener2.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        Object obj = this.LLIIIJ;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        int i18 = (i17 + i4) * 31;
        boolean z6 = this.LLIIIL;
        int i19 = z6;
        if (z6 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        if (!this.LLIIIZ) {
            i = 0;
        }
        return i20 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelItem(text=");
        sb.append(this.LJZI);
        sb.append(", yellowDot=");
        sb.append(this.LJZL);
        sb.append(", imageUrl=");
        sb.append(this.LL);
        sb.append(", colorIcon=");
        sb.append(this.LLD);
        sb.append(", title=");
        sb.append(this.LLF);
        sb.append(", cellVariant=");
        sb.append(this.LLFF);
        sb.append(", icon=");
        sb.append(this.LLFFF);
        sb.append(", divider=");
        sb.append(this.LLFII);
        sb.append(", visibility=");
        sb.append(this.LLFZ);
        sb.append(", subTitle=");
        sb.append(this.LLI);
        sb.append(", enable=");
        sb.append(this.LLIFFJFJJ);
        sb.append(", loading=");
        sb.append(this.LLII);
        sb.append(", onClickListener=");
        sb.append(this.LLIIII);
        sb.append(", disableClickListener=");
        sb.append(this.LLIIIILZ);
        sb.append(", tag=");
        sb.append(this.LLIIIJ);
        sb.append(", blockBegin=");
        sb.append(this.LLIIIL);
        sb.append(", blockEnd=");
        return C08880Wm.LIZJ(sb, this.LLIIIZ, ')');
    }

    @Override // X.AER, X.AEC
    public final Object LIZ() {
        return this.LLIIIJ;
    }

    @Override // X.AER, X.AEC
    public final boolean LIZIZ() {
        return this.LLFZ;
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
        return this.LLFF;
    }

    @Override // X.AER
    public final View.OnClickListener LJI() {
        return this.LLIIIILZ;
    }

    @Override // X.AER
    public final boolean LJII() {
        return this.LLFII;
    }

    @Override // X.AER
    public final boolean LJIIIIZZ() {
        return this.LLIFFJFJJ;
    }

    @Override // X.AER
    public final C2068389v LJIIIZ() {
        return this.LLFFF;
    }

    @Override // X.AER
    public final boolean LJIIJ() {
        return this.LLII;
    }

    @Override // X.AER
    public final String LJIIJJI() {
        return this.LLI;
    }

    @Override // X.AER
    public final String LJIILIIL() {
        return this.LLF;
    }

    @Override // X.AER
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AD3(java.lang.String r20, java.lang.String r21, X.C2068389v r22, java.lang.String r23, android.view.View.OnClickListener r24, int r25) {
        /*
            r19 = this;
            r8 = r22
            r2 = r20
            r11 = r23
            r14 = r24
            r1 = r25
            r0 = r1 & 1
            if (r0 == 0) goto L10
            java.lang.String r2 = ""
        L10:
            r3 = 0
            r4 = 0
            r0 = r1 & 32
            if (r0 == 0) goto L47
            X.AET r7 = X.AET.NORMAL
        L18:
            r0 = r1 & 64
            if (r0 == 0) goto L1d
            r8 = r4
        L1d:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L45
            r10 = 1
        L22:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L27
            r11 = r4
        L27:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L43
            r12 = 1
        L2c:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L31
            r14 = r4
        L31:
            r6 = r21
            r1 = r19
            r5 = r4
            r9 = r3
            r13 = r3
            r15 = r4
            r16 = r4
            r17 = r3
            r18 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L43:
            r12 = 0
            goto L2c
        L45:
            r10 = 0
            goto L22
        L47:
            r7 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AD3.<init>(java.lang.String, java.lang.String, X.89v, java.lang.String, android.view.View$OnClickListener, int):void");
    }

    public static AD3 LJIILJJIL(AD3 ad3, String str, boolean z, ACListenerS24S0100000_4 aCListenerS24S0100000_4, boolean z2, boolean z3, int i) {
        boolean z4;
        String str2;
        C2068389v c2068389v;
        String title;
        AET cellVariant;
        C2068389v c2068389v2;
        boolean z5;
        String str3;
        boolean z6;
        boolean z7;
        View.OnClickListener onClickListener;
        String text = str;
        boolean z8 = z;
        View.OnClickListener onClickListener2 = aCListenerS24S0100000_4;
        boolean z9 = z3;
        boolean z10 = z2;
        if ((i & 1) != 0) {
            text = ad3.LJZI;
        }
        if ((i & 2) != 0) {
            z4 = ad3.LJZL;
        } else {
            z4 = false;
        }
        Object obj = null;
        if ((i & 4) != 0) {
            str2 = ad3.LL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            c2068389v = ad3.LLD;
        } else {
            c2068389v = null;
        }
        if ((i & 16) != 0) {
            title = ad3.LLF;
        } else {
            title = null;
        }
        if ((i & 32) != 0) {
            cellVariant = ad3.LLFF;
        } else {
            cellVariant = null;
        }
        if ((i & 64) != 0) {
            c2068389v2 = ad3.LLFFF;
        } else {
            c2068389v2 = null;
        }
        if ((i & 128) != 0) {
            z5 = ad3.LLFII;
        } else {
            z5 = false;
        }
        if ((i & 256) != 0) {
            z8 = ad3.LLFZ;
        }
        if ((i & 512) != 0) {
            str3 = ad3.LLI;
        } else {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            z6 = ad3.LLIFFJFJJ;
        } else {
            z6 = false;
        }
        if ((i & 2048) != 0) {
            z7 = ad3.LLII;
        } else {
            z7 = false;
        }
        if ((i & 4096) != 0) {
            onClickListener2 = ad3.LLIIII;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            onClickListener = ad3.LLIIIILZ;
        } else {
            onClickListener = null;
        }
        if ((i & 16384) != 0) {
            obj = ad3.LLIIIJ;
        }
        if ((32768 & i) != 0) {
            z10 = ad3.LLIIIL;
        }
        if ((i & 65536) != 0) {
            z9 = ad3.LLIIIZ;
        }
        ad3.getClass();
        o.LJIIIZ(text, "text");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        return new AD3(text, z4, str2, c2068389v, title, cellVariant, c2068389v2, z5, z8, str3, z6, z7, onClickListener2, onClickListener, obj, z10, z9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AD3(String text, boolean z, String str, C2068389v c2068389v, String str2, AET cellVariant, C2068389v c2068389v2, boolean z2, boolean z3, String str3, boolean z4, boolean z5, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Object obj, boolean z6, boolean z7) {
        super(str2, cellVariant, c2068389v2, z3, z2, str3, z4, z5, onClickListener, onClickListener2, obj, z6, z7, FileUtils.BUFFER_SIZE);
        o.LJIIIZ(text, "text");
        o.LJIIIZ(cellVariant, "cellVariant");
        this.LJZI = text;
        this.LJZL = z;
        this.LL = str;
        this.LLD = c2068389v;
        this.LLF = str2;
        this.LLFF = cellVariant;
        this.LLFFF = c2068389v2;
        this.LLFII = z2;
        this.LLFZ = z3;
        this.LLI = str3;
        this.LLIFFJFJJ = z4;
        this.LLII = z5;
        this.LLIIII = onClickListener;
        this.LLIIIILZ = onClickListener2;
        this.LLIIIJ = obj;
        this.LLIIIL = z6;
        this.LLIIIZ = z7;
    }
}
