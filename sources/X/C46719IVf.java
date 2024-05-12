package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IVf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46719IVf implements IW2 {
    @Override // X.IW2
    public final String LIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            String LIZ = IVT.LIZ(simVideoUrlModel.getSourceId());
            if (IVT.LIZIZ(LIZ)) {
                return LIZ;
            }
            return null;
        }
        return null;
    }
}
