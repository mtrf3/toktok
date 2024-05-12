package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui;

import X.VNU;
import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SearchHorizontalBounceView extends UISimpleView<VRK> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHorizontalBounceView(VNU context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIIZ(context, "context");
        return new VRK(context);
    }
}
