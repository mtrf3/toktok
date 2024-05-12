package com.bytedance.ies.android.base.runtime.depend;

import X.F9E;

/* loaded from: classes2.dex */
public final class PointModel extends F9E {
    public final double px;
    public final double py;

    public static /* synthetic */ PointModel copy$default(PointModel pointModel, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = pointModel.px;
        }
        if ((i & 2) != 0) {
            d2 = pointModel.py;
        }
        return pointModel.copy(d, d2);
    }

    public final PointModel copy(double d, double d2) {
        return new PointModel(d, d2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.px), Double.valueOf(this.py)};
    }

    public final double getPx() {
        return this.px;
    }

    public final double getPy() {
        return this.py;
    }

    public PointModel(double d, double d2) {
        this.px = d;
        this.py = d2;
    }
}
