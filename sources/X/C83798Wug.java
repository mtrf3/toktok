package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wug, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83798Wug implements InterfaceC83812Wuu<InterfaceC83687Wst>, InterfaceC83687Wst {
    public SurfaceView LIZ;
    public boolean LIZIZ;
    public final HashMap<InterfaceC83803Wul, SurfaceHolder.Callback> LIZJ;
    public final InterfaceC83796Wue LIZLLL;

    @Override // X.InterfaceC83812Wuu
    public final void onDestroy() {
    }

    @Override // X.InterfaceC83687Wst
    public final View K5() {
        SurfaceView surfaceView = this.LIZ;
        if (surfaceView != null) {
            return surfaceView;
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC83687Wst
    public final Surface getSurface() {
        SurfaceView surfaceView = this.LIZ;
        if (surfaceView != null) {
            SurfaceHolder holder = surfaceView.getHolder();
            o.LJIIIIZZ(holder, "surfaceView.holder");
            return holder.getSurface();
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC83812Wuu
    public final void init() {
        this.LIZ = new SurfaceView(this.LIZLLL.getActivity());
        InterfaceC83793Wub ckCameraViewLikeFunction = this.LIZLLL.LIZ().getCkCameraViewLikeFunction();
        SurfaceView surfaceView = this.LIZ;
        if (surfaceView != null) {
            ckCameraViewLikeFunction.LIZLLL(surfaceView, new FrameLayout.LayoutParams(-1, -1), C83804Wum.LIZ);
        } else {
            o.LJIJI("surfaceView");
            throw null;
        }
    }

    @Override // X.InterfaceC83687Wst
    public final boolean A0() {
        return this.LIZIZ;
    }

    public C83798Wug(InterfaceC83796Wue ckCameraViewContext) {
        o.LJIIIZ(ckCameraViewContext, "ckCameraViewContext");
        this.LIZLLL = ckCameraViewContext;
        this.LIZJ = new HashMap<>();
    }

    @Override // X.InterfaceC83687Wst
    public final void L5(C83680Wsm c83680Wsm) {
        SurfaceHolderCallbackC83801Wuj surfaceHolderCallbackC83801Wuj = new SurfaceHolderCallbackC83801Wuj(c83680Wsm, new AqS164S0100000_14(this, 362), C83805Wun.LJLIL, new AqS164S0100000_14(this, 363));
        synchronized (this.LIZJ) {
            this.LIZJ.put(c83680Wsm, surfaceHolderCallbackC83801Wuj);
            SurfaceView surfaceView = this.LIZ;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(surfaceHolderCallbackC83801Wuj);
            } else {
                o.LJIJI("surfaceView");
                throw null;
            }
        }
    }
}
