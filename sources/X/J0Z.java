package X;

import Y.ARunnableS44S0100000_8;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes9.dex */
public final class J0Z {
    public static Field LJIIJ;
    public static Class LJIIJJI;
    public static Field LJIIL;
    public static Method LJIILIIL;
    public static Method LJIILJJIL;
    public static Class LJIILL;
    public static Method LJIILLIIL;
    public static Method LJIIZILJ;
    public Object LIZ;
    public Object LIZIZ;
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
    public final Object[] LIZLLL = new Object[5];
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public boolean LJII;
    public final ARunnableS44S0100000_8 LJIIIIZZ;
    public final ARunnableS44S0100000_8 LJIIIZ;

    public J0Z() {
        Boolean bool = Boolean.FALSE;
        this.LJ = bool;
        this.LJFF = bool;
        this.LJI = bool;
        this.LJII = false;
        this.LJIIIIZZ = new ARunnableS44S0100000_8(this, 155);
        this.LJIIIZ = new ARunnableS44S0100000_8(this, 156);
    }

    public final void LIZ(SurfaceView surfaceView) {
        if (Build.VERSION.SDK_INT != 29) {
            return;
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("proxyPositionChangeListener， surface = ");
            LIZ.append(surfaceView.getHolder().getSurface());
            B4I.LIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
        this.LJ = Boolean.valueOf(SurfaceViewAndroid10Workaround.isOptimizePositionChangeProxy());
        this.LJFF = Boolean.valueOf(SurfaceViewAndroid10Workaround.isFurtherOptimizePositionChangeProxy());
        this.LJI = Boolean.valueOf(SurfaceViewAndroid10Workaround.isProxyPositionChangeListenerOfSurfaceViewOtherPlan());
        try {
            if (LJIIJ == null) {
                Field declaredField = SurfaceView.class.getDeclaredField("mPositionListener");
                LJIIJ = declaredField;
                declaredField.setAccessible(true);
            }
            if (this.LIZ == null) {
                this.LIZ = LJIIJ.get(surfaceView);
            }
            if (LJIIL == null) {
                Field declaredField2 = View.class.getDeclaredField("mRenderNode");
                LJIIL = declaredField2;
                declaredField2.setAccessible(true);
            }
            if (LJIIJJI == null) {
                LJIIJJI = Class.forName("android.graphics.RenderNode");
            }
            if (LJIILL == null) {
                LJIILL = Class.forName("android.graphics.RenderNode$PositionUpdateListener");
            }
            if (LJIILJJIL == null) {
                Method declaredMethod = LJIIJJI.getDeclaredMethod("addPositionUpdateListener", LJIILL);
                LJIILJJIL = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (LJIILIIL == null) {
                Method declaredMethod2 = LJIIJJI.getDeclaredMethod("removePositionUpdateListener", LJIILL);
                LJIILIIL = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            if (LJIILLIIL == null) {
                Class cls = LJIILL;
                Class<?> cls2 = Integer.TYPE;
                Method declaredMethod3 = cls.getDeclaredMethod("positionChanged", Long.TYPE, cls2, cls2, cls2, cls2);
                LJIILLIIL = declaredMethod3;
                declaredMethod3.setAccessible(true);
            }
            if (LJIIZILJ == null) {
                Method declaredMethod4 = LJIILL.getDeclaredMethod("positionLost", Long.TYPE);
                LJIIZILJ = declaredMethod4;
                declaredMethod4.setAccessible(true);
            }
            if (this.LIZIZ == null) {
                this.LIZIZ = Proxy.newProxyInstance(LJIILL.getClassLoader(), new Class[]{LJIILL}, new C48456J0a(this, surfaceView));
            }
            LJIILIIL.invoke(LJIIL.get(surfaceView), this.LIZ);
            if (this.LJI.booleanValue()) {
                C0NB.LJ("SurfaceView", "sAddPositionListenerMethod null");
                LJIILJJIL.invoke(LJIIL.get(surfaceView), null);
            } else {
                C0NB.LJ("SurfaceView", "sAddPositionListenerMethod mPositionListenerProxy");
                LJIILJJIL.invoke(LJIIL.get(surfaceView), this.LIZIZ);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("proxyPositionChangeListener, e = ");
            LIZ2.append(e);
            C0NB.LJ("SurfaceView", X1D.LIZIZ(LIZ2));
        }
    }
}
