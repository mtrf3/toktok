package X;

import Y.ARunnableS19S0300000_8;
import android.view.SurfaceView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.InR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47677InR implements InvocationHandler {
    public final /* synthetic */ SurfaceView LIZ;
    public final /* synthetic */ C47676InQ LIZIZ;

    public C47677InR(C47676InQ c47676InQ, C47691Inf c47691Inf) {
        this.LIZIZ = c47676InQ;
        this.LIZ = c47691Inf;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("proxyPositionChangeListener, invoke method ");
        LIZ.append(method.getName());
        LIZ.append(", surface = ");
        LIZ.append(this.LIZ.getHolder().getSurface());
        IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        if (!this.LIZIZ.LJ.booleanValue()) {
            this.LIZIZ.LIZJ.postAtFrontOfQueue(new ARunnableS19S0300000_8(objArr, method, this, 6));
            return null;
        }
        try {
            String name = method.getName();
            if ("positionChanged".equals(name)) {
                System.arraycopy(objArr, 0, this.LIZIZ.LIZLLL, 0, 5);
                C47676InQ c47676InQ = this.LIZIZ;
                c47676InQ.LIZJ.postAtFrontOfQueue(c47676InQ.LJIIIIZZ);
            } else if ("positionLost".equals(name)) {
                C47676InQ c47676InQ2 = this.LIZIZ;
                c47676InQ2.LIZJ.removeCallbacks(c47676InQ2.LJIIIIZZ);
                System.arraycopy(objArr, 0, this.LIZIZ.LIZLLL, 0, 1);
                C47676InQ c47676InQ3 = this.LIZIZ;
                c47676InQ3.LIZJ.postAtFrontOfQueue(c47676InQ3.LJIIIZ);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
