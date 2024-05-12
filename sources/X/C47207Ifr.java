package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Ifr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47207Ifr extends C47153Iez {
    public final /* synthetic */ C47218Ig2 LJLIL;

    public C47207Ifr(C47218Ig2 c47218Ig2) {
        this.LJLIL = c47218Ig2;
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C47223Ig7 c47223Ig7 = this.LJLIL.LIZ;
        if (c47223Ig7.LIZ == null) {
            C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
            c47223Ig7.LIZ = Arrays.asList(Double.valueOf(1000.0d));
        }
        List<Double> list = c47223Ig7.LIZ;
        if (list == null || list.size() == 0) {
            c47223Ig7.LIZIZ = null;
        } else {
            c47223Ig7.LIZIZ = new boolean[c47223Ig7.LIZ.size()];
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayProgressTrigger reset, target:");
        LIZ.append(c47223Ig7.LIZ);
        LIZ.append(", record:");
        Object obj = c47223Ig7.LIZIZ;
        if (obj == null) {
            obj = "null";
        }
        LIZ.append(obj);
        X1D.LIZIZ(LIZ);
        C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
        this.LJLIL.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("triggered by onRenderFirstFrame. sourceId:");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        C47204Ifo c47204Ifo = this.LJLIL.LJ;
        c47204Ifo.LJFF.getClass();
        c47204Ifo.LJIILIIL(0, true);
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onBufferedPercent(String str, long j, int i) {
        C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
        if (i < 90) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("triggered by onBufferedPercent. percent not enough, return. sourceId:");
            LIZ.append(str);
            LIZ.append(" percent:");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            return;
        }
        this.LJLIL.getClass();
        C47204Ifo c47204Ifo = this.LJLIL.LJ;
        c47204Ifo.LJFF.getClass();
        c47204Ifo.LJIILIIL(2, true);
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onPlayProgressChange(String str, long j, long j2) {
        C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("triggered by onPlayProgressChange. switch not open, return. sourceId:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }
}
