package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.o;

/* renamed from: X.8CH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8CH {
    public static C8VB LIZ(PowerCell powerCell, C65776Prg c65776Prg) {
        o.LJIIIZ(powerCell, "<this>");
        if (powerCell.getCurrentLifecycleOwner() instanceof C8W0) {
            LifecycleOwner currentLifecycleOwner = powerCell.getCurrentLifecycleOwner();
            o.LJII(currentLifecycleOwner, "null cannot be cast to non-null type com.bytedance.assem.arch.core.Assem");
            return C8VC.LIZ((C8W0) currentLifecycleOwner, c65776Prg, null);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentLifecycleOwner is ");
        LIZ.append(powerCell.getCurrentLifecycleOwner());
        LIZ.append(", PowerList has not attached on Assem.");
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public static C8V9 LIZIZ(PowerCell powerCell, C65776Prg c65776Prg) {
        o.LJIIIZ(powerCell, "<this>");
        if (powerCell.getCurrentLifecycleOwner() instanceof C8W0) {
            LifecycleOwner currentLifecycleOwner = powerCell.getCurrentLifecycleOwner();
            o.LJII(currentLifecycleOwner, "null cannot be cast to non-null type com.bytedance.assem.arch.core.Assem");
            return C8VC.LIZIZ((C8W0) currentLifecycleOwner, c65776Prg, null);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentLifecycleOwner is ");
        LIZ.append(powerCell.getCurrentLifecycleOwner());
        LIZ.append(", PowerList has not attached on Assem.");
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }
}
