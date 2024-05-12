package X;

import Y.IDAListenerS35S0200000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.0Fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04590Fz {
    public final FrameLayout LIZ;
    public final KaraokeViewModel LIZIZ;
    public final ImageView LIZJ;
    public final ImageView LIZLLL;
    public Animator LJ;
    public Animator LJFF;
    public Animator LJI;
    public Animator LJII;

    public static void LIZIZ(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    public C04590Fz(FrameLayout frameLayout, Fragment fragment, KaraokeViewModel karaokeViewModel) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = frameLayout;
        this.LIZIZ = karaokeViewModel;
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(48.0f), C15380j0.LIZ(48.0f)));
        this.LIZJ = imageView;
        ImageView imageView2 = new ImageView(frameLayout.getContext());
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(48.0f), C15380j0.LIZ(48.0f)));
        this.LIZLLL = imageView2;
        frameLayout.addView(imageView);
        frameLayout.addView(imageView2);
        C29306Beo.LJI(imageView);
        C29306Beo.LJI(imageView2);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C538929p(this, null), 3);
    }

    public static Animator LIZ(View view, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        AnimatorSet LIZ = C1DD.LIZ(350L);
        LIZ.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.3f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.8f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.8f));
        LIZ.addListener(new IDAListenerS35S0200000(interfaceC65784Pro, interfaceC65784Pro2, 0));
        return LIZ;
    }

    public final Animator LIZJ(final View view, final View view2, final View view3, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        OSZ osz;
        if (o.LJ(view.getTag(), Long.valueOf(j))) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                i2 = rect.left;
                i = rect.top;
            } else {
                i = 0;
                i2 = 0;
            }
            OSZ osz2 = new OSZ(Float.valueOf(i2), Float.valueOf(i));
            Rect rect2 = new Rect();
            if (view3.getGlobalVisibleRect(rect2)) {
                i4 = rect2.left;
                i3 = rect2.top;
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (i4 == 0 && i3 == 0) {
                osz = new OSZ(Float.valueOf(0.0f), Float.valueOf(0.0f));
            } else {
                osz = new OSZ(Float.valueOf(((view3.getWidth() / 2) + i4) - (view.getWidth() / 2)), Float.valueOf(((view3.getHeight() / 2) + i3) - (view.getHeight() / 2)));
            }
            if ((((Number) osz2.getFirst()).floatValue() != 0.0f || ((Number) osz2.getSecond()).floatValue() != 0.0f) && (((Number) osz.getFirst()).floatValue() != 0.0f || ((Number) osz.getSecond()).floatValue() != 0.0f)) {
                C29306Beo.LJJLJLI(view2);
                view2.setAlpha(0.3f);
                view2.setScaleX(0.8f);
                view2.setScaleY(0.8f);
                Path path = new Path();
                path.moveTo(((Number) osz2.getFirst()).floatValue(), ((Number) osz2.getSecond()).floatValue());
                path.quadTo(((Number) osz.getFirst()).floatValue(), ((Number) osz2.getSecond()).floatValue(), ((Number) osz.getFirst()).floatValue(), ((Number) osz.getSecond()).floatValue());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(550L);
                animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.3f, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.X, (Property<View, Float>) View.Y, path));
                AnimatorSet animatorSet2 = new AnimatorSet();
                AnimatorSet LIZ = C1DD.LIZ(350L);
                LIZ.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.3f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.8f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.8f, 1.0f));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(200L);
                animatorSet3.setStartDelay(350L);
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_X, 1.0f, 1.2f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.2f));
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.setDuration(350L);
                animatorSet4.setStartDelay(550L);
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 0.8f, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.8f, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_X, 1.2f, 1.0f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, 1.2f, 1.0f));
                animatorSet2.playTogether(LIZ, animatorSet3, animatorSet, animatorSet4);
                animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.0Fx
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                        C04590Fz c04590Fz = this;
                        View view4 = view;
                        c04590Fz.getClass();
                        C04590Fz.LIZIZ(view4);
                        C04590Fz c04590Fz2 = this;
                        View view5 = view3;
                        c04590Fz2.getClass();
                        C04590Fz.LIZIZ(view5);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                        C29306Beo.LJI(view2);
                    }
                });
                animatorSet2.start();
                return animatorSet2;
            }
        }
        LIZIZ(view);
        return null;
    }
}
