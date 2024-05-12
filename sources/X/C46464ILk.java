package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ILk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46464ILk {
    public static final void LIZ(SimVideoUrlModel simVideoUrlModel, boolean z, int i) {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        if (simVideoUrlModel != null) {
            str = simVideoUrlModel.getSourceId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("] add preload task into engine [");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        LIZ.append(str2);
        LIZ.append("], size : ");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }
}
