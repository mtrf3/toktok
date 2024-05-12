package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.ZqI, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91170ZqI extends LinearLayout {
    public C91169ZqH LJLIL;
    public View LJLILLLLZI;
    public TextView LJLJI;
    public final /* synthetic */ C91171ZqJ LJLJJI;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r0.getSelectedTabPosition() == r4.LIZ) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            X.ZqH r4 = r5.LJLIL
            r3 = 0
            if (r4 == 0) goto L5e
            android.view.View r1 = r4.LIZIZ
        L7:
            r2 = 1
            if (r1 == 0) goto L49
            android.view.ViewParent r0 = r1.getParent()
            if (r0 != 0) goto L3f
        L10:
            r5.addView(r1)
        L13:
            r5.LJLILLLLZI = r1
            r0 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L23
            r3 = r1
            android.widget.TextView r3 = (android.widget.TextView) r3
        L23:
            r5.LJLJI = r3
            if (r3 != 0) goto L3b
        L27:
            if (r4 == 0) goto L39
            X.ZqJ r0 = r4.LIZJ
            if (r0 == 0) goto L60
            int r1 = r0.getSelectedTabPosition()
            int r0 = r4.LIZ
            if (r1 != r0) goto L39
        L35:
            r5.setSelected(r2)
            return
        L39:
            r2 = 0
            goto L35
        L3b:
            r3.setMaxLines(r2)
            goto L27
        L3f:
            if (r0 == r5) goto L13
            if (r0 == 0) goto L10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C16880lQ.LJLLL(r1, r0)
            goto L10
        L49:
            android.view.View r1 = r5.LJLILLLLZI
            if (r1 == 0) goto L5b
            boolean r0 = X.C78996UzQ.LJJIIJZLJL(r1)
            if (r0 == 0) goto L56
            X.C78996UzQ.LJI()
        L56:
            r5.removeView(r1)
            r5.LJLILLLLZI = r3
        L5b:
            r5.LJLJI = r3
            goto L27
        L5e:
            r1 = r3
            goto L7
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tab not attached to a TabLayout"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91170ZqI.LIZ():void");
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.LJLIL != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            InterfaceC91161Zq9 interfaceC91161Zq9 = this.LJLJJI.LJLZ;
            if (interfaceC91161Zq9 != null) {
                interfaceC91161Zq9.LIZ(this.LJLIL);
            } else {
                C91169ZqH c91169ZqH = this.LJLIL;
                o.LJI(c91169ZqH);
                C91171ZqJ c91171ZqJ = c91169ZqH.LIZJ;
                if (c91171ZqJ != null) {
                    c91171ZqJ.LJII(c91169ZqH, true);
                } else {
                    "Tab not attached to a TabLayout".toString();
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            return true;
        }
        return performClick;
    }

    public final TextView getMCustomTextView$music_dsp_release() {
        return this.LJLJI;
    }

    public final C91169ZqH getTab() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        o.LJIIIZ(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(AnonymousClass020.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(AnonymousClass020.class.getName());
    }

    public final void setMCustomTextView$music_dsp_release(TextView textView) {
        this.LJLJI = textView;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setSelected(z);
        }
        TextView textView = this.LJLJI;
        if (textView == null) {
            return;
        }
        textView.setSelected(z);
    }

    public final void setTab(C91169ZqH c91169ZqH) {
        if (!o.LJ(c91169ZqH, this.LJLIL)) {
            this.LJLIL = c91169ZqH;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91170ZqI(C91171ZqJ c91171ZqJ, Context context) {
        super(context);
        this.LJLJJI = c91171ZqJ;
        new LinkedHashMap();
        if (c91171ZqJ.getMTabBackgroundResId() != 0) {
            o.LJI(context);
            C16300kU.LJIILLIIL(this, C20110qd.LIZ(context, c91171ZqJ.getMTabBackgroundResId()));
        }
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.LJLJJI.LJLJJL;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
