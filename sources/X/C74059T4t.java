package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import o3.h0;

/* renamed from: X.T4t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74059T4t extends C80420VhI implements InterfaceC74061T4v {
    public final C80508Vii LJLJJI;
    public final Rect LJLJJL;
    public final RectF LJLJJLL;
    public final SparseArray<TextView> LJLJL;
    public final C74048T4i LJLJLJ;
    public final int[] LJLJLLL;
    public final float[] LJLL;
    public final int LJLLI;
    public String[] LJLLILLLL;
    public float LJLLJ;
    public final ColorStateList LJLLL;

    public final void LJJLL() {
        RadialGradient radialGradient;
        RectF rectF = this.LJLJJI.LJLLI;
        for (int i = 0; i < this.LJLJL.size(); i++) {
            TextView textView = this.LJLJL.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.LJLJJL);
                this.LJLJJL.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.LJLJJL);
                this.LJLJJLL.set(this.LJLJJL);
                if (!RectF.intersects(rectF, this.LJLJJLL)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.LJLJJLL.left, rectF.centerY() - this.LJLJJLL.top, 0.5f * rectF.width(), this.LJLJLLL, this.LJLL, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C17760mq(accessibilityNodeInfo).LJIILLIIL(C17730mn.LIZ(1, this.LJLLILLLL.length, 1));
    }

    public void setHandRotation(float f) {
        this.LJLJJI.LIZIZ(f, false);
        LJJLL();
    }

    @Override // X.C80420VhI
    public void setRadius(int i) {
        if (i != getRadius()) {
            super.setRadius(i);
            C80508Vii c80508Vii = this.LJLJJI;
            c80508Vii.LJLZ = getRadius();
            c80508Vii.invalidate();
        }
    }

    public C74059T4t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC74061T4v
    public final void LJJIJIIJIL(float f, boolean z) {
        if (Math.abs(this.LJLLJ - f) > 0.001f) {
            this.LJLLJ = f;
            LJJLL();
        }
    }

    public final void LJJZ(int i, String[] strArr) {
        this.LJLLILLLL = strArr;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        int size = this.LJLJL.size();
        for (int i2 = 0; i2 < Math.max(this.LJLLILLLL.length, size); i2++) {
            TextView textView = this.LJLJL.get(i2);
            if (i2 >= this.LJLLILLLL.length) {
                if (C78996UzQ.LJJIIJZLJL(textView)) {
                    C78996UzQ.LJI();
                }
                removeView(textView);
                this.LJLJL.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) C16880lQ.LLLLIILL(LLZIL, R.layout.brr, this, false);
                    this.LJLJL.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.LJLLILLLL[i2]);
                textView.setTag(R.id.gg9, Integer.valueOf(i2));
                h0.LJIJI(textView, this.LJLJLJ);
                textView.setTextColor(this.LJLLL);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.LJLLILLLL[i2]));
                }
            }
        }
    }

    public C74059T4t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.b03);
        this.LJLJJL = new Rect();
        this.LJLJJLL = new RectF();
        this.LJLJL = new SparseArray<>();
        this.LJLL = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3r, R.attr.a3u}, R.attr.b03, R.style.a26);
        Resources resources = getResources();
        ColorStateList LIZ = C80285Vf7.LIZ(context, obtainStyledAttributes, 1);
        this.LJLLL = LIZ;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.brs, this, true);
        C80508Vii c80508Vii = (C80508Vii) findViewById(R.id.gft);
        this.LJLJJI = c80508Vii;
        this.LJLLI = resources.getDimensionPixelSize(R.dimen.yh);
        int colorForState = LIZ.getColorForState(new int[]{android.R.attr.state_selected}, LIZ.getDefaultColor());
        this.LJLJLLL = new int[]{colorForState, colorForState, LIZ.getDefaultColor()};
        ((ArrayList) c80508Vii.LJLJL).add(this);
        int defaultColor = C04330Ez.LIZJ(R.color.o8, context).getDefaultColor();
        ColorStateList LIZ2 = C80285Vf7.LIZ(context, obtainStyledAttributes, 0);
        setBackgroundColor(LIZ2 != null ? LIZ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC74060T4u(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.LJLJLJ = new C74048T4i(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        LJJZ(0, strArr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LJJLL();
    }
}
