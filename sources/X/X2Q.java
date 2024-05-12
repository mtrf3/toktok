package X;

import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* loaded from: classes16.dex */
public final class X2Q extends X2N {
    public final /* synthetic */ DownloadTask LJLILLLLZI;

    @Override // X.InterfaceC84198X2s
    public final X2Z L9() {
        IDownloadDepend depend = this.LJLILLLLZI.getDepend();
        if (depend == null) {
            return null;
        }
        return new X2Y(depend);
    }

    @Override // X.InterfaceC84198X2s
    public final InterfaceC84196X2q LJJLIIIJLJLI() {
        InterfaceC84194X2o monitorDepend = this.LJLILLLLZI.getMonitorDepend();
        if (monitorDepend == null) {
            return null;
        }
        return new BinderC84193X2n(monitorDepend);
    }

    @Override // X.InterfaceC84198X2s
    public final X1B M9() {
        X1C forbiddenHandler = this.LJLILLLLZI.getForbiddenHandler();
        if (forbiddenHandler == null) {
            return null;
        }
        return new X1A(forbiddenHandler);
    }

    @Override // X.InterfaceC84198X2s
    public final DownloadInfo N9() {
        return this.LJLILLLLZI.getDownloadInfo();
    }

    @Override // X.InterfaceC84198X2s
    public final X2X O9() {
        InterfaceC84187X2h notificationEventListener = this.LJLILLLLZI.getNotificationEventListener();
        if (notificationEventListener == null) {
            return null;
        }
        return new X2T(notificationEventListener);
    }

    @Override // X.InterfaceC84198X2s
    public final X20 P9() {
        X21 diskSpaceHandler = this.LJLILLLLZI.getDiskSpaceHandler();
        if (diskSpaceHandler == null) {
            return null;
        }
        return new BinderC84178X1y(diskSpaceHandler);
    }

    @Override // X.InterfaceC84198X2s
    public final int R9() {
        return this.LJLILLLLZI.getDownloadCompleteHandlers().size();
    }

    @Override // X.InterfaceC84198X2s
    public final InterfaceC84167X1n S9() {
        InterfaceC84169X1p interceptor = this.LJLILLLLZI.getInterceptor();
        if (interceptor == null) {
            return null;
        }
        return new BinderC84166X1m(interceptor);
    }

    @Override // X.InterfaceC84198X2s
    public final X25 T9() {
        X27 retryDelayTimeCalculator = this.LJLILLLLZI.getRetryDelayTimeCalculator();
        if (retryDelayTimeCalculator == null) {
            return null;
        }
        return new X24(retryDelayTimeCalculator);
    }

    @Override // X.InterfaceC84198X2s
    public final X2W V9() {
        InterfaceC84186X2g notificationClickCallback = this.LJLILLLLZI.getNotificationClickCallback();
        if (notificationClickCallback == null) {
            return null;
        }
        return new X2U(notificationClickCallback);
    }

    @Override // X.InterfaceC84198X2s
    public final X29 getFileProvider() {
        X2C fileUriProvider = this.LJLILLLLZI.getFileUriProvider();
        if (fileUriProvider == null) {
            return null;
        }
        return new X2A(fileUriProvider);
    }

    public X2Q(DownloadTask downloadTask) {
        this.LJLILLLLZI = downloadTask;
    }

    @Override // X.InterfaceC84198X2s
    public final InterfaceC84181X2b U9(int i) {
        InterfaceC84183X2d downloadCompleteHandlerByIndex = this.LJLILLLLZI.getDownloadCompleteHandlerByIndex(i);
        if (downloadCompleteHandlerByIndex == null) {
            return null;
        }
        return new X2V(downloadCompleteHandlerByIndex);
    }

    @Override // X.InterfaceC84198X2s
    public final int W9(int i) {
        return this.LJLILLLLZI.getDownloadListenerSize(X4P.LJ(i));
    }

    @Override // X.InterfaceC84198X2s
    public final X32 X9(int i) {
        boolean z;
        IDownloadListener singleDownloadListener = this.LJLILLLLZI.getSingleDownloadListener(X4P.LJ(i));
        if (i == EnumC84256X4y.SUB.ordinal()) {
            z = false;
        } else {
            z = true;
        }
        if (singleDownloadListener == null) {
            return null;
        }
        return new BinderC84205X2z(singleDownloadListener, z);
    }

    @Override // X.InterfaceC84198X2s
    public final X32 Q9(int i, int i2) {
        boolean z;
        IDownloadListener downloadListenerByIndex = this.LJLILLLLZI.getDownloadListenerByIndex(X4P.LJ(i), i2);
        if (i == EnumC84256X4y.SUB.ordinal()) {
            z = false;
        } else {
            z = true;
        }
        if (downloadListenerByIndex == null) {
            return null;
        }
        return new BinderC84205X2z(downloadListenerByIndex, z);
    }
}
