package X;

import Y.ARunnableS13S1200000_14;
import android.graphics.Bitmap;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.VTv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79807VTv implements InterfaceC78752UvU {
    public final /* synthetic */ C68322mC LIZ;
    public final /* synthetic */ CallableC79805VTt LIZIZ;
    public final /* synthetic */ HashMap LIZJ;
    public final /* synthetic */ AtomicInteger LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC78752UvU
    public final void onFailed(String msg) {
        o.LJIIJ(msg, "msg");
        if (!ujb.o.LJJJJJL(msg)) {
            LynxBytedLottieView lynxBytedLottieView = this.LIZIZ.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetch polyfill bitmap failed, map: ");
            LIZ.append(this.LIZIZ.LJLILLLLZI);
            LIZ.append(", path: ");
            lynxBytedLottieView.LJJI(1, C025908h.LIZIZ(LIZ, (String) this.LIZ.element, ", msg: ", msg, LIZ), (String) this.LIZ.element);
        }
        this.LIZIZ.LJLJI.onFailed();
    }

    @Override // X.InterfaceC78752UvU
    public final void LIZ(Bitmap bitmap, String id) {
        o.LJIIJ(id, "id");
        C79411VEp.LIZJ(new ARunnableS13S1200000_14(bitmap, this, id, 6));
    }

    public C79807VTv(C68322mC c68322mC, CallableC79805VTt callableC79805VTt, HashMap hashMap, AtomicInteger atomicInteger) {
        this.LIZ = c68322mC;
        this.LIZIZ = callableC79805VTt;
        this.LIZJ = hashMap;
        this.LIZLLL = atomicInteger;
    }
}
