package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RemoteViews;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

@RemoteViews.RemoteView
/* renamed from: X.0IF, reason: invalid class name */
/* loaded from: classes.dex */
public class C0IF extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public C0ID LJLJJI;
    public WeakReference<View> LJLJJL;
    public LayoutInflater LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(C0IE c0ie) {
    }

    public C0ID getExperiment() {
        String str;
        if (this.LJLJJI == null && (str = this.LJLJI) != null && !this.LJLJLJ) {
            try {
                this.LJLJLJ = true;
                this.LJLJJI = (C0ID) Class.forName(str).newInstance();
            } catch (Throwable unused) {
            }
        }
        return this.LJLJJI;
    }

    @Override // android.view.View
    public final boolean hasTransientState() {
        if (!this.LJLJL) {
            ViewParent parent = getParent();
            C0ID experiment = getExperiment();
            if (parent != null && (experiment == null || !experiment.hit())) {
                this.LJLJL = true;
                LIZ();
            }
        }
        return super.hasTransientState();
    }

    public final void LIZ() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            if (this.LJLILLLLZI != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.LJLJJLL;
                if (layoutInflater == null) {
                    layoutInflater = C16880lQ.LLZIL(getContext());
                }
                View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, this.LJLILLLLZI, viewGroup, false);
                int i = this.LJLIL;
                if (i != -1) {
                    LLLLIILL.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = LLLLIILL.getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(LLLLIILL, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(LLLLIILL, indexOfChild);
                }
                this.LJLJJL = new WeakReference<>(LLLLIILL);
                return;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public int getInflatedId() {
        return this.LJLIL;
    }

    public LayoutInflater getLayoutInflater() {
        return this.LJLJJLL;
    }

    public int getLayoutResource() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    public C0IF(Context context) {
        super(context);
        setVisibility(8);
    }

    public void setExp(String str) {
        this.LJLJI = str;
    }

    public void setExperimentImplementation(C0ID c0id) {
        this.LJLJJI = c0id;
    }

    public void setInflatedId(int i) {
        this.LJLIL = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.LJLJJLL = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.LJLJJL;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        LIZ();
    }

    public C0IF(Context context, AttributeSet attributeSet) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.vv, R.attr.vw, R.attr.vx, R.attr.vy}, 0, 0);
        this.LJLIL = obtainStyledAttributes.getResourceId(2, -1);
        this.LJLILLLLZI = obtainStyledAttributes.getResourceId(3, 0);
        setId(obtainStyledAttributes.getResourceId(1, -1));
        this.LJLJI = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public static <T extends View> T LIZIZ(View view, T t, int i, int i2) {
        C0ID experiment;
        if (t != null) {
            return t;
        }
        T t2 = (T) view.findViewById(i);
        if (t2 != null) {
            return t2;
        }
        C0IF c0if = (C0IF) view.findViewById(i2);
        if (c0if != null && !c0if.LJLJL && (experiment = c0if.getExperiment()) != null && experiment.hit()) {
            c0if.LJLJL = true;
            c0if.LIZ();
        }
        return (T) view.findViewById(i);
    }
}
