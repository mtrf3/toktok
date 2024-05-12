package com.ss.android.ugc.aweme.infoSticker.customsticker;

import X.C145425nG;
import X.C150575vZ;
import X.C36692Eae;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EditPreviewStickerState implements InterfaceC61312at {
    public final C145425nG cancel;
    public final C150575vZ<Integer, Integer> compressBitmapEvent;
    public final CutoutData cutoutData;
    public final C36692Eae cutoutError;
    public final C145425nG finishCutoutSticker;
    public final MediaModel mediaModel;
    public final C145425nG selectImage;
    public final C145425nG startCutoutSticker;
    public final C145425nG useSticker;

    /* JADX WARN: Multi-variable type inference failed */
    public EditPreviewStickerState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditPreviewStickerState copy$default(EditPreviewStickerState editPreviewStickerState, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, MediaModel mediaModel, C36692Eae c36692Eae, C145425nG c145425nG5, CutoutData cutoutData, C150575vZ c150575vZ, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = editPreviewStickerState.selectImage;
        }
        if ((i & 2) != 0) {
            c145425nG2 = editPreviewStickerState.useSticker;
        }
        if ((i & 4) != 0) {
            c145425nG3 = editPreviewStickerState.startCutoutSticker;
        }
        if ((i & 8) != 0) {
            c145425nG4 = editPreviewStickerState.finishCutoutSticker;
        }
        if ((i & 16) != 0) {
            mediaModel = editPreviewStickerState.mediaModel;
        }
        if ((i & 32) != 0) {
            c36692Eae = editPreviewStickerState.cutoutError;
        }
        if ((i & 64) != 0) {
            c145425nG5 = editPreviewStickerState.cancel;
        }
        if ((i & 128) != 0) {
            cutoutData = editPreviewStickerState.cutoutData;
        }
        if ((i & 256) != 0) {
            c150575vZ = editPreviewStickerState.compressBitmapEvent;
        }
        return editPreviewStickerState.copy(c145425nG, c145425nG2, c145425nG3, c145425nG4, mediaModel, c36692Eae, c145425nG5, cutoutData, c150575vZ);
    }

    public final EditPreviewStickerState copy(C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, MediaModel mediaModel, C36692Eae c36692Eae, C145425nG c145425nG5, CutoutData cutoutData, C150575vZ<Integer, Integer> c150575vZ) {
        return new EditPreviewStickerState(c145425nG, c145425nG2, c145425nG3, c145425nG4, mediaModel, c36692Eae, c145425nG5, cutoutData, c150575vZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewStickerState)) {
            return false;
        }
        EditPreviewStickerState editPreviewStickerState = (EditPreviewStickerState) obj;
        return o.LJ(this.selectImage, editPreviewStickerState.selectImage) && o.LJ(this.useSticker, editPreviewStickerState.useSticker) && o.LJ(this.startCutoutSticker, editPreviewStickerState.startCutoutSticker) && o.LJ(this.finishCutoutSticker, editPreviewStickerState.finishCutoutSticker) && o.LJ(this.mediaModel, editPreviewStickerState.mediaModel) && o.LJ(this.cutoutError, editPreviewStickerState.cutoutError) && o.LJ(this.cancel, editPreviewStickerState.cancel) && o.LJ(this.cutoutData, editPreviewStickerState.cutoutData) && o.LJ(this.compressBitmapEvent, editPreviewStickerState.compressBitmapEvent);
    }

    public int hashCode() {
        C145425nG c145425nG = this.selectImage;
        int hashCode = (c145425nG == null ? 0 : c145425nG.hashCode()) * 31;
        C145425nG c145425nG2 = this.useSticker;
        int hashCode2 = (hashCode + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C145425nG c145425nG3 = this.startCutoutSticker;
        int hashCode3 = (hashCode2 + (c145425nG3 == null ? 0 : c145425nG3.hashCode())) * 31;
        C145425nG c145425nG4 = this.finishCutoutSticker;
        int hashCode4 = (hashCode3 + (c145425nG4 == null ? 0 : c145425nG4.hashCode())) * 31;
        MediaModel mediaModel = this.mediaModel;
        int hashCode5 = (hashCode4 + (mediaModel == null ? 0 : mediaModel.hashCode())) * 31;
        C36692Eae c36692Eae = this.cutoutError;
        int hashCode6 = (hashCode5 + (c36692Eae == null ? 0 : c36692Eae.hashCode())) * 31;
        C145425nG c145425nG5 = this.cancel;
        int hashCode7 = (hashCode6 + (c145425nG5 == null ? 0 : c145425nG5.hashCode())) * 31;
        CutoutData cutoutData = this.cutoutData;
        int hashCode8 = (hashCode7 + (cutoutData == null ? 0 : cutoutData.hashCode())) * 31;
        C150575vZ<Integer, Integer> c150575vZ = this.compressBitmapEvent;
        return hashCode8 + (c150575vZ != null ? c150575vZ.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPreviewStickerState(selectImage=");
        LIZ.append(this.selectImage);
        LIZ.append(", useSticker=");
        LIZ.append(this.useSticker);
        LIZ.append(", startCutoutSticker=");
        LIZ.append(this.startCutoutSticker);
        LIZ.append(", finishCutoutSticker=");
        LIZ.append(this.finishCutoutSticker);
        LIZ.append(", mediaModel=");
        LIZ.append(this.mediaModel);
        LIZ.append(", cutoutError=");
        LIZ.append(this.cutoutError);
        LIZ.append(", cancel=");
        LIZ.append(this.cancel);
        LIZ.append(", cutoutData=");
        LIZ.append(this.cutoutData);
        LIZ.append(", compressBitmapEvent=");
        LIZ.append(this.compressBitmapEvent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C145425nG getCancel() {
        return this.cancel;
    }

    public final C150575vZ<Integer, Integer> getCompressBitmapEvent() {
        return this.compressBitmapEvent;
    }

    public final CutoutData getCutoutData() {
        return this.cutoutData;
    }

    public final C36692Eae getCutoutError() {
        return this.cutoutError;
    }

    public final C145425nG getFinishCutoutSticker() {
        return this.finishCutoutSticker;
    }

    public final MediaModel getMediaModel() {
        return this.mediaModel;
    }

    public final C145425nG getSelectImage() {
        return this.selectImage;
    }

    public final C145425nG getStartCutoutSticker() {
        return this.startCutoutSticker;
    }

    public final C145425nG getUseSticker() {
        return this.useSticker;
    }

    public EditPreviewStickerState(C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, MediaModel mediaModel, C36692Eae c36692Eae, C145425nG c145425nG5, CutoutData cutoutData, C150575vZ<Integer, Integer> c150575vZ) {
        this.selectImage = c145425nG;
        this.useSticker = c145425nG2;
        this.startCutoutSticker = c145425nG3;
        this.finishCutoutSticker = c145425nG4;
        this.mediaModel = mediaModel;
        this.cutoutError = c36692Eae;
        this.cancel = c145425nG5;
        this.cutoutData = cutoutData;
        this.compressBitmapEvent = c150575vZ;
    }

    public /* synthetic */ EditPreviewStickerState(C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, MediaModel mediaModel, C36692Eae c36692Eae, C145425nG c145425nG5, CutoutData cutoutData, C150575vZ c150575vZ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? null : c145425nG2, (i & 4) != 0 ? null : c145425nG3, (i & 8) != 0 ? null : c145425nG4, (i & 16) != 0 ? null : mediaModel, (i & 32) != 0 ? null : c36692Eae, (i & 64) != 0 ? null : c145425nG5, (i & 128) != 0 ? null : cutoutData, (i & 256) == 0 ? c150575vZ : null);
    }
}
