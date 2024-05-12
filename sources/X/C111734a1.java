package X;

import Y.ALAdapterS0S0100000_1;
import Y.ALAdapterS0S0110000_1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111734a1 extends FrameLayout {
    public Animator LJLIL;
    public Animator LJLILLLLZI;
    public TuxTextView LJLJI;
    public final java.util.Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C111734a1(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.b34, this);
        setClipChildren(false);
        setClipToPadding(false);
        ((ViewGroup) LIZ(R.id.g44)).setClipChildren(false);
        ((ViewGroup) LIZ(R.id.g44)).setClipToPadding(false);
        setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
    }

    public final void LIZIZ(TuxTextView view, boolean z) {
        o.LJIIIZ(view, "view");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(C55953Lxd.LJ());
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", 2.0f, 0.7777778f).setDuration(350L);
        o.LJIIIIZZ(duration, "ofFloat(this, \"scaleX\", …uration(SCALE_DURATION_1)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", 2.0f, 0.7777778f).setDuration(350L);
        o.LJIIIIZZ(duration2, "ofFloat(this, \"scaleY\", …uration(SCALE_DURATION_1)");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "scaleX", 0.7777778f, 1.2222222f).setDuration(120L);
        o.LJIIIIZZ(duration3, "ofFloat(this, \"scaleX\", …uration(SCALE_DURATION_2)");
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleY", 0.7777778f, 1.2222222f).setDuration(120L);
        o.LJIIIIZZ(duration4, "ofFloat(this, \"scaleY\", …uration(SCALE_DURATION_2)");
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleX", 1.2222222f, 1.0f).setDuration(120L);
        o.LJIIIIZZ(duration5, "ofFloat(this, \"scaleX\", …uration(SCALE_DURATION_3)");
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "scaleY", 1.2222222f, 1.0f).setDuration(120L);
        o.LJIIIIZZ(duration6, "ofFloat(this, \"scaleY\", …uration(SCALE_DURATION_3)");
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(C55953Lxd.LJ());
        animatorSet2.play(duration).before(duration3);
        animatorSet2.play(duration3).before(duration5);
        animatorSet2.play(duration2).before(duration4);
        animatorSet2.play(duration4).before(duration6);
        animatorSet2.play(duration).with(duration2);
        AnimatorSet.Builder play = animatorSet.play(animatorSet2);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(150L);
        o.LJIIIIZZ(duration7, "ofFloat(this, \"alpha\", A…uration(ALPHA_DURATION_1)");
        duration7.setInterpolator(C55953Lxd.LJ());
        AnimatorSet.Builder with = play.with(duration7);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(view, "translationY", KL2.LIZJ(EF7.LIZIZ(), -46.0f), KL2.LIZJ(EF7.LIZIZ(), -54.0f)).setDuration(150L);
        o.LJIIIIZZ(duration8, "ofFloat(this, \"translati…n(TRANSLATION_DURATION_1)");
        ObjectAnimator duration9 = ObjectAnimator.ofFloat(view, "translationY", KL2.LIZJ(EF7.LIZIZ(), -54.0f), KL2.LIZJ(EF7.LIZIZ(), 0.0f)).setDuration(200L);
        o.LJIIIIZZ(duration9, "ofFloat(this, \"translati…n(TRANSLATION_DURATION_2)");
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(C55953Lxd.LJ());
        animatorSet3.play(duration8).before(duration9);
        with.with(animatorSet3);
        animatorSet.addListener(new ALAdapterS0S0100000_1(view, 9));
        animatorSet.addListener(new ALAdapterS0S0110000_1(z, this, 0));
        animatorSet.start();
        this.LJLIL = animatorSet;
    }
}
