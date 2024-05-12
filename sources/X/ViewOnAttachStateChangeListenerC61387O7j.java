package X;

import Y.ARunnableS46S0100000_10;
import android.animation.Animator;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.O7j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnAttachStateChangeListenerC61387O7j implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Animator LJLIL;
    public final /* synthetic */ C61386O7i LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        HashMap<String, Object> hashMap = new HashMap<>(1);
        hashMap.put("refer", "tips");
        O79.LIZIZ().LJI(this.LJLILLLLZI.LIZIZ, 0L, "othershow", hashMap, null);
        if (this.LJLIL != null) {
            C61386O7i c61386O7i = this.LJLILLLLZI;
            c61386O7i.LIZJ.postDelayed(new ARunnableS46S0100000_10(this, 135), c61386O7i.LIZIZ.LLJILLL);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Animator animator = this.LJLIL;
        if (animator != null) {
            C16880lQ.LJLJJI(animator);
            this.LJLIL.cancel();
        }
    }

    public ViewOnAttachStateChangeListenerC61387O7j(C61386O7i c61386O7i, Animator animator) {
        this.LJLILLLLZI = c61386O7i;
        this.LJLIL = animator;
    }
}
