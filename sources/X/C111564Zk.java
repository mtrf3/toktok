package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C111564Zk extends LinearLayout {
    public int LJLIL;
    public int LJLILLLLZI;

    public int getMInTopModeMarginTop() {
        return this.LJLILLLLZI;
    }

    public final int getMarginTopLayoutMode() {
        return this.LJLIL;
    }

    public void setMInTopModeMarginTop(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setMarginTopLayoutMode(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C111564Zk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r3 > 1) goto L9;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            java.lang.String r0 = "desc"
            android.view.View r1 = r6.findViewWithTag(r0)
            java.lang.String r0 = "left_icon"
            android.view.View r0 = r6.findViewWithTag(r0)
            if (r0 != 0) goto L12
            return
        L12:
            int r5 = r0.getMeasuredHeight()
            int r4 = r1.getMeasuredHeight()
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r3 = r1.getLineCount()
            if (r4 <= r5) goto L48
            r0 = 1
            if (r3 <= r0) goto L48
        L25:
            r6.LJLIL = r0
            java.lang.String r2 = "desc height:"
            java.lang.String r1 = "  icon:"
            java.lang.String r0 = "  count : "
            java.lang.StringBuilder r1 = X.C06460Ne.LIZJ(r2, r4, r1, r5, r0)
            r1.append(r3)
            java.lang.String r0 = "  mode:"
            r1.append(r0)
            int r0 = r6.LJLIL
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "IntroItemLayout"
            X.C71Y.LIZLLL(r0, r1)
            return
        L48:
            r0 = 2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111564Zk.onMeasure(int, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111564Zk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        this.LJLILLLLZI = C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int top;
        super.onLayout(z, i, i2, i3, i4);
        View findViewWithTag = findViewWithTag("left_icon");
        if (findViewWithTag != null && findViewWithTag.getVisibility() == 0) {
            if (this.LJLIL == 1) {
                top = getMInTopModeMarginTop();
            } else {
                top = findViewWithTag.getTop();
            }
            findViewWithTag.setTop(top);
        }
    }
}
