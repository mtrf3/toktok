package com.ss.android.ugc.aweme.ad.utils;

import X.C59894Nf0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.service.IAdAnimation;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdAnimationImpl implements IAdAnimation {
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdAnimation
    public final void LIZ(View view, int i, int i2, boolean z) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i3 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
        if (z) {
            if (i3 >= 0) {
                return;
            }
            C59894Nf0.LIZIZ(view, i3, i, i2).start();
        } else {
            if (i3 < 0) {
                return;
            }
            C59894Nf0.LIZIZ(view, i3, i, i2).start();
        }
    }
}
