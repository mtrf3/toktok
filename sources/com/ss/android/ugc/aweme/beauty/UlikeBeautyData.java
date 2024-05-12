package com.ss.android.ugc.aweme.beauty;

/* loaded from: classes15.dex */
public final class UlikeBeautyData {
    public String effectId;
    public ComposerBeautyExtra ulikeBeautyExtra;
    public String unzipPath;

    public final String getEffectId() {
        return this.effectId;
    }

    public final ComposerBeautyExtra getUlikeBeautyExtra() {
        return this.ulikeBeautyExtra;
    }

    public final String getUnzipPath() {
        return this.unzipPath;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setUlikeBeautyExtra(ComposerBeautyExtra composerBeautyExtra) {
        this.ulikeBeautyExtra = composerBeautyExtra;
    }

    public final void setUnzipPath(String str) {
        this.unzipPath = str;
    }

    public UlikeBeautyData(ComposerBeautyExtra composerBeautyExtra, String str, String str2) {
        this.ulikeBeautyExtra = composerBeautyExtra;
        this.unzipPath = str;
        this.effectId = str2;
    }
}
