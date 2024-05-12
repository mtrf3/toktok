package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEP extends AER {
    public final String LJZI;
    public final C2068389v LJZL;
    public final View.OnClickListener LL;
    public final Object LLD;
    public final boolean LLF;
    public final View LLFF;
    public final String LLFFF;
    public final boolean LLFII;
    public final boolean LLFZ;
    public final String LLI;
    public final java.util.Map<String, String> LLIFFJFJJ;
    public final String LLII;
    public final String LLIIII;
    public final Drawable LLIIIILZ;
    public final AET LLIIIJ;
    public final boolean LLIIIL;
    public final String LLIIIZ;
    public final boolean LLIIJI;
    public final boolean LLIIJLIL;
    public final View.OnClickListener LLIIL;
    public final boolean LLIILII;
    public final boolean LLIILZL;
    public final String LLIIZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AEP(String title, C2068389v c2068389v, View.OnClickListener onClickListener, Object obj) {
        this(title, c2068389v, onClickListener, obj, false, 8388592);
        o.LJIIIZ(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AEP(String title, C2068389v c2068389v, View.OnClickListener onClickListener, Object obj, boolean z) {
        this(title, c2068389v, onClickListener, obj, z, 8388576);
        o.LJIIIZ(title, "title");
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
        int hashCode13 = this.LJZI.hashCode() * 31;
        C2068389v c2068389v = this.LJZL;
        int i = 0;
        if (c2068389v == null) {
            hashCode = 0;
        } else {
            hashCode = c2068389v.hashCode();
        }
        int i2 = (hashCode13 + hashCode) * 31;
        View.OnClickListener onClickListener = this.LL;
        if (onClickListener == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = onClickListener.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj = this.LLD;
        if (obj == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LLF;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        View view = this.LLFF;
        if (view == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = view.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        String str = this.LLFFF;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        boolean z2 = this.LLFII;
        int i10 = z2;
        if (z2 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z3 = this.LLFZ;
        int i12 = z3;
        if (z3 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        String str2 = this.LLI;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        java.util.Map<String, String> map = this.LLIFFJFJJ;
        if (map == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = map.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str3 = this.LLII;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str4 = this.LLIIII;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Drawable drawable = this.LLIIIILZ;
        if (drawable == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = drawable.hashCode();
        }
        int hashCode14 = (this.LLIIIJ.hashCode() + ((i17 + hashCode10) * 31)) * 31;
        boolean z4 = this.LLIIIL;
        int i18 = z4;
        if (z4 != 0) {
            i18 = 1;
        }
        int i19 = (hashCode14 + i18) * 31;
        String str5 = this.LLIIIZ;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        boolean z5 = this.LLIIJI;
        int i21 = z5;
        if (z5 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z6 = this.LLIIJLIL;
        int i23 = z6;
        if (z6 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        View.OnClickListener onClickListener2 = this.LLIIL;
        if (onClickListener2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = onClickListener2.hashCode();
        }
        int i25 = (i24 + hashCode12) * 31;
        boolean z7 = this.LLIILII;
        int i26 = z7;
        if (z7 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        if (!this.LLIILZL) {
            i5 = 0;
        }
        int i28 = (i27 + i5) * 31;
        String str6 = this.LLIIZ;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i28 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExposeItem(title=");
        sb.append(this.LJZI);
        sb.append(", icon=");
        sb.append(this.LJZL);
        sb.append(", onClickListener=");
        sb.append(this.LL);
        sb.append(", tag=");
        sb.append(this.LLD);
        sb.append(", visibility=");
        sb.append(this.LLF);
        sb.append(", customView=");
        sb.append(this.LLFF);
        sb.append(", label=");
        sb.append(this.LLFFF);
        sb.append(", showArrow=");
        sb.append(this.LLFII);
        sb.append(", showAlertBadge=");
        sb.append(this.LLFZ);
        sb.append(", eventName=");
        sb.append(this.LLI);
        sb.append(", eventMap=");
        sb.append(this.LLIFFJFJJ);
        sb.append(", enterFrom=");
        sb.append(this.LLII);
        sb.append(", actionType=");
        sb.append(this.LLIIII);
        sb.append(", background=");
        sb.append(this.LLIIIILZ);
        sb.append(", cellVariant=");
        sb.append(this.LLIIIJ);
        sb.append(", divider=");
        sb.append(this.LLIIIL);
        sb.append(", subTitle=");
        sb.append(this.LLIIIZ);
        sb.append(", enable=");
        sb.append(this.LLIIJI);
        sb.append(", loading=");
        sb.append(this.LLIIJLIL);
        sb.append(", disableClickListener=");
        sb.append(this.LLIIL);
        sb.append(", blockBegin=");
        sb.append(this.LLIILII);
        sb.append(", blockEnd=");
        sb.append(this.LLIILZL);
        sb.append(", iconUrl=");
        return C07670Rv.LIZIZ(sb, this.LLIIZ, ')');
    }

    @Override // X.AER, X.AEC
    public final Object LIZ() {
        return this.LLD;
    }

    @Override // X.AER, X.AEC
    public final boolean LIZIZ() {
        return this.LLF;
    }

    @Override // X.AER
    public final boolean LIZJ() {
        return this.LLIILII;
    }

    @Override // X.AER
    public final boolean LJ() {
        return this.LLIILZL;
    }

    @Override // X.AER
    public final AET LJFF() {
        return this.LLIIIJ;
    }

    @Override // X.AER
    public final View.OnClickListener LJI() {
        return this.LLIIL;
    }

    @Override // X.AER
    public final boolean LJII() {
        return this.LLIIIL;
    }

    @Override // X.AER
    public final boolean LJIIIIZZ() {
        return this.LLIIJI;
    }

    @Override // X.AER
    public final C2068389v LJIIIZ() {
        return this.LJZL;
    }

    @Override // X.AER
    public final boolean LJIIJ() {
        return this.LLIIJLIL;
    }

    @Override // X.AER
    public final String LJIIJJI() {
        return this.LLIIIZ;
    }

    @Override // X.AER
    public final String LJIILIIL() {
        return this.LJZI;
    }

    @Override // X.AER
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AEP)) {
            return false;
        }
        AEP aep = (AEP) obj;
        if (o.LJ(this.LJZI, aep.LJZI) && o.LJ(this.LJZL, aep.LJZL) && o.LJ(this.LL, aep.LL) && o.LJ(this.LLD, aep.LLD) && this.LLF == aep.LLF && o.LJ(this.LLFF, aep.LLFF) && o.LJ(this.LLFFF, aep.LLFFF) && this.LLFII == aep.LLFII && this.LLFZ == aep.LLFZ && o.LJ(this.LLI, aep.LLI) && o.LJ(this.LLIFFJFJJ, aep.LLIFFJFJJ) && o.LJ(this.LLII, aep.LLII) && o.LJ(this.LLIIII, aep.LLIIII) && o.LJ(this.LLIIIILZ, aep.LLIIIILZ) && this.LLIIIJ == aep.LLIIIJ && this.LLIIIL == aep.LLIIIL && o.LJ(this.LLIIIZ, aep.LLIIIZ) && this.LLIIJI == aep.LLIIJI && this.LLIIJLIL == aep.LLIIJLIL && o.LJ(this.LLIIL, aep.LLIIL) && this.LLIILII == aep.LLIILII && this.LLIILZL == aep.LLIILZL && o.LJ(this.LLIIZ, aep.LLIIZ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AEP(java.lang.String r25, X.C2068389v r26, android.view.View.OnClickListener r27, java.lang.Object r28, boolean r29, int r30) {
        /*
            r24 = this;
            r3 = r27
            r2 = r26
            r4 = r28
            r5 = r29
            r1 = r30
            r0 = r1 & 2
            r15 = 0
            if (r0 == 0) goto L10
            r2 = r15
        L10:
            r0 = r1 & 4
            if (r0 == 0) goto L15
            r3 = r15
        L15:
            r0 = r1 & 8
            if (r0 == 0) goto L1a
            r4 = r15
        L1a:
            r0 = r1 & 16
            if (r0 == 0) goto L1f
            r5 = 1
        L1f:
            r6 = 0
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L52
            r8 = 1
        L25:
            r9 = 0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L2c
            X.AET r15 = X.AET.NORMAL
        L2c:
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L4f
            r18 = 1
        L33:
            r0 = r24
            r1 = r25
            r7 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = r9
            r17 = r6
            r19 = r9
            r20 = r6
            r21 = r9
            r22 = r9
            r23 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L4f:
            r18 = 0
            goto L33
        L52:
            r8 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEP.<init>(java.lang.String, X.89v, android.view.View$OnClickListener, java.lang.Object, boolean, int):void");
    }

    public static AEP LJIILJJIL(AEP aep, String str, C2068389v c2068389v, boolean z, View view, String str2, boolean z2, String str3, java.util.Map map, String str4, String str5, Drawable drawable, boolean z3, boolean z4, String str6, int i) {
        View.OnClickListener onClickListener;
        Object obj;
        boolean z5;
        AET cellVariant;
        boolean z6;
        String str7;
        boolean z7;
        boolean z8;
        View.OnClickListener onClickListener2;
        boolean z9 = z4;
        String str8 = str5;
        boolean z10 = z3;
        String str9 = str4;
        java.util.Map map2 = map;
        String str10 = str3;
        C2068389v c2068389v2 = c2068389v;
        boolean z11 = z2;
        String str11 = str6;
        Drawable drawable2 = drawable;
        String title = str;
        boolean z12 = z;
        View view2 = view;
        String str12 = str2;
        if ((i & 1) != 0) {
            title = aep.LJZI;
        }
        if ((i & 2) != 0) {
            c2068389v2 = aep.LJZL;
        }
        if ((i & 4) != 0) {
            onClickListener = aep.LL;
        } else {
            onClickListener = null;
        }
        if ((i & 8) != 0) {
            obj = aep.LLD;
        } else {
            obj = null;
        }
        if ((i & 16) != 0) {
            z12 = aep.LLF;
        }
        if ((i & 32) != 0) {
            view2 = aep.LLFF;
        }
        if ((i & 64) != 0) {
            str12 = aep.LLFFF;
        }
        if ((i & 128) != 0) {
            z5 = aep.LLFII;
        } else {
            z5 = false;
        }
        if ((i & 256) != 0) {
            z11 = aep.LLFZ;
        }
        if ((i & 512) != 0) {
            str10 = aep.LLI;
        }
        if ((i & 1024) != 0) {
            map2 = aep.LLIFFJFJJ;
        }
        if ((i & 2048) != 0) {
            str9 = aep.LLII;
        }
        if ((i & 4096) != 0) {
            str8 = aep.LLIIII;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            drawable2 = aep.LLIIIILZ;
        }
        if ((i & 16384) != 0) {
            cellVariant = aep.LLIIIJ;
        } else {
            cellVariant = null;
        }
        if ((32768 & i) != 0) {
            z6 = aep.LLIIIL;
        } else {
            z6 = false;
        }
        if ((65536 & i) != 0) {
            str7 = aep.LLIIIZ;
        } else {
            str7 = null;
        }
        if ((131072 & i) != 0) {
            z7 = aep.LLIIJI;
        } else {
            z7 = false;
        }
        if ((262144 & i) != 0) {
            z8 = aep.LLIIJLIL;
        } else {
            z8 = false;
        }
        if ((524288 & i) != 0) {
            onClickListener2 = aep.LLIIL;
        } else {
            onClickListener2 = null;
        }
        if ((1048576 & i) != 0) {
            z10 = aep.LLIILII;
        }
        if ((2097152 & i) != 0) {
            z9 = aep.LLIILZL;
        }
        if ((i & 4194304) != 0) {
            str11 = aep.LLIIZ;
        }
        aep.getClass();
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        View view3 = view2;
        String str13 = str12;
        String str14 = str8;
        return new AEP(title, c2068389v2, onClickListener, obj, z12, view3, str13, z5, z11, str10, map2, str9, str14, drawable2, cellVariant, z6, str7, z7, z8, onClickListener2, z10, z9, str11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AEP(String title, C2068389v c2068389v, View.OnClickListener onClickListener, Object obj, boolean z, View view, String str, boolean z2, boolean z3, String str2, java.util.Map<String, String> map, String str3, String str4, Drawable drawable, AET cellVariant, boolean z4, String str5, boolean z5, boolean z6, View.OnClickListener onClickListener2, boolean z7, boolean z8, String str6) {
        super(title, cellVariant, c2068389v, z, z4, str5, z5, z6, onClickListener, onClickListener2, obj, z7, z8, FileUtils.BUFFER_SIZE);
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cellVariant, "cellVariant");
        this.LJZI = title;
        this.LJZL = c2068389v;
        this.LL = onClickListener;
        this.LLD = obj;
        this.LLF = z;
        this.LLFF = view;
        this.LLFFF = str;
        this.LLFII = z2;
        this.LLFZ = z3;
        this.LLI = str2;
        this.LLIFFJFJJ = map;
        this.LLII = str3;
        this.LLIIII = str4;
        this.LLIIIILZ = drawable;
        this.LLIIIJ = cellVariant;
        this.LLIIIL = z4;
        this.LLIIIZ = str5;
        this.LLIIJI = z5;
        this.LLIIJLIL = z6;
        this.LLIIL = onClickListener2;
        this.LLIILII = z7;
        this.LLIILZL = z8;
        this.LLIIZ = str6;
    }
}
