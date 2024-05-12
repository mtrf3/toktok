package Y;

import X.C16880lQ;
import X.C86606Xys;
import X.C86608Xyu;
import X.C86818Y5m;
import X.InterfaceC71484S3s;
import X.InterfaceC86630XzG;
import X.InterfaceC86631XzH;
import X.X5Q;
import X.X5Z;
import X.XXK;
import android.content.Context;
import android.content.Intent;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.bytedance.pipo.ocr.view.component.IOcrComponent;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;

/* loaded from: classes16.dex */
public class ARunnableS16S1100000_15 implements Runnable {
    public final int $t;
    public Object l1;
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
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS16S1100000_15 aRunnableS16S1100000_15) {
        boolean LIZ;
        try {
            X5Z x5z = ((X5Q) aRunnableS16S1100000_15.l1).LJIJI;
            if (x5z != null) {
                x5z.LIZ(aRunnableS16S1100000_15.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS16S1100000_15 aRunnableS16S1100000_15) {
        boolean LIZ;
        InterfaceC71484S3s toast;
        try {
            IOcrComponent LIZ2 = C86818Y5m.LIZ();
            if (LIZ2 != null && (toast = LIZ2.getToast((CardOcrActivity) aRunnableS16S1100000_15.l1)) != null) {
                CardOcrActivity cardOcrActivity = (CardOcrActivity) aRunnableS16S1100000_15.l1;
                String str = aRunnableS16S1100000_15.s0;
                if (str == null) {
                    str = "";
                }
                toast.LIZJ(cardOcrActivity, str);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS16S1100000_15 aRunnableS16S1100000_15) {
        boolean LIZ;
        try {
            InterfaceC86630XzG interfaceC86630XzG = ((C86606Xys) aRunnableS16S1100000_15.l1).LIZ.LJLJJI;
            String str = aRunnableS16S1100000_15.s0;
            if (str == null) {
                str = "body is null";
            }
            interfaceC86630XzG.onFailure(0, str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS16S1100000_15 aRunnableS16S1100000_15) {
        boolean LIZ;
        try {
            InterfaceC86631XzH interfaceC86631XzH = ((C86608Xyu) aRunnableS16S1100000_15.l1).LIZ.LJLJJLL;
            String str = aRunnableS16S1100000_15.s0;
            if (str == null) {
                str = "body is null";
            }
            interfaceC86631XzH.LIZ(0, str, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS16S1100000_15 aRunnableS16S1100000_15) {
        boolean LIZ;
        try {
            ((XXK) aRunnableS16S1100000_15.l1).L(aRunnableS16S1100000_15.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS16S1100000_15 aRunnableS16S1100000_15) {
        try {
            Intent intent = new Intent((Context) aRunnableS16S1100000_15.l1, (Class<?>) DownloadNotificationService.class);
            intent.setAction(aRunnableS16S1100000_15.s0);
            C16880lQ.LLLL((Context) aRunnableS16S1100000_15.l1, intent);
        } catch (Throwable unused) {
        }
    }

    public static final void run$6(ARunnableS16S1100000_15 aRunnableS16S1100000_15) {
        try {
            Intent intent = new Intent((Context) aRunnableS16S1100000_15.l1, (Class<?>) DownloadNotificationService.class);
            intent.setAction(aRunnableS16S1100000_15.s0);
            C16880lQ.LLLL((Context) aRunnableS16S1100000_15.l1, intent);
        } catch (Throwable unused) {
        }
    }

    public ARunnableS16S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
