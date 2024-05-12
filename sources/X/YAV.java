package X;

import Y.IDAListenerS239S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAV {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final View LIZJ;

    public final void LIZ(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        if (this.LIZJ.getAnimation() != null) {
            this.LIZJ.clearAnimation();
        }
        if (!C53093Ksb.LIZ() && C53093Ksb.LIZIZ() && !C53093Ksb.LIZJ()) {
            this.LIZJ.setVisibility(0);
        } else {
            this.LIZJ.setVisibility(8);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.LIZ, R.anim.bo);
        loadAnimation.setInterpolator(C55953Lxd.LJI());
        loadAnimation.setAnimationListener(new IDAListenerS239S0100000_15(callback, 2));
        this.LIZJ.startAnimation(loadAnimation);
    }

    public YAV(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.kdi);
        o.LJIIIIZZ(findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.LIZJ = findViewById;
    }
}
