package X;

import Y.ALAdapterS2S0300000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import java.util.List;

/* renamed from: X.74I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C74I implements InterfaceC176236vr {
    public final C2064988n LIZ;
    public final Context LIZIZ;

    public C74I(Context context, C2064988n c2064988n) {
        this.LIZIZ = context;
        this.LIZ = c2064988n;
    }

    public final void LIZ(CharSequence charSequence, List list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.LIZ, "alpha", 0.0f).setDuration(100L);
        duration.setInterpolator(new SJI());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LIZ, "alpha", 0.0f, 1.0f).setDuration(100L);
        duration2.setInterpolator(new SJI());
        duration.addListener(new ALAdapterS2S0300000_3(charSequence, list, this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }
}
