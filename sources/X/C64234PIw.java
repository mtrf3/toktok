package X;

import Y.ARunnableS17S0110000_11;
import Y.ARunnableS47S0100000_11;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;

/* renamed from: X.PIw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64234PIw implements PHH {
    public boolean LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public NetworkStatsManager LJLL;
    public long LJLJLJ = -1;
    public volatile boolean LJLJLLL = true;
    public int LJLLI = -1;

    public final void LIZLLL() {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        this.LJLJLJ = SystemClock.elapsedRealtime();
        this.LJLILLLLZI = LIZ(1);
        this.LJLJI = LIZ(0);
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initTrafficData: mTotalWifiBytes:");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(" mTotalMobileBytes:");
            LIZ.append(this.LJLJI);
            C64028PAy.LIZ("NewTrafficStatisticsImp", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.PHH
    public final void init() {
        PE0 pe0 = F9U.LIZ;
        if (pe0.LIZIZ()) {
            LIZLLL();
        } else {
            pe0.LIZJ(new ARunnableS47S0100000_11(this, 146));
        }
    }

    @Override // X.PHH
    public final long LIZJ() {
        LJ();
        return this.LJLJJI + this.LJLJJLL;
    }

    public final void LJ() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LJLJLJ;
        if (elapsedRealtime - j < 1000 || j == -1) {
            return;
        }
        long LIZ = LIZ(1);
        long LIZ2 = LIZ(0);
        long j2 = LIZ2 - this.LJLJI;
        this.LJLJI = LIZ2;
        long j3 = LIZ - this.LJLILLLLZI;
        this.LJLILLLLZI = LIZ;
        if (C09970aH.LJII()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mTotalMobileBytes:");
            LIZ3.append(this.LJLJI);
            LIZ3.append(" mTotalMobileBytes:");
            LIZ3.append(this.LJLJI);
            C64028PAy.LIZ("NewTrafficStatisticsImp", X1D.LIZIZ(LIZ3));
        }
        if (this.LJLJLLL) {
            this.LJLJL += j2;
            this.LJLJJLL += j3;
        } else {
            this.LJLJJL += j2;
            this.LJLJJI += j3;
        }
        if (C09970aH.LJII()) {
            StringBuilder LIZJ = V10.LIZJ("periodWifiBytes:", j3, " periodMobileBytes:");
            LIZJ.append(j2);
            LIZJ.append(" mMobileBackBytes:");
            LIZJ.append(this.LJLJJL);
            LIZJ.append(" mWifiBackBytes:");
            LIZJ.append(this.LJLJJI);
            C64028PAy.LIZ("NewTrafficStatisticsImp", X1D.LIZIZ(LIZJ));
        }
        this.LJLJLJ = elapsedRealtime;
    }

    @Override // X.PHH
    public final long LJFF() {
        LJ();
        return this.LJLJJI;
    }

    @Override // X.PHH
    public final long LJIILL() {
        LJ();
        return this.LJLJJL + this.LJLJL;
    }

    @Override // X.PHH
    public final long LJIILLIIL() {
        LJ();
        return this.LJLJJL;
    }

    @Override // X.PHH
    public final long LJJI() {
        return LIZJ() + LJIILL();
    }

    @Override // X.PHH
    public final long LJJIIJZLJL() {
        LJ();
        return this.LJLJJLL;
    }

    @Override // X.PHH
    public final long LJJL() {
        LJ();
        return this.LJLJL;
    }

    public final long LIZ(int i) {
        NetworkStats networkStats;
        if (!C09970aH.LJIIL) {
            if (C09970aH.LJII()) {
                C64028PAy.LIZLLL("APM-Traffic-Detail", "querySummary is disabled. returning -1");
            }
            return -1L;
        }
        Context context = C09970aH.LIZ;
        if (this.LJLL == null) {
            this.LJLL = (NetworkStatsManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "netstats");
        }
        if (this.LJLL == null) {
            return -1L;
        }
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            networkStats = this.LJLL.querySummary(i, null, 0L, 4611686018427387903L);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            networkStats = null;
        }
        long j = 0;
        long j2 = 0;
        if (networkStats != null) {
            while (networkStats.hasNextBucket()) {
                networkStats.getNextBucket(bucket);
                int uid = bucket.getUid();
                if (this.LJLLI == -1) {
                    try {
                        PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(C16880lQ.LLLLL(context).getPackageManager(), C16880lQ.LLLLL(context).getPackageName(), 128);
                        if (LLLLLLZ != null) {
                            this.LJLLI = LLLLLLZ.applicationInfo.uid;
                        }
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                if (this.LJLLI == uid) {
                    j += bucket.getRxBytes();
                    j2 += bucket.getTxBytes();
                }
            }
            networkStats.close();
        }
        return j + j2;
    }

    @Override // X.PHH
    public final void LIZIZ(boolean z) {
        F9U.LIZ.LIZJ(new ARunnableS17S0110000_11(this, z, 7));
    }
}
