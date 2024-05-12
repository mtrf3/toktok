package com.bytedance.ies.xelement.audiott.bean;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class XAudioSrc {

    @InterfaceC65349Pkn("play_model")
    public final PlayModel playModel;

    @InterfaceC65349Pkn("play_url")
    public final String playUrl;

    @InterfaceC65349Pkn("id")
    public final String songId;

    /* JADX WARN: Multi-variable type inference failed */
    public XAudioSrc() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final PlayModel getPlayModel() {
        return this.playModel;
    }

    public final String getPlayUrl() {
        return this.playUrl;
    }

    public final String getSongId() {
        return this.songId;
    }

    public XAudioSrc(String str, String str2, PlayModel playModel) {
        this.songId = str;
        this.playUrl = str2;
        this.playModel = playModel;
    }

    public /* synthetic */ XAudioSrc(String str, String str2, PlayModel playModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : playModel);
    }
}
