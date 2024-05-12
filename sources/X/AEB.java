package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEB extends AEC {
    public final CharSequence LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final Object LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final CharSequence LJLLI;
    public final CharSequence LJLLILLLL;
    public final Integer LJLLJ;
    public final Integer LJLLL;
    public final Integer LJLLLL;
    public final Integer LJLLLLLL;
    public final View.OnClickListener LJLZ;
    public final boolean LJZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AEB(java.lang.CharSequence r14) {
        /*
            r13 = this;
            r2 = 1
            java.lang.String r0 = "text"
            r1 = r14
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r3 = 0
            r6 = 0
            r12 = 16380(0x3ffc, float:2.2953E-41)
            r0 = r13
            r4 = r3
            r5 = r3
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEB.<init>(java.lang.CharSequence):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AEB(java.lang.CharSequence r14, android.view.View.OnClickListener r15) {
        /*
            r13 = this;
            r2 = 1
            r4 = 0
            r6 = 0
            java.lang.String r0 = "text"
            r1 = r14
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r12 = 8192(0x2000, float:1.148E-41)
            r11 = r15
            r0 = r13
            r3 = r2
            r5 = r4
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEB.<init>(java.lang.CharSequence, android.view.View$OnClickListener):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AEB(java.lang.CharSequence r14, boolean r15) {
        /*
            r13 = this;
            r3 = 0
            java.lang.String r0 = "text"
            r1 = r14
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r6 = 0
            r12 = 16376(0x3ff8, float:2.2948E-41)
            r2 = r15
            r0 = r13
            r4 = r3
            r5 = r3
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEB.<init>(java.lang.CharSequence, boolean):void");
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
        int hashCode8 = this.LJLJJL.hashCode() * 31;
        boolean z = this.LJLJJLL;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode8 + i2) * 31;
        boolean z2 = this.LJLJL;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        Object obj = this.LJLJLJ;
        int i6 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i7 = (i5 + hashCode) * 31;
        boolean z3 = this.LJLJLLL;
        int i8 = z3;
        if (z3 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z4 = this.LJLL;
        int i10 = z4;
        if (z4 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        CharSequence charSequence = this.LJLLI;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        CharSequence charSequence2 = this.LJLLILLLL;
        if (charSequence2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = charSequence2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num = this.LJLLJ;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num2 = this.LJLLL;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Integer num3 = this.LJLLLL;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Integer num4 = this.LJLLLLLL;
        if (num4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num4.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        View.OnClickListener onClickListener = this.LJLZ;
        if (onClickListener != null) {
            i6 = onClickListener.hashCode();
        }
        int i18 = (i17 + i6) * 31;
        if (!this.LJZ) {
            i = 0;
        }
        return i18 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DividerItem(text=");
        sb.append((Object) this.LJLJJL);
        sb.append(", divider=");
        sb.append(this.LJLJJLL);
        sb.append(", visibility=");
        sb.append(this.LJLJL);
        sb.append(", tag=");
        sb.append(this.LJLJLJ);
        sb.append(", blockEnd=");
        sb.append(this.LJLJLLL);
        sb.append(", blockBegin=");
        sb.append(this.LJLL);
        sb.append(", title=");
        sb.append((Object) this.LJLLI);
        sb.append(", sub_text=");
        sb.append((Object) this.LJLLILLLL);
        sb.append(", text_font=");
        sb.append(this.LJLLJ);
        sb.append(", sub_text_font=");
        sb.append(this.LJLLL);
        sb.append(", paddingBottom=");
        sb.append(this.LJLLLL);
        sb.append(", backgroundColor=");
        sb.append(this.LJLLLLLL);
        sb.append(", infoCircleIconClickListener=");
        sb.append(this.LJLZ);
        sb.append(", textContainerVisibility=");
        return C08880Wm.LIZJ(sb, this.LJZ, ')');
    }

    @Override // X.AEC
    public final Object LIZ() {
        return this.LJLJLJ;
    }

    @Override // X.AEC
    public final boolean LIZIZ() {
        return this.LJLJL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AEB)) {
            return false;
        }
        AEB aeb = (AEB) obj;
        if (o.LJ(this.LJLJJL, aeb.LJLJJL) && this.LJLJJLL == aeb.LJLJJLL && this.LJLJL == aeb.LJLJL && o.LJ(this.LJLJLJ, aeb.LJLJLJ) && this.LJLJLLL == aeb.LJLJLLL && this.LJLL == aeb.LJLL && o.LJ(this.LJLLI, aeb.LJLLI) && o.LJ(this.LJLLILLLL, aeb.LJLLILLLL) && o.LJ(this.LJLLJ, aeb.LJLLJ) && o.LJ(this.LJLLL, aeb.LJLLL) && o.LJ(this.LJLLLL, aeb.LJLLLL) && o.LJ(this.LJLLLLLL, aeb.LJLLLLLL) && o.LJ(this.LJLZ, aeb.LJLZ) && this.LJZ == aeb.LJZ) {
            return true;
        }
        return false;
    }

    public static AEB LIZJ(AEB aeb, CharSequence charSequence, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        Object obj;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        boolean z5;
        boolean z6 = z3;
        boolean z7 = z2;
        CharSequence text = charSequence;
        boolean z8 = z;
        if ((i & 1) != 0) {
            text = aeb.LJLJJL;
        }
        if ((i & 2) != 0) {
            z4 = aeb.LJLJJLL;
        } else {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z8 = aeb.LJLJL;
        }
        View.OnClickListener onClickListener = null;
        if ((i & 8) != 0) {
            obj = aeb.LJLJLJ;
        } else {
            obj = null;
        }
        if ((i & 16) != 0) {
            z7 = aeb.LJLJLLL;
        }
        if ((i & 32) != 0) {
            z6 = aeb.LJLL;
        }
        if ((i & 64) != 0) {
            charSequence2 = aeb.LJLLI;
        } else {
            charSequence2 = null;
        }
        if ((i & 128) != 0) {
            charSequence3 = aeb.LJLLILLLL;
        } else {
            charSequence3 = null;
        }
        if ((i & 256) != 0) {
            num = aeb.LJLLJ;
        } else {
            num = null;
        }
        if ((i & 512) != 0) {
            num2 = aeb.LJLLL;
        } else {
            num2 = null;
        }
        if ((i & 1024) != 0) {
            num3 = aeb.LJLLLL;
        } else {
            num3 = null;
        }
        if ((i & 2048) != 0) {
            num4 = aeb.LJLLLLLL;
        } else {
            num4 = null;
        }
        if ((i & 4096) != 0) {
            onClickListener = aeb.LJLZ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z5 = aeb.LJZ;
        } else {
            z5 = false;
        }
        aeb.getClass();
        o.LJIIIZ(text, "text");
        return new AEB(text, z4, z8, obj, z7, z6, charSequence2, charSequence3, num, num2, num3, num4, onClickListener, z5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AEB(java.lang.CharSequence r16, boolean r17, boolean r18, boolean r19, boolean r20, java.lang.CharSequence r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, android.view.View.OnClickListener r26, int r27) {
        /*
            r15 = this;
            r1 = r27
            r13 = r26
            r12 = r25
            r11 = r24
            r10 = r23
            r3 = r18
            r2 = r17
            r5 = r19
            r6 = r20
            r8 = r21
            r9 = r22
            r0 = r1 & 2
            if (r0 == 0) goto L1b
            r2 = 0
        L1b:
            r0 = r1 & 4
            if (r0 == 0) goto L20
            r3 = 1
        L20:
            r4 = 0
            r0 = r1 & 16
            if (r0 == 0) goto L26
            r5 = 0
        L26:
            r0 = r1 & 32
            if (r0 == 0) goto L2b
            r6 = 0
        L2b:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L30
            r8 = r4
        L30:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L35
            r9 = r4
        L35:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3a
            r10 = r4
        L3a:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L3f
            r11 = r4
        L3f:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L44
            r12 = r4
        L44:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L49
            r13 = r4
        L49:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L56
            r14 = 1
        L4e:
            r0 = r15
            r1 = r16
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L56:
            r14 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEB.<init>(java.lang.CharSequence, boolean, boolean, boolean, boolean, java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, android.view.View$OnClickListener, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AEB(CharSequence text, boolean z, boolean z2, Object obj, boolean z3, boolean z4, CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, Integer num3, Integer num4, View.OnClickListener onClickListener, boolean z5) {
        super(z2, obj, 8);
        o.LJIIIZ(text, "text");
        this.LJLJJL = text;
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJLJ = obj;
        this.LJLJLLL = z3;
        this.LJLL = z4;
        this.LJLLI = charSequence;
        this.LJLLILLLL = charSequence2;
        this.LJLLJ = num;
        this.LJLLL = num2;
        this.LJLLLL = num3;
        this.LJLLLLLL = num4;
        this.LJLZ = onClickListener;
        this.LJZ = z5;
    }
}
