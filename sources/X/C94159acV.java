package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.acV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94159acV implements InterfaceC93411aQR {
    public WeakReference<View> LIZ;

    @Override // X.InterfaceC93411aQR
    public final void LIZIZ() {
        View view;
        C94034aaU.LIZIZ("-- loadingview startLoading");
        WeakReference<View> weakReference = this.LIZ;
        if (weakReference != null && (view = weakReference.get()) != null) {
            C93729aVZ.LJI(view);
            C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.no5);
            if (c29701Eo != null && !c29701Eo.isAnimating()) {
                c29701Eo.playAnimation();
            }
        }
    }

    @Override // X.InterfaceC93411aQR
    public final void stopLoading() {
        View view;
        View view2;
        C29701Eo c29701Eo;
        View view3;
        C94034aaU.LIZIZ("-- loadingview stopLoading");
        WeakReference<View> weakReference = this.LIZ;
        if (weakReference != null && (view3 = weakReference.get()) != null) {
            view3.setClickable(false);
        }
        WeakReference<View> weakReference2 = this.LIZ;
        if (weakReference2 != null && (view2 = weakReference2.get()) != null && (c29701Eo = (C29701Eo) view2.findViewById(R.id.no5)) != null) {
            c29701Eo.cancelAnimation();
        }
        WeakReference<View> weakReference3 = this.LIZ;
        if (weakReference3 != null && (view = weakReference3.get()) != null) {
            view.setVisibility(8);
        }
    }

    @Override // X.InterfaceC93411aQR
    public final View LIZ(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View view = C16880lQ.LLLLIILL(inflater, R.layout.dv9, viewGroup, false);
        viewGroup.addView(view);
        this.LIZ = new WeakReference<>(view);
        o.LJIIIIZZ(view, "view");
        return view;
    }
}
