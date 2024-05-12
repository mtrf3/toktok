package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T2U {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final TextView LIZJ;

    public final void LIZ(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.LIZIZ;
        if (view != null && view.getAnimation() == null) {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.bq));
            view.getAnimation().setInterpolator(C55953Lxd.LJI());
            callback.invoke();
        }
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        View view = this.LIZIZ;
        if (view != null) {
            view.clearAnimation();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            callback.invoke();
        }
    }

    public T2U(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        this.LIZ = viewGroup;
        if (C53093Ksb.LIZ()) {
            this.LIZIZ = viewGroup.findViewById(R.id.kdb);
        } else {
            this.LIZIZ = viewGroup.findViewById(R.id.kde);
        }
        this.LIZJ = (TextView) viewGroup.findViewById(R.id.kdj);
    }
}
