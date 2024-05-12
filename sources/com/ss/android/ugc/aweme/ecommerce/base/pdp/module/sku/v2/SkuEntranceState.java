package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2;

import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuEntranceState implements InterfaceC61312at {
    public final ImageSelectData selectImage;

    /* JADX WARN: Multi-variable type inference failed */
    public SkuEntranceState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SkuEntranceState copy$default(SkuEntranceState skuEntranceState, ImageSelectData imageSelectData, int i, Object obj) {
        if ((i & 1) != 0) {
            imageSelectData = skuEntranceState.selectImage;
        }
        return skuEntranceState.copy(imageSelectData);
    }

    public final SkuEntranceState copy(ImageSelectData imageSelectData) {
        return new SkuEntranceState(imageSelectData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkuEntranceState) && o.LJ(this.selectImage, ((SkuEntranceState) obj).selectImage);
    }

    public int hashCode() {
        ImageSelectData imageSelectData = this.selectImage;
        if (imageSelectData == null) {
            return 0;
        }
        return imageSelectData.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuEntranceState(selectImage=");
        LIZ.append(this.selectImage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ImageSelectData getSelectImage() {
        return this.selectImage;
    }

    public SkuEntranceState(ImageSelectData imageSelectData) {
        this.selectImage = imageSelectData;
    }

    public /* synthetic */ SkuEntranceState(ImageSelectData imageSelectData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageSelectData);
    }
}
