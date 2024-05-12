package X;

import Y.IDAListenerS76S0100000_8;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.ss.android.ugc.aweme.live.WelcomeVideoPlayerDialogFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class JIY implements InterfaceC46568IPk {
    public final /* synthetic */ WelcomeVideoPlayerDialogFragment LIZ;

    @Override // X.InterfaceC46568IPk
    public final void onComplete() {
        C46579IPv c46579IPv = this.LIZ.LJLJI;
        if (c46579IPv != null) {
            c46579IPv.release();
        }
        this.LIZ._$_findCachedViewById(R.id.hsl).animate().setDuration(200L).alpha(0.0f).start();
        WelcomeVideoPlayerDialogFragment welcomeVideoPlayerDialogFragment = this.LIZ;
        View _$_findCachedViewById = welcomeVideoPlayerDialogFragment._$_findCachedViewById(R.id.d3e);
        _$_findCachedViewById.setVisibility(0);
        int LJIIJJI = (C15380j0.LJIIJJI() / 2) - C15380j0.LIZ(102.0f);
        C83741Wtl c83741Wtl = new C83741Wtl(0.65f, 0.0f, 0.35f, 1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(_$_findCachedViewById, (Property<View, Float>) View.TRANSLATION_Y, LJIIJJI);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(c83741Wtl);
        ofFloat.addListener(new IDAListenerS76S0100000_8(welcomeVideoPlayerDialogFragment, 2));
        ofFloat.start();
    }

    @Override // X.InterfaceC46568IPk
    public final void onFailed() {
        this.LIZ.getClass();
    }

    public JIY(WelcomeVideoPlayerDialogFragment welcomeVideoPlayerDialogFragment) {
        this.LIZ = welcomeVideoPlayerDialogFragment;
    }
}
