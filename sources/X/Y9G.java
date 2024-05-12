package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y9G {
    public static final /* synthetic */ int LJIJJ = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final UrlModel LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public C217878gp LJIJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y9G() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r17
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r2
            r11 = r1
            r12 = r1
            r13 = r2
            r14 = r1
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y9G.<init>():void");
    }

    public final String toString() {
        return "MentionUser(uid=" + this.LIZ + ", followStatus=" + this.LIZIZ + ", initialLetter=" + this.LIZJ + ", nickname=" + this.LIZLLL + ", signature=" + this.LJ + ", avatarThumb=" + this.LJFF + ", uniqueId=" + this.LJI + ", shortId=" + this.LJII + ", customVerify=" + this.LJIIIIZZ + ", enterpriseVerifyReason=" + this.LJIIIZ + ", verificationType=" + this.LJIIJ + ", remarkName=" + this.LJIIJJI + ", contactName=" + this.LJIIL + ", commerceUserLevel=" + this.LJIILIIL + ", nicknamePinYin=" + this.LJIILJJIL + ", contactNamePinYin=" + this.LJIILL + ", nicknameInitial=" + this.LJIILLIIL + ", contactNameInitial=" + this.LJIIZILJ + ", secUid=" + this.LJIJ + ", extraInfo=" + this.LJIJI + ')';
    }

    public final int hashCode() {
        return Y9H.LIZJ(this).hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y9G)) {
            return false;
        }
        return o.LJ(this.LIZ, ((Y9G) obj).LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Y9G(java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, com.ss.android.ugc.aweme.base.model.UrlModel r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, java.lang.String r43, java.lang.String r44, int r45, java.lang.String r46, X.C217878gp r47, int r48) {
        /*
            r32 = this;
            r1 = r48
            r15 = r45
            r13 = r43
            r12 = r42
            r11 = r41
            r10 = r40
            r9 = r39
            r21 = r47
            r3 = r34
            r2 = r33
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r0 = r1 & 1
            java.lang.String r20 = ""
            if (r0 == 0) goto L24
            r2 = r20
        L24:
            r0 = r1 & 2
            if (r0 == 0) goto L29
            r3 = -1
        L29:
            r0 = r1 & 4
            r14 = 0
            if (r0 == 0) goto La2
            r4 = r20
        L30:
            r0 = r1 & 8
            if (r0 == 0) goto L36
            r5 = r20
        L36:
            r0 = r1 & 16
            if (r0 == 0) goto L3c
            r6 = r20
        L3c:
            r0 = r1 & 32
            if (r0 == 0) goto L41
            r7 = r14
        L41:
            r0 = r1 & 64
            if (r0 == 0) goto L47
            r8 = r20
        L47:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4d
            r9 = r20
        L4d:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L52
            r10 = r14
        L52:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L57
            r11 = r14
        L57:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L5c
            r12 = -1
        L5c:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L62
            r13 = r20
        L62:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L9f
        L66:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L6b
            r15 = -1
        L6b:
            r16 = 0
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L9c
        L72:
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L90
            X.8gp r21 = new X.8gp
            r22 = 0
            r31 = 511(0x1ff, float:7.16E-43)
            r23 = r16
            r24 = r22
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r22
            r29 = r16
            r30 = r16
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L90:
            r1 = r32
            r17 = r16
            r18 = r16
            r19 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L9c:
            r20 = r46
            goto L72
        L9f:
            r14 = r44
            goto L66
        La2:
            r4 = r14
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y9G.<init>(java.lang.String, int, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, X.8gp, int):void");
    }

    public Y9G(String uid, int i, String initialLetter, String nickname, String signature, UrlModel urlModel, String uniqueId, String shortId, String str, String str2, int i2, String remarkName, String str3, int i3, String str4, String str5, String str6, String str7, String secUid, C217878gp extraInfo) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(initialLetter, "initialLetter");
        o.LJIIIZ(nickname, "nickname");
        o.LJIIIZ(signature, "signature");
        o.LJIIIZ(uniqueId, "uniqueId");
        o.LJIIIZ(shortId, "shortId");
        o.LJIIIZ(remarkName, "remarkName");
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(extraInfo, "extraInfo");
        this.LIZ = uid;
        this.LIZIZ = i;
        this.LIZJ = initialLetter;
        this.LIZLLL = nickname;
        this.LJ = signature;
        this.LJFF = urlModel;
        this.LJI = uniqueId;
        this.LJII = shortId;
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
        this.LJIIJ = i2;
        this.LJIIJJI = remarkName;
        this.LJIIL = str3;
        this.LJIILIIL = i3;
        this.LJIILJJIL = str4;
        this.LJIILL = str5;
        this.LJIILLIIL = str6;
        this.LJIIZILJ = str7;
        this.LJIJ = secUid;
        this.LJIJI = extraInfo;
    }
}
