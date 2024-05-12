package X;

import Y.ARunnableS29S0200000_10;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.NNi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC59254NNi implements Runnable {
    public final /* synthetic */ Runnable LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ OmVast LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public RunnableC59254NNi(ARunnableS29S0200000_10 aRunnableS29S0200000_10, Aweme aweme, long j, OmVast omVast, int i) {
        this.LJLIL = aRunnableS29S0200000_10;
        this.LJLILLLLZI = aweme;
        this.LJLJI = j;
        this.LJLJJI = omVast;
        this.LJLJJL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[FINALLY_INSNS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            java.lang.String r2 = "draw_ad"
            java.lang.String r1 = "parse_vast"
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L80
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()     // Catch: java.lang.Throwable -> L80
            X.N0h r5 = X.C58704N2e.LIZLLL(r2, r1, r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "duration"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L80
            long r0 = r6.LJLJI     // Catch: java.lang.Throwable -> L80
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L80
            r5.LIZIZ(r0, r4)     // Catch: java.lang.Throwable -> L80
            r5.LJII()     // Catch: java.lang.Throwable -> L80
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r6.LJLJJI     // Catch: java.lang.Throwable -> L80
            r0 = 1
            r1.loaded = r0     // Catch: java.lang.Throwable -> L80
            X.NNj r0 = new X.NNj     // Catch: java.lang.Throwable -> L80
            r0.<init>()     // Catch: java.lang.Throwable -> L80
            r1.vast = r0     // Catch: java.lang.Throwable -> L80
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r6.LJLJJI     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = r0.vastUrl     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L3a
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L61
        L3a:
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r6.LJLJJI     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r0.vastContent     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L78
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L47
            goto L78
        L47:
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r6.LJLJJI     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            X.NNj r5 = r0.vast     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            java.lang.String r4 = r0.vastContent     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            int r3 = r6.LJLJJL     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            X.NNu r2 = X.C59266NNu.LIZ     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            X.J80 r1 = new X.J80     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            r1.<init>(r0)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            r5.parseContent(r4, r3, r2, r1)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L80
            goto L78
        L5c:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> L80
            goto L78
        L61:
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r6.LJLJJI     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            X.NNj r4 = r0.vast     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            int r3 = r6.LJLJJL     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            X.NNu r2 = X.C59266NNu.LIZ     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            X.J80 r1 = new X.J80     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r1.<init>(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r4.parseUri(r5, r3, r2, r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            goto L78
        L74:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> L80
        L78:
            java.lang.Runnable r0 = r6.LJLIL
            if (r0 == 0) goto L7f
            r0.run()
        L7f:
            return
        L80:
            r1 = move-exception
            java.lang.Runnable r0 = r6.LJLIL
            if (r0 == 0) goto L88
            r0.run()
        L88:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC59254NNi.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
