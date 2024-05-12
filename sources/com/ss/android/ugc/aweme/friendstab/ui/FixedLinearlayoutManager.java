package com.ss.android.ugc.aweme.friendstab.ui;

import X.C0A7;
import X.C0AC;
import X.C221018lt;
import X.X1D;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FixedLinearlayoutManager extends LinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLinearlayoutManager(Context context) {
        super(1, false);
        o.LJIIIZ(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLayoutChildren error, childCount:");
            LIZ.append(LJJJI());
            LIZ.append(" recyclerview.state:");
            LIZ.append(c0ac);
            C221018lt.LIZJ("FriendsTabUserCard", X1D.LIZIZ(LIZ), e);
        }
    }
}
