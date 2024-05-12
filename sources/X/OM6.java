package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;

/* loaded from: classes11.dex */
public final class OM6 extends KL7 {
    public final /* synthetic */ StickerPropDetailFragment LJLIL;

    public OM6(StickerPropDetailFragment stickerPropDetailFragment) {
        this.LJLIL = stickerPropDetailFragment;
    }

    @Override // X.KL7
    public final Animator LIZ(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // X.KL7
    public final Animator LIZJ(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // X.KL7
    public final void LIZIZ(MotionEvent motionEvent, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        this.LJLIL.Rl("click_profile_card");
    }
}
