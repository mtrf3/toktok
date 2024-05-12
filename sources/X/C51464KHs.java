package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS54S0400000_8;

/* renamed from: X.KHs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51464KHs extends YKQ {
    public final /* synthetic */ InterfaceC88472Yns<View, C76800UCe> LJLJI;

    public C51464KHs(AqS54S0400000_8 aqS54S0400000_8) {
        this.LJLJI = aqS54S0400000_8;
    }

    @Override // X.YKQ
    public final Animator LIZ(View view) {
        View view2;
        if (view != null) {
            view2 = view.findViewById(R.id.hoh);
        } else {
            view2 = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.2f, 1.0f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }
}
