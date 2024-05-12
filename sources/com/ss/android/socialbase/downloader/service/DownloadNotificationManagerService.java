package com.ss.android.socialbase.downloader.service;

import X.C16880lQ;
import X.C84212X3g;
import X.X3M;
import X.X3O;
import X.X3P;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;

/* loaded from: classes16.dex */
public class DownloadNotificationManagerService implements IDownloadNotificationManagerService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void clearNotification() {
        SparseArray<X3M> clone;
        X3O LIZ = X3O.LIZ();
        synchronized (LIZ.LIZIZ) {
            clone = LIZ.LIZIZ.clone();
            LIZ.LIZIZ.clear();
        }
        for (int i = 0; i < clone.size(); i++) {
            clone.get(clone.keyAt(i)).getClass();
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public SparseArray<X3M> getAllNotificationItems() {
        SparseArray<X3M> sparseArray;
        X3O LIZ = X3O.LIZ();
        synchronized (LIZ.LIZIZ) {
            sparseArray = LIZ.LIZIZ;
        }
        return sparseArray;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void addNotification(X3M x3m) {
        X3O LIZ = X3O.LIZ();
        if (x3m == null) {
            LIZ.getClass();
            return;
        }
        synchronized (LIZ.LIZIZ) {
            LIZ.LIZIZ.put(0, x3m);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void cancel(int i) {
        X3O.LIZ().getClass();
        Context LJ = C84212X3g.LJ();
        if (LJ == null || i == 0) {
            return;
        }
        try {
            Intent intent = new Intent(LJ, (Class<?>) DownloadNotificationService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
            C16880lQ.LLLL(LJ, intent);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void cancelNotification(int i) {
        X3O LIZ = X3O.LIZ();
        if (i == 0) {
            LIZ.getClass();
            return;
        }
        synchronized (LIZ.LIZIZ) {
            if (LIZ.LIZIZ.get(i) != null) {
                LIZ.LIZIZ.remove(i);
            }
        }
        X3P.LIZ().cancel(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public X3M getNotificationItem(int i) {
        X3M x3m;
        X3O LIZ = X3O.LIZ();
        if (i == 0) {
            LIZ.getClass();
            return null;
        }
        synchronized (LIZ.LIZIZ) {
            x3m = LIZ.LIZIZ.get(i);
        }
        return x3m;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void hideNotification(int i) {
        int id;
        X3O LIZ = X3O.LIZ();
        LIZ.getClass();
        DownloadInfo downloadInfo = Downloader.getInstance(C84212X3g.LJ()).getDownloadInfo(i);
        if (downloadInfo == null) {
            return;
        }
        if (downloadInfo.isDownloadOverStatus()) {
            downloadInfo.setNotificationVisibility(3);
            Downloader.getInstance(C84212X3g.LJ()).updateDownloadInfo(downloadInfo);
        }
        if (!downloadInfo.isDownloadOverStatus()) {
            return;
        }
        int notificationVisibility = downloadInfo.getNotificationVisibility();
        if ((notificationVisibility != 1 && notificationVisibility != 3) || (id = downloadInfo.getId()) == 0) {
            return;
        }
        synchronized (LIZ.LIZIZ) {
            if (LIZ.LIZIZ.get(id) != null) {
                LIZ.LIZIZ.remove(id);
            }
        }
        X3P.LIZ().cancel(id);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public X3M removeNotification(int i) {
        X3M x3m;
        X3O LIZ = X3O.LIZ();
        if (i == 0) {
            LIZ.getClass();
            return null;
        }
        synchronized (LIZ.LIZIZ) {
            x3m = LIZ.LIZIZ.get(i);
            if (x3m != null) {
                LIZ.LIZIZ.remove(i);
            }
        }
        return x3m;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public void notifyByService(int i, int i2, Notification notification) {
        X3O LIZ = X3O.LIZ();
        LIZ.getClass();
        Context LJ = C84212X3g.LJ();
        if (LJ == null || i == 0 || notification == null) {
            return;
        }
        if (i2 == 4) {
            synchronized (LIZ.LIZ) {
                Long l = LIZ.LIZ.get(i);
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null && Math.abs(currentTimeMillis - l.longValue()) < 1000) {
                    return;
                } else {
                    LIZ.LIZ.put(i, Long.valueOf(currentTimeMillis));
                }
            }
        }
        try {
            Intent intent = new Intent(LJ, (Class<?>) DownloadNotificationService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY");
            intent.putExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", i2);
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
            intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA", notification);
            C16880lQ.LLLL(LJ, intent);
        } catch (Throwable unused) {
        }
    }
}
