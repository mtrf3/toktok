package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.SDo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71740SDo {
    public final String LIZ;
    public final String LIZIZ;
    public final SE0 LIZJ;
    public final SE0 LIZLLL;
    public final SE0 LJ;
    public final SE0 LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final InterfaceC71722SCw LJIIJ;
    public final C71735SDj LJIIJJI;
    public final int LJIIL;
    public final Object LJIILIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71740SDo() {
        /*
            r9 = this;
            r1 = 0
            r4 = 0
            r8 = 16383(0x3fff, float:2.2957E-41)
            r0 = r9
            r2 = r1
            r3 = r1
            r5 = r1
            r6 = r1
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71740SDo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71740SDo)) {
            return false;
        }
        C71740SDo c71740SDo = (C71740SDo) obj;
        return o.LJ(this.LIZ, c71740SDo.LIZ) && o.LJ(this.LIZIZ, c71740SDo.LIZIZ) && o.LJ(this.LIZJ, c71740SDo.LIZJ) && o.LJ(this.LIZLLL, c71740SDo.LIZLLL) && o.LJ(this.LJ, c71740SDo.LJ) && o.LJ(this.LJFF, c71740SDo.LJFF) && this.LJI == c71740SDo.LJI && this.LJII == c71740SDo.LJII && this.LJIIIIZZ == c71740SDo.LJIIIIZZ && this.LJIIIZ == c71740SDo.LJIIIZ && o.LJ(this.LJIIJ, c71740SDo.LJIIJ) && o.LJ(this.LJIIJJI, c71740SDo.LJIIJJI) && this.LJIIL == c71740SDo.LJIIL && o.LJ(this.LJIILIIL, c71740SDo.LJIILIIL);
    }

    public final String toString() {
        return "InputState(noticeValue=" + this.LIZ + ", hitValue=" + this.LIZIZ + ", cardIcon=" + this.LIZJ + ", scanIcon=" + this.LIZLLL + ", noticeIcon=" + this.LJ + ", clearIcon=" + this.LJFF + ", singleLine=" + this.LJI + ", editEnable=" + this.LJII + ", inputType=" + this.LJIIIIZZ + ", maxLength=" + this.LJIIIZ + ", inputValue=" + this.LJIIJ + ", errorData=" + this.LJIIJJI + ", imeOptions=" + this.LJIIL + ", force=" + this.LJIILIIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJFF.hashCode() + ((this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.LJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        if (!this.LJII) {
            i = 0;
        }
        int i4 = (((((i3 + i) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31;
        InterfaceC71722SCw interfaceC71722SCw = this.LJIIJ;
        if (interfaceC71722SCw == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC71722SCw.hashCode();
        }
        return this.LJIILIIL.hashCode() + ((((this.LJIIJJI.hashCode() + ((i4 + hashCode) * 31)) * 31) + this.LJIIL) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C71740SDo(java.lang.String r23, X.SE0 r24, X.SE0 r25, int r26, X.InterfaceC71722SCw r27, X.C71735SDj r28, int r29, int r30) {
        /*
            r22 = this;
            r0 = r30
            r7 = r25
            r6 = r24
            r12 = r27
            r10 = r26
            r13 = r28
            r14 = r29
            r1 = r0 & 1
            r15 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto Lb7
            r2 = r3
        L16:
            r1 = r0 & 2
            if (r1 == 0) goto Lb3
        L1a:
            r1 = r0 & 4
            if (r1 == 0) goto Lb0
            X.SE0 r4 = new X.SE0
            r17 = 0
            r21 = 127(0x7f, float:1.78E-43)
            r16 = r4
            r18 = r17
            r19 = r17
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21)
        L2f:
            r1 = r0 & 8
            if (r1 == 0) goto Lae
            X.SE0 r5 = new X.SE0
            r17 = 0
            r21 = 127(0x7f, float:1.78E-43)
            r16 = r5
            r18 = r17
            r19 = r17
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21)
        L44:
            r1 = r0 & 16
            if (r1 == 0) goto L59
            X.SE0 r6 = new X.SE0
            r17 = 0
            r21 = 127(0x7f, float:1.78E-43)
            r16 = r6
            r18 = r17
            r19 = r17
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21)
        L59:
            r1 = r0 & 32
            if (r1 == 0) goto L6e
            X.SE0 r7 = new X.SE0
            r17 = 0
            r21 = 127(0x7f, float:1.78E-43)
            r16 = r7
            r18 = r17
            r19 = r17
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21)
        L6e:
            r1 = r0 & 64
            if (r1 == 0) goto Lac
            r8 = 1
        L73:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto Laa
            r9 = 1
        L78:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L7d
            r10 = 1
        L7d:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto La8
            r11 = 1073741823(0x3fffffff, float:1.9999999)
        L84:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L89
            r12 = r15
        L89:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L94
            X.SDj r13 = new X.SDj
            r1 = 15
            r13.<init>(r15, r1)
        L94:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L99
            r14 = 6
        L99:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto La2
            java.lang.Object r15 = new java.lang.Object
            r15.<init>()
        La2:
            r1 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        La8:
            r11 = 0
            goto L84
        Laa:
            r9 = 0
            goto L78
        Lac:
            r8 = 0
            goto L73
        Lae:
            r5 = r15
            goto L44
        Lb0:
            r4 = r15
            goto L2f
        Lb3:
            r3 = r23
            goto L1a
        Lb7:
            r2 = r15
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71740SDo.<init>(java.lang.String, X.SE0, X.SE0, int, X.SCw, X.SDj, int, int):void");
    }

    public static C71740SDo LIZ(C71740SDo c71740SDo, SE0 se0, SE0 se02, SE0 se03, InterfaceC71722SCw interfaceC71722SCw, C71735SDj c71735SDj, Object obj, int i) {
        String noticeValue;
        String hitValue;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        SE0 scanIcon = se02;
        SE0 cardIcon = se0;
        SE0 clearIcon = se03;
        C71735SDj errorData = c71735SDj;
        InterfaceC71722SCw interfaceC71722SCw2 = interfaceC71722SCw;
        Object force = obj;
        SE0 noticeIcon = null;
        if ((i & 1) != 0) {
            noticeValue = c71740SDo.LIZ;
        } else {
            noticeValue = null;
        }
        if ((i & 2) != 0) {
            hitValue = c71740SDo.LIZIZ;
        } else {
            hitValue = null;
        }
        if ((i & 4) != 0) {
            cardIcon = c71740SDo.LIZJ;
        }
        if ((i & 8) != 0) {
            scanIcon = c71740SDo.LIZLLL;
        }
        if ((i & 16) != 0) {
            noticeIcon = c71740SDo.LJ;
        }
        if ((i & 32) != 0) {
            clearIcon = c71740SDo.LJFF;
        }
        if ((i & 64) != 0) {
            z = c71740SDo.LJI;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = c71740SDo.LJII;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            i2 = c71740SDo.LJIIIIZZ;
        } else {
            i2 = 0;
        }
        if ((i & 512) != 0) {
            i3 = c71740SDo.LJIIIZ;
        } else {
            i3 = 0;
        }
        if ((i & 1024) != 0) {
            interfaceC71722SCw2 = c71740SDo.LJIIJ;
        }
        if ((i & 2048) != 0) {
            errorData = c71740SDo.LJIIJJI;
        }
        if ((i & 4096) != 0) {
            i4 = c71740SDo.LJIIL;
        } else {
            i4 = 0;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            force = c71740SDo.LJIILIIL;
        }
        c71740SDo.getClass();
        o.LJIIIZ(noticeValue, "noticeValue");
        o.LJIIIZ(hitValue, "hitValue");
        o.LJIIIZ(cardIcon, "cardIcon");
        o.LJIIIZ(scanIcon, "scanIcon");
        o.LJIIIZ(noticeIcon, "noticeIcon");
        o.LJIIIZ(clearIcon, "clearIcon");
        o.LJIIIZ(errorData, "errorData");
        o.LJIIIZ(force, "force");
        return new C71740SDo(noticeValue, hitValue, cardIcon, scanIcon, noticeIcon, clearIcon, z, z2, i2, i3, interfaceC71722SCw2, errorData, i4, force);
    }

    public C71740SDo(String noticeValue, String hitValue, SE0 cardIcon, SE0 scanIcon, SE0 noticeIcon, SE0 clearIcon, boolean z, boolean z2, int i, int i2, InterfaceC71722SCw interfaceC71722SCw, C71735SDj errorData, int i3, Object force) {
        o.LJIIIZ(noticeValue, "noticeValue");
        o.LJIIIZ(hitValue, "hitValue");
        o.LJIIIZ(cardIcon, "cardIcon");
        o.LJIIIZ(scanIcon, "scanIcon");
        o.LJIIIZ(noticeIcon, "noticeIcon");
        o.LJIIIZ(clearIcon, "clearIcon");
        o.LJIIIZ(errorData, "errorData");
        o.LJIIIZ(force, "force");
        this.LIZ = noticeValue;
        this.LIZIZ = hitValue;
        this.LIZJ = cardIcon;
        this.LIZLLL = scanIcon;
        this.LJ = noticeIcon;
        this.LJFF = clearIcon;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = interfaceC71722SCw;
        this.LJIIJJI = errorData;
        this.LJIIL = i3;
        this.LJIILIIL = force;
    }
}
