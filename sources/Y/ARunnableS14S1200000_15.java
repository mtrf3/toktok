package Y;

import X.C16880lQ;
import X.C36661cE;
import X.C38891fp;
import X.C47789IpF;
import X.C84212X3g;
import X.C84352X8q;
import X.C86808Y5c;
import X.C87260YMm;
import X.EnumC87257YMj;
import X.ORZ;
import X.X4U;
import X.X5A;
import X.X5M;
import X.Y5W;
import X.Y5Y;
import X.YMV;
import X.YN0;
import X.YN9;
import X.YNA;
import X.YNF;
import X.YSV;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.ss.android.videoshop.controller.VideoController;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS188S0200000_15;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class ARunnableS14S1200000_15 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        String LIZIZ;
        HashSet<YN9> hashSet = YMV.LIZIZ;
        String str2 = this.s0;
        JSONObject jSONObject = (JSONObject) this.l1;
        Map map = (Map) this.l2;
        Iterator<YN9> it = hashSet.iterator();
        while (it.hasNext()) {
            YN9 next = it.next();
            if (next.LIZ.LJLIL.contains(str2)) {
                String str3 = null;
                if (jSONObject == null || (str = C87260YMm.LIZLLL(jSONObject)) == null) {
                    if (map != null) {
                        str = C87260YMm.LIZJ(map);
                    } else {
                        str = null;
                    }
                }
                YNF ynf = next.LIZ;
                if (!ynf.LJLILLLLZI || ORZ.LJLJJI(str, ynf.LJLJI)) {
                    EnumC87257YMj invoke = next.LIZJ.invoke(str2, jSONObject, map);
                    YN0 invoke2 = next.LIZIZ.invoke(invoke, str2, jSONObject, map);
                    if (jSONObject == null || (LIZIZ = C87260YMm.LIZIZ(jSONObject)) == null) {
                        if (map != null) {
                            str3 = C87260YMm.LIZ(map);
                        }
                    } else {
                        str3 = LIZIZ;
                    }
                    next.LIZLLL.invoke(str2, new YNA(str3, invoke, invoke2), jSONObject, map);
                }
            }
        }
    }

    public final void LIZ$1() {
        ConnectivityManager connectivityManager;
        NetworkInfo LJJLI;
        long j;
        NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILZ((DownloadNotificationService) this.l2, "notification");
        int intExtra = ((Intent) this.l1).getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
        if (this.s0.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
            Notification notification = (Notification) ((Intent) this.l1).getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
            int intExtra2 = ((Intent) this.l1).getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
            if (intExtra != 0 && notification != null && notificationManager != null) {
                if (intExtra2 == 4) {
                    if (!Downloader.getInstance(C84212X3g.LJ()).isDownloading(intExtra)) {
                        return;
                    }
                    DownloadInfo downloadInfo = Downloader.getInstance(C84212X3g.LJ()).getDownloadInfo(intExtra);
                    if (DownloadNotificationService.LJLL) {
                        if (downloadInfo != null && downloadInfo.canNotifyProgress() && System.currentTimeMillis() - DownloadNotificationService.LJLJLLL > DownloadNotificationService.LJLLI) {
                            ((DownloadNotificationService) this.l2).getClass();
                            DownloadNotificationService.LIZJ(notificationManager, intExtra, notification);
                            downloadInfo.setLastNotifyProgressTime();
                            return;
                        }
                        return;
                    }
                    if (downloadInfo != null && downloadInfo.canNotifyProgress()) {
                        ((DownloadNotificationService) this.l2).getClass();
                        DownloadNotificationService.LIZJ(notificationManager, intExtra, notification);
                        downloadInfo.setLastNotifyProgressTime();
                        return;
                    }
                    return;
                }
                if (intExtra2 == -2 || intExtra2 == -3) {
                    if (DownloadNotificationService.LJLL) {
                        ((DownloadNotificationService) this.l2).LIZIZ(notificationManager, intExtra, notification);
                        return;
                    }
                    C84352X8q c84352X8q = ((DownloadNotificationService) this.l2).LJLIL;
                    if (c84352X8q == null) {
                        return;
                    }
                    ARunnableS15S0301000_15 aRunnableS15S0301000_15 = new ARunnableS15S0301000_15(intExtra, notification, notificationManager, this, 0);
                    if (intExtra2 == -2) {
                        j = 50;
                    } else {
                        j = 200;
                    }
                    c84352X8q.LIZ(aRunnableS15S0301000_15, j);
                    return;
                }
                if (DownloadNotificationService.LJLL) {
                    ((DownloadNotificationService) this.l2).LIZIZ(notificationManager, intExtra, notification);
                    return;
                } else {
                    ((DownloadNotificationService) this.l2).getClass();
                    DownloadNotificationService.LIZJ(notificationManager, intExtra, notification);
                    return;
                }
            }
            return;
        }
        if (this.s0.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
            if (intExtra != 0) {
                ((DownloadNotificationService) this.l2).getClass();
                DownloadNotificationService.LIZ(notificationManager, intExtra);
                return;
            }
            return;
        }
        if (this.s0.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            try {
                DownloadNotificationService downloadNotificationService = (DownloadNotificationService) this.l2;
                if (downloadNotificationService != null && !TextUtils.isEmpty("android.permission.ACCESS_NETWORK_STATE") && downloadNotificationService.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && (connectivityManager = (ConnectivityManager) C16880lQ.LLILZ((DownloadNotificationService) this.l2, "connectivity")) != null && (LJJLI = C16880lQ.LJJLI(connectivityManager)) != null && LJJLI.isConnected()) {
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty("")) {
                        arrayList.add("");
                    }
                    arrayList.add("mime_type_plg");
                    Context applicationContext = ((DownloadNotificationService) this.l2).getApplicationContext();
                    if (C38891fp.LJLJI) {
                        if (applicationContext == null) {
                            applicationContext = C38891fp.LJLILLLLZI;
                        } else {
                            Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                            Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                            return;
                        }
                    }
                    if (applicationContext == null) {
                        return;
                    }
                    Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                    Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                    return;
                }
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        if (this.s0.equals("android.intent.action.MEDIA_UNMOUNTED") || this.s0.equals("android.intent.action.MEDIA_REMOVED") || this.s0.equals("android.intent.action.MEDIA_BAD_REMOVAL") || this.s0.equals("android.intent.action.MEDIA_EJECT")) {
            try {
                Downloader.getInstance((DownloadNotificationService) this.l2).pauseAll();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    public static final void run$0(ARunnableS14S1200000_15 aRunnableS14S1200000_15) {
        boolean LIZ;
        try {
            VideoController videoController = ((YSV) aRunnableS14S1200000_15.l2).LIZ;
            if (videoController != null) {
                videoController.handleSubPathInfo(aRunnableS14S1200000_15.s0, (C47789IpF) aRunnableS14S1200000_15.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S1200000_15 aRunnableS14S1200000_15) {
        boolean LIZ;
        try {
            aRunnableS14S1200000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S1200000_15 aRunnableS14S1200000_15) {
        boolean LIZ;
        try {
            Y5W y5w = ((Y5Y) ((IDqS188S0200000_15) aRunnableS14S1200000_15.l1).l0).LIZ.LJLIL;
            String str = aRunnableS14S1200000_15.s0;
            C86808Y5c c86808Y5c = PipoOcrResult.CREATOR;
            C36661cE c36661cE = (C36661cE) aRunnableS14S1200000_15.l2;
            c86808Y5c.getClass();
            y5w.LIZ(0, 107, str, C86808Y5c.LIZ(c36661cE));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS14S1200000_15 aRunnableS14S1200000_15) {
        boolean LIZ;
        List<InetAddress> list;
        try {
            X5M x5m = (X5M) aRunnableS14S1200000_15.l1;
            if (x5m != null) {
                String str = aRunnableS14S1200000_15.s0;
                X5A x5a = (X5A) aRunnableS14S1200000_15.l2;
                if (x5a == null) {
                    list = null;
                } else {
                    list = x5a.LIZ;
                }
                ((X4U) x5m).LJJII(str, list);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS14S1200000_15 aRunnableS14S1200000_15) {
        boolean LIZ;
        try {
            aRunnableS14S1200000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS14S1200000_15(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l1 = obj2;
    }
}
