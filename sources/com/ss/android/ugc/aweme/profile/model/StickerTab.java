package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerTab implements Serializable {

    @InterfaceC65349Pkn("show_sticker_set_sticker")
    public final Boolean showStickerSetSticker;

    @InterfaceC65349Pkn("show_sticker_tab")
    public final Boolean showStickerTab;

    @InterfaceC65349Pkn("show_video_sticker")
    public final Boolean showVideoSticker;

    @InterfaceC65349Pkn("sticker_set_count")
    public final Integer stickerSetCount;

    @InterfaceC65349Pkn("video_sticker_count")
    public final Integer videoStickerCount;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerTab() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StickerTab copy$default(StickerTab stickerTab, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = stickerTab.showStickerTab;
        }
        if ((i & 2) != 0) {
            bool2 = stickerTab.showStickerSetSticker;
        }
        if ((i & 4) != 0) {
            bool3 = stickerTab.showVideoSticker;
        }
        if ((i & 8) != 0) {
            num = stickerTab.stickerSetCount;
        }
        if ((i & 16) != 0) {
            num2 = stickerTab.videoStickerCount;
        }
        return stickerTab.copy(bool, bool2, bool3, num, num2);
    }

    public final StickerTab copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2) {
        return new StickerTab(bool, bool2, bool3, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerTab)) {
            return false;
        }
        StickerTab stickerTab = (StickerTab) obj;
        return o.LJ(this.showStickerTab, stickerTab.showStickerTab) && o.LJ(this.showStickerSetSticker, stickerTab.showStickerSetSticker) && o.LJ(this.showVideoSticker, stickerTab.showVideoSticker) && o.LJ(this.stickerSetCount, stickerTab.stickerSetCount) && o.LJ(this.videoStickerCount, stickerTab.videoStickerCount);
    }

    public int hashCode() {
        Boolean bool = this.showStickerTab;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showStickerSetSticker;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showVideoSticker;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.stickerSetCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.videoStickerCount;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerTab(showStickerTab=");
        LIZ.append(this.showStickerTab);
        LIZ.append(", showStickerSetSticker=");
        LIZ.append(this.showStickerSetSticker);
        LIZ.append(", showVideoSticker=");
        LIZ.append(this.showVideoSticker);
        LIZ.append(", stickerSetCount=");
        LIZ.append(this.stickerSetCount);
        LIZ.append(", videoStickerCount=");
        return s0.LIZJ(LIZ, this.videoStickerCount, ')', LIZ);
    }

    public final Boolean getShowStickerSetSticker() {
        return this.showStickerSetSticker;
    }

    public final Boolean getShowStickerTab() {
        return this.showStickerTab;
    }

    public final Boolean getShowVideoSticker() {
        return this.showVideoSticker;
    }

    public final Integer getStickerSetCount() {
        return this.stickerSetCount;
    }

    public final Integer getVideoStickerCount() {
        return this.videoStickerCount;
    }

    public StickerTab(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2) {
        this.showStickerTab = bool;
        this.showStickerSetSticker = bool2;
        this.showVideoSticker = bool3;
        this.stickerSetCount = num;
        this.videoStickerCount = num2;
    }

    public /* synthetic */ StickerTab(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) == 0 ? num2 : null);
    }
}
