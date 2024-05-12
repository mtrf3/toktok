package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view;

import X.C1DF;
import X.C34B;
import X.C45804HyK;
import X.C4BT;
import X.C61410O8g;
import X.C63081OpJ;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public class FunRootLinearLayout extends LinearLayout {
    public C4BT LJLIL;
    public boolean LJLILLLLZI;
    public final Rect LJLJI;

    private C4BT getPanelView() {
        C4BT c4bt = this.LJLIL;
        if (c4bt != null) {
            return c4bt;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C4BT) {
                C4BT c4bt2 = (C4BT) childAt;
                this.LJLIL = c4bt2;
                return c4bt2;
            }
        }
        return null;
    }

    public FunRootLinearLayout(Context context) {
        super(context);
        this.LJLJI = new Rect();
    }

    public FunRootLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = new Rect();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Activity LJIJJ;
        boolean z;
        C4BT panelView = getPanelView();
        if (panelView != null && (LJIJJ = C45804HyK.LJIJJ(getContext())) != null && !panelView.LIZJ(LJIJJ)) {
            getWindowVisibleDisplayFrame(this.LJLJI);
            int height = LJIJJ.getWindow().getDecorView().getHeight();
            int LJ = C61410O8g.LJ(LJIJJ);
            int LJJJJLI = ((height - this.LJLJI.bottom) - LJ) + C63081OpJ.LJJJJLI(LJIJJ);
            if (LJJJJLI >= ((int) (((height - LJ) - r1) * 0.18d))) {
                z = true;
                panelView.setVisibility(8);
            } else {
                if (LJJJJLI >= C1DF.LJIIIZ(60)) {
                    C34B.LJIIIIZZ("FunRootLinearLayout", "soft keyboard's height maybe less than 18% of the screen's height, but more than 60dp");
                }
                z = false;
                if (this.LJLILLLLZI && panelView.LJLILLLLZI == 1) {
                    panelView.setVisibility(0);
                }
            }
            this.LJLILLLLZI = z;
        }
        super.onMeasure(i, i2);
    }
}
