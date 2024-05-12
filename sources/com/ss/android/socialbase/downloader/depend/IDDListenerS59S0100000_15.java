package com.ss.android.socialbase.downloader.depend;

import X.C78963Uyt;
import X.C84271X5n;
import X.C84274X5q;
import X.H7B;
import X.UC7;
import X.X1D;
import X.X6G;
import X.X6M;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes16.dex */
public class IDDListenerS59S0100000_15 extends AbsDownloadListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onCanceled$0(this, downloadInfo);
                return;
            case 1:
                onCanceled$1(this, downloadInfo);
                return;
            default:
                super.onCanceled(downloadInfo);
                return;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, downloadInfo, baseException);
                return;
            case 1:
                onFailed$1(this, downloadInfo, baseException);
                return;
            default:
                super.onFailed(downloadInfo, baseException);
                return;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 1:
                onPause$0(this, downloadInfo);
                return;
            default:
                super.onPause(downloadInfo);
                return;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, downloadInfo);
                return;
            default:
                super.onProgress(downloadInfo);
                return;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onStart$0(this, downloadInfo);
                return;
            case 1:
                onStart$1(this, downloadInfo);
                return;
            default:
                super.onStart(downloadInfo);
                return;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onSuccessed$0(this, downloadInfo);
                return;
            case 1:
                onSuccessed$1(this, downloadInfo);
                return;
            default:
                super.onSuccessed(downloadInfo);
                return;
        }
    }

    public IDDListenerS59S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCanceled$0(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        X6G x6g = ((X6M) iDDListenerS59S0100000_15.l0).LIZJ;
        if (x6g != null) {
            x6g.LJ();
        }
    }

    public static final void onCanceled$1(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        ((C84271X5n) iDDListenerS59S0100000_15.l0).getClass();
        CountDownLatch countDownLatch = ((C84271X5n) iDDListenerS59S0100000_15.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C84271X5n c84271X5n = (C84271X5n) iDDListenerS59S0100000_15.l0;
        C84274X5q c84274X5q = c84271X5n.LJI;
        if (c84274X5q != null) {
            c84274X5q.LIZLLL(c84271X5n.LIZIZ, c84271X5n);
        }
    }

    public static final void onPause$0(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        CountDownLatch countDownLatch = ((C84271X5n) iDDListenerS59S0100000_15.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static final void onProgress$0(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            X6M x6m = (X6M) iDDListenerS59S0100000_15.l0;
            if (downloadInfo.getTotalBytes() <= 0) {
                return;
            }
            int curBytes = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
            X6G x6g = x6m.LIZJ;
            if (x6g != null) {
                x6g.LIZLLL();
            }
            UC7.LIZLLL("ReuseAudioFetcher onProgress : ", curBytes);
        }
    }

    public static final void onStart$0(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        X6G x6g = ((X6M) iDDListenerS59S0100000_15.l0).LIZJ;
        if (x6g != null) {
            x6g.LIZ();
        }
    }

    public static final void onStart$1(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        C84271X5n c84271X5n = (C84271X5n) iDDListenerS59S0100000_15.l0;
        C84274X5q c84274X5q = c84271X5n.LJI;
        if (c84274X5q != null) {
            c84274X5q.LIZ(c84271X5n.LIZIZ, c84271X5n);
        }
        ((C84271X5n) iDDListenerS59S0100000_15.l0).getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music Beat start time: ");
        LIZ.append(System.currentTimeMillis());
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onSuccessed$0(com.ss.android.socialbase.downloader.depend.IDDListenerS59S0100000_15 r3, com.ss.android.socialbase.downloader.model.DownloadInfo r4) {
        /*
            super.onSuccessed(r4)
            java.lang.Object r2 = r3.l0
            X.X6M r2 = (X.X6M) r2
            if (r4 == 0) goto L21
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r4.getSavePath()
            r1.append(r0)
            java.lang.String r0 = r4.getName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            if (r0 != 0) goto L23
        L21:
            java.lang.String r0 = ""
        L23:
            r2.LIZLLL = r0
            java.lang.Object r0 = r3.l0
            X.X6M r0 = (X.X6M) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.LJ
            if (r2 == 0) goto L36
            X.X6G r1 = r0.LIZJ
            if (r1 == 0) goto L36
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.LJFF
            r1.LJFF(r0, r2)
        L36:
            java.lang.Object r0 = r3.l0
            X.X6M r0 = (X.X6M) r0
            X.X6G r1 = r0.LIZJ
            if (r1 == 0) goto L46
            java.lang.String r0 = r0.LIZLLL
            kotlin.jvm.internal.o.LJI(r0)
            r1.onDownloadSuccess(r0)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.depend.IDDListenerS59S0100000_15.onSuccessed$0(com.ss.android.socialbase.downloader.depend.IDDListenerS59S0100000_15, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static final void onSuccessed$1(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo) {
        Long l;
        super.onSuccessed(downloadInfo);
        ((C84271X5n) iDDListenerS59S0100000_15.l0).getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music Beat success time: ");
        LIZ.append(System.currentTimeMillis());
        LIZ.append(" duration: ");
        if (downloadInfo != null) {
            l = Long.valueOf(downloadInfo.getDownloadTime());
        } else {
            l = null;
        }
        LIZ.append(l);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        CountDownLatch countDownLatch = ((C84271X5n) iDDListenerS59S0100000_15.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C84271X5n c84271X5n = (C84271X5n) iDDListenerS59S0100000_15.l0;
        C84274X5q c84274X5q = c84271X5n.LJI;
        if (c84274X5q != null) {
            c84274X5q.LIZLLL(c84271X5n.LIZIZ, c84271X5n);
        }
    }

    public static final void onFailed$0(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        X6G x6g = ((X6M) iDDListenerS59S0100000_15.l0).LIZJ;
        if (x6g != null) {
            x6g.LIZJ();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReuseAudioFetcher onFailed : ");
        if (baseException != null) {
            str = C78963Uyt.LJIJJ(baseException);
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    public static final void onFailed$1(IDDListenerS59S0100000_15 iDDListenerS59S0100000_15, DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        ((C84271X5n) iDDListenerS59S0100000_15.l0).getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music Beat beat url fail, cur url: ");
        Integer num = null;
        if (downloadInfo != null) {
            str = downloadInfo.getConnectionUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",retry url index: ");
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getCurBackUpUrlIndex());
        }
        LIZ.append(num);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        CountDownLatch countDownLatch = ((C84271X5n) iDDListenerS59S0100000_15.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C84271X5n c84271X5n = (C84271X5n) iDDListenerS59S0100000_15.l0;
        C84274X5q c84274X5q = c84271X5n.LJI;
        if (c84274X5q != null) {
            c84274X5q.LIZLLL(c84271X5n.LIZIZ, c84271X5n);
        }
    }
}
