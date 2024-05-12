package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class O7Y extends O8G {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ O7W LJLJI;

    @Override // X.O8G
    public final boolean LIZ() {
        float y = this.LJLJI.LJLJI.getY();
        if (!this.LJLIL) {
            O7W o7w = this.LJLJI;
            if (o7w.LLILIL && y < 0.0f) {
                this.LJLIL = true;
                LIZIZ(o7w.LJLJI, y);
                this.LJLJI.LLIILZL.setDuration(((-y) / C61384O7g.LIZIZ(this.LJLJI.getContext(), 42.0f)) * 300.0f);
                this.LJLJI.LLIILZL.start();
                return true;
            }
            return false;
        }
        return false;
    }

    public O7Y(O7W o7w) {
        this.LJLJI = o7w;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLIL = false;
        this.LJLJI.LLILIL = false;
        return true;
    }

    public final void LIZIZ(View view, float f) {
        this.LJLJI.LLIILZL = ObjectAnimator.ofFloat(view, "y", f, 0.0f);
        this.LJLJI.LLIILZL.setInterpolator(new O84());
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ObjectAnimator objectAnimator;
        float y;
        O7W o7w = this.LJLJI;
        o7w.LLILIL = true;
        if (this.LJLIL) {
            return true;
        }
        this.LJLIL = true;
        if (f2 < 0.0f) {
            float LIZIZ = C61384O7g.LIZIZ(o7w.getContext(), 42.0f);
            long max = Math.max(0L, LIZIZ - (this.LJLJI.LJLJI.getY() / f2));
            FrameLayout frameLayout = this.LJLJI.LJLJI;
            objectAnimator = ObjectAnimator.ofFloat(frameLayout, "y", frameLayout.getY(), -LIZIZ);
            objectAnimator.setInterpolator(new LinearInterpolator());
            objectAnimator.setDuration(max);
        } else {
            objectAnimator = null;
        }
        float LIZIZ2 = C61384O7g.LIZIZ(this.LJLJI.getContext(), 42.0f);
        if (f2 < 0.0f) {
            y = -LIZIZ2;
        } else {
            y = this.LJLJI.LJLJI.getY();
        }
        LIZIZ(this.LJLJI.LJLJI, y);
        this.LJLJI.LLIILZL.setDuration(((-y) / C61384O7g.LIZIZ(this.LJLJI.getContext(), 42.0f)) * 300.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        if (objectAnimator != null) {
            animatorSet.playSequentially(objectAnimator, this.LJLJI.LLIILZL);
        } else {
            animatorSet.play(this.LJLJI.LLIILZL);
        }
        animatorSet.start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LJLJI.LLILIL && f2 > 0.0f) {
            O79.LIZIZ().LJII(this.LJLJI.LLIFFJFJJ, "slide_up");
        }
        O7W o7w = this.LJLJI;
        if (o7w.LLIIIL > 1 && !this.LJLIL) {
            float LIZIZ = C61384O7g.LIZIZ(o7w.getContext(), 42.0f);
            float y = this.LJLJI.LJLJI.getY() - f2;
            if (y >= 0.0f) {
                y = 0.0f;
            } else {
                float f3 = -LIZIZ;
                if (y <= f3) {
                    y = f3;
                }
            }
            this.LJLJI.LJLJI.setY(y);
            this.LJLJI.LJLJI.requestLayout();
            if (f2 > 0.0f) {
                if (this.LJLJI.LJZ.getVisibility() != 0) {
                    O7W o7w2 = this.LJLJI;
                    TextView textView = o7w2.LJZ;
                    String str = o7w2.LLIFFJFJJ.LLJILJILJ;
                    StringBuilder LIZ = X1D.LIZ();
                    String str2 = "";
                    String LIZ2 = C08380Uo.LIZ(LIZ, this.LJLJI.LLIIIL, "", LIZ);
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str.replace("%", LIZ2);
                    }
                    textView.setText(str2);
                    this.LJLJI.LJIIJJI();
                }
                if (!this.LJLILLLLZI) {
                    this.LJLJI.LLIILII = new AnimatorSet();
                    O7W o7w3 = this.LJLJI;
                    AnimatorSet.Builder play = o7w3.LLIILII.play(o7w3.LJIIIIZZ(o7w3.LJZ));
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJI.LJZI, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    play.with(ofFloat);
                    this.LJLJI.LLIILII.start();
                    this.LJLILLLLZI = true;
                    HashMap<String, Object> hashMap = new HashMap<>(1);
                    hashMap.put("refer", "tips");
                    O79.LIZIZ().LJI(this.LJLJI.LLIFFJFJJ, 0L, "othershow", hashMap, null);
                }
            }
            this.LJLJI.LLILIL = true;
        }
        return true;
    }
}
