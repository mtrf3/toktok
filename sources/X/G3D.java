package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G3D implements View.OnTouchListener {
    public final /* synthetic */ SwipeUpVideoComponent LJLIL;

    public G3D(SwipeUpVideoComponent swipeUpVideoComponent) {
        this.LJLIL = swipeUpVideoComponent;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    SwipeUpVideoComponent swipeUpVideoComponent = this.LJLIL;
                    float rawY = (int) motionEvent.getRawY();
                    SwipeUpVideoComponent swipeUpVideoComponent2 = this.LJLIL;
                    swipeUpVideoComponent.LJLL = rawY - swipeUpVideoComponent2.LJLJLLL;
                    float f = swipeUpVideoComponent2.LJLL;
                    if (f < 0.0f) {
                        View view2 = swipeUpVideoComponent2.LJLLI;
                        if (view2 != null) {
                            view2.setTranslationY(f);
                        } else {
                            o.LJIJI("viewRoot");
                            throw null;
                        }
                    }
                }
            } else {
                View view3 = this.LJLIL.LJLLI;
                if (view3 != null) {
                    float abs = Math.abs(view3.getTranslationY());
                    if (this.LJLIL.LJLLI != null) {
                        if (abs >= r0.getMeasuredHeight() / 3) {
                            SwipeUpVideoComponent swipeUpVideoComponent3 = this.LJLIL;
                            if (!swipeUpVideoComponent3.LJLLL) {
                                swipeUpVideoComponent3.Dl("slide_up");
                                TuxTextView tuxTextView = this.LJLIL.LJLLILLLL;
                                if (tuxTextView != null) {
                                    C12460eI.LJIILJJIL(tuxTextView, "c5319", "d1940", null, null);
                                    this.LJLIL.LJLLL = true;
                                } else {
                                    o.LJIJI("startWatchingView");
                                    throw null;
                                }
                            }
                            SwipeUpVideoComponent swipeUpVideoComponent4 = this.LJLIL;
                            swipeUpVideoComponent4.getClass();
                            C63078OpG.LIZ();
                            swipeUpVideoComponent4.vl(null);
                        } else {
                            SwipeUpVideoComponent swipeUpVideoComponent5 = this.LJLIL;
                            View view4 = swipeUpVideoComponent5.LJLLI;
                            if (view4 != null) {
                                view4.clearAnimation();
                                View view5 = swipeUpVideoComponent5.LJLLI;
                                if (view5 != null) {
                                    ObjectAnimator.ofFloat(view5, (Property<View, Float>) View.TRANSLATION_Y, 0.0f).start();
                                } else {
                                    o.LJIJI("viewRoot");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("viewRoot");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("viewRoot");
                        throw null;
                    }
                } else {
                    o.LJIJI("viewRoot");
                    throw null;
                }
            }
        } else {
            this.LJLIL.LJLJLLL = motionEvent.getRawY();
        }
        GestureDetector gestureDetector = this.LJLIL.LJLJLJ;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
            return false;
        }
        o.LJIJI("mGestureDetector");
        throw null;
    }
}
