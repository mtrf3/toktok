package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public final class NQO {
    public static Aweme LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.lang.String r7) {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.NQO.LIZ
            r3 = 0
            if (r0 == 0) goto Lb
            boolean r0 = r0.isAd()
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = r7.hashCode()
            switch(r0) {
                case -1036064766: goto L18;
                case -934426579: goto L21;
                case -697335956: goto L2a;
                case -599445191: goto L33;
                case -524537143: goto L3c;
                case 106440182: goto L45;
                case 1859771635: goto Lad;
                case 1928770270: goto Lbb;
                case 2147444528: goto L4e;
                default: goto L17;
            }
        L17:
            return
        L18:
            java.lang.String r0 = "bufferStart"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L56
            goto L17
        L21:
            java.lang.String r0 = "resume"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto Lb7
            goto L17
        L2a:
            java.lang.String r0 = "sessionStart"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto Lc5
            goto L17
        L33:
            java.lang.String r0 = "complete"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L56
            goto L17
        L3c:
            java.lang.String r0 = "sessionFinish"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L56
            goto L17
        L45:
            java.lang.String r0 = "pause"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L56
            goto L17
        L4e:
            java.lang.String r0 = "skipped"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
        L56:
            boolean r0 = X.NQO.LIZJ
            if (r0 == 0) goto L62
        L5a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.NQO.LIZIZ = r0
            goto L17
        L62:
            long r4 = X.NQO.LIZIZ
            long r1 = r1 - r4
            double r6 = (double) r1
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = r6 / r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = 1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L5a
            X.NQO.LIZJ = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.NQO.LIZ
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            if (r2 != 0) goto L80
            goto L5a
        L80:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = X.NQO.LIZ
            if (r1 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            int r0 = r0.getPivOption()
            if (r0 == 0) goto L9f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            int r1 = r0.getPivOption()
            r0 = 2
            if (r1 != r0) goto L5a
        L9f:
            java.lang.String r1 = "draw_ad"
            java.lang.String r0 = "viewable_2s"
            X.N0h r1 = X.C58704N2e.LIZLLL(r1, r0, r2)
            java.lang.String r0 = "is_piv"
            X.C0JU.LIZJ(r3, r1, r0)
            goto L5a
        Lad:
            java.lang.String r0 = "bufferFinish"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto Lb7
            goto L17
        Lb7:
            X.NQO.LIZIZ = r1
            goto L17
        Lbb:
            java.lang.String r0 = "mediaStart"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto Lc5
            goto L17
        Lc5:
            X.NQO.LIZIZ = r1
            X.NQO.LIZJ = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQO.LIZ(java.lang.String):void");
    }
}
