package com.ss.android.ugc.aweme.compliance.api.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class VideoItemSettings extends F9E implements Serializable {

    @InterfaceC65349Pkn("comment")
    public int comment;

    @InterfaceC65349Pkn("duet")
    public int duet;

    @InterfaceC65349Pkn("create_sticker")
    public int sticker;

    @InterfaceC65349Pkn("stitch")
    public int stitch;

    public static /* synthetic */ VideoItemSettings copy$default(VideoItemSettings videoItemSettings, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = videoItemSettings.duet;
        }
        if ((i5 & 2) != 0) {
            i2 = videoItemSettings.stitch;
        }
        if ((i5 & 4) != 0) {
            i3 = videoItemSettings.comment;
        }
        if ((i5 & 8) != 0) {
            i4 = videoItemSettings.sticker;
        }
        return videoItemSettings.copy(i, i2, i3, i4);
    }

    public final VideoItemSettings copy(int i, int i2, int i3, int i4) {
        return new VideoItemSettings(i, i2, i3, i4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.duet), Integer.valueOf(this.stitch), Integer.valueOf(this.comment), Integer.valueOf(this.sticker)};
    }

    public final int getComment() {
        return this.comment;
    }

    public final int getDuet() {
        return this.duet;
    }

    public final int getSticker() {
        return this.sticker;
    }

    public final int getStitch() {
        return this.stitch;
    }

    public final void setComment(int i) {
        this.comment = i;
    }

    public final void setDuet(int i) {
        this.duet = i;
    }

    public final void setSticker(int i) {
        this.sticker = i;
    }

    public final void setStitch(int i) {
        this.stitch = i;
    }

    public VideoItemSettings(int i, int i2, int i3, int i4) {
        this.duet = i;
        this.stitch = i2;
        this.comment = i3;
        this.sticker = i4;
    }
}
