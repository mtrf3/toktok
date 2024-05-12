package com.bytedance.ies.sdk.widgets;

import android.util.SparseIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class Ordering {
    public static final Companion Companion = new Companion();
    public static final int ORDER_START = 1000;
    public final SparseIntArray orders = new SparseIntArray();

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int requestOrder(int i) {
        int i2;
        int i3 = this.orders.get(i, -1);
        if (i3 == -1) {
            i2 = 1000;
        } else {
            i2 = i3 + 1;
        }
        this.orders.put(i, i2);
        return i2;
    }
}
