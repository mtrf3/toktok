package X;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public final class WS2 implements InterfaceC63955P8d {
    public final /* synthetic */ AtomicBoolean LIZ;
    public final /* synthetic */ C82306WRy LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    public WS2(AtomicBoolean atomicBoolean, C82306WRy c82306WRy, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = atomicBoolean;
        this.LIZIZ = c82306WRy;
        this.LIZJ = z;
        this.LIZLLL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC63955P8d
    public final void LIZ(int i, Bitmap bitmap) {
        C43045Guv.LIZLLL(new C82307WRz(this.LIZ, i, this.LIZIZ, bitmap, this.LIZJ, this.LIZLLL), 0L);
    }
}
