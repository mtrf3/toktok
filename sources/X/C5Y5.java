package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Y5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Y5 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final C08630Vn<Boolean> LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C5Y5() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5Y5)) {
            return false;
        }
        C5Y5 c5y5 = (C5Y5) obj;
        return this.LIZ == c5y5.LIZ && this.LIZIZ == c5y5.LIZIZ && this.LIZJ == c5y5.LIZJ && this.LIZLLL == c5y5.LIZLLL && this.LJ == c5y5.LJ && this.LJFF == c5y5.LJFF && o.LJ(this.LJI, c5y5.LJI) && o.LJ(this.LJII, c5y5.LJII) && o.LJ(this.LJIIIIZZ, c5y5.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditVolumeV2SceneState(displayOriginalSoundVolume=");
        LIZ.append(this.LIZ);
        LIZ.append(", displayMusicVolume=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", displayRecordVolume=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enableOriginalSound=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enableMusic=");
        LIZ.append(this.LJ);
        LIZ.append(", enableRecord=");
        LIZ.append(this.LJFF);
        LIZ.append(", originalSoundTitle=");
        LIZ.append(this.LJI);
        LIZ.append(", musicSoundTitle=");
        LIZ.append(this.LJII);
        LIZ.append(", enterOrExitAnimEvent=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        boolean z = this.LIZLLL;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        boolean z2 = this.LJ;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        if (!this.LJFF) {
            i2 = 0;
        }
        int LJ = C79062V1e.LJ(this.LJII, C79062V1e.LJ(this.LJI, (i6 + i2) * 31, 31), 31);
        C08630Vn<Boolean> c08630Vn = this.LJIIIIZZ;
        if (c08630Vn == null) {
            hashCode = 0;
        } else {
            hashCode = c08630Vn.hashCode();
        }
        return LJ + hashCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C5Y5(int r12, int r13, int r14, boolean r15, boolean r16, int r17) {
        /*
            r11 = this;
            r3 = r13
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r1 = r17
            r0 = r1 & 1
            if (r0 == 0) goto Ld
            r2 = 0
        Ld:
            r0 = r1 & 2
            if (r0 == 0) goto L12
            r3 = 0
        L12:
            r0 = r1 & 4
            if (r0 == 0) goto L17
            r4 = 0
        L17:
            r0 = r1 & 8
            if (r0 == 0) goto L1c
            r5 = 0
        L1c:
            r0 = r1 & 16
            if (r0 == 0) goto L21
            r6 = 0
        L21:
            r0 = r1 & 32
            if (r0 == 0) goto L3b
            r7 = 1
        L26:
            r0 = r1 & 64
            r10 = 0
            java.lang.String r9 = ""
            if (r0 == 0) goto L39
            r8 = r9
        L2e:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L37
        L32:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L37:
            r9 = r10
            goto L32
        L39:
            r8 = r10
            goto L2e
        L3b:
            r7 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Y5.<init>(int, int, int, boolean, boolean, int):void");
    }

    public C5Y5(int i, int i2, int i3, boolean z, boolean z2, boolean z3, String originalSoundTitle, String musicSoundTitle, C08630Vn<Boolean> c08630Vn) {
        o.LJIIIZ(originalSoundTitle, "originalSoundTitle");
        o.LJIIIZ(musicSoundTitle, "musicSoundTitle");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = originalSoundTitle;
        this.LJII = musicSoundTitle;
        this.LJIIIIZZ = c08630Vn;
    }

    public static C5Y5 LIZ(C5Y5 c5y5, int i, int i2, int i3, boolean z, boolean z2, boolean z3, String str, String str2, C08630Vn c08630Vn, int i4) {
        C08630Vn c08630Vn2 = c08630Vn;
        String musicSoundTitle = str2;
        String originalSoundTitle = str;
        int i5 = i2;
        int i6 = i;
        int i7 = i3;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i4 & 1) != 0) {
            i6 = c5y5.LIZ;
        }
        if ((i4 & 2) != 0) {
            i5 = c5y5.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i7 = c5y5.LIZJ;
        }
        if ((i4 & 8) != 0) {
            z4 = c5y5.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            z5 = c5y5.LJ;
        }
        if ((i4 & 32) != 0) {
            z6 = c5y5.LJFF;
        }
        if ((i4 & 64) != 0) {
            originalSoundTitle = c5y5.LJI;
        }
        if ((i4 & 128) != 0) {
            musicSoundTitle = c5y5.LJII;
        }
        if ((i4 & 256) != 0) {
            c08630Vn2 = c5y5.LJIIIIZZ;
        }
        c5y5.getClass();
        o.LJIIIZ(originalSoundTitle, "originalSoundTitle");
        o.LJIIIZ(musicSoundTitle, "musicSoundTitle");
        return new C5Y5(i6, i5, i7, z4, z5, z6, originalSoundTitle, musicSoundTitle, c08630Vn2);
    }
}
