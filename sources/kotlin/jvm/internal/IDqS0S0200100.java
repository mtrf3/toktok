package kotlin.jvm.internal;

import X.AbstractC274515x;
import X.AbstractC39201gK;
import X.AbstractC65781Prl;
import X.C0NB;
import X.C14270hD;
import X.C1JI;
import X.C1VT;
import X.C21X;
import X.C22S;
import X.C23050vN;
import X.C23080vQ;
import X.C23450w1;
import X.C2B8;
import X.C43361n2;
import X.C529425y;
import X.C529525z;
import X.C70657RoD;
import X.C76732zl;
import X.C76800UCe;
import X.C84654XKg;
import X.InterfaceC67352kd;
import X.InterfaceC72996Skq;
import X.InterfaceC88472Yns;
import X.QXX;
import X.QZY;
import X.V10;
import X.X1D;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* loaded from: classes.dex */
public class IDqS0S0200100 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS0S0200100 iDqS0S0200100, Object obj) {
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        C2B8 c2b8 = (C2B8) iDqS0S0200100.l0;
        AbstractC274515x.LJIIJJI(layout, (AbstractC39201gK) iDqS0S0200100.l1, ((C23450w1) c2b8.LJLIL.LIZ(c2b8.LJLJJI, new IDqS4S0100100(c2b8, iDqS0S0200100.j2, 0)).getValue()).LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS0S0200100 iDqS0S0200100, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FileDownload-onStart, albumId: ");
        LIZ.append(iDqS0S0200100.j2);
        LIZ.append(", accompanimentId: ");
        LIZ.append(((Accompaniment) iDqS0S0200100.l0).id);
        C0NB.LJ("AccompanimentManager", X1D.LIZIZ(LIZ));
        C1JI.LIZLLL(C14270hD.LJLLLLLL, Long.valueOf(iDqS0S0200100.j2), (Accompaniment) iDqS0S0200100.l0);
        if (((QXX) iDqS0S0200100.l1) != null) {
            Accompaniment accompaniment = (Accompaniment) iDqS0S0200100.l0;
            o.LJIIIZ(accompaniment, "accompaniment");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS0S0200100 iDqS0S0200100, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        if (downloadInfo != null) {
            long j = iDqS0S0200100.j2;
            Accompaniment accompaniment = (Accompaniment) iDqS0S0200100.l0;
            QXX qxx = (QXX) iDqS0S0200100.l1;
            StringBuilder LIZJ = V10.LIZJ("FileDownload-onSucceed, albumId: ", j, ", accompanimentId: ");
            LIZJ.append(accompaniment.id);
            C0NB.LJ("AccompanimentManager", X1D.LIZIZ(LIZJ));
            List<Accompaniment> list = C14270hD.LJLLLLLL.get(Long.valueOf(j));
            if (list != null) {
                list.remove(accompaniment);
            }
            C1VT c1vt = new C1VT(downloadInfo, accompaniment);
            C1JI.LIZLLL(C14270hD.LJLZ, Long.valueOf(j), c1vt);
            if (qxx != null) {
                qxx.LLLJIL(c1vt);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS0S0200100 iDqS0S0200100, Object obj) {
        InterfaceC72996Skq download = (InterfaceC72996Skq) obj;
        o.LJIIIZ(download, "$this$download");
        download.LIZ(new IDqS0S0200100(iDqS0S0200100.j2, (Accompaniment) iDqS0S0200100.l0, (QXX) iDqS0S0200100.l1, 1));
        download.LIZIZ(new IDqS172S0200000((QXX) iDqS0S0200100.l1, (Accompaniment) iDqS0S0200100.l0, 50));
        download.LIZLLL(new IDqS0S0200100(iDqS0S0200100.j2, (Accompaniment) iDqS0S0200100.l0, (QXX) iDqS0S0200100.l1, 2));
        download.LIZJ(new C21X(iDqS0S0200100.j2, (Accompaniment) iDqS0S0200100.l0, (QXX) iDqS0S0200100.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS0S0200100 iDqS0S0200100, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue != -3) {
            if (intValue == -2) {
                C43361n2 c43361n2 = (C43361n2) iDqS0S0200100.l0;
                long j = iDqS0S0200100.j2;
                LiveEffect liveEffect = (LiveEffect) iDqS0S0200100.l1;
                c43361n2.getClass();
                C70657RoD.LJJI(0.01d, new C22S(j, liveEffect, true));
            }
        } else {
            C43361n2 c43361n22 = (C43361n2) iDqS0S0200100.l0;
            long j2 = iDqS0S0200100.j2;
            LiveEffect liveEffect2 = (LiveEffect) iDqS0S0200100.l1;
            c43361n22.getClass();
            C70657RoD.LJJI(0.01d, new C22S(j2, liveEffect2, false));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS0S0200100 iDqS0S0200100, Object obj) {
        Integer num;
        int i;
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Pre: ");
        LIZ.append(((C76732zl) iDqS0S0200100.l0).element);
        LIZ.append(", Cur: ");
        if (downloadInfo != null) {
            num = Integer.valueOf(downloadInfo.getDownloadProcess());
        } else {
            num = null;
        }
        QZY.LIZJ(LIZ, num, LIZ, "KaraokeDownloader");
        if (downloadInfo != null) {
            i = downloadInfo.getDownloadProcess();
        } else {
            i = 0;
        }
        C76732zl c76732zl = (C76732zl) iDqS0S0200100.l0;
        int i2 = c76732zl.element;
        int i3 = i - i2;
        if (i3 > 0) {
            c76732zl.element = i2 + i3;
            C23050vN c23050vN = ((C23080vQ) iDqS0S0200100.l1).LIZLLL.get(Long.valueOf(iDqS0S0200100.j2));
            if (c23050vN != null) {
                c23050vN.LIZJ += i3;
                System.currentTimeMillis();
                c23050vN.LIZIZ.invoke(Long.valueOf(c23050vN.LIZ), Integer.valueOf(Math.min(100, (c23050vN.LIZJ * 100) / c23050vN.LIZLLL)));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS0S0200100 iDqS0S0200100, Object obj) {
        InterfaceC72996Skq download = (InterfaceC72996Skq) obj;
        o.LJIIIZ(download, "$this$download");
        C76732zl c76732zl = new C76732zl();
        download.LIZ(C529425y.LJLIL);
        download.LIZLLL(new C529525z(c76732zl, (C23080vQ) iDqS0S0200100.l0, iDqS0S0200100.j2, (InterfaceC67352kd) iDqS0S0200100.l1));
        download.LIZJ(new IDqS443S0100000((InterfaceC67352kd) iDqS0S0200100.l1, (InterfaceC67352kd<? super Boolean>) 31));
        download.LIZIZ(new IDqS0S0200100(c76732zl, (C23080vQ) iDqS0S0200100.l0, iDqS0S0200100.j2, 5));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0200100(long j, Accompaniment accompaniment, QXX qxx, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = accompaniment;
        this.l1 = qxx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0200100(C23080vQ c23080vQ, long j, C84654XKg c84654XKg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c23080vQ;
        this.j2 = j;
        this.l1 = c84654XKg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0200100(C43361n2 c43361n2, long j, LiveEffect liveEffect, int i) {
        super(1);
        this.$t = i;
        this.l0 = c43361n2;
        this.j2 = j;
        this.l1 = liveEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0200100(C2B8 c2b8, AbstractC39201gK abstractC39201gK, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2b8;
        this.l1 = abstractC39201gK;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0200100(C76732zl c76732zl, C23080vQ c23080vQ, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = c23080vQ;
        this.j2 = j;
    }
}
