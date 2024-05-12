package X;

import Y.IDAListenerS77S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.tabicon.VSABaseTabIconAnim;
import kotlin.jvm.internal.o;

/* renamed from: X.LxZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55949LxZ extends VSABaseTabIconAnim {
    @Override // X.AbstractC55918Lx4
    public final void LJ(View view, View view2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", 1.0f, 0.7f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", 1.0f, 0.7f, 1.0f);
        AnimatorSet LIZ = C1DD.LIZ(350L);
        LIZ.playTogether(ofFloat, ofFloat2);
        LIZ.addListener(new IDAListenerS77S0100000_9(this, 31));
        LIZ.addListener(new IDAListenerS77S0100000_9(this, 30));
        this.LIZIZ = LIZ;
        LIZ.start();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "originIconView.context");
        LJFF(context);
    }
}
