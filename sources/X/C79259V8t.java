package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.V8t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79259V8t extends AbsDownloadListener implements InterfaceC72996Skq {
    public final C31824CeK LJLIL;
    public InterfaceC88472Yns<? super DownloadInfo, C76800UCe> LJLILLLLZI;
    public InterfaceC88472Yns<? super DownloadInfo, C76800UCe> LJLJI;
    public InterfaceC88471Ynr<? super DownloadInfo, ? super BaseException, C76800UCe> LJLJJI;
    public InterfaceC88472Yns<? super DownloadInfo, C76800UCe> LJLJJL;
    public volatile long LJLJJLL;
    public volatile long LJLJL;

    public final void LJ() {
        this.LJLJL = (System.currentTimeMillis() - this.LJLJJLL) + this.LJLJL;
    }

    public C79259V8t(C31824CeK config) {
        o.LJIIIZ(config, "config");
        this.LJLIL = config;
    }

    @Override // X.InterfaceC72996Skq
    public final void LIZ(InterfaceC88472Yns<? super DownloadInfo, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC72996Skq
    public final void LIZIZ(InterfaceC88472Yns<? super DownloadInfo, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC72996Skq
    public final void LIZJ(InterfaceC88471Ynr<? super DownloadInfo, ? super BaseException, C76800UCe> interfaceC88471Ynr) {
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC72996Skq
    public final void LIZLLL(InterfaceC88472Yns<? super DownloadInfo, C76800UCe> interfaceC88472Yns) {
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        C28721BOz.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancel file=");
        LIZ.append(this.LJLIL);
        BP1.LIZ("FileDownloadListener#onCanceled", X1D.LIZIZ(LIZ));
        C29306Beo.LJJJI(new AqS163S0100000_13(this, downloadInfo, 42), this.LJLIL.LJIIL);
        LJ();
        C31820CeG LIZ2 = C31821CeH.LIZ(this.LJLIL);
        if (LIZ2 != null) {
            LIZ2.LIZJ.put("duration", this.LJLJL);
            LIZ2.LIZIZ.put("file_status", 2);
            C0K2.LJI("ttlive_file_monitor", LIZ2.LIZIZ, LIZ2.LIZJ, LIZ2.LIZLLL);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        C28721BOz.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancel file=");
        LIZ.append(this.LJLIL);
        BP1.LIZ("FileDownloadListener#onCanceled", X1D.LIZIZ(LIZ));
        C29306Beo.LJJJI(new AqS163S0100000_13(this, downloadInfo, 43), this.LJLIL.LJIIL);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        C29306Beo.LJJJI(new AqS160S0200000_13(this, downloadInfo, 2), this.LJLIL.LJIIL);
        C28721BOz.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onProgress=");
        LIZ.append(downloadInfo);
        LIZ.append(" file=");
        LIZ.append(this.LJLIL);
        BP1.LIZ("FileDownloadListener#onProgress", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        C29306Beo.LJJJI(new AqS160S0200000_13(this, downloadInfo, 3), this.LJLIL.LJIIL);
        this.LJLJJLL = System.currentTimeMillis();
        C28721BOz.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start file=");
        LIZ.append(this.LJLIL);
        BP1.LIZ("FileDownloadListener#onStart", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        C28721BOz.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success file=");
        LIZ.append(this.LJLIL);
        BP1.LIZ("FileDownloadListener#onSuccessed", X1D.LIZIZ(LIZ));
        C29306Beo.LJJJI(new AqS160S0200000_13(this, downloadInfo, 4), this.LJLIL.LJIIL);
        LJ();
        C31820CeG LIZ2 = C31821CeH.LIZ(this.LJLIL);
        if (LIZ2 != null) {
            LIZ2.LIZJ.put("duration", this.LJLJL);
            LIZ2.LIZIZ.put("file_status", 0);
            C0K2.LJI("ttlive_file_monitor", LIZ2.LIZIZ, LIZ2.LIZJ, LIZ2.LIZLLL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0073, code lost:
    
        if (r2 == null) goto L11;
     */
    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFailed(com.ss.android.socialbase.downloader.model.DownloadInfo r6, com.ss.android.socialbase.downloader.exception.BaseException r7) {
        /*
            r5 = this;
            super.onFailed(r6, r7)
            X.BP1 r3 = X.C28721BOz.LIZ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "failed file="
            r1.append(r0)
            X.CeK r0 = r5.LJLIL
            r1.append(r0)
            java.lang.String r0 = " exception="
            r1.append(r0)
            r0 = 0
            if (r7 == 0) goto L21
            java.lang.String r0 = r7.getMessage()
        L21:
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            r3.getClass()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "LiveFileService-"
            r1.append(r0)
            java.lang.String r0 = "FileDownloadListener#onFailed"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C0NB.LJ(r0, r2)
            X.CeK r0 = r5.LJLIL
            boolean r2 = r0.LJIIL
            kotlin.jvm.internal.AqS102S0300000_13 r1 = new kotlin.jvm.internal.AqS102S0300000_13
            r0 = 0
            r1.<init>(r5, r6, r7, r0)
            X.C29306Beo.LJJJI(r1, r2)
            r5.LJ()
            X.CeK r0 = r5.LJLIL
            X.CeG r4 = X.C31821CeH.LIZ(r0)
            if (r4 == 0) goto L90
            long r1 = r5.LJLJL
            org.json.JSONObject r3 = r4.LIZJ
            java.lang.String r0 = "duration"
            r3.put(r0, r1)
            org.json.JSONObject r2 = r4.LIZIZ
            java.lang.String r1 = "file_status"
            r0 = 1
            r2.put(r1, r0)
            if (r7 == 0) goto L91
            int r3 = r7.getErrorCode()
            java.lang.String r2 = r7.getErrorMessage()
            if (r2 != 0) goto L77
        L75:
            java.lang.String r2 = ""
        L77:
            org.json.JSONObject r1 = r4.LIZIZ
            java.lang.String r0 = "error_code"
            r1.put(r0, r3)
            org.json.JSONObject r1 = r4.LIZLLL
            java.lang.String r0 = "error_msg"
            r1.put(r0, r2)
            org.json.JSONObject r3 = r4.LIZIZ
            org.json.JSONObject r2 = r4.LIZJ
            org.json.JSONObject r1 = r4.LIZLLL
            java.lang.String r0 = "ttlive_file_monitor"
            X.C0K2.LJI(r0, r3, r2, r1)
        L90:
            return
        L91:
            r3 = -1
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79259V8t.onFailed(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException):void");
    }
}
