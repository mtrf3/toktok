package com.ss.android.socialbase.downloader.depend;

import X.AbstractC38911fr;
import X.AbstractC42411Gkh;
import X.C16880lQ;
import X.C39579Fg7;
import X.C5L7;
import X.C73578SuE;
import X.C76800UCe;
import X.GMU;
import X.H78;
import X.InterfaceC43172Gwy;
import X.InterfaceC65052gv;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutVideoDownloader;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDDListenerS58S0100000_7 extends AbsDownloadListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 2:
                onCanceled$0(this, downloadInfo);
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
            case 2:
                onFailed$2(this, downloadInfo, baseException);
                return;
            case 3:
                onFailed$3(this, downloadInfo, baseException);
                return;
            case 4:
                onFailed$4(this, downloadInfo, baseException);
                return;
            case 5:
                onFailed$5(this, downloadInfo, baseException);
                return;
            case 6:
                onFailed$6(this, downloadInfo, baseException);
                return;
            case 7:
                onFailed$7(this, downloadInfo, baseException);
                return;
            case 8:
                onFailed$8(this, downloadInfo, baseException);
                return;
            default:
                super.onFailed(downloadInfo, baseException);
                return;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 1:
                onProgress$0(this, downloadInfo);
                return;
            case 2:
                onProgress$1(this, downloadInfo);
                return;
            case 3:
            case 4:
            case 5:
            default:
                super.onProgress(downloadInfo);
                return;
            case 6:
                onProgress$2(this, downloadInfo);
                return;
            case 7:
                onProgress$3(this, downloadInfo);
                return;
            case 8:
                super.onProgress(downloadInfo);
                return;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 2:
                onStart$0(this, downloadInfo);
                return;
            case 3:
            case 4:
            case 5:
            case 7:
            default:
                super.onStart(downloadInfo);
                return;
            case 6:
                onStart$1(this, downloadInfo);
                return;
            case 8:
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
            case 2:
                onSuccessed$2(this, downloadInfo);
                return;
            case 3:
                onSuccessed$3(this, downloadInfo);
                return;
            case 4:
                onSuccessed$4(this, downloadInfo);
                return;
            case 5:
                onSuccessed$5(this, downloadInfo);
                return;
            case 6:
                onSuccessed$6(this, downloadInfo);
                return;
            case 7:
                onSuccessed$7(this, downloadInfo);
                return;
            case 8:
                onSuccessed$8(this, downloadInfo);
                return;
            default:
                super.onSuccessed(downloadInfo);
                return;
        }
    }

    public IDDListenerS58S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCanceled$0(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        Integer num;
        String LIZIZ;
        super.onCanceled(downloadInfo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel");
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getId());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        InterfaceC43172Gwy interfaceC43172Gwy = (InterfaceC43172Gwy) iDDListenerS58S0100000_7.l0;
        if (interfaceC43172Gwy != null) {
            interfaceC43172Gwy.onCancel();
        }
        if (downloadInfo != null) {
            String savePath = downloadInfo.getSavePath();
            o.LJIIIIZZ(savePath, "it.savePath");
            if (ujb.o.LJJJJ(savePath, "/", false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(downloadInfo.getSavePath());
                LIZ2.append(downloadInfo.getName());
                LIZIZ = X1D.LIZIZ(LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(downloadInfo.getSavePath());
                LIZ3.append('/');
                LIZ3.append(downloadInfo.getName());
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            if (C39579Fg7.LIZIZ(LIZIZ)) {
                C39579Fg7.LJIL(LIZIZ);
            }
        }
    }

    public static final void onProgress$0(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        int i;
        super.onProgress(downloadInfo);
        AbstractC38911fr abstractC38911fr = (AbstractC38911fr) iDDListenerS58S0100000_7.l0;
        if (abstractC38911fr != null) {
            if (downloadInfo != null) {
                i = downloadInfo.getDownloadProcess();
                downloadInfo.getCurBytes();
                downloadInfo.getTotalBytes();
            } else {
                i = 0;
            }
            abstractC38911fr.LJJIJL(i);
        }
    }

    public static final void onProgress$1(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC43172Gwy interfaceC43172Gwy = (InterfaceC43172Gwy) iDDListenerS58S0100000_7.l0;
            int curBytes = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
            if (interfaceC43172Gwy != null) {
                interfaceC43172Gwy.onProgress(curBytes);
            }
        }
    }

    public static final void onProgress$2(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        int i;
        long j;
        long j2;
        super.onProgress(downloadInfo);
        AbstractC42411Gkh abstractC42411Gkh = (AbstractC42411Gkh) iDDListenerS58S0100000_7.l0;
        if (abstractC42411Gkh != null) {
            if (downloadInfo != null) {
                i = downloadInfo.getDownloadProcess();
                j = downloadInfo.getCurBytes();
                j2 = downloadInfo.getTotalBytes();
            } else {
                i = 0;
                j = 0;
                j2 = 100;
            }
            abstractC42411Gkh.LIZJ(i, j, j2);
        }
    }

    public static final void onProgress$3(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        long j;
        long j2;
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            j = downloadInfo.getCurBytes();
            j2 = downloadInfo.getTotalBytes();
        } else {
            j = 0;
            j2 = 100;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SHOUTOUTTOOLSShoutOutVideoDownloader onProgress");
        LIZ.append((int) (((((float) j) * 1.0f) / ((float) j2)) * 100));
        H78.LIZ(X1D.LIZIZ(LIZ));
    }

    public static final void onStart$0(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        InterfaceC43172Gwy interfaceC43172Gwy = (InterfaceC43172Gwy) iDDListenerS58S0100000_7.l0;
        if (interfaceC43172Gwy != null) {
            interfaceC43172Gwy.LIZLLL(downloadInfo);
        }
    }

    public static final void onStart$1(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        AbstractC42411Gkh abstractC42411Gkh = (AbstractC42411Gkh) iDDListenerS58S0100000_7.l0;
        if (abstractC42411Gkh != null) {
            abstractC42411Gkh.LIZLLL();
        }
    }

    public static final void onSuccessed$0(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        ((GMU) iDDListenerS58S0100000_7.l0).onSuccess();
    }

    public static final void onSuccessed$1(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        AbstractC38911fr abstractC38911fr = (AbstractC38911fr) iDDListenerS58S0100000_7.l0;
        if (abstractC38911fr != null) {
            if (downloadInfo != null) {
                str = downloadInfo.getUrl();
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (downloadInfo != null) {
                String savePath = downloadInfo.getSavePath();
                if (savePath != null && ujb.o.LJJJJ(savePath, "/", false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(downloadInfo.getSavePath());
                    LIZ.append(downloadInfo.getName());
                    str2 = X1D.LIZIZ(LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(downloadInfo.getSavePath());
                    LIZ2.append(File.separator);
                    LIZ2.append(downloadInfo.getName());
                    str2 = X1D.LIZIZ(LIZ2);
                }
            }
            abstractC38911fr.LJJIJLIJ(str, str2);
        }
    }

    public static final void onSuccessed$2(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        Integer num;
        super.onSuccessed(downloadInfo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success");
        String str = null;
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getId());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(' ');
        if (downloadInfo != null) {
            str = downloadInfo.getSavePath();
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (downloadInfo == null) {
            InterfaceC43172Gwy interfaceC43172Gwy = (InterfaceC43172Gwy) iDDListenerS58S0100000_7.l0;
            if (interfaceC43172Gwy != null) {
                interfaceC43172Gwy.LIZIZ();
                return;
            }
            return;
        }
        String savePath = downloadInfo.getSavePath();
        o.LJIIIIZZ(savePath, "entity.savePath");
        if (ujb.o.LJJJJ(savePath, "/", false)) {
            InterfaceC43172Gwy interfaceC43172Gwy2 = (InterfaceC43172Gwy) iDDListenerS58S0100000_7.l0;
            if (interfaceC43172Gwy2 == null) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(downloadInfo.getSavePath());
            LIZ2.append(downloadInfo.getName());
            interfaceC43172Gwy2.LIZJ(X1D.LIZIZ(LIZ2));
            return;
        }
        InterfaceC43172Gwy interfaceC43172Gwy3 = (InterfaceC43172Gwy) iDDListenerS58S0100000_7.l0;
        if (interfaceC43172Gwy3 == null) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(downloadInfo.getSavePath());
        LIZ3.append('/');
        LIZ3.append(downloadInfo.getName());
        interfaceC43172Gwy3.LIZJ(X1D.LIZIZ(LIZ3));
    }

    public static final void onSuccessed$3(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC65052gv interfaceC65052gv = (InterfaceC65052gv) iDDListenerS58S0100000_7.l0;
            String savePath = downloadInfo.getSavePath();
            o.LJIIIIZZ(savePath, "entity.savePath");
            if (ujb.o.LJJJJ(savePath, "/", false)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(downloadInfo.getSavePath());
                LIZ.append(downloadInfo.getName());
                ((C73578SuE) interfaceC65052gv).onSuccess(X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(downloadInfo.getSavePath());
                LIZ2.append('/');
                LIZ2.append(downloadInfo.getName());
                ((C73578SuE) interfaceC65052gv).onSuccess(X1D.LIZIZ(LIZ2));
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        ((C73578SuE) ((InterfaceC65052gv) iDDListenerS58S0100000_7.l0)).onSuccess("");
    }

    public static final void onSuccessed$4(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC65052gv interfaceC65052gv = (InterfaceC65052gv) iDDListenerS58S0100000_7.l0;
            String savePath = downloadInfo.getSavePath();
            o.LJIIIIZZ(savePath, "it.savePath");
            if (ujb.o.LJJJJ(savePath, "/", false)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(downloadInfo.getSavePath());
                LIZ.append(downloadInfo.getName());
                ((C73578SuE) interfaceC65052gv).onSuccess(X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(downloadInfo.getSavePath());
                LIZ2.append('/');
                LIZ2.append(downloadInfo.getName());
                ((C73578SuE) interfaceC65052gv).onSuccess(X1D.LIZIZ(LIZ2));
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        ((C73578SuE) ((InterfaceC65052gv) iDDListenerS58S0100000_7.l0)).onSuccess("");
    }

    public static final void onSuccessed$5(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        FeedCaptionView feedCaptionView = (FeedCaptionView) iDDListenerS58S0100000_7.l0;
        if (downloadInfo != null) {
            str = downloadInfo.getTargetFilePath();
        } else {
            str = null;
        }
        feedCaptionView.LJJIJIIJI(str);
    }

    public static final void onSuccessed$6(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        AbstractC42411Gkh abstractC42411Gkh = (AbstractC42411Gkh) iDDListenerS58S0100000_7.l0;
        if (abstractC42411Gkh != null) {
            if (downloadInfo != null) {
                str = downloadInfo.getUrl();
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (downloadInfo != null) {
                String savePath = downloadInfo.getSavePath();
                if (savePath != null && ujb.o.LJJJJ(savePath, "/", false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(downloadInfo.getSavePath());
                    LIZ.append(downloadInfo.getName());
                    str2 = X1D.LIZIZ(LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(downloadInfo.getSavePath());
                    LIZ2.append(File.separator);
                    LIZ2.append(downloadInfo.getName());
                    str2 = X1D.LIZIZ(LIZ2);
                }
            }
            abstractC42411Gkh.LJ(str, str2);
        }
    }

    public static final void onSuccessed$7(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        Downloader.getInstance(C5L7.LIZ()).removeSubThreadListener(((ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0).LJLJJLL, iDDListenerS58S0100000_7);
        if (C16880lQ.LLJJIJIL(((ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0).LJLJJL.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) < 0) {
            ShoutoutVideoDownloadListener shoutoutVideoDownloadListener = ((ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0).LJLJJI;
            if (shoutoutVideoDownloadListener != null) {
                shoutoutVideoDownloadListener.onSuccess("");
                return;
            }
            return;
        }
        if (downloadInfo != null) {
            ShoutOutVideoDownloader shoutOutVideoDownloader = (ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0;
            shoutOutVideoDownloader.LJLJJLL = -1;
            ShoutoutVideoDownloadListener shoutoutVideoDownloadListener2 = shoutOutVideoDownloader.LJLJJI;
            if (shoutoutVideoDownloadListener2 != null) {
                shoutoutVideoDownloadListener2.onSuccess(ShoutOutVideoDownloader.LIZ(downloadInfo));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SHOUTOUTTOOLSShoutOutVideoDownloader onSuccessed");
        String str2 = null;
        if (downloadInfo != null) {
            ((ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0).getClass();
            str = ShoutOutVideoDownloader.LIZ(downloadInfo);
        } else {
            str = null;
        }
        LIZ.append(str);
        H78.LIZ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onSuccessed");
        if (downloadInfo != null) {
            ((ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0).getClass();
            str2 = ShoutOutVideoDownloader.LIZ(downloadInfo);
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
    }

    public static final void onSuccessed$8(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo) {
        String LIZIZ;
        super.onSuccessed(downloadInfo);
        ForwardMediaDownloader.DownloadListener downloadListener = (ForwardMediaDownloader.DownloadListener) iDDListenerS58S0100000_7.l0;
        if (downloadListener != null) {
            if (downloadInfo == null) {
                LIZIZ = "";
            } else {
                String savePath = downloadInfo.getSavePath();
                if (savePath != null && ujb.o.LJJJJ(savePath, "/", false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(downloadInfo.getSavePath());
                    LIZ.append(downloadInfo.getName());
                    LIZIZ = X1D.LIZIZ(LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(downloadInfo.getSavePath());
                    LIZ2.append(File.separator);
                    LIZ2.append(downloadInfo.getName());
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
            }
            downloadListener.onSuccess(LIZIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r0 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onFailed$0(com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7 r1, com.ss.android.socialbase.downloader.model.DownloadInfo r2, com.ss.android.socialbase.downloader.exception.BaseException r3) {
        /*
            java.lang.Object r2 = r1.l0
            X.GMU r2 = (X.GMU) r2
            if (r3 != 0) goto Lf
            r1 = 1149(0x47d, float:1.61E-42)
        L9:
            java.lang.String r0 = ""
        Lb:
            r2.LIZ(r1, r0)
            return
        Lf:
            int r0 = r3.getErrorCode()
            if (r0 == 0) goto L20
            int r1 = r3.getErrorCode()
        L19:
            java.lang.String r0 = r3.getErrorMessage()
            if (r0 != 0) goto Lb
            goto L9
        L20:
            r1 = 1148(0x47c, float:1.609E-42)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7.onFailed$0(com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7, com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException):void");
    }

    public static final void onFailed$1(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        AbstractC38911fr abstractC38911fr = (AbstractC38911fr) iDDListenerS58S0100000_7.l0;
        if (abstractC38911fr != null) {
            if (baseException != null) {
                baseException.getErrorMessage();
                baseException.getErrorCode();
            }
            abstractC38911fr.LJJIIZI();
        }
    }

    public static final void onFailed$2(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        Integer num;
        String LIZIZ;
        super.onFailed(downloadInfo, baseException);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed");
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getId());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        InterfaceC43172Gwy interfaceC43172Gwy = (InterfaceC43172Gwy) iDDListenerS58S0100000_7.l0;
        if (interfaceC43172Gwy != null) {
            interfaceC43172Gwy.LIZIZ();
        }
        if (downloadInfo != null) {
            String savePath = downloadInfo.getSavePath();
            o.LJIIIIZZ(savePath, "it.savePath");
            if (ujb.o.LJJJJ(savePath, "/", false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(downloadInfo.getSavePath());
                LIZ2.append(downloadInfo.getName());
                LIZIZ = X1D.LIZIZ(LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(downloadInfo.getSavePath());
                LIZ3.append('/');
                LIZ3.append(downloadInfo.getName());
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            if (C39579Fg7.LIZIZ(LIZIZ)) {
                C39579Fg7.LJIL(LIZIZ);
            }
        }
    }

    public static final void onFailed$3(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        ((C73578SuE) ((InterfaceC65052gv) iDDListenerS58S0100000_7.l0)).onSuccess("");
    }

    public static final void onFailed$4(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        ((C73578SuE) ((InterfaceC65052gv) iDDListenerS58S0100000_7.l0)).onSuccess("");
    }

    public static final void onFailed$5(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        String str2;
        String url;
        super.onFailed(downloadInfo, baseException);
        FeedCaptionView feedCaptionView = (FeedCaptionView) iDDListenerS58S0100000_7.l0;
        Aweme aweme = feedCaptionView.LJLLI;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (downloadInfo != null && (url = downloadInfo.getUrl()) != null) {
            str4 = url;
        }
        FeedCaptionView.LJJIJLIJ(feedCaptionView, 1, str, str4, 0L, null, baseException, 16);
        FeedCaptionView feedCaptionView2 = (FeedCaptionView) iDDListenerS58S0100000_7.l0;
        if (downloadInfo != null) {
            str2 = downloadInfo.getTargetFilePath();
            str3 = downloadInfo.getUrl();
        } else {
            str2 = null;
        }
        feedCaptionView2.LJJIL(str2, str3, baseException);
    }

    public static final void onFailed$6(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        AbstractC42411Gkh abstractC42411Gkh = (AbstractC42411Gkh) iDDListenerS58S0100000_7.l0;
        if (abstractC42411Gkh != null) {
            Integer num = null;
            if (baseException != null) {
                str = baseException.getErrorMessage();
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                str = null;
            }
            abstractC42411Gkh.LIZIZ(baseException, num, str);
        }
    }

    public static final void onFailed$7(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        ShoutoutVideoDownloadListener shoutoutVideoDownloadListener = ((ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0).LJLJJI;
        if (shoutoutVideoDownloadListener != null) {
            shoutoutVideoDownloadListener.onFail();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SHOUTOUTTOOLSShoutOutVideoDownloader onFailure");
        String str2 = null;
        if (baseException != null) {
            str = baseException.getErrorMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        H78.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onFailure");
        if (baseException != null) {
            str2 = baseException.getErrorMessage();
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        Downloader.getInstance(C5L7.LIZ()).removeSubThreadListener(((ShoutOutVideoDownloader) iDDListenerS58S0100000_7.l0).LJLJJLL, iDDListenerS58S0100000_7);
    }

    public static final void onFailed$8(IDDListenerS58S0100000_7 iDDListenerS58S0100000_7, DownloadInfo downloadInfo, BaseException baseException) {
        int i;
        String str;
        super.onFailed(downloadInfo, baseException);
        ForwardMediaDownloader.DownloadListener downloadListener = (ForwardMediaDownloader.DownloadListener) iDDListenerS58S0100000_7.l0;
        if (downloadListener != null) {
            if (baseException != null) {
                i = baseException.getErrorCode();
                str = baseException.getErrorMessage();
            } else {
                i = -1;
                str = null;
            }
            ForwardMediaDownloader.DownloadListener.DefaultImpls.onError$default(downloadListener, i, str, baseException, null, 8, null);
        }
    }
}
