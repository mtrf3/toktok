package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class LiveProduct extends F9E implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("product_status")
    public final int productStatus;

    public LiveProduct() {
        this(0, 1, null);
    }

    public static /* synthetic */ LiveProduct copy$default(LiveProduct liveProduct, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liveProduct.productStatus;
        }
        return liveProduct.copy(i);
    }

    public final LiveProduct copy(int i) {
        return new LiveProduct(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.productStatus)};
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public LiveProduct(int i) {
        this.productStatus = i;
    }

    public /* synthetic */ LiveProduct(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
