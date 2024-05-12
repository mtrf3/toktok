package X;

import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.MlJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57737MlJ implements InterfaceC34995DoN {
    public static final C57737MlJ LIZ = new C57737MlJ();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final C73318Sq2 LJ = new C73318Sq2();

    @Override // X.InterfaceC34995DoN
    public final void LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("preload ");
        LIZ2.append(RecMoreExperiment.LJI());
        C221018lt.LJFF("RecMore", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ExtReasonRenderOptimizeExp:");
        LIZ3.append(((Boolean) C52458KiM.LIZ.getValue()).booleanValue());
        C221018lt.LJFF("[RecUser_GState]", X1D.LIZIZ(LIZ3));
    }

    @Override // X.InterfaceC34995DoN
    public final void LIZ() {
        LIZLLL.set(true);
        C221018lt.LJFF("[RecUser_GState]", "onVideo render ready!");
    }
}
