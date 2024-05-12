package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0K5, reason: invalid class name */
/* loaded from: classes.dex */
public class C0K5 extends FrameLayout implements View.OnClickListener {
    public final C1HQ LJLIL;
    public final C1HQ LJLILLLLZI;
    public final C1HQ LJLJI;
    public String LJLJJI;
    public View LJLJJL;
    public final View LJLJJLL;
    public final View LJLJL;
    public final View LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public TransitionSet LJLLI;
    public TransitionSet LJLLILLLL;

    public final void LIZLLL() {
        LIZJ("CONTENT");
    }

    public final void LJ() {
        LIZJ("ERROR");
    }

    public final void LJFF() {
        LIZJ("LOADING");
    }

    public final void LJI() {
        LIZJ("OFFLINE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(String str) {
        if (str.equals(this.LJLJJI)) {
            return;
        }
        if (this.LJLIL.containsKey(this.LJLJJI)) {
            if (this.LJLL && this.LJLLILLLL != null) {
                TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.LJLLILLLL).addTarget((View) this.LJLIL.getOrDefault(this.LJLJJI, null)));
            }
            ((View) this.LJLIL.getOrDefault(this.LJLJJI, null)).setVisibility(8);
        }
        if (this.LJLIL.containsKey(str)) {
            if (this.LJLJLLL && this.LJLLI != null) {
                TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.LJLLI).addTarget((View) this.LJLIL.getOrDefault(str, null)));
            }
            ((View) this.LJLIL.getOrDefault(str, null)).setVisibility(0);
        }
        this.LJLJJI = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0K4 c0k4 = (C0K4) this.LJLJI.getOrDefault(this.LJLILLLLZI.getOrDefault(view, null), null);
        if (c0k4 != null) {
            c0k4.LIZIZ();
        }
    }

    public void setContentView(View view) {
        LIZ(view, "CONTENT");
    }

    public void setContentViewSrc(int i) {
        LIZIZ(i, "CONTENT");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEmptyClickListener(C0K4 c0k4) {
        this.LJLJI.put("EMPTY", c0k4);
        View view = this.LJLJJLL;
        if (view == null) {
            if (this.LJLIL.containsKey("EMPTY")) {
                C16880lQ.LJIIJ(this, (View) this.LJLIL.getOrDefault("EMPTY", null));
                this.LJLILLLLZI.put(this.LJLIL.getOrDefault("EMPTY", null), "EMPTY");
                return;
            }
            return;
        }
        C16880lQ.LJIIJ(this, view);
        this.LJLILLLLZI.put(this.LJLJJLL, "EMPTY");
    }

    public void setEmptyView(View view) {
        LIZ(view, "EMPTY");
    }

    public void setEmptyViewSrc(int i) {
        LIZIZ(i, "EMPTY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setErrorClickListener(C0K4 c0k4) {
        this.LJLJI.put("ERROR", c0k4);
        View view = this.LJLJL;
        if (view == null) {
            if (this.LJLIL.containsKey("ERROR")) {
                C16880lQ.LJIIJ(this, (View) this.LJLIL.getOrDefault("ERROR", null));
                this.LJLILLLLZI.put(this.LJLIL.getOrDefault("ERROR", null), "ERROR");
                return;
            }
            return;
        }
        C16880lQ.LJIIJ(this, view);
        this.LJLILLLLZI.put(this.LJLJL, "ERROR");
    }

    public void setErrorView(View view) {
        LIZ(view, "ERROR");
    }

    public void setErrorViewSrc(int i) {
        LIZIZ(i, "ERROR");
    }

    public void setInTransition(TransitionSet transitionSet) {
        this.LJLLI = transitionSet;
    }

    public void setLoadingView(View view) {
        LIZ(view, "LOADING");
    }

    public void setLoadingViewSrc(int i) {
        LIZIZ(i, "LOADING");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOfflineClickListener(C0K4 c0k4) {
        this.LJLJI.put("OFFLINE", c0k4);
        View view = this.LJLJLJ;
        if (view == null) {
            if (this.LJLIL.containsKey("OFFLINE")) {
                C16880lQ.LJIIJ(this, (View) this.LJLIL.getOrDefault("OFFLINE", null));
                this.LJLILLLLZI.put(this.LJLIL.getOrDefault("OFFLINE", null), "OFFLINE");
                return;
            }
            return;
        }
        C16880lQ.LJIIJ(this, view);
        this.LJLILLLLZI.put(this.LJLJLJ, "OFFLINE");
    }

    public void setOfflineView(View view) {
        LIZ(view, "OFFLINE");
    }

    public void setOfflineViewSrc(int i) {
        LIZIZ(i, "OFFLINE");
    }

    public void setOutTransition(TransitionSet transitionSet) {
        this.LJLLILLLL = transitionSet;
    }

    public C0K5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new C1HQ();
        this.LJLILLLLZI = new C1HQ();
        this.LJLJI = new C1HQ();
        this.LJLJJL = new FrameLayout(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a7d, R.attr.ab_, R.attr.aba, R.attr.abu, R.attr.ac1, R.attr.axz, R.attr.b33, R.attr.b34, R.attr.bvv, R.attr.bvy}, 0, 0);
        setLoadingViewSrc(obtainStyledAttributes.getResourceId(5, -1));
        setContentViewSrc(obtainStyledAttributes.getResourceId(0, -1));
        setEmptyViewSrc(obtainStyledAttributes.getResourceId(2, -1));
        setErrorViewSrc(obtainStyledAttributes.getResourceId(4, -1));
        setOfflineViewSrc(obtainStyledAttributes.getResourceId(7, -1));
        this.LJLJJLL = findViewById(obtainStyledAttributes.getResourceId(1, 0));
        this.LJLJL = findViewById(obtainStyledAttributes.getResourceId(3, 0));
        this.LJLJLJ = findViewById(obtainStyledAttributes.getResourceId(6, 0));
        this.LJLJLLL = obtainStyledAttributes.getBoolean(8, true);
        this.LJLL = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        this.LJLLI = new TransitionSet().addTransition(new Fade(1)).setDuration(300L).setInterpolator((TimeInterpolator) new AccelerateInterpolator());
        this.LJLLILLLL = new TransitionSet().addTransition(new Fade(2)).setDuration(300L).setInterpolator((TimeInterpolator) new DecelerateInterpolator());
    }

    public final void LIZ(View view, String str) {
        this.LJLIL.put(str, view);
        view.setVisibility(8);
        if (view.getParent() == this) {
            return;
        }
        addView(view);
        if (this.LJLJI.containsKey(str)) {
            C16880lQ.LJIIJ(this, view);
        }
    }

    public final void LIZIZ(int i, String str) {
        if (i == -1) {
            LIZ(this.LJLJJL, str);
        } else {
            LIZ(C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), i, this, false), str);
        }
    }
}
