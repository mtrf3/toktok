package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C45524Hto;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChoosePhotoPreviewPageConfig implements Parcelable {
    public static final Parcelable.Creator<ChoosePhotoPreviewPageConfig> CREATOR = new C45524Hto();
    public int chooseSceneMode;
    public boolean enablePreviewClipAdjust;
    public boolean isAIGCAvatar;
    public boolean isAutoCutAnchorMode;
    public boolean isAutoCutSoundSyncMode;
    public boolean isEditorProReplace;
    public boolean isFromCutSame;
    public boolean isSoundSync;
    public boolean isUgcTemplate;
    public boolean nextRuleAdjustment;
    public boolean showAutoCutBtn;
    public boolean showDockInPreviewPage;
    public boolean showEditorPro;
    public boolean stickerMultiPhotosMode;
    public boolean supportRepeatSelect;

    public ChoosePhotoPreviewPageConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.supportRepeatSelect ? 1 : 0);
        out.writeInt(this.showDockInPreviewPage ? 1 : 0);
        out.writeInt(this.nextRuleAdjustment ? 1 : 0);
        out.writeInt(this.isFromCutSame ? 1 : 0);
        out.writeInt(this.isSoundSync ? 1 : 0);
        out.writeInt(this.isUgcTemplate ? 1 : 0);
        out.writeInt(this.isAIGCAvatar ? 1 : 0);
        out.writeInt(this.isEditorProReplace ? 1 : 0);
        out.writeInt(this.isAutoCutSoundSyncMode ? 1 : 0);
        out.writeInt(this.isAutoCutAnchorMode ? 1 : 0);
        out.writeInt(this.stickerMultiPhotosMode ? 1 : 0);
        out.writeInt(this.showAutoCutBtn ? 1 : 0);
        out.writeInt(this.showEditorPro ? 1 : 0);
        out.writeInt(this.enablePreviewClipAdjust ? 1 : 0);
        out.writeInt(this.chooseSceneMode);
    }

    public /* synthetic */ ChoosePhotoPreviewPageConfig(int i) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1);
    }

    public ChoosePhotoPreviewPageConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i) {
        this.supportRepeatSelect = z;
        this.showDockInPreviewPage = z2;
        this.nextRuleAdjustment = z3;
        this.isFromCutSame = z4;
        this.isSoundSync = z5;
        this.isUgcTemplate = z6;
        this.isAIGCAvatar = z7;
        this.isEditorProReplace = z8;
        this.isAutoCutSoundSyncMode = z9;
        this.isAutoCutAnchorMode = z10;
        this.stickerMultiPhotosMode = z11;
        this.showAutoCutBtn = z12;
        this.showEditorPro = z13;
        this.enablePreviewClipAdjust = z14;
        this.chooseSceneMode = i;
    }
}
