package X;

import Y.IDCListenerS86S0200000_42;
import Y.IDObjectS0S0101000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aa1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94005aa1 extends HorizontalScrollView {
    public final List<InterfaceC94004aa0> LJLIL;
    public int LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public final LinearLayout LJLJJL;

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
    }

    private final int getScreenWidth() {
        return C116504hi.LIZIZ(getContext());
    }

    public final LinearLayout getItemContainer() {
        return this.LJLJJL;
    }

    public final void LIZ(View view) {
        int left = ((view.getLeft() + (view.getWidth() / 2)) - getScrollX()) - (getWidth() / 2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deltaX:");
        LIZ.append(left);
        C94034aaU.LIZ("TabSelectView", X1D.LIZIZ(LIZ));
        smoothScrollBy(left, 0);
        if (this.LJLILLLLZI == this.LJLJJL.indexOfChild(view)) {
            return;
        }
        int i = this.LJLILLLLZI;
        this.LJLILLLLZI = this.LJLJJL.indexOfChild(view);
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            InterfaceC94004aa0 interfaceC94004aa0 = (InterfaceC94004aa0) it.next();
            if (i > 0 && i < this.LJLJJL.getChildCount() - 1) {
                View childAt = this.LJLJJL.getChildAt(i);
                o.LJIIIIZZ(childAt, "itemContainer.getChildAt(lastSelectIndex)");
                interfaceC94004aa0.LIZ(childAt);
            }
            interfaceC94004aa0.LIZIZ(this.LJLILLLLZI - 1, view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && motionEvent != null && motionEvent.getAction() == 1 && this.LJLJJL.getChildCount() > 0) {
            Iterator<View> it = C78924UyG.LIZLLL(this.LJLJJL).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                }
                View view = (View) iDObjectS0S0101000.next();
                int scrollX = getScrollX();
                int left = view.getLeft();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = null;
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i2 = 0;
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.leftMargin;
                } else {
                    i = 0;
                }
                if (scrollX > (left - i) - (getWidth() / 2)) {
                    int scrollX2 = getScrollX();
                    int right = view.getRight();
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        layoutParams2 = layoutParams3;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams2 != null) {
                        i2 = marginLayoutParams2.rightMargin;
                    }
                    if (scrollX2 <= (right + i2) - (getWidth() / 2)) {
                        if (this.LJLJJL.indexOfChild(view) == 0) {
                            View childAt = this.LJLJJL.getChildAt(1);
                            if (childAt != null) {
                                LIZ(childAt);
                            }
                        } else if (this.LJLJJL.indexOfChild(view) == this.LJLJJL.getChildCount() - 1) {
                            View childAt2 = this.LJLJJL.getChildAt(r1.getChildCount() - 2);
                            if (childAt2 != null) {
                                LIZ(childAt2);
                            }
                        } else {
                            LIZ(view);
                        }
                    }
                }
            }
        }
        return onTouchEvent;
    }

    public final void setItemList(List<? extends View> items) {
        o.LJIIIZ(items, "items");
        if (items.isEmpty()) {
            return;
        }
        this.LJLJJL.removeAllViews();
        this.LJLJJL.addView(this.LJLJI);
        for (View view : items) {
            this.LJLJJL.addView(view);
            C16880lQ.LJIIJ(new IDCListenerS86S0200000_42(this, view, 5), view);
        }
        this.LJLJJL.addView(this.LJLJJI);
    }

    public C94005aa1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94005aa1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        this.LJLIL = new ArrayList();
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(getScreenWidth(), 0));
        this.LJLJI = view;
        View view2 = new View(context);
        view2.setLayoutParams(new FrameLayout.LayoutParams(getScreenWidth(), 0));
        this.LJLJJI = view2;
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        this.LJLJJL = linearLayout;
        setClickable(true);
    }
}
