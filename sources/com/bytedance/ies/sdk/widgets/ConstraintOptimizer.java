package com.bytedance.ies.sdk.widgets;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ConstraintOptimizer {
    public static final ConstraintOptimizer INSTANCE = new ConstraintOptimizer();
    public static boolean enableMeasureOptimize;
    public static volatile boolean hasSet;
    public static boolean isInvalidParamPanic;

    public final void correctHelperParams$live_widget_release(ViewGroup.LayoutParams params) {
        o.LJIIIZ(params, "params");
        if (!enableMeasureOptimize) {
            return;
        }
        if (params.width >= 0) {
            if (!isInvalidParamPanic) {
                params.width = -2;
            } else {
                throw new IllegalArgumentException("Invalid width, You can only use wrap_content or match_parent for this type of view");
            }
        }
        if (params.height >= 0) {
            if (!isInvalidParamPanic) {
                params.height = -2;
                return;
            }
            throw new IllegalArgumentException("Invalid height, You can only use wrap_content or match_parent for this type of view");
        }
    }

    public static final void setEnableOpt(boolean z, boolean z2) {
        if (hasSet) {
            if (!isInvalidParamPanic) {
            } else {
                throw new IllegalAccessError("setEnableOpt could only be called once!");
            }
        } else {
            hasSet = true;
            enableMeasureOptimize = z;
            isInvalidParamPanic = z2;
        }
    }

    public final int getOptMeasureSize$live_widget_release(int i, int i2) {
        if (!enableMeasureOptimize || i == -2 || View.MeasureSpec.getMode(i2) == 0) {
            return 0;
        }
        return View.MeasureSpec.getSize(i2);
    }
}
