package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import o3.h0;

/* renamed from: X.aU2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93634aU2 extends LinearLayout {
    public C93633aU1 LJLIL;
    public View LJLILLLLZI;
    public final /* synthetic */ C93635aU3 LJLJI;

    public TextView getTextView() {
        return null;
    }

    public final void LIZ() {
        View view;
        C93633aU1 c93633aU1 = this.LJLIL;
        if (c93633aU1 != null && (view = c93633aU1.LIZLLL) != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    C16880lQ.LJLLL(view, (ViewGroup) parent);
                }
                addView(view);
            }
            this.LJLILLLLZI = view;
            TextView textView = (TextView) view.findViewById(R.id.text1);
            if (textView != null) {
                C07Y.LIZIZ(textView);
            }
            view.findViewById(R.id.icon);
        } else {
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                if (C78996UzQ.LJJIIJZLJL(view2)) {
                    C78996UzQ.LJI();
                }
                removeView(view2);
                this.LJLILLLLZI = null;
            }
        }
        boolean z = false;
        if (c93633aU1 != null) {
            C93635aU3 c93635aU3 = c93633aU1.LJFF;
            if (c93635aU3 != null) {
                if ((c93633aU1.LJ || c93633aU1.LIZJ != -1) && c93635aU3.getSelectedTabPosition() == c93633aU1.LIZJ) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.LJLIL != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.LJLJI.getClass();
            C93633aU1 c93633aU1 = this.LJLIL;
            C93635aU3 c93635aU3 = c93633aU1.LJFF;
            if (c93635aU3 != null) {
                c93635aU3.LJIILIIL(c93633aU1, true, false);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        return performClick;
    }

    public C93633aU1 getTab() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C93633aU1 c93633aU1) {
        if (c93633aU1 != this.LJLIL) {
            this.LJLIL = c93633aU1;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93634aU2(C93635aU3 c93635aU3, Context context) {
        super(context);
        this.LJLJI = c93635aU3;
        int i = c93635aU3.LJLL;
        if (i != 0) {
            C16300kU.LJIILLIIL(this, C20110qd.LIZ(context, i));
        }
        C16310kV.LJIIJ(this, c93635aU3.LJLJJL, c93635aU3.LJLJJLL, c93635aU3.LJLJL, c93635aU3.LJLJLJ);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.LJLJI.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LJLJI.LJLLI, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
