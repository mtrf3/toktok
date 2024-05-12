package Y;

import X.AJ8;
import X.C16880lQ;
import X.C250999t9;
import X.T5T;
import X.ViewOnClickListenerC250559sR;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.ugc.aweme.feed.assem.statecontrol.StateControlMediaAssem;
import com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ARunnableS10S0110000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(((DefaultMixListCell) this.l0).itemView.getContext(), "input_method");
        T5T t5t = ((DefaultMixListCell) this.l0).LJLIL;
        if (t5t != null) {
            t5t.setFocusable(this.z1);
            T5T t5t2 = ((DefaultMixListCell) this.l0).LJLIL;
            if (t5t2 != null) {
                t5t2.setFocusableInTouchMode(this.z1);
                if (this.z1) {
                    T5T t5t3 = ((DefaultMixListCell) this.l0).LJLIL;
                    if (t5t3 != null) {
                        t5t3.requestFocus();
                        T5T t5t4 = ((DefaultMixListCell) this.l0).LJLIL;
                        if (t5t4 != null) {
                            t5t4.setSelection(t5t4.getText().toString().length());
                            if (inputMethodManager != null) {
                                T5T t5t5 = ((DefaultMixListCell) this.l0).LJLIL;
                                if (t5t5 != null) {
                                    inputMethodManager.showSoftInput(t5t5, 2);
                                    return;
                                } else {
                                    o.LJIJI("editText");
                                    throw null;
                                }
                            }
                            return;
                        }
                        o.LJIJI("editText");
                        throw null;
                    }
                    o.LJIJI("editText");
                    throw null;
                }
                if (inputMethodManager == null) {
                    return;
                }
                T5T t5t6 = ((DefaultMixListCell) this.l0).LJLIL;
                if (t5t6 != null) {
                    inputMethodManager.hideSoftInputFromWindow(t5t6.getWindowToken(), 0);
                    return;
                } else {
                    o.LJIJI("editText");
                    throw null;
                }
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }

    public static final void run$0(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        if (!aRunnableS10S0110000_4.z1) {
            long currentTimeMillis = System.currentTimeMillis();
            ViewOnClickListenerC250559sR viewOnClickListenerC250559sR = (ViewOnClickListenerC250559sR) aRunnableS10S0110000_4.l0;
            if (currentTimeMillis >= viewOnClickListenerC250559sR.LJLJI && viewOnClickListenerC250559sR.isShowing()) {
                ((ViewOnClickListenerC250559sR) aRunnableS10S0110000_4.l0).LIZLLL(false);
            }
        }
    }

    public static final void run$1(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        boolean LIZ;
        int i;
        try {
            View view = (View) aRunnableS10S0110000_4.l0;
            if (aRunnableS10S0110000_4.z1) {
                i = 4;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        boolean LIZ;
        int i;
        try {
            View containerView = ((StateControlMediaAssem) aRunnableS10S0110000_4.l0).getContainerView();
            if (aRunnableS10S0110000_4.z1) {
                i = 0;
            } else {
                i = 8;
            }
            containerView.setVisibility(i);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        boolean LIZ;
        try {
            aRunnableS10S0110000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        boolean LIZ;
        try {
            C250999t9 c250999t9 = (C250999t9) aRunnableS10S0110000_4.l0;
            c250999t9.LJLZ = true;
            if (aRunnableS10S0110000_4.z1) {
                c250999t9.getShapeBubbleView().LIZIZ(new AqS154S0100000_4(aRunnableS10S0110000_4, 1022));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        long j;
        float f;
        final View view = (View) aRunnableS10S0110000_4.l0;
        final boolean z = aRunnableS10S0110000_4.z1;
        final int height = (int) (view.getHeight() * 0.075f);
        if (z) {
            j = 300;
        } else {
            j = 100;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.973
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f3;
                int i = height;
                View view2 = view;
                boolean z2 = z;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f4 = i;
                int i2 = (int) (f4 - (f4 * animatedFraction));
                if (z2) {
                    f3 = i2;
                } else {
                    f3 = animatedFraction * (-i);
                }
                view2.setTranslationY(f3);
            }
        });
        ofFloat.setInterpolator(new AJ8());
        ofFloat.start();
    }

    public static final void run$6(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        boolean LIZ;
        try {
            ((KeyboardStateViewModel) aRunnableS10S0110000_4.l0).LJLILLLLZI.setValue(Boolean.valueOf(aRunnableS10S0110000_4.z1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        boolean LIZ;
        try {
            ((KeyboardStateViewModel) aRunnableS10S0110000_4.l0).LJLIL.setValue(Boolean.valueOf(aRunnableS10S0110000_4.z1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS10S0110000_4 aRunnableS10S0110000_4) {
        boolean LIZ;
        try {
            if (aRunnableS10S0110000_4.z1) {
                ((View) aRunnableS10S0110000_4.l0).setVisibility(0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S0110000_4(ViewOnClickListenerC250559sR viewOnClickListenerC250559sR, int i) {
        this.$t = i;
        this.l0 = viewOnClickListenerC250559sR;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS10S0110000_4(android.view.View r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS10S0110000_4.<init>(android.view.View, boolean, int):void");
    }

    public ARunnableS10S0110000_4(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
