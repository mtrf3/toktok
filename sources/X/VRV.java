package X;

import android.view.View;
import com.bytedance.ies.xelement.banner.LynxSwiperItemView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VRV implements View.OnAttachStateChangeListener {
    public final WeakReference<LynxSwiperItemView> LJLIL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIJ(v, "v");
    }

    public VRV(LynxSwiperItemView ui) {
        o.LJIIJ(ui, "ui");
        this.LJLIL = new WeakReference<>(ui);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIJ(v, "v");
        WeakReference<LynxSwiperItemView> weakReference = this.LJLIL;
        if (weakReference != null) {
            LynxSwiperItemView lynxSwiperItemView = weakReference.get();
            if (lynxSwiperItemView != null) {
                lynxSwiperItemView.LJIL();
                return;
            }
            return;
        }
        o.LJIIZILJ();
        throw null;
    }
}
