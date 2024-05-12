package X;

import Y.ARunnableS34S0200000_15;
import android.app.Notification;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.X2u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class BinderC84200X2u extends AbstractBinderC84199X2t {
    public final X38 LJLILLLLZI = new X38(true);

    static {
        C16880lQ.LJLLJ(BinderC84200X2u.class);
    }

    @Override // X.InterfaceC84202X2w
    public final boolean LJJIJLIJ() {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.LJJIJLIJ();
    }

    @Override // X.InterfaceC84202X2w
    public final void clearData() {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.clearData();
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getAllDownloadInfo() {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return null;
        }
        return x38.getAllDownloadInfo();
    }

    @Override // X.InterfaceC84202X2w
    public final boolean isDownloadCacheSyncSuccess() {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.isDownloadCacheSyncSuccess();
    }

    @Override // X.InterfaceC84202X2w
    public final void pauseAll() {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.pauseAll();
    }

    @Override // X.InterfaceC84202X2w
    public final boolean LJIIL(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.LJIIL(i);
    }

    @Override // X.InterfaceC84202X2w
    public final void LJIILIIL(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LJIILIIL(i);
    }

    @Override // X.InterfaceC84202X2w
    public final boolean LJIILJJIL(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.LJIILJJIL(i);
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJIIJZLJL(boolean z) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LJJIIJZLJL(z);
    }

    @Override // X.InterfaceC84202X2w
    public final int LJJJJ(int i) {
        return X3K.LJ().LIZLLL(i);
    }

    @Override // X.InterfaceC84202X2w
    public final void LLILLL(InterfaceC84160X1g interfaceC84160X1g) {
        if (this.LJLILLLLZI == null || interfaceC84160X1g == null) {
            return;
        }
        ((CopyOnWriteArrayList) C84212X3g.LJJIFFI).add(new C84162X1i(interfaceC84160X1g));
    }

    @Override // X.InterfaceC84202X2w
    public final void LLLJ(InterfaceC84198X2s interfaceC84198X2s) {
        C84184X2e c84184X2e;
        C84168X1o c84168X1o;
        C84180X2a c84180X2a;
        C84197X2r c84197X2r;
        X19 x19;
        C84179X1z c84179X1z;
        X2B x2b;
        C84185X2f c84185X2f;
        X26 x26;
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        DownloadTask downloadTask = null;
        if (interfaceC84198X2s != null) {
            try {
                DownloadTask downloadTask2 = new DownloadTask(interfaceC84198X2s.N9());
                X2X O9 = interfaceC84198X2s.O9();
                if (O9 == null) {
                    c84184X2e = null;
                } else {
                    c84184X2e = new C84184X2e(O9);
                }
                downloadTask2.notificationEventListener(c84184X2e);
                InterfaceC84167X1n S9 = interfaceC84198X2s.S9();
                if (S9 == null) {
                    c84168X1o = null;
                } else {
                    c84168X1o = new C84168X1o(S9);
                }
                downloadTask2.interceptor(c84168X1o);
                X2Z L9 = interfaceC84198X2s.L9();
                if (L9 == null) {
                    c84180X2a = null;
                } else {
                    c84180X2a = new C84180X2a(L9);
                }
                downloadTask2.depend(c84180X2a);
                InterfaceC84196X2q LJJLIIIJLJLI = interfaceC84198X2s.LJJLIIIJLJLI();
                if (LJJLIIIJLJLI == null) {
                    c84197X2r = null;
                } else {
                    c84197X2r = new C84197X2r(LJJLIIIJLJLI);
                }
                downloadTask2.monitorDepend(c84197X2r);
                X1B M9 = interfaceC84198X2s.M9();
                if (M9 == null) {
                    x19 = null;
                } else {
                    x19 = new X19(M9);
                }
                downloadTask2.forbiddenHandler(x19);
                X20 P9 = interfaceC84198X2s.P9();
                if (P9 == null) {
                    c84179X1z = null;
                } else {
                    c84179X1z = new C84179X1z(P9);
                }
                downloadTask2.diskSpaceHandler(c84179X1z);
                X29 fileProvider = interfaceC84198X2s.getFileProvider();
                if (fileProvider == null) {
                    x2b = null;
                } else {
                    x2b = new X2B(fileProvider);
                }
                downloadTask2.fileUriProvider(x2b);
                X2W V9 = interfaceC84198X2s.V9();
                if (V9 == null) {
                    c84185X2f = null;
                } else {
                    c84185X2f = new C84185X2f(V9);
                }
                downloadTask2.notificationClickCallback(c84185X2f);
                X25 T9 = interfaceC84198X2s.T9();
                if (T9 == null) {
                    x26 = null;
                } else {
                    x26 = new X26(T9);
                }
                downloadTask2.retryDelayTimeCalculator(x26);
                EnumC84256X4y enumC84256X4y = EnumC84256X4y.MAIN;
                X32 X9 = interfaceC84198X2s.X9(enumC84256X4y.ordinal());
                if (X9 != null) {
                    downloadTask2.mainThreadListenerWithHashCode(X9.hashCode(), X30.LIZ(X9));
                }
                EnumC84256X4y enumC84256X4y2 = EnumC84256X4y.SUB;
                X32 X92 = interfaceC84198X2s.X9(enumC84256X4y2.ordinal());
                if (X92 != null) {
                    downloadTask2.subThreadListenerWithHashCode(X92.hashCode(), X30.LIZ(X92));
                }
                EnumC84256X4y enumC84256X4y3 = EnumC84256X4y.NOTIFICATION;
                X32 X93 = interfaceC84198X2s.X9(enumC84256X4y3.ordinal());
                if (X93 != null) {
                    downloadTask2.notificationListenerWithHashCode(X93.hashCode(), X30.LIZ(X93));
                }
                X30.LIZIZ(downloadTask2, interfaceC84198X2s, enumC84256X4y);
                X30.LIZIZ(downloadTask2, interfaceC84198X2s, enumC84256X4y2);
                X30.LIZIZ(downloadTask2, interfaceC84198X2s, enumC84256X4y3);
                for (int i = 0; i < interfaceC84198X2s.R9(); i++) {
                    InterfaceC84181X2b U9 = interfaceC84198X2s.U9(i);
                    if (U9 != null) {
                        downloadTask2.addDownloadCompleteHandler(new C84182X2c(U9));
                    }
                }
                downloadTask = downloadTask2;
            } catch (RemoteException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        x38.LJFF(new ARunnableS34S0200000_15(downloadTask, x38, 12));
    }

    @Override // X.InterfaceC84202X2w
    public final boolean canResume(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.canResume(i);
    }

    @Override // X.InterfaceC84202X2w
    public final void forceDownloadIngoreRecommendSize(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.forceDownloadIngoreRecommendSize(i);
    }

    @Override // X.InterfaceC84202X2w
    public final long getCurBytes(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return 0L;
        }
        return x38.getCurBytes(i);
    }

    @Override // X.InterfaceC84202X2w
    public final X29 getDownloadFileUriProvider(int i) {
        X2C downloadFileUriProvider;
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null || (downloadFileUriProvider = x38.getDownloadFileUriProvider(i)) == null) {
            return null;
        }
        return new X2A(downloadFileUriProvider);
    }

    @Override // X.InterfaceC84202X2w
    public final DownloadInfo getDownloadInfo(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return null;
        }
        return x38.getDownloadInfo(i);
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return null;
        }
        return x38.getDownloadInfoList(str);
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return null;
        }
        return x38.getDownloadInfosByFileExtension(str);
    }

    @Override // X.InterfaceC84202X2w
    public final X2X getDownloadNotificationEventListener(int i) {
        InterfaceC84187X2h downloadNotificationEventListener;
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null || (downloadNotificationEventListener = x38.getDownloadNotificationEventListener(i)) == null) {
            return null;
        }
        return new X2T(downloadNotificationEventListener);
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return null;
        }
        return x38.getDownloadingDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC84202X2w
    public final X2W getNotificationClickCallback(int i) {
        InterfaceC84186X2g notificationClickCallback;
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null || (notificationClickCallback = x38.getNotificationClickCallback(i)) == null) {
            return null;
        }
        return new X2U(notificationClickCallback);
    }

    @Override // X.InterfaceC84202X2w
    public final int getStatus(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return 0;
        }
        return x38.getStatus(i);
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return null;
        }
        return x38.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return null;
        }
        return x38.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC84202X2w
    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // X.InterfaceC84202X2w
    public final boolean isDownloading(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.isDownloading(i);
    }

    @Override // X.InterfaceC84202X2w
    public final void restart(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.restart(i);
    }

    @Override // X.InterfaceC84202X2w
    public final void restartAllFailedDownloadTasks(List<String> list) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.restartAllFailedDownloadTasks(list);
    }

    @Override // X.InterfaceC84202X2w
    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 != null) {
            x38.restartAllPauseReserveOnWifiDownloadTasks(list);
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void resume(int i) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.resume(i);
    }

    @Override // X.InterfaceC84202X2w
    public final void setLogLevel(int i) {
        if (this.LJLILLLLZI == null) {
            return;
        }
        C65210PiY.LIZ = i;
    }

    @Override // X.InterfaceC84202X2w
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return false;
        }
        return x38.updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJJI(int i, boolean z) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LJJJI(i, z);
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJJJIZL(int i, boolean z) {
        X3K.LJ().LJII(i, z);
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJLIIIJJI(int i, Notification notification) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LJJLIIIJJI(i, notification);
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJLIIIJLLLLLLLZ(int i, int i2) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LJJLIIIJLLLLLLLZ(i, i2);
    }

    @Override // X.InterfaceC84202X2w
    public final void LLLF(int i, X2X x2x) {
        C84184X2e c84184X2e;
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        if (x2x == null) {
            c84184X2e = null;
        } else {
            c84184X2e = new C84184X2e(x2x);
        }
        x38.setDownloadNotificationEventListener(i, c84184X2e);
    }

    @Override // X.InterfaceC84202X2w
    public final void cancel(int i, boolean z) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.cancel(i, z);
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJIFFI(int i, boolean z, boolean z2) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LJJIFFI(i, z, z2);
    }

    @Override // X.InterfaceC84202X2w
    public final void setThrottleNetSpeed(int i, long j, int i2) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.setThrottleNetSpeed(i, j, i2);
    }

    @Override // X.InterfaceC84202X2w
    public final void LLJJL(int i, int i2, X32 x32, int i3, boolean z) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LJ(i, i2, X30.LIZ(x32), X4P.LJ(i3), z);
    }

    @Override // X.InterfaceC84202X2w
    public final void d0(int i, int i2, X32 x32, int i3, boolean z) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LIZIZ(i, i2, X30.LIZ(x32), X4P.LJ(i3), z);
    }

    @Override // X.InterfaceC84202X2w
    public final void LLLLIILL(int i, int i2, X32 x32, int i3, boolean z, boolean z2) {
        X38 x38 = this.LJLILLLLZI;
        if (x38 == null) {
            return;
        }
        x38.LIZLLL(i, i2, X30.LIZ(x32), X4P.LJ(i3), z, z2);
    }
}
