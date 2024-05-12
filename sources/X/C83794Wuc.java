package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.Wuc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83794Wuc implements InterfaceC83812Wuu<InterfaceC83701Wt7>, InterfaceC83701Wt7 {
    public FrameLayout LIZ;
    public float LIZIZ;
    public final InterfaceC83796Wue LIZJ;

    @Override // X.InterfaceC83812Wuu
    public final void onDestroy() {
    }

    @Override // X.InterfaceC83812Wuu
    public final void init() {
        Context context = this.LIZJ.LIZ().getCkCameraViewLikeFunction().getView().getContext();
        o.LJIIIIZZ(context, "ckCameraViewContext.ckCa…unction.getView().context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-1);
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(0.0f);
        this.LIZ = frameLayout;
        InterfaceC83793Wub ckCameraViewLikeFunction = this.LIZJ.LIZ().getCkCameraViewLikeFunction();
        FrameLayout frameLayout2 = this.LIZ;
        if (frameLayout2 != null) {
            ckCameraViewLikeFunction.LJZI(frameLayout2);
            FrameLayout frameLayout3 = this.LIZ;
            if (frameLayout3 != null) {
                frameLayout3.bringToFront();
                return;
            } else {
                o.LJIJI("mFakeFlashLayout");
                throw null;
            }
        }
        o.LJIJI("mFakeFlashLayout");
        throw null;
    }

    public C83794Wuc(InterfaceC83796Wue ckCameraViewContext) {
        o.LJIIIZ(ckCameraViewContext, "ckCameraViewContext");
        this.LIZJ = ckCameraViewContext;
        this.LIZIZ = -1.0f;
    }

    @Override // X.InterfaceC83701Wt7
    public final void J2(boolean z) {
        if (this.LIZIZ != -1.0f) {
            Window window = this.LIZJ.getActivity().getWindow();
            o.LJIIIIZZ(window, "ckCameraViewContext.activity.window");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = this.LIZIZ;
            window.setAttributes(attributes);
        }
        if (z) {
            FrameLayout frameLayout = this.LIZ;
            if (frameLayout != null) {
                if (frameLayout.getAlpha() == 0.5f) {
                    FrameLayout frameLayout2 = this.LIZ;
                    if (frameLayout2 != null) {
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(frameLayout2, "alpha", 0.5f, 0.0f);
                        o.LJIIIIZZ(objectAnimator, "objectAnimator");
                        objectAnimator.setDuration(25L);
                        objectAnimator.start();
                        return;
                    }
                    o.LJIJI("mFakeFlashLayout");
                    throw null;
                }
            } else {
                o.LJIJI("mFakeFlashLayout");
                throw null;
            }
        }
        FrameLayout frameLayout3 = this.LIZ;
        if (frameLayout3 != null) {
            frameLayout3.setAlpha(0.0f);
        } else {
            o.LJIJI("mFakeFlashLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC83701Wt7
    public final void Q3(boolean z) {
        Window window = this.LIZJ.getActivity().getWindow();
        o.LJIIIIZZ(window, "ckCameraViewContext.activity.window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.LIZIZ = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        if (z) {
            FrameLayout frameLayout = this.LIZ;
            if (frameLayout != null) {
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(frameLayout, "alpha", 0.0f, 0.5f);
                o.LJIIIIZZ(objectAnimator, "objectAnimator");
                objectAnimator.setDuration(25L);
                objectAnimator.start();
                return;
            }
            o.LJIJI("mFakeFlashLayout");
            throw null;
        }
        FrameLayout frameLayout2 = this.LIZ;
        if (frameLayout2 != null) {
            frameLayout2.setAlpha(0.5f);
        } else {
            o.LJIJI("mFakeFlashLayout");
            throw null;
        }
    }
}
