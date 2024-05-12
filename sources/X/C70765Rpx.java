package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70765Rpx {
    public final PdpViewModel LIZ;
    public boolean LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public RunnableC70762Rpu LJIIIIZZ;

    public C70765Rpx(PdpViewModel vm) {
        o.LJIIIZ(vm, "vm");
        this.LIZ = vm;
    }

    public final void LIZ(Image image, boolean z, boolean z2) {
        if (!this.LJ && !this.LIZ.LLIIII && !z2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.LJ = true;
            RunnableC70762Rpu runnableC70762Rpu = new RunnableC70762Rpu(this, z, image, elapsedRealtime);
            if (this.LJII > 0) {
                runnableC70762Rpu.run();
            } else {
                this.LJIIIIZZ = runnableC70762Rpu;
            }
        }
    }
}
