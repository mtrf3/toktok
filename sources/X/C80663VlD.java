package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import o3.h0;

/* renamed from: X.VlD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80663VlD extends LinearLayout {
    public C76956UIe LJLIL;
    public View LJLILLLLZI;
    public final /* synthetic */ C80664VlE LJLJI;

    public TextView getTextView() {
        return null;
    }

    public final void LIZ() {
        View view;
        C76956UIe c76956UIe = this.LJLIL;
        if (c76956UIe != null && (view = c76956UIe.LJ) != null) {
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
        if (c76956UIe != null) {
            C80664VlE c80664VlE = c76956UIe.LJI;
            if (c80664VlE != null) {
                if ((c76956UIe.LJFF || c76956UIe.LIZLLL != -1) && c80664VlE.getSelectedTabPosition() == c76956UIe.LIZLLL) {
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
            C76956UIe c76956UIe = this.LJLIL;
            C80664VlE c80664VlE = c76956UIe.LJI;
            if (c80664VlE != null) {
                c80664VlE.LJIILIIL(c76956UIe, true, false);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        return performClick;
    }

    public C76956UIe getTab() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AnonymousClass020.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AnonymousClass020.class.getName());
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

    public void setTab(C76956UIe c76956UIe) {
        if (c76956UIe != this.LJLIL) {
            this.LJLIL = c76956UIe;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80663VlD(C80664VlE c80664VlE, Context context) {
        super(context);
        this.LJLJI = c80664VlE;
        int i = c80664VlE.LJLL;
        if (i != 0) {
            C16300kU.LJIILLIIL(this, C20110qd.LIZ(context, i));
        }
        C16310kV.LJIIJ(this, c80664VlE.LJLJJL, c80664VlE.LJLJJLL, c80664VlE.LJLJL, c80664VlE.LJLJLJ);
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
