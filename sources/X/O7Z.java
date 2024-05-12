package X;

import Y.ALAdapterS8S0100000_10;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class O7Z extends O8G {
    public boolean LJLIL;
    public final /* synthetic */ O7W LJLILLLLZI;

    public O7Z(O7W o7w) {
        this.LJLILLLLZI = o7w;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLILLLLZI.LLILIL = false;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.LJLILLLLZI.LLILIL = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LJLILLLLZI.LLILIL && f2 > 0.0f) {
            O79.LIZIZ().LJII(this.LJLILLLLZI.LLIFFJFJJ, "slide_up");
        }
        O7W o7w = this.LJLILLLLZI;
        o7w.LLILIL = true;
        if (!this.LJLIL && f2 >= 0.0f && o7w.LLIIIL > 1) {
            TextView textView = o7w.LJZ;
            String str = o7w.LLIFFJFJJ.LLJILJILJ;
            StringBuilder LIZ = X1D.LIZ();
            String str2 = "";
            String LIZ2 = C08380Uo.LIZ(LIZ, this.LJLILLLLZI.LLIIIL, "", LIZ);
            if (!TextUtils.isEmpty(str)) {
                str2 = str.replace("%", LIZ2);
            }
            textView.setText(str2);
            if (this.LJLILLLLZI.LJZ.getVisibility() != 0) {
                this.LJLILLLLZI.LJIIJJI();
            }
            this.LJLIL = true;
            O7W o7w2 = this.LJLILLLLZI;
            if (o7w2.LLIILII == null) {
                o7w2.LLIILII = new AnimatorSet();
                ALAdapterS8S0100000_10 aLAdapterS8S0100000_10 = new ALAdapterS8S0100000_10(this, 5);
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJLILLLLZI.LJZ, "alpha", 1.0f, 0.0f).setDuration(300L);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LJLILLLLZI.LJZI, "alpha", 1.0f, 0.0f).setDuration(300L);
                duration.addListener(aLAdapterS8S0100000_10);
                duration.setStartDelay(1000L);
                duration2.setStartDelay(1000L);
                O7W o7w3 = this.LJLILLLLZI;
                AnimatorSet.Builder play = o7w3.LLIILII.play(o7w3.LJIIIIZZ(o7w3.LJZ));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLILLLLZI.LJZI, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                play.with(ofFloat).before(duration).before(duration2);
            }
            this.LJLILLLLZI.LLIILII.start();
            HashMap<String, Object> hashMap = new HashMap<>(1);
            hashMap.put("refer", "tips");
            O79.LIZIZ().LJI(this.LJLILLLLZI.LLIFFJFJJ, 0L, "othershow", hashMap, null);
        }
        return true;
    }
}
