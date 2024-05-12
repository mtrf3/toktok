package X;

import Y.ALAdapterS1S0100000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6JI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JI extends FrameLayout implements View.OnClickListener {
    public FrameLayout LJLIL;
    public FrameLayout LJLILLLLZI;
    public final AqS152S0100000_2 LJLJI;
    public InterfaceC88472Yns<? super C6JH, C76800UCe> LJLJJI;
    public InterfaceC88472Yns<? super C6JH, C76800UCe> LJLJJL;
    public final C156306Bm LJLJJLL;
    public C156306Bm LJLJL;
    public volatile int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final PointF LJLLILLLL;
    public C6JH LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public Animator LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLZ;
        Integer valueOf = Integer.valueOf(R.id.m_p);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.m_p);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        float f;
        this.LJLLL = 0;
        this.LJLL = false;
        C6JH c6jh = this.LJLLJ;
        if (c6jh != null) {
            c6jh.setTouchEnable(true);
        }
        if (!this.LJLLI) {
            C6JH c6jh2 = this.LJLLJ;
            if (c6jh2 != null) {
                ALAdapterS1S0100000_2 aLAdapterS1S0100000_2 = new ALAdapterS1S0100000_2(this, 53);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c6jh2, "scaleX", this.LJLJJLL.LJLIL, this.LJLJL.LJLIL);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c6jh2, "scaleY", this.LJLJJLL.LJLILLLLZI, this.LJLJL.LJLILLLLZI);
                float[] fArr = new float[2];
                float f2 = this.LJLJL.LJLJI;
                if (f2 > 180.0f) {
                    f = 360.0f;
                } else {
                    f = this.LJLJJLL.LJLJI;
                }
                fArr[0] = f;
                fArr[1] = f2;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c6jh2, "rotation", fArr);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c6jh2, "x", this.LJLJJLL.LJLJJI, this.LJLJL.LJLJJI);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c6jh2, "y", this.LJLJJLL.LJLJJL, this.LJLJL.LJLJJL);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.addListener(aLAdapterS1S0100000_2);
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                animatorSet.start();
                this.LJLLLLLL = animatorSet;
                LIZJ();
            }
            this.LJLLI = true;
        }
    }

    public final void LIZJ() {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LIZ = C105574Cj.LIZ(context);
        if (LIZ != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(LIZ.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public final InterfaceC88472Yns<C6JH, C76800UCe> getBeforeChangeListener() {
        return this.LJLJJL;
    }

    public final InterfaceC88472Yns<C6JH, C76800UCe> getOnCompleteListener() {
        return this.LJLJJI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (o.LJ(view, this) || o.LJ(view, LIZ())) {
            LIZJ();
        }
    }

    public final void setBeforeChangeListener(InterfaceC88472Yns<? super C6JH, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    public final void setMaxLine(int i) {
        this.LJLLLL = i;
    }

    public final void setOnCompleteListener(InterfaceC88472Yns<? super C6JH, C76800UCe> interfaceC88472Yns) {
        this.LJLJJI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6JI(Context context, AttributeSet attr) {
        super(context, attr);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attr, "attr");
        this.LJLZ = new LinkedHashMap();
        this.LJLJI = new AqS152S0100000_2(this, 1081);
        this.LJLJJLL = new C156306Bm(0);
        this.LJLJL = new C156306Bm(0);
        this.LJLLILLLL = new PointF(0.0f, 0.0f);
        this.LJLLL = 0;
        this.LJLLLL = 3;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context2));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.boj, this, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) LLLLIILL;
        this.LJLIL = frameLayout;
        addView(frameLayout);
        C16880lQ.LJJJJI((TuxTextView) LIZ(), this);
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
        setVisibility(4);
    }

    public final void LIZLLL(C6JH c6jh, C156306Bm animatorInfo) {
        o.LJIIIZ(animatorInfo, "animatorInfo");
        setVisibility(0);
        if (c6jh != null) {
            c6jh.setInEditMode(true);
            this.LJLLL = 2;
            this.LJLJL = animatorInfo;
            float f = animatorInfo.LJLJI % 360.0f;
            if (f < 0.0f) {
                f += 360.0f;
            }
            animatorInfo.LJLJI = f;
            this.LJLLJ = c6jh;
            c6jh.setTouchEnable(false);
            ViewParent parent = c6jh.getParent();
            if (parent != null) {
                C16880lQ.LJLLL(this.LJLLJ, (ViewGroup) parent);
            }
            FrameLayout frameLayout = this.LJLIL;
            if (frameLayout != null) {
                frameLayout.addView(c6jh);
                c6jh.setEditEnable(true);
                setVisibility(0);
                C6JH c6jh2 = this.LJLLJ;
                if (c6jh2 != null) {
                    c6jh2.setVisibility(4);
                }
                C6JH c6jh3 = this.LJLLJ;
                if (c6jh3 != null) {
                    C6JK.LIZIZ = this.LJLLLL;
                    ((TextView) c6jh3.LIZ(R.id.d03)).setMaxLines(C6JK.LIZIZ);
                }
                C6JH c6jh4 = this.LJLLJ;
                if (c6jh4 != null) {
                    c6jh4.setEditTextFocusable(animatorInfo.LJLJJLL);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
            } else {
                o.LJIJI("container");
                throw null;
            }
        }
        this.LJLLL = 1;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C6JH c6jh5 = new C6JH(context);
        C6JK.LIZIZ = this.LJLLLL;
        ((TextView) c6jh5.LIZ(R.id.d03)).setMaxLines(C6JK.LIZIZ);
        c6jh5.setTouchEnable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        c6jh5.setInEditMode(true);
        c6jh5.setVisibility(4);
        FrameLayout frameLayout2 = this.LJLIL;
        if (frameLayout2 != null) {
            frameLayout2.addView(c6jh5, layoutParams);
            this.LJLLJ = c6jh5;
            c6jh5.setEditTextFocusable(0);
            return;
        }
        o.LJIJI("container");
        throw null;
    }
}
