package com.ss.android.ugc.aweme.cell;

import X.AEC;
import X.AG6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseCell<T extends AEC> extends PowerCell<T> {
    public abstract View L(ViewGroup viewGroup);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        getItem();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        AG6 ag6;
        super.onViewDetachedFromWindow();
        AEC aec = (AEC) getItem();
        if (aec != null && (ag6 = aec.LJLJJI) != null) {
            ag6.onViewDetachedFromWindow();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: M */
    public void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        boolean LIZIZ = t.LIZIZ();
        if (LIZIZ) {
            this.itemView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                return;
            }
            return;
        }
        if (LIZIZ) {
            return;
        }
        this.itemView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.width = 0;
        layoutParams2.height = 0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return L(parent);
    }
}
