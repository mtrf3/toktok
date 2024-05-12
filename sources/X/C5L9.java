package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5L9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L9 extends ViewGroup {
    public final int LJLIL;

    public final void setTagList(String[] list) {
        o.LJIIIZ(list, "list");
        removeAllViews();
        for (String str : list) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            frameLayout.setPadding(C17N.LJIILL(4.0d), C17N.LJIILL(2.0d), C17N.LJIILL(4.0d), C17N.LJIILL(2.0d));
            frameLayout.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.au1));
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setLines(1);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView);
            addView(frameLayout);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5L9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C17N.LJIILL(4.0d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        measureChildren(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i3 = 0;
                } else {
                    i3 = View.MeasureSpec.getSize(i);
                }
            } else {
                i3 = View.MeasureSpec.getSize(i);
            }
        } else {
            int size = View.MeasureSpec.getSize(i);
            int childCount = getChildCount();
            i3 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (i5 == 0) {
                    if (childAt.getMeasuredWidth() >= size) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    measuredWidth = childAt.getMeasuredWidth();
                    i3 = measuredWidth + i3;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + i3;
                    int i6 = this.LJLIL;
                    if (measuredWidth2 + i6 >= size) {
                        break;
                    }
                    childAt.layout(i6 + i3, 0, childAt.getMeasuredWidth() + i3 + this.LJLIL, childAt.getMeasuredHeight());
                    i3 += this.LJLIL;
                    measuredWidth = childAt.getMeasuredWidth();
                    i3 = measuredWidth + i3;
                }
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i4 = View.MeasureSpec.getSize(i2);
                }
            } else {
                i4 = View.MeasureSpec.getSize(i2);
            }
        } else {
            int childCount2 = getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount2; i8++) {
                i7 = Math.max(i7, getChildAt(0).getMeasuredHeight());
            }
            i4 = i7;
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 < childCount) {
                View childAt = getChildAt(i5);
                if (i5 == 0) {
                    if (childAt.getMeasuredWidth() >= i3) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    i6 += childAt.getMeasuredWidth();
                    i5++;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth() + i6;
                    int i7 = this.LJLIL;
                    if (measuredWidth + i7 >= i3) {
                        break;
                    }
                    childAt.layout(i7 + i6, 0, childAt.getMeasuredWidth() + i6 + this.LJLIL, childAt.getMeasuredHeight());
                    i6 += this.LJLIL;
                    i6 += childAt.getMeasuredWidth();
                    i5++;
                }
            } else {
                i5 = getChildCount() - 1;
                break;
            }
        }
        removeViewsInLayout(i5 + 1, (getChildCount() - i5) - 1);
    }
}
