package com.ss.android.ugc.aweme.image.crop;

import X.AbstractC81666W3i;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageCropState extends UiState {
    public final SingleImageData data;
    public final AbstractC81666W3i ui;

    public static /* synthetic */ ImageCropState copy$default(ImageCropState imageCropState, AbstractC81666W3i abstractC81666W3i, SingleImageData singleImageData, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = imageCropState.getUi();
        }
        if ((i & 2) != 0) {
            singleImageData = imageCropState.data;
        }
        return imageCropState.copy(abstractC81666W3i, singleImageData);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final ImageCropState copy(AbstractC81666W3i ui, SingleImageData singleImageData) {
        o.LJIIIZ(ui, "ui");
        return new ImageCropState(ui, singleImageData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCropState)) {
            return false;
        }
        ImageCropState imageCropState = (ImageCropState) obj;
        return o.LJ(getUi(), imageCropState.getUi()) && o.LJ(this.data, imageCropState.data);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        SingleImageData singleImageData = this.data;
        return hashCode + (singleImageData == null ? 0 : singleImageData.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageCropState(ui=");
        LIZ.append(getUi());
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final SingleImageData getData() {
        return this.data;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropState(AbstractC81666W3i ui, SingleImageData singleImageData) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.data = singleImageData;
    }

    public /* synthetic */ ImageCropState(AbstractC81666W3i abstractC81666W3i, SingleImageData singleImageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC81666W3i, (i & 2) != 0 ? null : singleImageData);
    }
}
