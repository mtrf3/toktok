package com.ss.android.ugc.feed.platform.panel.adaption.impl;

import X.C2K0;
import X.C61447O9r;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FollowScreenAdaptionComponent extends ScreenAdaptionComponent {
    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1570964940) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final void x3() {
    }

    public FollowScreenAdaptionComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void q30() {
        ViewGroup.LayoutParams layoutParams;
        super.q30();
        int i = C61447O9r.LJIILIIL;
        if (i > 0) {
            View view = this.LJLJJI;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2.height != i) {
                layoutParams2.height = i;
                View view2 = this.LJLJJI;
                if (view2 == null) {
                    return;
                }
                view2.setLayoutParams(layoutParams2);
            }
        }
    }
}
