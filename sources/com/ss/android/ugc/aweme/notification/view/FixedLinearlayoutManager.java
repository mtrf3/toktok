package com.ss.android.ugc.aweme.notification.view;

import X.C0A7;
import X.C0AC;
import X.C221018lt;
import X.X1D;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes10.dex */
public class FixedLinearlayoutManager extends LinearLayoutManager {
    public final String LLIIIJ;

    public FixedLinearlayoutManager() {
        this.LLIIIJ = "";
    }

    public FixedLinearlayoutManager(int i) {
        super(1, false);
        this.LLIIIJ = "";
        this.LLIIIJ = "InboxFragment";
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (Exception e) {
            if ("InboxFragment".equals(this.LLIIIJ)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onLayoutChildren error, childCount:");
                LIZ.append(LJJJI());
                LIZ.append(" recyclerview.state:");
                LIZ.append(c0ac.toString());
                C221018lt.LIZJ("InboxLayoutManager", X1D.LIZIZ(LIZ), e);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LL(i, c0a7, c0ac);
        } catch (Exception e) {
            if ("InboxFragment".equals(this.LLIIIJ)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("scrollVerticallyBy error, childCount:");
                LIZ.append(LJJJI());
                LIZ.append(" recyclerview.state:");
                LIZ.append(c0ac.toString());
                C221018lt.LIZJ("InboxLayoutManager", X1D.LIZIZ(LIZ), e);
                return 0;
            }
            return 0;
        }
    }

    public FixedLinearlayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLIIIJ = "";
    }
}
