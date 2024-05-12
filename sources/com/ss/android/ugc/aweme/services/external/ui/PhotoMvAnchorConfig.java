package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class PhotoMvAnchorConfig {
    public static final Companion Companion = new Companion();
    public MusicModel musicModel;
    public String slideshowMvId;
    public String templateType;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getSlideshowMvId() {
        return this.slideshowMvId;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public final void setSlideshowMvId(String str) {
        this.slideshowMvId = str;
    }

    public final void setTemplateType(String str) {
        this.templateType = str;
    }
}
