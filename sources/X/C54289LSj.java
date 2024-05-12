package X;

import Y.ARunnableS45S0100000_9;
import Y.IDTListenerS91S0200000_10;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LSj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54289LSj extends PopupWindow {
    public static final /* synthetic */ int LJFF = 0;
    public final C29S LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final ConstraintLayout LIZLLL;
    public final TuxTextView LJ;

    public final void LIZ(boolean z) {
        float LJIILL;
        float f;
        float f2;
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator LIZIZ = C55953Lxd.LIZIZ();
        float f3 = 0.0f;
        if (z) {
            f = C17N.LJIILL(20.0d);
            f2 = 1.0f;
            LJIILL = 0.0f;
        } else {
            f3 = this.LIZLLL.getAlpha();
            LJIILL = C17N.LJIILL(20.0d);
            f = 0.0f;
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.LIZLLL, "alpha", f3, f2).setDuration(300L);
        duration.setInterpolator(LIZIZ);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LIZLLL, "translationY", f, LJIILL).setDuration(300L);
        duration2.setInterpolator(LIZIZ);
        animatorSet.play(duration).with(duration2);
        animatorSet.start();
    }

    public static boolean LIZIZ(float f, float f2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]).contains((int) f, (int) f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54289LSj(C29S activity, Aweme aweme, String enterForm, String enterMethod) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterForm, "enterForm");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZ = activity;
        this.LIZIZ = enterForm;
        this.LIZJ = enterMethod;
        setContentView(C16880lQ.LLLZIIL(R.layout.aeh, C16880lQ.LLZIL(activity), null));
        View findViewById = getContentView().findViewById(R.id.cbu);
        o.LJIIIIZZ(findViewById, "contentView.findViewById….id.dislike_toast_layout)");
        this.LIZLLL = (ConstraintLayout) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.cbv);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.dislike_toast_text)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.LJ = tuxTextView;
        o.LJIIIIZZ(getContentView().findViewById(R.id.cbq), "contentView.findViewById(R.id.dislike_more_arrow)");
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        tuxTextView.setText(activity.getString(R.string.iv_));
        setFocusable(false);
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS45S0100000_9(this, 200), 3000L);
        setTouchInterceptor(new IDTListenerS91S0200000_10(aweme, this, 3));
        LIZ(true);
    }
}
