package X;

import Y.ARunnableS19S0101000_15;
import Y.ARunnableS3S0111000_15;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X4J implements Handler.Callback, X4N {
    public static volatile X4J LJLJLJ;
    public final boolean LJLJJI;
    public long LJLJJL;
    public ConnectivityManager LJLJL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ(), this);
    public final SparseArray<X4K> LJLJI = new SparseArray<>();
    public int LJLJJLL = 0;
    public final Context LJLIL = C84212X3g.LJ();

    public final int LIZLLL() {
        try {
            if (this.LJLJL == null) {
                this.LJLJL = (ConnectivityManager) C16880lQ.LLILL(C16880lQ.LLLLL(this.LJLIL), "connectivity");
            }
            NetworkInfo LJJLI = C16880lQ.LJJLI(this.LJLJL);
            if (LJJLI != null && LJJLI.isConnected()) {
                if (LJJLI.getType() != 1) {
                    return 1;
                }
                return 2;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // X.X4N
    public final void onAppBackground() {
        LJI(3, false);
    }

    @Override // X.X4N
    public final void onAppForeground() {
        LJI(4, false);
    }

    public static X4J LIZJ() {
        if (LJLJLJ == null) {
            synchronized (X4J.class) {
                if (LJLJLJ == null) {
                    LJLJLJ = new X4J();
                }
            }
        }
        return LJLJLJ;
    }

    public X4J() {
        if (X4H.LJFF.LJIIIIZZ("use_network_callback", 0) == 1) {
            C84212X3g.LJFF().execute(new ARunnableS44S0100000_8(this, 13));
        }
        this.LJLJJI = X4P.LJIIL();
        X4M x4m = C84221X3p.LIZ;
        synchronized (x4m.LIZIZ) {
            if (!((ArrayList) x4m.LIZIZ).contains(this)) {
                ((ArrayList) x4m.LIZIZ).add(this);
            }
        }
    }

    public static X4K LIZ(int i) {
        int i2;
        int i3;
        int[] iArr = null;
        X4H LJFF = X4H.LJFF(i, null);
        int LJIIIIZZ = LJFF.LJIIIIZZ("retry_schedule", 0);
        JSONObject LJIIIZ = LJFF.LJIIIZ("retry_schedule_config");
        int i4 = 60;
        if (LJIIIZ != null) {
            i3 = LJIIIZ.optInt("max_count", 60);
            int optInt = LJIIIZ.optInt("interval_sec", 60);
            i2 = LJIIIZ.optInt("interval_sec_acceleration", 60);
            String optString = LJIIIZ.optString("allow_error_code");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    String[] split = optString.split(",");
                    if (split.length > 0) {
                        int[] iArr2 = new int[split.length];
                        for (int i5 = 0; i5 < split.length; i5++) {
                            iArr2[i5] = CastIntegerProtector.parseInt(split[i5]);
                        }
                        iArr = iArr2;
                    }
                } catch (Throwable unused) {
                }
            }
            i4 = optInt;
        } else {
            i2 = 60;
            i3 = 60;
        }
        return new X4K(i, LJIIIIZZ, i3, i4 * 1000, i2 * 1000, iArr);
    }

    public final X4K LJ(int i) {
        X4K x4k = this.LJLJI.get(i);
        if (x4k == null) {
            synchronized (this.LJLJI) {
                x4k = this.LJLJI.get(i);
                if (x4k == null) {
                    x4k = LIZ(i);
                }
                this.LJLJI.put(i, x4k);
            }
        }
        return x4k;
    }

    public final void LJFF(int i) {
        synchronized (this.LJLJI) {
            this.LJLJI.remove(i);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        if (message.what == 0) {
            int i = message.arg1;
            if (message.arg2 == 1) {
                z = true;
            } else {
                z = false;
            }
            C84212X3g.LJFF().execute(new ARunnableS3S0111000_15(this, i, z, 0));
        } else {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(message.what, "RetryScheduler", "handleMessage", "DoSchedulerRetry");
            }
            C84212X3g.LJFF().execute(new ARunnableS19S0101000_15(this, message.what, 0));
        }
        return true;
    }

    public final void LJI(int i, boolean z) {
        if (this.LJLJJLL <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (!z) {
                if (currentTimeMillis - this.LJLJJL < 10000) {
                    return;
                }
            }
            this.LJLJJL = currentTimeMillis;
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("level = [");
                LIZ.append(i);
                LIZ.append("], force = [");
                LIZ.append(z);
                LIZ.append("]");
                C65210PiY.LIZIZ("RetryScheduler", "scheduleAllTaskRetry", X1D.LIZIZ(LIZ));
            }
            if (z) {
                this.LJLILLLLZI.removeMessages(0);
            }
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.arg1 = i;
            obtain.arg2 = z ? 1 : 0;
            this.LJLILLLLZI.sendMessageDelayed(obtain, 2000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a0, code lost:
    
        if (r2.LJIIIIZZ("download_when_space_negative", 0) != 1) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X4J.LIZIZ(int, int, boolean):void");
    }

    public final void LJII(DownloadInfo downloadInfo, boolean z, int i) {
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException == null) {
            return;
        }
        X4K LJ = LJ(downloadInfo.getId());
        if (LJ.LJIIIIZZ.get() > LJ.LIZJ) {
            if (C65210PiY.LIZ()) {
                int id = downloadInfo.getId();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Id = ");
                LIZ.append(LJ.LIZ);
                LIZ.append(", mRetryCount = ");
                LIZ.append(LJ.LJIIIIZZ);
                LIZ.append(", maxCount = ");
                C0FS.LIZJ(LIZ, LJ.LIZJ, LIZ, id, "RetryScheduler", "tryStartScheduleRetry");
                return;
            }
            return;
        }
        int errorCode = failedException.getErrorCode();
        if (!X4Q.LJIJJ(failedException) && !X4Q.LJJ(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
            int[] iArr = LJ.LJI;
            if (iArr == null || iArr.length == 0) {
                return;
            }
            for (int i2 : iArr) {
                if (i2 == errorCode) {
                    if (C65210PiY.LIZ()) {
                        int id2 = downloadInfo.getId();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Allow error code, id = ");
                        LIZ2.append(LJ.LIZ);
                        LIZ2.append(", error code = ");
                        LIZ2.append(errorCode);
                        C65210PiY.LIZLLL(id2, "RetryScheduler", "tryStartScheduleRetry", X1D.LIZIZ(LIZ2));
                    }
                }
            }
            return;
        }
        LJ.LJIIIZ = z;
        synchronized (this.LJLJI) {
            if (!LJ.LJIIJJI) {
                LJ.LJIIJJI = true;
                this.LJLJJLL++;
            }
        }
        int i3 = LJ.LJII.get();
        if (C65210PiY.LIZ()) {
            int id3 = downloadInfo.getId();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Id = ");
            C15890jp.LIZIZ(LIZ3, LJ.LIZ, ", delayTimeMills = ", i3, ", mWaitingRetryTasks = ");
            C0FS.LIZJ(LIZ3, this.LJLJJLL, LIZ3, id3, "RetryScheduler", "tryStartScheduleRetry");
        }
        if (LJ.LJFF) {
            if (i == 0) {
                LJ.LJII.set(LJ.LIZLLL);
            }
            if (this.LJLJJI) {
                LJ.LJIIJ.set(System.currentTimeMillis());
                LJ.LJIIIIZZ.incrementAndGet();
                LJ.LJII.addAndGet(LJ.LJ);
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.LJLILLLLZI.removeMessages(downloadInfo.getId());
        this.LJLILLLLZI.sendEmptyMessageDelayed(downloadInfo.getId(), i3);
    }
}
