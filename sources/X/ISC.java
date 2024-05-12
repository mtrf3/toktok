package X;

import Y.ARunnableS12S0101000_8;
import Y.ARunnableS9S0101000_5;
import Y.IDRunnableS6S0101000;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ISC implements IPlayerEventReporter {
    public UpdateCallback LIZ;

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIL() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIILIIL() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void init() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void release() {
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZJ(ISM ism) {
        ISE ise = new ISE(0);
        UpdateCallback updateCallback = this.LIZ;
        ISJ isj = ise.LIZ;
        isj.LIZ = updateCallback;
        isj.LIZIZ = ism;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                isj.LIZIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new IDRunnableS6S0101000(8, isj, 10));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIIIZ(UpdateCallback updateCallback) {
        this.LIZ = updateCallback;
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZIZ(IQY iqy, VideoInfo videoInfo) {
        IQZ iqz = new IQZ(0);
        iqz.LIZ.getClass();
        IQX iqx = iqz.LIZ;
        iqx.LIZ = iqy;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                iqx.LIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new Q8V(10, iqx));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJI(C46575IPr c46575IPr, VideoInfo videoInfo) {
        C46576IPs c46576IPs = new C46576IPs(0);
        c46576IPs.LIZ.getClass();
        C46574IPq c46574IPq = c46576IPs.LIZ;
        c46574IPq.LIZ = c46575IPr;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                c46574IPq.LIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new IDRunnableS6S0101000(3, c46574IPq, 11));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJII(IT2 it2, VideoInfo videoInfo) {
        C46661ISz c46661ISz = new ISD(0).LIZ;
        c46661ISz.LIZ = videoInfo;
        c46661ISz.LIZIZ = this.LIZ;
        c46661ISz.LIZJ = it2;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                c46661ISz.LIZIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new IDRunnableS6S0101000(9, c46661ISz, 9));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIILJJIL(IPA ipa, VideoInfo videoInfo) {
        IPD ipd = new IPE(0).LIZ;
        ipd.LIZ = videoInfo;
        ipd.LIZIZ = ipa;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                ipd.LIZIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new IDRunnableS6S0101000(9, ipd, 31));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LIZLLL(int i, VideoInfo videoInfo, IRV vri) {
        o.LJIIIZ(vri, "vri");
        IS9 is9 = new IS9(0);
        UpdateCallback updateCallback = this.LIZ;
        IS8 is8 = is9.LIZ;
        is8.LIZIZ = updateCallback;
        is8.LIZ = i;
        is8.LIZJ = videoInfo;
        is8.LIZLLL = vri;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                is8.LIZIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new ARunnableS9S0101000_5(4, is8, 8));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJIILL(String str, VideoInfo videoInfo, C46648ISm c46648ISm) {
        int i;
        String str2;
        if (c46648ISm.LIZ == 0) {
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-Unsorted");
            if (str == null) {
                str2 = "id-null";
            } else {
                str2 = str;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append(':');
            LIZ.append(c46648ISm);
            SimRadar.errorScan("BytedancePlayerReportImpl", "reportVideoStop", new C46690IUc(X1D.LIZIZ(LIZ)), new Object[0]);
        }
        SimRadar.analyzer().getClass();
        C46894Iao LIZ2 = IVN.LIZ(str);
        if (LIZ2 != null) {
            LIZ2.LJJI();
        }
        SimRadar.analyzer().getClass();
        C46894Iao LIZ3 = IVN.LIZ(str);
        if (LIZ3 == null) {
            i = -1;
        } else {
            i = LIZ3.LIZJ;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            c46648ISm.LJIILLIIL.put("sim_error_type", valueOf);
        }
        C46654ISs c46654ISs = new ISF(0).LIZ;
        c46654ISs.LIZ = videoInfo;
        c46654ISs.LIZIZ = c46648ISm;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                c46654ISs.LIZIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new ARunnableS12S0101000_8(6, c46654ISs, 2));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }

    @Override // com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter
    public final void LJ(VideoInfo videoInfo, C46554IOw c46554IOw, long j, String endType, boolean z) {
        String str;
        o.LJIIIZ(endType, "endType");
        if (z) {
            str = "B-Net";
        } else {
            str = "B-Normal";
        }
        IVN analyzer = SimRadar.analyzer();
        videoInfo.getAid();
        analyzer.getClass();
        IVN.LIZIZ(str);
        SimRadar.keyScan("BytedancePlayerReportImpl", "reportBlock", c46554IOw.toString());
        C46570IPm c46570IPm = new C46571IPn(0).LIZ;
        c46570IPm.LIZIZ = endType;
        c46570IPm.LIZ = j;
        c46570IPm.LIZJ = z;
        c46570IPm.LJ = videoInfo;
        c46570IPm.LIZLLL = this.LIZ;
        c46570IPm.LJFF = c46554IOw;
        if (!C79146V4k.LJJJJIZL() || C46982IcE.LJFF() != null) {
            if (IZ8.LJJ()) {
                c46570IPm.LIZ();
                return;
            }
            ExecutorService LJFF = C46982IcE.LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.execute(new IDRunnableS6S0101000(6, c46570IPm, 30));
            return;
        }
        throw new RuntimeException("SimContext.getSpecifiedExecutor() is null !");
    }
}
