package com.ss.android.socialbase.downloader.service;

import X.X3M;
import android.app.Notification;
import android.util.SparseArray;

/* loaded from: classes16.dex */
public interface IDownloadNotificationManagerService {

    /* loaded from: classes16.dex */
    public static class DefaultDownloadNotificationManagerService implements IDownloadNotificationManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void addNotification(X3M x3m) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void cancel(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void cancelNotification(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void clearNotification() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public SparseArray<X3M> getAllNotificationItems() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public X3M getNotificationItem(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void hideNotification(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void notifyByService(int i, int i2, Notification notification) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public X3M removeNotification(int i) {
            return null;
        }
    }

    void addNotification(X3M x3m);

    void cancel(int i);

    void cancelNotification(int i);

    void clearNotification();

    SparseArray<X3M> getAllNotificationItems();

    X3M getNotificationItem(int i);

    void hideNotification(int i);

    void notifyByService(int i, int i2, Notification notification);

    X3M removeNotification(int i);
}
