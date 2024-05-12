package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161366Uy {
    public final int LIZ;
    public final int LIZIZ;
    public final InterfaceC65784Pro<Drawable> LIZJ;
    public final InterfaceC65784Pro<Drawable> LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final List<AddYoursAvatar> LJIIJ;
    public final long LJIIJJI;
    public final InterfaceC65784Pro<C76800UCe> LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final float LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;

    public C161366Uy() {
        this(0, 0, null, null, 0L, null, 0.0f, false, false, 1048575);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C161366Uy)) {
            return false;
        }
        C161366Uy c161366Uy = (C161366Uy) obj;
        return this.LIZ == c161366Uy.LIZ && this.LIZIZ == c161366Uy.LIZIZ && o.LJ(this.LIZJ, c161366Uy.LIZJ) && o.LJ(this.LIZLLL, c161366Uy.LIZLLL) && this.LJ == c161366Uy.LJ && this.LJFF == c161366Uy.LJFF && this.LJI == c161366Uy.LJI && this.LJII == c161366Uy.LJII && this.LJIIIIZZ == c161366Uy.LJIIIIZZ && o.LJ(this.LJIIIZ, c161366Uy.LJIIIZ) && o.LJ(this.LJIIJ, c161366Uy.LJIIJ) && this.LJIIJJI == c161366Uy.LJIIJJI && o.LJ(this.LJIIL, c161366Uy.LJIIL) && this.LJIILIIL == c161366Uy.LJIILIIL && this.LJIILJJIL == c161366Uy.LJIILJJIL && this.LJIILL == c161366Uy.LJIILL && this.LJIILLIIL == c161366Uy.LJIILLIIL && Float.compare(this.LJIIZILJ, c161366Uy.LJIIZILJ) == 0 && this.LJIJ == c161366Uy.LJIJ && this.LJIJI == c161366Uy.LJIJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        InterfaceC65784Pro<Drawable> interfaceC65784Pro = this.LIZJ;
        int i2 = 0;
        if (interfaceC65784Pro == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC65784Pro.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        InterfaceC65784Pro<Drawable> interfaceC65784Pro2 = this.LIZLLL;
        if (interfaceC65784Pro2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC65784Pro2.hashCode();
        }
        int i4 = (((((((((((i3 + hashCode2) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31;
        String str = this.LJIIIZ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJIIJJI, AnonymousClass391.LIZIZ(this.LJIIJ, (i4 + hashCode3) * 31, 31), 31);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJIIL;
        if (interfaceC65784Pro3 != null) {
            i2 = interfaceC65784Pro3.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJIIZILJ, (((((((((LIZJ + i2) * 31) + this.LJIILIIL) * 31) + this.LJIILJJIL) * 31) + this.LJIILL) * 31) + this.LJIILLIIL) * 31, 31);
        boolean z = this.LJIJ;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (LIZIZ + i6) * 31;
        if (!this.LJIJI) {
            i5 = 0;
        }
        return i7 + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddYoursStickerViewConfig(defaultWidth=");
        sb.append(this.LIZ);
        sb.append(", defaultHeight=");
        sb.append(this.LIZIZ);
        sb.append(", bgDrawable=");
        sb.append(this.LIZJ);
        sb.append(", iconBgDrawable=");
        sb.append(this.LIZLLL);
        sb.append(", iconId=");
        sb.append(this.LJ);
        sb.append(", iconTintColorRes=");
        sb.append(this.LJFF);
        sb.append(", dividerLineColorRes=");
        sb.append(this.LJI);
        sb.append(", buttonText=");
        sb.append(this.LJII);
        sb.append(", hintText=");
        sb.append(this.LJIIIIZZ);
        sb.append(", text=");
        sb.append(this.LJIIIZ);
        sb.append(", avatars=");
        sb.append(this.LJIIJ);
        sb.append(", followUsersCount=");
        sb.append(this.LJIIJJI);
        sb.append(", buttonClickListener=");
        sb.append(this.LJIIL);
        sb.append(", buttonTextColor=");
        sb.append(this.LJIILIIL);
        sb.append(", hintTextColor=");
        sb.append(this.LJIILJJIL);
        sb.append(", followUsersTextColor=");
        sb.append(this.LJIILL);
        sb.append(", editTextColor=");
        sb.append(this.LJIILLIIL);
        sb.append(", alpha=");
        sb.append(this.LJIIZILJ);
        sb.append(", disableEditText=");
        sb.append(this.LJIJ);
        sb.append(", enableEditView=");
        return C08880Wm.LIZJ(sb, this.LJIJI, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C161366Uy(int r24, int r25, java.lang.String r26, java.util.List r27, long r28, X.InterfaceC65784Pro r30, float r31, boolean r32, boolean r33, int r34) {
        /*
            r23 = this;
            r22 = r33
            r21 = r32
            r20 = r31
            r9 = r25
            r6 = r24
            r0 = r34
            r11 = r26
            r15 = r30
            r12 = r27
            r13 = r28
            r1 = r0 & 1
            if (r1 == 0) goto Lab
            r2 = 100
        L1a:
            r1 = r0 & 2
            if (r1 == 0) goto La8
            r3 = 100
        L20:
            r4 = 0
            r1 = r0 & 16
            if (r1 == 0) goto L28
            r6 = 2131755429(0x7f1001a5, float:1.9141737E38)
        L28:
            r1 = r0 & 32
            if (r1 == 0) goto La6
            r7 = 2130968641(0x7f040041, float:1.7545941E38)
        L2f:
            r1 = r0 & 64
            if (r1 == 0) goto La4
            r8 = 2130968657(0x7f040051, float:1.7545974E38)
        L36:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3d
            r9 = 2131823333(0x7f110ae5, float:1.9279463E38)
        L3d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La2
            r10 = 2131823349(0x7f110af5, float:1.9279495E38)
        L44:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4a
            java.lang.String r11 = ""
        L4a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L50
            X.OQg r12 = X.C61878OQg.INSTANCE
        L50:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L56
            r13 = 0
        L56:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L5b
            r15 = r4
        L5b:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L9f
            r16 = 2130968670(0x7f04005e, float:1.7546E38)
        L62:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L9c
            r17 = 2130968758(0x7f0400b6, float:1.7546179E38)
        L69:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L99
            r18 = 2130968766(0x7f0400be, float:1.7546195E38)
        L72:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L96
            r19 = 2130968757(0x7f0400b5, float:1.7546177E38)
        L7a:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L81
            r20 = 1065353216(0x3f800000, float:1.0)
        L81:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L88
            r21 = 0
        L88:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L8f
            r22 = 1
        L8f:
            r1 = r23
            r5 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L96:
            r19 = 0
            goto L7a
        L99:
            r18 = 0
            goto L72
        L9c:
            r17 = 0
            goto L69
        L9f:
            r16 = 0
            goto L62
        La2:
            r10 = 0
            goto L44
        La4:
            r8 = 0
            goto L36
        La6:
            r7 = 0
            goto L2f
        La8:
            r3 = 0
            goto L20
        Lab:
            r2 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161366Uy.<init>(int, int, java.lang.String, java.util.List, long, X.Pro, float, boolean, boolean, int):void");
    }

    public static C161366Uy LIZ(C161366Uy c161366Uy, int i, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        List<AddYoursAvatar> avatars;
        long j;
        float f;
        boolean z;
        boolean z2;
        int i13 = i6;
        int i14 = i5;
        InterfaceC65784Pro interfaceC65784Pro3 = interfaceC65784Pro;
        int i15 = i4;
        int i16 = i;
        InterfaceC65784Pro interfaceC65784Pro4 = interfaceC65784Pro2;
        int i17 = i2;
        int i18 = i7;
        int i19 = i3;
        if ((i8 & 1) != 0) {
            i16 = c161366Uy.LIZ;
        }
        if ((i8 & 2) != 0) {
            i9 = c161366Uy.LIZIZ;
        } else {
            i9 = -2;
        }
        if ((i8 & 4) != 0) {
            interfaceC65784Pro3 = c161366Uy.LIZJ;
        }
        if ((i8 & 8) != 0) {
            interfaceC65784Pro4 = c161366Uy.LIZLLL;
        }
        if ((i8 & 16) != 0) {
            i10 = c161366Uy.LJ;
        } else {
            i10 = 0;
        }
        if ((i8 & 32) != 0) {
            i17 = c161366Uy.LJFF;
        }
        if ((i8 & 64) != 0) {
            i19 = c161366Uy.LJI;
        }
        if ((i8 & 128) != 0) {
            i11 = c161366Uy.LJII;
        } else {
            i11 = 0;
        }
        if ((i8 & 256) != 0) {
            i12 = c161366Uy.LJIIIIZZ;
        } else {
            i12 = 0;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro5 = null;
        if ((i8 & 512) != 0) {
            str = c161366Uy.LJIIIZ;
        } else {
            str = null;
        }
        if ((i8 & 1024) != 0) {
            avatars = c161366Uy.LJIIJ;
        } else {
            avatars = null;
        }
        if ((i8 & 2048) != 0) {
            j = c161366Uy.LJIIJJI;
        } else {
            j = 0;
        }
        if ((i8 & 4096) != 0) {
            interfaceC65784Pro5 = c161366Uy.LJIIL;
        }
        if ((i8 & FileUtils.BUFFER_SIZE) != 0) {
            i15 = c161366Uy.LJIILIIL;
        }
        if ((i8 & 16384) != 0) {
            i14 = c161366Uy.LJIILJJIL;
        }
        if ((32768 & i8) != 0) {
            i13 = c161366Uy.LJIILL;
        }
        if ((65536 & i8) != 0) {
            i18 = c161366Uy.LJIILLIIL;
        }
        if ((131072 & i8) != 0) {
            f = c161366Uy.LJIIZILJ;
        } else {
            f = 0.0f;
        }
        if ((262144 & i8) != 0) {
            z = c161366Uy.LJIJ;
        } else {
            z = false;
        }
        if ((i8 & 524288) != 0) {
            z2 = c161366Uy.LJIJI;
        } else {
            z2 = false;
        }
        o.LJIIIZ(avatars, "avatars");
        return new C161366Uy(i16, i9, interfaceC65784Pro3, interfaceC65784Pro4, i10, i17, i19, i11, i12, str, avatars, j, interfaceC65784Pro5, i15, i14, i13, i18, f, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C161366Uy(int i, int i2, InterfaceC65784Pro<? extends Drawable> interfaceC65784Pro, InterfaceC65784Pro<? extends Drawable> interfaceC65784Pro2, int i3, int i4, int i5, int i6, int i7, String str, List<AddYoursAvatar> avatars, long j, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, int i8, int i9, int i10, int i11, float f, boolean z, boolean z2) {
        o.LJIIIZ(avatars, "avatars");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = interfaceC65784Pro2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = i7;
        this.LJIIIZ = str;
        this.LJIIJ = avatars;
        this.LJIIJJI = j;
        this.LJIIL = interfaceC65784Pro3;
        this.LJIILIIL = i8;
        this.LJIILJJIL = i9;
        this.LJIILL = i10;
        this.LJIILLIIL = i11;
        this.LJIIZILJ = f;
        this.LJIJ = z;
        this.LJIJI = z2;
    }
}
