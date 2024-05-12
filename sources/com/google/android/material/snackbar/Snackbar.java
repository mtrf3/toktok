package com.google.android.material.snackbar;

import X.C16880lQ;
import X.C80003VaZ;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] LJIILLIIL = {R.attr.bbt, R.attr.bbv};
    public final AccessibilityManager LJIILL;

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void LIZ() {
        LIZIZ(3);
    }

    public final int LJI() {
        int i = this.LJ;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.LJIILL.getRecommendedTimeoutMillis(i, 3);
        }
        return i;
    }

    public Snackbar(Context context, ViewGroup viewGroup, C80003VaZ c80003VaZ, C80003VaZ c80003VaZ2) {
        super(context, viewGroup, c80003VaZ, c80003VaZ2);
        this.LJIILL = (AccessibilityManager) C16880lQ.LLILL(viewGroup.getContext(), "accessibility");
    }
}
