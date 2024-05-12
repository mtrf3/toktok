package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IYB implements IY4 {
    public static final IYB LIZIZ = new IYB();
    public static final HashSet<String> LIZJ = new HashSet<>();

    @Override // X.IY4
    public final /* synthetic */ boolean LIZ() {
        return true;
    }

    @Override // X.IY4
    public final String getName() {
        return "LocalVideoUrlHook";
    }

    @Override // X.IY4
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.IY4
    public final IY0 LIZIZ(IY5 iy5) {
        IYA iya;
        IYI iyi = iy5.LIZJ;
        SimVideoUrlModel simVideoUrlModel = null;
        if (iyi == null || iyi.LIZ == null) {
            IY0 LIZIZ2 = iy5.LIZIZ(iyi);
            o.LJI(LIZIZ2);
            return LIZIZ2;
        }
        if (iyi != null && (iya = iyi.LIZ) != null) {
            simVideoUrlModel = new SimVideoUrlModel();
            simVideoUrlModel.setSourceId(String.valueOf(iya.getSubId()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(iya.getUrl());
            simVideoUrlModel.setUrlList(arrayList);
            simVideoUrlModel.setUri(iya.getUri());
        }
        if (LIZJ.contains(simVideoUrlModel.getSourceId())) {
            return new IY0(simVideoUrlModel.getUri());
        }
        return iy5.LIZIZ(iyi);
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        SimVideoUrlModel simVideoUrlModel;
        IYH iyh = iy5.LIZIZ;
        if (iyh == null || (simVideoUrlModel = iyh.LIZ) == null) {
            return iy5.LIZ(iyh);
        }
        if (LIZJ.contains(simVideoUrlModel.getSourceId())) {
            return new IY0(simVideoUrlModel.getUri());
        }
        return iy5.LIZ(iyh);
    }
}
