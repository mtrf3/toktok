package X;

import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.IyQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48358IyQ {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final View LIZJ;

    public final void LIZ(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZJ.setVisibility(0);
        if (this.LIZJ.getAnimation() == null) {
            this.LIZJ.startAnimation(AnimationUtils.loadAnimation(this.LIZ, R.anim.bs));
        }
        callback.invoke();
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZJ.clearAnimation();
        this.LIZJ.setVisibility(8);
        callback.invoke();
    }

    public C48358IyQ(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.kdi);
        o.LJIIIIZZ(findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.LIZJ = findViewById;
        viewGroup.setOnTouchListener(new IDTListenerS117S0100000_8(this, 11));
    }
}
