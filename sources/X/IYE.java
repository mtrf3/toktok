package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import ujb.o;

/* loaded from: classes9.dex */
public final class IYE implements IY4 {
    public static final IYE LIZIZ = new IYE();

    @Override // X.IY4
    public final /* synthetic */ boolean LIZ() {
        return true;
    }

    @Override // X.IY4
    public final /* synthetic */ IY0 LIZIZ(IY5 iy5) {
        return J9A.LIZ(iy5);
    }

    @Override // X.IY4
    public final String getName() {
        return "ForceVideoUrlHook";
    }

    @Override // X.IY4
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        SimVideoUrlModel simVideoUrlModel;
        String[] strArr;
        IYH iyh = iy5.LIZIZ;
        if (iyh == null || (simVideoUrlModel = iyh.LIZ) == null) {
            return iy5.LIZ(iyh);
        }
        String sourceId = simVideoUrlModel.getSourceId();
        if (sourceId == null || !o.LJJJJ(sourceId, "_sub", false) || (strArr = iyh.LIZJ) == null || strArr.length == 0) {
            return iy5.LIZ(iyh);
        }
        return new IY0(strArr[0]);
    }
}
