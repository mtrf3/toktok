package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X4Y {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public final List<Long> LJIIJ;
    public int LJIIJJI;

    public final void LIZIZ() {
        long longValue;
        if (!this.LJIIIZ) {
            return;
        }
        if (!((ArrayList) this.LJIIJ).isEmpty()) {
            try {
                if (this.LIZ >= ((ArrayList) this.LJIIJ).size()) {
                    longValue = ((Long) ListProtector.get(this.LJIIJ, ((ArrayList) r1).size() - 1)).longValue();
                } else {
                    longValue = ((Long) ListProtector.get(this.LJIIJ, this.LIZ)).longValue();
                }
                if (C65210PiY.LIZ()) {
                    int i = this.LJIIJJI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Sleep:");
                    LIZ.append(longValue);
                    C65210PiY.LIZLLL(i, "NetworkRetryStrategy", "delay", X1D.LIZIZ(LIZ));
                }
                Thread.sleep(longValue);
            } catch (Throwable th) {
                int i2 = this.LJIIJJI;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Error:");
                LIZ2.append(th.toString());
                C65210PiY.LJ(i2, "NetworkRetryStrategy", "delay", X1D.LIZIZ(LIZ2));
            }
        }
        this.LIZ++;
        this.LIZIZ++;
        this.LJIIIIZZ++;
        if (C65210PiY.LIZ()) {
            int i3 = this.LJIIJJI;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("CurrentRetryCount:");
            LIZ3.append(this.LIZ);
            LIZ3.append(" currentPeriodRetryCount:");
            LIZ3.append(this.LIZIZ);
            LIZ3.append(" totalRetryCount:");
            C0FS.LIZJ(LIZ3, this.LJIIIIZZ, LIZ3, i3, "NetworkRetryStrategy", "doRetry");
        }
    }

    public final void LIZLLL() {
        int i = this.LJII;
        if (i <= 0 || this.LIZLLL < i) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(this.LJIIJJI, "NetworkRetryStrategy", "reset", "Reset currentRetryResetCount");
            }
            this.LIZLLL++;
            this.LIZ = 0;
            return;
        }
        if (C65210PiY.LIZ()) {
            int i2 = this.LJIIJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CurrentRetryResetCount:");
            LIZ.append(this.LIZLLL);
            LIZ.append(" retryResetCountLimit:");
            C0FS.LIZJ(LIZ, this.LJII, LIZ, i2, "NetworkRetryStrategy", "resetLimit");
        }
        this.LJIIIZ = false;
    }

    public X4Y(DownloadInfo downloadInfo) {
        int i;
        String LIZIZ;
        ArrayList arrayList = new ArrayList();
        this.LJIIJ = arrayList;
        this.LJIIJJI = 0;
        try {
            LIZJ(downloadInfo);
        } catch (Throwable th) {
            try {
                int i2 = this.LJIIJJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Init Error");
                LIZ.append(th.toString());
                C65210PiY.LJ(i2, "NetworkRetryStrategy", "NetworkRetryStrategy", X1D.LIZIZ(LIZ));
                if (C65210PiY.LIZ()) {
                    i = this.LJIIJJI;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Init retryCountLimit:");
                    LIZ2.append(this.LJ);
                    LIZ2.append(" delayIntervalMs:");
                    LIZ2.append(this.LJIIJ.toString());
                    LIZ2.append(" retryPeriodTime:");
                    LIZ2.append(this.LJI);
                    LIZ2.append(" periodRetryCountLimit:");
                    LIZ2.append(this.LJFF);
                    LIZ2.append(" retryResetCountLimit:");
                    LIZ2.append(this.LJII);
                    LIZIZ = X1D.LIZIZ(LIZ2);
                } else {
                    return;
                }
            } catch (Throwable th2) {
                if (C65210PiY.LIZ()) {
                    int i3 = this.LJIIJJI;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Init retryCountLimit:");
                    LIZ3.append(this.LJ);
                    LIZ3.append(" delayIntervalMs:");
                    LIZ3.append(this.LJIIJ.toString());
                    LIZ3.append(" retryPeriodTime:");
                    LIZ3.append(this.LJI);
                    LIZ3.append(" periodRetryCountLimit:");
                    LIZ3.append(this.LJFF);
                    LIZ3.append(" retryResetCountLimit:");
                    C0FS.LIZJ(LIZ3, this.LJII, LIZ3, i3, "NetworkRetryStrategy", "NetworkRetryStrategy");
                }
                throw th2;
            }
        }
        if (C65210PiY.LIZ()) {
            i = this.LJIIJJI;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Init retryCountLimit:");
            LIZ4.append(this.LJ);
            LIZ4.append(" delayIntervalMs:");
            LIZ4.append(arrayList.toString());
            LIZ4.append(" retryPeriodTime:");
            LIZ4.append(this.LJI);
            LIZ4.append(" periodRetryCountLimit:");
            LIZ4.append(this.LJFF);
            LIZ4.append(" retryResetCountLimit:");
            LIZ4.append(this.LJII);
            LIZIZ = X1D.LIZIZ(LIZ4);
            C65210PiY.LIZLLL(i, "NetworkRetryStrategy", "NetworkRetryStrategy", LIZIZ);
        }
    }

    public final boolean LIZ(BaseException baseException) {
        if (!this.LJIIIZ) {
            if (C65210PiY.LIZ()) {
                int i = this.LJIIJJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Enabled: ");
                LIZ.append(this.LJIIIZ);
                C65210PiY.LIZLLL(i, "NetworkRetryStrategy", "canRetry", X1D.LIZIZ(LIZ));
            }
            return false;
        }
        if (C65210PiY.LIZ()) {
            int i2 = this.LJIIJJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CurrentRetryCount:");
            LIZ2.append(this.LIZ);
            LIZ2.append(" retryCountLimit:");
            LIZ2.append(this.LJ);
            LIZ2.append(" error:");
            LIZ2.append(baseException.getErrorCode());
            C65210PiY.LIZLLL(i2, "NetworkRetryStrategy", "canRetry", X1D.LIZIZ(LIZ2));
        }
        if (this.LJI > 0 && this.LJFF > 0) {
            if (this.LIZJ == 0) {
                this.LIZJ = System.currentTimeMillis();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.LIZJ < this.LJI) {
                    if (this.LIZIZ > this.LJFF) {
                        if (C65210PiY.LIZ()) {
                            int i3 = this.LJIIJJI;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("CurrentPeriodRetryCount:");
                            LIZ3.append(this.LIZIZ);
                            LIZ3.append(" periodRetryCountLimit:");
                            LIZ3.append(this.LJFF);
                            LIZ3.append(" currentRetryPeriodTime:");
                            C48339Iy7.LIZLLL(currentTimeMillis, this.LIZJ, LIZ3, " retryPeriodTime:");
                            LIZ3.append(this.LJI);
                            C65210PiY.LIZLLL(i3, "NetworkRetryStrategy", "retryLimit", X1D.LIZIZ(LIZ3));
                        }
                        this.LJIIIZ = false;
                        return false;
                    }
                } else {
                    this.LIZJ = System.currentTimeMillis();
                    this.LIZIZ = 0;
                }
            }
        }
        if (this.LIZ >= this.LJ || !X4Q.LJJ(baseException)) {
            return false;
        }
        return true;
    }

    public final void LIZJ(DownloadInfo downloadInfo) {
        JSONObject LJIIIZ;
        if (downloadInfo != null) {
            int id = downloadInfo.getId();
            this.LJIIJJI = id;
            LJIIIZ = X4H.LJFF(id, null).LJIIIZ("retry_strategy");
        } else {
            LJIIIZ = X4H.LJFF.LJIIIZ("retry_strategy");
        }
        if (LJIIIZ == null) {
            return;
        }
        int optInt = LJIIIZ.optInt("retry_count");
        if (optInt > 0) {
            this.LJ = optInt;
        }
        JSONArray optJSONArray = LJIIIZ.optJSONArray("delay_interval_ms");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                long optLong = optJSONArray.optLong(i);
                if (optLong > 0) {
                    this.LJIIJ.add(Long.valueOf(optLong));
                }
            }
        }
        long optLong2 = LJIIIZ.optLong("retry_period_ms");
        if (optLong2 > 0) {
            this.LJI = optLong2;
        }
        int optInt2 = LJIIIZ.optInt("retry_count_limit_period");
        if (optInt2 > 0) {
            this.LJFF = optInt2;
        }
        int optInt3 = LJIIIZ.optInt("retry_reset_count_limit");
        if (optInt3 > 0) {
            this.LJII = optInt3;
        }
        if (this.LJ > 0 && this.LJII > 0) {
            this.LJIIIZ = true;
        }
    }
}
