package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.IXk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46776IXk implements InterfaceC46770IXe {
    public final List<IY4> LIZ;

    @Override // X.InterfaceC46770IXe
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC46770IXe
    public final C46775IXj LIZ(C47123IeV c47123IeV) {
        int i;
        float f;
        if (c47123IeV == null) {
            return null;
        }
        C46775IXj c46775IXj = new C46775IXj();
        c46775IXj.LIZ = 1;
        String str = "";
        c46775IXj.LIZIZ = "";
        int i2 = 0;
        if (c47123IeV.getUrlList() != null && !c47123IeV.getUrlList().isEmpty()) {
            c46775IXj.LIZIZ = ListProtector.get(c47123IeV.getUrlList(), 0);
        }
        if (c47123IeV.getBitRate() != null) {
            i2 = c47123IeV.getBitRate().intValue();
        }
        c46775IXj.LIZJ = i2;
        if (c47123IeV.getInfoId() != null) {
            i = c47123IeV.getInfoId().intValue();
        } else {
            i = -1;
        }
        c46775IXj.LIZLLL = i;
        float f2 = 0.0f;
        if (c47123IeV.getLoudness() != null) {
            f = c47123IeV.getLoudness().floatValue();
        } else {
            f = 0.0f;
        }
        c46775IXj.LJ = f;
        if (c47123IeV.getPeak() != null) {
            f2 = c47123IeV.getPeak().floatValue();
        }
        c46775IXj.LJFF = f2;
        if (c47123IeV.getUrlKey() != null) {
            str = c47123IeV.getUrlKey();
        }
        c46775IXj.LJI = str;
        return c46775IXj;
    }

    public C46776IXk(List<IY4> list, long j) {
        this.LIZ = ((ArrayList) list).isEmpty() ? Collections.singletonList(IY4.LIZ) : list;
        C1DG.LIZ().getConfig().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        C1DG.LIZ().getConfig().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }
}
