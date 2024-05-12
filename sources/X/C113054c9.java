package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4c9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113054c9 extends C113064cA {
    public ResolutionComponent LJLJI;
    public EnumC112964c0 LJLJJI;
    public C4AH LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        Integer valueOf = Integer.valueOf(R.id.btk);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.btk);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final ResolutionComponent getResolution() {
        return this.LJLJI;
    }

    public final EnumC112964c0 getStyle() {
        return this.LJLJJI;
    }

    public final void setResolution(ResolutionComponent resolutionComponent) {
        Integer num;
        Integer num2;
        Integer num3;
        ResolutionComponent resolutionComponent2 = this.LJLJI;
        Integer num4 = null;
        if (resolutionComponent2 != null) {
            num = Integer.valueOf(resolutionComponent2.height);
        } else {
            num = null;
        }
        if (resolutionComponent != null) {
            num2 = Integer.valueOf(resolutionComponent.height);
        } else {
            num2 = null;
        }
        if (o.LJ(num, num2)) {
            ResolutionComponent resolutionComponent3 = this.LJLJI;
            if (resolutionComponent3 != null) {
                num3 = Integer.valueOf(resolutionComponent3.width);
            } else {
                num3 = null;
            }
            if (resolutionComponent != null) {
                num4 = Integer.valueOf(resolutionComponent.width);
            }
            if (o.LJ(num3, num4)) {
                return;
            }
        }
        this.LJLJI = resolutionComponent;
        requestLayout();
    }

    @Override // X.C113064cA
    public void setRoundingParams(C4AH config) {
        o.LJIIIZ(config, "config");
        this.LJLJJL = config;
        super.setRoundingParams(config);
    }

    public final void setStyle(EnumC112964c0 value) {
        boolean z;
        float[] fArr;
        o.LJIIIZ(value, "value");
        if (this.LJLJJI != value) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJI = value;
        C4AH c4ah = this.LJLJJL;
        if (c4ah != null) {
            int i = C113004c4.LIZ[value.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    float f = c4ah.LJLIL;
                    float f2 = c4ah.LJLJJI;
                    fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
                } else {
                    throw new C162476Zf();
                }
            } else {
                float f3 = c4ah.LJLIL;
                float f4 = c4ah.LJLILLLLZI;
                float f5 = c4ah.LJLJI;
                float f6 = c4ah.LJLJJI;
                fArr = new float[]{f3, f3, f4, f4, f5, f5, f6, f6};
            }
            setCornerRadius(fArr);
            this.LJLILLLLZI.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.LJLIL, Path.Direction.CW);
            if (z) {
                requestLayout();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113054c9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJLL = C62850Ola.LJFF(context, "context");
        this.LJLJJI = EnumC112964c0.DEFAULT;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        double max;
        int childMeasureSpec;
        int childMeasureSpec2;
        if (this.LJLJI == null) {
            setMeasuredDimension((int) C113104cE.LIZJ, (int) C113104cE.LJ);
        } else {
            float f2 = r1.width / r1.height;
            if (this.LJLJJI == EnumC112964c0.NUDE_MASK) {
                f = C32151Nz.LJIIZILJ(86);
                max = C32151Nz.LJIIZILJ(112);
            } else if (f2 < 1.0f) {
                f = C113104cE.LIZJ;
                double d = f;
                max = Math.max(d, Math.min((1.0d * d) / f2, C113104cE.LJ));
            } else {
                double d2 = f2;
                if (d2 <= 1.2d) {
                    f = C113104cE.LIZJ;
                    double d3 = f;
                    max = Math.max(C113104cE.LIZIZ, Math.min((1.0d * d3) / d2, d3));
                } else {
                    f = C113104cE.LIZLLL;
                    max = Math.max(C113104cE.LIZ, Math.min((f * 1.0d) / d2, C113104cE.LIZJ));
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) f, LiveLayoutPreloadThreadPriority.DEFAULT);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) max, 0);
            measureChildWithMargins(LIZ(), makeMeasureSpec, 0, makeMeasureSpec2, 0);
            LIZ().measure(makeMeasureSpec, makeMeasureSpec2);
            if (LIZ().getMeasuredHeight() > max) {
                max = LIZ().getMeasuredHeight();
            }
            if (LIZ().getMeasuredWidth() > f) {
                f = LIZ().getMeasuredWidth();
            }
            setMeasuredDimension((int) f, (int) max);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), LiveLayoutPreloadThreadPriority.DEFAULT);
                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), LiveLayoutPreloadThreadPriority.DEFAULT);
                measureChildWithMargins(childAt, makeMeasureSpec3, 0, makeMeasureSpec4, 0);
                int i4 = marginLayoutParams.width;
                if (i4 == -1 || marginLayoutParams.height == -1) {
                    if (i4 == -1) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), 1073741824);
                    } else {
                        childMeasureSpec = FrameLayout.getChildMeasureSpec(makeMeasureSpec3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width);
                    }
                    if (marginLayoutParams.height == -1) {
                        childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), 1073741824);
                    } else {
                        childMeasureSpec2 = FrameLayout.getChildMeasureSpec(makeMeasureSpec4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
                    }
                    childAt.measure(childMeasureSpec, childMeasureSpec2);
                }
            }
        }
    }
}
