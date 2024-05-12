package X;

import android.os.SystemClock;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.Rq0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70768Rq0 implements InterfaceC73050Sli {
    public final /* synthetic */ C70763Rpv LIZ;

    @Override // X.InterfaceC73050Sli
    public final void LIZ() {
        C70763Rpv c70763Rpv = this.LIZ;
        c70763Rpv.LJI = true;
        if (c70763Rpv.LJFF == 0) {
            c70763Rpv.LJFF = SystemClock.elapsedRealtime();
            C78946Uyc.LJJIIJ(this.LIZ.LIZLLL, new C70955Rt1(), new AqS178S0100000_12(this.LIZ, 383));
        }
    }

    public C70768Rq0(C70763Rpv c70763Rpv) {
        this.LIZ = c70763Rpv;
    }
}
