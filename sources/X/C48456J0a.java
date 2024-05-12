package X;

import Y.ARunnableS19S0300000_8;
import android.view.SurfaceView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.J0a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48456J0a implements InvocationHandler {
    public final /* synthetic */ SurfaceView LIZ;
    public final /* synthetic */ J0Z LIZIZ;

    public C48456J0a(J0Z j0z, SurfaceView surfaceView) {
        this.LIZIZ = j0z;
        this.LIZ = surfaceView;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("proxyPositionChangeListener, invoke method ");
        LIZ.append(method.getName());
        LIZ.append(", surface = ");
        LIZ.append(this.LIZ.getHolder().getSurface());
        B4I.LIZ("SurfaceView", X1D.LIZIZ(LIZ));
        if (!this.LIZIZ.LJ.booleanValue()) {
            this.LIZIZ.LIZJ.postAtFrontOfQueue(new ARunnableS19S0300000_8(objArr, method, this, 9));
            return null;
        }
        try {
            String name = method.getName();
            if ("positionChanged".equals(name)) {
                System.arraycopy(objArr, 0, this.LIZIZ.LIZLLL, 0, 5);
                J0Z j0z = this.LIZIZ;
                j0z.LIZJ.postAtFrontOfQueue(j0z.LJIIIIZZ);
            } else if ("positionLost".equals(name)) {
                J0Z j0z2 = this.LIZIZ;
                j0z2.LIZJ.removeCallbacks(j0z2.LJIIIIZZ);
                System.arraycopy(objArr, 0, this.LIZIZ.LIZLLL, 0, 1);
                J0Z j0z3 = this.LIZIZ;
                j0z3.LIZJ.postAtFrontOfQueue(j0z3.LJIIIZ);
            }
            return null;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("invoke2, e = ");
            LIZ2.append(e);
            C0NB.LJ("SurfaceView", X1D.LIZIZ(LIZ2));
            return null;
        }
    }
}
