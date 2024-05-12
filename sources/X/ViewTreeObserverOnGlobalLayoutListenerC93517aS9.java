package X;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.aS9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC93517aS9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ MainFragment LJLIL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C94164aca c94164aca = MainFragment.vl(this.LJLIL).LJLIL;
        o.LJIIIIZZ(c94164aca, "binding.root");
        int width = c94164aca.getWidth();
        FrameLayout frameLayout = MainFragment.vl(this.LJLIL).LLIIL;
        o.LJIIIIZZ(frameLayout, "binding.previewContainer");
        int width2 = frameLayout.getWidth();
        if (width2 > width) {
            FrameLayout frameLayout2 = MainFragment.vl(this.LJLIL).LLIIL;
            o.LJIIIIZZ(frameLayout2, "binding.previewContainer");
            frameLayout2.setLeft(((width2 - width) + 1) / 2);
        }
        this.LJLIL.Gl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("width = ");
        LIZ.append(width);
        C94034aaU.LIZ("MainFragment", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("previewWitdh = ");
        LIZ2.append(width2);
        C94034aaU.LIZ("MainFragment", X1D.LIZIZ(LIZ2));
        C94164aca c94164aca2 = MainFragment.vl(this.LJLIL).LJLIL;
        o.LJIIIIZZ(c94164aca2, "binding.root");
        c94164aca2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC93517aS9(MainFragment mainFragment) {
        this.LJLIL = mainFragment;
    }
}
