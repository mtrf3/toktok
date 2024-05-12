package X;

import Y.IDRunnableS6S0101000;
import com.bytedance.platform.godzilla.sysopt.PthreadCreateHook;

/* renamed from: X.F8g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38478F8g extends C38477F8f {
    @Override // X.F8Y
    public final void LIZLLL() {
        if (((Boolean) DOI.LJFF.getValue()).booleanValue()) {
            C37179EiV.LJFF.post(new IDRunnableS6S0101000(5, this, 27));
        } else {
            PthreadCreateHook.start(this.LIZ);
        }
    }

    public static void LJFF(C38478F8g c38478F8g) {
        PthreadCreateHook.start(c38478F8g.LIZ);
    }
}
