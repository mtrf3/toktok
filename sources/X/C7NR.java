package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7NR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NR {
    public final String LIZ;
    public final String LIZIZ;
    public final Aweme LIZJ;
    public final InterfaceC72642tA<C50420Jqa> LIZLLL;
    public final Bundle LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7NR)) {
            return false;
        }
        C7NR c7nr = (C7NR) obj;
        return o.LJ(this.LIZ, c7nr.LIZ) && o.LJ(this.LIZIZ, c7nr.LIZIZ) && o.LJ(this.LIZJ, c7nr.LIZJ) && o.LJ(this.LIZLLL, c7nr.LIZLLL) && o.LJ(this.LJ, c7nr.LJ) && this.LJFF == c7nr.LJFF && o.LJ(this.LJI, c7nr.LJI) && o.LJ(this.LJII, c7nr.LJII) && this.LJIIIIZZ == c7nr.LJIIIIZZ && o.LJ(this.LJIIIZ, c7nr.LJIIIZ) && o.LJ(this.LJIIJ, c7nr.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31)) * 31;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LIZLLL;
        int i = 0;
        if (interfaceC72642tA == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC72642tA.hashCode();
        }
        int hashCode5 = (this.LJ.hashCode() + ((hashCode4 + hashCode) * 31)) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode5 + i2) * 31;
        String str = this.LJI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LJ = (C79062V1e.LJ(this.LJII, (i3 + hashCode2) * 31, 31) + this.LJIIIIZZ) * 31;
        String str2 = this.LJIIIZ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (LJ + hashCode3) * 31;
        String str3 = this.LJIIJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowShareParams(enterFrom=");
        sb.append(this.LIZ);
        sb.append(", enterMethod=");
        sb.append(this.LIZIZ);
        sb.append(", aweme=");
        sb.append(this.LIZJ);
        sb.append(", listener=");
        sb.append(this.LIZLLL);
        sb.append(", extras=");
        sb.append(this.LJ);
        sb.append(", isShowAction=");
        sb.append(this.LJFF);
        sb.append(", enterPosition=");
        sb.append(this.LJI);
        sb.append(", panelSource=");
        sb.append(this.LJII);
        sb.append(", isNewPage=");
        sb.append(this.LJIIIIZZ);
        sb.append(", previousPage=");
        sb.append(this.LJIIIZ);
        sb.append(", nowTabEnterMethod=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C7NR(java.lang.String r15, java.lang.String r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, X.C198337qP r18, android.os.Bundle r19, java.lang.String r20, int r21) {
        /*
            r14 = this;
            r4 = r16
            r3 = r15
            r6 = r18
            r7 = r19
            r9 = r20
            r2 = r21
            r0 = r2 & 1
            java.lang.String r10 = ""
            if (r0 == 0) goto L12
            r3 = r10
        L12:
            r0 = r2 & 2
            if (r0 == 0) goto L17
            r4 = r10
        L17:
            r0 = r2 & 8
            r1 = 0
            if (r0 == 0) goto L1d
            r6 = r1
        L1d:
            r0 = r2 & 16
            if (r0 == 0) goto L26
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L26:
            r0 = r2 & 32
            if (r0 == 0) goto L40
            r8 = 1
        L2b:
            r0 = r2 & 64
            if (r0 == 0) goto L30
            r9 = r10
        L30:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3e
        L34:
            r11 = 0
            r12 = 0
            r5 = r17
            r2 = r14
            r13 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L3e:
            r10 = r1
            goto L34
        L40:
            r8 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7NR.<init>(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, X.7qP, android.os.Bundle, java.lang.String, int):void");
    }

    public C7NR(String enterFrom, String enterMethod, Aweme aweme, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Bundle extras, boolean z, String str, String panelSource, int i, String str2, String str3) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(extras, "extras");
        o.LJIIIZ(panelSource, "panelSource");
        this.LIZ = enterFrom;
        this.LIZIZ = enterMethod;
        this.LIZJ = aweme;
        this.LIZLLL = interfaceC72642tA;
        this.LJ = extras;
        this.LJFF = z;
        this.LJI = str;
        this.LJII = panelSource;
        this.LJIIIIZZ = i;
        this.LJIIIZ = str2;
        this.LJIIJ = str3;
    }
}
