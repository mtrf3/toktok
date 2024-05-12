package X;

import Y.ARunnableS50S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: X.WdK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82722WdK extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public FrameLayout.LayoutParams LJLJI;
    public Drawable[] LJLJJI;
    public final Random LJLJJL;
    public Queue<ImageView> LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final Handler LJLLI;
    public final ARunnableS50S0100000_14 LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public float LL;
    public PointF LLD;
    public PointF LLF;
    public PointF LLFF;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLLI.removeCallbacksAndMessages(null);
    }

    public final void LIZ(View view) {
        C82721WdJ c82721WdJ;
        if (view.getTag() == null) {
            return;
        }
        this.LJLJJLL.add(view);
        ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
        if (valueAnimator != null) {
            valueAnimator.setTarget(null);
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if ((view.getTag(R.id.lcg) instanceof C82721WdJ) && (c82721WdJ = (C82721WdJ) view.getTag(R.id.lcg)) != null) {
            c82721WdJ.LJLIL = null;
        }
        view.setAlpha(0.0f);
        view.setScaleX(0.3f);
        view.setScaleY(0.3f);
        view.setRotation(0.0f);
        view.setTag(null);
    }

    public C82722WdK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = new Random();
        this.LJLLI = new Handler(C16880lQ.LLJJJJ());
        this.LJLLILLLL = new ARunnableS50S0100000_14(this, 103);
        this.LJLLL = 0;
        this.LJZL = -1.0f;
        this.LL = -1.0f;
        this.LJLJJLL = new LinkedList();
        this.LJLJJI = new Drawable[2];
        Drawable drawable = getResources().getDrawable(R.drawable.bmg);
        Drawable drawable2 = getResources().getDrawable(R.drawable.bmh);
        Drawable[] drawableArr = this.LJLJJI;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.LJLJL = drawable.getIntrinsicHeight();
        this.LJLJLJ = drawable.getIntrinsicWidth();
        this.LJLJI = new FrameLayout.LayoutParams(this.LJLJLJ, this.LJLJL);
        this.LJLLLL = KL2.LIZJ(getContext(), 51.0f);
        this.LJLLLLLL = KL2.LIZJ(getContext(), 48.0f);
        this.LJLZ = KL2.LIZJ(getContext(), 20.0f);
        this.LJZ = KL2.LIZJ(getContext(), 8.0f);
        this.LJZI = KL2.LIZJ(getContext(), 2.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLILLLLZI = getMeasuredWidth();
        this.LJLIL = getMeasuredHeight();
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        this.LJLLJ = z;
        this.LJZL = -1.0f;
    }
}
