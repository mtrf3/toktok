package X;

import android.app.Activity;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1Qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32831Qp implements InterfaceC12680ee {
    public FrameLayout LJLIL;
    public C47061t0 LJLILLLLZI;
    public SurfaceView LJLJI;
    public C47061t0 LJLJJI;

    @Override // X.InterfaceC12680ee
    public final void LJJIZ() {
        C47061t0 c47061t0 = this.LJLILLLLZI;
        if (c47061t0 != null) {
            C29306Beo.LJJLIIIJJI(c47061t0, false);
        }
        SurfaceView surfaceView = this.LJLJI;
        if (surfaceView != null) {
            C29306Beo.LJJLIIIJJI(surfaceView, false);
        }
        C47061t0 c47061t02 = this.LJLJJI;
        if (c47061t02 != null) {
            C29306Beo.LJJLIIIJJI(c47061t02, false);
        }
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJJJJL() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC12680ee
    public final SurfaceView LJJZZIII() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJLIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC12680ee
    public final ViewGroup LJLJJL() {
        return this.LJLIL;
    }

    public final void LIZ(Activity videoLiveActivity, FrameLayout contentViewGroup) {
        ViewParent viewParent;
        o.LJIIIZ(videoLiveActivity, "videoLiveActivity");
        o.LJIIIZ(contentViewGroup, "contentViewGroup");
        this.LJLIL = contentViewGroup;
        this.LJLILLLLZI = (C47061t0) contentViewGroup.findViewById(R.id.fv9);
        SurfaceView surfaceView = (SurfaceView) contentViewGroup.findViewById(R.id.dxf);
        this.LJLJI = surfaceView;
        C29306Beo.LJI(surfaceView);
        this.LJLJJI = (C47061t0) contentViewGroup.findViewById(R.id.fuv);
        SurfaceView surfaceView2 = this.LJLJI;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (surfaceView2 != null) {
            viewParent = surfaceView2.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof FrameLayout) && C30922CBq.LIZIZ) {
            C30868C9o.LJI("Warning!! LocalTest: video surface view's parent should be frame layout.");
        }
        SurfaceView surfaceView3 = this.LJLJI;
        if (surfaceView3 != null) {
            ViewGroup.LayoutParams layoutParams = surfaceView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                }
                surfaceView3.setLayoutParams(layoutParams);
                surfaceView3.setPadding(0, 0, 0, 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
