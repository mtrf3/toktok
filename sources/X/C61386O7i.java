package X;

import Y.ALAdapterS3S0000000_10;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS40S0100000_4;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.O7i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61386O7i {
    public final Context LIZ;
    public final O7E LIZIZ;
    public final RelativeLayout LIZJ;
    public LinearLayout LIZLLL;
    public final O8K LJ;
    public final PointF LJFF = new PointF();
    public final int LJI;

    public C61386O7i(Context context, O7E o7e, RelativeLayout relativeLayout, O87 o87) {
        boolean z;
        boolean z2;
        ObjectAnimator objectAnimator;
        this.LIZ = context;
        this.LIZIZ = o7e;
        this.LIZJ = relativeLayout;
        this.LJ = o87;
        this.LJI = ViewConfiguration.get(context).getScaledTouchSlop();
        int i = o7e.LLJILJIL;
        if (i == 7) {
            z = true;
        } else {
            z = false;
        }
        if (z || i == 6) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.LIZLLL = linearLayout;
            linearLayout.setOrientation(1);
            this.LIZLLL.setBackgroundResource(R.drawable.c69);
            this.LIZLLL.setGravity(81);
            if (o7e.LLJILJIL == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.c6c);
                imageView.setClickable(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = (int) C61384O7g.LIZIZ(context, 4.0f);
                this.LIZLLL.addView(imageView, layoutParams);
                imageView.post(new ARunnableS29S0200000_10(imageView, this, 48));
            }
            TextView textView = new TextView(context);
            textView.setText(o7e.LLJILJILJ);
            textView.setTextColor(ColorStateList.valueOf(-1));
            textView.setTextSize(1, 15.0f);
            float LIZIZ = (int) C61384O7g.LIZIZ(context, 1.0f);
            textView.setShadowLayer(LIZIZ, 0.0f, LIZIZ, Color.argb(31, 0, 0, 0));
            textView.setClickable(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = (int) C61384O7g.LIZIZ(context, 54.0f);
            this.LIZLLL.addView(textView, layoutParams2);
            if (o7e.LLJILLL > 0) {
                this.LIZLLL.setVisibility(8);
                relativeLayout.postDelayed(new ARunnableS40S0100000_4(this, 114), o7e.LLJILLL);
            }
            if (o7e.LLJILJIL == 7) {
                objectAnimator = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -C61384O7g.LIZIZ(context, 8.0f), 0.0f);
                objectAnimator.setDuration(2000L);
                objectAnimator.addListener(new ALAdapterS3S0000000_10(4));
            } else {
                objectAnimator = null;
            }
            this.LIZLLL.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC61387O7j(this, objectAnimator));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) C61384O7g.LIZIZ(context, 114.0f));
            layoutParams3.addRule(12);
            relativeLayout.addView(this.LIZLLL, layoutParams3);
        }
    }
}
