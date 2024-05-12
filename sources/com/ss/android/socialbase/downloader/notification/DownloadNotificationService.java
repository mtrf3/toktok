package com.ss.android.socialbase.downloader.notification;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C65210PiY;
import X.C66163Pxv;
import X.C84212X3g;
import X.C84352X8q;
import X.C84763XOl;
import X.X1D;
import X.X3K;
import X.X3L;
import X.X3M;
import X.X3P;
import X.X4H;
import Y.ARunnableS14S1200000_15;
import Y.ARunnableS18S0201000_15;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;

/* loaded from: classes16.dex */
public class DownloadNotificationService extends Service {
    public static volatile long LJLJLJ;
    public static volatile long LJLJLLL;
    public static boolean LJLL;
    public C84352X8q LJLIL;
    public final SparseArray<Notification> LJLILLLLZI = new SparseArray<>(2);
    public static final String LJLJI = C16880lQ.LJLLJ(DownloadNotificationService.class);
    public static int LJLJJI = -1;
    public static int LJLJJL = -1;
    public static boolean LJLJJLL = true;
    public static boolean LJLJL = false;
    public static long LJLLI = 1000;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.LJLIL == null) {
            C84352X8q c84352X8q = new C84352X8q();
            this.LJLIL = c84352X8q;
            c84352X8q.LIZJ.start();
        }
        C84212X3g.LJIL(this);
        X4H x4h = X4H.LJFF;
        int LJIIIIZZ = x4h.LJIIIIZZ("download_service_foreground", 0);
        if ((LJIIIIZZ == 1 || LJIIIIZZ == 3) && LJLJJI == -1) {
            LJLJJI = 0;
        }
        if ((LJIIIIZZ == 2 || LJIIIIZZ == 3) && LJLJJL == -1) {
            LJLJJL = 0;
        }
        LJLJL = x4h.LJI("non_going_notification_foreground", false);
        LJLL = x4h.LJI("notify_too_fast", true);
        long LJIIJ = x4h.LJIIJ("notification_time_window", 1000L);
        LJLLI = LJIIJ;
        if (LJIIJ < 0 || LJIIJ > 1200) {
            LJLLI = 1000L;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C84352X8q c84352X8q = this.LJLIL;
        if (c84352X8q != null) {
            try {
                c84352X8q.LIZJ.quit();
            } catch (Throwable unused) {
            }
            this.LJLIL = null;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    public static void LIZ(NotificationManager notificationManager, int i) {
        boolean z;
        SparseArray<X3M> allNotificationItems;
        int i2 = LJLJJI;
        try {
            if (i2 == i || LJLJJL == i) {
                if (i2 == i) {
                    LJLJJI = 0;
                    z = false;
                } else {
                    LJLJJL = 0;
                    z = true;
                }
                try {
                    X3L LIZIZ = X3K.LJ().LIZIZ(i);
                    if (!LIZIZ.LJJIJLIJ()) {
                        LJLJJLL = false;
                        if (C65210PiY.LIZ()) {
                            String str = LJLJI;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Yry to stopForeground when is not Foreground, id = ");
                            LIZ.append(i);
                            LIZ.append(", isIndependentProcess = ");
                            LIZ.append(z);
                            C65210PiY.LIZIZ(str, "doCancel", X1D.LIZIZ(LIZ));
                        }
                    }
                    if (C65210PiY.LIZ()) {
                        String str2 = LJLJI;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("StopForeground id = ");
                        LIZ2.append(i);
                        LIZ2.append(", isIndependentProcess = ");
                        LIZ2.append(z);
                        C65210PiY.LIZIZ(str2, "doCancel", X1D.LIZIZ(LIZ2));
                    }
                    LIZIZ.LJJIIJZLJL(true);
                } catch (Throwable unused) {
                }
                try {
                    notificationManager.cancel(i);
                } catch (Throwable unused2) {
                }
                if (LJLJJLL && (allNotificationItems = X3P.LIZ().getAllNotificationItems()) != null) {
                    for (int size = allNotificationItems.size() - 1; size >= 0; size--) {
                        allNotificationItems.valueAt(size);
                    }
                    return;
                }
                return;
            }
            notificationManager.cancel(i);
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0059, code lost:
    
        if (com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJL == 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJLL
            r2 = 1
            if (r0 != 0) goto L1c
        L5:
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJI
            if (r0 == r7) goto Ld
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJL
            if (r0 != r7) goto Lc2
        Ld:
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJL
            if (r0 == 0) goto Lc2
            int r0 = r8.flags
            r0 = r0 & 2
            if (r0 != 0) goto Lc2
            LIZ(r6, r7)
            goto Lc2
        L1c:
            int r1 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJI
            if (r1 == r7) goto L5
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJL
            if (r0 != r7) goto L25
            goto L5
        L25:
            if (r1 == 0) goto L2a
            if (r0 == 0) goto L2a
            goto L5
        L2a:
            boolean r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJL
            if (r0 == 0) goto L35
            int r0 = r8.flags
            r0 = r0 & 2
            if (r0 != 0) goto L35
            goto L5
        L35:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L46
            java.lang.String r0 = r8.getChannelId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L46
            goto L5
        L46:
            X.X3K r0 = X.X3K.LJ()     // Catch: java.lang.Throwable -> Lc2
            int r0 = r0.LIZJ(r7)     // Catch: java.lang.Throwable -> Lc2
            if (r0 != r2) goto L68
            boolean r0 = X.X4P.LJIIL()     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto L68
            r4 = 1
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJL     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto Lc2
        L5b:
            X.X3K r0 = X.X3K.LJ()     // Catch: java.lang.Throwable -> Lc2
            X.X3L r5 = r0.LIZIZ(r7)     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r5.LIZJ()     // Catch: java.lang.Throwable -> Lc2
            goto L6e
        L68:
            r4 = 0
            int r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJI     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto Lc2
            goto L5b
        L6e:
            java.lang.String r3 = "doNotify"
            if (r0 == 0) goto La7
            boolean r0 = r5.LJJIJLIJ()     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto La7
            boolean r0 = X.C65210PiY.LIZ()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L9b
            java.lang.String r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJI     // Catch: java.lang.Throwable -> Lc2
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "StartForeground, id = "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc2
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = ", isIndependentProcess = "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc2
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lc2
            X.C65210PiY.LIZIZ(r2, r3, r0)     // Catch: java.lang.Throwable -> Lc2
        L9b:
            if (r4 == 0) goto L9e
            goto La1
        L9e:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJI = r7     // Catch: java.lang.Throwable -> Lc2
            goto La3
        La1:
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJJL = r7     // Catch: java.lang.Throwable -> Lc2
        La3:
            r5.LJJLIIIJJI(r7, r8)     // Catch: java.lang.Throwable -> Lc2
            goto Lc2
        La7:
            boolean r0 = X.C65210PiY.LIZ()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Lc2
            java.lang.String r2 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJI     // Catch: java.lang.Throwable -> Lc2
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "CanStartForeground = true, but proxy can not startForeground, isIndependentProcess = "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc2
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lc2
            X.C65210PiY.LIZIZ(r2, r3, r0)     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld1
            long r1 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJLJ     // Catch: java.lang.Throwable -> Ld1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lce
            com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LJLJLJ = r3     // Catch: java.lang.Throwable -> Ld1
        Lce:
            r6.notify(r7, r8)     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.LIZJ(android.app.NotificationManager, int, android.app.Notification):void");
    }

    public final void LIZIZ(NotificationManager notificationManager, int i, Notification notification) {
        synchronized (this.LJLILLLLZI) {
            int indexOfKey = this.LJLILLLLZI.indexOfKey(i);
            if (indexOfKey >= 0 && indexOfKey < this.LJLILLLLZI.size()) {
                this.LJLILLLLZI.setValueAt(indexOfKey, notification);
                return;
            }
            long currentTimeMillis = LJLLI - (System.currentTimeMillis() - LJLJLJ);
            if (currentTimeMillis <= 0) {
                currentTimeMillis = 0;
            } else if (currentTimeMillis > 20000) {
                currentTimeMillis = 20000;
            }
            long currentTimeMillis2 = System.currentTimeMillis() + currentTimeMillis;
            LJLJLLL = currentTimeMillis2;
            LJLJLJ = currentTimeMillis2;
            if (currentTimeMillis <= 0) {
                LIZJ(notificationManager, i, notification);
            } else {
                if (this.LJLIL == null) {
                    return;
                }
                synchronized (this.LJLILLLLZI) {
                    this.LJLILLLLZI.put(i, notification);
                }
                this.LJLIL.LIZ(new ARunnableS18S0201000_15(i, notificationManager, this, 0), currentTimeMillis);
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C84352X8q c84352X8q;
        C66163Pxv.LIZ(this, intent, i, i2);
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action) || (c84352X8q = this.LJLIL) == null) {
            return 2;
        }
        c84352X8q.LIZ(new ARunnableS14S1200000_15(this, action, intent, 4), 0L);
        return 2;
    }
}
