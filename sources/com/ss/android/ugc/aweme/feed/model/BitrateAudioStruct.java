package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class BitrateAudioStruct implements Serializable {

    @InterfaceC65349Pkn("audio_extra")
    public String audioExtra;

    @InterfaceC65349Pkn("audio_meta")
    public BitrateMetaStruct audioMeta;

    @InterfaceC65349Pkn("audio_quality")
    public long audioQuality;

    public final String getAudioExtra() {
        return this.audioExtra;
    }

    public final BitrateMetaStruct getAudioMeta() {
        return this.audioMeta;
    }

    public final long getAudioQuality() {
        return this.audioQuality;
    }

    public final void setAudioExtra(String str) {
        this.audioExtra = str;
    }

    public final void setAudioMeta(BitrateMetaStruct bitrateMetaStruct) {
        this.audioMeta = bitrateMetaStruct;
    }

    public final void setAudioQuality(long j) {
        this.audioQuality = j;
    }
}
