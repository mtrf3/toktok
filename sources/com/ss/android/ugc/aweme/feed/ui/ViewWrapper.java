package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ViewWrapper {
    public final View view;

    public final int getHeight() {
        return this.view.getLayoutParams().height;
    }

    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        if (this.view.getParent() instanceof FrameLayout) {
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        ViewGroup.LayoutParams layoutParams2 = this.view.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams2;
    }

    public final int getWidth() {
        return this.view.getLayoutParams().width;
    }

    public final View getView() {
        return this.view;
    }

    public ViewWrapper(View view) {
        o.LJIIIZ(view, "view");
        this.view = view;
    }

    public final void setHeight(int i) {
        this.view.getLayoutParams().height = i;
        this.view.requestLayout();
    }

    public final void setWidth(int i) {
        this.view.getLayoutParams().width = i;
        this.view.requestLayout();
    }
}
