package X;

import android.app.Notification;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService;

/* loaded from: classes16.dex */
public final class X3P implements IDownloadNotificationManagerService {
    public static volatile X3P LIZIZ;
    public final IDownloadNotificationManagerService LIZ = (IDownloadNotificationManagerService) X41.LIZ(IDownloadNotificationManagerService.class);

    public static X3P LIZ() {
        if (LIZIZ == null) {
            synchronized (X3P.class) {
                if (LIZIZ == null) {
                    LIZIZ = new X3P();
                }
            }
        }
        return LIZIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void clearNotification() {
        this.LIZ.clearNotification();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final SparseArray<X3M> getAllNotificationItems() {
        return this.LIZ.getAllNotificationItems();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void addNotification(X3M x3m) {
        this.LIZ.addNotification(x3m);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void cancel(int i) {
        this.LIZ.cancel(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void cancelNotification(int i) {
        this.LIZ.cancelNotification(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final X3M getNotificationItem(int i) {
        return this.LIZ.getNotificationItem(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void hideNotification(int i) {
        this.LIZ.hideNotification(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final X3M removeNotification(int i) {
        return this.LIZ.removeNotification(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void notifyByService(int i, int i2, Notification notification) {
        this.LIZ.notifyByService(i, i2, notification);
    }
}
