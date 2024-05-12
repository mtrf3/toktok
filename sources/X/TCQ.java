package X;

import Y.IDAListenerS79S0100000_12;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class TCQ extends PopupWindow {
    public final int LIZ;
    public final int LIZIZ;
    public ValueAnimator LIZJ;
    public final ImageView LIZLLL;

    public final void LIZ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 1.0f, 0.0f);
        ofFloat.setInterpolator(new TCR());
        ofFloat.setDuration(316L);
        ofFloat.addListener(new IDAListenerS79S0100000_12(this, 11));
        ofFloat.start();
    }

    public TCQ(Activity activity, int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        setWidth(i);
        setHeight(i2);
        setContentView(C16880lQ.LLLZIIL(R.layout.atg, C16880lQ.LLZIL(activity), null));
        this.LIZLLL = (ImageView) getContentView().findViewById(R.id.ewe);
    }
}
