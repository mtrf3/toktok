package com.ss.android.ugc.aweme.cell;

import X.AED;
import X.C1DJ;
import X.C283619k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ComposableCell extends BaseCell<AED> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(C283619k.LIZIZ);
        return composeView;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(AED t) {
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        ((ComposeView) view).setContent(C1DJ.LJFF(new AqS186S0100000_4(t, 13), 1304636864, true));
    }
}
