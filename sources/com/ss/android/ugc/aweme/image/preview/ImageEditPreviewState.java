package com.ss.android.ugc.aweme.image.preview;

import X.AbstractC81666W3i;
import X.C78920UyC;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageEditPreviewState extends UiState {
    public final Boolean captionStatus;
    public final AbstractC81666W3i ui;

    public static /* synthetic */ ImageEditPreviewState copy$default(ImageEditPreviewState imageEditPreviewState, AbstractC81666W3i abstractC81666W3i, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = imageEditPreviewState.getUi();
        }
        if ((i & 2) != 0) {
            bool = imageEditPreviewState.captionStatus;
        }
        return imageEditPreviewState.copy(abstractC81666W3i, bool);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final ImageEditPreviewState copy(AbstractC81666W3i ui, Boolean bool) {
        o.LJIIIZ(ui, "ui");
        return new ImageEditPreviewState(ui, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageEditPreviewState)) {
            return false;
        }
        ImageEditPreviewState imageEditPreviewState = (ImageEditPreviewState) obj;
        return o.LJ(getUi(), imageEditPreviewState.getUi()) && o.LJ(this.captionStatus, imageEditPreviewState.captionStatus);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        Boolean bool = this.captionStatus;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageEditPreviewState(ui=");
        LIZ.append(getUi());
        LIZ.append(", captionStatus=");
        return C78920UyC.LIZIZ(LIZ, this.captionStatus, ')', LIZ);
    }

    public final Boolean getCaptionStatus() {
        return this.captionStatus;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEditPreviewState(AbstractC81666W3i ui, Boolean bool) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.captionStatus = bool;
    }

    public /* synthetic */ ImageEditPreviewState(AbstractC81666W3i abstractC81666W3i, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC81666W3i, (i & 2) != 0 ? null : bool);
    }
}
