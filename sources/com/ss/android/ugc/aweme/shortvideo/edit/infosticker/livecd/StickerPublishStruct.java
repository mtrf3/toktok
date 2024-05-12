package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class StickerPublishStruct {

    @InterfaceC65349Pkn("sticker_type")
    public final int stickerType;

    public StickerPublishStruct() {
        this(0, 1, null);
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public StickerPublishStruct(int i) {
        this.stickerType = i;
    }

    public /* synthetic */ StickerPublishStruct(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
