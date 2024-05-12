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

/* renamed from: X.Vla, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80686Vla extends LinearLayout {
    public C164456cr LJLIL;
    public View LJLILLLLZI;
    public final /* synthetic */ C80695Vlj LJLJI;

    public TextView getTextView() {
        return null;
    }

    public final void LIZ() {
        View view;
        C164456cr c164456cr = this.LJLIL;
        if (c164456cr != null && (view = c164456cr.LIZLLL) != null) {
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
        if (c164456cr != null) {
            C80695Vlj c80695Vlj = c164456cr.LJFF;
            if (c80695Vlj != null) {
                if ((c164456cr.LJ || c164456cr.LIZJ != -1) && c80695Vlj.getSelectedTabPosition() == c164456cr.LIZJ) {
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
            InterfaceC80692Vlg interfaceC80692Vlg = this.LJLJI.LLIIIJ;
            if (interfaceC80692Vlg != null) {
                interfaceC80692Vlg.LJFF(this.LJLIL);
            } else {
                this.LJLIL.LIZ();
            }
            return true;
        }
        return performClick;
    }

    public C164456cr getTab() {
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

    public void setTab(C164456cr c164456cr) {
        if (c164456cr != this.LJLIL) {
            this.LJLIL = c164456cr;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80686Vla(C80695Vlj c80695Vlj, Context context) {
        super(context);
        this.LJLJI = c80695Vlj;
        int i = c80695Vlj.LJLL;
        if (i != 0) {
            C16300kU.LJIILLIIL(this, C20110qd.LIZ(context, i));
        }
        C16310kV.LJIIJ(this, c80695Vlj.LJLJJL, c80695Vlj.LJLJJLL, c80695Vlj.LJLJL, c80695Vlj.LJLJLJ);
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
