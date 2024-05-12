package X;

import Y.IDAListenerS69S0100000;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.google.gson.m;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1H2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1H2 implements InterfaceC08210Tx {
    public boolean LIZ;
    public final /* synthetic */ LiveGoalBackgroundDialogFragment LIZIZ;

    @Override // X.InterfaceC08210Tx
    public final void LIZ() {
        LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = this.LIZIZ;
        if (liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2) == null) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -60.0f).setDuration(560L);
        o.LJIIIIZZ(duration, "ofFloat(live_goal_guide_…        .setDuration(560)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2), (Property<View, Float>) View.TRANSLATION_Y, -60.0f, 60.0f).setDuration(880L);
        o.LJIIIIZZ(duration2, "ofFloat(live_goal_guide_…        .setDuration(880)");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2), (Property<View, Float>) View.TRANSLATION_Y, 60.0f, 0.0f).setDuration(520L);
        o.LJIIIIZZ(duration3, "ofFloat(live_goal_guide_…        .setDuration(520)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2, duration3);
        animatorSet.setStartDelay(560L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LJLLILLLL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(360L);
        o.LJIIIIZZ(duration4, "ofFloat(topOverlay, View… 0f, 1f).setDuration(360)");
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LJLLILLLL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(240L);
        o.LJIIIIZZ(duration5, "ofFloat(topOverlay, View… 1f, 0f).setDuration(240)");
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LJLLJ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(360L);
        o.LJIIIIZZ(duration6, "ofFloat(bottomOverlay, V… 0f, 1f).setDuration(360)");
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LJLLJ, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(240L);
        o.LJIIIIZZ(duration7, "ofFloat(bottomOverlay, V… 1f, 0f).setDuration(240)");
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration4, duration6);
        animatorSet2.setStartDelay(560L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(duration5, duration7);
        animatorSet3.setStartDelay(2760L);
        liveGoalBackgroundDialogFragment.LJLJJLL.playTogether(animatorSet, animatorSet2, animatorSet3);
        liveGoalBackgroundDialogFragment.LJLJJLL.addListener(new IDAListenerS69S0100000(liveGoalBackgroundDialogFragment, 9));
    }

    @Override // X.InterfaceC08210Tx
    public final void LIZIZ() {
        final LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = this.LIZIZ;
        if (liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2) == null) {
            return;
        }
        C29306Beo.LJJLIIIJILLIZJL(60, liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2));
        C29306Beo.LJIIIZ(liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2));
        C15540jG c15540jG = liveGoalBackgroundDialogFragment.LJZI;
        C47061t0 live_goal_guide_hand = (C47061t0) liveGoalBackgroundDialogFragment._$_findCachedViewById(R.id.fx2);
        o.LJIIIIZZ(live_goal_guide_hand, "live_goal_guide_hand");
        c15540jG.getClass();
        c15540jG.LIZ = live_goal_guide_hand;
        c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
        c15540jG.LIZJ = "ttlive_live_goal_first_use_guide.webp";
        c15540jG.LJFF = false;
        c15540jG.LJIIL = true;
        c15540jG.LJ = new C31073CHl() { // from class: X.1kx
            @Override // X.C31073CHl
            public final void LJFF() {
                LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment2 = LiveGoalBackgroundDialogFragment.this;
                liveGoalBackgroundDialogFragment2.LL.LIZ = true;
                C29306Beo.LJJLJLI(liveGoalBackgroundDialogFragment2._$_findCachedViewById(R.id.fx2));
                LiveGoalBackgroundDialogFragment.this.LJZI.LJ();
                View view = LiveGoalBackgroundDialogFragment.this.LJLLILLLL;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = LiveGoalBackgroundDialogFragment.this.LJLLJ;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                LiveGoalBackgroundDialogFragment.this.LJLJJLL.start();
                View _$_findCachedViewById = LiveGoalBackgroundDialogFragment.this._$_findCachedViewById(R.id.j83);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ty
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view3, MotionEvent motionEvent) {
                            return false;
                        }
                    });
                }
                C0NB.LIZIZ("LiveGoalEffect", "GeckoWebpController: onResourceReady.");
            }

            @Override // X.C31073CHl
            public final void LJII(Animatable anim) {
                o.LJIIIZ(anim, "anim");
                m mVar = C31691Mf.LJ;
                if (mVar != null) {
                    mVar.LJJIIJ("play_guide_animation", 1);
                }
                try {
                    String LJIILJJIL = C09650Zl.LIZIZ.LJIILJJIL(C31691Mf.LJ);
                    if (LJIILJJIL != null) {
                        C12890ez.LIZ().setRenderCacheString("LiveGoal", LJIILJJIL);
                    }
                } catch (Throwable unused) {
                }
                LiveGoalBackgroundDialogFragment.this.LJLJJLL.cancel();
                LiveGoalBackgroundDialogFragment.this.vl();
                C0NB.LIZIZ("LiveGoalEffect", "GeckoWebpController: stop.");
            }
        };
        c15540jG.LIZIZ();
    }

    @Override // X.InterfaceC08210Tx
    public final void LIZJ() {
        this.LIZIZ.LJZI.LIZ();
    }

    @Override // X.InterfaceC08210Tx
    public final boolean LIZLLL() {
        return this.LIZ;
    }

    public C1H2(LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment) {
        this.LIZIZ = liveGoalBackgroundDialogFragment;
    }
}
