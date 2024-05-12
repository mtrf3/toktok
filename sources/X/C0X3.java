package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.0X3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0X3 implements Comparable {
    public final C0NR LJLIL;
    public C0NV LJLILLLLZI;
    public long LJLJI;
    public C0NU LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public C0X5 LJLJL;
    public C0X1 LJLJLJ;
    public final long LJLJLLL;
    public C0X7 LJLL;
    public long LJLLI;
    public C0X6 LJLLILLLL;
    public C0NT LJLLJ;
    public C0UD LJLLL;

    static {
        C16880lQ.LJLLJ(C0X3.class);
    }

    public final long LIZJ() {
        long j = this.LJLJI - (this.LJLLI - this.LJLJLLL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("real timeout:");
        LIZ.append(j);
        X1D.LIZIZ(LIZ);
        C0YN.LIZ(3);
        return j;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request{type=");
        LIZ.append(this.LJLIL);
        LIZ.append(", level=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", timeout=");
        C06510Nj.LIZIZ(LIZ, this.LJLJI, ", tid=", 0);
        LIZ.append(", priority=");
        LIZ.append(0);
        LIZ.append(", cluster=");
        LIZ.append((Object) null);
        LIZ.append(", timeoutStrategy=");
        LIZ.append(this.LJLJL);
        LIZ.append(", createTime=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", updateStrategy=");
        LIZ.append(this.LJLL);
        LIZ.append(", info=");
        LIZ.append((Object) null);
        LIZ.append(", commitTime=");
        LIZ.append(this.LJLLI);
        LIZ.append(", task=");
        LIZ.append(this.LJLLILLLL);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C0X3(C0NR c0nr) {
        C0X7 c0x7;
        C0X5 c0x5;
        this.LJLIL = c0nr;
        int[] iArr = C0X2.LIZ;
        switch (iArr[c0nr.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 18:
                c0x7 = C0X7.FIFO;
                break;
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
                c0x7 = C0X7.SMALL;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
                c0x7 = C0X7.LAGER;
                break;
        }
        this.LJLL = c0x7;
        switch (iArr[c0nr.ordinal()]) {
            case 1:
            case 2:
                c0x5 = C0X5.ONE_TIME;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                c0x5 = C0X5.USER_CANCEL;
                break;
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
                c0x5 = C0X5.USE_OURS;
                break;
        }
        this.LJLJL = c0x5;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLI = currentTimeMillis;
        this.LJLJLLL = currentTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        if (r3 == r1) goto L55;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            X.0X3 r8 = (X.C0X3) r8
            int[] r1 = X.C0X2.LIZIZ
            X.0X7 r0 = r8.LJLL
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r6 = -1
            r5 = 3
            r0 = 1
            if (r1 == r0) goto L72
            r0 = 2
            if (r1 == r0) goto L46
            if (r1 == r5) goto L37
            r0 = 4
            if (r1 == r0) goto L2e
            r0 = 5
            X.C0YN.LIZ(r0)
            long r1 = r7.LJLJLLL
            long r3 = r8.LJLJLLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2a
        L25:
            r6 = 1
        L26:
            X.C0YN.LIZ(r5)
            return r6
        L2a:
            if (r0 != 0) goto L26
            goto Lb1
        L2e:
            long r1 = r7.LJLJLLL
            long r3 = r8.LJLJLLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto Laf
            goto L25
        L37:
            long r1 = r7.LJLJLLL
            long r3 = r8.LJLJLLL
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L41
            r6 = 1
            goto L26
        L41:
            if (r0 != 0) goto L44
            goto L26
        L44:
            r6 = -1
            goto L26
        L46:
            X.0NV r0 = r7.LJLILLLLZI
            int r1 = r0.ordinal()
            X.0NV r0 = r8.LJLILLLLZI
            int r0 = r0.ordinal()
            if (r1 <= r0) goto L56
            r6 = 1
            goto L26
        L56:
            X.0NV r0 = r7.LJLILLLLZI
            int r1 = r0.ordinal()
            X.0NV r0 = r8.LJLILLLLZI
            int r0 = r0.ordinal()
            if (r1 != r0) goto L70
            long r3 = r7.LJLJLLL
            long r1 = r8.LJLJLLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6d
            goto L25
        L6d:
            if (r0 != 0) goto L26
            goto Lb1
        L70:
            r6 = -1
            goto L26
        L72:
            X.0NV r1 = r7.LJLILLLLZI
            if (r1 == 0) goto L86
            X.0NV r0 = r8.LJLILLLLZI
            if (r0 == 0) goto L86
            int r1 = r1.ordinal()
            X.0NV r0 = r8.LJLILLLLZI
            int r0 = r0.ordinal()
            if (r1 >= r0) goto L88
        L86:
            r6 = 1
            goto L26
        L88:
            X.0NV r0 = r7.LJLILLLLZI
            int r1 = r0.ordinal()
            X.0NV r0 = r8.LJLILLLLZI
            int r0 = r0.ordinal()
            if (r1 != r0) goto Lb7
            long r3 = r7.LJLJI
            long r1 = r8.LJLJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto La0
            r6 = 1
            goto L26
        La0:
            if (r0 != 0) goto Lb4
            long r3 = r7.LJLJLLL
            long r1 = r8.LJLJLLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lac
            goto L25
        Lac:
            if (r0 != 0) goto L26
            goto Lb1
        Laf:
            if (r0 != 0) goto L26
        Lb1:
            r6 = 0
            goto L26
        Lb4:
            r6 = -1
            goto L26
        Lb7:
            r6 = -1
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X3.compareTo(java.lang.Object):int");
    }
}
