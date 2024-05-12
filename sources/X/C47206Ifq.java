package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Ifq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47206Ifq extends C47153Iez {
    public final /* synthetic */ C47203Ifn LJLIL;

    public C47206Ifq(C47203Ifn c47203Ifn) {
        this.LJLIL = c47203Ifn;
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C47203Ifn c47203Ifn = this.LJLIL;
        if (c47203Ifn.LJFF == null) {
            C1DG.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().getClass();
            c47203Ifn.LJFF = Arrays.asList(Double.valueOf(1000.0d));
        }
        List<Double> list = c47203Ifn.LJFF;
        if (list == null || list.size() == 0) {
            c47203Ifn.LJI = null;
        } else {
            c47203Ifn.LJI = new boolean[c47203Ifn.LJFF.size()];
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayProgressTrigger reset, target:");
        LIZ.append(c47203Ifn.LJFF);
        LIZ.append(", record:");
        Object obj = c47203Ifn.LJI;
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
        C47203Ifn c47203Ifn2 = this.LJLIL;
        c47203Ifn2.LJIIL(0, c47203Ifn2.LJ);
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
        C47203Ifn c47203Ifn = this.LJLIL;
        c47203Ifn.LJIIL(2, c47203Ifn.LJ);
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
