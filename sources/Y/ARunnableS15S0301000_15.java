package Y;

import X.SGH;
import X.YAB;
import X.YAE;
import android.app.Notification;
import android.app.NotificationManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public class ARunnableS15S0301000_15 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((YAB) this.l0).LJLIL.LJLIL(this.i3);
        ((YAB) this.l0).LJLJJI = (YAE) this.l1;
        Object obj = ListProtector.get((List) this.l2, this.i3);
        int i = this.i3;
        YAB yab = (YAB) this.l0;
        SGH sgh = (SGH) obj;
        YAE yae = yab.LJLJJI;
        if (yae != null) {
            yae.LIZ(yab, sgh.LIZ, true);
        }
        yab.LJLJJL = i;
    }

    public static final void run$0(ARunnableS15S0301000_15 aRunnableS15S0301000_15) {
        boolean LIZ;
        try {
            DownloadNotificationService downloadNotificationService = (DownloadNotificationService) ((ARunnableS14S1200000_15) aRunnableS15S0301000_15.l2).l2;
            NotificationManager notificationManager = (NotificationManager) aRunnableS15S0301000_15.l0;
            int i = aRunnableS15S0301000_15.i3;
            Notification notification = (Notification) aRunnableS15S0301000_15.l1;
            downloadNotificationService.getClass();
            DownloadNotificationService.LIZJ(notificationManager, i, notification);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S0301000_15 aRunnableS15S0301000_15) {
        boolean LIZ;
        try {
            aRunnableS15S0301000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$2(Y.ARunnableS15S0301000_15 r8) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0301000_15.run$2(Y.ARunnableS15S0301000_15):void");
    }

    public ARunnableS15S0301000_15(SimDtReportService simDtReportService, String str, Callable callable, int i) {
        this.$t = i;
        this.i3 = 3;
        this.l1 = callable;
        this.l2 = simDtReportService;
        this.l0 = str;
    }

    public ARunnableS15S0301000_15(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.l2 = obj3;
    }
}
