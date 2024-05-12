package X;

import Y.ALAdapterS7S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class LSY extends FrameLayout {
    public AnimatorSet LJLIL;
    public AnimatorSet LJLILLLLZI;
    public C163306b0 LJLJI;
    public float LJLJJI;

    public final void LIZ() {
        C16880lQ.LJLJJL(this.LJLIL);
        C16880lQ.LJLJJL(this.LJLILLLLZI);
        this.LJLIL.end();
        this.LJLILLLLZI.end();
        C163306b0 c163306b0 = this.LJLJI;
        c163306b0.LJLLJ.removeAllUpdateListeners();
        c163306b0.LJLLJ.end();
    }

    public LSY(Context context) {
        this(context, null, 0);
    }

    public LSY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LSY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ad1, C16880lQ.LLZIL(context), null);
        this.LJLJI = (C163306b0) LLLZIIL.findViewById(R.id.f8p);
        View findViewById = LLLZIIL.findViewById(R.id.f37);
        addView(LLLZIIL, new FrameLayout.LayoutParams(-1, -1));
        this.LJLJJI = (int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.LJLIL = new AnimatorSet();
        this.LJLILLLLZI = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "rotation", 0.0f, 60.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, "translationY", 0.0f, this.LJLJJI * (-60.0f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById, "rotation", 60.0f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById, "translationY", this.LJLJJI * (-60.0f), 0.0f);
        this.LJLIL.play(ofFloat).with(ofFloat2);
        this.LJLILLLLZI.play(ofFloat3).with(ofFloat4);
        findViewById.setPivotX((int) TypedValue.applyDimension(1, 114.0f, context.getResources().getDisplayMetrics()));
        findViewById.setPivotY((int) TypedValue.applyDimension(1, 60.0f, context.getResources().getDisplayMetrics()));
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new DecelerateInterpolator(4.0f));
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator(4.0f));
        ofFloat3.setDuration(1000L);
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat4.setDuration(1000L);
        ofFloat4.setInterpolator(new DecelerateInterpolator(2.0f));
        this.LJLIL.addListener(new ALAdapterS7S0100000_9(this, 2));
        this.LJLILLLLZI.addListener(new ALAdapterS7S0100000_9(this, 3));
    }
}
