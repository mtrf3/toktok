package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.ALg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26076ALg {
    public final User LIZ;
    public final Activity LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final InterfaceC26071ALb LJFF;
    public final String LJI;
    public final AwemeRawAd LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final ALS LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26076ALg)) {
            return false;
        }
        C26076ALg c26076ALg = (C26076ALg) obj;
        return o.LJ(this.LIZ, c26076ALg.LIZ) && o.LJ(this.LIZIZ, c26076ALg.LIZIZ) && o.LJ(this.LIZJ, c26076ALg.LIZJ) && o.LJ(this.LIZLLL, c26076ALg.LIZLLL) && o.LJ(this.LJ, c26076ALg.LJ) && o.LJ(this.LJFF, c26076ALg.LJFF) && o.LJ(this.LJI, c26076ALg.LJI) && o.LJ(this.LJII, c26076ALg.LJII) && this.LJIIIIZZ == c26076ALg.LJIIIIZZ && this.LJIIIZ == c26076ALg.LJIIIZ && o.LJ(this.LJIIJ, c26076ALg.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        User user = this.LIZ;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        Activity activity = this.LIZIZ;
        int hashCode2 = (hashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC26071ALb interfaceC26071ALb = this.LJFF;
        int hashCode6 = (hashCode5 + (interfaceC26071ALb == null ? 0 : interfaceC26071ALb.hashCode())) * 31;
        String str4 = this.LJI;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AwemeRawAd awemeRawAd = this.LJII;
        int hashCode8 = (hashCode7 + (awemeRawAd == null ? 0 : awemeRawAd.hashCode())) * 31;
        boolean z = this.LJIIIIZZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode8 + i) * 31) + (this.LJIIIZ ? 1 : 0)) * 31;
        ALS als = this.LJIIJ;
        return i2 + (als != null ? als.hashCode() : 0);
    }

    public final String toString() {
        return "BellClickParameter(user=" + this.LIZ + ", activity=" + this.LIZIZ + ", enterFrom=" + this.LIZJ + ", previousPage=" + this.LIZLLL + ", previousPagePosition=" + this.LJ + ", displayUI=" + this.LJFF + ", clickFrom=" + this.LJI + ", awemeRawAd=" + this.LJII + ", isVertical=" + this.LJIIIIZZ + ", showNudgeGuide=" + this.LJIIIZ + ", pushStatusCallback=" + this.LJIIJ + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C26076ALg(com.ss.android.ugc.aweme.profile.model.User r13, android.app.Activity r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, X.InterfaceC26071ALb r18, java.lang.String r19, com.ss.android.ugc.aweme.feed.model.AwemeRawAd r20, X.ALS r21, int r22) {
        /*
            r12 = this;
            r4 = r16
            r3 = r15
            r1 = r22
            r5 = r17
            r6 = r18
            r8 = r20
            r0 = r1 & 4
            java.lang.String r7 = ""
            if (r0 == 0) goto L12
            r3 = r7
        L12:
            r0 = r1 & 8
            if (r0 == 0) goto L17
            r4 = r7
        L17:
            r0 = r1 & 16
            if (r0 == 0) goto L1c
            r5 = r7
        L1c:
            r0 = r1 & 32
            r11 = 0
            if (r0 == 0) goto L22
            r6 = r11
        L22:
            r0 = r1 & 64
            if (r0 == 0) goto L41
        L26:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2b
            r8 = r11
        L2b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3f
            r9 = 1
        L30:
            r10 = 0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L3c
        L35:
            r2 = r14
            r0 = r12
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L3c:
            r11 = r21
            goto L35
        L3f:
            r9 = 0
            goto L30
        L41:
            r7 = r19
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26076ALg.<init>(com.ss.android.ugc.aweme.profile.model.User, android.app.Activity, java.lang.String, java.lang.String, java.lang.String, X.ALb, java.lang.String, com.ss.android.ugc.aweme.feed.model.AwemeRawAd, X.ALS, int):void");
    }

    public C26076ALg(User user, Activity activity, String str, String str2, String str3, InterfaceC26071ALb interfaceC26071ALb, String str4, AwemeRawAd awemeRawAd, boolean z, boolean z2, ALS als) {
        this.LIZ = user;
        this.LIZIZ = activity;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = interfaceC26071ALb;
        this.LJI = str4;
        this.LJII = awemeRawAd;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = als;
    }
}
